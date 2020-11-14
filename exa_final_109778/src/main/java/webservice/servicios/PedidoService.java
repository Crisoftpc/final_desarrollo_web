package webservice.servicios;

import java.util.Arrays;
import java.util.List;

import webservice.clasepedido.Pedido;

public class PedidoService {
	public List<Pedido> pedido;
	
	public List<Pedido> regresarUsuario(String parametro){
		if(parametro.equals("0") ) {
			pedido = Arrays.asList(new Pedido(1025, "Cristian", "Aguacate potasico", 52, 150, 70, 170, 1), 
				new Pedido(1026, "Luis", "cerveza", 54, 100, 70, 120, 0), 
				new Pedido(27, "Abner", "Manzana", 56, 90, 65, 105, 0));
		}else if(parametro.equals("1")) {
			pedido = Arrays.asList(new Pedido(1025, "Cristian", "Aguacate potasico", 52, 150, 70, 170, 0), 
				new Pedido(1026, "Luis", "cerveza", 54, 100, 70, 120, 1), 
				new Pedido(27, "Abner", "Manzana", 56, 90, 65, 105, 0));
		}else if(parametro.equals("2")) {
			pedido = Arrays.asList(new Pedido(1025, "Cristian", "Aguacate potasico", 52, 150, 70, 170, 0), 
				new Pedido(1026, "Luis", "cerveza", 54, 100, 70, 120, 0), 
				new Pedido(27, "Abner", "Manzana", 56, 90, 65, 105, 1));
		}
		return pedido;
	}
	
	public List<Pedido> mostrarPedidos(){
		return pedido = Arrays.asList(new Pedido(1025, "Cristian", "Aguacate potasico", 52, 150, 70, 170, 0), 
				new Pedido(1026, "Luis", "cerveza", 54, 100, 70, 120, 0), 
				new Pedido(27, "Abner", "Manzana", 56, 90, 65, 105, 0));
		
	}

}
