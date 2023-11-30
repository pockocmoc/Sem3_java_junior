package ru.geekbrains.lesson2.homework2;

import java.lang.reflect.*;

public class Program {

    public static void main(String[] args) {
	Animal[] animals = new Animal[3];
	animals[0] = new Dog("Барон", 3, "Лабрадор");
	animals[1] = new Cat("Барсик", 10, true);
	animals[2] = new Dog("Мухтар", 2, "Немецкая овчарка");

	for (Animal animal : animals) {
	    System.out.println("Имя: " + animal.getName());
	    System.out.println("Возраст: " + animal.getAge());

	    Class<?> animalClass = animal.getClass();
	    Method[] methods = animalClass.getDeclaredMethods();

	    for (Method method : methods) {
		if (method.getName().equals("noiseAnimal")) {
		    try {
			method.invoke(animal);
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		}
	    }

	    System.out.println();
	}

    }

}
