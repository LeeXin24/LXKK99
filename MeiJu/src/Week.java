public enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");

    private String name;

    public boolean isWeekDay(){
        if (values().length <= 5) {
            System.out.println(this.name+" is WeekDay");
        }
        return true;
    }
    public boolean isHoliday(){
        if (values().length > 5 && values().length <= 7) {
            System.out.println(this.name+" is Holiday");
        }
        return false;
    }
    Week(String name) {
        this.name = name;
    }
}
class  Test{

    public static void main(String[] args) {
        Week saturday = Week.SATURDAY;
        Week sunday = Week.SUNDAY;
        Week[] values = Week.values();
        {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(values[i] + " " + "is WeekDay");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        {
            System.out.println(saturday+" is Holiday");
        }
        {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
        {
            System.out.println(sunday+" is Holiday");
        }
    }
}