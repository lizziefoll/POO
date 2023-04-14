# Atividade 02

* Aluna: Elisabeth Folador Ferreira
*Turma: 3° Info 
*Proposta: Crie uma classe em Java que realize cada uma das seguintes tarefas:
a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
b) Atribuir o produto de variáveis b e c para a variável a;
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

```

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atv02 {//inicio da classe Atv02
    public static void main(String[] args) {//inicio do método main 
        String x;  //declaração da variavel de leitura dos dados digitados
        float nota1, nota2, trab;  //declaração das variaveis que vao ser lidas

        x = JOptionPane.showInputDialog("Nota da prova 1: "); //entrada da nota 1
        nota1 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 2: "); //entrada da nota 2
        nota2 = Float.parseFloat(x); //conversao dos dados para float
        x = JOptionPane.showInputDialog("Nota da prova 1: "); //entrada da nota do trabalho
        trab = Float.parseFloat(x); //conversao dos dados para float

        float media = (nota1 + nota2 + trab)/ 3; //calculo da média
        JOptionPane.showMessageDialog(null, "Média = " + media); //resposta da média 


    } //fim do método main
}//fim da classe Atv02    
