package ua.ucu.edu.apps.task2;

import ua.ucu.edu.apps.task2.mailcode.MailCode;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }

    public String getEmail() {
        return client.getEmail();
    }
}
