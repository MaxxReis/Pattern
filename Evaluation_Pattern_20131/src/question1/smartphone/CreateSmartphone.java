package question1.smartphone;

import question1.interfaces.IAuthenticator;
import question1.interfaces.IOpenID;

public class CreateSmartphone implements IOpenID{
    private IAuthenticator authenticator;
    private static CreateSmartphone instance;
    
    private CreateSmartphone(){
        this.authenticator = new Smartphone();
    }
    
    public static CreateSmartphone getInstance(){
        if(instance == null)
            return instance = new CreateSmartphone();
        return instance;
    }
    
    @Override
    public IAuthenticator getAuthenticate() {
        return this.authenticator;
    }
}
