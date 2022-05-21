package com.example.tictactoejavaproject2022;


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
    private GridPane gridPane;

   String [][] hello1= new String[3][3];
   //Button array
   Button [][] buttonArray=new Button[3][3];
   List<Button> listOfButtons=new ArrayList<>();



    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Tic-Tac-Toe");
        //For Game
        HBox hBox = new HBox();
        VBox vbox = new VBox();
        Scene scene = new Scene(hBox);


        //For the Button
        VBox vbox2 = new VBox();
        Scene scene2 = new Scene(vbox2, 500, 500);

        //Others
         gridPane = new GridPane();
        //BorderPane borderPane = new BorderPane();
        label = new Label();
        scoreLabel = new Label();
        resultsLabel = new Label();


        //Children
        hBox.getChildren().add(vbox);
        hBox.setSpacing(200);
        vbox.getChildren().add(gridPane);
        vbox.getChildren().add(label);
        vbox2.getChildren().add(scoreLabel);



        //Score Scenes
        //game --->leaderboard
        Button buttonLeaderboard = new Button("Leaderboard");
        buttonLeaderboard.setOnAction(e -> stage.setScene(scene2));
        vbox.getChildren().addAll(buttonLeaderboard);

        //leaderboard--->game
        Button button2 = new Button("Back");
        button2.setOnAction(e -> stage.setScene(scene));
        vbox2.getChildren().addAll(button2);
        scoreLabel.setText("Score" + "\n" + "Player X :" + "\n" + "Player O :");
        //scoreLabel.setMinWidth(50);
        //scoreLabel.setMinHeight(50);


        //"Window" Position
        vbox.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);
        ;

        //Title
        label.setText("TicTacToe");
        label.setAlignment(Pos.TOP_CENTER);
        label.setMinWidth(100);
        label.setMinHeight(50);


        // Label Style
        Font font = Font.font("Verdana", FontWeight.BOLD, 30);
        label.setTextFill(Color.rgb(107, 205, 235));
        label.setFont(font);



        /* --------------------------------------------------------
        haveLeaderboard.getPlayer1Score();
        haveLeaderboard.getPlayer2Score();
        */


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
        //Reset
        Button buttonReset = new Button("New Game");
        buttonReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gridPane.getChildren().clear();

                Button clearedButton = new Button(" ");
                clearedButton.setMinHeight(100);
                clearedButton.setMinWidth(100);


                gridPane.add(createButton(), 0, 0, 1, 1);
                gridPane.add(createButton(), 1, 0, 1, 1);
                gridPane.add(createButton(), 2, 0, 1, 1);
                gridPane.add(createButton(), 0, 1, 1, 1);
                gridPane.add(createButton(), 1, 1, 1, 1);
                gridPane.add(createButton(), 2, 1, 1, 1);
                gridPane.add(createButton(), 0, 2, 1, 1);
                gridPane.add(createButton(), 1, 2, 1, 1);
                gridPane.add(createButton(), 2, 2, 1, 1);

            }
        });
        vbox.getChildren().add(buttonReset);


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        int count =0;




        stage.setScene(scene);

                stage.show();
            }


            //Board board = new Board();

            //Recheck
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
                            clickedFirst = "O";

                            //get O
                        } else if (clickedFirst.equals("O")) {
                            button.setTextFill(Color.rgb(51, 51, 255));
                            button.setText("O");
                            button.setDisable(true);
                            clickedFirst = "X";


                            //To win
                        }
                        for(int i=0;i<3;i++){
                            for(int o=0;o<3;o++){

                                    hello1[i][o]=buttonArray[i][o].getText();



                        }
                        }
                                         //First row
                                if(hello1[0][0].equals("X")&& hello1[0][1].equals("X")&&hello1[0][2].equals("X") ||
                                        //Second Row
                                        hello1[1][0].equals("X")&& hello1[1][1].equals("X")&&hello1[1][2].equals("X") ||
                                        //Third Row
                                        hello1[2][0].equals("X")&& hello1[2][1].equals("X")&&hello1[2][2].equals("X") ||

                                        //Columns
                                        //1st Columns
                                        hello1[0][0].equals("X")&& hello1[1][0].equals("X")&&hello1[2][0].equals("X") ||

                                        //2nd Columns
                                        hello1[0][1].equals("X")&& hello1[1][1].equals("X")&&hello1[2][1].equals("X")||

                                        //3rd Columns
                                        hello1[0][2].equals("X")&& hello1[1][2].equals("X")&&hello1[2][2].equals("X")||

                                        //Diagonal
                                        hello1[0][0].equals("X")&& hello1[1][1].equals("X")&&hello1[2][2].equals("X")||
                                        hello1[0][2].equals("X")&& hello1[1][1].equals("X")&&hello1[2][0].equals("X")) {

                                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                    alert.setTitle("Game information");
                                    alert.setHeaderText("Game Status:");
                                    alert.setContentText("X Won!");
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

                                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setTitle("Game information");
                                        alert.setHeaderText("Game Status:");
                                        alert.setContentText("O Won!");
                                        alert.show();






                               }

                                }
                });

                return button;
            }














    public static void main(String[] args) {
        launch();
    }
}
