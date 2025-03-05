package main.java.com.animals.amfibie;

import main.java.com.animals.Animal;

public class KingFrog extends Animal {

    @Override
    public void makeSound(){
        System.out.println(sound);
    }

    public KingFrog(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
