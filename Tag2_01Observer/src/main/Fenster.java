package main;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame  {

    Fenster() {
        setSize(300, 300);
        Button button = new Button("Drueck mich");
        button.addActionListener(e->this.ausgabe());
        add(button);
        addWindowListener(new MyWindowListener());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenster();
    }

    private void ausgabe() {
        System.out.println("Action was clicked");
    }

    private void beenden() {
        dispose();
    }


    private class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(final ActionEvent e) {
            ausgabe();
        }
    }

    private class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
           beenden();
        }
    }
}
