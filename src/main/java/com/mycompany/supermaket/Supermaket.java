/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermaket;

import com.formdev.flatlaf.FlatLightLaf;
import view.LoginView;
import controller.LoginController;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginViewFrame;


/**
 *
 * @author macbook
 */
public class Supermaket {

    public static void main(String[] args) {
        LoginViewFrame view = new LoginViewFrame();
        new LoginController(view);
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Không thể thiết lập FlatLaf: " + ex);
        }
        // Gọi giao diện chính sau khi thiết lập LookAndFeel
        java.awt.EventQueue.invokeLater(() -> {
            view.setVisible(true); // Thay bằng JFrame chính của bạn
        });
        
    }
}
