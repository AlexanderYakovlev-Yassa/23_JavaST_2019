package by.javatr.task2.logic;

public interface DateLogic {

    public int monthDayCount(Date date);
    public boolean isLeapYear(Date date);
    public Date createDate(int year, int month);
    public Date createDate();
}
