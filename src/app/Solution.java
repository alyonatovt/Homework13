package app;

public class Solution {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        PrinterImpl.Message message1 = new PrinterImpl.Message("Hi!", "Miranda");
        PrinterImpl.Message message2 = new PrinterImpl.Message("What's up?", null);
        PrinterImpl.Message message3 = new PrinterImpl.Message(null, null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
    }
}
