package goumertGraci.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Enums.EPastaOther;

public class KnowledgeBase {

	private List<Dish> otherDishes;
	private List<Dish> pastaDishes;
	private EPastaOther currentType;

	public KnowledgeBase() {
		this.otherDishes = new ArrayList<Dish>();
		this.pastaDishes = new ArrayList<Dish>();
	}

	public void initialize() {
		this.otherDishes = Arrays.asList(new Dish(null, "Bolo de Chocolate"));
		this.pastaDishes = Arrays.asList(new Dish("massa", "Lasanha"));
	}

	public EPastaOther getCurrentType() {
		return currentType;
	}

	public void setCurrentType(EPastaOther currentType) {
		this.currentType = currentType;
	}

	public List<Dish> getActiveList() {
		return this.currentType == EPastaOther.PASTA ? this.pastaDishes : this.otherDishes;
	}

	private boolean hasNextFeature(List<Dish> currentList, Dish currentDish) {
		int position = currentList.indexOf(currentDish), //
				nextposition = position++;

		if (nextposition != 0 && nextposition < currentList.size()) {
			Dish nextElement = currentList.get(nextposition);

			if (nextElement.getFeature() != null) {
				return true;
			}
		}

		return false;
	}

	public boolean hasNextFeature(Dish currentDish) {

		if (this.currentType == EPastaOther.PASTA) {
			return this.hasNextFeature(this.pastaDishes, currentDish);
		}

		return this.hasNextFeature(this.otherDishes, currentDish);
	}

}
