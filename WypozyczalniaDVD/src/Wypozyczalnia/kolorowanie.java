/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Wypozyczalnia;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class kolorowanie extends DefaultListCellRenderer {
    int indx = 0;
    public kolorowanie(int in) {
        this.indx=in;
    }

   @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.toString());
        if (index  == indx) setForeground(Color.RED);
        return this;
 
    }

}