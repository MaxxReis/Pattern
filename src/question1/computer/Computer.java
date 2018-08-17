package question1.computer;

import question1.interfaces.IAuthenticator;

public class Computer implements IAuthenticator{
    @Override
    public boolean authenticate(String name, String serie) {
        return (name != "" && serie != "");
    }
}
