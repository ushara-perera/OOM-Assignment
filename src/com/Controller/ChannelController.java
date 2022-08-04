/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

/**
 *
 * @author User
 */
public class ChannelController {

    public int subscribe(int x,int y) {
       if (x == 0 || y == 0){
       throw new RuntimeException("Error");
       }
        return x + y;
    }
    
}
