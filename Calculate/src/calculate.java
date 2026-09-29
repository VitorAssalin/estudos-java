//Para executar no cmd no meu caso-> cd C:\Users\Usuario\Documents\BKP-PC\Java_Estudos\Calculate\src
//C:\Users\Usuario\Documents\BKP-PC\Java_Estudos\Calculate\src>javac Calculate.java -> compila
//C:\Users\Usuario\Documents\BKP-PC\Java_Estudos\Calculate\src>java calculate (ação) + x y

public class calculate {

    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
            sum(x, y);
        }else if (args[0].equals("subtrair")) {
            minus(x, y);
        }else if (args[0].equals("dividir")){
            div(x, y);
        }else if (args[0].equals("mulltiplicar")){
            multi(x, y);
        } else {
            System.out.println("Nenhuma instrucao definida");
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
