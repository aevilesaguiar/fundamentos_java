package teste;

public class TESTE3 {
    /* Objetivo: Transferir os conteúdos de um array NOMECURSO para outro array
 CODCURSO com as mesmas características e propriedades, mas com tamanhos
 diferentes, utilizando o método arraycopy.
 */

    public static void main(String[] args) {
        /* ENTRADA e PROCESSAMENTO DE DADOS */
        /* Array unidimensional NOMECURSO com tamanho de 7 elementos [0] a [6] */
        char[] NOMECURSO = {'S', 'I', 'S', 'T', 'E', 'M', 'A'};

        /* Array unidimensional CODCURSO com tamanho de 4 elementos [0] a [3] */
        char[] CODCURSO = new char[4];

        /* Transferência do conteúdo entre os arrays utilizando o método arraycopy */
        System.arraycopy(NOMECURSO, 0, CODCURSO, 0, 4);

        /* SAÍDA DE DADOS */
 /* Apresentação do resultado do processamento: Transferência do
 conteúdo entre arrays unidimensionais
 */
        System.out.println(new String(CODCURSO));
    }

}
