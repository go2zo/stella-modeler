package kr.co.stella.modeler.model.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.uml2.uml.Element;

public class DiagramsContainer extends StellaContainer {

	public DiagramsContainer(IProject project) {
		super(project, "Diagrams", null);
	}

	@Override
	protected Element[] getElements() {
		return new Element[0];
	}

}
