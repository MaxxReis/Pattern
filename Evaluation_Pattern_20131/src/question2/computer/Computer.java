package question2.computer;

import question2.interfaces.IPlay;
import question2.interfaces.IPost;
import question2.interfaces.IStreaming;
import question2.interfaces.ITransmition;

public class Computer implements ITransmition{
    private IPlay playVideo;
    private IStreaming streamierVideo;
    private IPost posterMessage;
    private static Computer instance;
    
    private Computer(){
        this.playVideo = new Play();
        this.streamierVideo = new Streamer();
        this.posterMessage = new Post();
    }

    public static Computer getInstance(){
        if(instance == null)
            return instance = new Computer();
        return instance;
    }

    @Override
    public IPlay getPlay() {
        return this.playVideo;
    }

    @Override
    public IStreaming getStreaming() {
        return this.streamierVideo;
    }

    @Override
    public IPost getPost() {
        return this.posterMessage;
    }
    
}
