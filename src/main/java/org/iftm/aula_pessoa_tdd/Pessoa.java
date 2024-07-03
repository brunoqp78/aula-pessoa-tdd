package org.iftm.aula_pessoa_tdd;
public class Pessoa {
    private String nome;
    private double salario;

    public Pessoa(){}
    
    public Pessoa(String nome) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        if (nome.length()>=2 && nome.length()<=100){
            this.nome = nome.toUpperCase();
        }else{
            throw new IllegalArgumentException();
        }
    }

    

    


}
