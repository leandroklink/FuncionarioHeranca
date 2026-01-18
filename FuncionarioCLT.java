/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioheranca;

/**
 *
 * @author Leandro
 */
public class FuncionarioCLT extends Funcionario{
    
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.tipo = "CLT";
    }
    @Override
    public double calcularSalario(){
        return salarioBase * 0.90;
    }
}
