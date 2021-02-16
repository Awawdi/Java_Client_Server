/** 
 * Server application should be started before client application
 * This Client aaplication aims to send an email from client to server, both on same machine [Localhost and port 4000] 
 * Client initializes Email Vendors with three vendors. Also initialized one Employee with one employee 
 * and assign these three vendors to this employee. 
 * Next, Client asks the user for details of the email (to, From, Body), ensures vendor of sender is correct.
 * Next, Client initializes an Email object with the information and passes this Email instance to dispatcher method
 * of EmailClient class.
 * Email client class knows to dispach this email to sever using server LOCALHOST and port 4000
 * and using OutputStream, and DataOutputStream classes
 * 
 * */

public class Program {
    public static void main(String[] args) {

        /// Email vendors initialization
        EmailVendor Gmail = new EmailVendor("gmail", "smtp.gmail.com", "@gmail.com");
        EmailVendor Walla = new EmailVendor("walla", "smtp.walla.co.il", "@walla.co.il");
        EmailVendor Yahoo = new EmailVendor("yahoo", "smtp.yahoo.com", "@yahoo.com");

        /// one Employee initialization
        Employee Orsan = new Employee("Orsan");
        Orsan.SetAddress(Gmail, Yahoo, Walla);

        /// Email instance is initialized
        Email newEmail = new Email();
        newEmail.Sender = Orsan;

        /// ---------------------------------------------------------------------------////

        System.out.println("please enter From email:");
        String EmailFromAddress = System.console().readLine();
        newEmail.SenderVendor = getEmailVendorByPostfix(Orsan, EmailFromAddress.split("@")[1]);

        while (newEmail.SenderVendor == null) {
            System.out.println("please enter correct email");
            System.out.println(
                    "Available email providers: 'Walla.co.il', 'walla.co.il', 'Yahoo.com', 'yahoo.com', 'Gmail.com', 'gmail.com'");

            EmailFromAddress = System.console().readLine();
            newEmail.SenderVendor = getEmailVendorByPostfix(Orsan, EmailFromAddress.split("@")[1]);
        }

        System.out.println("please enter To email:");
        String EmailToAddress = System.console().readLine();
        System.out.println("please enter body of email:");
        String EmailBody = System.console().readLine();
        newEmail.setReceipt(EmailToAddress);
        newEmail.setBody("Body of the Email \n" + EmailBody);

        EmailClient client = new EmailClient();
        client.dispach(newEmail);
    }

    /**
     * this method receives the postfix of an email address and an Employee
     * instance, and returns the apprpriate vendor
     * 
     * @param Emp     Employee instance
     * @param postfix string containing the second part of the email address,
     *                following @ sign
     * @return Object of type EmailVendor
     */
    public static EmailVendor getEmailVendorByPostfix(Employee Emp, String postfix) {
        EmailVendor temp = null;

        switch (postfix) {
            case "Walla.co.il":
            case "walla.co.il":
                temp = Emp.getWallaAccount();
                break;
            case "Yahoo.com":
            case "yahoo.com":
                temp = Emp.getYahooAccount();
                break;
            case "Gmail.com":
            case "gmail.com":
                temp = Emp.getGmailAccount();
                break;
            default:
                break;
        }
        return temp;
    }
}