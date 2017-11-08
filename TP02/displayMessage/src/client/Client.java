package client;

import itf.DisplayService;

public class Client implements Runnable {
    
    private DisplayService service;

    public void setService(DisplayService s) {
        this.service = s;
        System.out.println("Client.service = " + this.service);
    }

    public void run() {
        this.service.display("Hello, world!");
    }
    
}