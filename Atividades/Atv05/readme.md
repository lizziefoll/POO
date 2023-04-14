# Atividade 05
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta: Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal
de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a 
String com o valor, usando "Valor da média mensal = " + mediaMensal.


```
public class BalancoTrimestral(){  //inicio da classe BalancoTrimestral
    public static void main(String[] args){ //inicio do método main
        double gastosJaneiro = 30000.00; //declaração da variavel como umm valor real(double)
        double gastosFevereiro = 33030.77; //declaração da variavel como umm valor real(double)
        double gastosMarco = 23899.01; //declaração da variavel como umm valor real(double)

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //criação da variavel gastosTrimestre e 
                                                                          //adicionando a ele a soma dos gastos  
        System.out.println("Os gastos totais do trimestre foram de: "+ gastosTrimestre); //mensagem com os gastos finais

        double mediaMensal = (gastosJaneiro+ gastosFevereiro + gastosMarco) / 3; 
        System.out.println("Valor da média mensal = " + mediaMensal.); 
    }//fim do método main
}//fim da classe BalancoTrimestral
