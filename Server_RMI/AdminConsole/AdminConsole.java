/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import Server_RMI.Comunication_server;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class AdminConsole  {
    
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Integer opcao=0;
        
        
        Comunication_server h = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");
        h.Test_connection();
        String reply=h.Test_connection();
        System.out.println(reply);
        opcao=Integer.parseInt(JOptionPane.showInputDialog("1-criar eleicao"+"\n"+"2-Adicionar lista de candidato"));
        switch(opcao){
            
            case 1:
                
            break; 
            case 2:
                
            break;
        }
         
    }
}

class T1 extends Thread{
    
    public void run(){
        while(true){
         System.out.println("oi");
         
        }
    }    

}
