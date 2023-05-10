# Atividade 07
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, 
armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas 
em ordem decrescente (da maior para a menor) e a média aritmética das notas.

```

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
        Float media = 0f; //variavel da media 
        String x;  //declaração da variavel de leitura dos dados digitados
        float nota1, nota2, nota3, nota4, nota5;  //declaração das variaveis que vao ser lidas
        int [] arrayNotas = new int[5]; //array que armazena as notas
        String ordem = ""; //string para fazer a exibição das notas em decrescente


        for (int i = 0; i < 5; i++){ //inicio do for que vai repitir a mensagem para apresentar as notas 5 vezes
            x = JOptionPane.showInputDialog("Nota da prova "+(i+1)": "); //entrada das notas
            arrayNotas[i] = Integer.parseInt(x); //conversão das notas para float e adionando-as em uma lista
            media += arrayNotas[i]; //calcula a media das notas e adiciona elas no array
    
        }//fim do for 
            
        for(int i = 1;  i < notas.length; i++){//inicio do for para mostrar em decrescente
            for (int j = 0; j < i; j++) {  
                if (notas[i] > notas[j]){
                    int dsc = notas[i];
                    notas[i] = notas[j];
                    notas[j] = dsc;
                }//fim do if 
            } //fim do segundo for
        } //fim fo primeiro for

        for (int num : notas) { //inicio do for 
            ordem += num + "; ";   //adiciona a string as notas
        } // fim do loop for


        JOptionPane.showMessageDialog(null, "Notas = " + notas_ordem); //mostra as notas em ordem decrescente
        JOptionPane.showMessageDialog(null, "Média: " + media/5); //resposta da média 


    } //fim do método main
}//fim da classe Atv07
