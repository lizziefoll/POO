public class Mamiferos{ //inicio da classe Mamiferos
    private String nome; //cria o atributo privado: nome 
    private int idade; //cria o atributo privado: idade

    public Mamiferos(String nome, int idade) { //inicio da superclasse Mamiferos
        this.nome = nome; //referencia o atributo nome fora da superclasse
        this.idade = idade; //referencia o atributo idade fora da superclasse
    } //fim da superclasse Mamiferos

    public void emitirSom() { //inicio do metodo emitirSom
        System.out.println("emitiu som"); //print teste
    } //fim do metodo emitirSom

    public void mover() { //inicio do metodo mover
        System.out.println("se moveu"); //print teste
    } //fim do metodo voar 

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        System.out.println("Nome: " + nome); //print do nome da ave
        System.out.println("Idade: " + idade); ///print da idade da ave
    }//fim do metodo exibirinformaçoes
    
}//fim da classe Mamiferos
