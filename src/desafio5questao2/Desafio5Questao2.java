package desafio5questao2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Jeferson Leon
 */
public class Desafio5Questao2 {
    /*
         Faça um algoritmo que some os números fornecidos pelo usuário até que o 
         número lido seja igual a zero.
     */
    public static void main(String[] args) {
         int numero, acuSomaNum;   
         Scanner teclado = new Scanner(System.in);
         numero = 1; acuSomaNum = 0;
         while(numero != 0){
        //     System.out.println("Informe um numero ou zero para sair:");
        //     numero = teclado.nextInt();
             numero =Integer.parseInt(JOptionPane.
                     showInputDialog("Informe um numero ou zero para sair:"));
             acuSomaNum = acuSomaNum + numero;
         }
         JOptionPane.showMessageDialog(null,"A soma de todos os valores digitados é: "
                 +acuSomaNum);
    }

}
