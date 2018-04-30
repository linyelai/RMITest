package com.linseven.Server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.linseven.remote.Hello;


public class Server  {

	 public Server() {}
	
	public static void main(String args[]) {
        
        try
        {
        	Hello h = new HelloImpl(); 
        	LocateRegistry.createRegistry(12312); 
            Naming.bind("rmi://192.168.1.101:12312/Hello", h);  
            System.out.println("HelloServer∆Ù∂Ø≥…π¶");  
            System.err.println("Server ready");
        } 
        catch (Exception e) 
        {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

}
