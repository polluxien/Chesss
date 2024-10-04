package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import figuren.Bauer;
import figuren.Dame;
import figuren.König;
import figuren.Läufer;
import figuren.Pferdchen;
import figuren.Turm;

public class Modell {

	private Map<Integer, Figur> figuren = null;
	private char curPlayer = 'w';

	public Modell(char playerOne, char playerTwo) {
		this.figuren = new HashMap<Integer, Figur>();

		// mit Hashmap Felder erstellen und mit null befüllen
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				figuren.put(x * 10 + y, null);
			}
		}
		// Figuren in Hashmap eintragen
		// Bauern
		for (int i = 0; i < 8; i++) {
			int felde_w = 10 + i;
			figuren.put(felde_w, new Bauer(felde_w, playerTwo));
			int feld_b = 6 * 10 + i;
			figuren.put(feld_b, new Bauer(feld_b, playerOne));
		}

		// Turm
		figuren.put(0, new Turm(0, playerTwo));
		figuren.put(7, new Turm(7, playerTwo));
		figuren.put(70, new Turm(70, playerOne));
		figuren.put(77, new Turm(77, playerOne));

		// Läufer
		figuren.put(2, new Läufer(2, playerTwo));
		figuren.put(5, new Läufer(5, playerTwo));
		figuren.put(72, new Läufer(72, playerOne));
		figuren.put(75, new Läufer(75, playerOne));

		// Pferdchen
		figuren.put(1, new Pferdchen(1, playerTwo));
		figuren.put(6, new Pferdchen(6, playerTwo));
		figuren.put(71, new Pferdchen(71, playerOne));
		figuren.put(76, new Pferdchen(76, playerOne));

		// König
		figuren.put(4, new König(4, playerTwo));
		figuren.put(74, new König(74, playerOne));

		// Dame
		figuren.put(3, new Dame(3, playerTwo));
		figuren.put(73, new Dame(73, playerOne));

	}

	public Map<Integer, Figur> getFigurenmap() {
		return figuren;
	}

	public void setFigur(int pos, Figur figur) {
		figuren.put(pos, figur);
	}

	public char getcurPlayer() {
		return curPlayer;
	}

	public void switchcurPlayer() {
		char player = curPlayer == 'w' ?  'b' : 'w';
		this.curPlayer = player;
	}

	public Set<Integer> possability(int feld) {
		Set<Integer> possibilities = new HashSet<>();
		if (figuren.get(feld) != null) {
			Figur figur = figuren.get(feld);
			return figur.möglichkeiten(figuren);
		}
		return possibilities;
	}

	public void move(int curPos, int wntPos) {
		if (figuren.get(curPos) instanceof Figur) {
			Figur fig = figuren.get(curPos);
			// Rocharde
			if (fig instanceof König) {
				if (wntPos == curPos + 2 || wntPos == curPos - 2) {
					int curTurmPos = wntPos == curPos + 2 ? wntPos + 1 : wntPos - 2;
					Figur figTurm = figuren.get(curTurmPos);
					figTurm.setPosition(wntPos == curPos + 2 ? wntPos - 1 : wntPos + 1);
					figuren.put(figTurm.getPosition(), figTurm);
					figuren.put(curTurmPos, null);
				}
			}

			fig.setbeenmoved();
			figuren.put(curPos, null);
			figuren.put(wntPos, fig);
			fig.setPosition(wntPos);
		}
	}
}