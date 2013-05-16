package kr.co.stella.modeler.explorer.model;

import org.eclipse.core.resources.IProject;
import org.eclipse.uml2.uml.Element;

public class ModelsContainer extends StellaContainer {

	public ModelsContainer(IProject project) {
		super(project, "Models", null);
	}

	@Override
	protected Element[] getElements() {
		return new Element[0];
	}

}
