package com.sample.producer_consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

interface Consumer {
    void consume() throws InterruptedException;
}

interface Producer {
    void produce() throws InterruptedException;
}

abstract class AbstractConsumer implements Consumer, Runnable {
    @Override
    public void run() {
        // 消费者不断的空转
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}


abstract class AbstractProducer implements Producer, Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

interface Model {
    Runnable newRunnableConsumer();
    Runnable newRunnableProducer();
}

class Task {
    public int no;
    public Task(int no) {
        this.no = no;
    }
}

class BlockingQueueModel implements Model {
    private final BlockingQueue<Task> queue;
    private final AtomicInteger increTaskNo = new AtomicInteger(0);
    public BlockingQueueModel(int cap) {
        // LinkedBlockingQueue 的队列不 init，入队时检查容量；ArrayBlockingQueue 在创建时 init
        this.queue = new LinkedBlockingQueue<>(cap);
    }
    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }
    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }
    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {
        @Override
        public void consume() throws InterruptedException {
            Task task = queue.take();
            // 固定时间范围的消费，模拟相对稳定的服务器处理过程
            Thread.sleep(500 + (long) (Math.random() * 500));
            System.out.println("consume: " + task.no);
        }
    }
    private class ProducerImpl extends AbstractProducer implements Producer, Runnable {
        @Override
        public void produce() throws InterruptedException {
            // 不定期生产，模拟随机的用户请求
            Thread.sleep((long) (Math.random() * 1000));
            Task task = new Task(increTaskNo.getAndIncrement());
            System.out.println("produce: " + task.no);
            queue.put(task);
        }
    }
    public static void main(String[] args) {
        Model model = new BlockingQueueModel(3);
        for (int i = 0; i < 2; i++) {
            new Thread(model.newRunnableConsumer()).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(model.newRunnableProducer()).start();
        }
    }
}