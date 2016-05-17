package co.com.barberudem.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.barberudem.DAO.LugarDAO;
import co.com.barberudem.model.LugarDTO;

/**
 * Implementa los servicios asociados al lugar 
 * @author Milton
 */
public class LugarServicesImpl implements LugarServices {

  public LugarDTO findLugarByID(int lugarId) {
    return findLugarByIDJPA(lugarId);
    
    // Refletion
    /*
    String methodName = "findLugarByID";
    Boolean isJPA = true;
    LugarDTO lugarDTO = null;
    if (isJPA) {
      methodName += "JPA";
    } else {
      methodName += "JDBC";
    }
    try {
      Class[] parameterTypes = { Integer.class };
      Class<LugarServicesImpl> cls = (Class<LugarServicesImpl>) Class.forName("co.com.barberudem.services.LugarServicesImpl");
      Object obj = cls.newInstance();
      Method method = cls.getDeclaredMethod(methodName, parameterTypes);
      lugarDTO = (LugarDTO) method.invoke(obj, lugarId);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lugarDTO;
    */
  }

  /**
   * Obtiene la informacion usando JPA
   * @param lugarId
   * @return
   */
  private LugarDTO findLugarByIDJPA(Integer lugarId) {
    // Se obtiene el contexto de la aplicacion
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);
    // Se realiza el insert
    LugarDTO lugar = lugarDAO.findLugarByID(lugarId);
    return lugar;
  }

  /**
   * Obtiene la informacion usando JDBC
   * @param lugarId
   * @return
   */
  private LugarDTO findLugarByIDJDBC(Integer lugarId) {
    // Se obtiene el contexto de la aplicacion
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    // Se obtiene el servicio que implementa los servicios de la base de datos
    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);
    LugarDTO lugar = lugarDAO.findLugarByID(lugarId);
    return lugar;
  }

  public LugarDTO findLugares() {
    return null;
  }

}
