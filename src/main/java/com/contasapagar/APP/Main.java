package com.contasapagar.APP;


import com.contasapagar.VIEW.JanelaPrincipal;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tássio
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        JanelaPrincipal cr = new JanelaPrincipal();
        cr.setVisible(true);
    }
}
