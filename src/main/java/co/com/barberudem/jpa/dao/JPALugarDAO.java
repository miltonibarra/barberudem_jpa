package co.com.barberudem.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.barberudem.jpa.entities.Lugar;

@Repository
public class JPALugarDAO implements LugarDAO {
  
  @PersistenceContext
  private EntityManager em = null;
  

  public Lugar findLugarByID(int lugarId) {
    Query query = em.createQuery("SELECT l FROM Lugar l WHERE l.id = :lugarId");
    query.setParameter("lugarId", lugarId);
    Lugar lugar = (Lugar) query.getSingleResult();
    return lugar;
  }

}
