public class Main {

    public static void main(String[] args) {
	    Complejidad c = new Complejidad();
	    int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][ejecuciones];
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            for (int columna=resultados[0].length-1; columna>=0; columna--) {
            int n = (renglon+1) * 1;
            //resultados[renglon][columna] = n;
            resultados[renglon][columna] = c.lineal(n);
        }
    }
        imprimirMatriz(resultados);
        //imprimirejemploprofe(resultados);
/*
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.cuadratica(n);
        }
        imprimir(resultados);
        /*
        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][0] = n;
            resultados[renglon][1] = c.log(n);
        }
        imprimir(resultados);  */
    }

    /*private static void imprimirejemploprofe(int[][] resultado) {
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int veces = 0; veces < resultado[renglon][1]; veces++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }*/

   

    private static void imprimirMatriz(int [][] matriz){
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
               if(matriz.length-y<matriz[x][1]) {
                   System.out.print(".\t");
            }
               else {
                   System.out.print("");
                }
            }
            System.out.println("");
          }
    }
}