package question5.flexiblefactory;

import question5.interfaces.IPrototype;

public class PlayerDigital implements IPrototype{
    @Override
    public IPrototype clone() {
        return new PlayerDigital();
    }
}
