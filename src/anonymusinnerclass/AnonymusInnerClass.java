/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymusinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author amedi
 */
public class AnonymusInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos el hbox en el cual vamos a meter los botones
        HBox hbox = new HBox();
        
        
        Button btn = new Button();
        btn.setText("New");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Open");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Save");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("Print");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        BorderPane root = new BorderPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        
        // Incluimos los botones en el borderpane
        root.setCenter(hbox);
        
        // Centramos los botones
        hbox.setAlignment(Pos.CENTER);
        
        // Incluimos los botones en el hbox
        hbox.getChildren().addAll(btn, btn2, btn3, btn4);
        
      
        Scene scene = new Scene(root, 300, 250);
       
        primaryStage.setTitle("Anonymus Inner Class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
