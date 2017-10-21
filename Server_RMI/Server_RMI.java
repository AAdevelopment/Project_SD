/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.rmi.server.*;
import java.net.*;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */

public class Server_RMI  extends UnicastRemoteObject implements Comunication_server {
    static Comunication_client c;
    String vetCand[]={"paulo","pedro","eduardo","tiago","felipe","joao"}; 

    public Server_RMI() throws RemoteException{
        super();
    }
    
    //interface methods;
    @Override
    public String Test_connection() throws RemoteException {
		return "Server: OK!";
    }
    @Override
    public void subscribe(String name, Comunication_client c) throws RemoteException {
        System.out.println("Subscribing "+name);
        this.c = c;
    }
    
    @Override
    public ArrayList<String> returnList(Integer type)throws RemoteException{
       String lista="";
       ArrayList<String> ListasCandidato1 = new ArrayList();
       
        if (type == 1){
           ListasCandidatos listc = new ListasCandidatos(vetCand);
           ListasCandidato1 = listc.Getlista(vetCand);
        
        }
        return ListasCandidato1;
    }
    
    
    @Override
    public Integer vote(ArrayList<String> list)throws RemoteException{
      
        Integer qtd=null;
        try {
                FileReader read = new FileReader("/home/gustavo/NetBeansProjects/Ivotas/lista1");
                
            
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } 
        
        
        return qtd;
    }
    
    public void criarEleicao(){
        
    }
    
    //server runnig;
    public static void main(String args[])throws RemoteException, MalformedURLException {
        //if (System.getSecurityManager() == null)
          //  System.setSecurityManager ( new RMISecurityManager() );
        try{
            System.getProperties().put("java.security.policy", "/home/gustavo/NetBeansProjects/Ivotas/src/Server_RMI/policy.all");
            System.setSecurityManager(new RMISecurityManager());
            Server_RMI server = new Server_RMI();
            Registry r = LocateRegistry.createRegistry(6500);
            
             r.rebind("connection_RMI",server);
            //r.rebind("connection_RMI",server);
            System.out.println("Server RMI ready...");
            
           /* while(true){
                c.reply_on_client();
            }*/    
        }catch(RemoteException re){
            System.out.println(re.getMessage());
        }
    } 
}
 