package core;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Repo {
    
    public int confirm(String title, String text){
        return JOptionPane.showConfirmDialog(null, text, title, YES_NO_OPTION);
    }
    
    public void message(String title, String text, String type){
        Object ty = INFORMATION_MESSAGE;
        switch (type){
            case "ERROR": ty = ERROR_MESSAGE;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, text, title, (int) ty);
    }
    
    public void log(String text){
        System.err.println(text);
    }

}
