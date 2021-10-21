public class ProgString {
    public static void main(String[] args) {
        System.out.println("recomenda-se não se acentuar as palavras");
        System.out.println("\n===============================================");
        String v1 = "Sistema";
        String v2= new String ("sistema");
        //equals
        System.out.println("Exemplo com o método de comparação: equals");
        if(v1.equals(v2))
        {
            System.out.println("Variaveis Identicas => " + "v1: "+ v1 + "v2: "+v2);
        }
        else
        {
            System.out.println("Variaveis Diferentes=> " + "v1: " + v1 + "v2: " + v2);
        }
        System.out.println("\n ====================================================");
        //equal Ignore Case
        System.out.println("Exemplo sem o método de marcação: equalsIgnoreCase");
        if(v1.equalsIgnoreCase(v2)){
            System.out.println("Variaveis Identicas=> " + " v1: "+ v1 + " v2: "+ v2);
        }else{
            System.out.println("Variaveis diferentes => " + "v1: "+ v1 + " v2: "+v2);
        }
        System.out.println("\n ====================================================");
        //alguns métodos
        //indexof, charAt, substring
        System.out.println("Exemplos com métodos: indexof, substring, charAt");
        String frase = "Desenvolvimento de Sistemas";
        System.out.println("\n Frase - Exemplo => Desenvolvimento de Sistemas ");
        System.out.println("\n indexof => Posição da fonte <a> na Frase - Exemplo (0 a 26 e com os espaços): " + frase.charAt(5));

        System.out.println("\n ====================================================");

        String titulo1 = "Desenvolvimento",titulo2="sistemas";
        String cursoCompleto = titulo1.concat(titulo2);
        System.out.println("\n titulo1: "+ titulo1);
        System.out.println("titulo2: "+ titulo2);

        System.out.println("Exemplos Concatenados => titulo1 + titulo2= "+cursoCompleto);


    }

}
