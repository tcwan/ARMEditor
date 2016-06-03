package org.xtext.ui;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider.IInformationControlCreatorProvider;
import org.eclipse.xtext.util.Pair;
import org.xtext.ui.MyKeywordAtOffsetHelper;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;

import com.google.inject.Inject;

public class ARMDispatchingEObjectTextHover extends DispatchingEObjectTextHover{
	@Inject
    MyKeywordAtOffsetHelper keywordAtOffsetHelper;
 
    @Inject
    IEObjectHoverProvider hoverProvider;
 
    IInformationControlCreatorProvider lastCreatorProvider = null;
 
    @Override
    public Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
        if (first instanceof Keyword || first instanceof RuleCall) {
            lastCreatorProvider = hoverProvider.getHoverInfo(first, textViewer, hoverRegion);
            return lastCreatorProvider == null ? null : lastCreatorProvider.getInfo();
        }
        lastCreatorProvider = null;
        return super.getHoverInfo(first, textViewer, hoverRegion);
    }
 
    @Override
    public IInformationControlCreator getHoverControlCreator() {
        return this.lastCreatorProvider == null ? super.getHoverControlCreator() : lastCreatorProvider.getHoverControlCreator();
    }
 
    @Override
    protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource, final int offset) {
        Pair<EObject, IRegion> result = super.getXtextElementAt(resource, offset);
        //if (result == null) {
            result = keywordAtOffsetHelper.resolveKeywordAt(resource, offset);
        //}

        	
        if(result == null)
        	result = super.getXtextElementAt(resource, offset);
        return result;
    }
}
