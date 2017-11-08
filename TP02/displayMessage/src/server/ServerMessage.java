package server;

import itf.DisplayService;

public class ServerMessage implements DisplayService {
    
    public void display(String message) {
        System.out.println(">> Received message is \'" + message + "\'");
    }
    
}