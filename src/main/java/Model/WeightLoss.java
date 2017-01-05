package Model;

/**
 * Created by markuslyconhold on 03/01/17.
 *
 * This class takes in user information and calculates the daily intake for a person
 * that is looking to lose Weight. It is devided into two sections, the first section takes in the user-info and
 * the second section
 */
public class WeightLoss {

    private int weight;
    private int height;
    private int age;
    private int activityLvl;

    private int bmr;



    /*
    the info gathering section.
     */
    public void setWeight(int w){

        if(w <= 0){
            System.err.println("Invalid weight, please enter weight again.");
        }
        this.weight = w;
    }
    public void setHeight(int h){
        if(h <= 0){
            System.err.println("Invalid height, please enter height again.");
        }
        this.height = h;
    }
    public void setAge(int a){
        if(a <= 0){
            System.err.println("Invalid age, please enter height again.");
        }
        this.age = a;
    }
    public void setActivityLevel(int al){
        if(al <= 0){
            System.err.println("Invalid activity level, please enter an activity level between 1 - 4.");
        }
        this.activityLvl = al;
    }


    /*
    the result calculating section.
     */

    public double totalCalories(int weight,int height,int age,int activityLvl){

        double kcal = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        return kcal;
    }

    public int countProtein(int weight) //this method calculates the amount of protein per day
    {
        int protein = weight*10;
        return protein;

    }

    public double countCarbs(double kcal)//this method calculates the amount of carbs per day
    {

        double carbs = (kcal*0.50)/4;

        return carbs;

    }
    public double countFats(double kcal)//this method calculates the amount of fats per day
    {
        double fats = (kcal*0.20)/9;
        return fats;
    }

}


