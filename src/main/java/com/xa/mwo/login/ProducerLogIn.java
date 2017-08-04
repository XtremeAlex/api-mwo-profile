/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.login;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

@SessionScoped
public class ProducerLogIn implements Serializable {

	private static final long serialVersionUID = 1L;

	@Produces
	public LogIn getLogIn() {
		return new LogIn();
	}
}