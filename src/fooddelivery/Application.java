/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Application {


    public static void main(String[] args) throws IOException {
        List ls = new List();
        new Home().setVisible(true);

        String filepath = "DetailsFile\\foodDetails.txt";
        File f = new File(filepath);

        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(f));

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                Menuinfo mn = new Menuinfo();
                String[] n = dataRow;
                String[] c = dataRow;
                String[] p = dataRow;
                mn.setName(n);
                mn.setCategory(c);
                mn.setPrice(p);
                ls.insertFront(mn);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    

}
