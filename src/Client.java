/**
 * Created by stefa on 03/03/2018.
 */
import java.*;
public class Client {
    private String firstName;
    private String lastName;
    private String clientAdress;
    private int clientAge;
    private String clientCNP;

    public Client(String fName,String lName,String Adress,int Age,String CNP){
        this.firstName = fName;
        this.lastName = lName;
        this.clientAdress = Adress;
        this.clientAge = Age;
        this.clientCNP = CNP;
    }

    public void getInfo(){
        System.out.println("Nume client: " + firstName +
                        "\n Prenume client: " + lastName +
                        "\n Adresa: " + clientAdress +
                        "\n Varsta: " + clientAge +
                        "\n CNP: " + clientCNP);
    }
}
