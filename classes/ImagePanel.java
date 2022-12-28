package classes;
import interfaces.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

public class ImagePanel extends JComponent implements IImagePanel{

	    private Image image;
	    public ImagePanel(Image image) {
	        this.image = image;
	    }
	    @Override
		public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this);
	    }
	}

