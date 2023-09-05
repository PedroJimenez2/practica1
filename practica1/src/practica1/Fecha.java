package practica1;

public class Fecha {
	private int dd;
	private int mm;
	private int aa;
	
	public Fecha(int d, int m, int a) {
		dd = d;
		mm = m;
		aa = a;
	}

	public int getdd() {
		return dd;
	}

	public void setdd(int d) {
		dd = d;
	}

	public int getmm() {
		return mm;
	}

	public void setmm(int m) {
		mm = m;
	}

	public int getaa() {
		return aa;
	}

	public void setaa(int a) {
		aa = a;
	}

	@Override
	public String toString() {
		return "Fecha []";
	}
}