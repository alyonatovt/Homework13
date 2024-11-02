package app;

public class PrinterImpl implements Printer {
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (isEmptyMessage(message)) {
            handleEmptyMessage();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("An anonymous user sent a message: " + message.getText());
        } else {
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
        }
    }

    // Перевірка, чи є повідомлення пустим
    private boolean isEmptyMessage(Message message) {
        return (message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty());
    }

    // Обробка пустого повідомлення
    private void handleEmptyMessage() {
        System.out.println("An empty message from an anonymous user is being processed...");
    }
}



