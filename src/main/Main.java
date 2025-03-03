package main;
import main.java.com.animals.Animal;
import main.java.com.animals.amfibie.*;
import main.java.com.animals.birds.*;
import main.java.com.animals.fishes.*;
import main.java.com.animals.invertible.*;
import main.java.com.animals.mamals.*;
import main.java.com.animals.reptile.*;
import main.java.com.areas.Area;
import main.java.com.areas.air.AirArea;
import main.java.com.areas.dirt.DirtArea;
import main.java.com.areas.water.WaterArea;

import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        StringBuilder userName = new StringBuilder();
        AirArea areaVoadora = new AirArea("Area separada para animais voadores", 15, "Voador");
        DirtArea areaTerrestre = new DirtArea("Area separada para animais terrestres", 15, "Terrestre");
        WaterArea areaAquatica = new WaterArea("Area separada para animais aquaticos", 15, "Aquatico");

        ArrayList<Area> areas = new ArrayList<>();

        areas.add(areaVoadora);
        areas.add(areaTerrestre);
        areas.add(areaAquatica);

        /*

        // amfibies

        AlpineTridon alpineTridon = new AlpineTridon("Tridao", "peixe", 5);
        Axolotl axolotl = new Axolotl("Josias", "peixe", 9);
        DartFrog dartFrog = new DartFrog("Maria", "sapo", 4);
        KingFrog kingFrog = new KingFrog("Sapao", "sapo", 4);
        Salamandra salamandra = new Salamandra("Salasala", "Salamandra", 2);

      */

        // birds

        BlueBird blueBird = new BlueBird("Blu", "Arara-Azul", 9);
        Falcon falcon = new Falcon("Punch", "Falcon", 7);
        Flamingo flamingo = new Flamingo("Mingo", "Flamingo", 9);
        Owl owl = new Owl("Ruja", "Coruja", 4);
        Penguin penguin = new Penguin("Pingu", "Pinguim", 9);

        areaVoadora.addAnimal(blueBird);
        areaVoadora.addAnimal(falcon);
        areaVoadora.addAnimal(flamingo);
        areaVoadora.addAnimal(owl);
        areaVoadora.addAnimal(penguin);
        // fishes

        ClownFish clownFish = new ClownFish("Nemo", "Peixe-Palhaco", 4);
        Esturjao esturjao = new Esturjao("Carlos", "Esturjao", 5);
        RaiaJamanta raiaJamanta = new RaiaJamanta("Jamana", "Raia-Jamanta", 3);
        RedPirana redPirana = new RedPirana("Piranha", "Piranha-Vermelha", 4);
        SharkFish sharkFish = new SharkFish("Peixao", "Peixe-Tubarao", 2);

        areaAquatica.addAnimal(clownFish);
        areaAquatica.addAnimal(esturjao);
        areaAquatica.addAnimal(raiaJamanta);
        areaAquatica.addAnimal(redPirana);
        areaAquatica.addAnimal(sharkFish);

/*
        // invertibles

        Butterfly butterfly = new Butterfly("Brabuleta", "Borboleta", 2);
        GoliasSpider goliasSpider = new GoliasSpider("Golias", "Aranha-Golias", 3);
        ImperatorScorpion imperatorScorpio = new ImperatorScorpion("Escorpion", "Escorpiao-Emperador",2);
        Jellyfish jellyfish = new Jellyfish("Agua", "Agua-viva", 2);
        Krab krab = new Krab("Sirigueijo", "Caranguejo", 2);
*/
        // mamals

        Bear bear = new Bear("Polar", "Urso-Polar", 5);
        Elephant elephant = new Elephant("Dumbo", "Elefante", 4);
        Giraffe giraffe = new Giraffe("Mark", "Girafa", 3);
        Kangoroo kangoroo = new Kangoroo("kanguru", "Kangoroo", 2);
        Lion lion = new Lion("Alex", "Leao", 5);

        areaTerrestre.addAnimal(bear);
        areaTerrestre.addAnimal(elephant);
        areaTerrestre.addAnimal(giraffe);
        areaTerrestre.addAnimal(kangoroo);
        areaTerrestre.addAnimal(lion);

/*
        // reptiles

        Crocodile crocodile = new Crocodile("Crocks", "Crocodilo", 15);
        GreenIguana greenIguana = new GreenIguana("Josias", "Iguana",3);
        KomodoDragon komodoDragon = new KomodoDragon("Kerosene", "Dragao-de-Komodo", 4);
        PythonKing pythonKing = new PythonKing("Capitao", "Cobra-Pitao", 2);
        Turtle turtle = new Turtle("Rafael", "Tartaruga", 4);
*/


        System.out.println("Bem vindo visitante, qual seu nome ?:");
        userName.append(scanner.nextLine());

        System.out.println("ola " + userName + " vou te apresentar o zoologico !");

        for (int i = 0; i < areas.size(); i++){
            System.out.println(i + " " + areas.get(i).getType());

        }

        System.out.println("aonde voce deseja ir ?");
        int aonde = scanner.nextInt();
        scanner.skip("\n");

        System.out.println("voce entrou na area " + areas.get(aonde).getType());
        System.out.println(areas.get(aonde).getDescricao());

        while (true) {


            System.out.println("vamos ver os animais que estão nessa area!");
            while (true) {
                for (int i = 0; i < areas.get(aonde).getQuant(); i++) {
                    System.out.println("Nome:" + areas.get(aonde).getAnimalName(i));

                }

                System.out.println("voce deseja saber mais sobre qual animal (digite o nome completo dele ou \"voltar para voltar)?");
                String selAnm = scanner.nextLine();

                if (selAnm.equalsIgnoreCase("voltar")){
                break;
                } else {
                    System.out.println(areas.get(aonde).searchAnimal(selAnm));
                }

            }
        }

    }
}
