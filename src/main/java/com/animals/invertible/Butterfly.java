package main.java.com.animals.invertible;

import main.java.com.animals.Animal;

public class Butterfly extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public Butterfly(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
