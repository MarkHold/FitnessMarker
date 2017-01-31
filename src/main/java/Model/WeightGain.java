package Model;

/**
 * Created by markuslyconhold on 03/01/17.
 *
 * This class takes in user information and calculates the daily intake for a person
 * that is looking to gain Weight. It is devided into two sections, the first section takes in the user-info and
 * the second section
 */

public class WeightGain {

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
        public void setWeight(int w) {
            this.weight = w;
        }

        public void setHeight(int h) {

            this.height = h;
        }

        public void setAge(int a) {

            this.age = a;
        }

        public void setActivityLevel(int al) {
            this.activityLvl = al;
        }


    /*
    the result calculating section.
     */

        public double totalCalories(int weight, int height, int age) {

            double kcal = (10 * weight) + (6.25 * height) - (5 * age) + 505;

            return kcal;
        }

    }