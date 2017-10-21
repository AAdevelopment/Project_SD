/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class Eleicao implements Runnable {
    Date d;
    String tipo;
    String titulo;
    String descricao;
    Thread t;
    public Eleicao(String tipo,String titulo){
        d= new Date();
        this.tipo = tipo;
        this.titulo=titulo;
        t = new Thread(this,titulo);
        t.start();
    }
    
    
    @Override
    public void run(){
        while(true){
            System.out.println(d);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String  getDescricao(){
        return this.descricao;
    }

}
