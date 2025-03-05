package main.java.com.animals.mamals;

import main.java.com.animals.Animal;

public class Elephant extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public Elephant(String nm, String spc, int age, String snd){
        super(nm, spc, age, snd);
}

}
