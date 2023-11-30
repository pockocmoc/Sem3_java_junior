package ru.geekbrains.lesson2.homework2;

public class Dog extends Animal implements AnimalNoiseInterface {

    private String breed;

    public Dog(String name, int age, String breed) {
	super(name, age);
	this.breed = breed;
    }

    @Override
    public void noiseAnimal() {
	System.out.println("Гав-гав");

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
