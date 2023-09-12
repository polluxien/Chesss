package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class König implements Figur {

	private int position;
	private char color;
	private int wert = 39;
	private boolean beenmoved = false;
	private Set<Integer> mg;

	public König(int pos, char color) {
		mg = new HashSet<Integer>();
		this.position = pos;
		this.color = color;
	}

	@Override
	public Set<Integer> möglichkeiten(Map<Integer, Figur> figuren) {
		int arr[] = { -11, -10, -9, -1, 1, 11, 10, 9 };
		Figur fig = null;
		
		for (int i = 0; i < arr.length; i++) {
			int wntPos = arr[i] + position;
			if (wntPos >= 0 && wntPos <= 77 && wntPos % 10 <= 7 && wntPos % 10 >= 0) {
				fig = figuren.get(wntPos);
				if (fig != null) {
					if (fig.getColor() == color)
						continue;
				}
				mg.add(wntPos);
			}
		}
		if(!beenmoved) {  // Rocharde 
			Figur turm = figuren.get(position + 4);
			if(turm instanceof Turm) {
				if(!(turm.getifmoved()) && figuren.get(position + 1) == null && figuren.get(position + 2) == null && figuren.get(position + 3) == null) {
					mg.add(position + 2);
				}
			}
			turm = figuren.get(position - 3);
			if(turm instanceof Turm) {
				if(!turm.getifmoved() && figuren.get(position - 1) == null && figuren.get(position - 2) == null) {
					mg.add(position - 2);
				}
			}
			
		}
		
		return mg;
	}

	@Override
	public char getColor() {
		return color;
	}

	@Override
	public int getPosition() {
		return position;
	}

	@Override
	public void setPosition(int wntPos) {
		this.position = wntPos;

	}

	@Override
	public int getWert() {
		return wert;
	}

	@Override
	public void setbeenmoved() {
		this.beenmoved = true;
		
	}

	@Override
	public boolean getifmoved() {
		return beenmoved;
	}

}
