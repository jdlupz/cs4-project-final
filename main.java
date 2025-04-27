/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cs10pd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main implements MouseListener{
    JFrame frame;
    JLabel newgame;
    JLabel fallacyreview;
    ImageIcon newgameIcon;
    ImageIcon fallacyreviewIcon;
    //JLabel settings;
    //ImageIcon settingsIcon;
    ImageIcon gameBGIcon;
    ImageIcon img;
    PlaySound click;
    PlaySound newgameBG;
    
    public main(){
        click=new PlaySound();
        newgameBG=new PlaySound();
        
        
        newgameIcon=new ImageIcon("images/newgame.png");    //259x80 px
        img=new ImageIcon(newgameIcon.getImage().getScaledInstance(1000, 900, Image.SCALE_DEFAULT));
        newgame=new JLabel(img);
        
        fallacyreviewIcon=new ImageIcon("images/fallacyreview.png");    //259x80 px
        img=new ImageIcon(fallacyreviewIcon.getImage().getScaledInstance(1100, 1025, Image.SCALE_DEFAULT));
        fallacyreview=new JLabel(img);
        
        //settingsIcon=new ImageIcon("images/settings.png");
        //img=new ImageIcon(settingsIcon.getImage().getScaledInstance(1000, 900, Image.SCALE_DEFAULT));
        //settings=new JLabel(img);
        
        gameBGIcon=new ImageIcon("images/mainbg.png");    //project
        img=new ImageIcon(gameBGIcon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        
        frame=new JFrame("Fallacy Game");
        frame.setContentPane(new JLabel(img));
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(20,30)));
        //frame.add(newgame, new Rectangle(7,20,6,4));
        frame.add(newgame, new Rectangle(3,20,6,4));
        frame.add(fallacyreview, new Rectangle(11,20,5,4));
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1100,800);
        
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setVisible(true);
        //frame.setLocation(100,100);
        frame.setResizable(false);
        addListeners();
        newgameBG.playEffect("Audio/mainmenubg.wav");
    }
    
    public void addListeners(){
        newgame.addMouseListener(this);
        fallacyreview.addMouseListener(this);
    }
    
    public static void main(String[] args){
        main mm=new main();
        mm.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        click.playEffect("Audio/select.wav");
        if(e.getSource()==newgame){
            newgameBG.clip.stop();
            loadingpage lp=new loadingpage();
            Point p=frame.getLocation();
            lp.setFrame();
            lp.frame.setLocation(p);
            frame.dispose();
        }
        else if(e.getSource()==fallacyreview){
            newgameBG.clip.stop();
            frevintro lp=new frevintro();
            Point p=frame.getLocation();
            lp.setFrame();
            lp.frame.setLocation(p);
            frame.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //do something here
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
