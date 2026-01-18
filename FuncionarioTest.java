/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioheranca;
import java.util.ArrayList;
/**
 *
 * @author Leandro
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        ArrayList<Funcionario> arrayFunc = new ArrayList<>();
        
        arrayFunc.add(new FuncionarioCLT("Maria", 1700));
        arrayFunc.add(new FuncionarioCLT("João", 1900));
        arrayFunc.add(new FuncionarioPJ("Claudio", 2100));
        
        for(Funcionario f : arrayFunc){
            System.out.printf("Nome: %s | Salario: %.2f | Tipo: %s\n", f.getNome(), f.getSalarioBase(), f.getTipo());

        }
        
    }
}
