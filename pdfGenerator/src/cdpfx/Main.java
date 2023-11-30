package cdpfx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primary_stage) throws Exception {
    // Creating a VBox as the root.
    VBox vbox_root = new VBox(5); // 5 is spacing between children.
    vbox_root.setPadding(new Insets(5));

    // Creating Hbox and text for program, company, and developer information.
    HBox program_title = new HBox();
    Text text_program_title = new Text();
    text_program_title.setText("Proposal for Fencing Installation");
    text_program_title.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
    program_title.getChildren().add(text_program_title);
    program_title.setAlignment(Pos.CENTER);

    HBox program_information = new HBox();
    Text text_program_information = new Text();
    text_program_information.setText("Program developed for CDP Fencing by Caleb Brunson (Github: Caleb-Brunson-SC).");
    text_program_information.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 15));
    program_information.getChildren().add(text_program_information);
    program_information.setAlignment(Pos.CENTER);

    // Creating GridPane for user input Labels and TextFields.
    GridPane grid_pane = new GridPane();
    grid_pane.setPadding(new Insets(5, 5, 5, 5));
    grid_pane.setVgap(5); // Sets vertical gap between columns.
    grid_pane.setHgap(5); // Sets horizontal gap between rows.
    grid_pane.setAlignment(Pos.CENTER);

    // Creating Labels and Textfields for user input.
    Label label_customer_first_name = new Label("Customer's First Name");
    TextField text_field_customer_first_name = new TextField();

    Label label_customer_last_name = new Label("Customer's Last Name");
    TextField text_field_customer_last_name = new TextField();

    // Arranging all the nodes in the GridPane.
    grid_pane.addRow(0, label_customer_first_name, text_field_customer_first_name);

    // Add all children to the VBox container (root).
    vbox_root.getChildren().addAll(program_title, program_information, grid_pane);

    // Creating a scene object.
    Scene scene = new Scene(vbox_root, 700, 500);

    // Adding the scene to the stage.
    primary_stage.setScene(scene);

    // Displaying the contents of the stage.
    primary_stage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}