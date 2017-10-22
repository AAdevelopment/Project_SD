/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import java.util.ArrayList;

/**
 *
 * @author gustavo
 */
public class Faculdade {
    ArrayList<String> dpto;
    String nome;
    
    public Faculdade(){
        super();
    }
    
    public void criarDPTO(String nome_dpto){
        dpto.add(nome_dpto);
    }
}
