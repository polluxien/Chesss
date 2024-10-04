package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class Bauer implements Figur {

	private int position;
	private char color;
	private int wert = 1;
	private boolean beenmoved = false;
	private Set<Integer> mg;

	public Bauer(int feld, char color) {
		mg = new HashSet<Integer>();
		this.position = feld;
		this.color = color;
	}

	@Override
	public Set<Integer> möglichkeiten(Map<Integer, Figur> figuren) {
		int schlagL;
		int schlagR;
		if (color == 'w') { // vorne
			schlagL = position - 11;
			schlagR = position - 9;
			if (!beenmoved && figuren.get(position - 20) == null && figuren.get(position - 10) == null)
				mg.add(position - 20);
			if (figuren.get(position - 10) == null)
				mg.add(position - 10);

		} else { // hinten
			schlagR = position + 11;
			schlagL = position + 9;
			if (!beenmoved && figuren.get(position + 20) == null && figuren.get(position + 10) == null)
					mg.add(position + 20);
			if (figuren.get(position + 10) == null)
				mg.add(position + 10);

		}
		if (figuren.get(schlagL) != null) {
			if (figuren.get(schlagL).getColor() != color)
				mg.add(schlagL);
		}
		if (figuren.get(schlagR) != null) {
			if (figuren.get(schlagR).getColor() != color)
				mg.add(schlagR);
		}
		return mg;

	}

	@Override
	public char getColor() {
		return color;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

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