package tut4.aufgabe1;

public class Schokoriegel extends Suessware {
    private int kakaoAnteil;
    private boolean enthaeltNuss;

    public Schokoriegel(String name, double preis, int kalorien, int kakaoAnteil, boolean enthaeltNuss) {
        super(name, preis, kalorien);
        this.kakaoAnteil = kakaoAnteil;
        this.enthaeltNuss = enthaeltNuss;
    }

    public boolean istBitterSchokolade() {
        if (kakaoAnteil >= 60){
            return true;
        } else {
            return false;
        }
    }

    public int getKakaoAnteil() {
        return kakaoAnteil;
    }

    public void setKakaoAnteil(int kakaoAnteil) {
        this.kakaoAnteil = kakaoAnteil;
    }

    public boolean isEnthaeltNuss() {
        return enthaeltNuss;
    }

    public void setEnthaeltNuss(boolean enthaeltNuss) {
        this.enthaeltNuss = enthaeltNuss;
    }

    @Override
    public String toString() {
        return super.toString() + "kakaoAnteil=" + kakaoAnteil + ", enthaeltNuss=" + enthaeltNuss;
    }
}
