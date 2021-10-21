package teste;

import java.util.Arrays;
import java.util.Collections;

public class ArraSort<numeros1> {
    public static void main(String[] args) {
        String[] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
        //para ordená-lo em ordem crescente, escreveremos a instrução:
        Arrays.sort(nombres);
//Se mostrarmos a matriz na tela, verificaremos se ela está ordenada em ordem crescente:
        for (String s : nombres)
            System.out.println(s);
//Arrays.sort classifica em ordem crescente (do menor para o maior). Para classificar um array em ordem
//decrescente (do mais alto para o mais baixo), ele deve ser indicado usando o método reverseOrder () da classe Collections.
        System.out.println("================================================\n");
        //Por exemplo, para classificar os nomes de array em ordem decrescente, escrevemos a instrução Arrays.sort da seguinte maneira:
        Arrays.sort(nombres, Collections.reverseOrder());
        for (String b : nombres)
            System.out.println(b);


        Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros, Collections.reverseOrder());
        for (int n : numeros) {
            System.out.println(n);
        }
    }
    }

