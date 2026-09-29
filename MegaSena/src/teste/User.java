package teste;

import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String name = scanner.nextLine();

        System.out.println("Ola, " + name);

    }

}
