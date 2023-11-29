package lv.javaguru.java1.student_alexey_kosmachev.lesson_3.homework.day_7;

//Music box
class MusicBox {

    private String model;
    private int soundLevel;
    private boolean switchOnOff;

    public MusicBox(String model, int soundLevel, boolean switchOff) {
        this.model = model;
        this.soundLevel = soundLevel;
        this.switchOnOff = switchOff;
    }



    public String getModel() {
        return model;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public String isSwitchOn() {
        int SoundSwitchOn = getSoundLevel() + 1;
        if (SoundSwitchOn > 0 ) {return "SwitchOn";}
        else {
            return "SwitchOff";
        }
    }

    public void setSoundLevel(int soundLevel) {this.soundLevel = soundLevel;}

    public String SoundLevelPlus1() {
        if (soundLevel >= 1) return Integer.toString (soundLevel + 1);
        else return "Please SwitchOn the Music Box";
    }

    public String isSwitchOff() {
        int soundLevel = 0;
        if (soundLevel == 0) {return "SwitchOff";}
        else {return "Music Box is still SwitchOn";}
    }
}
