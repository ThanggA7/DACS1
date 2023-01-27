package admin;


import view.StudentView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new StudentView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}