/*
public class Main {

    public static void main(String args[]) {

        //Classes & Objects
        // Pen p1 = new Pen(); //created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // // p1.setColor("Red");     
        // p1.color = "red";   
        // System.out.println(p1.color);

        //Access Modifiers
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ShreeKudande";
        // myAcc.password = "abcdefghi";
        myAcc.setPassword("123456789");

    }
}

class BankAccount {
    public String username;
    private String password;
    default void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

*/

public class Main {

    public static void main(String args[]) {
        //Getters & Setters
        //Get:to return the value
        //Set:to modify the value
        //this:this keyword is used to refer to the current object
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String Color) {
        this.color = Color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

