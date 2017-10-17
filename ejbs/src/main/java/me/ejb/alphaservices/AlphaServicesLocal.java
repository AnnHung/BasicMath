package me.ejb.alphaservices;

import javax.ejb.Local;

@Local
public interface AlphaServicesLocal {

	Integer offerSum(Integer a, Integer b);


}
