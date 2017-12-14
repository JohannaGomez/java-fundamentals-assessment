import java.util.Scanner;

public class User extends Person {
//    The User class should have a protected property named admin that is a boolean.
//    Create a constructor for the User class that accepts the same parameters as the Person constructor plus a third parameter,
//    a boolean for whether or not the user is an administrator. Use this to set the admin property.
//    Write a method on the User class named isAdmin() that functions as a getter for the admin property.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



    }

    Scanner scan = new Scanner(System.in);
    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin() {
        if (admin){
            return true;
        } else {
            return false;
        }

    }
}


//    //HAS TO BE CALLED toString()
//    @Override
//    public String toString() {
//        return this.firstName + " " + this.lastName;
//    }

}