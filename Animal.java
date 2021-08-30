package ru.geekbrains.lesson6;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int maxRunDistanse;
    protected int maxSailDistanse;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(int runDistans) {
        if (runDistans == maxRunDistanse) {
            System.out.println(name + " " + "пробежал" + " " + runDistans + " " + "метров");
        } else if (runDistans <= maxRunDistanse){
            System.out.println(name + " " + "легко пробежал" + " " + runDistans + " " + "метров");
        }else {
            System.out.println(name + " " + "не побежит");
        }
    }

    public void sail(int sailDistans) {
        if (sailDistans == maxSailDistanse) {
            System.out.println(name + " " + "проплыл" + " " + sailDistans + " " + "метров");
        } else if (sailDistans <= maxSailDistanse) {
            System.out.println(name + " " + "легко проплыл" + " " + sailDistans + " " + "метров");
        }else {
            System.out.println(name + " " + "не поплывет");
        }
    }

    public abstract void run();

    public abstract void sail();

}