public class Teste{ //inicio da classe Teste
    public static void main(String[] args) { //inicio do método main
        Pessoa pessoa = new Pessoa(); //cria uma nova instancia para a classe
        
        pessoa.setNome("Elisabeth"); //atribui valor a variavel nome
        pessoa.setIdade(17); //atribui valor a variavel idade
        pessoa.setAltura(1.60); //atribui valor a variavel altura
        
        System.out.println("Nome: " + pessoa.getNome()); //print do nome chamando a classe getNome
        System.out.println("Idade: " + pessoa.getIdade()); //print da idade chamando a classe getIdade
        System.out.println("Altura: " + pessoa.getAltura()); //print da altura chamando a classe getAltura
    }//fim do metodo main
}//fim da classe Teste