package com.linseven.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.linseven.Remote.Hello;

public class Client {

	public static void main(String[] args) {  
        try 
        {  
            Hello h = (Hello)Naming.lookup("rmi://192.168.1.101:12312/Hello");  
            System.out.println(h.sayHello());
            
        } catch (MalformedURLException e) 
        {  
            System.out.println("url��ʽ�쳣");  
        } catch (RemoteException e)
        {  
            System.out.println("���������쳣");  
            e.printStackTrace();  
        } 
        catch (NotBoundException e) 
        {  
            System.out.println("����δ��");  
        }  
    }  

}
