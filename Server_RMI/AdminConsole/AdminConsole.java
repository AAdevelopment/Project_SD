/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import Server_RMI.ClientTest;
import Server_RMI.Comunication_client;
import Server_RMI.Comunication_server;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
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
        
        try{
            System.getProperties().put("java.security.policy", "/home/gustavo/NetBeansProjects/Ivotas/src/Server_RMI/policy.all");
            System.setSecurityManager(new RMISecurityManager());
            Comunication_server h = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");
            
            ClientTest c = new ClientTest();
           // h.subscribe("stub",(Comunication_client)  c);
            
            String reply="";
            boolean verifica=true;
            do{
                opcao=Integer.parseInt(JOptionPane.showInputDialog("1-verificar conexao"+"\n"+"2-criar eleicao"+"\n"+"3-buscar lista de candidato"+"\n"+"9- sair do menu"));
                switch(opcao){
                    case 1:
                    System.out.println( reply=h.Test_connection());
                    case 2:
                        h.criarEleicao();
                    break; 
                    case 3:
                        System.out.println(h.returnList(1).toString());
                    break;
                    case 9:
                        verifica=false;
                    break;
                }    
            }while(verifica=true);
             
        }catch(RemoteException re){
            re.getMessage();
        } catch (NotBoundException ex) {
            ex.getMessage();
        }
      
    }
}
   

