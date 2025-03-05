package main.java.com.animals.amfibie;

import main.java.com.animals.Animal;

public class Salamandra extends Animal {

    @Override
    public void makeSound(){
        System.out.println(sound);
    }

    public Salamandra(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    }

