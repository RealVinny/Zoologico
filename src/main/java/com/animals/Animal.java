package main.java.com.animals;

import javax.swing.*;
import java.util.ArrayList;

public class Animal {

    protected String name;
    protected String especie;
    protected int idade;
    protected String sound;

    public Animal(String nm, String spc, int age, String snd) {
        name = nm; especie = spc; idade = age; sound = snd;
    }


    public String getName(){
        return name;
    }

    public String getEspecie(){
        return especie;
    }

    public int getIdade(){
        return idade;
    }

    public String getInfo(){

        return String.format("Nome:" + name + "\nIdade:" + idade + "\nEspecie:" + especie);
    }

    public String makeSound(){
        return String.format(name + " disse " + sound);
    }

}
