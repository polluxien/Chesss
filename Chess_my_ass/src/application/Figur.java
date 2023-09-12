package application;

import java.util.Map;
import java.util.Set;

public interface Figur {

	Set<Integer> möglichkeiten(Map<Integer, Figur> figuren);
	
	public char getColor();
	public int getPosition();
	public int getWert();
	public void setPosition(int wntPos);
	public void setbeenmoved();
	boolean getifmoved();

    
}