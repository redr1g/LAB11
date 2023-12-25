package ua.edu.ucu.apps.Task2;

public class BirthdayStructure implements MailStructure {

    @Override
    public String text(Client client) {
        return "Congratulations to " 
        + client.getName() + " on his"
        + client.getAge() + "-th birthday!!";
    }

    @Override
    public String getStructure() {
        return "B-DAY";
    }
    
}
