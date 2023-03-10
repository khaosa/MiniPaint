/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.awt.Color ;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Blu-Ray
 */
public class LineSegmentWindow extends javax.swing.JFrame implements Node {

    private Node parent;
    private Color color = Color.BLACK ;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    public LineSegmentWindow() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        X1Field = new javax.swing.JTextField();
        Y1Field = new javax.swing.JTextField();
        X2Field = new javax.swing.JTextField();
        Y2Field = new javax.swing.JTextField();
        LineButton = new javax.swing.JButton();
        ColorButton = new javax.swing.JButton();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Line");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("X1");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Y1");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("X2");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Y2");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        X2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2FieldActionPerformed(evt);
            }
        });

        LineButton.setBackground(new java.awt.Color(0, 0, 0));
        LineButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LineButton.setForeground(new java.awt.Color(255, 255, 255));
        LineButton.setText("Create Line");
        LineButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LineButton.setOpaque(true);
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });

        ColorButton.setBackground(new java.awt.Color(0, 0, 0));
        ColorButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ColorButton.setForeground(new java.awt.Color(255, 255, 255));
        ColorButton.setText("Select Color");
        ColorButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ColorButton.setOpaque(true);
        ColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y2Field)
                            .addComponent(Y1Field)
                            .addComponent(X2Field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(X1Field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Y1Field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LineButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorButtonActionPerformed
        // TODO add your handling code here:
        Color chosenColor = JColorChooser.showDialog(null, "Select a color", Color.white);
        this.color = chosenColor;
    }//GEN-LAST:event_ColorButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        JFrame parent = (JFrame) this.getParentNode();
        if (parent != null)      //if parent node exists
            parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        // TODO add your handling code here:

        MainFrame parent = (MainFrame) this.getParentNode();
        if (X1Field.getText().equals("")) {
            X1Field.setText("Add data here");
        } else if (Y1Field.getText().equals("")) {
            Y1Field.setText("Add data here");
        } else if (X2Field.getText().equals("")) {
            X2Field.setText("Add data here");
        } else if (Y2Field.getText().equals("")) {
            Y2Field.setText("Add data here");
        } else {

            try {

                int x1 = Integer.parseInt(X1Field.getText());
                int y1 = Integer.parseInt(Y1Field.getText());
                int x2 = Integer.parseInt(X2Field.getText());
                int y2 = Integer.parseInt(Y2Field.getText());

                Line line = new Line(new Point(x1, y1), new Point(x2, y2));
                line.setColor(color);
                parent.getDrawingArea().addShape(line);
                parent.getDrawingArea().refresh(this.getGraphics());
                parent.getChooseShapeComboBox().addItem("Line" + parent.getDrawingArea().L);
                parent.getDrawingArea().L++;

                this.setVisible(false);
                JFrame parentFrame = (JFrame) this.getParentNode();
                if (parentFrame != null) //if parent node exists
                {
                    parentFrame.setVisible(true);
                }

            } catch (NumberFormatException e) {
                 if (!parent.isInteger(X1Field.getText())) {
                    X1Field.setText("Not a numeric value.");
                } else if (!parent.isInteger(Y1Field.getText())) {
                    Y1Field.setText("Not a numeric value.");
                } else if (!parent.isInteger(X2Field.getText())) {
                    X2Field.setText("Not a numeric value.");
                } else if (!parent.isInteger(Y2Field.getText())) {
                    Y2Field.setText("Not a numeric value.");
            }

        }}


    }//GEN-LAST:event_LineButtonActionPerformed

    private void X2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2FieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorButton;
    private javax.swing.JButton LineButton;
    private javax.swing.JTextField X1Field;
    private javax.swing.JTextField X2Field;
    private javax.swing.JTextField Y1Field;
    private javax.swing.JTextField Y2Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
