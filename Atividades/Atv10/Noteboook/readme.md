# Atividade 01
* Aluna: Elisabeth Folador Ferreira
* Turma: 3° Info 
* Proposta:  Crie uma classe chamada "Pessoa" com os seguintes atributos privados: 
"nome" (do tipo String), "idade" (do tipo int) e "altura" (do tipo double). 
Em seguida, implemente métodos públicos para acessar e modificar esses atributos,
respeitando o princípio de encapsulamento.

* Pessoa.java
```

private class Pessoa { //inicio da classe Pessoa
    private String nome; //atribui valor de string para a variavel nome
    private int idade; //atribui valor de inteiro para a variavel idade
    private double altura; //atribui valor de double para a variavel altura
    
    public String getNome() { //acessa o atributo nome
        return nome; //retorna o atributo nome
    } //fim da classe getNome
    
    public void setNome(String nome) { //altera o valor do atributo nome
        this.nome = nome; //coloca o atributo da classe para receber o valor recebido como parametro

    } //fim da classe setNome
    
    public int getIdade() { //acessa o atributo idade
        return idade; //retorna o atributo idade
    } //fim da classe getIdade
    
    public void setIdade(int idade) {  //altera o valor do atributo idade
        this.idade = idade; //coloca o atributo da classe para receber o valor recebido como parametro
    } //fim da classe setIdade
    
    public double getAltura() { //acessa o atributo altura
        return altura; //retorna o atributo altura
    } //fim da classe getAltura
    
    public void setAltura(double altura) {  //altera o valor do atributo altura
        this.altura = altura; //coloca o atributo da classe para receber o valor recebido como parametro
    }//fim da classe setAltura

}//fim da classe Pessoa
