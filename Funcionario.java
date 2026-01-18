/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionarioheranca;

/**
 *
 * @author Leandro
 */
public abstract class Funcionario {

    protected String nome;
    protected double salarioBase;
    protected String tipo;
    
    
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;

    }
    public double calcularSalario(){
        return salarioBase;
    }
    public String getNome(){
        return this.nome;
    }
   public String getTipo(){
        return this.tipo;
    }
   public double getSalarioBase(){
       return this.salarioBase;
   }
    
}
