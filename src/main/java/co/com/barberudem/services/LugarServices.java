package co.com.barberudem.services;

import co.com.barberudem.model.LugarDTO;

public interface LugarServices {

  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return LugarDTO {@link LugarDTO}
   */
  public LugarDTO findLugarByID(int lugarId);
  
  /**
   * Obtiene todos los lugares
   * @return
   */
  public LugarDTO findLugares();
}
