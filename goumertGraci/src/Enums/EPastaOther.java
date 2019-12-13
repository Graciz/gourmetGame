package Enums;

public enum EPastaOther {
	PASTA(0), OTHER(1);

	private final int value;

	EPastaOther(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
