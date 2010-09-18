/*
 * NewBrokingFirmJDialog.java
 *
 * Created on April 10, 2008, 11:02 PM
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2008 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.yccheok.jstock.portfolio.BrokingFirm;

/**
 *
 * @author  yccheok
 */
public class NewBrokingFirmJDialog extends javax.swing.JDialog {
    
    /** Creates new form NewBrokingFirmJDialog */
    public NewBrokingFirmJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private boolean isValidInput() {
        if(this.jTextField1.getText().length() <= 0)
        {
            this.jTextField1.requestFocus();
            return false;
        }
        
        return true;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Broking Firm");
        setResizable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/apply.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        jButton2.setText(bundle.getString("NewBrokingFirmJDialog_OK")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/button_cancel.png"))); // NOI18N
        jButton1.setText(bundle.getString("NewBrokingFirmJDialog_Cancel")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("NewBrokingFirmJDialog_BrokingFirm"))); // NOI18N

        jLabel3.setText(bundle.getString("NewBrokingFirmJDialog_Logo")); // NOI18N

        jLabel1.setText(bundle.getString("NewBrokingFirmJDialog_Name")); // NOI18N

        jCheckBox1.setText(bundle.getString("NewBrokingFirmJDialog_UseLogo")); // NOI18N
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-219)/2, (screenSize.height-272)/2, 219, 272);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(false == isValidInput()) {
            return;
        }
        
        this.brokingFirm = new BrokingFirm(this.jTextField1.getText());
        
        if(this.jCheckBox1.isSelected())
            this.brokingFirm.setLogo(logo);
        else
            this.brokingFirm.setLogo(null);
        
        this.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.brokingFirm = null;
        this.setVisible(false);
        this.dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    public BrokingFirm getBrokingFirm() {
        return this.brokingFirm;
    }
    
    private static boolean fileNameEndWithImageExtension(String filename) {
        return filename.endsWith(".jpg") || filename.endsWith(".jpeg") || filename.endsWith(".gif") || 
            filename.endsWith(".png") || filename.endsWith(".bmp");        
    }
    
    private static class MyFilter extends javax.swing.filechooser.FileFilter {
        public boolean accept(File file) {
            if (file.isDirectory()) {
                return true;
            }       
            
            String filename = file.getName();
            return fileNameEndWithImageExtension(filename);
        }
        
        public String getDescription() {
            return "Image file";
        }
    }
    
    private void letUserSelectAnImage() {
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new MyFilter());
        int returnVal = fc.showOpenDialog(this);

        if (returnVal != JFileChooser.APPROVE_OPTION) {
            return;            
        }
        
        File file = fc.getSelectedFile();
        if(fileNameEndWithImageExtension(file.getName())) {
            loadImage(file);
        }        
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.letUserSelectAnImage();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        JCheckBox me = (JCheckBox)evt.getSource();
        
        if(me.isSelected() && (this.logo == null)) {
            this.letUserSelectAnImage();
            if(this.logo == null) {
                this.jCheckBox1.setSelected(false);                
            }
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged
    
    private void loadImage(File file) {
        ImageIcon imageIcon;
        
        try {
            imageIcon = new ImageIcon(file.getCanonicalPath());
        }
        catch(IOException exp) {
            log.error("", exp);
            return;
        }

        if(imageIcon.getIconWidth() <= 0 || imageIcon.getIconHeight() <= 0) return;
        
        this.setLogo(imageIcon.getImage());        
    }
    
    public void setBrokingFirm(BrokingFirm brokingFirm) {
        this.brokingFirm = brokingFirm;
        jTextField1.setText(brokingFirm.getName());
        this.setLogo(brokingFirm.getLogo());
    }
    
    public void setLogo(final Image logo) {
        if(logo == null) {
            this.logo = null;
            
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    jLabel2.setIcon(null);
                    jCheckBox1.setSelected(false);                   
                } 
            });
            
            return;
        }
        
        this.logo = logo;
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {        
                // We use 2, to allow some image gap from the boundary.
                final ImageIcon scaledImageIcon = new ImageIcon(Utils.getScaledImage(logo, jLabel2.getWidth() - 2, jLabel2.getHeight() - 2));
        
                jLabel2.setIcon(scaledImageIcon);
                jCheckBox1.setSelected(true);                
            }
        });
    }
    
    private static final Log log = LogFactory.getLog(NewBrokingFirmJDialog.class);
    
    private Image logo = null;
    private BrokingFirm brokingFirm = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
