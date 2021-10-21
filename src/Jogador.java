public class Jogador {
    private int numero;//declaração de variavel
    private String nome;//declaração de variavel
    private int idade;//declaração de variavel

    public static void main(String[] args) {
//no método main é criado um objeto chamado jogador
        Jogador jogador = new Jogador(); //Criação do Objeto
        //após a definição do objeto , são atribuídos valores para o jogador.
        jogador.setNumero(10);
        jogador.setNome("Pele");
        jogador.setIdade(30);

        //depois da atribuição , os valores do objeto são exibidos por meio das instruções
        System.out.println("O "+jogador.getNome()+" foi um dos melhores camisa "+jogador.getNumero()+" de todos os tempos, ele tinha "+jogador.getIdade()+" de idade");

        //em seguida , a referencia do objeto jogador é exibida
        System.out.println("referencia do objeto "+jogador);
    }


    //para manipular os valores do objeto , são definidos getter/setter
    public String getNome() {	// método para pegar o valor da variável nome
        return nome;
    }
    public int getNumero() {	// método para pegar o valor da variável número
        return numero;
    }
    public int getIdade(){return  idade;}

    public void setNome(String nome) {	// método para mudar o valor da variável nome
        this.nome = nome;
    }
    public void setNumero(int numero) {	// método para mudar o valor da variável número
        this.numero = numero;
    }
    public void setIdade(int idade) {this.idade = idade;}
}
