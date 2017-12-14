import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter first name: ");
        String firstName = person.getFirstName();

        System.out.println("Enter last name: ");
        String lastName = person.getLastName();

    }


    //    This class should have two protected string properties: firstName and lastName.
    protected String firstName, lastName;
    Scanner scan = new Scanner(System.in);

    //    Add a constructor method that takes in two strings that will be used to set the firstName and lastName properties.
    //    If the firstName or lastName (or both) argument is null, the constructor should throw an IllegalArgumentException
    //   with a descriptive error message.

    public Person() {
    }

    public Person(String firstName, String lastName) {
        if (firstName.equalsIgnoreCase(null) || lastName.equalsIgnoreCase(null)) {
            throw new IllegalArgumentException("Strings are not valid!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }




    //    Write a getter and setter for both the firstName and lastName properties.

    public String getFirstName() {
        String firstName = scan.next();
        return firstName;
    }

    public String getLastName() {
        String lastName = scan.next();
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
