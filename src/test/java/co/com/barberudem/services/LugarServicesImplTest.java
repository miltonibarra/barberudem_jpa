/**
 * 
 */
package co.com.barberudem.services;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Milton
 *
 */
public class LugarServicesImplTest {

  /**
   * Test method for {@link co.com.barberudem.services.LugarServicesImpl#findLugarByID(int)}.
   */
  @Test
  public void testFindLugarByID() {
    int lugarId = 1;
    LugarServices lugarServices = new LugarServicesImpl();
    assertNotNull(lugarServices.findLugarByID(lugarId));
  }

}
