/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import org.json.simple.JSONObject;

public class Triangle extends AbstractShapeClass {

    Point point2;
    Point point3;
    private Rectangle x1;
    private Rectangle x2;
    private Rectangle x3;

    public Triangle(Point position, Point point2, Point point3) {
        super(position);
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
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

    @Override
    public void draw(Graphics canvas) {
        int x1 = (int) getPosition().getX();
        int x2 = (int) getPoint2().getX();
        int x3 = (int) getPoint3().getX();
        int y1 = (int) getPosition().getY();
        int y2 = (int) getPoint2().getY();
        int y3 = (int) getPoint3().getY();
        int x[] = {x1, x2, x3};
        int y[] = {y1, y2, y3};
        Color oldColor = canvas.getColor();
        canvas.setColor(this.getFillColor());
        canvas.fillPolygon(x, y, 3);
        canvas.setColor(this.getColor());
        canvas.drawPolygon(x, y, 3);
        canvas.setColor(oldColor);
    }

    @Override
    public void moveTo(Point point) {

        int x_difference = point.x - this.getDraggingpoint().x;
        int y_difference = point.y - this.getDraggingpoint().y;
        // System.out.println("x difference " + x_difference +" y difference "+ y_difference);
        int newX = this.getPosition().x + x_difference;
        int newY = this.getPosition().y + y_difference;

        int newX2 = this.getPoint2().x + x_difference;
        int newY2 = this.getPoint2().y + y_difference;

        int newX3 = this.getPoint3().x + x_difference;
        int newY3 = this.getPoint3().y + y_difference;

        this.setPosition(new Point(newX, newY));
        this.setPoint2(new Point(newX2, newY2));
        this.setPoint3(new Point(newX3, newY3));
        this.setDraggingpoint(new Point(getDraggingpoint().x + x_difference, getDraggingpoint().y + y_difference));
    }

    static double area(Point position, Point point2, Point point3) {
        return Math.abs((position.x * (point2.y - point3.y) + point2.x * (point3.y - position.y)
                + point3.x * (position.y - point2.y)) / 2.0);
    }

    @Override
    public boolean contains(Point point) {
        /* Calculate area of triangle ABC */
        double A = area(getPosition(), point2, point3);

        /* Calculate area of triangle PBC */
        double A1 = area(point, point2, point3);

        /* Calculate area of triangle PAC */
        double A2 = area(getPosition(), point, point3);

        /* Calculate area of triangle PAB */
        double A3 = area(getPosition(), point2, point);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }

    @Override
    public JSONObject getJSON() {
        JSONObject shape = super.getJSON();
        JSONObject JSONPoint2 = new JSONObject();
        JSONObject JSONPoint3 = new JSONObject();
        JSONPoint2.put("x", getPoint2().x);
        JSONPoint2.put("y", getPoint2().y);

        JSONPoint3.put("x", getPoint3().x);
        JSONPoint3.put("y", getPoint3().y);

        shape.put("type", this.getClass().getSimpleName());
        shape.put("point2", JSONPoint2);
        shape.put("point3", JSONPoint3);

        return shape;

    }

    public static Triangle JSONtoObject(JSONObject obj) {
        JSONObject positionJSON = (JSONObject) obj.get("position");
        JSONObject point2JSON = (JSONObject) obj.get("point2");
        JSONObject point3JSON = (JSONObject) obj.get("point3");
        JSONObject draggingPointJSON = (JSONObject) obj.get("draggingPoint");
        Point position = new Point(Integer.parseInt(positionJSON.get("x").toString()), Integer.parseInt(positionJSON.get("y").toString()));
        Point point2 = new Point(Integer.parseInt(point2JSON.get("x").toString()), Integer.parseInt(point2JSON.get("y").toString()));
        Point point3 = new Point(Integer.parseInt(point3JSON.get("x").toString()), Integer.parseInt(point3JSON.get("y").toString()));
        Point draggingPoint = new Point(Integer.parseInt(draggingPointJSON.get("x").toString()), Integer.parseInt(draggingPointJSON.get("y").toString()));
        Triangle triangle = new Triangle(position, point2, point3);
        int colorRGB = Integer.parseInt(obj.get("color").toString());
        int fillColorRGB = Integer.parseInt(obj.get("fillColor").toString());
        triangle.setColor(new Color(colorRGB, true));
        triangle.setFillColor(new Color(fillColorRGB, true));
        triangle.setDraggingpoint(draggingPoint);
        return triangle;
    }

    @Override
    public void drawResizingPoints(Graphics canvas) {
        setX1(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y - 5), SIZE, SIZE));
        setX2(new Rectangle(new Point(this.point2.x - 5, this.point2.y - 5), SIZE, SIZE));
        setX3(new Rectangle(new Point(this.point3.x - 5, this.point3.y - 5), SIZE, SIZE));
        x1.draw(canvas);
        x2.draw(canvas);
        x3.draw(canvas);
    }

    @Override
    public void resize(Point point) {
        switch (index) {
            case 0:
                this.setPosition(point);
                break;
            case 1:
                this.setPoint2(point);
                break;
            case 2:
                this.setPoint3(point);
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
            }
        } catch (NullPointerException e) {

        }
        return false;

    }

}
