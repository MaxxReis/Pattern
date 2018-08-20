package question1.flexibleFactory;

import java.util.HashMap;
import question1.interfaces.IPrototype;

public class FlexibleFactory {
    public HashMap<String, IPrototype> prototypes;
    private static FlexibleFactory instance;
    
    private FlexibleFactory(){
        this.prototypes = new HashMap<>();
    }
    
    public static FlexibleFactory getInstance(){
        if(instance == null)
            return new FlexibleFactory();
        return instance;
    }
    
    public boolean addPrototype(String name, IPrototype prototype){
        if(!prototypes.containsKey(name)){
            prototypes.put(name, prototype);
            return true;
        }
        return false;
    }
    
    public boolean removePrototype(String name){
        if(prototypes.containsKey(name)){
            prototypes.remove(name);
            return true;
        }
        return false;
    }
    
    public boolean findPrototypes(String name){
        return prototypes.containsKey(name);
    }
    
    public String clearPrototypes(){
        return "All models eas removed";
    }
    
    public IPrototype createClothe(String name){
        if(prototypes.containsKey(name))
            return prototypes.get(name).clone();
        return null;
    }
    
    public String checkPrototype(String name){
        if(createClothe(name) != null)
            return "Exist!";
        else
            return "Don't Exist";
    }
}
