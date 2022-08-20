/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Model;

import com.Controller.ChannelController;
import com.View.ChannelFrame;
import com.View.ChannelFrame2;
import com.View.LoginFrame1;
import com.View.MyMemo;
import com.View.UserFrame;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        ChannelController channelController = new ChannelController();
        ChannelFrame newFrame = new ChannelFrame(channelController);
        newFrame.setVisible(true);
        UserFrame frmSubscriber = new UserFrame(channelController);
        frmSubscriber.setVisible(true);
    }
}
