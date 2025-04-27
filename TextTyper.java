package cs10pd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.*;

public class TextTyper {
    int index;
    Timer timer;
    
    public void typeTextToTextArea(JTextArea textarea, String textToType, int delay){
        index=0;
        timer = new Timer(delay, new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < textToType.length()) {
                    textarea.setText(textToType.substring(0, index + 1));
                    index++;
                } else {
                    ((Timer)e.getSource()).stop(); 
                }
            }
        });
        
        timer.start();
    }
}
