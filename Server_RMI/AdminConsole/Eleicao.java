/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */

public class Eleicao implements Runnable,Serializable {
    String tipo;
    String titulo;
    String descricao;
    Thread t;
    Date data;
    SimpleDateFormat dt;
    
    public Eleicao(String tipo,String titulo,String data) throws ParseException{
        this.tipo = tipo;
        this.titulo=titulo;
        this.data = new Date();
        dt = new SimpleDateFormat("dd-mm-yyyy"); 
        this.data =dt.parse(data);
        t = new Thread(this,titulo);
        t.start();
    }
    
    @Override
    public void run(){
        //8hrs
        //this.data.getTime();
        
        
        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        Date horafim = new Date();
        Date horaini = new Date();
        try {
            horafim=dt.parse("03:23");
            horaini=dt.parse("01:00");
        } catch (ParseException ex) {
            ex.getMessage();
        }
        
        //long inicio=System.currentTimeMillis();
        //long duracao=28800000;
        
        System.out.println(System.currentTimeMillis()+" date: "+dt.format(now.getTime())
        +"  "+dt.format(horaini.getTime())+" "+dt.format(horafim.getTime()));
        if(now.after(horaini)){
            Boolean verifica=true;
            while(verifica==true){
                now.setTime(System.currentTimeMillis());
                System.out.println(System.currentTimeMillis()+" date: "+dt.format(now.getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.getMessage();
                }
                if(now.after(horafim)){
                    verifica =false;
                }
            }    
        
        }
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String  getDescricao(){
        return this.descricao;
    }
    @Override
    public String toString(){
        return this.tipo+this.titulo+this.data.toGMTString();
    }

}
