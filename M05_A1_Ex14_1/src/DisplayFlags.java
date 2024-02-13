/**
* Assignment: SDEV200_M05_Assignment1_Ex14_01
* File: DisplayFlags.java
* Version: 1.0
* Date: 2/11/2024
* Author: Tomomi Hobara
* Description: This program displays four images of flags in one stage.
* Steps:
     1. Load the images
     2. Create and resize ImageViews
     3. Display the ImageViews in the primary stage
*/

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class DisplayFlags extends Application {

    @Override  // Override the start method in the Application class
    public void start (Stage primaryStage) {

        // Create a GridPane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);

        // Create images
        Image ukFlag = new Image("flag2.gif");
        Image frFlag = new Image("flag6.gif");
        Image chFlag = new Image("flag7.gif");
        Image usFlag = new Image("flag1.gif");

        // Create ImageViews for the images after resizing them
        ImageView ukFlagView = resize(ukFlag);
        ImageView frFlagView = resize(frFlag);
        ImageView chFlagView = resize(chFlag);
        ImageView usFlagView = resize(usFlag);

         // Add ImageViews to the GridPane
         pane.add(ukFlagView, 0, 0);
         pane.add(frFlagView, 0, 1);
         pane.add(chFlagView, 1, 0);
         pane.add(usFlagView, 1, 1);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Set the image size
    private ImageView resize(Image image) {
        ImageView imageView = new ImageView(image);  // Create ImageView
        imageView.setFitWidth(300); // Set the width of the image file
        imageView.setFitHeight(200); // Set the height of the image
        imageView.setPreserveRatio(true); // Maintain the image's aspect ratio
        return imageView;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
