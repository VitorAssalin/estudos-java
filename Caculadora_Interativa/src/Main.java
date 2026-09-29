import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a operação (somar, subtrair, dividir, mulltiplicar): ");
        String conta = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = scanner.nextInt();

        if (conta.equals("somar")) {
            System.out.print(x + " + " + y + " = ");
            sum(x, y);
        } else if (conta.equals("subtrair")) {
            minus(x, y);
        } else if (conta.equals("dividir")) {
            div(x, y);
        } else if (conta.equals("mulltiplicar")) {
            multi(x, y);
        } else {
            System.out.println("Nenhuma instrução definida");
        }
    }
    static void sum(int x, int y){
        System.out.println(x + y);

    }
    static void minus(int x, int y){
        System.out.println(x - y);

    }
    static void div(int x, int y){
        System.out.println(x / y);

    }
    static void multi(int x, int y){
        System.out.println(x * y);

    }
}
