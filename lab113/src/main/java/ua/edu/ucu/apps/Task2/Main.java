package ua.edu.ucu.apps.Task2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Bogdan", 16, Gender.MALE, "taras.gaming198@gmail.com");
        MailInfo mailInfo = new MailInfo(client, new BirthdayStructure());
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();
    }
}
