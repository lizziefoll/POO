public class Main { //inicio da classe Main
    public static void main(String[] args) { //inicio do metodo main

        // cachorros
        Cachorro cachorro1 = new Cachorro("Pomposo", 3, "beagle"); //adiciona uma nova variavel a superclasse Cachorro
        cachorro1.emitirSom();  //chama emitirSom
        cachorro1.mover();  //chama mover
        cachorro1.abanarRabo();  //chama abanarRabo
        cachorro1.exibirInformacoes();  //chama exibirInformacoes
        System.out.println("cachorro1 funcionou"); //print teste

        // passaros
        Passaro passaro1 = new Passaro("Loro", 15, "papaguaio"); //adiciona uma nova variavel a superclasse Passaro
        passaro1.emitirSom(); //chama emitirSom
        passaro1.voar(); //chama voar
        passaro1.construirNinho(); //chama contruieNinho
        passaro1.exibirInformacoes(); //chama exibirInformacoes
        System.out.println("passaro1 funcionou"); //print teste

    }//fim do metodo Main
}//fim da classe Main
