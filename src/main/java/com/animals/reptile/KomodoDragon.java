package main.java.com.animals.reptile;

import main.java.com.animals.Animal;

public class KomodoDragon extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public KomodoDragon(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
