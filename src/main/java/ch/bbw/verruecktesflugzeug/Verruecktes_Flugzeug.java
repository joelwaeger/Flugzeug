package ch.bbw.verruecktesflugzeug;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Verruecktes_Flugzeug {
	Random random = new Random();

	public void createCard() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(
				"E:\\Schule\\3. Lehrjahr\\BBW\\Modul 411\\eclipse\\verruecktesflugzeug\\File\\Flugzeug.txt"));

		for (int i = 0; i < 9; i++) {
			writer.write(random.nextInt(2) + " / " + random.nextInt(3) + " , ");
			writer.newLine();
		};
		
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
