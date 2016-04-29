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
    Query query = em.createQuery("SELECT l FROM Lugar l WHERE l.id = :lugarId");
    query.setParameter("lugarId", lugarId);
    Lugar lugar = (Lugar) query.getSingleResult();

    // Se crea el DTO
    LugarDTO lugarDTO = new LugarDTO();
    lugarDTO.setAddress(lugar.getAddress());
    lugarDTO.setDescription(lugar.getDescription());
    lugarDTO.setEmail(lugar.getEmail());
    lugarDTO.setId(lugar.getId());
    lugarDTO.setLat(lugar.getLat());
    lugarDTO.setLng(lugar.getLng());
    lugarDTO.setName(lugar.getName());
    lugarDTO.setPhone(lugar.getPhone());
    lugarDTO.setSchedule(lugar.getSchedule());

    return lugarDTO;
  }
}
