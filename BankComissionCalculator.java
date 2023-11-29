package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_5;

import java.util.Scanner;

class BankComissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money amount you want to withdraw: ");
        int moneywithdraw = scanner.nextInt();

        if (moneywithdraw < 1000) {
            int comission = moneywithdraw/100 * 3 ;
            System.out.println("Your comission is: " + comission + " EUR");}

        if ((moneywithdraw >= 1000) && (moneywithdraw <= 5000 )) {
            int comission5K = moneywithdraw/100 * 4 ;
            System.out.println("Your comission is: " + comission5K + " EUR");}

        if (moneywithdraw > 5000) {
            int comissionmore5K = moneywithdraw/100 * 5 ;
            System.out.println("Your comission is: " + comissionmore5K + " EUR");}
    }
}
