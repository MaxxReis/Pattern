package question2.factoryVideo;

import question2.interfaces.IAudio;

public class Mp4 implements IAudio{
    @Override
    public void playAudio() {
        System.out.println("Playing mp4 song...");
    }
}
