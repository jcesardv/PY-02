package org.example.solid.solution.di;

public class Main {

    public static void main(String[] args) {
        MessageService service = new EmailService();
        Notification notification = new Notification(service);

        notification.send("¡Hola desde SOLID!");
    }
}

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {

    @Override public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSService implements MessageService {

    @Override public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class Notification {
    private MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}