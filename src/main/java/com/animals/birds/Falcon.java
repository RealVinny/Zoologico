package main.java.com.animals.birds;

import main.java.com.animals.Animal;

public class Falcon extends Animal {  @Override
public void makeSound(){

        System.out.println(sound);

    }
    public Falcon(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
