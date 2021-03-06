package Server_RMI;

/**
 *
 * @author gustavo
 */

import java.rmi.*;
import java.util.ArrayList;
import java.util.HashMap;


public interface Comunication_server extends Remote {
    
    public String Test_connection() throws RemoteException;
    public void subscribe(String name, Comunication_client c) throws RemoteException;
    public ArrayList<String> returnList(Integer type)throws RemoteException;
    public void criarEleicao()throws RemoteException;
    public Integer vote(ListasCandidatos list)throws RemoteException;
    public  HashMap listaEleicao(String nrtitulo)throws RemoteException;
    public void CadastrarPessoa()throws RemoteException;
    public void CriarLista()throws RemoteException;
    public void CriarFaculdade_Dpto()throws RemoteException;
}