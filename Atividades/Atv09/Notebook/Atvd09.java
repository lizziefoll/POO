/*
Classe impressão de texto: "ExercicioSemRetorno.java"
IFPR - Campus Cascavel
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
Aluna: Elisabeth Folador Ferreira
*/

import java.util.ArrayList;
public class ExercicioSemRetorno{ //inicio da classe ExercicioSemRetorno

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

        int soma = 0; //variavel que vai receber a soma da lista
        int[] soma_array3 = new int[10]; //cria uma lista de 10 elementos
        int cont; //cria a variavel

        for (int i = 0; i <= 9; i++){ //incio do for que percorre os itens da posição 0 a 9
            cont = soma_array1[i] + soma_array2[i]; //contador recebe a soma das duas listas 
            soma += cont; //a variavel soma ira receber a soma dos elementos das duas listas
            soma_array3[i] = cont; //adicionando ao soma_array3 a soma das listas 1 e 2
        }//fim do for
        System.out.println("A soma dos números dessa lista é: "+ soma); //retorna a variavel soma 


        String aux = ""; //cria uma variavel auxiliar
        for (int i = 0; i <= 9; i++) { //incio do for que percorre os itens de 0 a 10
            aux += (soma_array3[i] + " "); //imprime os numeros da lista separados por um espaço sem virgula
        }//fim do for

        System.out.println("A soma das duas listas é igual a: "+ aux); //mostra a soma das duas listas


    }//fim do método somaNumeros         


    public static void main(String [] args) { //incio do método main
        ExercicioSemRetorno x = new ExercicioSemRetorno(); 

        int[] numerosA = {10, 20, 30, 46, 70, 32, 45, 65, 1, 2}; //array com os numeros inteiros definidos
        int[] numerosB = {1, 2, 3, 4, 7, 3, 4, 6, 1, 2}; //array com os numeros inteiros definidos

        
        x.imprimirNumeros(numerosA, numerosB);//imprime as duas listas utilizadas nas operações
        x.somaNumeros(numerosA, numerosB); //imprime a soma das duas listas utilizadas nas operações 
    }//fim do método main
} //fim da classe ExercicioSemRetorno
