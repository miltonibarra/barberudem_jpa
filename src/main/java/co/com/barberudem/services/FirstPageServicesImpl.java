package co.com.barberudem.services;

import java.util.ArrayList;

import co.com.barberudem.model.FirstPageDTO;
import co.com.barberudem.model.SessionFirstPageDTO;


public class FirstPageServicesImpl implements FirstPageServices {

	public FirstPageDTO getFirstPageDTO() {
		FirstPageDTO firstPageDTO = new FirstPageDTO();
		
		// Se crea el carrusel de imagenes
		ArrayList<String> imagePathList = new ArrayList<String>();
		imagePathList.add("resources/images/slide-1.jpg");
		imagePathList.add("resources/images/slide-2.jpg");
		imagePathList.add("resources/images/slide-3.jpg");
		
		// Se crean los DTO de las sesiones
		SessionFirstPageDTO sessionFirstPageDTO1 = new SessionFirstPageDTO();
		sessionFirstPageDTO1.setTittle("Face Care ");
		sessionFirstPageDTO1.setImagePath("resources/images/page1-img1.jpg");

		SessionFirstPageDTO sessionFirstPageDTO2 = new SessionFirstPageDTO();
		sessionFirstPageDTO2.setTittle("Hand Care ");
		sessionFirstPageDTO2.setImagePath("resources/images/page1-img2.jpg");

		SessionFirstPageDTO sessionFirstPageDTO3 = new SessionFirstPageDTO();
		sessionFirstPageDTO3.setTittle("Foot Care ");
		sessionFirstPageDTO3.setImagePath("resources/images/page1-img3.jpg");

		// Se crea la lista que contiene todas las sessiones que se muestran 
		ArrayList<SessionFirstPageDTO> sessionFirstPageDTOList = new ArrayList<SessionFirstPageDTO>();
		sessionFirstPageDTOList.add(sessionFirstPageDTO1);
		sessionFirstPageDTOList.add(sessionFirstPageDTO2);
		sessionFirstPageDTOList.add(sessionFirstPageDTO3);
		 
		// Se adiciona al DTO del modelo la informacion de las imagenes para el carrusel y las sesiones
		firstPageDTO.setImagePath(imagePathList);
		firstPageDTO.setSessionFirstPageDTOList(sessionFirstPageDTOList);
		
		return firstPageDTO;
	}

}
