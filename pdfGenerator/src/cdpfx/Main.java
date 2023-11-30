package cdpfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
  // BorderPane root
  public BorderPane root;

  @Override
  public void start(Stage primary_stage) throws Exception {
    // Creating a VBox container.
    VBox vbox_one = new VBox(5); // 5 is spacing between children.
    vbox_one.setPadding(new Insets(5));

    // Creating Hbox and text for program, company, and developer information.
    HBox program_title = new HBox();
    Text text_program_title = new Text();
    text_program_title.setText("Proposal for Fencing Installation");
    text_program_title.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
    program_title.getChildren().add(text_program_title);

    HBox developer_information = new HBox();
    Text text_developer_information = new Text();
    text_developer_information.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 15));
    text_developer_information.setText("Program developed by Caleb Brunson (Github: Caleb-Brunson-SC).");
    developer_information.getChildren().add(text_developer_information);

    HBox program_information = new HBox();
    Text text_program_information = new Text();
    text_program_information.setText("Developed for use by CDP Fencing.");
    text_program_information.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 15));
    program_information.getChildren().add(text_program_information);

    // Creating GridPane for user input Labels and TextFields.
    GridPane grid_pane = new GridPane();
    grid_pane.setPadding(new Insets(25, 5, 5, 5));
    grid_pane.setVgap(10); // Sets vertical gap between rows.
    grid_pane.setHgap(10); // Sets horizontal gap between columns.

    // Creating Labels and Textfields for user input.
    Font user_input_font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.REGULAR, 15);

    // Proposal creation date.
    Label label_proposal_creation_date = new Label("Proposal Creation Date");
    label_proposal_creation_date.setFont(user_input_font);
    TextField text_field_proposal_creation_date = new TextField();

    // Customer first name.
    Label label_customer_first_name = new Label("Customer's First Name");
    label_customer_first_name.setFont(user_input_font);
    TextField text_field_customer_first_name = new TextField();

    // Customer last name.
    Label label_customer_last_name = new Label("Customer's Last Name");
    label_customer_last_name.setFont(user_input_font);
    TextField text_field_customer_last_name = new TextField();

    // Customer service address.
    Label label_service_address = new Label("Service Address");
    label_service_address.setFont(user_input_font);
    TextField text_field_service_address = new TextField();

    // Customer service City, State, Zip Code.
    Label label_service_address_city_state_zip = new Label("City, State, Zip Code");
    label_service_address_city_state_zip.setFont(user_input_font);
    TextField text_field_service_address_city_state_zip = new TextField();

    // Customer service municipality.
    Label label_service_address_municipality = new Label("Municipality");
    label_service_address_municipality.setFont(user_input_font);
    TextField text_field_service_address_municipality = new TextField();

    // Customer's email address.
    Label label_customer_email = new Label("Customer's E-mail Address");
    label_customer_email.setFont(user_input_font);
    TextField text_field_customer_email = new TextField();

    // Arranging all the nodes in the GridPane.
    grid_pane.addRow(0, label_proposal_creation_date, text_field_proposal_creation_date);
    grid_pane.addRow(1, label_customer_first_name, text_field_customer_first_name);
    grid_pane.addRow(2, label_customer_last_name, text_field_customer_last_name);
    grid_pane.addRow(3, label_service_address, text_field_service_address);
    grid_pane.addRow(4, label_service_address_city_state_zip, text_field_service_address_city_state_zip);
    grid_pane.addRow(5, label_service_address_municipality, text_field_service_address_municipality);
    grid_pane.addRow(6, label_customer_email, text_field_customer_email);

    // Creating Vbox for checkboxes and text area fields.
    VBox vbox_two = new VBox(10); // Spacing = 10.
    vbox_two.setPadding(new Insets(5));

    // Checkbox: permit required?
    CheckBox checkbox_permit_required = new CheckBox("Permit Required?");
    checkbox_permit_required.setFont(user_input_font);

    // Checkbox: homeowner to obtain permit?
    CheckBox checkbox_homeowner_permit = new CheckBox("Homeowner to Obtain Permit?");
    checkbox_homeowner_permit.setFont(user_input_font);

    // Checkbox: CDP Fencing to obtain permit?
    CheckBox checkbox_cdp_permit = new CheckBox("CDP Fencing to Obtain Permit?");
    checkbox_cdp_permit.setFont(user_input_font);

    // Checkbox: plot plan or survey available?
    CheckBox checkbox_plot_survey_available = new CheckBox("Plot Plan or Survey Available?");
    checkbox_plot_survey_available.setFont(user_input_font);

    // TextArea: product specifications.
    Label label_product_specifications = new Label("Product Specifications");
    label_product_specifications.setFont(user_input_font);
    TextArea text_area_product_specifications = new TextArea();
    text_area_product_specifications.setWrapText(true);

    // Adding checkboxes and text area children to VBox_two layout.
    vbox_two.getChildren().addAll(checkbox_permit_required, checkbox_homeowner_permit, checkbox_cdp_permit,
        checkbox_plot_survey_available, label_product_specifications, text_area_product_specifications);

    // Add all children to the VBox_one layout.
    vbox_one.getChildren().addAll(program_title, developer_information, program_information, grid_pane, vbox_two);

    // Creating ScrollPane with scrollbar.
    ScrollPane scroll_pane = new ScrollPane();

    // Adding VBox_one layout to ScrollPane content.
    scroll_pane.setContent(vbox_one);

    // Initalizing root BorderPane with scroll_pane content.
    root = new BorderPane(scroll_pane);

    // Creating a scene object.
    Scene scene = new Scene(root, 700, 500);

    // Adding the scene to the stage.
    primary_stage.setScene(scene);

    // Displaying the contents of the stage.
    primary_stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}