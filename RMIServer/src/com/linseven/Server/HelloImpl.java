package com.linseven.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.linseven.remote.Hello;



public class HelloImpl extends UnicastRemoteObject implements Hello {  
    private static final long serialVersionUID = -271947229644133464L;  
  
    public HelloImpl() throws RemoteException{  
        super();  
    }  
  

	@Override
	public String sayHello(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello world"; 
	}

	 
}  