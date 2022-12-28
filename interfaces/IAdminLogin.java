package interfaces;
import classes.*;
import java.awt.event.MouseEvent;

public interface IAdminLogin {
	
	User searchUser(String username);
	void mouseClicked(MouseEvent e);
	void mousePressed(MouseEvent e);
	void mouseReleased(MouseEvent e);
	void mouseEntered(MouseEvent e);
	void mouseExited(MouseEvent e);
}
