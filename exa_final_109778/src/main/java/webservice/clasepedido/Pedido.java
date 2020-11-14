package webservice.clasepedido;

public class Pedido {
	
	public int getNumero_orden() {
		return numero_orden;
	}
	public void setNumero_orden(int numero_orden) {
		this.numero_orden = numero_orden;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(int precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public int getCosto_shipping() {
		return costo_shipping;
	}
	public void setCosto_shipping(int costo_shipping) {
		this.costo_shipping = costo_shipping;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public int getEntregado() {
		return entregado;
	}

	public void setEntregado(int entregado) {
		this.entregado = entregado;
	}
	
	public Pedido() {

	}
	
	public Pedido(int numero_orden, String nombre_usuario, String nombre_producto, int cantidad, int precio_unitario,
			int costo_shipping, int total, int entregado) {
		super();
		this.numero_orden = numero_orden;
		this.nombre_usuario = nombre_usuario;
		this.nombre_producto = nombre_producto;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
		this.costo_shipping = costo_shipping;
		this.total = total;
		this.entregado = entregado;
	}
	
	private int numero_orden; 
	private String nombre_usuario;
	private String nombre_producto;
	private int cantidad;
	private int precio_unitario;
	private int costo_shipping;
	private int total;
	private int entregado;

}
