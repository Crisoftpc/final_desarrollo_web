package webservice.controaldorpagina;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import webservice.clasepedido.Pedido;
import webservice.servicios.PedidoService;

/**
 * Servlet implementation class Clientecontrolador
 */
@WebServlet(urlPatterns = {"/Pedidos"}, name = "Pedidos", description = "Pedidos retorno de un json")
public class PedidoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PedidoService service = new PedidoService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PedidoControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pedido> pedidos = new ArrayList<>();
		pedidos = service.mostrarPedidos();
		Gson gson = new Gson();
		String userJSON = gson.toJson(pedidos);
	    setAccessControlHeaders(response);
		PrintWriter printWriter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		printWriter.write(userJSON);
		printWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pedido> pedidos = new ArrayList<>();
		String pasar = request.getParameter("entregar");
		pedidos = service.regresarUsuario(pasar);
		Gson gson = new Gson();
		String userJSON = gson.toJson(pedidos);
		setAccessControlHeaders(response);
		PrintWriter printWriter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		printWriter.write(userJSON);
		printWriter.close();
	}
	
	@Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        setAccessControlHeaders(resp);
        resp.setStatus(HttpServletResponse.SC_OK);
    }

    private void setAccessControlHeaders(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET");
    }

}
