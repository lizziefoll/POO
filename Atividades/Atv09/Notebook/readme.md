# Atividade 00
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: Você foi contratado para desenvolver um programa em Java que realiza operações com números inteiros. Para isso, você precisa implementar métodos sem retorno que executam tarefas específicas. 
- Implemente o método imprimirNumeros, que recebe um array com 10 inteiros como parâmetro e exibe os números na tela, separados por um espaço. O método não deve retornar nenhum valor.
- Implemente o método somaNumeros, que recebe um array com 10 inteiros como parâmetro, calcula a soma de todos os números do array e exibe o resultado na tela. O método não deve retornar nenhum valor 
- No método main, um array de números inteiros é criado e inicializado. Você deve chamar o método imprimirNumeros passando o array como argumento. Em seguida, chame o método somaNumeros para calcular a soma dos números e exibir o resultado. Por fim, chame novamente o método imprimirNumeros para exibir o array atualizado após a soma.
Observações:
Os métodos imprimirNumeros e somaNumeros devem ser implementados dentro da classe ExercicioSemRetorno.
Utilize estruturas de repetição e operações matemáticas para calcular a soma dos números.

```

//inicio do método imprimirNumeros
public int imprimirNumeros(int[] imprimir_array = new int[10]){ //inicializando os parametros do método
    return imprimir_array; //retorna o array 
} //fim do método imprimirNumeros


//inicio do método somaNumeros
public int somaNumeros(int[] soma_array = new int[10]){ //inicializando os parametros do método

    int aux = 0; //contador para o for

    for (int i = 0; i <= 10; i++) { //incio do for que percorre os itens de 0 a 10
        int aux += soma_array[i]; //variavel aux vai receber a soma dos elementos da lista
    }//fim do for
    return soma; //retorna a variavel soma 
}//fim do método somaNumeros

//inicio da classe ExercicioSemRetorno
public class ExercicioSemRetorno{  
    public static void main  (String [] args) { //incio do método main
        int numeros = [10, 20, 30, 46, 70, 32, 45, 65, 1, 2]; //array com os numeros inteiros definidos

        int  primeira = imprimirNumeros(numeros);   //chama o método imprimirNumeros e utiliza os numeros do array como parametro
        System.out.println("Os elementos do vetor são: " + primeira); //mostra os números contidos no array
        int  segunda = somaNumeros(numeros); //chama o método somaNumeros e utiliza o array numeros como parametro
        System.out.println("A soma dos números desse vetor é: " + segunda); //mostra a soma dos numeros do array numeros
    }//fim do método main
} //fim da classe ExercicioSemRetorno
