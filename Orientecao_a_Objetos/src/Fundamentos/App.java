package Fundamentos;

public class App {

    public static void main(String[] args) {

        User userA = new User(); //Declaração de objeto

        userA.firtName = "Vitor";
        userA.lastName = "Assalin";

        User userB = new User();//Declarando outro objeto

        userB.firtName = "Orientação";
        userB.lastName = "Objetos";

        System.out.println(userA.firtName + " " + userA.lastName);
        System.out.println(userB.firtName + " " + userB.lastName);

    }
}