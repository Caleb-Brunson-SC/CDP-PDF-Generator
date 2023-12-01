package cdpfx;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class PDFGenerator {
  public String proposal_creation_date;
  public String customer_first_name;
  public String customer_last_name;
  public String service_address;
  public String service_address_city_state_zip;
  public String service_address_municipality;
  public String customer_email_address;
  public Boolean is_permit_required;
  public Boolean is_homeowner_to_obtain_permit;
  public Boolean is_cdp_fencing_to_obtain_permit;
  public Boolean is_plan_plot_survey_available;
  public String product_specifications;
  public String job_options;
  public String job_notes;
  public String contract_amount;
  public String materials_cost;
  public String labor_cost;
  public String discount_percentage;
  public String sales_tax;
  public String deposit_amount;
  public String remaining_balance;
  public String cdp_authorized_representative_name;

  // Creating default constructor with values of "none" instead of NULL.
  public PDFGenerator() {
    this.proposal_creation_date = "none";
    this.customer_first_name = "none";
    this.customer_last_name = "none";
    this.service_address = "none";
    this.service_address_city_state_zip = "none";
    this.service_address_municipality = "none";
    this.customer_email_address = "none";
    this.is_permit_required = false;
    this.is_homeowner_to_obtain_permit = false;
    this.is_cdp_fencing_to_obtain_permit = false;
    this.is_plan_plot_survey_available = false;
    this.product_specifications = "none";
    this.job_options = "none";
    this.job_notes = "none";
    this.contract_amount = "none";
    this.materials_cost = "none";
    this.labor_cost = "none";
    this.discount_percentage = "none";
    this.sales_tax = "none";
    this.deposit_amount = "none";
    this.remaining_balance = "none";
    this.cdp_authorized_representative_name = "none";
  }

  @Override
  public String toString() {
    return "PDFGenerator [proposal_creation_date=" + proposal_creation_date + ", customer_first_name="
        + customer_first_name + ", customer_last_name=" + customer_last_name + ", service_address=" + service_address
        + ", service_address_city_state_zip=" + service_address_city_state_zip + ", service_address_municipality="
        + service_address_municipality + ", customer_email_address=" + customer_email_address + ", is_permit_required="
        + is_permit_required + ", is_homeowner_to_obtain_permit=" + is_homeowner_to_obtain_permit
        + ", is_cdp_fencing_to_obtain_permit=" + is_cdp_fencing_to_obtain_permit + ", is_plan_plot_survey_available="
        + is_plan_plot_survey_available + ", product_specifications=" + product_specifications + ", job_options="
        + job_options + ", job_notes=" + job_notes + ", contract_amount=" + contract_amount + ", materials_cost="
        + materials_cost + ", labor_cost=" + labor_cost + ", discount_percentage=" + discount_percentage
        + ", sales_tax="
        + sales_tax + ", deposit_amount=" + deposit_amount + ", remaining_balance=" + remaining_balance
        + ", cdp_authorized_representative_name=" + cdp_authorized_representative_name + "]";
  }

  public void createFilePDF() {
    try {
      // Creating PDF document object.
      PDDocument document = new PDDocument();

      // Creating page objects.
      for (int i = 0; i < 6; i++) {
        PDPage blankPage = new PDPage();

        // Adding page object to document object.
        document.addPage(blankPage);
      }

      // Creating the PDDocumentInformation object.
      PDDocumentInformation pddocument_information = document.getDocumentInformation();

      // Setting the author of the document.
      pddocument_information.setAuthor("CDP Fencing");

      // Setting the title of the document.
      pddocument_information.setTitle(customer_last_name + "_" + customer_first_name + "_contract");

      // Setting the creator of the document.
      pddocument_information.setCreator("Caleb Brunson");

      // Setting the subject of the document.
      pddocument_information.setSubject("Example document");

      // Setting the created date of the document.
      pddocument_information.setCreationDate(Calendar.getInstance());

      // Saving the document.
      document
          .save("C:\\Users\\caleb\\OneDrive\\Desktop\\Physiology Game\\" + pddocument_information.getTitle() + ".pdf");

      System.out.println("PDF created");

      // Closing the document.
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
