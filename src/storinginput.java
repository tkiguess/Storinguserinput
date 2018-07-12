import java.util.Scanner;

public class storinginput {

    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);


        System.out.println("what is your first innitial of your name? ");
        String firstInitial = keyboard.nextLine();

        System.out.println("what is your last name? ");
        String lastName = keyboard.nextLine();

        System.out.println("what is your house number? ");
        String houseNumber = keyboard.nextLine();

        System.out.println("what is your street name? ");
        String streetName = keyboard.nextLine();

        System.out.println("what is your street type? ");
        String streetType = keyboard.nextLine();

        System.out.println("stop asking questions and answer. \n");

        System.out.println("what is your city? ");
        String city = keyboard.nextLine();


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);



    }


}
