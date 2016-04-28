package co.com.barberudem.jpa.dao;

import co.com.barberudem.jpa.entities.Lugar;


/**
 * Interface que contiene los servicios asociados a la tabla lugares
 * @author Milton
 */
public interface LugarDAO {

  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return Lugar {@link Lugar}
   */
  public Lugar findLugarByID(int lugarId);
}
