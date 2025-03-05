package main.java.com.animals.birds;

import main.java.com.animals.Animal;

public class BlueBird extends Animal {  @Override
public void makeSound(){

       System.out.println(sound);

    }

    public BlueBird(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
