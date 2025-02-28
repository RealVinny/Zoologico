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

    public void getInfo(){
        System.out.println("nome: " + name);
        System.out.println("especie: " + especie);
        System.out.println("idade: " + idade);
    }

    public void moverArea(ArrayList<Animal> a, ArrayList<Animal> b, Animal c){
            a.remove(c);
            b.add(c);

    }

    public void addArea(ArrayList<Animal> a, Animal b){
        a.add(b);
    }

    public void removeArea(ArrayList<Animal> a, Animal b){
        a.remove(b);
    }


}
