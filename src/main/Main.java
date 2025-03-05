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

import java.awt.*;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Main{
    public static void main(String[] args){


        // Used for sistem logic
        Scanner scanner = new Scanner(System.in);
        StringBuilder userName = new StringBuilder();
        AirArea areaVoadora = new AirArea("Area separada para animais voadores", 15, "Voador");
        DirtArea areaTerrestre = new DirtArea("Area separada para animais terrestres", 15, "Terrestre");
        WaterArea areaAquatica = new WaterArea("Area separada para animais aquaticos", 15, "Aquatico");

        ArrayList<Area> areas = new ArrayList<>();

        // Used for displaying UI and others



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

        Animal blueBird = new BlueBird("Blu", "Arara-Azul", 9, "AHHH");
        Animal falcon = new Falcon("Punch", "Falcon", 7, "caucau");
        Animal flamingo = new Flamingo("Arrascaeta", "Flamengo", 9, "MENGAO");
        Animal owl = new Owl("Ruja", "Coruja", 4, "CowCow");
        Animal penguin = new Penguin("Pingu", "Pinguim", 9, "AHHAHHHA");

        areaVoadora.addAnimal(blueBird);
        areaVoadora.addAnimal(falcon);
        areaVoadora.addAnimal(flamingo);
        areaVoadora.addAnimal(owl);
        areaVoadora.addAnimal(penguin);
        // fishes

        Animal clownFish = new ClownFish("Nemo", "Peixe-Palhaco", 4, "blulbulbu");
        Animal esturjao = new Esturjao("Carlos", "Esturjao", 5, " adka");
        Animal raiaJamanta = new RaiaJamanta("Jamana", "Raia-Jamanta", 3, "asdasd");
        Animal redPirana = new RedPirana("Piranha", "Piranha-Vermelha", 4, "asdad");
        Animal sharkFish = new SharkFish("Peixao", "Peixe-Tubarao", 2, "sdasd");
        Animal pirarucu = new Pirarucu("jobson", "branca", 3, "flapflap");

        areaAquatica.addAnimal(clownFish);
        areaAquatica.addAnimal(esturjao);
        areaAquatica.addAnimal(pirarucu);
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


        Animal elephant = new Elephant("Dumbo", "Elefante", 4, "fluuuu");
        Animal giraffe = new Giraffe("Mark", "Girafa", 3, "nheknhek");
        Animal kangoroo = new Kangoroo("kanguru", "Kangoroo", 2, "*barulhos de soco*");
        Animal lion = new Lion("Alex", "Leao", 5, "ROAR");

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
        Animal bear = new Bear("Polar", "Urso-Polar", 5, "roar");
        bear.makeSound();


        System.out.println("Bem vindo visitante, qual seu nome ?:");
        userName.append(scanner.nextLine());

        System.out.println("ola " + userName + " vou te apresentar o zoologico !");

        while(true) {

            for (int i = 0; i < areas.size(); i++){
                System.out.println(i + " " + areas.get(i).getType());
            }
            
            int aonde = 0;
            System.out.println("aonde voce deseja ir ? (apenas numeros)");
            if(scanner.hasNextInt()){
                aonde = scanner.nextInt();
                scanner.nextLine();
            }else{
                scanner.nextLine();
                System.out.println("Entrada invalida! vamos para a area voadora!");
            }

            System.out.println("voce entrou na area " + areas.get(aonde).getType());
            System.out.println(areas.get(aonde).getDescricao());

            while (true) {

                System.out.println("vamos ver os animais que estão nessa area!");

                for (int i = 0; i < areas.get(aonde).getQuant(); i++) {
                    System.out.println("Nome:" + areas.get(aonde).getAnimalName(i));
                }

                System.out.println("voce deseja saber mais sobre qual animal (digite o nome completo dele ou \"voltar\" para voltar)?");
                String selAnm = scanner.nextLine();

                if (selAnm.equalsIgnoreCase("voltar")) {
                    break;
                }else {
                    System.out.println(areas.get(aonde).searchAnimal(selAnm));
                    areas.get(aonde).getAnimalObj(areas.get(aonde).searchAnimalIndex(selAnm)).makeSound();
                    System.out.println("pressione ENTER para voltar ao menu anterior...");
                    scanner.nextLine();
                }

            }

        }

    }

}
