package ru.geekbrains.lesson6;

public abstract class Cat extends Animal {
    public Cat(String name, int age, int maxRunDistanse, int maxSailDistanse) {
        super(name, age);
        this.maxRunDistanse = maxRunDistanse;
        this.maxSailDistanse = maxSailDistanse;
    }
    @Override
    public String toString(){ return name + " " + age + " " + maxRunDistanse + " " + maxSailDistanse;
    }
    @Override
    public void run () {
        if (maxRunDistanse <= 200) {
            System.out.println(name + "пробежал" + maxRunDistanse + " " + "метров");
        }
        else {
            System.out.println(name + "не бегал");
        }
    }
    @Override
    public void sail () {
        if (maxSailDistanse != 0) {
            System.out.println(name + "проплыл" + maxRunDistanse + " " + "метров");
        } else {
            System.out.println(name + "не плавал");
        }
    }

}