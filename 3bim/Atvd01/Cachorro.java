import java.util.Date;
class Cachorro extends Mamiferos { //inicio da subclasse cachorro derivada de Mamiferos
    private String raca; //cria a string privada raca

    public Cachorro(String nome, int idade, String raca) { //inicio da subclasse Cachorro
        super(nome, idade);  //acessa nome e idade
        this.raca = raca; //referencia o atributo raca fora da superclasse
    } //fim da subclasse cachorro

    public void abanarRabo() { //inicio do metodo abanarRabo
        System.out.println("abanou o rabo"); //print teste
    } //fim do metodo abanarRabo

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        System.out.println("Raça: " + raca); //print da raça 
    }//fim do metodo exibirInformacoes
} //fim da subclasse cachorro
