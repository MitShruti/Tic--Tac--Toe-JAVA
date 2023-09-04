
package tic.tac.toe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends Frame implements ActionListener
{    static int i=0,j=1;
     static int bl1=0,bl2=0,bl3=0,bl4=0,bl5=0,bl6=0,bl7=0,bl8=0,bl9=0;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,breset;
     //TextField tfwin;
     Font f;
    public TicTacToe()
    {
       f=new Font("ArialBold", Font.BOLD, 70);
      b1=new JButton();
      b2=new JButton();
      b3=new JButton();
      b4=new JButton();
      b5=new JButton(); 
      b6=new JButton();
      b7=new JButton();
      b8=new JButton();
      b9=new JButton();
      b1.setFont(f);
      b2.setFont(f);
      b3.setFont(f);
      b4.setFont(f);
      b5.setFont(f);
      b6.setFont(f);
      b7.setFont(f);
      b8.setFont(f);
      b9.setFont(f);
      
      breset=new JButton("reset");
       setLayout(null);
      b1.setBounds(100, 100, 200, 200);
      add(b1);
      b2.setBounds(300,100,200,200);
      add(b2);
      b3.setBounds(500, 100, 200, 200);
      add(b3);
      b4.setBounds(100,300,200,200);
      add(b4);
      b5.setBounds(300,300,200,200);
      b6.setBounds(500,300,200,200);
      add(b5);
      add(b6);
      b7.setBounds(100,500,200,200);
      b8.setBounds(300,500,200,200);
      b9.setBounds(500,500,200,200);
      add(b7);
      add(b8);
      add(b9);
      breset.setBounds(300,800,200,100);
      add(breset);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      breset.addActionListener(this);
      // tfwin=new TextField(10);
        //     tfwin.setBounds(500,800,200,200);
            
      
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str;
        str="OXOXOXOXO";
          
        
        if(ae.getSource()==b1&&bl1==0)
        {
            if(i%2==0)
            {
                b1.setForeground(Color.red);
            }
            else
            {
                b1.setForeground(Color.green);
            }
            b1.setText(str.charAt(i)+"");
            i++;
            bl1=1;
            
            
        }
        else if(ae.getSource()==b2&&bl2==0)
        {
             if(i%2==0)
            {
                b2.setForeground(Color.red);
            }
            else
            {
                b2.setForeground(Color.green);
            }
            b2.setText(str.charAt(i)+"");
            i++;
            bl2=1;
            
        }
        else if(ae.getSource()==b3&&bl3==0)
        {
            if(i%2==0)
            {
                b3.setForeground(Color.red);
            }
            else
            {
                b3.setForeground(Color.green);
            }
            b3.setText(str.charAt(i)+"");
            i++;
            bl3=1;
        }
        else if(ae.getSource()==b4&&bl4==0)
        {
             if(i%2==0)
            {
                b4.setForeground(Color.red);
            }
            else
            {
                b4.setForeground(Color.green);
            }
            b4.setText(str.charAt(i)+"");
            i++;
            bl4=1;
        }
        else if(ae.getSource()==b5&&bl5==0)
        {
             if(i%2==0)
            {
                b5.setForeground(Color.red);
            }
            else
            {
                b5.setForeground(Color.green);
            }
            b5.setText(str.charAt(i)+"");
            i++;
            bl5=1;
        }
        else if(ae.getSource()==b6&&bl6==0)
        {
              if(i%2==0)
            {
                b6.setForeground(Color.red);
            }
            else
            {
                b6.setForeground(Color.green);
            }
            b6.setText(str.charAt(i)+"");
            i++;
            bl6=1;
        }
        else if(ae.getSource()==b7&&bl7==0)
        {
            
              if(i%2==0)
            {
                b7.setForeground(Color.red);
            }
            else
            {
                b7.setForeground(Color.green);
            }
            b7.setText(str.charAt(i)+"");
            i++;
            bl7=1;
        }
       
        else if(ae.getSource()==b8&&bl8==0)
        {
              if(i%2==0)
            {
                b8.setForeground(Color.red);
            }
            else
            {
                b8.setForeground(Color.green);
            }
            b8.setText(str.charAt(i)+"");
            i++;
            bl8=1;
        }
        else if(ae.getSource()==b9&&bl9==0)
        {
              if(i%2==0)
            {
                b9.setForeground(Color.red);
            }
            else
            {
                b9.setForeground(Color.green);
            }
            b9.setText(str.charAt(i)+"");
            i++;
            bl9=1;
        }
        else if(ae.getSource()==breset)
        {
            i=0;
            bl1=0;
            bl2=0;
            bl3=0;
            bl4=0;
            bl5=0;
            bl6=0;
            bl7=0;
            bl8=0;
            bl9=0;
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);
            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
            j=1;
            bl1=0;
             bl2=0;
            bl3=0;
            bl4=0;
            bl5=0;
            bl6=0;
            bl7=0;
            bl8=0;
            bl9=0;
           // tfwin.setText(null);
        }
      
      
            j++;
            
          if(b1.getText().contentEquals("X")==true|| b1.getText().contentEquals("O")==true)
             
          {
             
         if(b1.getText().contentEquals(b2.getText())==true&&b2.getText().contentEquals(b3.getText())==true)
         {
            
           
             JOptionPane.showMessageDialog(breset, "Win");
             
             j=0;
             breset.doClick();
             
           
             
         }
          
         else if(b1.getText().contentEquals(b4.getText())==true&&b4.getText().contentEquals(b7.getText())==true)
         {
            
           
              JOptionPane.showMessageDialog(breset, "WIN");
             j=0;
             breset.doClick();
            
            
         }
         else if(b1.getText().contentEquals(b5.getText())==true&&b5.getText().contentEquals(b9.getText())==true)
         {
            
           
              JOptionPane.showMessageDialog(breset, "WIN");
               j=0;
               breset.doClick();
            
            
         }
          }
       
          if(b2.getText().contentEquals("X")==true||b2.getText().contentEquals("O")==true)
          {
             
              
           if(b2.getText().contentEquals(b5.getText())==true&&b5.getText().contentEquals(b8.getText())==true)
           {
             
           
               JOptionPane.showMessageDialog(breset, "WIN");     
             j=0;
             breset.doClick();
           
          
           }
          }
           if(b3.getText().contentEquals("X")==true||b3.getText().contentEquals("O")==true)
          {  
          
              if(b3.getText().contentEquals(b6.getText())==true&&b6.getText().contentEquals(b9.getText())==true)
              { 
                  JOptionPane.showMessageDialog(breset, "WIN");
               
             j=0;
             breset.doClick();
               }
              else if(b3.getText().contentEquals(b5.getText())==true&&b5.getText().contentEquals(b7.getText())==true)
              {
                  JOptionPane.showMessageDialog(breset, "WIN");
               
             j=0;
             breset.doClick();
              }
          }
        if(b4.getText().contentEquals("X")==true||b4.getText().contentEquals("O")==true)
       {
          
           if(b4.getText().contentEquals(b5.getText())==true&&b5.getText().contentEquals(b6.getText())==true)
              {
           
            
                  JOptionPane.showMessageDialog(breset, "WIN");
               
                  j=0;
                  breset.doClick();
               }
       }
        if(b7.getText().contentEquals("X")==true||b7.getText().contentEquals("O")==true)
        {
            if(b7.getText().contentEquals(b8.getText())==true&&b8.getText().contentEquals(b9.getText())==true)
            {
               
             //add(tfwin);
             //tfwin.setText("win"); 
                JOptionPane.showMessageDialog(breset, "WIN");
               
               j=0;
               breset.doClick();
            }
        }
        if(j==10)       
        {
          // add(tfwin);
          // tfwin.setText("Draw");
            JOptionPane.showMessageDialog(breset, "DRAW");
               j=0;
               breset.doClick();
        }
            
    }
        
   
    
       
    
      
        
    
    public static void main(String[] args) 
    {
        TicTacToe obj=new TicTacToe();
        obj.setSize(1200, 1200);
        obj.setLocation(900, 50);
        obj.setVisible(true);
        obj.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we)
           {
               System.exit(1);
           }
       });
    
    }
  
}
