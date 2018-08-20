package question1.clothesFactory;

import question1.interfaces.IPrototype;

public class Tshirt implements IPrototype{
    private String clothingBrand;
    
    public Tshirt(String clothingBrand){
        this.clothingBrand = clothingBrand;
    }
    
    @Override
    public IPrototype clone(){
        return new Tshirt(this.clothingBrand);
    }
}
