package com.example.tictactoejavaproject2022;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

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
        GridPane gridPane = new GridPane();
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


        //Button Positions
        gridPane.add(createButton(), 0, 0, 1, 1);
        gridPane.add(createButton(), 1, 0, 1, 1);
        gridPane.add(createButton(), 2, 0, 1, 1);
        gridPane.add(createButton(), 0, 1, 1, 1);
        gridPane.add(createButton(), 1, 1, 1, 1);
        gridPane.add(createButton(), 2, 1, 1, 1);
        gridPane.add(createButton(), 0, 2, 1, 1);
        gridPane.add(createButton(), 1, 2, 1, 1);
        gridPane.add(createButton(), 2, 2, 1, 1);

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

                        if (clickedFirst.equals("X")) {
                            button.setTextFill(Color.rgb(255, 0, 85));
                            button.setText("X");
                            button.setDisable(true);
                            clickedFirst = "O";
                            if (clickedFirst.equals("XXX")) {
                                resultsLabel.setText(" X is the Winner!!!");


                            }

                        } else if (clickedFirst.equals("O")) {
                            button.setTextFill(Color.rgb(51, 51, 255));
                            button.setText("0");
                            button.setDisable(true);
                            clickedFirst = "X";
                        }


                    }

               /*
                ///Recheck--??
                public Score PlayerInput(Button buttonX, Button buttonO) {
                    Score score = new Score();

                    return score;
                }
*/

                });
                return button;
            }




















    public static void main(String[] args) {
        launch();
    }
}
