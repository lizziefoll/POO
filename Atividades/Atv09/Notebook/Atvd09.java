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
