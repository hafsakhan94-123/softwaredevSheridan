public class S4_MegaBytesConverter {
    public static void printMegaBytesandKiloBytes(int kiloBytes) {
        int mb, kb;
        boolean condition = (kiloBytes > 0) ? true : false;
        if (condition) {
            mb = kiloBytes / 1024;
            kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        } else
            System.out.println("Invalid");
    }

    public static void main(String[] args) {
        printMegaBytesandKiloBytes(1025);
        printMegaBytesandKiloBytes(2500);
        printMegaBytesandKiloBytes(-1025);
        printMegaBytesandKiloBytes(5000);
    }
}
