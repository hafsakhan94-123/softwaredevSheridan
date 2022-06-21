package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new Desk(1234567890);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567890);
        timsPhone.answer();

        timsPhone = new MobilePhone(12345);
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();
    }
}
