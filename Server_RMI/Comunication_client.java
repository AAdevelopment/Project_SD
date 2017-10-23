/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server_RMI;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public interface Comunication_client extends Remote {
     public void reply_on_client(String a)throws RemoteException;
     public void reply_list_on_client(ListasCandidatos list)throws RemoteException;
}
