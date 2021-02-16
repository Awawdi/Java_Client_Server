public class Employee {
    public String Name;

    private String GmailAddress;
    private String WallaMailAddress;
    private String YahooMailAddress;

    private EmailVendor WallaAccount;
    private EmailVendor YahooAccount;
    private EmailVendor GmailAccount;

    /**
     * Constructor for Employee class
     * @param Name string denotes the Name of the Employee 
     */
    public Employee(String Name) {
        this.Name = Name;
    }

    /**
     * this method aims to assign the 1) Employees' email addresses and 2) this email's vendor
     * 1) email address for Gmail/Walla/Yahoo is a concatenation of 'Name' of the employee [orsan]
     * + the postfix of the Vendor [@gmail.com]
     * 2) vendor reference is received by the calling method
     * @param Gmail EmailVendor class reference
     * @param Yahoo EmailVendor class reference
     * @param Walla EmailVendor class reference
     */
    public void SetAddress(EmailVendor Gmail, EmailVendor Yahoo, EmailVendor Walla) 
    {
        setGmailAccount(Gmail);
        setGmailAddress(Name.concat(this.GmailAccount.getPostFix()));

        setWallaAccount(Walla);
        setWallaMailAddress(Name.concat(this.WallaAccount.getPostFix()));

        setYahooAccount(Yahoo);
        setYahooMailAddress(Name.concat(this.YahooAccount.getPostFix()));
    }

    

    /**
     * Getter for GmailAddress property
     * @return string GmailAddress
     */
    public String getGmailAddress() {
        return GmailAddress;
    }

    /**
     * Setter for GmailAddress property
     * @param gmailAddress string
     */
    public void setGmailAddress(String gmailAddress) {
        GmailAddress = gmailAddress;
    }

    /**
     * Getter for WallaAddress property
     * @return string WallaAddress
     */
    public String getWallaMailAddress() {
        return WallaMailAddress;
    }

    /**
     * Setter for WallaAddress property
     * @param wallaMailAddress string 
     */
    public void setWallaMailAddress(String wallaMailAddress) {
        WallaMailAddress = wallaMailAddress;
    }

    /**
     * Getter for YahooMailAddress property
     * @return YahooMailAddress
     */
    public String getYahooMailAddress() {
        return YahooMailAddress;
    }

    /**
     * Setter for YahooMailAddress property
     * @param yahooMailAddress string
     */
    public void setYahooMailAddress(String yahooMailAddress) {
        YahooMailAddress = yahooMailAddress;
    }

    /**
     * Getter for WallaAccount property
     * @return WallaAccount of type EmailVendor
     */
    public EmailVendor getWallaAccount() {
        return WallaAccount;
    }

    /**
     * Setter for WallaAccount vendor
     * @param wallaAccount EmailVendor
     */
    public void setWallaAccount(EmailVendor wallaAccount) {
        WallaAccount = wallaAccount;
    }

    /**
     * Getter for YahooAccount
     * @return YahooAccount of type EmailVendor
     */
    public EmailVendor getYahooAccount() {
        return YahooAccount;
    }

    /**
     * Setter for YahooAccount property
     * @param yahooAccount YahooAccount of type EmailVendor
     */
    public void setYahooAccount(EmailVendor yahooAccount) {
        YahooAccount = yahooAccount;
    }

    /**
     * Getter for GmailAccount property
     * @return GmailAccount of type EmailVendor
     */
    public EmailVendor getGmailAccount() {
        return GmailAccount;
    }

    /**
     * Setter for Gmail account vendor
     * @param GmailAccount of type EmailVendor
     */
    public void setGmailAccount(EmailVendor GmailAccount) {
        this.GmailAccount = GmailAccount;
    }

}