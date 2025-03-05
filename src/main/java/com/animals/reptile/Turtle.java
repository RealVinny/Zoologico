package main.java.com.animals.reptile;

import main.java.com.animals.Animal;

public class Turtle extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public Turtle(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    }

