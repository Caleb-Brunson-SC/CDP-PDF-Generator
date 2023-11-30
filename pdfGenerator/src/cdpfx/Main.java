package cdpfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
  public static Stage current_stage;
  // Will need to set these in their respective methods.
  public Boolean has_created_fence_diagram = true; // Default value.
  public Boolean has_created_signature = true; // Default value.

  @Override
  public void start(Stage primary_stage) throws Exception {
    // Setting current_stage to primary_stage.
    this.current_stage = primary_stage;

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

    // Creating GridPane for customer information input Labels and TextFields.
    GridPane grid_pane_one = new GridPane();
    grid_pane_one.setPadding(new Insets(25, 5, 5, 5));
    grid_pane_one.setVgap(10); // Sets vertical gap between rows.
    grid_pane_one.setHgap(10); // Sets horizontal gap between columns.

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

    // Creating Button to open new Scene for fence diagram.
    Label label_draw_fence_diagram = new Label("Draw Fence Diagram");
    label_draw_fence_diagram.setFont(user_input_font);
    Button button_draw_fence_diagram = new Button("Open Diagram Maker");
    button_draw_fence_diagram.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        createFenceDiagram();
      }
    });

    // Arranging all the nodes in the GridPane.
    grid_pane_one.addRow(0, label_proposal_creation_date, text_field_proposal_creation_date);
    grid_pane_one.addRow(1, label_customer_first_name, text_field_customer_first_name);
    grid_pane_one.addRow(2, label_customer_last_name, text_field_customer_last_name);
    grid_pane_one.addRow(3, label_service_address, text_field_service_address);
    grid_pane_one.addRow(4, label_service_address_city_state_zip, text_field_service_address_city_state_zip);
    grid_pane_one.addRow(5, label_service_address_municipality, text_field_service_address_municipality);
    grid_pane_one.addRow(6, label_customer_email, text_field_customer_email);
    grid_pane_one.addRow(7, label_draw_fence_diagram, button_draw_fence_diagram);

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

    // TextArea: job options.
    Label label_job_options = new Label("Job Options");
    label_job_options.setFont(user_input_font);
    TextArea text_area_job_options = new TextArea();
    text_area_job_options.setWrapText(true);

    // TextArea: job notes.
    Label label_job_notes = new Label("Job Notes");
    label_job_notes.setFont(user_input_font);
    TextArea text_area_job_notes = new TextArea();
    text_area_job_notes.setWrapText(true);

    // Text notice for cost fields and calculation.
    Text text_cost_calculation = new Text(
        "Note: Contract Amount will be calculated from Materials Cost, Labor Cost, and Discount. Remaining Amount is equal to Contract Amount minus Deposit Amount.");
    text_cost_calculation.setFont(user_input_font);
    text_cost_calculation.setWrappingWidth(650);

    // Adding checkboxes and text area children to VBox_two layout.
    vbox_two.getChildren().addAll(checkbox_permit_required, checkbox_homeowner_permit, checkbox_cdp_permit,
        checkbox_plot_survey_available, label_product_specifications, text_area_product_specifications,
        label_job_options, text_area_job_options, label_job_notes, text_area_job_notes, text_cost_calculation);

    // Creating second gridpane for financial information.
    GridPane grid_pane_two = new GridPane();
    grid_pane_two.setPadding(new Insets(25, 5, 5, 5));
    grid_pane_two.setVgap(10); // Sets vertical gap between rows.
    grid_pane_two.setHgap(10); // Sets horizontal gap between columns.

    // Creating labels and text fields for further information.
    // Materials Cost
    Label label_materials_cost = new Label("Materials Cost");
    label_materials_cost.setFont(user_input_font);
    TextField text_field_materials_cost = new TextField();

    // Labor Cost
    Label label_labor_cost = new Label("Labor Cost");
    label_labor_cost.setFont(user_input_font);
    TextField text_field_labor_cost = new TextField();

    // Discount Applied
    Label label_discount_applied = new Label("Discount Applied");
    label_discount_applied.setFont(user_input_font);
    TextField text_field_discount_applied = new TextField();

    // Sales tax.
    Label label_sales_tax = new Label("Sales Tax");
    label_sales_tax.setFont(user_input_font);
    TextField text_field_sales_tax = new TextField();

    // Deposit amount.
    Label label_deposit_amount = new Label("Deposit Amount");
    label_deposit_amount.setFont(user_input_font);
    TextField text_field_deposit_amount = new TextField();

    // CDP Fencing Authorized Representative (print name).
    Label label_authorized_rep_name = new Label("CDP Authorized Representative (full name)");
    label_authorized_rep_name.setFont(user_input_font);
    TextField text_field_authorized_rep_name = new TextField();

    // Creating Button to open new Scene for signing name.
    Label label_sign_authorized_rep_name = new Label("CDP Authorized Representative (signature)");
    label_sign_authorized_rep_name.setFont(user_input_font);
    Button button_sign_authorized_rep_name = new Button("Sign Name");
    button_sign_authorized_rep_name.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        createSignature();
      }
    });

    // Creating create pdf button.
    Label label_create_pdf = new Label("Create PDF");
    label_create_pdf.setFont(user_input_font);
    Button button_create_pdf = new Button("Create");
    button_create_pdf.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        // Checking if fence diagram has been created.
        if (!has_created_fence_diagram) {
          Alert alert = new Alert(AlertType.ERROR);
          alert.show();
          return;
        }
        // Checking if signature has been created.
        if (!has_created_signature) {
          Alert alert = new Alert(AlertType.ERROR);
          alert.show();
          return;
        }

        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.show();
      }
    });

    // Adding rows to the second grid pane.
    grid_pane_two.addRow(0, label_materials_cost, text_field_materials_cost);
    grid_pane_two.addRow(1, label_labor_cost, text_field_labor_cost);
    grid_pane_two.addRow(2, label_discount_applied, text_field_discount_applied);
    grid_pane_two.addRow(3, label_sales_tax, text_field_sales_tax);
    grid_pane_two.addRow(4, label_deposit_amount, text_field_deposit_amount);
    grid_pane_two.addRow(5, label_authorized_rep_name, text_field_authorized_rep_name);
    grid_pane_two.addRow(6, label_sign_authorized_rep_name, button_sign_authorized_rep_name);
    grid_pane_two.addRow(7, label_create_pdf, button_create_pdf);

    // Add all children to the VBox_one layout.
    vbox_one.getChildren().addAll(program_title, developer_information, program_information, grid_pane_one, vbox_two,
        grid_pane_two);

    // Creating ScrollPane with scrollbar.
    ScrollPane scroll_pane = new ScrollPane();

    // Adding VBox_one layout to ScrollPane content.
    scroll_pane.setContent(vbox_one);

    // Initalizing root BorderPane with scroll_pane content.
    BorderPane root = new BorderPane(scroll_pane);

    // Creating a scene object.
    Scene scene = new Scene(root, 700, 500);

    // Adding the scene to the stage.
    primary_stage.setScene(scene);

    // Displaying the contents of the stage.
    primary_stage.show();
  }

  public void createFenceDiagram() {
    BorderPane root = new BorderPane();

    Stage fence_diagram_stage = new Stage();
    Scene scene = new Scene(root, 700, 500);
    fence_diagram_stage.setScene(scene);
    fence_diagram_stage.show();
    // Main.current_stage.close();
  }

  public void createSignature() {
    BorderPane root = new BorderPane();

    Stage signature_stage = new Stage();
    Scene scene = new Scene(root, 700, 500);
    signature_stage.setScene(scene);
    signature_stage.show();
    // Main.current_stage.close();
  }

  public static void main(String[] args) {
    launch(args);
  }
}