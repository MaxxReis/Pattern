package question2.computer;

import question2.interfaces.IPlay;

public class Play implements IPlay{
    private boolean play;

    public boolean isPlay() {
        return play;
    }

    @Override
    public String playVideo() {
        this.play = true;
        return "Video is Playing...";
    }

    @Override
    public String stopVideo() {
        this.play = false;;
        return "Video is stopped.";
    }
    
}
