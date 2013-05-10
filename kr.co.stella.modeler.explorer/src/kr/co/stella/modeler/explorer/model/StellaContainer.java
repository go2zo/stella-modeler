package kr.co.stella.modeler.explorer.model;

import org.eclipse.swt.graphics.Image;

public class StellaContainer extends AbstractStellaElement {

	private String text;
	
	protected StellaContainer(String text) {
		this.text = text;
	}
	
	@Override
	public String getText() {
		return text;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
