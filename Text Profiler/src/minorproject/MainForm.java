/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minorproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Mohit Kumar Singla
 */

final class Tree
{
    String data;
    int frequency;
    Tree Left;
    Tree Right;
    String FinalData="";
    Tree Createroot(Tree root, String data)
    {
        root=new Tree();
        root.data= data;
        root.frequency=1;
        root.Left=null;
        root.Right=null;
        return root;
    }
    Tree createNode(Tree root, String data)
{
	if (root == null)
		root = Createroot(root, data);
	else if (data.compareTo(root.data)<0)
		root.Left = createNode(root.Left, data);

	else if (data.compareTo(root.data)>0)
		root.Right = createNode(root.Right, data);
	else
		root.frequency= root.frequency+1;
	return root;
}
    
    String dis(Tree root)
    {
        
        if(root != null)
        {
            FinalData= FinalData+root.data+" "+root.frequency+"\n";
            dis(root.Left);
            dis(root.Right);
        }

        return FinalData;
    }
}
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    File file;
    String data,data1;
    BufferedReader Reader;
    int flag=0;
    BufferedWriter Bw;
    BufferedReader Br;
    public MainForm() {
        initComponents();
        
    }
    int getWords()
    {
        String arr[]= txtget.getText().split(" ");
        return (arr.length);
      
    }
    int getChar(){
        char chars[]= txtget.getText().toCharArray();
        
         int num=chars.length;
         return num;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnSelectFile = new javax.swing.JButton();
        TextFileName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextWebAddress = new javax.swing.JTextField();
        btnWeb = new javax.swing.JButton();
        txtgettext = new javax.swing.JScrollPane();
        txtget = new javax.swing.JTextArea();
        btnbigram = new javax.swing.JButton();
        btnstat = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Profiler");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnSelectFile.setText("Select File");
        BtnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelectFileActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, -1));

        TextFileName.setEditable(false);
        jPanel1.add(TextFileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 260, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Or");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, 30));

        TextWebAddress.setText("Enter Web Address");
        jPanel1.add(TextWebAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 260, -1));

        btnWeb.setText("Browse");
        jPanel1.add(btnWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 70, 110, -1));

        txtget.setColumns(20);
        txtget.setFont(new java.awt.Font("Arial Unicode MS", 0, 13)); // NOI18N
        txtget.setRows(5);
        txtgettext.setViewportView(txtget);

        jPanel1.add(txtgettext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 690, -1));

        btnbigram.setText("Make N Gram");
        btnbigram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbigramActionPerformed(evt);
            }
        });
        jPanel1.add(btnbigram, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 140, -1));

        btnstat.setText("Statistics");
        btnstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatActionPerformed(evt);
            }
        });
        jPanel1.add(btnstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jTextField1.setText("Enter any Number");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 274, 700, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 700, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Word Level");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 90, 20));

        jButton1.setText("Make N Gram");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Character Level");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, 20));

        txtnum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/project-background.jpg"))); // NOI18N
        jPanel1.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelectFileActionPerformed
        // TODO add your handling code here:
        int flag1=0;
        JFileChooser choose= new JFileChooser();
        choose.showOpenDialog(null);
        File F= choose.getSelectedFile();
        String Name= F.getAbsolutePath();
        TextFileName.setText(Name);
        
        
        try{
            file= new File(Name);
            Reader= new BufferedReader(new FileReader(file));
            while(true)
                {
                    data=Reader.readLine();
                    if(data==null)
                        break;
                     if(flag==0)
                     {
                         data1=data;
                         flag=1;
                     }
                     else
                     {
                         if(data.length() != 0)
                             flag1=0;
                         if(data.length()==0)
                         {
                             //data1=data1+"\n\n";
                             if(flag1==0)
                             {
                               data1=data1+"\n\n";
                               flag1=1;
                             }
                             else
                             {
                                 data1=data1+"\n";
                             }
                         }    
                         else
                            data1=data1+data;
                     }

                }
            txtget.setText(data1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_BtnSelectFileActionPerformed

    private void btnstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatActionPerformed
        // TODO add your handling code here:
        int i[]=new int[5];
        i[0]=getWords();
        i[1]=getChar();
        Stat obj=new Stat(i);
        obj.setVisible(true);
                
        
        
    }//GEN-LAST:event_btnstatActionPerformed


    private void btnbigramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbigramActionPerformed
        // TODO add your handling code here:
        
//        JFileChooser choose= new JFileChooser();
//        choose.showOpenDialog(null);
//        File F= choose.getSelectedFile();

//        String Name= F.getAbsolutePath(), data1=txtget.getText();

        int j=0, formula, i=0, n=0;
        int gram=Integer.parseInt(jTextField1.getText());
                String file1="C:\\Users\\acer\\Desktop\\WordLevel"+gram+".txt";
        String data1= txtget.getText();
        
        String data[]= data1.split(" "), data2[]= new String[gram], FinalData="" ;
        
        
            BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file1));
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            formula= (((data.length)+2)- (gram-1));
       // System.out.println(formula+" "+ data.length);

        for(i=0; i<formula; i++)
        {
            if(i==0){
            for(j=0; j<gram; j++)
            {
                if(j==0)
                {
                    data2[j]="<Start>";
                }
            else
            {
                data2[j]=data[n++];
             }
        }
    }
    else
    {
          for(j=0; j<(gram-1); j++)
          {
              data2[j]=data2[j+1]; 
          }
          if(i==formula-1)
              data2[j]="<End>";
          else
          data2[j]=data[n++];
          
    }
        for(int m=0; m<gram; m++)
        {
            if(m== (gram-1))
            {
    //            writer.write(data2[m]);
                FinalData= FinalData+data2[m];
            }
  
            else
            {
      //          writer.write(data2[m]+" ");
                FinalData= FinalData+data2[m]+" ";                
            }

        }
    
            if(i!= (formula-1))
            {
        //        writer.newLine();
                FinalData= FinalData+"\n";
            }
        }
        //writer.close();
            
        
        Scanner input= new Scanner(FinalData);
        Tree root= null, root1=new Tree();
        String abc;
        while(input.hasNextLine())
        {
            abc=input.nextLine();
            //System.out.println(abc);
            root=root1.createNode(root,abc);
        }
       abc= root.dis(root);
        Scanner input1= new Scanner(abc);
        while(input1.hasNextLine())
        {
            try {
                writer.write(input1.nextLine());
                writer.newLine();
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbigramActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    char data[]= txtget.getText().toCharArray();
            int j=0, formula, i=0, n=0;
        int gram=Integer.parseInt(jTextField1.getText());
                String file1="C:\\Users\\acer\\Desktop\\CharLevel"+gram+".txt";
        String data1= txtget.getText();
        
        char data2[]= new char[gram];
        String FinalData="" ;
        
        
            BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file1));
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            formula= (((data.length)+2)- (gram-1));
       // System.out.println(formula+" "+ data.length);

        for(i=0; i<formula; i++)
        {
            if(i==0){
            for(j=0; j<gram; j++)
            {
                if(j==0)
                {
                    data2[j]='*';
                }
            else
            {
                data2[j]=data[n++];
             }
        }
    }
    else
    {
          for(j=0; j<(gram-1); j++)
          {
              data2[j]=data2[j+1]; 
          }
          if(i==formula-1)
              data2[j]='*';
          else
          data2[j]=data[n++];
          
    }
        for(int m=0; m<gram; m++)
        {
            if(m== (gram-1))
            {
    //            writer.write(data2[m]);
                FinalData= FinalData+data2[m];
            }
  
            else
            {
      //          writer.write(data2[m]+" ");
                FinalData= FinalData+data2[m]+" ";                
            }

        }
    
            if(i!= (formula-1))
            {
        //        writer.newLine();
                FinalData= FinalData+"\n";
            }
        }
        //writer.close();
            
        
        Scanner input= new Scanner(FinalData);
        Tree root= null, root1=new Tree();
        String abc;
        while(input.hasNextLine())
        {
            abc=input.nextLine();
            //System.out.println(abc);
            root=root1.createNode(root,abc);
        }
       abc= root.dis(root);
        Scanner input1= new Scanner(abc);
        while(input1.hasNextLine())
        {
            try {
                writer.write(input1.nextLine());
                writer.newLine();
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSelectFile;
    private javax.swing.JTextField TextFileName;
    private javax.swing.JTextField TextWebAddress;
    private javax.swing.JButton btnWeb;
    private javax.swing.JButton btnbigram;
    private javax.swing.JButton btnstat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtget;
    private javax.swing.JScrollPane txtgettext;
    private javax.swing.JLabel txtnum;
    // End of variables declaration//GEN-END:variables
}
