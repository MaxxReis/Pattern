package question5.flexiblefactory;

import java.util.HashMap;
import question5.interfaces.IPrototype;

public class FlexibleFactory{
    private HashMap<String, IPrototype> prototypes;
    private static FlexibleFactory instance;
    
    private FlexibleFactory(){
        this.prototypes = new HashMap<>();
    }
    
    public static FlexibleFactory getInstance(){
        if(instance == null)
            instance = new FlexibleFactory();
        return instance;
    }
    
    public IPrototype create(String name){
        if(this.prototypes.containsKey(name)){
            //System.out.println("Object Exist!");
            return this.prototypes.get(name).clone();
        }
        return null;
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
    
    public String clearPrototypes(){
        prototypes.clear();
        return "All prototypes was removed";
    }
    
    public IPrototype findPrototype(String name){
        if(prototypes.containsKey(name))
            return prototypes.get(name).clone();
        return null;
    }
        
}
