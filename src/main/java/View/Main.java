package View;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

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
        InfoGather info = new InfoGather();

        Statement state2 = con.createStatement();

        //the first table
        state2.execute("CREATE TABLE IF NOT EXISTS redditTablex(theName varchar(30), weight varchar(10))");

        String tableStuff = "INSERT INTO redditTablex(theName, weight) VALUES (?, ?)";


        PreparedStatement prep = con.prepareStatement(tableStuff);
        prep.setString(1, info.getName());
        prep.setString(2, String.valueOf(info.getWeight()));

        prep.execute();

        //queries();

    }

}