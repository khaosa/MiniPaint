/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.util.locale.LocaleUtils;

/**
 *
 * @author Blu-Ray
 */
public class RectangleWindow extends javax.swing.JFrame implements Node {

    Node parent;
    private Color fillcolor = Color.BLACK;
    private Color bordercolor = Color.BLACK;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    public RectangleWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BorderColorButton = new javax.swing.JButton();
        RectangleButton = new javax.swing.JButton();
        FillColorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        XField = new javax.swing.JTextField();
        WidthField = new javax.swing.JTextField();
        YField = new javax.swing.JTextField();
        HeightField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Rectangle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BorderColorButton.setBackground(new java.awt.Color(0, 0, 0));
        BorderColorButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BorderColorButton.setForeground(new java.awt.Color(255, 255, 255));
        BorderColorButton.setText("Select Border Color");
        BorderColorButton.setOpaque(true);
        BorderColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderColorButtonActionPerformed(evt);
            }
        });

        RectangleButton.setBackground(new java.awt.Color(0, 0, 0));
        RectangleButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RectangleButton.setForeground(new java.awt.Color(255, 255, 255));
        RectangleButton.setText("Create Rectangle");
        RectangleButton.setOpaque(true);
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        FillColorButton.setBackground(new java.awt.Color(0, 0, 0));
        FillColorButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FillColorButton.setForeground(new java.awt.Color(255, 255, 255));
        FillColorButton.setText("Select Fill Color");
        FillColorButton.setOpaque(true);
        FillColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FillColorButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("X");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Y");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Height");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Width");

        XField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        WidthField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        YField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        HeightField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BorderColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FillColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(XField)
                                    .addComponent(YField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(WidthField)
                                    .addComponent(HeightField))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorderColorButton)
                    .addComponent(FillColorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RectangleButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        JFrame parent = (JFrame) this.getParentNode();
        if (parent != null)      //if parent node exists
            parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void BorderColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderColorButtonActionPerformed
        // TODO add your handling code here:
        Color chosenBorderColor = JColorChooser.showDialog(null, "Select a color", Color.white);
        this.bordercolor = chosenBorderColor;
    }//GEN-LAST:event_BorderColorButtonActionPerformed

    private void FillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FillColorButtonActionPerformed
        // TODO add your handling code here:
        Color chosenFillColor = JColorChooser.showDialog(null, "Select a color", Color.white);
        this.fillcolor = chosenFillColor;
        //  System.out.println(Integer.toString(chosenFillColor.getRGB()));
    }//GEN-LAST:event_FillColorButtonActionPerformed

    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        // TODO add your handling code here:    
        MainFrame parent = (MainFrame) this.getParentNode();
        if (XField.getText().equals(""))
            XField.setText("Add data here");
        else if (YField.getText().equals(""))
            YField.setText("Add data here");
        else if (WidthField.getText().equals(""))
            WidthField.setText("Add data here");
        else if (HeightField.getText().equals(""))
            HeightField.setText("Add data here");
        else {
            try {

                int x = Integer.parseInt(XField.getText());
                int y = Integer.parseInt(YField.getText());
                int h = Integer.parseInt(HeightField.getText());
                int w = Integer.parseInt(WidthField.getText());
                if (w < 0) {
                    WidthField.setText("Enter a positive numerical value.");
                } else if (h < 0) {
                    HeightField.setText("Enter a positive numerical value.");

                } else {
                    backend.Rectangle R = new backend.Rectangle(new Point(x, y), h, w);
                    R.setColor(bordercolor);
                    R.setFillColor(fillcolor);
                    parent.getDrawingArea().addShape(R);
                    parent.getDrawingArea().refresh(this.getGraphics());
                    parent.getChooseShapeComboBox().addItem("Rectangle" + parent.getDrawingArea().R);
                    parent.getDrawingArea().R++;
                    this.setVisible(false);
                    JFrame parentFrame = (JFrame) this.getParentNode();
                    if (parentFrame != null) //if parent node exists
                    {
                        parentFrame.setVisible(true);
                    }

                }

            } catch (NumberFormatException e) {

                if (!parent.isInteger(XField.getText())) {
                    XField.setText("Not a numeric value.");
                } else if (!parent.isInteger(YField.getText())) {
                    YField.setText("Not a numeric value.");
                } else if (!parent.isInteger(WidthField.getText())) {
                    WidthField.setText("Not a numeric value.");
                } else if (!parent.isInteger(HeightField.getText())) {
                    HeightField.setText("Not a numeric value.");
                }
            }
    }//GEN-LAST:event_RectangleButtonActionPerformed
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorderColorButton;
    private javax.swing.JButton FillColorButton;
    private javax.swing.JTextField HeightField;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JTextField WidthField;
    private javax.swing.JTextField XField;
    private javax.swing.JTextField YField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
