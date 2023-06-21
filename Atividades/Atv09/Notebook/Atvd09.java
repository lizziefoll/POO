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
