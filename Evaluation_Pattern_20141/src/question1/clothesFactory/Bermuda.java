package question1.clothesFactory;

import question1.interfaces.IPrototype;

public class Bermuda implements IPrototype{
    private String bermudaBrand;
    
    public Bermuda(String bermudaBrand){
        this.bermudaBrand = bermudaBrand;
    }
    
    @Override
    public IPrototype clone(){
        return new Bermuda(this.bermudaBrand);
    }
    
}
