package Getters_E_Setters;

public class User {

    //PROPRIEDADES (Private)
    private String firstName;
    private String lastName;

    // SETTER = Métodos encarregados de receber e atualizar o valor de um atributo privado, podendo aplicar validações.
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }
    public void setLastName(String lastName){
        this.lastName = lastName.toLowerCase();
    }

    // GETTER = Métodos encarregados de ler e retornar o valor de um atributo privado.
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
