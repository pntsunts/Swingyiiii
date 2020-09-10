package Swingy;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        System.out.println("To Play on GUI press 1, to Play on Console press 2");

        Scanner scan = new Scanner(System.in);

        try {
            int option = scan.nextInt();

            if (option == 1)
                System.out.println("Running on GUI");
            else if (option == 2)
                System.out.println("Running on console");
            else {
                System.out.println("Invalid Option please choose 1 option");
            }
        }
        catch (Exception e) {
         System.out.println("Invalid option!!!!!");
        }
    }
}
