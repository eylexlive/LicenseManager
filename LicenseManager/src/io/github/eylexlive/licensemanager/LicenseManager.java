/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.eylexlive.licensemanager;

import io.github.eylexlive.licensemanager.jframe.MainForm;

/**
 *
 * @author pc
 */
public class LicenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                java.awt.EventQueue.invokeLater(() -> {
                    new MainForm().setVisible(true);
                   
                });
    }
    
}
