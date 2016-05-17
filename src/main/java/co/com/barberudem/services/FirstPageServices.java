package co.com.barberudem.services;

import co.com.barberudem.model.FirstPageDTO;


/**
 * Contiene los seervicios utilizados en la primer pagina
 * @author Milton
 *
 */
public interface FirstPageServices {

	/**
	 * Obtiene toda la informacion que se requiere para pintar la primer pagina de la aplicacion
	 * @return
	 */
	public FirstPageDTO getFirstPageDTO();
}
