package test;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		/*
		//Testeamos el metodo registrar
		producto.setNombrecl2("Gaseosa");
		producto.setPrecioventacl2(2.50);
		producto.setPreciocompcl2(2.00);
		producto.setEstadocl2("Bueno");
		producto.setDescripcl2("Gaseosa Inca Kola 650ml");
		crud.RegistrarProducto(producto);
		*/

		
		//Testeamos el metodo listar
		List<TblProductocl2> listarProducto = crud.ListarProducto();
		for(TblProductocl2 p:listarProducto){
			System.out.println("Código: "+p.getIdproductocl2()+"\n"+
								"Nombre: "+p.getNombrecl2()+"\n"+
								"Precio de Venta: "+p.getPrecioventacl2()+"\n"+
								"Precio de Compra: "+p.getPreciocompcl2()+"\n"+
								"Estado: "+p.getEstadocl2()+"\n"+
								"Descripción: "+p.getDescripcl2()+"\n");
		}//fin del bucle for
		
	}

}
