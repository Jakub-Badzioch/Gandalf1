import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;

public class Gandalf1 {
    private static Robot robot = null;

    public static void main(String[] args) throws Exception
    {
        int x = 0;
        int y = 0;
        int ddelay = 0;

        for (int i = 0; i < 11; i++)
        {
            if(i == 0)
            {
                ddelay = 12000;
            }
            else
            {
                ddelay =6000;
            }
            Gandalf();
            klick(x, y, ddelay);
        }

    }


    public static void klick (int x, int y, int ddelay){
        robot.mouseMove(x, y);
        robot.delay(ddelay);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    public static void Gandalf() throws Exception {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.youtube.com/watch?v=Sagg08DrO5U"));

        try
        {
            robot = new Robot();
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }

        int ddelay =0;
        for (int i = 0; i < 11; i++)
        {
            if(i == 0)
            {
                ddelay = 12000;
            }
            else
            {
                ddelay =6000;
            }
        }
        klick(960, 540, ddelay);
    }
}
