package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_7;

class CompoundInterestCalculator {

    public double CompoundInterest(double sum,
                                   double interest,
                                   double year){
        return sum * Math.pow((1 + interest / 100), year);
    }

}
