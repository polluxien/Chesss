package application;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

public class Controller implements Initializable, EventHandler {

	@FXML
	GridPane gridPaneGitter;

	@FXML
	GridPane gridPaneGitterWhite;

	@FXML
	GridPane gridPaneGitterBlack;

	@FXML
	Button buttonRetry; // retry button

	@FXML
	Button buttonTurn;

	@FXML
	Text punkt_playerW;

	@FXML
	Text punkt_playerB;

	// Main Pane Zellen

	@FXML
	Pane paneZelle_00; // a8

	@FXML
	Pane paneZelle_01; // b8

	@FXML
	Pane paneZelle_02; // c8

	@FXML
	Pane paneZelle_03; // d8

	@FXML
	Pane paneZelle_04; // e8

	@FXML
	Pane paneZelle_05; // f8

	@FXML
	Pane paneZelle_06; // g8

	@FXML
	Pane paneZelle_07; // h8

	@FXML
	Pane paneZelle_10; // a7

	@FXML
	Pane paneZelle_11; // b7

	@FXML
	Pane paneZelle_12; // c7

	@FXML
	Pane paneZelle_13; // d7

	@FXML
	Pane paneZelle_14; // e7

	@FXML
	Pane paneZelle_15; // f7

	@FXML
	Pane paneZelle_16; // g7

	@FXML
	Pane paneZelle_17; // h7

	@FXML
	Pane paneZelle_20; // a6

	@FXML
	Pane paneZelle_21; // b6

	@FXML
	Pane paneZelle_22; // c6

	@FXML
	Pane paneZelle_23; // d6

	@FXML
	Pane paneZelle_24; // e6

	@FXML
	Pane paneZelle_25; // f6

	@FXML
	Pane paneZelle_26; // g6

	@FXML
	Pane paneZelle_27; // h6

	@FXML
	Pane paneZelle_30; // a5

	@FXML
	Pane paneZelle_31; // b5

	@FXML
	Pane paneZelle_32; // c5

	@FXML
	Pane paneZelle_33; // d5

	@FXML
	Pane paneZelle_34; // e5

	@FXML
	Pane paneZelle_35; // f5

	@FXML
	Pane paneZelle_36; // g5

	@FXML
	Pane paneZelle_37; // h5

	@FXML
	Pane paneZelle_40; // a4

	@FXML
	Pane paneZelle_41; // b4

	@FXML
	Pane paneZelle_42; // c4

	@FXML
	Pane paneZelle_43; // d4

	@FXML
	Pane paneZelle_44; // e4

	@FXML
	Pane paneZelle_45; // f4

	@FXML
	Pane paneZelle_46; // g4

	@FXML
	Pane paneZelle_47; // h4

	@FXML
	Pane paneZelle_50; // a3

	@FXML
	Pane paneZelle_51; // b3

	@FXML
	Pane paneZelle_52; // c3

	@FXML
	Pane paneZelle_53; // d3

	@FXML
	Pane paneZelle_54; // e3

	@FXML
	Pane paneZelle_55; // f3

	@FXML
	Pane paneZelle_56; // g3

	@FXML
	Pane paneZelle_57; // h3

	@FXML
	Pane paneZelle_60; // a2

	@FXML
	Pane paneZelle_61; // b2

	@FXML
	Pane paneZelle_62; // c2

	@FXML
	Pane paneZelle_63; // d2

	@FXML
	Pane paneZelle_64; // e2

	@FXML
	Pane paneZelle_65; // f2

	@FXML
	Pane paneZelle_66; // g2

	@FXML
	Pane paneZelle_67; // h2

	@FXML
	Pane paneZelle_70; // a1

	@FXML
	Pane paneZelle_71; // b1

	@FXML
	Pane paneZelle_72; // c1

	@FXML
	Pane paneZelle_73; // d1

	@FXML
	Pane paneZelle_74; // e1

	@FXML
	Pane paneZelle_75; // f1

	@FXML
	Pane paneZelle_76; // g1

	@FXML
	Pane paneZelle_77; // h1

	// Pane Zellen White

	@FXML
	Pane paneZelleW_0;

	@FXML
	Pane paneZelleW_1;

	@FXML
	Pane paneZelleW_2;

	@FXML
	Pane paneZelleW_3;

	@FXML
	Pane paneZelleW_4;

	@FXML
	Pane paneZelleW_5;

	@FXML
	Pane paneZelleW_6;

	@FXML
	Pane paneZelleW_7;

	@FXML
	Pane paneZelleW_8;

	@FXML
	Pane paneZelleW_9;

	@FXML
	Pane paneZelleW_10;

	@FXML
	Pane paneZelleW_11;

	@FXML
	Pane paneZelleW_12;

	@FXML
	Pane paneZelleW_13;

	@FXML
	Pane paneZelleW_14;

	@FXML
	Pane paneZelleW_15;

	@FXML
	Pane paneZelleW_16;

	@FXML
	Pane paneZelleW_17;

	// Pane Zellen Black

	@FXML
	Pane paneZelleB_0;

	@FXML
	Pane paneZelleB_1;

	@FXML
	Pane paneZelleB_2;

	@FXML
	Pane paneZelleB_3;

	@FXML
	Pane paneZelleB_4;

	@FXML
	Pane paneZelleB_5;

	@FXML
	Pane paneZelleB_6;

	@FXML
	Pane paneZelleB_7;

	@FXML
	Pane paneZelleB_8;

	@FXML
	Pane paneZelleB_9;

	@FXML
	Pane paneZelleB_10;

	@FXML
	Pane paneZelleB_11;

	@FXML
	Pane paneZelleB_12;

	@FXML
	Pane paneZelleB_13;

	@FXML
	Pane paneZelleB_14;

	@FXML
	Pane paneZelleB_15;

	@FXML
	Pane paneZelleB_16;

	@FXML
	Pane paneZelleB_17;

	private Modell Spiel = null;
	Set<Integer> mg = new HashSet<Integer>();

	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("initialize() wird aufgerufen!");
		char playerOne = 'b';
		char playerTwo = 'w';
		Spiel = new Modell(playerOne, playerTwo);

		paneZelle_00.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_01.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_02.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_03.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_04.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_05.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_06.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_07.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_10.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_11.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_12.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_13.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_14.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_15.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_16.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_17.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_20.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_21.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_22.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_23.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_24.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_25.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_26.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_27.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_30.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_31.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_32.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_33.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_34.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_35.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_36.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_37.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_40.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_41.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_42.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_43.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_44.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_45.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_46.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_47.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_50.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_51.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_52.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_53.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_54.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_55.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_56.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_57.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_60.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_61.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_62.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_63.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_64.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_65.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_66.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_67.setOnMouseClicked(this::handlePaneZelle);

		paneZelle_70.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_71.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_72.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_73.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_74.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_75.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_76.setOnMouseClicked(this::handlePaneZelle);
		paneZelle_77.setOnMouseClicked(this::handlePaneZelle);

		buttonRetry.setOnAction(this);
		buttonTurn.setOnAction(this);

		punkt_playerW.setText("00");
		punkt_playerB.setText("00");

		System.out.print("initialize wurde ausgeführt");
		schachbretterstellung(Spiel.getFigurenmap());
	}

	int punkteW = 0;
	int punkteB = 0;

	// setzt beide Punktestände wieder zurück
	public void resetPunkte() {
		punkt_playerW.setText("00");
		punkt_playerB.setText("00");

		punkteW = 0;
		punkteB = 0;
	}

	// addiert die gewonennen Punkte zum gesamt Punktestand und gibt den Höheren aus
	public void setPunktestand(char player, int punkte) {
		if (player == 'w') {
			punkteW -= punkte;
		} else {
			punkteB -= punkte;
		}

		int punkteDifferenz = punkteW - punkteB;
		String punkteStringW = punkteW > punkteB ? "+" + punkteDifferenz : "";
		String punkteStringB = punkteB > punkteW ? "+" + (-punkteDifferenz) : "";
		punkt_playerW.setText(punkteStringW);
		punkt_playerB.setText(punkteStringB);
	}

	// gibt an auf welcher Seite sich das Brett grade befindet
	boolean isturned = false;

	// Rotiert das Brett um 180 Grad und wechselt status der isturned Variable
	public void boardRotation(Map<Integer, Figur> figuren) {
		Rotate rotateGrid = new Rotate(180, gridPaneGitter.getWidth() / 2, gridPaneGitter.getHeight() / 2);
		gridPaneGitter.getTransforms().add(rotateGrid);
		if (isturned)
			isturned = false;
		else
			isturned = true;
		schachbretterstellung(Spiel.getFigurenmap());
	}

	private ImageView getImageViewById(Pane pane, String id) {
		for (Node node : pane.getChildren()) {
			String nodeId = node.getId();
			if (node instanceof ImageView && nodeId.equals(id)) {
				return (ImageView) node;
			}
		}
		return null;
	}

	// Iteriert die ganze Map und gibt das auf dem Spielfeld wieder
	public void schachbretterstellung(Map<Integer, Figur> figuren) {
		for (Integer cor : figuren.keySet()) {
			String corString = (cor < 10) ? "0" + cor.toString() : cor.toString();
			Pane paneZelle = (Pane) gridPaneGitter.lookup("#paneZelle_" + corString);
			paneZelle.getChildren().clear();

			if (figuren.get(cor) != null) {
				Figur fig = figuren.get(cor);
				String figname = fig.getClass().getSimpleName();
				Image image = new Image("/Texturen/" + figname + "_" + fig.getColor() + ".png");
				ImageView imageView = new ImageView(image);
				imageView.setId("imageView");

				// ImageView Einstellungen
				double newWidth = 25; // Breite
				double newHeight = 25; // Höhe

				imageView.setFitWidth(newWidth);
				imageView.setFitHeight(newHeight);
				imageView.layoutXProperty().bind(paneZelle.widthProperty().subtract(newWidth).divide(2));
				imageView.layoutYProperty().bind(paneZelle.heightProperty().subtract(newHeight).divide(2));
				if (isturned) {
					Rotate rotateImageView = new Rotate(180, newWidth / 2, newHeight / 2);
					imageView.getTransforms().add(rotateImageView);
				}
				paneZelle.getChildren().add(imageView);

				System.out.println(figname + " : " + cor);
				Spiel.setFigur((int) cor, fig);
			} else {
				Spiel.setFigur(cor, null);
			}
			paneZelle.requestLayout();
		}
	}

	public void schachbrettreset() {
		Map<Integer, Figur> figmap = Spiel.getFigurenmap();
		for (Integer figkey : figmap.keySet()) {
			figmap.put(figkey, null);
		}
		schachbretterstellung(figmap);
	}

	int listpositionwhite = 0;
	int listpositionblack = 0;

	// Zeigt die Gewonnen Spielfiguren vom Gegner an
	public void figurenForPlayersDarstellung(Figur fig) {
		Pane paneZelle;
		if (fig.getColor() == 'b') {
			paneZelle = (Pane) gridPaneGitterWhite.lookup("#paneZelleW_" + listpositionwhite);
			listpositionwhite++;
		} else {
			paneZelle = (Pane) gridPaneGitterBlack.lookup("#paneZelleB_" + listpositionblack);
			listpositionblack++;
		}
		String figname = fig.getClass().getSimpleName();
		Image image = new Image("/Texturen/" + figname + "_" + fig.getColor() + ".png");
		ImageView imageView = new ImageView(image);
		imageView.setId("imageView");

		double newWidth = 15; // Breite
		double newHeight = 15; // Höhe

		imageView.setFitWidth(newWidth);
		imageView.setFitHeight(newHeight);
		imageView.layoutXProperty().bind(paneZelle.widthProperty().subtract(newWidth).divide(2));
		imageView.layoutYProperty().bind(paneZelle.heightProperty().subtract(newHeight).divide(2));
		paneZelle.getChildren().add(imageView);
		paneZelle.requestLayout();

	}

	// setzt die darstellung der Gewonenne figuren zurück
	public void figurenForPlayersReset() {
		for (int i = listpositionwhite; i >= 0; i--) {
			Pane paneZelle = (Pane) gridPaneGitterWhite.lookup("#paneZelleW_" + i);
			paneZelle.getChildren().clear();
		}
		listpositionwhite = 0;

		for (int i = listpositionblack; i >= 0; i--) {
			Pane paneZelle = (Pane) gridPaneGitterBlack.lookup("#paneZelleB_" + i);
			paneZelle.getChildren().clear();
		}
		listpositionblack = 0;
	}

	// entefernt die spielbaren möglichkeiten der Figur
	public void möglichkeitenLöschung() {
		List<ImageView> imageViewsToRemove = new ArrayList<>();
		for (Integer mgZahl : mg) {
			String mgZahlString = (mgZahl < 10) ? "0" + mgZahl.toString() : mgZahl.toString();
			Pane paneZelle = (Pane) gridPaneGitter.lookup("#paneZelle_" + mgZahlString);
			if (paneZelle != null) { // idealerweise würdnicht genutzt
				for (Node node : paneZelle.getChildren()) {
					String nodeId = node.getId();
					if (node instanceof ImageView && nodeId != null && nodeId.equals("imageViewPoint")) {
						imageViewsToRemove.add((ImageView) node);
					}
				}
			}

		}

		// Entferne die ImageView-Elemente außerhalb der Iteration
		for (ImageView imageView : imageViewsToRemove) {
			Pane parentPane = (Pane) imageView.getParent();
			if (parentPane != null) {
				parentPane.getChildren().remove(imageView);
			}
		}
	}

	// zeigt die möglichen spielzüge einer Spielfigur an
	public void möglichkeitenDarstellung(Map<Integer, Figur> figuren) {
		for (Integer mgZahl : mg) {
			String mgZahlString = (mgZahl < 10) ? "0" + mgZahl.toString() : mgZahl.toString();
			Pane paneZelle = (Pane) gridPaneGitter.lookup("#paneZelle_" + mgZahlString);
			Image image = null;
			if (figuren.get(mgZahl) == null) {
				image = new Image("/Texturen/Feld_G.png");
			} else {
				image = new Image("/Texturen/Feld_R.png");
			}
			ImageView imageView = new ImageView(image);
			imageView.setId("imageViewPoint");

			// ImageView Einstellungen
			double newWidth = 45; // Breite
			double newHeight = 45; // Höhe

			imageView.setFitWidth(newWidth);
			imageView.setFitHeight(newHeight);
			imageView.layoutXProperty().bind(paneZelle.widthProperty().subtract(newWidth).divide(2));
			imageView.layoutYProperty().bind(paneZelle.heightProperty().subtract(newHeight).divide(2));
			paneZelle.getChildren().add(imageView);
			paneZelle.requestLayout();
		}

	}

	// speichert spielposition
	// speichert derzeitigen spieler / true = weiß und false = schwarz
	int curPos;
	boolean curPlayer = true;

	public void handlePaneZelle(MouseEvent event) {
		Node zelle = (Node) event.getSource();
		String fxId = zelle.getId();
		System.out.println("Angeklickte Zelle: " + fxId);
		int length = fxId.length();

		int xy = Integer.parseInt(fxId.substring(length - 2, length));
		System.out.println(xy);

		if (!mg.contains(xy) || mg == null) {
			if (Spiel.getFigurenmap().get(xy) != null) {
				möglichkeitenLöschung();
				curPos = xy;
				mg = Spiel.possability(curPos); // möglichkeiten gucken
				möglichkeitenDarstellung(Spiel.getFigurenmap());
			} else {
				möglichkeitenLöschung();
			}
		} else {
			if (mg != null) {
				Figur fig = Spiel.getFigurenmap().get(xy);
				if (fig != null) {
					// löscht die gegnerische Figur vor schlagen
					setPunktestand(fig.getColor(), fig.getWert());
					Spiel.setFigur(xy, null);
					figurenForPlayersDarstellung(fig);
					schachbretterstellung(Spiel.getFigurenmap());
				}
				Spiel.move(curPos, xy);
			}
			möglichkeitenLöschung();
			schachbretterstellung(Spiel.getFigurenmap());
			mg.clear(); // mg-Liste leeren, nachdem der Zug ausgeführt wurde
		}
	}

	@Override
	public void handle(Event arg0) {
		if (arg0.getSource().equals(buttonRetry)) {
			schachbrettreset();
			Spiel = new Modell('b', 'w');
			figurenForPlayersReset();
			resetPunkte();
			schachbretterstellung(Spiel.getFigurenmap());
		}
		if (arg0.getSource().equals(buttonTurn)) {
			boardRotation(Spiel.getFigurenmap());
		}
	}
}
