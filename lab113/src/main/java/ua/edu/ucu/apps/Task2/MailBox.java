package ua.edu.ucu.apps.Task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private MailSender mailSender;
    private List<MailInfo> infos;

    public MailBox() {
        this.infos = new ArrayList<>();
        this.mailSender = MailSender.getInstance();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            String clientEmail = info.getClient().getEmail();
            mailSender.sendMail(clientEmail, info);
        }
    }
}