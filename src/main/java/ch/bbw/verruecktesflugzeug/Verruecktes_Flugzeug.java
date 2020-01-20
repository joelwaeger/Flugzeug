package ch.bbw.verruecktesflugzeug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Verruecktes_Flugzeug {
	Random random = new Random();
	List<Card> cards = new ArrayList<Card>();

	public void createCard() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Files/flugzeug.txt")));
		String[] color = {"red", "green", "blue"};
		String[] Side = {"Front", "Back"};
		
		for (int i = 0; i < 9; i++) {
//			for (int a = 0; a < 3; a++) {
			writer.write("			" + Side[random.nextInt(Side.length)] + "," + color[random.nextInt(color.length)] + "		   ");
			writer.newLine();
			writer.write("                                                                                                 							");
			writer.newLine();
			writer.write("                                                                                                				    		");
			writer.newLine();
			writer.write(Side[random.nextInt(Side.length)] + "," + color[random.nextInt(color.length)] + "		-		"+Side[random.nextInt(Side.length)] + "," + color[random.nextInt(color.length)]);
			writer.newLine();
			writer.write("                                                                                                 							");
			writer.newLine();
			writer.write("                                                                                                				    		");
			writer.newLine();
			writer.write("			" + Side[random.nextInt(Side.length)] + "," + color[random.nextInt(color.length)] + "		   ");
			writer.newLine();
//			writer.write(Side[random.nextInt(Side.length)] + "," + color[random.nextInt(color.length)]+"/");
//			}
			writer.write("");
			writer.newLine();
			
		};
		writer.close();
	}

	public void ReadCard() throws IOException {
		String LineReader;

		FileReader fr = new FileReader("Files/flugzeug.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		while ((LineReader = br.readLine()) != null) {
//			System.out.println(LineReader);
//			String[] parts = LineReader.split("/");
//			cards.add(new Card(parts[0], parts[1], parts[2], parts[3]));
//		}

	}

	List<Field> nextPossibleMoves(Field field, List<Card> remainingCards) {

		List<Field> fieldsWithOneMoreCard = new LinkedList<Field>();

		for (Card card : remainingCards) {
			Field addedUnturned = field.addedIfFits(card);
			if (addedUnturned != null) {
				fieldsWithOneMoreCard.add(addedUnturned);
			}
			for (int turn = 1; turn <= 3; turn++) {
				card = card.turned90DegreesClockwise();
				Field addedTurned = field.addedIfFits(card);
				if (addedTurned != null) {
					fieldsWithOneMoreCard.add(addedTurned);
				}
			}
		}

		return fieldsWithOneMoreCard;
	}

	List<Field> findAllSolutions(Field field, List<Card> cards) {

		List<Field> solutions = new LinkedList<Field>();

		List<Field> nextPossibleMoves = nextPossibleMoves(field, cards);
		for (Field currentMove : nextPossibleMoves) {
			if (currentMove.isFull()) {
				solutions.add(currentMove);
			} else {
				List<Card> remaining = removed(currentMove.getLastCard(), cards);
				solutions.addAll(findAllSolutions(currentMove, remaining));
			}
		}

		return solutions;
	}

	private List<Card> removed(Object lastCard, List<Card> cards) {
		// TODO Auto-generated method stub
		return null;
	}
}
