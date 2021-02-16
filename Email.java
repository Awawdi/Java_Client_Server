import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {

    public Employee Sender;
    private String Receipt;
    public EmailVendor SenderVendor;
    private String Body;

    public Email() {
        this.Sender = null;
        this.Receipt = "";
        this.SenderVendor = null;
        this.Body = "";
    }

    /**
     * overloading toString method of Email class
     */
    public String toString() {
        /// Date formatter to be added to the body of the email ///
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("New Email \n");
        strBuilder.append("[Time " + formatter.format(date) + "]\n");
        strBuilder.append("From: " + this.Sender.Name + this.SenderVendor.getPostFix() + "\n");
        strBuilder.append("To: " + getReceipt() + "\n");
        strBuilder.append("using the following info: " + "\n");
        strBuilder.append("SMTP: " + this.SenderVendor.getServerAddress() + "\n");
        strBuilder.append("SMTP user: " + EmailVendor.userName + "\n");
        strBuilder.append("SMTP pass: " + EmailVendor.password + "\n");
        strBuilder.append(getBody() + "\n");

        return strBuilder.toString();
    }

    /**
     * Getter for Body property
     * 
     * @return string Body
     */
    public String getBody() {
        return Body;
    }

    /**
     * Setter for Body property
     * 
     * @param body string
     */
    public void setBody(String body) {
        Body = body;
    }

    /**
     * Getter for Receipt property
     * 
     * @return Receipt string
     */
    public String getReceipt() {
        return Receipt;
    }

    /**
     * Setter for Receipt property
     * 
     * @param receipt string
     */
    public void setReceipt(String receipt) {
        Receipt = receipt;
    }
}