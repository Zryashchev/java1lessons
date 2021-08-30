package ru.geekbrains.lesson6;

public abstract class Dog extends Animal {
    public Dog(String name, int age, int maxRunDistanse, int maxSailDistanse) {
        super(name, age);
        this.maxRunDistanse = maxRunDistanse;
        this.maxSailDistanse = maxSailDistanse;
    }
    @Override
    public String toString(){ return name + " " + age + " " + maxRunDistanse + " " + maxSailDistanse;
    }
    @Override
    public void run () {
        if (maxRunDistanse <= 500) {
            System.out.println(name + "пробежал" + maxRunDistanse);
        }
        else {
            System.out.println(name + "не бегал");
        }
    }
    @Override
    public void sail () {
        if (maxSailDistanse <= 10) {
            System.out.println(name + "проплыл" + maxRunDistanse);
        } else {
            System.out.println(name + "не плавал");
        }
    }
}