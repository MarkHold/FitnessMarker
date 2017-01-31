package View;

import Model.WeightGain;
import Model.WeightLoss;

import java.util.Scanner;

/**
 * Created by markuslyconhold on 07/01/17.
 *
 * This is the Get class that interacts with the user. It asks the user about the information and then stories them
 * in variables, and then depending on the users response, it gives the user the total calorie count depending on the users
 * dicision.
 */
public class InfoGather {


    public static String getName(){

        System.out.print("Please Enter your name");
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine();
        return w;
    }
    public static int getWeight(){

        System.out.print("Please Insert your weight");
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        return w;
    }



    public static int getHeight(){

        System.out.print("Please Insert your height");
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        return h;
    }

    public static int getAge(){

        System.out.print("Please Insert your age");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return a;
    }

    public static int getActivity(){

        System.out.print("Please Insert your Activity level from 1 to 4 where 1 is barely active during the day and 4 is working a " +
                "physical demanding job (like on a building sight or fireman): ");
        Scanner scan = new Scanner(System.in);
        int al = scan.nextInt();
        return al;
    }

    public static void Decision() {

        System.out.println("If you want to lose weight hit 1, if not hit 2");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        WeightLoss loss = new WeightLoss();

        WeightGain gain = new WeightGain();

        if (x == 1) {

            System.out.println("Your total calories are: " + loss.totalCalories(getWeight(), getHeight(), getAge()));
        } else if (x == 2) {
            System.out.println("Your total calories are: " + gain.totalCalories(getWeight(), getHeight(), getAge()));

        }
    }
}
