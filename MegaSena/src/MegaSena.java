import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {

        //tipo variavel = new tipo();
        Random generated = new Random();

        //while(true) -> looping infinito

        //while(i < 10) -> looping com saida
 //       int i = 0;
 //       while(i < 6){
 //           int number = generated.nextInt(60);
 //           System.out.println(number);
 //           i++;
 //       }
        //for(true)
        //for(;;){}

        //for -> com saida
        for(int i =0; i < 6; i++){
            int number = generated.nextInt(60);
            System.out.println(number);
        }
    }
}