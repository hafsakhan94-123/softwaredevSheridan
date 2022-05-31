import java.util.*;
public class Ex_15A {
    public static void main(String[] args) {
        int [] foo = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int [] bar = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3};
        int [] baz = new int[11];

        /*int sum = 0;
        for(int i = 0; i<foo.length ; i++){

            baz[i] = foo[i] + bar[i];
        }
        for (int i = 0 ; i < foo.length ; i++){
            System.out.println(baz[i]);
        }
        for(int i = 0 ; i < bar.length ; i++) {
            if (bar[i] % 2 != 0) {
                bar[i] = 0;
            }
        }
        for(int i = 0; i < bar.length ; i++){

            System.out.println(bar[i]);

        }*/
        String [] foo1 = {"Incline", "Screw", "Pulley", "Lever", "Wedge", "Wheel"};
        String [] bar1 = {"Incline", "Screw", "Pulley", "Lever", "Wedge", "Wheel"};
        String [] baz1 = bar1;
        String test = "test";
        /*for (int i=0;i<foo1.length;i++){

            if (foo1[i] == bar1[i])
                System.out.println("Array at position "+i+" is equal");*/

        for (int i = 0; i < bar1.length; i++) {
            bar1[i] = bar1[i].toUpperCase();
            System.out.println(bar1[i] + " " + baz1[i]);
        }
    }

    public static void rotate(int [] data, int amount) {



    }

        }



