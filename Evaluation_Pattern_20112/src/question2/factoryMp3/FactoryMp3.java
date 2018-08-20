package question2.factoryMp3;

import question2.interfaces.IAudio;
import question2.interfaces.IFactoryPlayer;
import question2.interfaces.IVideo;

public class FactoryMp3 implements IFactoryPlayer{
    private IAudio mp3;
    private IVideo video;
    private static FactoryMp3 instance;
    
    private FactoryMp3(){
        this.mp3 = new Mp3();
        this.video = new VideoMp3();
    }
    
    public static FactoryMp3 getInstance(){
        if(instance == null)
            instance = new FactoryMp3();
        return instance;
    }

    @Override
    public IAudio createMusic() {
        return this.mp3;
    }

    @Override
    public IVideo createVideo() {
        return this.video;
    }
       
}
