package co.com.barberudem.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.barberudem.DAO.LugarDAO;
import co.com.barberudem.jpa.entities.Lugar;
import co.com.barberudem.model.LugarDTO;

@Repository
public class JPALugarDAO implements LugarDAO {
  
  @PersistenceContext
  private EntityManager em = null;
  

  public LugarDTO findLugarByID(int lugarId) {
    Query query = em.createQuery("SELECT new co.com.barberudem.model.LugarDTO(l.address, l.description, l.email, l.id, l.lat, l.lng, l.name, l.phone, l.schedule) FROM Lugar l WHERE l.id = :lugarId");
    query.setParameter("lugarId", lugarId);
    LugarDTO lugarDTO = (LugarDTO) query.getSingleResult();
    return lugarDTO;
  }


  public LugarDTO findLugares() {
    // TODO Auto-generated method stub
    return null;
  }
}
