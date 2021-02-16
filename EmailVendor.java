public class EmailVendor {

    public String name;
    private String serverAddress;
    private String postFix;

    /**Email vendors share the same user/pass, should be static to be accesses by multiple instance of the same class */
    public static final String userName = "admin";
    public static final String password = "admin";


    /**
     * Constructor for EmailVendor class
     * @param VendorName string of vendor name [GMAIL]
     * @param serverAddress string of server address [smtp.gmail.com]
     * @param postFix string of email postfix [@gmail.com]
     */
    public EmailVendor(String VendorName, String serverAddress, String postFix) {
        this.name = VendorName;
        this.postFix = postFix;
        this.serverAddress = serverAddress;
    }

    /**
     * Getter for serverAddress property
     * @return string serverAddress
     */
    public String getServerAddress() {
        return serverAddress;
    }

    /**
     * Setter for serverAddress property
     * @param serverAddress string serverAddress
     */
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    /**
     * Getter for postFix property
     * @return string postFix
     */
    public String getPostFix() {
        return postFix;
    }

    /**
     * Setter for postFix property
     * @param postFix string postFix
     */
    public void setPostFix(String postFix) {
        this.postFix = postFix;
    }
}