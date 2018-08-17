package question1.app;

import question1.computer.Computer;
import question1.computer.CreateComputer;
import question1.interfaces.IAuthenticator;
import question1.interfaces.IOpenID;
import question1.smartphone.CreateSmartphone;

public class Main {
    public static void createDevices(IOpenID device){
        System.out.println("Authentitor: " + device.getAuthenticate().authenticate("Windows", "1234"));
    }
    
    public static void main(String[] args) {
        //createDevices(new CreateSmartphone());
        //createDevices(new CreateComputer());
        createDevices(CreateComputer.getInstance());
        createDevices(CreateSmartphone.getInstance());
    }
}
