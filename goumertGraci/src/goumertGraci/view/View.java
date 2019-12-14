package goumertGraci.view;

import java.util.List;

import javax.swing.JOptionPane;

import Enums.EPastaOther;
import Enums.ESimNao;
import goumertGraci.model.Dish;
import goumertGraci.model.KnowledgeBase;

public class View {

	public static void main(String args[]) {

		List<Dish> roundDishes;
		KnowledgeBase knowledgeBase = new KnowledgeBase();
		knowledgeBase.initialize();
		int hitThePlate;

		while (continueGame() == ESimNao.SIM.getValue()) {

			knowledgeBase.setCurrentType(getTypeDishe());
			roundDishes = knowledgeBase.getActiveList();

			for (Dish dish : roundDishes) { //
				if (knowledgeBase.hasNextFeature(dish)) {

				} else {
					hitThePlate = askAboutItsDish(dish);
					/// Se acertou mostrar mensagem de sucesso
					// sen�o acertou pergunta qual prato e salva um novo prato e recome�a o jogo.
				}
			}

		}

	}

	/* Pode criar uma classee de dos comandos */
	private static EPastaOther getTypeDishe() {
		int answer = JOptionPane.showConfirmDialog(null, "O prato que voc� pensou � massa?", "Diga-me",
				JOptionPane.YES_NO_OPTION);

		if (answer == ESimNao.SIM.getValue()) {
			return EPastaOther.PASTA;
		}
		return EPastaOther.OTHER;
	}

	private static int continueGame() {
		int answer = JOptionPane.showConfirmDialog(null, "Pense em um prato que gosta. Vamos Jogar?", "Jogo Goumert",
				JOptionPane.YES_NO_OPTION);

		return answer;
	}

	private static int askAboutItsDish(Dish dish) {
		int answer = JOptionPane.showConfirmDialog(null, "O prato que voc� pensou �" + dish.getName() + " ?", "Diga-me",
				JOptionPane.YES_NO_OPTION);

		return answer;
	}

	private static int sucessInFindTheDish() {
		return 0;
	}
	/*
	 * 
	 * int numero1; String numero2; int num1, num2, total;
	 * 
	 * numero2 = JOptionPane.showInputDialog("Digite o 2� numero:");
	 * 
	 * // num2 = Integer.parseInt(numero2); // total = num1 + num2; //
	 * JOptionPane.showMessageDialog(null, "A soma dos numeros �" + total,
	 * "Resultado total", // JOptionPane.PLAIN_MESSAGE); System.exit(0);
	 */
}