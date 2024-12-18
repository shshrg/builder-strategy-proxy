package ua.ucu.edu.apps.task2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class MailBox {
    private List<MailInfo> infos;
    private MailSender sender = new MailSender();

    public String addMailInfo(MailInfo info) {
        infos.add(info);
        return "Mail Info added successfully.";
    }

    public String sendAll() {
        for (MailInfo info : infos) {
            sender.sendMail(info);
        }
        return "Successfully sent all emails.";
    }
}
