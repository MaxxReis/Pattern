package question2.factoryVideo;

import question2.interfaces.IAudio;
import question2.interfaces.IFactoryPlayer;
import question2.interfaces.IVideo;

public class FactoryMp4 implements IFactoryPlayer{
    private IAudio audio;
    private IVideo video;
    private static FactoryMp4 instance;
    
    private FactoryMp4(){
        this.audio = new Mp4();
        this.video = new VideoMp4();
    }
    
    public static FactoryMp4 getInstance(){
        if(instance == null)
            instance = new FactoryMp4();
        return instance;
    }
    
    @Override
    public IAudio createMusic() {
        return this.audio;
    }

    @Override
    public IVideo createVideo() {
        return this.video;
    }
   
    
}
