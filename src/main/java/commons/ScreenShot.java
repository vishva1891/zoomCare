package commons;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

import config.FileHelper;
import config.JsonData;

public class ScreenShot extends Commons {
    /** Screenshot File */
    public static byte[] scrFile = null;
    public static ByteArrayOutputStream screenCapture;
    public static String fileLocation = "";

    public static byte[] screenShot() {
	try {
	    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	    Thread.sleep(2000);
	    BufferedImage capture = new Robot().createScreenCapture(screenRect);
	    fileLocation = FileHelper.directoryName + "\\" + JsonData.suite + "-" + JsonData.title + ".png";
	    ImageIO.write(capture, "png", new File(fileLocation));
	    screenCapture = new ByteArrayOutputStream();
	    ImageIO.write(capture, "png", screenCapture);
	    screenCapture.flush();
	    scrFile = screenCapture.toByteArray();
	    screenCapture.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return scrFile;
    }
}
