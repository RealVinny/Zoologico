package main.java.com.animals.fishes;

import main.java.com.animals.Animal;

public class ClownFish extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}    public ClownFish(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}
    
}
