/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI;

/**
 *
 * @author gustavo
 */
import Server_RMI.AdminConsole.Pessoa;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientTest implements Comunication_client {
     Server_RMI server1;
     
     
    public ClientTest()throws RemoteException{
        super();
    }
    
    public void reply_on_client()throws RemoteException{
        System.out.println("Cliente:ok");
    }
   
    
    public static void main(String args[]){
        
        //try{
            /*System.getProperties().put("java.security.policy", "/home/gustavo/NetBeansProjects/Ivotas/src/Server_RMI/policy.all");
            System.setSecurityManager(new RMISecurityManager());
            Comunication_server h = (Comunication_server) LocateRegistry.getRegistry(6500).lookup("connection_RMI");
           
            ClientTest c = new ClientTest();
            //h.subscribe("stub",(Comunication_client)  c);
            String reply=h.Test_connection();
            System.out.println(reply);
            Integer i=Integer.parseInt(JOptionPane.showInputDialog("digite a lista em que deseja votar"));
            System.out.println(h.returnList(i).toString());*/
           // CadastrarPessoa();
             
        
       // }catch(RemoteException re){
         //   re.getMessage();
        //} catch (NotBoundException ex) {
         //   ex.getMessage();
        //}
        
    }
     public static Integer vote(ArrayList<String> list)throws RemoteException, FileNotFoundException, IOException{
      
        Integer qtd=null;
        try {
                FileWriter out = new FileWriter("/home/gustavo/NetBeansProjects/Ivotas/lista1");
                FileReader read = new FileReader("/home/gustavo/NetBeansProjects/Ivotas/lista1");
                BufferedReader in = new BufferedReader(read);
                String s="";
                while((s=in.readLine())!=null){
                    String[] a;
                    a=s.split("=");
                    qtd=Integer.parseInt(a[1]);
                }
                qtd++;
                
                while((s=in.readLine())!=null){
                    String[] a;
                    a=s.split("=");
                    a[1]=Integer.toString(qtd);
                }
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) { 
            Logger.getLogger(Server_RMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return qtd;
    }
     
   
}
