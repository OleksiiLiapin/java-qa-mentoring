public class Main {
    public static void main(String[] args) {
//        Block b = new Block(new int[]{2,4,6});
//        System.out.println(b.getWidth()); // -> 2);
//        System.out.println( b.getLength()); // -> 4);
//        System.out.println(b.getHeight()); // -> 6);
//        System.out.println(b.getVolume()); // -> 48);
//        System.out.println(b.getSurfaceArea()); // -> 88 );

        LeapYear year = new LeapYear(2032);
        LeapYear year2 = new LeapYear(1960);
        LeapYear year3 = new LeapYear(1993);
        LeapYear year4 = new LeapYear(2000);
        System.out.println("From instance. 2032 is leap year - " + LeapYear.isLeapYear(year.getYear()));
        System.out.println("From instance. 1960 is leap year - " + LeapYear.isLeapYear(year2.getYear()));
        System.out.println("From instance. 1993 is NOT leap year - " + LeapYear.isLeapYear(year3.getYear()));
        System.out.println("From instance. 2000 is leap year - " + LeapYear.isLeapYear(year4.getYear()));






    }

}
