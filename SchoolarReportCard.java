package lv.javaguru.java1.student_alexey_kosmachev.lesson_5.homework.day_6;

class SchoolarReportCard {
    String nickname;
    int stage;


    public SchoolarReportCard(String nickname, int stage) {
        this.nickname = nickname;
        this.stage = stage;

    }
    public double average(int algebra, int geometry, int history, int physics, int chemistry) {
        double average = (algebra + geometry + history + physics + chemistry) / 5;
        { return average ; }
    }
    }









