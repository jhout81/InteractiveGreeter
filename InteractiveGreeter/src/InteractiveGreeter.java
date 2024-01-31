import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Initializing Scanner to read from keyboard

        //Declaring string variables
        String yourName;
        String whereAreYouFrom;
        String favActivity;

        //Declaring int and double variables
        int age;
        double donation;

        System.out.print("What is your name? "); // Prints output asking the users name
        yourName = in.nextLine(); //String variable that stores the users name

        System.out.print("Where are you from? ");//Prints output asking user to input where they are from
        whereAreYouFrom = in.nextLine(); //String variable to stores where the user is from

        System.out.print("How old are you (years)? ");//Prints an output asking user how old they are
        age = in.nextInt(); //variable stores an integer of the persons age

        System.out.println("Hello " + yourName + " from " + whereAreYouFrom + "." + " You are " + age + " years old."); //Prints concatenation string
        in.nextLine();//Called again because the scanner thinks an empty line was entered after the in.nextInt() and skips.

        System.out.print("What's something you like to do? "); //Prints output asking what the user likes to do
        favActivity = in.nextLine(); //String variable that stores the users activity
        System.out.println("Have fun next time you " + favActivity + "!"); //Prints concatenation of strings and a variable

        System.out.print("How much would you like to donate today? "); //Prints output asking the user for donation
        donation = in.nextFloat(); //Float variable that stores the donation entered by user
        System.out.printf("You will donate $%.2f", donation); //Prints/Concatenates output telling the user how much they are donating
        System.out.println(" today. Yay!"); //Prints out last part of donation sentence since printf wouldn't allow

    }
}
