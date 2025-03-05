package main.java.com.animals.fishes;

import main.java.com.animals.Animal;

public class Pirarucu extends Animal {
    @Override
    public void makeSound() {

        System.out.println(sound);

    }

    public Pirarucu(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
    }

}
