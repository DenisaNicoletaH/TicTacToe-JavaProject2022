package com.example.tictactoejavaproject2022;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private String X="X";
    private String O="O";
    private String input;
    private Label label;
    private String clickedFirst="X";
    private Button clickedLast;


    @Override
    public void start(Stage stage) throws IOException {
        HBox hBox=new HBox();
        VBox vbox = new VBox();
        Scene scene = new Scene(hBox);
        GridPane gridPane = new GridPane();
        BorderPane borderPane=new BorderPane();
        label=new Label();

        hBox.getChildren().add(vbox);
        vbox.getChildren().add(gridPane);
        vbox.getChildren().add(borderPane);
        vbox.getChildren().add(label);

        //Game Position
        vbox.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);

        //Text
        label.setText("TicTacToe");
        label.setAlignment(Pos.TOP_CENTER);
        label.setMinWidth(100);
        label.setMinHeight(50);


        //Style
        // label.setTextFill(new (153, 255, 153));



        //Button Positions
        gridPane.add(createButton(input), 0, 0, 1, 1);
        gridPane.add(createButton(input), 1, 0, 1, 1);
        gridPane.add(createButton(input), 2, 0, 1, 1);
        gridPane.add(createButton(input), 0, 1, 1, 1);
        gridPane.add(createButton(input), 1, 1, 1, 1);
        gridPane.add(createButton(input), 2, 1, 1, 1);
        gridPane.add(createButton(input), 0, 2, 1, 1);
        gridPane.add(createButton(input), 1, 2, 1, 1);
        gridPane.add(createButton(input), 2, 2, 1, 1);








        stage.setScene(scene);
        stage.show();
    }

    //Recheck
    public Button createButton(String input) {
        Button button=new Button();
        Board board = new Board();



            //Size of button X
            button.setMinWidth(100);
            button.setMinHeight(100);


            //Mouse Click
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {

                    button.setText("X");

                    if (clickedFirst.equals("X")) {
                        button.setText("X");
                        button.setDisable(true);
                        clickedFirst = "O";
                    } else if (clickedFirst.equals("O")) {
                        button.setText("0");
                        button.setDisable(true);
                        clickedFirst = "X";
                    }

                }


                ///Recheck
                public Players PlayerInput(Button buttonX, Button buttonO) {
                    Players players = new Players();

                    return players;
                }

            });

        return button;
    }


    public static void main(String[] args) {
        launch();
    }
}
