package practica1;

public class Usuario {
	private long id;
	private String nombre;
	private Fecha fecha_nac;
	private String ciudad_nac;
	private Direccion dir;
	private long tel;
	private String email;
	
	public Usuario(long id, String n) {
		this.id = id;
		nombre = n;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getfechaNac() {
		return fecha_nac;
	}

	public void setfechaNac(Fecha fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getciudadNac() {
		return ciudad_nac;
	}

	public void setciudadNac(String ciudad_nac) {
		this.ciudad_nac = ciudad_nac;
	}

	public Direccion getdir() {
		return dir;
	}

	public void setdir(Direccion dir) {
		this.dir = dir;
	}

	public long gettel() {
		return tel;
	}

	public void settel(long tel) {
		this.tel = tel;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario []";
	}
	
	
}