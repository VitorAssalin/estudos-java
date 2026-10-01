package Contrutor;


public class App {

    public static void main(String[] args){

        User[] users = new User[]{
                new User("Vitor", "Assalin"),
                new User("Teste", "Construtor"),
                new User("Teste2", "Contrutor")

        };
        // [x][x][x][x]

        System.out.println(users[0].getFirstName());
        System.out.println(users[2].getLastName());

        }

    }

