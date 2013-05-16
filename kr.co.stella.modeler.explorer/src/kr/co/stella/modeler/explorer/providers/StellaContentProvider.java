package kr.co.stella.modeler.explorer.providers;

import kr.co.stella.modeler.explorer.model.IStellaElement;
import kr.co.stella.modeler.explorer.util.StellaUtils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.uml2.uml.Element;

public class StellaContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IStellaElement) {
			return ((IStellaElement) parentElement).getChildren();
		} else if (parentElement instanceof Element) {
			
		} else if (parentElement instanceof IProject) {
			return StellaUtils.getContainers((IProject) parentElement);
		} else if (parentElement instanceof IWorkspaceRoot) {
			return ((IWorkspaceRoot) parentElement).getProjects();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof IStellaElement) {
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return StellaUtils.hasChildren(element);
	}

}
