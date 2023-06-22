# Atividade 09
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: Você foi contratado para desenvolver um programa em Java que realiza operações com números inteiros. Para isso, você precisa implementar métodos sem retorno que executam tarefas específicas. 
Implemente o método imprimirNumeros, que recebe um array com 10 inteiros como parâmetro e exibe os números na tela, separados por um espaço. O método não deve retornar nenhum valor.
Implemente o método somaNumeros, que recebe um array com 10 inteiros como parâmetro, calcula a soma de todos os números do array e exibe o resultado na tela. O método não deve retornar nenhum valor 
No método main, um array de números inteiros é criado e inicializado. Você deve chamar o método imprimirNumeros passando o array como argumento. Em seguida, chame o método somaNumeros para calcular a soma dos números e exibir o resultado. Por fim, chame novamente o método imprimirNumeros para exibir o array atualizado após a soma.
Observações:
Os métodos imprimirNumeros e somaNumeros devem ser implementados dentro da classe ExercicioSemRetorno.
Utilize estruturas de repetição e operações matemáticas para calcular a soma dos números.

```


public class exercicioSemRetorno{ //inicio da classe ExercicioSemRetorno

    //inicio do método imprimirNumeros
    public void imprimirNumeros(int[] imprimir_array){ //inicializando os parametros do método
        String aux = ""; 
        for (int i = 0; i <= 9; i++) { //incio do for que percorre os itens de 0 a 10
             aux += (imprimir_array[i] + " "); 
        }     
        System.out.println(aux); //retorna o array 
    } //fim do método imprimirNumeros


    //inicio do método somaNumeros
    public void somaNumeros(int[] soma_array){ //inicializando os parametros do método

        int aux = 0; //contador para o for

        for (int i = 0; i <= 9; i++) { //incio do for que percorre os itens de 0 a 10
             aux += soma_array[i]; //variavel aux vai receber a soma dos elementos da lista
        }//fim do for
        System.out.println(aux); //retorna a variavel soma 
    }//fim do método somaNumeros         

    public static void main(String [] args) { //incio do método main
        exercicioSemRetorno x = new exercicioSemRetorno(); 

        int[] numerosA = {10, 20, 30, 46, 70, 32, 45, 65, 1, 2}; //array com os numeros inteiros definidos
        //int[] numerosB = {10, 20, 30, 46, 70, 32, 45, 65, 1, 2}; //array com os numeros inteiros definidos

        
        x.imprimirNumeros(numerosA);
        x.somaNumeros(numerosA);
    }//fim do método main
} //fim da classe ExercicioSemRetorno
