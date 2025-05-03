package quarto_poo;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.altura = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void aniversario(){
        this.idade++;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}