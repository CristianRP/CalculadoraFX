/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cramirez.calculadorafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

/**
 *
 * @author cristian
 * 
 * Calculador echa en JAVAFX con las funcionalidades basicas
 * suma, resta, multiplicacion, division y algunas funciones
 * avanzadas como raiz cuadrada, seno, coseno, tangente. 
 */
public class CalculadoraFX extends Application {
    
    /**
     * El metodo start se ejecuta al iniciar la aplicacion 
     * y carga todos los elementos que esten declarados dentro
     * Recibe como parametro un: 
     * @param primaryStage 
     */
    @Override
    public void start(Stage primaryStage) {
        
        TextField inputText = new TextField();
        
        /**
         * Declaramos todos los botones que llevara la calculadora, 
         * instanciandolos y enviando un parametro el cual sera el 
         * texto que aparecera en el boton
         */
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btn0 = new Button("0");
        Button btnMultiplicacion = new Button("*");
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnDivision = new Button("/");
        Button btnPunto = new Button(".");
        Button btnIgual = new Button("=");
        Button btnAC = new Button("AC");
        Button btnANS = new Button("ANS");
        Button btnEmpty = new Button();
        
        
        /**
         * Declaramos un gridpane que sera el contenedor para los botones 
         */
        GridPane gridPane = new GridPane();
        GridPane gridPaneContainer = new GridPane();
        
        gridPaneContainer.setPadding(new Insets(10, 10, 10, 10));
        gridPaneContainer.setVgap(5);
        gridPaneContainer.setHgap(5);
        gridPaneContainer.setAlignment(Pos.CENTER);
        
        /**
         * Agregamos los botones al gridPane, ajustandolos en la 
         * posicion deseada
         */
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
       
        gridPane.add(inputText, 0, 5);
        gridPane.add(btn7, 1, 1);
        gridPane.add(btn8, 2, 1);
        gridPane.add(btn9, 3, 1);
        gridPane.add(btnEmpty, 4, 1);
        gridPane.add(btnAC, 5, 1);
        gridPane.add(btn4, 1, 2);
        gridPane.add(btn5, 2, 2);
        gridPane.add(btn6, 3, 2);
        gridPane.add(btnMultiplicacion, 4, 2);
        gridPane.add(btnDivision, 5, 2);
        gridPane.add(btn1, 1, 3);
        gridPane.add(btn2, 2, 3);
        gridPane.add(btn3, 3, 3);
        gridPane.add(btnSuma, 4, 3);
        gridPane.add(btnResta, 5, 3);
        gridPane.add(btn0, 1, 4);
        gridPane.add(btnPunto, 2, 4);
        gridPane.add(btnANS, 4, 4);
        gridPane.add(btnIgual, 5, 4);
        
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        gridPaneContainer.add(inputText, 0, 0);
        gridPaneContainer.add(gridPane, 0, 1);
        Scene scene = new Scene(gridPaneContainer, 400, 350);
        
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void setDisplay() {
        
    }
    
}
