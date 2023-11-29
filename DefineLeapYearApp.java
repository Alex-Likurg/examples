package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_2;

public class DefineLeapYearApp {
    public static void main(String[] args) {
        DefineLeapyear youryear = new DefineLeapyear();

        System.out.println("Is this year leap?: " + youryear.year(1000));
        System.out.println("Is this year leap?: " + youryear.year(1760));
        System.out.println("Is this year leap?: " + youryear.year(1921));
        System.out.println("Is this year leap?: " + youryear.year(1958));
        System.out.println("Is this year leap?: " + youryear.year(1997));
        System.out.println("Is this year leap?: " + youryear.year(2016));

    }
}
