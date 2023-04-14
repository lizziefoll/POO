# Atividade 01
* Aluna: Elisabeth Folador Ferreira
Turma: 3° Info 
Data: 13/04
Proposta: Crie uma classe em Java que seja capaz de apresentar a soma
de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos
devem ser desconsiderados sem provocar a exibição de erros ou exceções.

```

import java.util.Scanner;
public class Atv01 { //inicio da classe Atv01
    public static void main(String[] args) {//inicio do método main
        int soma; //declaração do tamanho da variavel soma
        Scanner leitor = new Scanner(System.in);// declaração da variavel que armazena a entrada de dados
        System.out.println("Digite um numero inteiro:"); //mensagem de comando 
        int A = leitor.nextInt(); //variavel onde a resposta do comando deve ser armazenada
        System.out.println("Digite outro número inteiro:") //mensagem de comando 
        int B = leitor.nextInt();//variavel onde a resposta do comando deve ser armazenada

        leitor.close(); //fecha a variavel de armazenamento de dados

        soma = A + B; //adiciona a variável soma, a soma dos dois números digitados
        System.out.println("A soma dos dois números é igual a: "+soma); //mostra na tela o resultado da soma
        }//fim do método main
}//fim da classe Atv01
    }
}
