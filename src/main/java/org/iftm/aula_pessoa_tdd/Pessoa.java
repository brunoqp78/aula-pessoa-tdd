package org.iftm.aula_pessoa_tdd;
public class Pessoa {
    private String nome;
    private double salario;

    public Pessoa(){}

    public Pessoa(String nome) {
        this.nome = validaNome(nome);
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = validaNome(nome);
    }

    private String validaNome(String nome){
        if (nome.length()>=2 && nome.length()<=100){
            return nome.toUpperCase();
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void setSalario(double salario) {
        this.salario = validaSalario(salario);
    }

    public double validaSalario(double salario){
        if (salario >= 1100 && salario <=1000000)
           return salario;
        else{
            throw new IllegalArgumentException("Salário inválido");
        }
    }

    

    


}
