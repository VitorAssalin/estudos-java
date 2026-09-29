package Getters_E_Setters;

public class App {

    public static void main (String[] args){
        User userA = new User();
        userA.setFirstName("vitor assalin,");
        userA.setLastName("TESTANDO...");

        System.out.println(userA.getFirstName() + " " + userA.getLastName());

        User userB = new User();
        userB.setFirstName("aprendendo getters e setters,");
        userB.setLastName("VENDO SE AS LETRAS FICARÃO MINUSCULAS!!!");

        System.out.println(userB.getFirstName() + " " + userB.getLastName());
    }
}
