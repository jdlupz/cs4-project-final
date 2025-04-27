/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs10pd;

/**
 *
 * @author Jade Anne
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frevintro implements MouseListener{
    ImageIcon frevintro;
    JFrame frame;
    //ImageIcon chatBoxIcon;
    //JLabel chatBox;
    JTextArea chatArea;
    ImageIcon imageicon;
    //JTextField character;
    JLabel frevintro2;
    JLabel frevintro3;
    
    ImageIcon img;
    //String chat[];
    //String charname[];
    //int chatIndex;
    JLabel nextButtonL;
    JLabel prevButtonL;
    JLabel book;
    
    PlaySound newgameBG;
    PlaySound click;
    int soundMode;
    
    MyStyle ms;
    //TextTyper texttype;
    
    int pageindex;
    int totalpages;
    
    public frevintro(){
        soundMode=0;
        click=new PlaySound();
        newgameBG=new PlaySound();
        
        pageindex=0;
        totalpages = 3;
        
        //charname= new String[]{
        //    "AJ"
        //};
        
        //frame=new JFrame("New Game");
        //gameBGIcon=new ImageIcon("Images/newgameBG.png");
        //frame.setContentPane(new JLabel(gameBGIcon));
        //setFrameBG("Images/newgameBG.png");
        
        frevintro=new ImageIcon("images/frevintro1.png");
        img=new ImageIcon(frevintro.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frame=new JFrame("New Game");
        frame.setContentPane(new JLabel(img));
        
        imageicon=new ImageIcon("images/frevintro2.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frevintro2=new JLabel(img);
        
        imageicon=new ImageIcon("images/frevintro3.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frevintro3=new JLabel(img);
        
        imageicon=new ImageIcon("images/nextbutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT));
        nextButtonL=new JLabel(img);
        
        imageicon=new ImageIcon("images/prevbutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT));
        prevButtonL=new JLabel(img);
        
        imageicon=new ImageIcon("images/book.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT));
        book=new JLabel(img);
        
        //imageicon=new ImageIcon("Images/ruinedcastle.png");
        //img=new ImageIcon(imageicon.getImage().getScaledInstance(360, 450, Image.SCALE_DEFAULT));
        //ruinedCastleL2=new JLabel(img);
        
        //chatBoxIcon=new ImageIcon("images/dialoguebox.png");
        //img=new ImageIcon(chatBoxIcon.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT));
        //chatBox=new JLabel(img);
        //chatArea=new JTextArea(chat[chatIndex]);
        
        //character = new JTextField(charname[0]);
        
        ms=new MyStyle();
        //texttype=new TextTyper();
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(20,30)));
        
        frame.add(prevButtonL, new Rectangle(16,25,2,4));
        frame.add(nextButtonL, new Rectangle(18,25,2,4));
        frame.add(book, new Rectangle(2,9,7,14));
        //frame.add(chatBox, new Rectangle(0,23,20,6));
        //frame.add(chatArea, new Rectangle(2,22,16,6));
        //frame.add(character, new Rectangle(2,23,3,3));
        
        frame.add(frevintro2, new Rectangle (0,0,20,30));
        frame.add(frevintro3, new Rectangle (0,0,20,30));
        
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1100,800);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setResizable(false);
        
        this.componentSettings();
        addListeners();
        
        newgameBG.playEffect("Audio/backstorybg.wav");
    }
    
    public static void main(String[] args){
        frevintro bg = new frevintro();
        bg.setFrame();
    }
    
    /*public void setFrameBG(String im){
        gameBGIcon=new ImageIcon(im);
        frame.setContentPane(new JLabel(gameBGIcon));
    }*/
    
    public void hideAll(){
        
    }
    
    public void componentSettings(){
        ms.changeFontRecursive(frame, new Font("Courier New", Font.PLAIN, 30));
        //character.setEditable(false);
        //chatArea.setEditable(false);
        //chatArea.setLineWrap(true);
        //chatArea.setWrapStyleWord(true);
        //chatArea.setOpaque(false);
        //chatArea.setForeground(Color.white);
        frevintro2.setVisible(false);
        frevintro3.setVisible(false);
        book.setVisible(false);
        //ruinedCastleL2.setVisible(false);
        //frame.getContentPane().setBackground(new Color(150,225,207));
    }
    
    public void addListeners(){
        nextButtonL.addMouseListener(this);
        prevButtonL.addMouseListener(this);
        book.addMouseListener(this);
    }
    
    public void setElements(){
        //hideAll();
        if(pageindex==0){
            frevintro2.setVisible(false);
            frevintro3.setVisible(false);
            nextButtonL.setVisible(true);
            book.setVisible(false);
        }
        else if(pageindex==1){
            frevintro2.setVisible(true);
            frevintro3.setVisible(false);
            nextButtonL.setVisible(true);
            book.setVisible(false);
        }
        else if(pageindex==2){
            frevintro2.setVisible(false);
            frevintro3.setVisible(true);
            nextButtonL.setVisible(false);
            book.setVisible(true);
            //if(soundMode==1){
                //newgameBG.clip.stop();
                //newgameBG.playEffect("Audio/pokemonbg.wav");
                //soundMode=0;
            //}
        }
    }
    
    /*public void checkMonsterScene(){
        
    }*/

    @Override
    public void mouseClicked(MouseEvent e) {
        click.playEffect("Audio/dialogue1.wav");
        if(e.getSource()==nextButtonL){
            if(pageindex+1<totalpages){
                pageindex++;
            }
            else{
                newgameBG.clip.stop();
                fallacyreview ng=new fallacyreview();
                Point p=frame.getLocation();
                ng.setFrame();
                ng.frame.setLocation(p);
                frame.dispose();
            }
            setElements();
        }
        else if(e.getSource()==prevButtonL){
            if(pageindex-1>=0){
                pageindex--;
            }
            else{
                newgameBG.clip.stop();
                main ng=new main();
                Point p=frame.getLocation();
                ng.setFrame();
                ng.frame.setLocation(p);
                frame.dispose();
            //newgameBG.clip.stop();
            }
            setElements();
        }
        else if(e.getSource()==book){
            setElements();
            newgameBG.clip.stop();
            fallacyreview ng=new fallacyreview();
            Point p=frame.getLocation();
            ng.setFrame();
            ng.frame.setLocation(p);
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
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}