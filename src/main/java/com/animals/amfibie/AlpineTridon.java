package main.java.com.animals.amfibie;

import main.java.com.animals.Animal;
import org.w3c.dom.ls.LSOutput;

public class AlpineTridon extends Animal {

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    public AlpineTridon(String nm, String spc, int age, String snd) {
        super(nm, spc, age, snd);
}

}
