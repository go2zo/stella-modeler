package kr.co.stella.modeler.explorer.model;

import org.eclipse.core.resources.IProject;

public interface IStellaContainer extends IStellaElement {
	IProject getProject();
}
