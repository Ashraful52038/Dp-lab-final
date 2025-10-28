import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *This class will return an image
 *from a binary data.
 */
class BufferedImageCustom {
   public Image imageReturn() 
      throws IOException {
      Image image;
      
      InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
      BufferedImage bImage2 = ImageIO.read(bis);
      image = bImage2;
      
      return image;
   }       
}