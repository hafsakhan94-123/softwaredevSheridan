import java.lang.reflect.Method;
import java.util.ArrayList;

public class PracticeWithMethods {
    //***********************************************************************
    //* Add your methods here!
    //***********************************************************************


    public static int summation(int abc) {
        int sum = 0;
        if (abc >= 0) {
            for (int i = 0; i <= abc; i++) {
                sum += i;
            }
        } else return -1;
        return sum;
    }


    public static String echo(String msg, int newNumber) {

        int i;
        String repeat = "";

        for (i = 1; i <= newNumber; i++) {
            //do{
            //i++;
            repeat += msg;
        }
        //while (i <= newNumber);
        return repeat;
    }

    public static String shoutWhisper(String sentence) {

        String newSentence = sentence.toUpperCase() + sentence.toLowerCase();
        return newSentence;
    }

    public static String capitalize(String words) {
        if (words.isEmpty())
            return words = "";
        else {

            String newWords = words.substring(0, 1).toUpperCase() + words.substring(1).toLowerCase();

            return newWords;
        }
    }

    public static float maxAbs3(float num1, float num2, float num3) {

        float max = Math.abs(num1);

        if (num1 == num2 && num2 == num3) {
            max = num1;
        }
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            if (Math.abs(num1) > Math.abs(num2) && Math.abs(num1) > Math.abs(num3)) {
                max = num1;
            } else if (Math.abs(num2) > Math.abs(num1) && Math.abs(num2) > Math.abs(num3)) {
                max = num2;
            } else if (Math.abs(num3) > Math.abs(num1) && Math.abs(num3) > Math.abs(num2)) {
                max = num3;
            }
        } else if (Math.abs(num1) == Math.abs(num2) || Math.abs(num2) == Math.abs(num3) || Math.abs(num1) == Math.abs(num3)) {

            if (Math.abs(num2) > max) {
                max = Math.abs(num2);
            } else if (Math.abs(num3) > max) {
                max = Math.abs(num3);
            }
        }
        return max;
    }


    //*************************************************************************************
    //* Please don't change anything below this comment.  You'll likely mess up the tests!
    //*************************************************************************************

    public static void main(String[] args) {

        testSummation();
        testEcho();
        testShoutWhisper();
        testCapitalize();
        if (complete()) {
            System.out.println("Congratulations!  All tests pass!");
        }
        checkOptional();
    }


    static int extrasDone = 0;
    static ArrayList<String> missingMethods = new ArrayList<String>();
    static ArrayList<String> optionalWrongSig = new ArrayList<String>();


    /*
     * Data used for method testing
     */
    static int[] expectedSummations = {0, 1, 3, 6, 10, 15, 21, 28, 36, 45};
    static String[] testStringArgs = {"Foo", "BAR", "Hello World!", "ECHO ", "Is there anybody out there?", "Baz", ""};
    static int[] echoIntArgs = {1, 2, 3, 4, 5, 0, 3};
    static String[] expectedEchoes = {"Foo", "BARBAR", "Hello World!Hello World!Hello World!", "ECHO ECHO ECHO ECHO ",
            "Is there anybody out there?Is there anybody out there?Is there anybody out there?Is there anybody out there?Is there anybody out there?",
            "", ""};
    static String[] expectedShouts = {"FOOfoo", "BARbar", "HELLO WORLD!hello world!", "ECHO echo ",
            "IS THERE ANYBODY OUT THERE?is there anybody out there?", "BAZbaz", ""};
    static String[] expectedCaps = {"Foo", "Bar", "Hello world!", "Echo ", "Is there anybody out there?", "Baz", ""};
    static int[][] gcdLcmArgs = {{1, 3}, {5, 15}, {38, 22}, {100, 42}, {1024, 768}, {543660, 482460}, {100000000, 100000000}};
    static int[] expectedGcds = {1, 5, 2, 2, 256, 1020, 100000000};
    static int[] expectedLcms = {3, 15, 418, 2100, 3072, 257151180, 100000000};
    static float[][] absMaxInputs = {{0, 0, 0}, {-1, 0, 0}, {0, -1, 0}, {0, 0, -1}, {-2, 2, 2}, {2, -2, 2}, {2, 2, -2}, {-2, -2, -2}, {5, 2, -17},
            {17, -16, 5}, {-3, 1, 4}};
    static float[] absMaxOutputs = {0, -1, -1, -1, 2, 2, 2, -2, -17, 17, 4};


    static void printTest(String fname) {
        System.out.print("  Testing " + fname);
        for (int i = fname.length(); i < 50; i++) {
            System.out.print(".");
        }
        System.out.flush();
    }

    static void checkOptional() {
        testAbsMax();
        if (!optionalWrongSig.isEmpty()) {
            System.out.println("The following optional methods have incorrect parameters or return value types:");
            for (String s : optionalWrongSig) {
                System.out.println("   " + s);
            }
        }

        if (extrasDone == 1) {
            System.out.println("Congratulations! You've successfully written the optional method as well!");
        }

    }

    static boolean complete() {
        if (!missingMethods.isEmpty()) {
            System.out.println("The following methods are not yet implemented, or " +
                    "are not implemented with the correct parameters or return types");
            for (String s : missingMethods) {
                System.out.println("  " + s);
            }
            return false;
        }
        return true;
    }

    static void fail(String fname, String returned, String expected) {
        System.out.println("failed!");
        System.out.print(fname);
        System.out.print(" returned ");
        System.out.print(returned);
        System.out.print(" but it should return ");
        System.out.println(expected);
        System.exit(-1);
    }

    static void testSummation() {

        Method meth = null;
        try {

            Object[] args = new Object[1];
            args[0] = new Integer(0);
            Class<?>[] tmp = new Class[1];
            tmp[0] = Integer.TYPE;
            meth = PracticeWithMethods.class.getDeclaredMethod("summation", tmp);
            Object ret = meth.invoke(null, args);
            if (!(ret instanceof Integer)) {
                missingMethods.add("summation");
                return;
            }
        } catch (NoSuchMethodException e) {
            missingMethods.add("summation");
            return;
        } catch (IllegalArgumentException e) {
            missingMethods.add("summation");
            return;
        } catch (Exception e) {
            throw new Error(e);
        }
        System.out.println("Found correctly declared method summation");
        for (int i = 0; i < expectedSummations.length; i++) {
            String fname = "summation(" + i + ")";
            printTest(fname);
            Object[] args = new Object[1];
            args[0] = new Integer(i);
            Object tmp = null;
            try {
                tmp = meth.invoke(null, args);
            } catch (Exception e) {
                throw new Error(e);
            }
            int ret = (Integer) tmp;
            if (ret != expectedSummations[i]) {
                fail(fname, "" + ret, "" + expectedSummations[i]);
            } else {
                System.out.println("passed!");
            }
        }
    }

    static void testEcho() {
        assert (testStringArgs.length == echoIntArgs.length && echoIntArgs.length == expectedEchoes.length);
        Method meth = null;
        try {

            Object[] args = new Object[2];
            args[0] = new String("test");
            args[1] = new Integer(0);
            Class<?>[] tmp = new Class[2];
            tmp[0] = String.class;
            tmp[1] = Integer.TYPE;
            meth = PracticeWithMethods.class.getDeclaredMethod("echo", tmp);
            Object ret = meth.invoke(null, args);
            if (!(ret instanceof String)) {
                missingMethods.add("echo");
                return;
            }
        } catch (NoSuchMethodException e) {
            missingMethods.add("echo");
            return;
        } catch (IllegalArgumentException e) {
            missingMethods.add("echo");
            return;
        } catch (Exception e) {
            throw new Error(e);
        }
        System.out.println("Found correctly declared method echo");
        Object[] args = new Object[2];
        for (int i = 0; i < testStringArgs.length; i++) {
            String fname = "echo(\"" + testStringArgs[i] + "\", " + echoIntArgs[i] + ")";
            printTest(fname);
            args[0] = testStringArgs[i];
            args[1] = echoIntArgs[i];
            String e;
            try {
                e = (String) meth.invoke(null, args);
            } catch (Exception e1) {
                throw new Error(e1);
            }
            if (e.equals(expectedEchoes[i])) {
                System.out.println("passed!");
            } else {
                fail(fname, "\"" + e + "\"", "\"" + expectedEchoes[i] + "\"");
            }
        }
    }


    static void testShoutWhisper() {
        Method meth = null;
        try {

            Object[] args = new Object[1];
            args[0] = new String("Test");
            Class<?>[] tmp = new Class[1];
            tmp[0] = String.class;
            meth = PracticeWithMethods.class.getDeclaredMethod("shoutWhisper", tmp);
            Object ret = meth.invoke(null, args);
            if (!(ret instanceof String)) {
                missingMethods.add("shoutWhisper");
                return;
            }
        } catch (NoSuchMethodException e) {
            missingMethods.add("shoutWhisper");
            return;
        } catch (IllegalArgumentException e) {
            missingMethods.add("shoutWhisper");
            return;
        } catch (Exception e) {
            throw new Error(e);
        }
        System.out.println("Found correctly declared method shoutWhisper");
        assert (testStringArgs.length == expectedShouts.length);
        Object[] args = new Object[1];
        for (int i = 0; i < testStringArgs.length; i++) {
            String fname = "shoutWhisper(\"" + testStringArgs[i] + "\")";
            printTest(fname);
            args[0] = testStringArgs[i];
            String ret;
            try {
                ret = (String) meth.invoke(null, args);
            } catch (Exception e) {
                throw new Error(e);
            }
            if (ret.equals(expectedShouts[i])) {
                System.out.println("passed!");
            } else {
                fail(fname, "\"" + ret + "\"", "\"" + expectedShouts[i] + "\"");
            }
        }
    }

    static void testCapitalize() {
        Method meth = null;
        try {

            Object[] args = new Object[1];
            args[0] = new String("Test");
            Class<?>[] tmp = new Class[1];
            tmp[0] = String.class;
            meth = PracticeWithMethods.class.getDeclaredMethod("capitalize", tmp);
            Object ret = meth.invoke(null, args);
            if (!(ret instanceof String)) {
                missingMethods.add("capitalize");
                return;
            }
        } catch (NoSuchMethodException e) {
            missingMethods.add("capitalize");
            return;
        } catch (IllegalArgumentException e) {
            missingMethods.add("capitalize");
            return;
        } catch (Exception e) {
            throw new Error(e);
        }
        System.out.println("Found correctly declared method capitalize");
        assert (expectedCaps.length == testStringArgs.length);
        for (int i = 0; i < testStringArgs.length; i++) {
            String fname = "capitalize(\"" + testStringArgs[i] + "\")";
            printTest(fname);
            Object[] args = new Object[1];
            args[0] = testStringArgs[i];
            String ret = null;

            try {
                ret = (String) meth.invoke(null, args);
            } catch (Exception e) {
                throw new Error(e);
            }
            if (ret.equals(expectedCaps[i])) {
                System.out.println("passed!");
            } else {
                fail(fname, "\"" + ret + "\"", "\"" + expectedCaps[i] + "\"");
            }

        }
    }


    /*
     * Return true if a method with this name exists in the class (regardless of
     * whether the signature is otherwise correct
     */
    static boolean findOptional(String methname) {
        Method[] allMethods = PracticeWithMethods.class.getDeclaredMethods();
        for (Method m : allMethods) {
            if (m.getName().equals(methname)) {
                System.out.println("Found optional method " + methname);
                return true;
            }
        }
        return false;
    }


    static void testAbsMax() {
        if (!findOptional("maxAbs3")) return;
        assert (absMaxInputs.length == absMaxOutputs.length);
        Method meth = null;
        try {

            Object[] args = new Object[3];
            Class<?>[] tmp = new Class[3];
            for (int i = 0; i < 3; i++) {
                tmp[i] = Float.TYPE;
                args[i] = new Float(1);
            }
            meth = PracticeWithMethods.class.getDeclaredMethod("maxAbs3", tmp);

            Object ret = meth.invoke(null, args);
            if (!(ret instanceof Float)) {
                optionalWrongSig.add("maxAbs3");
                return;
            }
        } catch (NoSuchMethodException e) {
            optionalWrongSig.add("maxAbs3");
            return;
        } catch (IllegalArgumentException e) {
            optionalWrongSig.add("maxAbs3");
            return;
        } catch (Exception e) {
            throw new Error(e);
        }
        for (int i = 0; i < absMaxInputs.length; i++) {
            String fname = "maxAbs3(" + absMaxInputs[i][0] + ", " + absMaxInputs[i][1] + ", " + absMaxInputs[i][2] + ")";
            printTest(fname);
            float ret;
            Object[] args = new Object[3];
            for (int j = 0; j < 3; j++) args[j] = absMaxInputs[i][j];
            try {
                ret = (Float) meth.invoke(null, args);
            } catch (Exception e) {
                throw new Error(e);
            }
            if (absMaxOutputs[i] == ret) {
                System.out.println("passed!");
            } else {
                fail(fname, "" + ret, "" + absMaxOutputs[i]);
            }

        }
        extrasDone++;

    }

}
