package kr.co.stella.modeler.model.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.uml2.uml.Element;

public class ProfilesContainer extends StellaContainer {

	public ProfilesContainer(IProject project) {
		super(project, "Profiles", null);
	}

	@Override
	protected Element[] getElements() {
		return new Element[0];
	}

}
