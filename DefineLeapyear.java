package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_2;

class DefineLeapyear {
    public String year (int year) {
        if ((year > 1584) && (year % 400 ==0) || (year %4 == 0 && year % 100 != 0)) {
            return "This is a leap year"; }
        else return "This is not a leap year";
    }
}
