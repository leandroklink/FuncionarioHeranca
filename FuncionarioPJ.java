/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioheranca;

/**
 *
 * @author Leandro
 */
public class FuncionarioPJ extends Funcionario{
    

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.tipo = "PJ";
    }

    @Override
    public double calcularSalario(){
        return salarioBase * 1.15;
    }
    
}
