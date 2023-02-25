/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backend;

import java.awt.Point;


public interface Moveable {
    public void setDraggingpoint(Point point);
    
    public Point getDraggingpoint();
    
    public boolean contains(Point point);
    
    public void moveTo(Point point);
    
    
}
