public class Test2 {
    public static void main(String[] args) {

        /*boolean abc, bool;
        String phrase = "No news is good news";
        int x = 34;
        int y = 15;
        int z = 27;
        double d= 3/2*3+3.0/2*3;
        System.out.println(d);
        int q, r , s;

        abc= y<x && false || z !=y && true;
        System.out.println(abc);
        bool = y<x && false || z!=y && true;
        System.out.println(bool);

        boolean student;
        String name = "hafsa";

        boolean alpha = !(false && name.length() <5);
        System.out.println(alpha);
        System.out.println(phrase.substring(3,7).toUpperCase());
        System.out.println(phrase.replace('n','s') + phrase);

        String s1 = "13579";
        int i = 0;
        do {
            System.out.println(s1);
            i++;
        }while (i>5);
        System.out.println(i);

        String s2 ="abc";
        s2 = s2 + s2 + s2;

        while (s2.lastIndexOf('c') > s2.indexOf('c')){
            s2 = s2.substring(2);
            if (s2.charAt(0) !='c')
                System.out.println(s2);
        }

       for (int num= 0 ; num < 4 ; num++)
            System.out.println(" " + num + 1);
        System.out.println();
        System.out.println("Done");

        /*int num = 0;
        while (num<4){
            System.out.println(" " + num + 1);
            num++;
        }
        System.out.println();
        System.out.println("Done");*/

        int xx = 54;
        int yy =6;
        int qq= 0;
        while ((xx>=yy) && (qq<yy)){
            xx -= yy;
            qq++;
            System.out.println();

        }
        multiply(4);
        System.out.println();
        modifyFormat("10 Oct 13");

    }
    public static void multiply(int number){
        for(int m = 1; m<=number ; m++){
            System.out.println();
            for (int n =1 ; n<= number ; n++){
                int res = m*n;
                System.out.print(m + "*" + n + "=" + res + ";");

            }
        }
    }
    public static void modifyFormat(String date){

        String s1 = date.substring(0,2);
        String s2 = date.substring(3,6);
        String s3 = date.substring(7);

        System.out.println(s2 + " " + s1 + ", " + "20" + s3);

    }
}

