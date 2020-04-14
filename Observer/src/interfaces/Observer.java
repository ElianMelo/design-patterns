package interfaces;

import java.util.Observable;

@SuppressWarnings("deprecation")
public interface Observer {
	void update(Observable o);
}
