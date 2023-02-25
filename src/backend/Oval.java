/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import org.json.simple.JSONObject;

/**
 *
 * @author LENOVO
 */
public class Oval extends AbstractShapeClass {

    private int horizontalRadius;
    private int verticalRadius;
    private int horizontalDiameter;
    private int verticalDiameter;
    private Rectangle x1;
    private Rectangle x2;
    private Rectangle x3;
    private Rectangle x4;

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

    public Oval(Point position, int horizontalRadius, int verticalRadius) {
        super(position);
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    public int getHorizontalRadius() {
        return horizontalRadius;
    }

    public void setHorizontalRadius(int horizontalRadius) {
        this.horizontalRadius = horizontalRadius;
    }

    public int getVerticalRadius() {
        return verticalRadius;
    }

    public void setVerticalRadius(int verticalRadius) {
        this.verticalRadius = verticalRadius;
    }

    public int getHorizontalDiameter() {
        return horizontalDiameter;
    }

    public void setHorizontalDiameter(int horizontalDiameter) {
        this.horizontalDiameter = horizontalDiameter;
    }

    public int getVerticalDiameter() {
        return verticalDiameter;
    }

    public void setVerticalDiameter(int verticalDiameter) {
        this.verticalDiameter = verticalDiameter;
    }

    @Override
    public void draw(Graphics canvas) {
        Color oldColor = canvas.getColor();
        canvas.setColor(this.getColor());
        canvas.drawOval(this.getPosition().x, this.getPosition().y, getHorizontalDiameter(), getVerticalDiameter());
        canvas.setColor(this.getFillColor());
        canvas.fillOval(this.getPosition().x, this.getPosition().y, getHorizontalDiameter(), getVerticalDiameter());
        canvas.setColor(oldColor);
    }

    public static double distance(Point A, Point B) {
        return Math.sqrt((Math.pow((A.x - B.x), 2) + Math.pow((A.y - B.y), 2)));
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
        Point center = new Point(this.getPosition().x + horizontalRadius, this.getPosition().y + verticalRadius); //? - or +
        if (distance(center, point) <= horizontalRadius && distance(center, point) <= verticalRadius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public JSONObject getJSON() {
        JSONObject shape = super.getJSON();
        shape.put("type", this.getClass().getSimpleName());
        shape.put("horizontalRadius", horizontalRadius);
        shape.put("verticalRadius", verticalRadius);
        return shape;

    }

    public static Oval JSONtoObject(JSONObject obj) {
        JSONObject positionJSON = (JSONObject) obj.get("position");
        JSONObject draggingPointJSON = (JSONObject) obj.get("draggingPoint");
        Point position = new Point(Integer.parseInt(positionJSON.get("x").toString()), Integer.parseInt(positionJSON.get("y").toString()));
        Point draggingPoint = new Point(Integer.parseInt(draggingPointJSON.get("x").toString()), Integer.parseInt(draggingPointJSON.get("y").toString()));
        int horizontalradius = Integer.parseInt(obj.get("horizontalRadius").toString());
        int verticallradius = Integer.parseInt((String) obj.get("verticalRadius").toString());
        Oval oval = new Oval(position, horizontalradius, verticallradius);
        int colorRGB = Integer.parseInt(obj.get("color").toString());
        int fillColorRGB = Integer.parseInt(obj.get("fillColor").toString());
        oval.setColor(new Color(colorRGB, true));
        oval.setFillColor(new Color(fillColorRGB, true));
        oval.setDraggingpoint(draggingPoint);
        oval.setHorizontalDiameter(oval.getHorizontalRadius() * 2);
        oval.setVerticalDiameter(oval.getVerticalRadius() * 2);
        return oval;
    }

    @Override
    public void drawResizingPoints(Graphics canvas) {
        setX1(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y - 5), SIZE, SIZE));
        setX2(new Rectangle(new Point(this.getPosition().x - 5 + getHorizontalDiameter(), this.getPosition().y - 5), SIZE, SIZE));
        setX3(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y + getVerticalDiameter() - 5), SIZE, SIZE));
        setX4(new Rectangle(new Point(this.getPosition().x + getHorizontalDiameter() - 5, this.getPosition().y + getVerticalDiameter() - 5), SIZE, SIZE));
        x1.draw(canvas);
        x2.draw(canvas);
        x3.draw(canvas);
        x4.draw(canvas);
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

                this.setPosition(point);
                this.horizontalDiameter = getHorizontalDiameter() - x1_difference;
                this.verticalDiameter = getVerticalDiameter() - y1_difference;

                break;

            case 1://top right
                this.setPosition(new Point(getPosition().x, point.y));
                this.horizontalDiameter = getHorizontalDiameter() + x2_difference;
                this.verticalDiameter = getVerticalDiameter() - y2_difference;
                break;
            case 2://bottom left

                this.setPosition(new Point(point.x, getPosition().y));

                this.verticalDiameter = getVerticalDiameter() + y3_difference;
                this.horizontalDiameter = getHorizontalDiameter() - x3_difference;
                break;
            case 3://bottom right
                this.horizontalDiameter = getHorizontalDiameter() + x4_difference;
                this.verticalDiameter = getVerticalDiameter() + y4_difference;
                break;
            default:
                break;
        }
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

}
