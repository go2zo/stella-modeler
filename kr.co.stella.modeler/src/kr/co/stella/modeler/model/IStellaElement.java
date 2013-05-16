package kr.co.stella.modeler.model;

import org.eclipse.swt.graphics.Image;

public interface IStellaElement {
	String getText();
	Image getImage();
	Object[] getChildren();
	Object getParent();
}
