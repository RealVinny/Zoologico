package main.java.com.animals.birds;

import main.java.com.animals.Animal;

public class Penguin extends Animal {  @Override
public void makeSound(){

        System.out.println(sound);

    }
    public Penguin(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
