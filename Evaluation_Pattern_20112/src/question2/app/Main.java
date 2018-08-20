package question2.app;

import question2.factoryMp3.FactoryMp3;
import question2.factoryVideo.FactoryMp4;
import question2.interfaces.IFactoryPlayer;

public class Main {
    public static void run(IFactoryPlayer player){
       player.createMusic().playAudio();
       player.createVideo().playVideo();
    }
    
    public static void main(String[] args) {
        run(FactoryMp4.getInstance());
    }
}
