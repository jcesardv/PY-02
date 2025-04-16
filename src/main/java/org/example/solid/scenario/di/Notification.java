package org.example.solid.scenario.di;

// -> Notification
public class Notification {

    private EmailService emailService;

    public Notification() {
        this.emailService = new EmailService(); // X dependencia directa
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }

}
