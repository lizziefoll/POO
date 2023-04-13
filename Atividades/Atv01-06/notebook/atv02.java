/*
Aluna: Elisabeth Folador Ferreira
Turma: 3° Info 
Data: 13/04
Proposta: Crie uma classe em Java que realize cada uma das seguintes tarefas:
a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
b) Atribuir o produto de variáveis b e c para a variável a;
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
*/

import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        int  A, B, C;

        Scanner x = new Scanner(System.in);
        System.out.print("Informe um inteiro: ");
        B = x.nextInt();
        System.out.print("Informe um inteiro: ");
        C = x.nextInt();

        A = B*C; 
        System.out.print("O valor de A é: "+A);
    }
}    
