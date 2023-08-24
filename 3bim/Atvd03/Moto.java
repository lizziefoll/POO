class Moto extends Veiculo { //inicio da classe Moto que herda da superclasse Veiculo
    private int cilindradas; //criação do atributo cilindradas

    // Construtor para inicializar atributos de Moto e Veiculo
    public Moto(String marca, String modelo, int ano, int cilindradas) { //inicio da classe Moto
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.cilindradas = cilindradas;  //faz referencia ao atributo cilindradas
    } //fim da classe Moto

    // Getter e setter específico para cilindradas
    public int getCilindradas() { //inicio da classe getCilindradas
        return cilindradas; //retorna cilindradas
    }//fim da classe getCilindradas

    public void setCilindradas(int cilindradas) { //inicio da classe setCilindradas
        this.cilindradas = cilindradas;  //faz referencia ao atributo cilindradas
    } //fim da classe setCilindradas

    // Sobrescreve o método exibirDetalhes para incluir atributos específicos de Moto
    @Override
    public void exibirDetalhes() { //inicip da classe exibirDetalhes
        super.exibirDetalhes(); // Chama o método da classe base 
        System.out.println("Cilindradas: " + cilindradas); //printa as cilindradas
    }//fim da classe exibirDetalhes
}//fim da classe Moto
