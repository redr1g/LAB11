package ua.edu.ucu.apps.Task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.transactional.SendContact;
import com.mailjet.client.transactional.SendEmailsRequest;
import com.mailjet.client.transactional.TrackOpens;
import com.mailjet.client.transactional.TransactionalEmail;

import lombok.SneakyThrows;

public class MailSender {
    private static MailSender instance;
    private MailjetClient client;

    private MailSender() {
        initializeMailjetClient();
    }
    
    private void initializeMailjetClient() {
        ClientOptions clientOptions = ClientOptions.builder()
                .apiKey("a0285d85c78fd515e4d8d4c7b95f074a")
                .apiSecretKey("1e79db8c324baa371c976dd2303e10cd")
                .build();
        client = new MailjetClient(clientOptions);
    }
    
    public static MailSender getInstance() {
        return (instance == null) ? new MailSender() : instance;
    }

    @SneakyThrows
    public void sendMail(String clientEmail, MailInfo mailInfo) {
        TransactionalEmail message = TransactionalEmail
                .builder()
                .to(new SendContact(clientEmail))
                .from(new SendContact("lol.niztiak@gmail.com"))
                .htmlPart(mailInfo.write())
                .subject(mailInfo.getStructure())
                .trackOpens(TrackOpens.ENABLED)
                .build();
        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message)
                .build();

        request.sendWith(client);
    }
}
