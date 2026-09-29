package Metodos_E_Propriedades;

public class App {

    public static void main(String args[]){
        User userA = new User();
        userA.firstName = "Vitor";
        userA.lastName = "Assalin";
        userA.setLogged(true);

        String fullName = userA.getFullName();

        System.out.println(fullName);
    }

}
