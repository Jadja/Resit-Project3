import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.sql.*;

/**
 * Created by Jimi Kruter on 20-6-2015.
 */

public class TwitterController {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://85.17.199.99:3306/boerme1q_twitter";
    static final String USERNAME = "boerme1q_infuser";
    static final String PASSWORD = "?n5AJT9ObID{";

    public Button btn;

    public ListView list1;
    public ListView list2;
    public ListView list3;
    public ListView list4;
    public ListView list5;
    public ListView list6;
    public ListView list7;
    public ListView list8;

    public Label text1;
    public Label text2;
    public Label text3;
    public Label text4;
    public Label text5;
    public Label text6;
    public Label text7;
    public Label text8;

    String Tweet1;String Tweet2;String Tweet3;String Tweet4;String Tweet5;String Tweet6;String Tweet7;String Tweet8;String Tweet9;String Tweet10;String Tweet11;String Tweet12;String Tweet13;String Tweet14;String Tweet15;String Tweet16;String Tweet17;String Tweet18;String Tweet19;String Tweet20;
    String SSTweet1;String SSTweet2;String SSTweet3;String SSTweet4;String SSTweet5;String SSTweet6;String SSTweet7;String SSTweet8;String SSTweet9;String SSTweet10;String SSTweet11;String SSTweet12;String SSTweet13;String SSTweet14;String SSTweet15;String SSTweet16;String SSTweet17;String SSTweet18;String SSTweet19;String SSTweet20;
    String MFTweet1;String MFTweet2;String MFTweet3;String MFTweet4;String MFTweet5;String MFTweet6;String MFTweet7;String MFTweet8;String MFTweet9;String MFTweet10;String MFTweet11;String MFTweet12;String MFTweet13;String MFTweet14;String MFTweet15;String MFTweet16;String MFTweet17;String MFTweet18;String MFTweet19;String MFTweet20;
    

    @FXML
    public void start(ActionEvent actionEvent) {
            btn.setText("Refresh");

        Connection conn = null;

        try {

            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");

            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            PreparedStatement getTweets = conn.prepareStatement("SELECT * FROM tweet");

            ResultSet rs = getTweets.executeQuery();

            int tweetnum = 1;
            System.out.println("Getting Tweets about SS Rotterdam...");
            while (rs.next() | tweetnum < 20)  {

                String text = rs.getString("description");

                if(tweetnum == 1)    {
                    Tweet1 = text;
                }
                else if(tweetnum == 2)    {
                    Tweet2 = text;
                }
                else if(tweetnum == 3)    {
                    Tweet3 = text;
                }
                else if(tweetnum == 4)    {
                    Tweet4 = text;
                }
                else if(tweetnum == 5)    {
                    Tweet5 = text;
                }
                else if(tweetnum == 6)    {
                    Tweet6 = text;
                }
                else if(tweetnum == 7)    {
                    Tweet7 = text;
                }
                else if(tweetnum == 8)    {
                    Tweet8 = text;
                }
                else if(tweetnum == 9)    {
                    Tweet9 = text;
                }
                else if(tweetnum == 10)    {
                    Tweet10 = text;
                }
                else if(tweetnum == 11)    {
                    Tweet11 = text;
                }
                else if(tweetnum == 12)    {
                    Tweet12 = text;
                }
                else if(tweetnum == 13)    {
                    Tweet13 = text;
                }
                else if(tweetnum == 14)    {
                    Tweet14 = text;
                }
                else if(tweetnum == 15)    {
                    Tweet15 = text;
                }
                else if(tweetnum == 16)    {
                    Tweet16 = text;
                }
                else if(tweetnum == 17)    {
                    Tweet17 = text;
                }
                else if(tweetnum == 18)    {
                    Tweet18 = text;
                }
                else if(tweetnum == 19)    {
                    Tweet19 = text;
                }
                else if(tweetnum == 20)    {
                    Tweet20 = text;
                }
                tweetnum++;
            }

            PreparedStatement getSSTweets = conn.prepareStatement("SELECT * FROM tweet WHERE username = 'ss Rotterdam'");

            ResultSet rs2 = getSSTweets.executeQuery();

            int SStweetnum = 1;
            System.out.println("Getting tweets by SS Rotterdam...");
            while (rs2.next() | SStweetnum < 20) {

                String text = rs2.getString("description");

                if(SStweetnum == 1)    {
                    SSTweet1 = text;
                }
                else if(SStweetnum == 2)    {
                    SSTweet2 = text;
                }
                else if(SStweetnum == 3)    {
                    SSTweet3 = text;
                }
                else if(SStweetnum == 4)    {
                    SSTweet4 = text;
                }
                else if(SStweetnum == 5)    {
                    SSTweet5 = text;
                }
                else if(SStweetnum == 6)    {
                    SSTweet6 = text;
                }
                else if(SStweetnum == 7)    {
                    SSTweet7 = text;
                }
                else if(SStweetnum == 8)    {
                    SSTweet8 = text;
                }
                else if(SStweetnum == 9)    {
                    SSTweet9 = text;
                }
                else if(SStweetnum == 10)    {
                    SSTweet10 = text;
                }
                else if(SStweetnum == 11)    {
                    SSTweet11 = text;
                }
                else if(SStweetnum == 12)    {
                    SSTweet12 = text;
                }
                else if(SStweetnum == 13)    {
                    SSTweet13 = text;
                }
                else if(SStweetnum == 14)    {
                    SSTweet14 = text;
                }
                else if(SStweetnum == 15)    {
                    SSTweet15 = text;
                }
                else if(SStweetnum == 16)    {
                    SSTweet16 = text;
                }
                else if(SStweetnum == 17)    {
                    SSTweet17 = text;
                }
                else if(SStweetnum == 18)    {
                    SSTweet18 = text;
                }
                else if(SStweetnum == 19)    {
                    SSTweet19 = text;
                }
                else if(SStweetnum == 20)    {
                    SSTweet20 = text;
                }
                SStweetnum++;
            }

            PreparedStatement getMFTweets = conn.prepareStatement("SELECT * FROM tweet WHERE username = 'ss Rotterdam'");

            ResultSet rs3 = getMFTweets.executeQuery();
            int MFtweetnum = 1;
            System.out.println("Getting tweets about SS Rotterdam with the most followers");
            while (rs3.next() | MFtweetnum < 20) {

                String text = rs3.getString("description");

                if(MFtweetnum == 1)    {
                    MFTweet1 = text;
                }
                else if(MFtweetnum == 2)    {
                    MFTweet2 = text;
                }
                else if(MFtweetnum == 3)    {
                    MFTweet3 = text;
                }
                else if(MFtweetnum == 4)    {
                    MFTweet4 = text;
                }
                else if(MFtweetnum == 5)    {
                    MFTweet5 = text;
                }
                else if(MFtweetnum == 6)    {
                    MFTweet6 = text;
                }
                else if(MFtweetnum == 7)    {
                    MFTweet7 = text;
                }
                else if(MFtweetnum == 8)    {
                    MFTweet8 = text;
                }
                else if(MFtweetnum == 9)    {
                    MFTweet9 = text;
                }
                else if(MFtweetnum == 10)    {
                    MFTweet10 = text;
                }
                else if(MFtweetnum == 11)    {
                    MFTweet11 = text;
                }
                else if(MFtweetnum == 12)    {
                    MFTweet12 = text;
                }
                else if(MFtweetnum == 13)    {
                    MFTweet13 = text;
                }
                else if(MFtweetnum == 14)    {
                    MFTweet14 = text;
                }
                else if(MFtweetnum == 15)    {
                    MFTweet15 = text;
                }
                else if(MFtweetnum == 16)    {
                    MFTweet16 = text;
                }
                else if(MFtweetnum == 17)    {
                    MFTweet17 = text;
                }
                else if(MFtweetnum == 18)    {
                    MFTweet18 = text;
                }
                else if(MFtweetnum == 19)    {
                    MFTweet19 = text;
                }
                else if(MFtweetnum == 20)    {
                    MFTweet20 = text;
                }
                MFtweetnum++;
            }


            conn.close();

        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ObservableList<String> items1 = FXCollections.observableArrayList(
                Tweet1, Tweet2, Tweet3, Tweet4, Tweet5, Tweet6, Tweet7, Tweet8, Tweet9, Tweet10, Tweet11, Tweet12, Tweet13, Tweet14, Tweet15, Tweet16, Tweet17, Tweet18, Tweet19, Tweet20
        );
        ObservableList<String> items2 = FXCollections.observableArrayList(
                SSTweet1, SSTweet2, SSTweet3, SSTweet4, SSTweet5, SSTweet6, SSTweet7, SSTweet8, SSTweet9, SSTweet10, SSTweet11, SSTweet12, SSTweet13, SSTweet14, SSTweet15, SSTweet16, SSTweet17, SSTweet18, SSTweet19, SSTweet20
        );
        ObservableList<String> items3 = FXCollections.observableArrayList(

        );
        ObservableList<String> items4 = FXCollections.observableArrayList(

        );
        ObservableList<String> items5 = FXCollections.observableArrayList(

        );
        ObservableList<String> items6 = FXCollections.observableArrayList(

        );
        ObservableList<String> items7 = FXCollections.observableArrayList(
                MFTweet1, MFTweet2, MFTweet3, MFTweet4, MFTweet5, MFTweet6, MFTweet7, MFTweet8, MFTweet9, MFTweet10, MFTweet11, MFTweet12, MFTweet13, MFTweet14, MFTweet15, MFTweet16, MFTweet17, MFTweet18, MFTweet19, MFTweet20
        );
        ObservableList<String> items8 = FXCollections.observableArrayList(

        );


            list1.setItems(items1);
            list2.setItems(items2);
            list3.setItems(items3);
            list4.setItems(items4);
            list5.setItems(items5);
            list6.setItems(items6);
            list7.setItems(items7);
            list8.setItems(items8);

            text1.setText("Last 20 tweets");
            text2.setText("Last 20 by SS ");
            text3.setText("");
            text4.setText("label");
            text5.setText("label");
            text6.setText("label");
            text7.setText("Tweets by most followed users");
            text8.setText("label");
    }
}
