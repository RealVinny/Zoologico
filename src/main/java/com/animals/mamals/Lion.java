package main.java.com.animals.mamals;

import main.java.com.animals.Animal;

public class Lion extends Animal { @Override
public void makeSound(){

System.out.println(sound);

}
    public Lion(String nm, String spc, int age, String snd){
        super(nm, spc, age, snd);
    }
}
