package ua.ucu.edu.apps.task2.mailcode;

import ua.ucu.edu.apps.task2.Client;

public class BirthdayCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday!", client);
    }
}
