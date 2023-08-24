class Carro extends Veiculo { //inicio da classe Carro que herda da superclasse Veiculo
    private int numeroDePortas; //criação do atributo numeroDePortas

    // Construtor para inicializar atributos de Carro e Veiculo 
    public Carro(String marca, String modelo, int ano, int numeroDePortas) { //inicio da classe Carro
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.numeroDePortas = numeroDePortas; //faz referencia ao atributo numeroDePortas
    } //fim da classe Carro

    // Getter e setter específico para numeroDePortas
    public int getNumeroDePortas() { //inicio da classe getNumeroDePortas
        return numeroDePortas; //retorna o numeroDePortas
    } //fim da classe numeroDePortas

    public void setNumeroDePortas(int numeroDePortas) { //inicio da classe setNumeroDePortas
        this.numeroDePortas = numeroDePortas;  //faz referencia ao atributo numeroDePortas
    } //fim da classe setNumeroDePortas

    // Sobrescreve o método exibirDetalhes para incluir atributos específicos de Carro
    @Override
    public void exibirDetalhes() { //inicio da classe exibirDetalhes
        super.exibirDetalhes(); // Chama o método da classe base
        System.out.println("Número de Portas: " + numeroDePortas); //printa o numero de portas
    }//fim da classe exibirDetalhes
}//fim da classe Carro
