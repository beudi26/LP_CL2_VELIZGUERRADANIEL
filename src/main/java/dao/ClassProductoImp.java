package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	public void RegistrarProducto(TblProductocl2 producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_VELIZGUERRADANIEL");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto registrado correctamente");
		em.getTransaction().commit();
		em.close();
	}//fin del metodo registrar

	public List<TblProductocl2> ListarProducto() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_VELIZGUERRADANIEL");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl2> listado = em.createQuery("SELECT p FROM TblProductocl2 p",TblProductocl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listado;
	}//fin del metodo listar

}//fin de la clase
