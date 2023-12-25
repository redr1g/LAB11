package ua.edu.ucu.apps.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;                                                                                                      
    private MailStructure mailStructure;

    public String write() {
        return mailStructure.text(client);
    }

    public String getStructure() {
        return mailStructure.getStructure();
    }
}
