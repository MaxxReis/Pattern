package question2.factoryVideo;

import question2.interfaces.IVideo;

public class VideoMp4 implements IVideo{
    @Override
    public void playVideo() {
        System.out.println("Playing mp4 video...");
    }
}
