/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 *
 * @author gustavo
 */
public class ListasCandidatos implements Serializable{
    ArrayList<String> listacandidato;
    String[] v;
    
    public ListasCandidatos(String[] v){
        this.v=v;
    }
    
    public ArrayList<String> Getlista(String[] v){
      listacandidato = new ArrayList();
      for(int i=0;i<v.length;i++)
            listacandidato.add(i,v[i]);    
      return listacandidato;
    }
    
}
