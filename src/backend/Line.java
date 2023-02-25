package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.json.simple.JSONObject;

/**
 *
 * @author LENOVO
 */
public class Line extends AbstractShapeClass {

    private Point endPoint;
    private Rectangle startPointRec;
    private Rectangle endPointRec;

    public Line(Point position, Point endPoint) {
        super(position);
        this.endPoint = endPoint;
        setStartPointRec(new Rectangle(this.getPosition(), SIZE, SIZE));
        setEndPointRec(new Rectangle(this.getEndPoint(), SIZE, SIZE));
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public void draw(Graphics canvas) {
        Color oldColor = canvas.getColor();
        canvas.setColor(this.getColor());
        canvas.drawLine(this.getPosition().x, this.getPosition().y, this.getEndPoint().x, this.getEndPoint().y);
        canvas.setColor(oldColor);
    }

    @Override
    public boolean contains(Point point) {

        int dy = this.getEndPoint().y - this.getPosition().y;
        int dx = this.getEndPoint().x - this.getPosition().x;

        int dy_clickedLine = point.y - this.getPosition().y;
        int dx_clickedLine = point.x - this.getPosition().x;

        if (dx == 0) //original line is a vertical line
        {
            if (dy > 0) // dy is positive; y_endPoint is bigger than y_startPoint
            {
                return (point.y <= this.getEndPoint().y && point.y >= this.getPosition().y) && (point.x == this.getPosition().x);
            } else // dy is negative; y_startPoint is bigger than y_endPoint
            {
                return (point.y >= this.getEndPoint().y && point.y <= this.getPosition().y) && (point.x == this.getPosition().x);
            }
        }

        if (dx_clickedLine == 0) // clickedPoint x coordinate is the same as start point
        {
            if (point.y == this.getPosition().y) {
                return true;
            } else {
                return false;
            }
        }

        int m1 = dy / dx;                             // get slope of original drawn line  

        int m2 = dy_clickedLine / dx_clickedLine;     // get slope of startPoint and clickedPoint

        if (m1 != m2) {
            return false;
        } else {     //////////// same slope
            if (dy > 0) // dy is positive; y_endPoint is bigger than y_startPoint
            {
                return point.y <= this.getEndPoint().y && point.y >= this.getPosition().y;
            } else {   // dy is negative; y_startPoint is bigger than y_endPoint
                return point.y >= this.getEndPoint().y && point.y <= this.getPosition().y;
            }
        }

    }

    @Override
    public void moveTo(Point point) {
        int x_difference = point.x - this.getDraggingpoint().x;
        int y_difference = point.y - this.getDraggingpoint().y;
        Point newPosition = new Point((this.getPosition().x + x_difference), (this.getPosition().y + y_difference));
        Point newEndPoints = new Point((this.getEndPoint().x + x_difference), (this.getEndPoint().y + y_difference));
        this.setPosition(newPosition);
        this.setEndPoint(newEndPoints);
        this.setDraggingpoint(new Point(getDraggingpoint().x + x_difference, getDraggingpoint().y + y_difference));

    }

    @Override
    public JSONObject getJSON() {
        JSONObject shape = super.getJSON();
        JSONObject JSONendPoint = new JSONObject();
        JSONendPoint.put("x", getEndPoint().x);
        JSONendPoint.put("y", getEndPoint().y);
        shape.put("type", this.getClass().getSimpleName());
        shape.put("endPoint", JSONendPoint);
        return shape;
    }

    public static Line JSONtoObject(JSONObject obj) {
        JSONObject positionJSON = (JSONObject) obj.get("position");
        JSONObject endPointJSON = (JSONObject) obj.get("endPoint");
        JSONObject draggingPointJSON = (JSONObject) obj.get("draggingPoint");

        Point position = new Point(Integer.parseInt(positionJSON.get("x").toString()), Integer.parseInt(positionJSON.get("y").toString()));
        Point endPoint = new Point(Integer.parseInt(endPointJSON.get("x").toString()), Integer.parseInt(endPointJSON.get("y").toString()));
        Point draggingPoint = new Point(Integer.parseInt(draggingPointJSON.get("x").toString()), Integer.parseInt(draggingPointJSON.get("y").toString()));
        Line line = new Line(position, endPoint);
        int colorRGB = Integer.parseInt(obj.get("color").toString());
        int fillColorRGB = Integer.parseInt(obj.get("fillColor").toString());
        line.setColor(new Color(colorRGB, true));
        line.setFillColor(new Color(fillColorRGB, true));
        line.setDraggingpoint(draggingPoint);
        return line;
    }

    public Rectangle getStartPointRec() {
        return startPointRec;
    }

    public void setStartPointRec(Rectangle startPointRec) {
        this.startPointRec = startPointRec;
    }

    public Rectangle getEndPointRec() {
        return endPointRec;
    }

    public void setEndPointRec(Rectangle endPointRec) {
        this.endPointRec = endPointRec;
    }

    @Override
    public void drawResizingPoints(Graphics canvas) {
        setStartPointRec(new Rectangle(new Point(this.getPosition().x - 5, this.getPosition().y - 5), SIZE, SIZE));
        setEndPointRec(new Rectangle(new Point(this.getEndPoint().x - 5, this.getEndPoint().y - 5), SIZE, SIZE));
        startPointRec.draw(canvas);
        endPointRec.draw(canvas);
    }

    @Override
    public void resize(Point point) {
        switch (index) {
            case 0:
                this.setPosition(point);
                break;
            case 1:
                this.setEndPoint(point);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean readyToMove(Point point) {

        if (startPointRec.contains(point)) {
            index = 0;
            return true;
        } else if (endPointRec.contains(point)) {
            index = 1;
            return true;
        }
        return false;
    }

}
