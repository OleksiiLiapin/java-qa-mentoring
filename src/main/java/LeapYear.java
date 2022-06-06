public class LeapYear {
    private int year;
    public LeapYear (int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
