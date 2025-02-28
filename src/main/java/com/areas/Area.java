package main.java.com.areas;

public class Area {
    protected String tipo;
    protected int tamanho;
    protected String descricao;


    public Area(String descricao, int tamanho, String tipo) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
}
