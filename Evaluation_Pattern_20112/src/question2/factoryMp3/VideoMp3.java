package question2.factoryMp3;

import question2.interfaces.IVideo;

public class VideoMp3 implements IVideo{
    @Override
    public void playVideo() {
        System.out.println("Playing mp3 video...");
    }
}
