import javax.mail.Session;
import java.util.Properties;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("SimpleEmail Start");

        String smtpHostServer = "localhost";
        String emailID = "attach@localhost.mock";

        Properties props = System.getProperties();

        props.put("mail.smtp.host", smtpHostServer);

        Session session = Session.getInstance(props, null);

        EmailUtil.sendEmail(session, emailID, "Email for experiments with SMTP mock", "SimpleEmail Testing Body. To check how we can operate and control SMTP mock");

    }
}
