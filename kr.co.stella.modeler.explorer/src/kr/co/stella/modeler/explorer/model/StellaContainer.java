package kr.co.stella.modeler.explorer.model;

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
