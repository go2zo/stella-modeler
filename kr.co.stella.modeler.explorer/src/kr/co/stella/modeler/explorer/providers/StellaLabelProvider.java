package kr.co.stella.modeler.explorer.providers;

import kr.co.stella.modeler.explorer.model.IStellaElement;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class StellaLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IStellaElement) {
			return ((IStellaElement) element).getImage();
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IStellaElement) {
			return ((IStellaElement) element).getText();
		}
		return null;
	}


}
