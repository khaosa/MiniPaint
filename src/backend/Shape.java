/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backend;
import java.awt.Point;
import java.util.Map;
/**
 *
 * @author LENOVO
 */
public interface Shape {

    /* set position */
    public void setPosition(Point position);

    public java.awt.Point getPosition();

    /* colorize */
    public void setColor(java.awt.Color color);

    public java.awt.Color getColor();

    public void setFillColor(java.awt.Color color);

    public java.awt.Color getFillColor();

    /* redraw the shape on the canvas */
    public void draw(java.awt.Graphics canvas);

}
