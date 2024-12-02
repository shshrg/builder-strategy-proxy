import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.ucu.edu.apps.task2.*;
import ua.ucu.edu.apps.task2.mailcode.BirthdayCode;
import ua.ucu.edu.apps.task2.mailcode.ScamCode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task2Tests {

    @Test
    public void testAddMailInfo() {
        MailBox mailBox = new MailBox();
        mailBox.setInfos(new ArrayList<>());

        Client client = new Client("test@example.com", "John Doe", LocalDate.of(1990, 1, 1), "male");
        BirthdayCode mailCode = new BirthdayCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);

        String result = mailBox.addMailInfo(mailInfo);

        assertEquals("Mail Info added successfully.", result);
        assertEquals(1, mailBox.getInfos().size());
        assertEquals(mailInfo, mailBox.getInfos().get(0));
    }

    @Test
    public void testSendAll() {
        MailBox mailBox = new MailBox();
        mailBox.setInfos(new ArrayList<>()); // Initialize the list

        Client client1 = new Client("test1@example.com", "John Doe", LocalDate.of(1990, 1, 1), "male");
        BirthdayCode mailCode1 = new BirthdayCode();
        MailInfo mailInfo1 = new MailInfo(client1, mailCode1);

        Client client2 = new Client("test2@example.com", "Jane Doe", LocalDate.of(1992, 2, 2), "female");
        ScamCode mailCode2 = new ScamCode();
        MailInfo mailInfo2 = new MailInfo(client2, mailCode2);

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        String result = mailBox.sendAll();

        assertEquals("Successfully sent all emails.", result);
    }
}