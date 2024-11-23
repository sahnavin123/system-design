package Solid;
// Class should be on interfaces rather than concrete classes

interface Keyboard {
    void wiredKeyboard();

    void blueToothKeyboard();
}

interface Mouse {
    void wiredMouse();

    void blueToothMouse();
}

class MacBook {
    private final Keyboard Keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.Keyboard = keyboard;
        this.mouse = mouse;
    }
}

// another example from chat gpt

// Abstraction
interface MessageService {
    void sendMessage(String message);
}

// Concrete Implementations
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// High-level Module
class NotificationService {
    private final MessageService messageService;

    // Dependency is injected via the constructor
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}
