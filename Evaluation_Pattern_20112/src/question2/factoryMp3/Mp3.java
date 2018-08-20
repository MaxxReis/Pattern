package question2.factoryMp3;

import question2.interfaces.IAudio;

public class Mp3 implements IAudio{
    @Override
    public void playAudio() {
        System.out.println("Playing mp3 song...");
    }
}
