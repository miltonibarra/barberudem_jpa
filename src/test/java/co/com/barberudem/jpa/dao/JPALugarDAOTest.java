/**
 * 
 */
package co.com.barberudem.jpa.dao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barberudem.DAO.LugarDAO;
import co.com.barberudem.model.LugarDTO;

/**
 * @author Milton
 *
 */
public class JPALugarDAOTest {

  /**
   * Test method for {@link co.com.barberudem.jpa.dao.JPALugarDAO#findLugarByID(int)}.
   */
  @Test
  public void testFindLugarByID() {
    // Se obtiene el contexto de la aplicacion
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO sesionDAO = (LugarDAO) context.getBean(LugarDAO.class);
    

    // Se realiza el insert
    LugarDTO lugar = sesionDAO.findLugarByID(1);
    System.out.println("Nombre: " + lugar.getName());
    System.out.println("Direccion: " + lugar.getAddress());
  }

}
