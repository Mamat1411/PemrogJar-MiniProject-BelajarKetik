/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Controller {
    private mainGUI1 view;
    private int point = 50;
    
    public Controller(mainGUI1 view){
        this.view = view;
        this.view.getLabelPoint().setText(String.valueOf(this.point));
        proses();
        this.view.getEnterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valid();
            }
        });
        
       
    }
    
    
    public void valid(){
        String type = String.valueOf(view.getTypeText().getText()) + " ";
        String label = String.valueOf(view.getLabelText().getText());
        
        if(type.equals(label)){
            JOptionPane.showMessageDialog(null, "anda benar skor bertambah");
            this.point = this.point + 25;
            view.getLabelPoint().setText(String.valueOf(this.point));
            proses();
        }else{
            JOptionPane.showMessageDialog(null, "anda salah skor berkurang");
            this.point = this.point - 25;
            view.getLabelPoint().setText(String.valueOf(this.point));
            proses();
            
        }
    }
    
}
