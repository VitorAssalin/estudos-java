import java.util.Scanner;

//validação

public class Main {
    public static void main(String[] args) {
    String passoword = "123456";
    System.out.println("Digite sua senha: ");

    Scanner scanner = new Scanner(System.in);
    String pass = scanner.nextLine();

    System.out.println(passoword.equals(pass));
    }
}