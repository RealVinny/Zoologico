package main.java.com;
import main.java.com.animals.Animal;
import main.java.com.animals.amfibie.*;
import main.java.com.areas.air.AirArea;
import main.java.com.areas.dirt.DirtArea;
import main.java.com.areas.water.WaterArea;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StringBuilder userName = new StringBuilder();
        AirArea areaPassaro = new AirArea("Area separada para animais voadores", 15, "Voador");
        DirtArea areaTerrestre = new DirtArea("Area separada para animais terrestres", 15, "Terrestre");
        WaterArea areaAquatica = new WaterArea("Area separada para animais aquaticos", 15, "Aquatico");

        ArrayList<Animal> voadores;
        ArrayList<Animal> terrestres;
        ArrayList<Animal> aquaticos;

        AlpineTridon alpineTridon = new AlpineTridon("Tridao", "peixe", 5);
        Axolotl axolotl = new Axolotl("Josias", "peixe", 9);
        DartFrog dartFrog = new DartFrog("Maria", "sapo", 4);
        KingFrog kingFrog = new KingFrog("Sapao", "sapo", 4);
        Salamandra salamandra = new Salamandra("Salasala", "Salamandra", 2);



        System.out.println("Bem vindo visitante, qual seu nome ?:");
        userName.append(scanner.nextLine());

        System.out.println("ola " + userName + "vou te apresentar o zoologico !");


    }
}
