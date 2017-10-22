/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server_RMI.AdminConsole;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gustavo
 */


public class Pessoa implements Serializable {
    String name;
    Long nrEstudante;
    String Password;
    String Dpto_facul;
    Date card_valid;
    String tel;
    String morada;
    
    public Pessoa(String name,Long nrEstudante,String Password,String Dpto_facul,Date card_valid,String tel,String morada){
        this.name =name;
        this.nrEstudante =nrEstudante;
        this.Password =Password;
        this.Dpto_facul =Dpto_facul;
        this.card_valid = card_valid ;
        this.tel = tel ;
        this.morada = morada;
    }
    
    public void setName(String name){
        this.name =name;
    }
    public void setMatric(Long nrEstudante){
            this.nrEstudante =nrEstudante;
    }
    public void setPassword(String Password){
        this.Password =Password;
    }
    public void setDpto_facul(String Dpto_facul ){
        this.Dpto_facul =Dpto_facul;
    }
    public void setCard_valid(Date card_valid){
        this.card_valid = card_valid;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public void setMorada(String morada){
        this.morada = morada;
    }
    
    public String getName(){
        return this.name;
    }
    public Long getNrEstudante(){
        return this.nrEstudante;
    }
    public String getPassword(){
        return this.Password;
    }
    public String getDpto_facul(){
        return this.Dpto_facul;
    }
    public Date getCard_valid(){
        return this.card_valid;
    }
    public String getTel(){
        return this.tel;
    }
    public String getMorada(){
        return this.morada;
    }
    
    
}
