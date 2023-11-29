package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_6;

import java.util.Scanner;

class TurnArabicToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your arabic number from 1 to 10: ");
        int arabicnumber = scanner.nextInt();

        switch (arabicnumber) {
            case 1: System.out.println("Roman number: I");
                break;
            case 2: System.out.println("Roman number: II");
                break;
            case 3: System.out.println("Roman number: III");
                break;
            case 4: System.out.println("Roman number: IV");
                break;
            case 5: System.out.println("Roman number: V");
                break;
            case 6: System.out.println("Roman number: VI");
                break;
            case 7: System.out.println("Roman number: VII");
                break;
            case 8: System.out.println("Roman number: VIII");
                break;
            case 9: System.out.println("Roman number: IX");
                break;
            case 10: System.out.println("Roman number: X");
                break;
            default: System.out.println("You need enter numbers from 1 to 10");
        }
    }
}
