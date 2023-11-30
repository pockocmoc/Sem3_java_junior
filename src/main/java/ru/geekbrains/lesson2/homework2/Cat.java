package ru.geekbrains.lesson2.homework2;

public class Cat extends Animal implements AnimalNoiseInterface {

    private boolean isLazy;

    public Cat(String name, int age, boolean isLazy) {
	super(name, age);
	this.isLazy = isLazy;
    }

    @Override
    public void noiseAnimal() {
	System.out.println("Мяу-мяу");

    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean isLazy) {
        this.isLazy = isLazy;
    }



}
