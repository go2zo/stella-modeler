package kr.co.stella.modeler.explorer.model;

import org.eclipse.swt.graphics.Image;

public interface IStellaElement {
	String getText();
	Image getImage();
	IStellaElement[] getChildren();
}
