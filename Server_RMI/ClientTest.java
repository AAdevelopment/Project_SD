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

public class ClientTest{ //implements Comunication_client {
     Server_RMI server1;
     
     
    public ClientTest()throws RemoteException{
        super();
    }
    
    public void reply_on_client()throws RemoteException{
        System.out.println("Cliente:ok");
    }
   
    
    public static void main(String args[]) throws RemoteException, IOException{
        
      
          vote("lista1");
             
        
    }
     public static Integer vote(String nome_lista)throws RemoteException, FileNotFoundException, IOException{
      
        Integer qtd=null;
        try {   
                
                FileWriter out = new FileWriter("/home/gustavo/NetBeansProjects/Ivotas/listas");
                FileReader read = new FileReader("/home/gustavo/NetBeansProjects/Ivotas/listas");
                BufferedReader in = new BufferedReader(read);
                String s="";
                while((s=in.readLine())!=null){
                    String a[];
                    a=s.split(nome_lista);
                    System.out.println("0: "+a.toString());
                    if(a[1]==nome_lista){
                        a=s.split("=");
                        qtd=Integer.parseInt(a[1]);
                    }      
                }
                System.out.println("1: "+qtd);
                qtd++;
                
               /* while((s=in.readLine())!=null){
                    String[] a;
                    a=s.split("=");
                   out.write(a[1]=Integer.toString(qtd));
                   out.close();
                }*/
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) { 
            Logger.getLogger(Server_RMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return qtd;
    }
}

