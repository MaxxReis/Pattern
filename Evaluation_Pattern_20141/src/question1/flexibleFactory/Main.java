package question1.flexibleFactory;

import question1.clothesFactory.Bermuda;
import question1.clothesFactory.Tshirt;

public class Main {
    public static void main(String[] args) {
        FlexibleFactory clotheFactory = FlexibleFactory.getInstance();
        clotheFactory.addPrototype("Polo", new Tshirt("Mitchel"));
        clotheFactory.addPrototype("Bermuda", new Bermuda("Wave"));
        
        Tshirt tshirt = (Tshirt)clotheFactory.createClothe("Polo");
        Bermuda bermuda = (Bermuda)clotheFactory.createClothe("Bermuda");
        
        System.out.println(clotheFactory.checkPrototype("Polo"));
        System.out.println(clotheFactory.checkPrototype("Bermuda"));
        System.out.println(clotheFactory.checkPrototype("NewClothe"));
        
        //moved for FlexibleFactory -> method checkPrototype
        /*if(clotheFactory.createClothe("Bermuda") != null)
            System.out.println("Exist!");
        else
            System.out.println("Don't Exist");*/
    }
            
}
