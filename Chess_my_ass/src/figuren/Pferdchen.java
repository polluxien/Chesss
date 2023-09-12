package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class Pferdchen implements Figur {
	private int position;
	private char color;
	private int wert = 3;
	private Set<Integer> mg;

	public Pferdchen(int feld, char color) {
		mg = new HashSet<Integer>();
		this.position = feld;
		this.color = color;
	}

	@Override
	public Set<Integer> möglichkeiten(Map<Integer, Figur> figuren) {
		int arr[] = { -21, -19, -12, -8, 8, 12, 19, 21 };
		Figur fig = null;
		for (int i = 0; i < arr.length; i++) {
			int wntPos = arr[i] + position;
			if (wntPos >= 0 && wntPos <= 77 && wntPos % 10 <= 7) {
				fig = figuren.get(wntPos);
				if(fig != null) {
					if(fig.getColor() == color)
						continue;
				}
				mg.add(wntPos);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getifmoved() {
		// TODO Auto-generated method stub
		return false;
	}

}
