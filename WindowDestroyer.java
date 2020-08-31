import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowDestroyer {
	
	public class WindowsDestroyer {
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
}
