package goumertGraci.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Enums.EPastaOther;

public class KnowledgeBase {

	private List<Dishes> otherDishes;
	private List<Dishes> pastaDishes;

	public KnowledgeBase() {
		this.otherDishes = new ArrayList<Dishes>();
		this.pastaDishes = new ArrayList<Dishes>();
	}

	public void initialize() {
		this.otherDishes = Arrays.asList(new Dishes(null, "Bolo de Chocolate"));
		this.pastaDishes = Arrays.asList(new Dishes("massa", "Lasanha"));
	}

	public List<Dishes> chooseList(EPastaOther type) {
		return type == EPastaOther.PASTA ? this.pastaDishes:this.otherDishes;
	}

}
