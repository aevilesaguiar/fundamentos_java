package teste;

public class TESTE {
    public static void main(String[] args) {
        double [][] notas = new double[2][4];
        notas [0][0]=8.0;
        notas [0][1]=7.5;
        notas [0][2]=9.5;
        notas [1][1]=8.5;
        notas [1][2]=8.0;
        notas [1][3]=9.0;
        System.out.println("\n");
        for (int i=0; i<notas.length;i++){
            for (int c=0;c<notas[1].length;c++){
                System.out.println(i+" e "+c+" = "+notas[i][c]+"\t");
            }
            System.out.println("\n");

        }

    }

}
