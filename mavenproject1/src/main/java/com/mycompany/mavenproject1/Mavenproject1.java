package com.mycompany.mavenproject1;
public class Mavenproject1 {
    public static void main(String[] args) {
       long inicio = System.nanoTime();
       int size=32;
       int[][] mm = new int[size][size];
       int sizeM = mm.length;
        for (int i = 0; i < sizeM; i++) {
            for (int j = 0; j < sizeM; j++) {
                mm[i][j]=(int)(Math.random()*11);
                System.out.println("Valores de la matriz "+" valor:"+mm[i][j]);
            }
        }
        long fin=System.nanoTime();
        long tiempo =(fin-inicio);
        System.err.println("Tiempo de ejecucion "+tiempo+" nanosegundos");
    }
}