public class S4_BarkingDog {
    public static boolean shouldWakeUp(boolean bark, int time) {
        if (bark) {
            boolean inputcheck = (time >= 0 && time <= 23) ? true : false;
            if (inputcheck) {
                boolean timecondition = (time < 10 || time > 22) ? true : false;
                if (timecondition)
                    System.out.printf("Wake Up ! Dog is Barking at 0" + time + "00 hours !");
                return true;
            }

        } else {
            System.out.println("Dog not Barking ! Dont Wake Up at " + time + "00 hours !");
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        shouldWakeUp(false, 10);
        shouldWakeUp(true, 9);
    }
}
