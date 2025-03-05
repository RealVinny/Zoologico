package main.java.com.animals.fishes;

import main.java.com.animals.Animal;

public class SharkFish extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public SharkFish(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
