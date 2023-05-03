/*
Aluna: Elisabeth Folador Ferreira
Turma: 3° Info 
Proposta: Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, 
armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas 
em ordem decrescente (da maior para a menor) e a média aritmética das notas.
*/

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atv07 {//inicio da classe Atv02
    public static void main(String[] args) {//inicio do método main 
        String x;  //declaração da variavel de leitura dos dados digitados
        float nota1, nota2, nota3, nota4, nota5;  //declaração das variaveis que vao ser lidas
        float [] arrayNotas = new float[5]; 

        x = JOptionPane.showInputDialog("Nota da prova 1: "); //entrada da nota 1
        nota1 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 2: "); //entrada da nota 2
        nota2 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 3: "); //entrada da nota do trabalho
        nota3 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 4: "); //entrada da nota do trabalho
        nota4 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 5: "); //entrada da nota do trabalho
        nota5 = Float.parseFloat(x); //conversao dos dados para float
        float arrayNotas = {nota1, nota2, nota3, nota4, nota5};
        

        arrayNotas.sort(); // aqui ele vai ordernar do menor para o maior
        arrayNotas.reverse(); // aqui ele vai inverter as posições fazendo o efeito desejado

        double media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5); //calcula a media das notas


        JOptionPane.showMessageDialog(null, "Média: " + media); //resposta da média 


    } //fim do método main
}//fim da classe Atv07
