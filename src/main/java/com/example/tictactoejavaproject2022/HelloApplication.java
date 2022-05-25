package com.example.tictactoejavaproject2022;

import org.kordamp.bootstrapfx.BootstrapFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class HelloApplication extends Application {

    private String X = "X";
    private String O = "O";
    private String input;
    private Label label;
    private String clickedFirst = "X";
    public Leaderboard haveLeaderboard;
    private String resetGame;
    private boolean makeReset;
    private Label resetLabel;
    private Label scoreLabel;
    private Label resultsLabel;
    private Label resultsLabel2;
    private GridPane gridPane;
    private int countX=0;
    private int countO=0;



   String [][] hello1= new String[3][3];
   //Button array
   Button [][] buttonArray=new Button[3][3];



    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Tic-Tac-Toe");
        //For Game
        HBox hBox = new HBox();
        VBox vbox = new VBox();
        Scene scene = new Scene(hBox,500,500);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        //For the Button
        VBox vbox2 = new VBox();
        Scene scene2 = new Scene(vbox2, 500, 500);

        //Others
         gridPane = new GridPane();
        //BorderPane borderPane = new BorderPane();
        label = new Label();
        scoreLabel = new Label();
        resultsLabel = new Label(""+countX);
        resultsLabel2=new Label("" + countO);
        haveLeaderboard=new Leaderboard();



        //Children
        hBox.getChildren().add(vbox);
        hBox.setSpacing(200);
        vbox.getChildren().add(gridPane);
        vbox.getChildren().add(label);
        vbox2.getChildren().add(scoreLabel);
        vbox2.getChildren().add(resultsLabel);
        vbox2.getChildren().add(resultsLabel2);



        //Score Scenes
        //game --->leaderboard
        Button buttonLeaderboard = new Button("Leaderboard");
        buttonLeaderboard.setOnAction(e -> stage.setScene(scene2));
        vbox.getChildren().addAll(buttonLeaderboard);

        //leaderboard--->game
        Button button2 = new Button("Back");
        button2.setOnAction(e -> stage.setScene(scene));
        vbox2.getChildren().addAll(button2);
        scoreLabel.setText("Score" );
        resultsLabel.setText("PlayerX:");
        resultsLabel2.setText("PlayerO:");



        //Box Position
        vbox.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);


        //Button




        //Title
        label.setText("Tic-Tac-Toe");
        label.setAlignment(Pos.TOP_CENTER);
        label.setMinWidth(100);
        label.setMinHeight(50);


        // Label Style
        Font font = Font.font("Verdana", FontWeight.BOLD, 30);
        label.setTextFill(Color.rgb(107, 205, 235));
        label.setFont(font);










        //Double Array Buttons
        for(int i=0;i<3;i++){

            for(int a=0;a<3;a++){

                buttonArray[i][a]=createButton();

            }

        }



        //Button Positions

        for(int postionR=0;postionR <3;postionR++){
            for(int positionC=0;positionC<3;positionC++){

                gridPane.add(buttonArray[postionR][positionC],positionC,postionR,1,1);
            }

        }




//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Reset Button
        Button buttonReset = new Button("New Game");
        buttonReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gridPane.getChildren().clear();

                Button clearedButton = new Button(" ");
                clearedButton.setMinHeight(100);
                clearedButton.setMinWidth(100);

                label.setText("Tic-Tac-Toe");

                for(int i=0;i<3;i++){

                    for(int a=0;a<3;a++){

                        buttonArray[i][a]=createButton();

                    }

                }



                //Button Positions

                for(int postionR=0;postionR <3;postionR++){
                    for(int positionC=0;positionC<3;positionC++){
                        gridPane.add(buttonArray[postionR][positionC],positionC,postionR,1,1);


                    }
                }
            }
        });
        vbox.getChildren().add(buttonReset);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Style

        //Leaderboard Style
      buttonLeaderboard.setStyle("-fx-background-color: darkmagenta; -fx-text-fill: white;-fx-font: normal bold 20px 'georgia'");
        button2.setStyle("-fx-background-color: darkmagenta; -fx-text-fill: white;-fx-font: normal bold 10px 'georgia'");

        //reset Button Style
        buttonReset.setStyle("-fx-background-color: cornflowerblue; -fx-text-fill: white;-fx-font: normal bold 20px 'georgia'");


        //Box style
        hBox.setStyle("-fx-background-image: url(https://wallpaperaccess.com/full/2641065.gif);-fx-background-size: cover");
        vbox2.setStyle("-fx-background-image: url(https://www.icegif.com/wp-content/uploads/nyan-cat-icegif-1.gif);-fx-background-size: cover");


        //Label Styles(Title + LeaderBoard)
        label.setStyle("-fx-text: b");
       scoreLabel.setStyle("-fx-text-fill: white;-fx-font: normal bold 50px 'georgia'");
        resultsLabel.setStyle("-fx-text-fill: hotpink;-fx-font: normal bold 30px 'georgia'");
        resultsLabel2.setStyle("-fx-text-fill: hotpink;-fx-font: normal bold 30px 'georgia'");

        //Button Style
        gridPane.setStyle("-fx-background-image: url(https://d11a6trkgmumsb.cloudfront.net/original/3X/e/c/ecfbdc40a262cfcf8862fefc5935d276f3fb3280.gif);-fx-background-size: cover");















        stage.setScene(scene);

                stage.show();
            }

            //Create Button Method
            public Button createButton() {
                Button button = new Button();


                //Size of button X
                button.setMinWidth(100);
                button.setMinHeight(100);



                //Mouse Click
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {


                        button.setText("X");
                        //get X
                        if (clickedFirst.equals("X")) {
                            button.setTextFill(Color.rgb(255, 0, 85));
                            button.setText("X");
                            button.setDisable(true);
                            label.setText("Player X's Turn ");
                            clickedFirst = "O";

                            //get O
                        } else if (clickedFirst.equals("O")) {
                            button.setTextFill(Color.rgb(51, 51, 255));
                            button.setText("O");
                            button.setDisable(true);
                            label.setText("Player O's Turn");
                            clickedFirst = "X";


                            //To win
                        }
                        for (int i = 0; i < 3; i++) {
                            for (int o = 0; o < 3; o++) {

                                hello1[i][o] = buttonArray[i][o].getText();


                            }




                        }
                        //First row
                        if (hello1[0][0].equals("X") && hello1[0][1].equals("X") && hello1[0][2].equals("X") ||
                                //Second Row
                                hello1[1][0].equals("X") && hello1[1][1].equals("X") && hello1[1][2].equals("X") ||
                                //Third Row
                                hello1[2][0].equals("X") && hello1[2][1].equals("X") && hello1[2][2].equals("X") ||

                                //Columns
                                //1st Columns
                                hello1[0][0].equals("X") && hello1[1][0].equals("X") && hello1[2][0].equals("X") ||

                                //2nd Columns
                                hello1[0][1].equals("X") && hello1[1][1].equals("X") && hello1[2][1].equals("X") ||

                                //3rd Columns
                                hello1[0][2].equals("X") && hello1[1][2].equals("X") && hello1[2][2].equals("X") ||

                                //Diagonal
                                hello1[0][0].equals("X") && hello1[1][1].equals("X") && hello1[2][2].equals("X") ||
                                hello1[0][2].equals("X") && hello1[1][1].equals("X") && hello1[2][0].equals("X")) {

                            resultsLabel.setText("PlayerX:" + haveLeaderboard.getIncrementedScoreXPlayer1());
                            haveLeaderboard.setWinner("X");
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Game information");
                            alert.setHeaderText("Game Status:");
                            alert.setContentText(haveLeaderboard.getWinner() + " " + "Won!");
                            alert.show();

                        }

                        //O winner
                        if (hello1[0][0].equals("O") && hello1[0][1].equals("O") && hello1[0][2].equals("O") ||
                                //Second Row
                                hello1[1][0].equals("O") && hello1[1][1].equals("O") && hello1[1][2].equals("O") ||
                                //Third Row
                                hello1[2][0].equals("O") && hello1[2][1].equals("O") && hello1[2][2].equals("O") ||

                                //Columns
                                //1st Columns
                                hello1[0][0].equals("O") && hello1[1][0].equals("O") && hello1[2][0].equals("O") ||

                                //2nd Columns
                                hello1[0][1].equals("O") && hello1[1][1].equals("O") && hello1[2][1].equals("O") ||

                                //3rd Columns
                                hello1[0][2].equals("O") && hello1[1][2].equals("O") && hello1[2][2].equals("O") ||

                                //Diagonal
                                hello1[0][0].equals("O") && hello1[1][1].equals("O") && hello1[2][2].equals("O") ||
                                hello1[0][2].equals("O") && hello1[1][1].equals("O") && hello1[2][0].equals("O")) {

                            resultsLabel2.setText("PlayerO:" +  haveLeaderboard.getIncrementedScoreOPlayer2());
                            haveLeaderboard.setWinner("O");
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Game information");
                            alert.setHeaderText("Game Status:");

                            alert.setContentText(haveLeaderboard.getWinner() +" " + "Won!");

                            alert.show();

                            //Leaderboard




                        }

                        }
                });

                return button;
            }














    public static void main(String[] args) {
        launch();
    }
}
