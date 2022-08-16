public class Date {
    private int year;   //by default, this is 0
    private int day;    // 0
    private int month;  // 0

    /**
     * No-argument constructor: initialize the date to Jan. 1, 1900
     */
    public Date() {
        year = 1900;
        day = 1;
        month = 1;
    }

    /**
     * Parameterized constructor: initialize the date to monthArg, dayArg, yearArg
     * using the mutator methods
     */
    public Date(int yearArg, int monthArg, int dayArg) {
        setYear(yearArg);
        setMonth(monthArg);
        setDay(dayArg);
    }

    public void setDay(int dayVal) {
        if (dayVal > 31 || dayVal < 1)
            System.out.println("invalid date");
        else
            day = dayVal;
    }

    public void setMonth(int monthVal) {
        if (monthVal > 12 || monthVal < 1) {
            System.out.println("Invalid month");
        } else
            month = monthVal;
    }

    public void setYear(int yearVal) {
        year = yearVal;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public void displayDate() {
        System.out.printf("%d/%d/%d\n", month, day, year);
    }


}

