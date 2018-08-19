package question2.computer;

import question2.interfaces.IStreaming;

public class Streamer implements IStreaming{
    @Override
    public String receiver() {
        return "Streaming now...";
    }
}
