/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.user.service;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

@SessionScoped
public class ProducerAnalyzeSource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Produces
	public AnalyzeSource getAnalyzeSource() {
		return new AnalyzeSource();
	}
}