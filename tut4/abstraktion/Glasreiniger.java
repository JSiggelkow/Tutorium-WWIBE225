package tut4.abstraktion;

public class Glasreiniger extends Getraenk{

	private boolean mitAlkohol;

	public Glasreiniger(String name, int ml, boolean mitAlkohol) {
		super(name, ml);
		this.mitAlkohol = mitAlkohol;
	}

	public boolean isMitAlkohol() {
		return mitAlkohol;
	}

	public void setMitAlkohol(boolean mitAlkohol) {
		this.mitAlkohol = mitAlkohol;
	}

	@Override
	public void drink(int ml) {
		System.out.println("Sauberer Abgang, buddy! Du bist gestorben.");
	}
}
