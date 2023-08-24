public class TesteVeiculos { //inicio da classe TesteVeiculos
    public static void main(String[] args) { //inicio do método main
        // Criando instâncias de Carro e Moto
        Carro carro = new Carro("Toyota", "Corolla", 2023, 4); //cria as novas instancias da classe Carro
        Moto moto = new Moto("Honda", "CBR 1000RR", 2023, 1000); //cria as novas instancias da classe Moto

        // Configurando atributos e exibindo detalhes
        System.out.println("Detalhes do Carro:");//print para mostrar os detalhes do carro
        carro.exibirDetalhes();//chama a função exibirDetalhes de carro

        System.out.println("\nDetalhes da Moto:"); //print para mostrar os detalhes da moto
        moto.exibirDetalhes();//chama a função exibirDetalhes de moto

    }//fim do metodo main
}//fim da classe TesteVeiculos
