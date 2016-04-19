/**
 * 
 */
package com.baskin.icecream.service;

import java.util.List;

import com.baskin.model.Icecream;

/**
 * @author dattatray_vaze
 *
 */
public interface IcecreamService {
	
	List<Icecream> getIcecreams();
	void addIcecream(Icecream icecream);
	void deleteIcecream(Icecream icecream);
	List<Icecream> getIcecreams (String name);

}
