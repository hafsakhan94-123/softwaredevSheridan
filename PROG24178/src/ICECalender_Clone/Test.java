package ICECalender_Clone;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2020, 2,
                1);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar) calendar.clone();
        System.out.println("calendar == calendar1 is " + (calendar == calendar1));
        System.out.println("calendar == calendar2 is " + (calendar == calendar2));
        System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2));
        System.out.println();
//        ArrayList<Double> list1 = new ArrayList<>();
//        list1.add(1.5);
//        list1.add(2.5);
//        list1.add(3.5);
//        ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
//        ArrayList<Double> list3 = list1;
//        list2.add(4.5);
//        list3.remove(1.5);
//        System.out.println("list1 is " + list1);
//        System.out.println("list2 is " + list2);
//        System.out.println("list3 is " + list3);
//        System.out.println();

        int[] list1 = {1, 2};
        int[] list2 = list1.clone();
        list1[0] = 7;
        list2[1] = 8;
        System.out.println("list1 is " + list1[0] + ", " + list1[1]);
        System.out.println("list2 is " + list2[0] + ", " + list2[1]);
        System.out.println();

        House house1 = new House(112, 120);
        House house3 = (House) house1.clone();
        System.out.println(house1 == house3);
        System.out.println(house1.getWhenBuilt() == house3.getWhenBuilt());
        System.out.println(house1.equals(house3)); //same as ==. override equals in house class to compare values of house1 and house2


    }
}
