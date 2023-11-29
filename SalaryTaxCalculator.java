package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_6;

class SalaryTaxCalculator {

    public double calculate1(double salary1) {
        double tax = 0;
        if (salary1 < 0) {
            tax = 0;
        } return tax;
    }
    public double calculate2(double salary2) {
        double tax = 0;
        if (salary2 < 10000) {
            tax = (salary2 / 100) * 30;
        }return tax;
    }


    public double calculate3(double salary3) {
        double tax = 0;
        if ((salary3 >= 10000) && (salary3 < 50000)) {
            tax = 3000 + (((salary3 - 10000) / 100) * 40);}
        return tax;
    }

    public double calculate4(double salary4) {
        double tax = 0;
        if (salary4 >= 50000) {
            tax = 19000 + (((salary4 - 50000) / 100) * 50);}
        return tax;
    }

}
