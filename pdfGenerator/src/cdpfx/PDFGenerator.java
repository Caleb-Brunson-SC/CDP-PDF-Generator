package cdpfx;

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

}
