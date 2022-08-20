/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ChannelController {

        private static final List<Updater> list = new ArrayList<>();
    
    public void subscribe(Updater u) throws Exception{
        if(u != null){
            if(!list.contains(u)){
                list.add(u);    
            }else{
                throw new Exception("User Already Subscribed");   
            }
            
        }else{
            throw new Exception("Subscriber Invalid.");
        }
    }
    
    public void unSubscribe(Updater u) throws Exception{
        if(u != null){
            if(list.contains(u)){
                list.remove(u);
            }else{
                throw new Exception("User Not Subscribe");    
            }
        }else{
            throw new Exception("User can not be null");
        }
    }
    
    public void postMessage(String s){
       for(Updater u:list){
           u.update(s);
       }
    }

    int passwordLength() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int passwordLength(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int passwordValid(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int UserNameValid(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int UserName(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
