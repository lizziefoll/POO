class Ave{ //inicio da classe AVe
    public String nome; //cria o atributo provado: nome 
    public int idade; //cria o atributo privado: idade

    public Ave(String nome, int idade) { //inicio da superclasse Aves
        this.nome = nome; //referencia o atributo nome fora da superclasse
        this.idade = idade; //referencia o atributo idade fora da superclasse
    } //fim da superclasse Aves

    public void emitirSom() { //inicio do metodo emitirSom
        System.out.println("emitiu som"); //print teste
    }//fim do metodo emitirSom

    public void voar() {//inicio do metodo voar
        System.out.println("voou"); //print teste
    } //fim do metodo voar

    public void exibirInformacoes() { //inicio do metodo exibirInformaçoes
        System.out.println("Nome: " + nome); //print do nome da ave
        System.out.println("Idade: " + idade); ///print da idade da ave
    }//fim do metodo exibirinformaçoes
    
} //fim da classe Ave
