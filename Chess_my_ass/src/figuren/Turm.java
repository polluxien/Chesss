package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class Turm implements Figur {

	private int position;
	private char color;
	private int wert = 5;
	private boolean hasbeenmoved = false;
	private Set<Integer> mg;

	public Turm(int feld, char color) {
		mg = new HashSet<Integer>();
		this.position = feld;
		this.color = color;
	}

	private boolean checker(int pos, Map<Integer, Figur> figuren) {
		Figur fig = figuren.get(pos);
		if (fig == null) {
			mg.add(pos);
			return true;
		} else {
			if (fig.getColor() != color)
				mg.add(pos);
			return false;
		}
	}

	@Override
	public Set<Integer> möglichkeiten(Map<Integer, Figur> figuren) {
		// nach oben
		for (int i = position - 10; i >= 0; i -= 10) {
			if (!checker(i, figuren))
				break;
		}
		// nach unten
		for (int i = position + 10; i <= 77; i += 10) {
			if (!checker(i, figuren))
				break;
		}
		// nach links
		if (position % 10 != 0)
			for (int i = position - 1; i % 10 != 9; i--) {
				if (!checker(i, figuren))
					break;
			}

		// nach rechts
		if (position % 10 != 7)
			for (int i = position + 1; i % 10 != 8; i++) {
				if (!checker(i, figuren))
					break;
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

	public boolean getifmoved() {
		return hasbeenmoved;
	}

	@Override
	public void setbeenmoved() {
		this.hasbeenmoved = true;
		
	}

}
