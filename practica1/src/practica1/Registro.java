package practica1;

public class Registro {
	private Usuario registro[] = new Usuario[1];
	private int noRegistros;
	
	public Registro(int capacity) {
		this.noRegistros = capacity;
	}
	
	public Usuario buscarUsuario(long id) {
		if(noRegistros > 0) {
			int i = 0;
			while(i < noRegistros && registro[i].getid() != id) {
				i++;
			}
			if (i == noRegistros) {
				return null;
			}
			else {
				return registro[i];
			}
		}
		else {
			return null;
		}
	}
	
}
