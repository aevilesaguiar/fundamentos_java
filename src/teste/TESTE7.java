package teste;

public class TESTE7 {
    /* Calcular a raiz quadrada de um número real e apresentar o resultado com arredondamentos utilizando a classe Math */
    public static void main(String[] args) {


        /* Definição de um número real */
        double num = 90;

        /* Cálculo e apresentação da raiz quadrada de um número real utilizando a classe Math */
        System.out.println("sqrt: Raiz quadrada de "+ num + " = " + Math.sqrt(num));

        /* Cálculo da raiz quadrada de um número real com arredondamento utilizando a classe Math */
        System.out.println("round: O valor arredondado da raiz quadrada de "+ num + "  = " + Math.round(Math.sqrt(num)));
    }
}
