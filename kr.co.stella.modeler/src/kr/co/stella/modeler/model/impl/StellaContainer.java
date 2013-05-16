package kr.co.stella.modeler.model.impl;

import kr.co.stella.modeler.model.IStellaContainer;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Element;

public abstract class StellaContainer extends AbstractStellaElement implements IStellaContainer {

	protected StellaContainer(IProject project, String text, Image image) {
		super(project, text, image);
	}
	
	@Override
	public IProject getProject() {
		return (IProject) getParent();
	}
	
	@Override
	public Object[] getChildren() {
		return getElements();
	}
	
	protected abstract Element[] getElements();
}
