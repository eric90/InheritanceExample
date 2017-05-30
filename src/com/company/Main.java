package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal1 = new Animal("Animal", 1, 1,
                5, 12);

        Dog dog = new Dog("yorkie", 80, 20, 2, 4,
                1, 20, "sleeky");
        dog.eat();
        System.out.println("********");
        //dog.walk();
        dog.run();


        System.out.println("********");
        System.out.println("********");
        System.out.println("********");

        BMW bmw = new BMW(72);
        bmw.accelerate(30);
        bmw.accelerate(20);

    }
}
