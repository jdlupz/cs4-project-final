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

public class fallacyreview implements MouseListener{
    ImageIcon frev;
    JFrame frame;
    //ImageIcon chatBoxIcon;
    //JLabel chatBox;
    //JTextArea chatArea;
    ImageIcon imageicon;
    //JTextField character;

    JLabel frev2;
    JLabel frev3;
    JLabel frev4;
    JLabel frev5;
    JLabel frev6;
    JLabel frev7;
    JLabel frev8;
    JLabel frev9;
    JLabel frev10;
    JLabel frev11;
    JLabel frev12;
    JLabel frev13;
    JLabel frev14;
    JLabel frev15;
    JLabel frev16;
    JLabel frev17;
    JLabel frev18;
    JLabel frev19;
    JLabel frev20;
    JLabel frev21;
    JLabel frev22;
    
    ImageIcon img;
    //String chat[];
    //String charname[];
    //int chatIndex;
    JLabel nextButtonL;
    JLabel prevButtonL;
    
    PlaySound newgameBG;
    PlaySound click;
    int soundMode;
    
    int totalpages;
    int pageindex;
    
    MyStyle ms;
    //TextTyper texttype;
    
    public fallacyreview(){
        soundMode=0;
        click=new PlaySound();
        newgameBG=new PlaySound();
        
        pageindex = 0;
        totalpages = 22;
        
        //charname= new String[]{
        //    "AJ"
        //};
        
        //frame=new JFrame("New Game");
        //gameBGIcon=new ImageIcon("Images/newgameBG.png");
        //frame.setContentPane(new JLabel(gameBGIcon));
        //setFrameBG("Images/newgameBG.png");
        
        frev=new ImageIcon("images/frev1.png");
        img=new ImageIcon(frev.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frame=new JFrame("New Game");
        frame.setContentPane(new JLabel(img));
        
        imageicon=new ImageIcon("images/frev2.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev2=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev3.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev3=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev4.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev4=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev5.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev5=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev6.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev6=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev7.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev7=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev8.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev8=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev9.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev9=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev10.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev10=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev11.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev11=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev12.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev12=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev13.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev13=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev14.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev14=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev15.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev15=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev16.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev16=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev17.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev17=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev18.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev18=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev19.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev19=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev20.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev20=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev21.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev21=new JLabel(img);
        
        imageicon=new ImageIcon("images/frev22.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frev22=new JLabel(img);
        
        
        imageicon=new ImageIcon("images/next.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        nextButtonL=new JLabel(img);
        
        imageicon=new ImageIcon("images/prev.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT));
        prevButtonL=new JLabel(img);
        
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
        
        frame.add(prevButtonL, new Rectangle(0,4,3,6));
        frame.add(nextButtonL, new Rectangle(8,4,3,6));
        //frame.add(chatBox, new Rectangle(0,23,20,6));
        //frame.add(chatArea, new Rectangle(2,22,16,6));
        //frame.add(character, new Rectangle(2,23,3,3));
        
        frame.add(frev2, new Rectangle (0,0,20,30));
        frame.add(frev3, new Rectangle (0,0,20,30));
        frame.add(frev4, new Rectangle (0,0,20,30));
        frame.add(frev5, new Rectangle (0,0,20,30));
        frame.add(frev6, new Rectangle (0,0,20,30));
        frame.add(frev7, new Rectangle (0,0,20,30));
        frame.add(frev8, new Rectangle (0,0,20,30));
        frame.add(frev9, new Rectangle (0,0,20,30));
        frame.add(frev10, new Rectangle (0,0,20,30));
        frame.add(frev11, new Rectangle (0,0,20,30));
        frame.add(frev12, new Rectangle (0,0,20,30));
        frame.add(frev13, new Rectangle (0,0,20,30));
        frame.add(frev14, new Rectangle (0,0,20,30));
        frame.add(frev15, new Rectangle (0,0,20,30));
        frame.add(frev16, new Rectangle (0,0,20,30));
        frame.add(frev17, new Rectangle (0,0,20,30));
        frame.add(frev18, new Rectangle (0,0,20,30));
        frame.add(frev19, new Rectangle (0,0,20,30));
        frame.add(frev20, new Rectangle (0,0,20,30));
        frame.add(frev21, new Rectangle (0,0,20,30));
        frame.add(frev22, new Rectangle (0,0,20,30));
        
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
        fallacyreview bg = new fallacyreview();
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
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        //ruinedCastleL2.setVisible(false);
        //frame.getContentPane().setBackground(new Color(150,225,207));
    }
    
    public void addListeners(){
        nextButtonL.addMouseListener(this);
        prevButtonL.addMouseListener(this);
    }
    
    public void setElements(){
        //hideAll();
        if(pageindex==0){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==1){
        frev2.setVisible(true);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==2){
        frev2.setVisible(false);
        frev3.setVisible(true);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==3){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(true);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==4){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(true);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==5){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(true);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==6){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(true);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==7){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(true);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==8){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(true);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==9){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(true);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==10){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(true);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==11){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(true);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==12){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(true);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==13){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(true);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==14){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(true);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==15){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(true);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==16){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(true);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==17){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(true);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==18){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(true);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==19){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(true);
        frev21.setVisible(false);
        frev22.setVisible(false);
        }
        else if(pageindex==20){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(true);
        frev22.setVisible(false);
        }
        else if(pageindex==21){
        frev2.setVisible(false);
        frev3.setVisible(false);
        frev4.setVisible(false);
        frev5.setVisible(false);
        frev6.setVisible(false);
        frev7.setVisible(false);
        frev8.setVisible(false);
        frev9.setVisible(false);
        frev10.setVisible(false);
        frev11.setVisible(false);
        frev12.setVisible(false);
        frev13.setVisible(false);
        frev14.setVisible(false);
        frev15.setVisible(false);
        frev16.setVisible(false);
        frev17.setVisible(false);
        frev18.setVisible(false);
        frev19.setVisible(false);
        frev20.setVisible(false);
        frev21.setVisible(false);
        frev22.setVisible(true);
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
                main ng=new main();
                Point p=frame.getLocation();
                ng.setFrame();
                ng.frame.setLocation(p);
                frame.dispose();
            //newgameBG.clip.stop();
            }
            setElements();
        }
        else if(e.getSource()==prevButtonL){
            if(pageindex-1>=0){
                pageindex--;
            }
            else{
                newgameBG.clip.stop();
                frevintro ng=new frevintro();
                Point p=frame.getLocation();
                ng.setFrame();
                ng.frame.setLocation(p);
                frame.dispose();
            //newgameBG.clip.stop();
            }
            setElements();
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