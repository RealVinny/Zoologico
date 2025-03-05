package main.java.com.animals.birds;

import main.java.com.animals.Animal;

public class Owl extends Animal {  @Override
public void makeSound(){

        System.out.println(sound);

    }
    public Owl(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
