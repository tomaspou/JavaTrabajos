package org.example;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Escaner {
    public static void main( String[] args ) throws FileNotFoundException
    {
        File f = new File("src/main/resources/datos.txt");
        Scanner miEscaner = new Scanner(f);
        while (miEscaner.hasNext()) {      //Mientras tenga siguiente
//            System.out.println(miEscaner.nextLine());
            String line = miEscaner.nextLine(); //line te devuelve una linea :v
            String[] identify = line.split(" "); //Te devuelve un vector donde cada elem está separado por " "
            Arrays.stream(identify).forEach(System.out::println); //stream = for q recorre, forEach = para cada elem lo printea
//            for (String a : identify) {
//                System.out.println(a);
//            }
        }
    }
    public static Scanner crearEscaner(String filepath) throws FileNotFoundException {
        File f = new File(filepath);
        Scanner scanner = new Scanner(f);
        return scanner;
    }
}
