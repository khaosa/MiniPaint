/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backend;

import java.awt.Graphics;
import java.awt.Point;

public interface Resizable {

    public void resize(Point point);

    public void drawResizingPoints(Graphics canvas);
    
    public boolean readyToMove(Point point);

}
