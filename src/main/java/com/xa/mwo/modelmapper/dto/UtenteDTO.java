/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.modelmapper.dto;

import java.util.List;

public class UtenteDTO {

	private List data;

	private String[] author = new String[] { "XtremeAlex", "Alexandru Dabija", "alexdabi92@live.com" };

	public UtenteDTO() {
		super();
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public String[] getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "UtenteDTO [data=" + data + ", author=" + author + "]";
	}

}
