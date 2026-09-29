import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String x = "    Ola mundo, esse é o novo mundo";

        //Conta os caracteres
        System.out.println(x.length());

        //Contatenação
        System.out.println(x + " concatenada");

        //Verifica se possue
        System.out.println(x.contains("novo"));

        //Descobre em qual incide começa
        System.out.println(x.indexOf("mundo"));

        //Descobre quando começa0  indice da  ultimo senteça
        System.out.println(x.lastIndexOf("mundo"));

        //Manipular a caixa alta e a caixa baixa
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());

        //Remove espaços desnecessarios
        System.out.println(x.trim());

        //Busca a frase/palavra a partir do caracter
        System.out.println(x.substring(9));

        //Comparação
        System.out.println(x.equals("ola"));
    }
}