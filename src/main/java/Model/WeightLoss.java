package Model;

/**
 * Created by markuslyconhold on 03/01/17.
 *
 * This class takes in user information and calculates the daily intake for a person
 * that is looking to lose Weight. It is devided into two sections, the first section takes in the user-info and
 * the second section
 */
public class WeightLoss {

    private String theName;
    private int weight;
    private int height;
    private int age;
    private int activityLvl;


    /*
    the info gathering section.
     */

    public void setName(String n) {
        this.theName = n;
    }
    public void setWeight(int w){

        this.weight = w;
    }
    public void setHeight(int h){

        this.height = h;
    }
    public void setAge(int a){

        this.age = a;
    }
    public void setActivityLevel(int al){
        this.activityLvl = al;
    }


    /*
    the result calculating section.
     */

    public double totalCalories(int weight, int height, int age){

        double kcal = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        return kcal;
    }

    public double countProtein(int weight) //this method calculates the amount of protein per day
    {
        double protein = weight*1.15;
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


