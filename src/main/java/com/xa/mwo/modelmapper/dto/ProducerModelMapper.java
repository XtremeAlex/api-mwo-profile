/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.modelmapper.dto;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

import org.modelmapper.ModelMapper;

@SessionScoped
public class ProducerModelMapper implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}