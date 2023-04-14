# Atividade 03
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: e, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março,
R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo 
os seguintes passos:

a) Crie uma classe chamada BalancoTrimestral com o método main;
b) No método principal, declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o
valor gasto no mês de janeiro;
c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos,
utilize uma linha para cada declaração;
d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;
e) Exiba a variável gastosTrimestre.
*/

```
public class BalancoTrimestral(){  //inicio da classe BalancoTrimestral
    public static void main(String[] args){ //inicio do método main
        double gastosJaneiro = 30000.00; //declaração da variavel como umm valor real(double)
        double gastosFevereiro = 33030.77; //declaração da variavel como umm valor real(double)
        double gastosMarco = 23899.01; //declaração da variavel como umm valor real(double)

        double gastosTrimestre = gastJaneiro + gastFevereiro + gastMarco; //criação da variavel gastosTrimestre e 
                                                                          //adicionando a ele a soma dos gastos  
        System.out.println("Os gastos totais do trimestre foram de: "+ gastosTrimestre); //mensagem com os gastos finais
    }//fim do método main
}//fim da classe BalancoTrimestral
