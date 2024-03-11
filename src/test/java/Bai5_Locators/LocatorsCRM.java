package Bai5_Locators;

public class LocatorsCRM {

    //#1.Bat Xpath của trang Login
    //emailAdress
    String emailAdress="//input[@id='email']";

    //password
    String password="//input[@id='password']";
    //xpath=//input[contains(@id,'password')]

    //remember
    String remember="//input[@id='remember']";
    //xpath=//input[contains(@id,'remember')]

    //Login button
    String loginButton="//button[@class='btn btn-primary btn-block']";
    //xpath=//button[normalize-space()='Login']

    //Forgot password
    String forgotPassword ="//a[@href='https://crm.anhtester.com/admin/authentication/forgot_password']";
    //xpath=//a[normalize-space()='Forgot Password?']

    //#2.Bắt xpath menu Customer
    //customers
    String customers="//span[normalize-space()='Customers']";
    //xpath=//span[contains(normalize-space(),'Customers')]
    //xpath=//span[contains(normalize-space(),'Customers')]

    //#3.Bắt xpath hết Form của trang New Customer (Customer Details)
    String customerDetails="//a[normalize-space()='Customer Details']";
    String company="//input[@id='company']";
    String VATNumber="//input[@id='vat']";
    String phone="//input[contains(@id,'phonenumber')]";
    String website="//type[contains(@id,'website')]";
    String groups="//div[@class='filter-option-inner-inner' and @xpath='1']";
    //Groups > Search Textbox
    String groupSearch="//input[contains(@aria-controls,'bs-select-1')]";
    String selectAll="//button[normalize-space()='Select All']";
    String deselectAll="//button[contains(@class,'actions-btn bs-deselect-all btn btn-default')]";
    // Select Gold/Silver/VIP
    String gold="//a[@id='bs-select-1-0']";
    String silver="//span[normalize-space()='Silver']";
        String VIP="//span[normalize-space()='VIP']";
    String currency="//div[@xpath and @class='filter-option-inner-inner']";
    // Currency > search textbox
    String currencySearch="//input[@aria-activedescendant='bs-select-2-0']";
    //Select USD/EUR
    String USD="//a[@id='bs-select-2-1']";
    String EUR="//a[@id='bs-select-2-2']";
    String defaultLanguage="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/button/div";
    String address="//textarea[@id='address']";
    String city="//input[@id='city']";
    String state="//input[@id='state']";
    String zipCode="//input[@id='zip']";
    String country="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[12]/div/button/div/div/div";
    String saveAndCreateContact="//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    String save ="//button[@class='btn btn-primary only-save customer-form-submiter']";

    //#4. Bắt hết xpath Customer - Billing &Shipping
    String street="//textarea[@id='billing_street']";
    String billing_city="//input[@id='billing_city']";
    String billing_State="//div[@app-field-wrapper='billing_state']";
    String billing_ZipCode="//input[@id='billing_zip']";
    String billing_Country="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[2]/div/div/div/div[1]/div[5]/div/button/div/div/div";
    String Search_Billing_Country ="//input[@aria-activedescendant='bs-select-5-0']";

    String shipping_Street="//textarea[@id='shipping_street";
    String shipping_City="//input[@id='shipping_city']";
    String shipping_State="//input[@id='shipping_state']";
    String zip_Code="//input[@id='shipping_zip']";
    String shipping_Country="/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[2]/div/div/div/div[2]/div[5]/div/button/div/div/div";
    String SaveAndCreateConact="//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    String Save="//button[@class='btn btn-primary only-save customer-form-submiter']";







}
