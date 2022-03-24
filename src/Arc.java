import java.awt.Graphics;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Barb Ericson
 */
public class Arc extends Shape
{
    private int startAngle;
    private int arcAngle;
    /** Constructor */
    public Arc()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
        startAngle = 70;
        arcAngle = 30;
    }

    /** Draw the shape
     * @param g   the graphics context on which to draw
     */
    @Override
    public void draw(Graphics g)
    {
        // set the color
        g.setColor(getColor());

        // draw the arc
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle); // the getter methods here are INHERITED FROM SHAPE!
    }
}


