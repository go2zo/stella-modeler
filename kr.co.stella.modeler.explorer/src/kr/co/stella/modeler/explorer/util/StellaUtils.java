package kr.co.stella.modeler.explorer.util;

import java.util.ArrayList;
import java.util.List;

import kr.co.stella.modeler.explorer.model.DiagramsContainer;
import kr.co.stella.modeler.explorer.model.ModelsContainer;
import kr.co.stella.modeler.explorer.model.ProfilesContainer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class StellaUtils {

	public static boolean hasChildren(Object element) {
		return false;
	}

	public static Object[] getContainers(IProject project) {
		List<Object> result = new ArrayList<Object>();
		
		try {
			for (IResource resource : project.members()) {
				
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		result.add(new DiagramsContainer(project));
		result.add(new ModelsContainer(project));
		result.add(new ProfilesContainer(project));
		
		return result.toArray();
	}

}
