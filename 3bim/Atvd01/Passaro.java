import java.util.Date;
class Passaro extends Ave { //inicio da subclasse Passaro derivada de Ave
    private String cor; //cria o atributo privado: cor

    public Passaro(String nome, int idade, String cor) { //inicio da superclasse Passaro
        super(nome, idade); //acessa nome e idade
        this.cor = cor; //referencia o atributo cor fora da superclasse
    }

    public void construirNinho() { //inicio do metodo contruirNinho
        System.out.println("O passaro contruiu seu ninho"); //print teste
    } //fim do metodo contruirNinho

    public void exibirInformacoes() { //inicio do metodo exibirInformacoes
        System.out.println("Cor: " + cor); //print teste
    }// fim do metodo exibirInformacoes
} // fim da subclasse Passaro
