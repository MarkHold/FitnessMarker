package View;

import Model.InfoGather;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by markuslyconhold on 02/01/17.
 */
public class Main {

    private static boolean hasData = false;

    private static Connection con;


    public static void main(String[]args) throws ClassNotFoundException, SQLException, ParseException, IOException {

        InfoGather info = new InfoGather();



        if(con == null){
            startConnection();
        }


    }

    public static void startConnection() throws ClassNotFoundException, SQLException, IOException, ParseException {

        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:theDataBase.db");
        Initialise();
    }


    //in this method we import the data from the file and parse it
    public static void Initialise() throws SQLException, IOException, ParseException {

        int x;
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(true) {
            InfoGather info = new InfoGather();

            Statement state2 = con.createStatement();

            //the first table
            state2.execute("CREATE TABLE IF NOT EXISTS tableOne(theName varchar(30), weight varchar(10), height varchar(10), age varchar(10))");

            state2.execute("CREATE TABLE IF NOT EXISTS tableTwo(theName varchar(30), theKalories varchar(10))");

            String tableStuffOne = "INSERT INTO tableOne(theName, weight, height, age) VALUES (?, ?, ?, ?)";

            String tableStuffTwo = "INSERT INTO tableOne(theName, Kalories) VALUES (?, ?)";


            PreparedStatement prep = con.prepareStatement(tableStuffOne);
            prep.setString(1, info.getName());
            prep.setString(2, String.valueOf(info.getWeight()));
            prep.setString(3, String.valueOf(info.getHeight()));
            prep.setString(4, String.valueOf(info.getAge()));

            prep.execute();


            PreparedStatement prep2 = con.prepareStatement(tableStuffTwo);
            prep2.setString(1, info.getName());
            prep2.setString(2, String.valueOf(info.getWeight()));

            prep2.execute();


            System.out.println("If you want to enter more information, please press 1, if you are done, press 2.");
            x = scan.nextInt();
            if(x == 2){
                run = false;
                break;
            }
        }


        //queries();

    }

}