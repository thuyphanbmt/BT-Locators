package Bai5_Locators;

public class LocatorsCRM {

    //#1.Bat Xpath của trang Login
    String emailAdress="//input[@id='email']";
    String password="//input[@id='password']";
    String remember="//input[@id='remember']";
    String loginButton="//button[@class='btn btn-primary btn-block']";
    String forgotPassword ="//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']";

    //#2.Bắt xpath menu Customer
    //customers
    String customersMenu="//span[normalize-space()='Customers']";

    //#3.Bắt xpath hết Form của trang New Customer (Customer Details)
    String newCustomerButton="//a[normalize-space()='New Customer']";
    String customerDetailsTab="//a[normalize-space()='Customer Details']";
    String company="//input[@id='company']";
    String vatNumber="//input[@id='vat']";
    String phone="//input[contains(@id,'phonenumber')]";
    String website="//type[contains(@id,'website')]";
    String groups="";
    //Groups > Search Textbox
    String groupsDropdown="//input[contains(@aria-controls,'bs-select-1')]";
    String selectAllButton="//button[normalize-space()='Select All']";
    String deselectAllButton="//button[contains(@class,'actions-btn bs-deselect-all btn btn-default')]";
    // Select Gold/Silver/VIP
    String gold="//a[@id='bs-select-1-0']";
    String silver="//span[normalize-space()='Silver']";
    String VIP="//span[normalize-space()='VIP']";
    String currency="//div[@xpath and @class='filter-option-inner-inner']";
    // Currency > search textbox
    String currencyDropdown="//input[@aria-activedescendant='bs-select-2-0']";
    //Select USD/EUR
    String USD="//a[@id='bs-select-2-1']";
    String EUR="//a[@id='bs-select-2-2']";
    String defaultLanguageDropdown="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/button/div";
    String address="//textarea[@id='address']";
    String city="//input[@id='city']";
    String state="//input[@id='state']";
    String zipCode="//input[@id='zip']";
    String country="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[12]/div/button/div/div/div";
    String saveAndCreateContactButton="//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    String save ="//button[@class='btn btn-primary only-save customer-form-submiter']";

    //#4. Bắt hết xpath Customer - Billing &Shipping
    String billingShippingTab="//a[@aria-controls='billing_and_shipping']";
    String streetBilling="//textarea[@id='billing_street']";
    String cityBilling="//input[@id='billing_city']";
    String stateBilling="//div[@app-field-wrapper='billing_state']";
    String ZipCodeBilling="//input[@id='billing_zip']";
    String countryBilling="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[2]/div/div/div/div[1]/div[5]/div/button/div/div/div";
    String countryDropdownBilling ="//input[@aria-activedescendant='bs-select-5-0']";
    String streetShipping="//textarea[@id='shipping_street";
    String cityShipping="//input[@id='shipping_city']";
    String stateShipping="//input[@id='shipping_state']";
    String zipCodeShipping="//input[@id='shipping_zip']";
    String countryDropdownShipping="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[2]/div/div/div/div[2]/div[5]/div/button/div/div/div";
    String saveAndCreateContact_Button="//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    String Save="//button[@class='btn btn-primary only-save customer-form-submiter']";

    //5 Bắt xpath menu Projects
    String projectMenu="//i[@class='fa-solid fa-chart-gantt menu-icon']/parent::a";

    //#6 Bắt hết xpath form Project
    String newProjectButton="//a[@class='btn btn-primary pull-left display-block mright5']/following-sibling::a";
    String projectTab="//a[@href='#tab_project']/parent::li";
    String projectName="//label[@for='name']/following-sibling::input";
    String customerDropdown="";
    String calculateCheckbox="";
    String billingType="";
    String statusDropdown="";
    String estimatedHouse="";
    String member="";
    String memberSearch="";
    String quanneExample_Option="";
    String anhTesterAdmin_Option="";












}
