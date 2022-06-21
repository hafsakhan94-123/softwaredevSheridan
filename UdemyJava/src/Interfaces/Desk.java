package Interfaces;

public class Desk implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public Desk(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken. This phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {

        System.out.println("Now ringing " + phoneNumber + " on desk phone.");

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone.");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Ring ring");
        }else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public static class MobilePhone implements ITelephone {

        private int myNumber;
        private boolean isRinging;
        private boolean isOn = false;

        public MobilePhone(int myNumber) {
            this.myNumber = myNumber;
        }

        @Override
        public void powerOn() {
            isOn = true;
            System.out.println("Mobile phone powered on.");
        }

        @Override
        public void dial(int phoneNumber) {
            if (isOn){
                System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
            }else{
                System.out.println("Phone is switched off.");
            }


        }

        @Override
        public void answer() {
            if (isRinging){
                System.out.println("Answering the desk phone.");
                isRinging=false;
            }

        }

        @Override
        public boolean callPhone(int phoneNumber) {
            if (phoneNumber==myNumber && isOn){
                isRinging=true;
                System.out.println("Melody ring");
            }else {
                isRinging=false;
            }
            return isRinging;
        }

        @Override
        public boolean isRinging() {
            return isRinging;
        }
    }
}
