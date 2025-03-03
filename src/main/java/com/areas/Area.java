package main.java.com.areas;

import main.java.com.animals.Animal;
import java.util.ArrayList;
import java.util.Objects;

public class Area {

    protected ArrayList<Animal> animais = new ArrayList<Animal>();
    protected String tipo;
    protected int tamanho;
    protected String descricao;



    public Area(String descricao, int tamanho, String tipo) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public String getType(){
        return  tipo;
    }

    public int getSize(){
        return tamanho;
    }


   public String getDescricao(){
        return descricao;
   }

   public void addAnimal(Animal a){
      animais.add(a);
   }

   public void removeAnimal(Animal a){
        animais.remove(a);
   }
   
   public String getAnimalName(int loc){
      return animais.get(loc).getName();

   }

   public String getAnimalSpecie(int loc){
        return animais.get(loc).getEspecie();
   }

   public int getAnimalIdade(int loc){
        return animais.get(loc).getIdade();
   }

   public int getQuant(){
        return animais.size();
   }

   public String searchAnimal(String name) {

       for (int i = 0; i < animais.size(); i++) {
                if(name.equalsIgnoreCase(animais.get(i).getName())){
                    return animais.get(i).getInfo();
                }else if(name.equalsIgnoreCase("voltar")){
                    return name;
                }
       }

       return  "animal nao encontrado na area !";
    }

}
