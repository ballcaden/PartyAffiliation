import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String partyAffiliation;

        System.out.println("Please enter your party affiliation(R, D, I, or Other): ");
        partyAffiliation = scan.nextLine();

        if (Objects.equals(partyAffiliation, "D")) {
            System.out.println("You get a democratic monkey!");
        } else if (Objects.equals(partyAffiliation, "R")) {
            System.out.println("You get a republican elephant!");
        } else if (Objects.equals(partyAffiliation, "I")) {
            System.out.println("You get an independent person");
        } else {
            System.out.println("You get a different donkey");
        }
    }
}