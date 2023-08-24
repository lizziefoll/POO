class Veiculo { //inicio da classe veiculo
    private String marca; //criação do atributo marca
    private String modelo; //criação da atributo modelo
    private int ano; //criação da atributo ano

    // Construtor para inicializar os atributos
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca; //faz referencia ao atributo marca
        this.modelo = modelo; //faz referencia ao atributo modelo
        this.ano = ano; //faz referencia ao atributo ano
    }

    // Getters e setters
    public String getMarca() { //inicio de gatMarca
        return marca; //retorna marca
    } //fim de getMarca

    public void setMarca(String marca) { //inicio de setMarca
        this.marca = marca;
    } //fim de setMarca

    public String getModelo() { //inicio de gatModelo
        return modelo; //retorna modelo
    } //fim de getModelo

    public void setModelo(String modelo) { //inicio de setModelo
        this.modelo = modelo;
    } //fim de setModelo

    public int getAno() { //inicio de gatAno
        return ano; //retorna ano
    } //fim de getAno

    public void setAno(int ano) { //inicio de setAno
        this.ano = ano;
    } //fim de setAno

    // Método para exibir detalhes básicos do veículo
    public void exibirDetalhes() { //inicio da classe exibirDetalhes
        System.out.println("Marca: " + marca); //print de marca
        System.out.println("Modelo: " + modelo); //print de modelo
        System.out.println("Ano: " + ano); //print de ano
    }//fim da classe exibirDetalhes
}//fim da classe veiculo
