package main.java.com.animals;

import java.util.ArrayList;

public class Animal {

    protected String name;
    protected String especie;
    protected int idade;

    public Animal(String nm, String spc, int age) {
        name = nm; especie = spc; idade = age;
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
        /*
        *
        * TODO
        *   Arrumar a formatacao dessa string para que fique mais ou menos assim :
        *   Nome : X
        *   Idade : Y
        *   Especie : Z
        */

        return name + String.valueOf(idade) + especie;
    }





}
