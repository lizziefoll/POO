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
