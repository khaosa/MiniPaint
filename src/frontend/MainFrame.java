/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends javax.swing.JFrame implements Node {

    private Node parent;
    //private boolean loaded = false;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }

    public MainFrame() {
        initComponents();
        drawingArea1.setParentNode(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        LineButton = new javax.swing.JButton();
        RectangleButton = new javax.swing.JButton();
        CircleButton = new javax.swing.JButton();
        drawingArea1 = new frontend.DrawingArea();
        SelectShapeLabel = new javax.swing.JLabel();
        ChooseShapeComboBox = new javax.swing.JComboBox<>();
        ColorizeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        TriangleButton = new javax.swing.JButton();
        CopyButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SaveButton = new javax.swing.JMenuItem();
        LoadButton = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");

        LineButton.setText("Line");
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });

        RectangleButton.setText("Rectangle");
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        CircleButton.setText("Oval");
        CircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleButtonActionPerformed(evt);
            }
        });

        drawingArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        drawingArea1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout drawingArea1Layout = new javax.swing.GroupLayout(drawingArea1);
        drawingArea1.setLayout(drawingArea1Layout);
        drawingArea1Layout.setHorizontalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        drawingArea1Layout.setVerticalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SelectShapeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelectShapeLabel.setText(" Select Shape");

        ChooseShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        ChooseShapeComboBox.setName(""); // NOI18N
        ChooseShapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseShapeComboBoxActionPerformed(evt);
            }
        });

        ColorizeButton.setText("Colorize");
        ColorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        TriangleButton.setText("Triangle");
        TriangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleButtonActionPerformed(evt);
            }
        });

        CopyButton.setText("Copy");
        CopyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        SaveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jMenu1.add(SaveButton);

        LoadButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        jMenu1.add(LoadButton);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectShapeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ChooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CopyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ColorizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(TriangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(drawingArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RectangleButton)
                    .addComponent(TriangleButton)
                    .addComponent(LineButton)
                    .addComponent(CircleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawingArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(SelectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorizeButton)
                    .addComponent(DeleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CopyButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean isInteger(String x) {
        try {
            int Value = Integer.parseInt(x);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        // TODO add your handling code here:
        RectangleWindow R = new RectangleWindow();
        R.setParentNode(this);
        this.setVisible(false);
        R.setVisible(true);
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        // TODO add your handling code here:  
        LineSegmentWindow L = new LineSegmentWindow();
        L.setParentNode(this);
        this.setVisible(false);
        L.setVisible(true);


    }//GEN-LAST:event_LineButtonActionPerformed

    private void CircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleButtonActionPerformed
        // TODO add your handling code here:
        OvalWindow c = new OvalWindow();
        c.setParentNode(this);
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_CircleButtonActionPerformed

    private void ChooseShapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseShapeComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ChooseShapeComboBoxActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if (ChooseShapeComboBox.getSelectedIndex() <= 0) {
        } else {
            drawingArea1.removeShape(drawingArea1.getShapes()[ChooseShapeComboBox.getSelectedIndex() - 1]);
            ChooseShapeComboBox.removeItemAt(ChooseShapeComboBox.getSelectedIndex());
            //drawingArea1.removeAll();
            drawingArea1.refresh(this.getGraphics());
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ColorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeButtonActionPerformed
        // TODO add your handling code here:
        if (ChooseShapeComboBox.getSelectedIndex() <= 0) {
        } else {
            Color chosenColor = JColorChooser.showDialog(null, "Select a border color", Color.white);
            Color chosenFillColor = JColorChooser.showDialog(null, "Select a filling color", Color.white);
            Shape temp = drawingArea1.getShapes()[ChooseShapeComboBox.getSelectedIndex() - 1];
            temp.setFillColor(chosenFillColor);
            temp.setColor(chosenColor);
            drawingArea1.refresh(this.getGraphics());
        }
    }//GEN-LAST:event_ColorizeButtonActionPerformed

    private void TriangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleButtonActionPerformed
        // TODO add your handling code here:
        TriangleWindow T = new TriangleWindow();
        T.setParentNode(this);
        this.setVisible(false);
        T.setVisible(true);
    }//GEN-LAST:event_TriangleButtonActionPerformed

    private void CopyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyButtonActionPerformed
        // TODO add your handling code here:
        if (ChooseShapeComboBox.getSelectedIndex() <= 0) {
        } else {
            int index = ChooseShapeComboBox.getSelectedIndex();
            Shape temp = drawingArea1.getShapes()[ChooseShapeComboBox.getSelectedIndex() - 1];
            if (temp instanceof Oval) {
                Oval Shapeoval = (Oval) drawingArea1.getShapes()[index - 1];
                Oval o = new Oval(Shapeoval.getPosition(), Shapeoval.getHorizontalRadius(), Shapeoval.getVerticalRadius());
                o.setColor(Shapeoval.getColor());
                o.setFillColor(Shapeoval.getFillColor());
                o.setHorizontalDiameter(o.getHorizontalRadius() * 2);
                o.setVerticalDiameter(o.getVerticalRadius() * 2);
                getDrawingArea().addShape(o);
                getDrawingArea().refresh(this.getGraphics());
                getDrawingArea().C++;
                getChooseShapeComboBox().addItem("Oval" + getDrawingArea().C);

            }
            if (temp instanceof Rectangle) {
                Rectangle Rec = (Rectangle) drawingArea1.getShapes()[index - 1];
                Rectangle R = new Rectangle(Rec.getPosition(), Rec.getHeight(), Rec.getWidth());
                R.setColor(Rec.getColor());
                R.setFillColor(Rec.getFillColor());
                getDrawingArea().addShape(R);
                getDrawingArea().refresh(this.getGraphics());
                getDrawingArea().R++;
                getChooseShapeComboBox().addItem("Rectangle" + getDrawingArea().R);
            }
            if (temp instanceof Triangle) {
                Triangle Tri = (Triangle) drawingArea1.getShapes()[index - 1];
                Triangle T = new Triangle(Tri.getPosition(), Tri.getPoint2(), Tri.getPoint3());
                T.setColor(Tri.getColor());
                T.setFillColor(Tri.getFillColor());
                getDrawingArea().addShape(T);
                getDrawingArea().refresh(this.getGraphics());
                getDrawingArea().T++;
                getChooseShapeComboBox().addItem("Triangle" + getDrawingArea().T);
            }
            if (temp instanceof Line) {
                Line Lin = (Line) drawingArea1.getShapes()[index - 1];
                Line L = new Line(Lin.getPosition(), Lin.getEndPoint());
                L.setColor(Lin.getColor());
                L.setFillColor(Lin.getFillColor());
                getDrawingArea().addShape(L);
                getDrawingArea().refresh(this.getGraphics());
                getDrawingArea().L++;
                getChooseShapeComboBox().addItem("Line" + getDrawingArea().L);
            }
        }
    }//GEN-LAST:event_CopyButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();

        for (int i = 0; i < drawingArea1.getShapes().length; i++) {
            AbstractShapeClass s = (AbstractShapeClass) drawingArea1.getShapes()[i];
            arr.add(s.getJSON());
        }

        obj.put("shapes", arr);

        JFileChooser fc = new JFileChooser("D:\\khalid\\Term 5");
        fc.setFileFilter(new FileNameExtensionFilter("JSON Files", "json"));
        fc.showDialog(null, "Save File");
        File selectedFile = fc.getSelectedFile();
        if (selectedFile != null) {
            String filePath = selectedFile.toString();
            if (!filePath.endsWith(".json")) {
                filePath += ".json";
            }
            try ( FileWriter file = new FileWriter(filePath)) {

                file.write(obj.toString());
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:

        JSONParser Parser = new JSONParser();
        getDrawingArea().clearShapes();

        JFileChooser fc = new JFileChooser("D:\\khalid\\Term 5");
        fc.setFileFilter(new FileNameExtensionFilter("JSON Files", "json"));
        fc.showDialog(null, "Load File");

        File selectedFile = fc.getSelectedFile();
        if (selectedFile != null) {
            String filePath = selectedFile.toString();
            try {
                Object obj = Parser.parse(new FileReader(filePath));
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray SHAPES = (JSONArray) jsonObject.get("shapes");
                DrawingArea area = getDrawingArea();
                //clear panel when load button is clicked
                for (int i = 0; i < SHAPES.size(); i++) {

                    JSONObject object = (JSONObject) SHAPES.get(i);
                    String objectType = (String) object.get("type");
                    if (objectType.equals("Line")) {
                        area.addShape(Line.JSONtoObject(object));
                        getChooseShapeComboBox().addItem("Line" + area.L);
                        area.L++;
                    } else if (objectType.equals("Oval")) {
                        area.addShape(Oval.JSONtoObject(object));
                        getChooseShapeComboBox().addItem("Oval" + area.C);
                        area.C++;
                    } else if (objectType.equals("Rectangle")) {
                        area.addShape(Rectangle.JSONtoObject(object));
                        getChooseShapeComboBox().addItem("Rectangle" + area.R);
                        area.R++;
                    } else {
                        area.addShape(Triangle.JSONtoObject(object));
                        getChooseShapeComboBox().addItem("Triangle" + area.T);
                        area.T++;
                    }
                    area.refresh(area.getGraphics());

                }
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found");;
            } catch (org.json.simple.parser.ParseException e) {
                System.out.println("parse exception");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("IOException");

            } catch (Exception e) {
                System.out.println("Exception");
                e.printStackTrace();
            }
    }//GEN-LAST:event_LoadButtonActionPerformed
    }

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
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseShapeComboBox;
    private javax.swing.JButton CircleButton;
    private javax.swing.JButton ColorizeButton;
    private javax.swing.JButton CopyButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton LineButton;
    private javax.swing.JMenuItem LoadButton;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JMenuItem SaveButton;
    private javax.swing.JLabel SelectShapeLabel;
    private javax.swing.JButton TriangleButton;
    private frontend.DrawingArea drawingArea1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    public DrawingArea getDrawingArea() {
        return drawingArea1;
    }

    public JComboBox<String> getChooseShapeComboBox() {

        return ChooseShapeComboBox;
    }

}
