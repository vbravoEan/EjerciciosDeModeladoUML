package em_01;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	
	private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;
    

	public Tienda(String nombre, String direccion, String telefono, List<Producto> productos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.productos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
