/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import Server_RMI.AdminConsole.Eleicao;
/**
 *
 * @author gustavo
 */
public class ListasCandidatos implements Serializable{
    ArrayList<String> listacandidato;
    String nome;
    String[] v;
    Eleicao e;
    ListasCandidatos l;
    
    public ListasCandidatos(String nome,ArrayList<String> listacandidato){
      //  super();
        this.nome = nome;
        this.listacandidato =listacandidato;
        this.listacandidato = new ArrayList();
        
        //this.e = e;

    }
    
   public void setList(String nomecandidato){
       this.listacandidato.add(nomecandidato);
   }
   /* public ArrayList<String> Getlista(String[] v){
      listacandidato = new ArrayList();
      for(int i=0;i<v.length;i++)
            listacandidato.add(i,v[i]);    
      return listacandidato;
    }*/
   
    public String toString(){
     
     return this.nome +":"+ this.listacandidato.toString();
    }
}
