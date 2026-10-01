package ArrayList;

public class User {
    //Propriedades de campo
    private String firstName;
    private String lastName;

    //Construtor : metodo especial utilizado para inicializar objetos de uma classe,
    //sendo executado automaticamente quando uma nova instância é criada pelo operador
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toLowerCase();
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
