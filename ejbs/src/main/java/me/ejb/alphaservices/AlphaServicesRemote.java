package me.ejb.alphaservices;

import javax.ejb.Remote;

@Remote
public interface AlphaServicesRemote {

	Integer offerSum(Integer a, Integer b);

	
}
