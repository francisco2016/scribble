import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);  
        myCanvas.erase();
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a triangle on the screen.  -------------------------------------------------------------------------------  0099
     */
    public void drawTriangle(int x, int y)
    {
        Pen pen = new Pen(x, y, myCanvas);
        pen.setColor(Color.GREEN);
        for(int i = 0; i<3; i ++){
            pen.move(150);
            pen.turn(-120);
        }
    }

    /**
     * Draw a pentagono on the screen.  -------------------------------------------------------------------------------  0099
     */
    public void drawPentagon()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.GREEN);
        for(int i = 0; i<5; i ++){
            pen.move(60);
            pen.turn(-72);
        }
    }

    /**
     * Draw a drawPolygon on the screen.  -------------------------------------------------------------------------------  0099
     */
    public void drawPolygon(int n)
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.GREEN);
        for(int i = 0; i<n; i ++){
            pen.move(80);
            pen.turn(-360/n);
        }
    }

    /**
     * Dibuja una espiral  -------------------------------------------------------------------------------  0099
     *      '''''''''''''''??????????????????????????????????????????????????????????????????????????????
     */
    public void drawSpiral()
    {
        Pen pen = new Pen (60,  5, myCanvas);
        pen.setColor(Color.GREEN);
        
        int tamanno = 300;
        while(   tamanno > 1){
                pen.move (tamanno)   ;
                pen.turn(90 );
                tamanno = tamanno -3;
        }
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));

            pen.randomSquiggle();
        }
    }

    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
}
