package figuren;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import application.Figur;

public class Dame implements Figur{
	
	private int position;
	private char color;
	private int wert = 9;
	private Set<Integer> mg;
	
	public Dame(int pos, char color) {
		mg = new HashSet<Integer>();
		this.position = pos;
		this.color = color;
	}

	@Override
	public Set<Integer> möglichkeiten(Map<Integer, Figur> figuren) {
		Figur fig = null;
		
		// Turm Eigenschaften
		// nach oben
		for (int i = position - 10; i >= 0; i -= 10) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
			}
		}
		// nach unten
		for (int i = position + 10; i <= 77; i += 10) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
			}
		}
		// nach links
		if (position % 10 != 0)
			for (int i = position - 1; i % 10 != 9; i--) {
				fig = figuren.get(i);
				if (fig == null) {
					mg.add(i);
				} else {
					if (fig.getColor() != color)
						mg.add(i);
					break;
				}
				continue;
			}

		// nach rechts
		if (position % 10 != 7)
			for (int i = position + 1; i % 10 != 8; i++) {
				fig = figuren.get(i);
				if (fig == null) {
					mg.add(i);
				} else {
					if (fig.getColor() != color)
						mg.add(i);
					break;
				}
				continue;
			}

		// Läufer Eigenschaften
		// nach oben
		for (int i = position - 9; i >= 0; i -= 9) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
				if (i % 10 <= 0 || i % 10 >= 7)
					break;
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
			}
		}
		for (int i = position - 11; i >= 0; i -= 11) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
				if (i % 10 <= 0 || i % 10 >= 7)
					break;
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
			}
		}
		// nach unten
		for (int i = position + 9; i <= 77; i += 9) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
				if (i % 10 <= 0 || i % 10 >= 7)
					break;
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
			}
		}
		for (int i = position + 11; i <= 77; i += 11) {
			fig = figuren.get(i);
			if (fig == null) {
				mg.add(i);
				if (i % 10 <= 0 || i % 10 >= 7)
					break;
			} else {
				if (fig.getColor() != color)
					mg.add(i);
				break;
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
