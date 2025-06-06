package cs10pd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loadingpage {
    JFrame frame;

    ImageIcon loadingBGIcon;
    ImageIcon img;

    PlaySound newgameBG;

    Timer timer; // timer for automatic transition

    public loadingpage() {
        newgameBG = new PlaySound();

        loadingBGIcon = new ImageIcon("Images/loadingpage.gif");
        img = new ImageIcon(loadingBGIcon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frame = new JFrame("New Game");
        frame.setContentPane(new JLabel(img));
    }

    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(20, 30)));
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1100, 800);
        frame.setVisible(true);
        frame.setResizable(false);

        newgameBG.playEffect("Audio/gamelevelbg.wav");

        startTimer(); // start timer for auto transition
    }

    public void startTimer() {
        timer = new Timer(5000, new ActionListener() { // 3000 ms = 3 seconds
            @Override
            public void actionPerformed(ActionEvent e) {
                openbackstory();
            }
        });
        timer.setRepeats(false); // run only once
        timer.start();
    }

    public void openbackstory() {
        if (timer != null) {
            timer.stop();
        }
        newgameBG.clip.stop();
        backstory bs = new backstory();
        Point p = frame.getLocation();
        bs.setFrame();
        bs.frame.setLocation(p);
        frame.dispose();
    }

    public static void main(String[] args) {
        loadingpage bg = new loadingpage();
        bg.setFrame();
    }
}
