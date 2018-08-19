package question2.computer;

import question2.interfaces.IPost;

public class Post implements IPost{
    @Override
    public String postMessage(String message) {
        return message;
    }
}
