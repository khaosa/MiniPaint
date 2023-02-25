/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import org.json.simple.JSONObject;

/**
 *
 * @author LENOVO
 */
public class Rectangle extends AbstractShapeClass {

    private int height;
    private int width;
    private Rectangle x1;
    private Rectangle x2;
    private Rectangle x3;
    private Rectangle x4;

    public Rectangle(Point position, int height, int width) {
        super(position);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle getX1() {
        return x1;
    }

    public void setX1(Rectangle x1) {
        this.x1 = x1;
    }

    public Rectangle getX2() {
        return x2;
    }

    public void setX2(Rectangle x2) {
        this.x2 = x2;
    }

    public Rectangle getX3() {
        return x3;
    }

    public void setX3(Rectangle x3) {
        this.x3 = x3;
    }

    public Rectangle getX4() {
        return x4;
    }

    public void setX4(Rectangle x4) {
        this.x4 = x4;
    }

    @Override
    public void draw(Graphics canvas) {
        Color oldColor = canvas.getColor();
        canvas.setColor(this.getFillColor());
        canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(this.getColor());
        canvas.drawRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(oldColor);

    }

    @Override
    public void moveTo(Point point) {

        int x_difference = point.x - this.getDraggingpoint().x;
        int y_difference = point.y - this.getDraggingpoint().y;
        // System.out.println("x difference " + x_difference +" y difference "+ y_difference);
        int newX = this.getPosition().x + x_difference;
        int newY = this.getPosition().y + y_difference;
        this.setPosition(new Point(newX, newY));
        this.setDraggingpoint(new Point(getDraggingpoint().x + x_difference, getDraggingpoint().y + y_difference));
    }

    @Override
    public boolean contains(Point point) {

        return (point.x >= this.getPosition().x && point.x <= this.getPosition().x + width)
                && (point.y >= this.getPosition().y && point.y <= this.getPosition().y + height);
    }

    @Override
    public JSONObject getJSON() {
        JSONObject shape = super.getJSON();
        shape.put("type", this.getClass().getSimpleName());
        shape.put("height", height);
        shape.put("width", width);
        return shape;

    }

    public static Rectangle JSONtoObject(JSONObject obj) {
        JSONObject positionJSON = (JSONObject) obj.get("position");
        JSONObject draggingPointJSON = (JSONObject) obj.get("draggingPoint");
        Point position = new Point(Integer.parseInt(positionJSON.get("x").toString()), Integer.parseInt(positionJSON.get("y").toString()));
        Point draggingPoint = new Point(Integer.parseInt(draggingPointJSON.get("x").toString()), Integer.parseInt(draggingPointJSON.get("y").toString()));
        int height = Integer.parseInt(obj.get("height").toString());
        int width = Integer.parseInt((String) obj.get("width").toString());
        Rectangle rect = new Rectangle(position, height, width);
        int colorRGB = Integer.parseInt(obj.get("color").toString());
        int fillColorRGB = Integer.parseInt(obj.get("fillColor").toString());
        rect.setColor(new Color(colorRGB, true));
        rect.setFillColor(new Color(fillColorRGB, true));
        rect.setDraggingpoint(draggingPoint);
        return rect;
    }

    @Override
    public void drawResizingPoints(Graphics canvas) {
        setX1(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y - 5), SIZE, SIZE));
        setX2(new Rectangle(new Point(this.getPosition().x + this.getWidth() - 5, this.getPosition().y - 5), SIZE, SIZE));
        setX3(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y + getHeight() - 5), SIZE, SIZE));
        setX4(new Rectangle(new Point(this.getPosition().x + getWidth() - 5, this.getPosition().y + getHeight() - 5), SIZE, SIZE));
        x1.draw(canvas);
        x2.draw(canvas);
        x3.draw(canvas);
        x4.draw(canvas);

    }

    @Override
    public boolean readyToMove(Point point) {
        try {
            if (x1.contains(point)) {
                index = 0;
                return true;
            } else if (x2.contains(point)) {
                index = 1;
                return true;
            } else if (x3.contains(point)) {
                index = 2;
                return true;
            } else if (x4.contains(point)) {
                index = 3;
                return true;
            }
        } catch (NullPointerException e) {

        }
        return false;
    }

    @Override
    public void resize(Point point) {
        int x1_difference = point.x - this.getPosition().x;
        int y1_difference = point.y - this.getPosition().y;
        int x2_difference = point.x - this.getX2().getPosition().x - 5;
        int y2_difference = point.y - this.getX2().getPosition().y - 5;
        int x3_difference = point.x - this.getX3().getPosition().x - 5;
        int y3_difference = point.y - this.getX3().getPosition().y - 5;
        int x4_difference = point.x - this.getX4().getPosition().x - 5;
        int y4_difference = point.y - this.getX4().getPosition().y - 5;
        switch (index) {
            case 0://top left

                if (getX1().getPosition().x >= getX2().getPosition().x) {

                    this.setPosition(getX2().getPosition());
                    this.width = point.x-this.getPosition().x;
                    this.height=100;
                } else {
                    this.setPosition(point);
                    this.width = getWidth() - x1_difference;
                    this.height = getHeight() - y1_difference;
                }
                break;

            case 1://top right
                this.width = getWidth() + x2_difference;
                this.height = getHeight() - y2_difference;
                this.setPosition(new Point(getPosition().x, point.y));

                break;
            case 2://bottom left

                this.setPosition(new Point(point.x, getPosition().y));

                this.height = getHeight() + y3_difference;
                this.width = getWidth() - x3_difference;
                break;
            case 3://bottom right
                this.width = getWidth() + x4_difference;
                this.height = getHeight() + y4_difference;
                break;
            default:
                break;
        }
    }
}
