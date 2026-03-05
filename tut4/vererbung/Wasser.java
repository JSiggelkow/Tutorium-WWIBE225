package tut4.vererbung;

public class Wasser extends Getraenk {

	private boolean mitSprudel;

	public Wasser(String name, int ml, boolean mitSprudel) {
		super(name, ml);
	}

	public boolean isMitSprudel() {
		return mitSprudel;
	}

	public void setMitSprudel(boolean mitSprudel) {
		this.mitSprudel = mitSprudel;
	}

	@Override
	public void drink(int ml) {
		if (ml < super.getMl()) {
			System.out.println("Ich fühle mich sooo erfrischt, jetzt kann ich lernen!");
			super.setMl(super.getMl() - ml);
		} else {
			System.out.println("Nicht mehr genug Wasser :(");
		}
	}

	@Override
	public String toString() {
		return "Wasser{" +
				"mitSprudel=" + mitSprudel +
				"} " + super.toString();
	}
}
