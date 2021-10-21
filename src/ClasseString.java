public class ClasseString {
    public static void main(String[] args) {

        char [] arrayCarac = {'B','o','s','o','n',' ', 'T','r','e','i','n','a','m','e','n','t','o'};

        String txt = new String("Fabio dos Reis");
        String txt4 = "Fábio dos Reis";

        //Três formas de Construtores da Classe String

        String tex1 = new String();
        String tex2 = new String(txt);
        String tex3=new String(arrayCarac);
        System.out.printf( "text1 = %s%ntex2 = %s%ntex3=%s%n", tex1,tex2,tex3);
        System.out.printf("%nComprimento da String txt: %d caracteres",txt.length());

        //criar um array de caracteres a parte deuma string:
        char[] arrayCar = new char[5];
        txt4.getChars(0,5,arrayCarac, 0);//numero da posição inicial do indice"0",  até a posição 5
    // para o arrayCar que irá carregar os arrays, posição 0
        System.out.println("%nO array de caracteres criado é: ");
        for(char caractere: arrayCar){
            System.out.println(caractere);
        }



    }
}
