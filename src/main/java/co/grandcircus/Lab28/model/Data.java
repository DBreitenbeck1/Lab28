package co.grandcircus.Lab28.model;

import java.util.Arrays;

public class Data {
	
	private String[] text;

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Data [text=" + Arrays.toString(text) + "]";
	}


	

}
