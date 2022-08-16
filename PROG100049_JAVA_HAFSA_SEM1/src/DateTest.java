public class DateTest {
    // main method begins program execution
    public static void main(String[] args) {
        // create Date object
        Date date1 = new Date();
        Date date2 = new Date(2011, 2, 11);

        //display the default values
        System.out.printf("Default date\nYear: %d, month: %d, day: %d\n", date1.getYear(), date1.getMonth(), date1.getDay());

        date1.setYear(1954);
        date1.setDay(100);
        date1.setMonth(13);

        System.out.print("Modified date1: ");
        date1.displayDate();

        System.out.print("date2: ");
        date2.displayDate();
    }
}
