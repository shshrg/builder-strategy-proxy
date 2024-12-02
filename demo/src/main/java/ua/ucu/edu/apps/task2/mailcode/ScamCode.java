package ua.ucu.edu.apps.task2.mailcode;

import ua.ucu.edu.apps.task2.Client;

public class ScamCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Hello %s! You just won 1,000,000 USD! Please send us 100 USD to get your prize!", client);
    }
}
