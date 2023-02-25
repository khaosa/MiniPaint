/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author LENOVO
 */
abstract public class AbstractShapeClass implements Shape, Moveable, Resizable {
    int index = -1;
    public static final int SIZE = 10;
    private Point position;
    private Color color = Color.BLACK;
    private Color fillColor = Color.BLACK;
    private Point draggingPoint = new Point();

    public AbstractShapeClass(Point position) {
        this.position = position;
    }

    @Override
    abstract public boolean contains(Point point);

    @Override
    abstract public void moveTo(Point point);

    @Override
    abstract public void draw(Graphics canvas);

    @Override
    public Point getDraggingpoint() {
        return draggingPoint;
    }

    @Override
    public void setDraggingpoint(Point point) {
        this.draggingPoint = point;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    @Override
    abstract public void drawResizingPoints(Graphics canvas);
    
    public JSONObject getJSON() {
        JSONObject shape = new JSONObject();
        JSONObject JSONposition = new JSONObject();
        JSONposition.put("x", getPosition().x);
        JSONposition.put("y", getPosition().y);

        JSONObject JSONdraggingPoint = new JSONObject();
        JSONdraggingPoint.put("x", getDraggingpoint().x);
        JSONdraggingPoint.put("y", getDraggingpoint().y);
        shape.put("draggingPoint", JSONdraggingPoint);
        shape.put("position", JSONposition);
        shape.put("color", getColor().getRGB());
        shape.put("fillColor", getFillColor().getRGB());
        shape.put("draggingPoint", JSONdraggingPoint);
        return shape;
    }

}
