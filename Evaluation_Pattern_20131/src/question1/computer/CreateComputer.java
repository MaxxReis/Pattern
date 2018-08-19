package question1.computer;

import question1.interfaces.IAuthenticator;
import question1.interfaces.IOpenID;

public class CreateComputer implements IOpenID{
    private IAuthenticator authenticator;
    private static CreateComputer instance;
    
    private CreateComputer(){
        this.authenticator = new Computer();
    }
    
    public static CreateComputer getInstance(){
        if(instance == null)
            return instance = new CreateComputer();
        return instance;
    }
    
    @Override
    public IAuthenticator getAuthenticate() {
        return this.authenticator;
    }
    
}
