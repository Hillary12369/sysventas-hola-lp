package pe.edu.upeu.sysventashola.entity;

public class Producto {
	private int idproducto;
	private String nomprod;
	private double precio; //decimal
	private String cantidad;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int idproducto, String nomprod, double precio, String cantidad) {
		super();
		this.idproducto = idproducto;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

}
