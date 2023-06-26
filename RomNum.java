import java.util.Scanner;

public class RomNum {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        // Asks user for a roman numeral then converts to uppercase
        System.out.println("Enter a roman numeral between 1 and 10:");
        String romans = keyboard.nextLine();
        String romansUp = romans.toUpperCase();

        // Evaluates user input to determine the Roman Numeral
        switch (romansUp) 
        {
            case "I":
                System.out.println("You entered " + 1);
                break;
            case "II":
                System.out.println("You entered " + 2);
                break;
            case "III":
                System.out.println("You entered " + 3);
                break;
            case "IV":
                System.out.println("You entered " + 4);
                break;
            case "V":
                System.out.println("You entered " + 5);
                break;
            case "VI":
                System.out.println("You entered " + 6);
                break;
            case "VII":
                System.out.println("You entered " + 7);
                break;
            case "VIII":
                System.out.println("You entered " + 8);
                break;
            case "IX":
                System.out.println("You entered " + 9);
                break;
            case "X":
                System.out.println("You entered " + 10);
                break;
            default:
                System.out.println("Invalid choice");
        }   
        keyboard.close();
    }
}
