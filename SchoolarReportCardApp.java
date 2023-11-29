package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_6;

class SchoolarReportCardApp {
    public static void main(String[] args) {
       SchoolarReportCard schoolar1 = new SchoolarReportCard("Goga",7);
       SchoolarReportCard schoolar2 = new SchoolarReportCard("Nastusha", 10);
       SchoolarReportCard schoolar3 = new SchoolarReportCard("Torchok", 9);
       SchoolarReportCard schoolar4 = new SchoolarReportCard("Gangsta", 8);

        System.out.println("Report Card number 1: ");
        System.out.println("Nickname: " + schoolar1.nickname + ", Stage: " + schoolar1.stage + ", Average Mark: " + schoolar1.average(4,3,3,5,2));
        System.out.println("Report Card number 2: ");
        System.out.println("Nickname: " + schoolar2.nickname + ", Stage: " + schoolar2.stage + ", Average Mark: " + schoolar2.average(8,9,7,8,10));
        System.out.println("Report Card number 3: ");
        System.out.println("Nickname: " + schoolar3.nickname + ", Stage: " + schoolar3.stage + ", Average Mark: " + schoolar3.average(3,4,2,10,4));
        System.out.println("Report Card number 4: ");
        System.out.println("Nickname: " + schoolar4.nickname + ", Stage: " + schoolar4.stage + ", Average Mark: " + schoolar4.average(6,6,9,3,2));

    }
 }
