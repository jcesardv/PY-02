package org.example.solid;

// -> Notification
public class DependencyInversionScenario {

    private EmailService emailService;

    public DependencyInversionScenario() {
        this.emailService = new EmailService(); // X dependencia directa
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }

}
