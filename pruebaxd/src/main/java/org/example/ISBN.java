package org.example;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        String filepath = "src/main/resources/ISBN.txt";
        try {
            Scanner scanner = Escaner.crearEscaner(filepath);
            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                String linea2 = linea.replaceAll("-", "");
                String[] palabra = linea2.split("");

                int x1 = Integer.parseInt(palabra[0]);
                int x2 = Integer.parseInt(palabra[1]);
                int x3 = Integer.parseInt(palabra[2]);
                int x4 = Integer.parseInt(palabra[3]);
                int x6 = Integer.parseInt(palabra[5]);
                int x7 = Integer.parseInt(palabra[6]);
                int x5 = Integer.parseInt(palabra[4]);
                int x8 = Integer.parseInt(palabra[7]);
                int x9 = Integer.parseInt(palabra[8]);
                int x10 = Integer.parseInt(palabra[9]);
                if (esValido(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10)) {
                    System.out.println(linea + " válido");
                }
                else {
                    System.out.println(linea + " inválido");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }
    }

    private static boolean esValido(int x1, int x2, int x3, int x4, int x5, int x6, int x7, int x8, int x9, int x10) {
        return ((x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10) % 11 == 0);
    }
}
