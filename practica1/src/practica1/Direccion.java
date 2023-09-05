package practica1;

public class Direccion {
	private String calle;
	private int noCalle;
	private String nomenclatura;
	private String barrio;
	private String ciudad;
	
	public Direccion(String c, int nc, String no, String b, String ci) {
		calle = c;
		noCalle = nc;
		nomenclatura = no;
		barrio = b;
		ciudad = ci;
	}

	public String getcalle() {
		return calle;
	}

	public int getnoCalle() {
		return noCalle;
	}

	public String getnomenclatura() {
		return nomenclatura;
	}

	public String getbarrio() {
		return barrio;
	}

	public String getciudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "Direccion []";
	}
}
