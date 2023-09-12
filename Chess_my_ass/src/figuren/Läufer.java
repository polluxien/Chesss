package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class Läufer implements Figur {

	private int position;
	private char color;
	private int wert = 3;
	private Set<Integer> mg;

	public Läufer(int feld, char color) {
		mg = new HashSet<Integer>();
		this.position = feld;
		this.color = color;
	}

	private boolean checker(int pos, Map<Integer, Figur> figuren) {
		Figur fig = figuren.get(pos);
		if (fig == null) {
			mg.add(pos);
			if (pos % 10 <= 0 || pos % 10 >= 7)
				return false;
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
		for (int i = position - 9; i >= 0; i -= 9) {
			if (!checker(i, figuren))
				break;
		}
		for (int i = position - 11; i >= 0; i -= 11) {
			if (!checker(i, figuren))
				break;
		}
		// nach unten
		for (int i = position + 9; i <= 77; i += 9) {
			if (!checker(i, figuren))
				break;
		}
		for (int i = position + 11; i <= 77; i += 11) {
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
