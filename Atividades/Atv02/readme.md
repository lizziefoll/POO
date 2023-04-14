# Atividade 02

* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: Crie uma classe em Java que realize cada uma das seguintes tarefas:
a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
b) Atribuir o produto de variáveis b e c para a variável a;
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

```
import java.util.Scanner;
public class Atv02 {//inicio da classe Atv02
    public static void main(String[] args) {//inicio do método main
        int  A, B, C; //declaração das variáveis A, B e C como inteiro

        Scanner leitor = new Scanner(System.in);// declaração da variavel que armazena a entrada de dados
        System.out.print("Informe um inteiro: ");////mensagem de comando 
        int B= leitor.nextInt();//variavel onde a resposta do comando deve ser armazenada
        leitor.close();  //fecha a variavel de armazenamento de dados
        double C = 3.3; //declaração da variável C como double
        
        double A = B * C; //produto de B e C armazenados na variável A como double
        
        System.out.print("O produto de A por B: "+B+" e por C: "+C+" é igual a: "+A);//mostra na tela o resultado 
    } //fim do método main
}//fim da classe Atv02 
