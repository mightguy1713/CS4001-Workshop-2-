import java.util.Scanner;
/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age group (child/adult/senior):");
        String age = scan.nextLine();
        System.out.println("Enter language of movie (Nepali/Hindi/English):");
        String language = scan.nextLine();
        System.out.println("Student with valid ID (Yes/No):");
        String isValid = scan.nextLine();
        System.out.println("Is is a festival day (Yes/No):");
        String festival = scan.nextLine();
        double price = 0;
        
        switch(age.toLowerCase()) {
            case "child" : price= 150 ;break;
            case "adult" : price= 250 ;break;
            case "senior": price= 350 ;break;
            default : System.out.println("Invalid age group");
            return;
        }
        switch(language.toLowerCase()) {
            case "nepali" : price += 0 ;break;
            case "hindi" : price += 50 ;break;
            case "english": price += 100 ;break;
            default : System.out.println("Invalid language");
            return;
        }
        //For discout.
        if (isValid.equals("Yes")){
            price *= 0.80;
        }
        //For festivals.
        if (festival.equals("Yes")){
            price *= 0.85;
        }
        System.out.println("Final ticket price :" +price);
     }
}