import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello woof!");


        huisje();
        noordStraat();
        noorderPark();
        oostHond();
        oostGras();
        zuidHuizen();
        zuidBoom();
        westHuizen();

// todo hier wil ik een array toevoegen met een ascii plattegrondje (als dat kan) met huisjes, boompjes, beestjes
//      indien mogelijk, poppetje en hondje (in "ascii vorm") die een rondje maken,
//      uitzonderingen voor meerdere malen hetzelfde doen









    }

    public static void huisje() {
        System.out.println("You are at home, Dumroo needs to go for a walk. Please choose a direction, (N)orth, (E)ast, (S)outh, (W)est");
        String richting = scanner.nextLine();
        if (richting.equals("N") || richting.equals("n")) {
            System.out.println("Dumroo pulls the leash to the North."); // hier naar noordStraat
            noordStraat();
        } else if (richting.equals("W")) {
            System.out.println("You go west to Westhuizen."); // hier naar westHuizen
            westHuizen();
        } else if (richting.equals("Z")) {
            System.out.println("You go South to Zuidhuizen."); // hier naar zuidHuizen
            zuidHuizen();
        } else {
            System.out.println("You go East."); // hier naar oostHond
            oostHond();
        }
    }


    public static void noordStraat() {
        System.out.println("Welcome to Northstreet. A quaint street with some houses. From here you can go back South, or go East. There is a canal to the west.");
        String denorthstr = scanner.nextLine();
        if (denorthstr.equals("E")) {
            System.out.println("You go to Noorderpark."); // hier naar noorderPark
            noorderPark();
        } else {
            System.out.println("You go back home."); // hier naar huisje
            huisje();
        }

    }

    public static void noorderPark() {
        System.out.println("Welcome to the Noorderpark, there is a tree here. Dumroo pees against the tree, he is happy.");
        System.out.println("From here you can go South or you can go back West to Northstreet.");
        String northPark = scanner.nextLine();
        if (northPark.equals("S")) {
            System.out.println("You go South");
            oostHond();
        } else {
            System.out.println("You go back to Northstreet."); // hier terug naar northstreet
            noordStraat();
        }
    }

    public static void oostHond() {
        System.out.println("Welcome to Dogstreet, there is another dog here. Dumroo barks at the dog, the dog barks back.");
        System.out.println("You can keep walking South, go West and home, or back North to the pee-tree.");
        String eastDog = scanner.nextLine();
        if (eastDog.equals("S")) {
            System.out.println("You go further South. You can hear some barking behind you.");
            oostGras();
        } else if (eastDog.equals("N")) {
            System.out.println("You go back North, to the pee-tree."); // hier terug naar de piesboom
            noorderPark();
        } else if (eastDog.equals("W")) {
            System.out.println("You go back home, Dumroo shits on the carpet."); // hier terug naar Home
            huisje();
        }
    }

    public static void oostGras() {
        System.out.println("Welcome to Easterpark, there is a field of grass here. Dumroo poops on the grass, you pick it up and throw it away. Dumroo is ready to go home.");
        System.out.println("You can go North or West.");
        String poepGras = scanner.nextLine();
        if (poepGras.equals("N")) {
            System.out.println("You walk back to the street with the dog."); // hier terug naar oosthond
            oostHond();
        } else if (poepGras.equals("W")) {
            System.out.println("You go West to Zuidhuizen."); // hier terug naar Zuidhuizen
            zuidHuizen();
        }
    }

    public static void zuidHuizen() {
        System.out.println("Welcome to Zuidhuizen, there is a street here with some houses.");
        System.out.println("You can go straight (West), home (North) or back to the grass field.");
        String zuidHuis = scanner.nextLine();
        if (zuidHuis.equals("N")) {
            System.out.println("You go home."); // hier terug naar huis
            huisje();
        } else if (zuidHuis.equals("W")) {
            System.out.println("You walk West."); //
            zuidBoom();
        } else {
            System.out.println("You go back to the grass field."); // hier terug naar grasveld
            oostGras();
        }
    }

    public static void zuidBoom() {
        System.out.println("You are now in Zuidboom, there is a tree. Dumroo pees against the tree.");
        System.out.println("From here you can go North or East.");
        String zuidBomen = scanner.nextLine();
        if (zuidBomen.equals("N")) {
            System.out.println("You walk North to Westhuizen."); // hier terug naar Westhuizen
            westHuizen();
        } else {
            System.out.println("You walk back to Zuidhuizen."); // hier terug naar Zuidhuizen
            zuidHuizen();
        }
    }

    public static void westHuizen() {
        System.out.println("You are in Westhuizen, there's a few houses on a quaint little street that bends to the East, to the North you see the canal.");
        System.out.println("Do you go East (home) or to Zuidboom in the South?");
        String westHuis = scanner.nextLine();
        if (westHuis.equals("E")) {
            System.out.println("You go home."); // hier terug naar huis
            huisje();
        } else {
            System.out.println("You go North to Zuidboom.");
            zuidBoom();
        }

    }
}