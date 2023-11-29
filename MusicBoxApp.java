package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

// Music box App
class MusicBoxApp {

    public static void main(String[] args) {
        MusicBox musicBox1 = new MusicBox("Sony",0, true);

        System.out.println("Music box is" + musicBox1.isSwitchOn());
        musicBox1.setSoundLevel(1);
        System.out.println("Music Box Sound level is increased. Now it is " + musicBox1.SoundLevelPlus1());
        System.out.println("Music box sound level is " + musicBox1.getSoundLevel());
        System.out.println("Music box is " + musicBox1.isSwitchOff());


    }
}
