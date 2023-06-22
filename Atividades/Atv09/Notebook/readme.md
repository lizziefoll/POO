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
    public void imprimirNumeros(int[] imprimir_array1, int[] imprimir_array2){ //inicializando os parametros do método
        String aux1 = ""; 
        String aux2 = ""; 
        for (int i = 0; i <= 9; i++) { //incio do for que percorre os itens de 0 a 10
            aux1 += (imprimir_array1[i] + " "); 
            aux2 += (imprimir_array2[i] + " "); 
        }     
        System.out.println("Primeira lista: "+aux1); //retorna o array 
        System.out.println("Segunda lista: "+aux2); 
    } //fim do método imprimirNumeros


    //inicio do método somaNumeros
    public void somaNumeros(int[] soma_array1, int[] soma_array2){ //inicializando os parametros do método

        int soma = 0; //contador para o for
        int[] soma_array3 = new int[10]; 
        int cont = 0; 

        for (int i = 0; i <= 9; i++){ //incio do for que percorre os itens de 0 a 10
            cont = soma_array1[i] + soma_array2[i]; 
            soma += cont; //variavel aux vai receber a soma dos elementos da lista
            soma_array3[i] = soma; 
        }//fim do for
        System.out.println(soma); //retorna a variavel soma 
    }//fim do método somaNumeros         

    public static void main(String [] args) { //incio do método main
        exercicioSemRetorno x = new exercicioSemRetorno(); 

        int[] numerosA = {10, 20, 30, 46, 70, 32, 45, 65, 1, 2}; //array com os numeros inteiros definidos
        int[] numerosB = {1, 2, 3, 4, 7, 3, 4, 6, 1, 2}; //array com os numeros inteiros definidos

        
        x.imprimirNumeros(numerosA, numerosB);
        x.somaNumeros(numerosA, numerosB);
    }//fim do método main
} //fim da classe ExercicioSemRetorno
