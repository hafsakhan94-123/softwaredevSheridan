package ArrayListAutoboxindUnboxing;

import java.util.ArrayList;

class intClass {
    public int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public intClass(int myValue) {
        this.myValue = myValue;
    }

}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");
        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(22);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "--->" + intArrayList.get(i).intValue());
        }
        Integer myIntValue = 56;
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValue.add(Double.valueOf(dbl));
        }
        for (int i = 0; i < myDoubleValue.size(); i++) {
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i + "--->" + doubleValue);
        }
    }


}









