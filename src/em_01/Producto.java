package em_01;


public class Producto {
	
	
	public enum TipoProducto {
	    LACTEO,
	    CARNICO,
	    FRUTA,
	    ENLATADO
	}
	
	 private int codigo;
	 private String nombre;
	 private TipoProducto tipo;
	 private Fecha fechaExpiracion;
	 private String nombreFabricante;
	 private int cantidadInventario;
	 private double precioUnitario;

	public Producto(int codigo, String nombre, TipoProducto tipo, Fecha fechaExpiracion, String nombreFabricante,
			int cantidadInventario, double precioUnitario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaExpiracion = fechaExpiracion;
		this.nombreFabricante = nombreFabricante;
		this.cantidadInventario = cantidadInventario;
		this.precioUnitario = precioUnitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoProducto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}

	public Fecha getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Fecha fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public int getCantidadInventario() {
		return cantidadInventario;
	}

	public void setCantidadInventario(int cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}


