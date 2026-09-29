public class Funcoes {

    public static void main(String[] args){
    calc(10, 5); //argumentos

    }

    static void calc(int x, int y){
        // static void -> declaracao padrão
        // sum -> Nome da função, geralmente usamos verbos para definir o que a função vai executar
        //() -> Parenteses sao usados para definir oque chegará na funcao (parametros)
        //(tipo nomeDaVariavel)
        //{} -> Bloco de código que será executado

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }

}
