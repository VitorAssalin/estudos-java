package Arrays_OOP;

public class App {

    public static void main(String[] args){

        //Array - tamanho fixo
        User[] users = new User[10];
        // [x][x][x][x]

        for(int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;

        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());

    }

}
