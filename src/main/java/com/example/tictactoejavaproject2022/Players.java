package com.example.tictactoejavaproject2022;

import javafx.scene.control.Button;

public class Players extends HelloApplication {

    private Button button;

    //First Player X
    public String FirstPlayer(Button button) {
        if (button.isPressed()) {

            return "X";

        } else {
            return " ";

        }

    }

    //Second Player O
    public String SecondPlayer(Button button){

        if(button.isPressed()){
            return "O";
        }
        else{
            return " ";
        }
    }







}




