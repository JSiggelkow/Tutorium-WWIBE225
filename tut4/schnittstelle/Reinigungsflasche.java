package tut4.schnittstelle;

public class Reinigungsflasche extends Flasche{

	private boolean mitAlkohol;

	public Reinigungsflasche(String name, int ml, boolean mitAlkohol) {
		super(name, ml);
		this.mitAlkohol = mitAlkohol;
	}

	public boolean isMitAlkohol() {
		return mitAlkohol;
	}

	public void setMitAlkohol(boolean mitAlkohol) {
		this.mitAlkohol = mitAlkohol;
	}
}
