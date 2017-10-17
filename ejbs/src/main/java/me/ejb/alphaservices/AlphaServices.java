package me.ejb.alphaservices;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AlphaServices
 */
@Stateless
@LocalBean
public class AlphaServices implements AlphaServicesRemote, AlphaServicesLocal , AlphaServicesManagement{

    /**
     * Default constructor. 
     */
    public AlphaServices() {
        // TODO Auto-generated constructor stub
    }

	public Integer offerSum(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
