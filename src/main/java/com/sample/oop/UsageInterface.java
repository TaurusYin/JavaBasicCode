package com.sample.oop;

public class UsageInterface {
}

/* 文件名 : Animal.java */
interface IAnimal {
    public void eat();

    public void travel();
}

class MammalInt implements IAnimal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}


// 文件名: Sports.java
interface Sports {
    public void setHomeTeam(String name);

    public void setVisitingTeam(String name);
}

// 文件名: Football.java
interface Football extends Sports {
    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}

// 文件名: Hockey.java
interface Hockey extends Sports {
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}
