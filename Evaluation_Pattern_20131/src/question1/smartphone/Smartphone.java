package question1.smartphone;

import question1.interfaces.IAuthenticator;

public class Smartphone implements IAuthenticator{
    @Override
    public boolean authenticate(String name, String serie) {
        return (name != "" && serie != "");
    }
}
