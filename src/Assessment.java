import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

//        Create a class named Assessment inside of the src folder. Add the following static methods:
public class Assessment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //  TESTING SQUARE METHOD;
//        System.out.println("enter number 1");
//        int userInt1 = scan.nextInt();
//        System.out.println("square: " + square(userInt1));

        // TESTING SUM METHOD:
//        System.out.println("enter number 1");
//        int userInt1 = scan.nextInt();
//        System.out.println("enter number 2");
//        int userInt2 = scan.nextInt();
//        System.out.println("addition: " + sum(userInt1, userInt2));

        // TESTING AVERAGE METHOD:
        int [] numbersArray = {1, 2, 3};
        System.out.println("average of the array: " + average(numbersArray));

        User newUser1 = new User("user1","user1LastName", true);
        User newUser2 = new User("user2","user2LastName", false);
        User newUser3 = new User("user3","user3LastName", true);

        ArrayList<User> testList = new ArrayList<>();
        testList.add(newUser1);
        testList.add(newUser2);
        testList.add(newUser3);


        System.out.println("Original List:");
        for (User user: testList) {
            System.out.print(user.getFirstName() + " " + user.getLastName() + " is admin: " + user.isAdmin());
            System.out.println();
        }

        System.out.println("Capitalized Records List:");
        for (User user: capitalizeRecords(testList)) {
            System.out.print(user.getFirstName() + " " + user.getLastName() + " is admin: " + user.isAdmin());
            System.out.println();
        }



//
//


    }


    //    square: should accept and return a single integer number. The method should return the number times itself.
    public static int square(int number) {
        return number * number;
    }


    //      sum: should accept 2 numbers, either integers or doubles, and returns the result of adding the two numbers together.
    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    //     average: should accept an array of integers, and return the average of the passed numbers as a double.
    public static double average (int[] numbersArray){
        int sumOfIntegers = 0;
        for (int i = 0; i < numbersArray.length; i++)  {
            sumOfIntegers = sumOfIntegers + numbersArray[i];
        }
        double average;
        average = sumOfIntegers / numbersArray.length;
        return average;
    }


//    The method should both accept and return an ArrayList of User objects.
//    The returned list should have the same User objects in it, but each user's firstName and lastName properties should be properly capitalized. (i.e. the first letter of each property should be upper case)


    public static String capitalize(String text) {
        String c = (text != null) ? text.trim() : "";
        String[] words = c.split(" ");
        String result = "";
        for (String w : words) {
            result += (w.length() > 1 ? w.substring(0, 1).toUpperCase(Locale.US) + w.substring(1, w.length()).toLowerCase(Locale.US) : w) + " ";
        }
        return result.trim();
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> arrayListOfUsers) {
        ArrayList<User> capitalizedListOfUsers = new ArrayList<>();

        for (User user: arrayListOfUsers) {
            User newUser = new User(capitalize(user.getFirstName()),capitalize(user.getLastName()),user.isAdmin());
            capitalizedListOfUsers.add(newUser);
        }

        return capitalizedListOfUsers;

    }

}
