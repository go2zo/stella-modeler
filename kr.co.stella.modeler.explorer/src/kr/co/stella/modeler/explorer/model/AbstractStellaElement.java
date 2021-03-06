package kr.co.stella.modeler.explorer.model;

import org.eclipse.swt.graphics.Image;

public abstract class AbstractStellaElement implements IStellaElement {

	private String text;
	private Image image;
	private Object parent;
	
	protected AbstractStellaElement(Object parent, String text, Image image) {
		this.parent = parent;
		this.text = text;
		this.image = image;
	}
	
	@Override
	public String getText() {
		return text;
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public Object getParent() {
		return parent;
	}
}
