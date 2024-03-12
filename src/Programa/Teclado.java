package Programa;
import java.util.Scanner;

public class Teclado {
    Scanner lectura;

    public Teclado(){

        lectura = new Scanner(System.in);
    }

    public String getString(String s) {
        String in = "";

        System.out.println("Por favor, ingrese caracteres ( o ) solamente.");
        in = lectura.nextLine();

        while (in.equals("")) {
            System.out.println("Por favor, ingrese caracteres ( o ) solamente.");
            in = lectura.nextLine();
        }
        if (in.matches("[a-z]")){
            System.out.println("Por favor, ingrese caracteres ( o ) solamente.");

        }
        in = lectura.nextLine();

        return  in;
    }
}