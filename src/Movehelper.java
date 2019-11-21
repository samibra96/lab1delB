public class Movehelper {
    /**
     * move() makes car move in x and y direction depending on angle and cos/sin functions.
     * + on Y makes car move downwards. IE the unit circle is upside down.
     */
    public void move(Movable m) {
        m.setX(m.getX() * Math.cos(m.getAngle()) * Math.abs(Math.cos(m.getAngle())) * m.getCurrentSpeed());
        m.setY(m.getY() * Math.sin(m.getAngle()) * Math.abs(Math.sin(m.getAngle())) * m.getCurrentSpeed());
        //x = x + Math.cos(angle) * Math.abs(Math.cos(angle)) * currentSpeed;
        //y = y + Math.sin(angle) * Math.abs(Math.sin(angle)) * currentSpeed;
    }

    /**
     * Makes car turn left by decreasing angle with &pi;/16
     */
    public void turnLeft(Movable m) {
        m.setAngle(m.getAngle() - Math.PI/16);
        //angle = angle - Math.PI/16;
    }

    /**
     * Makes car turn right by increasing angle with &pi;/16
     */
    public void turnRight(Movable m) {
        m.setAngle(m.getAngle()+Math.PI/16);
        //angle = angle + Math.PI/16;
    }

}
