package org.xtext.ui;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.xtext.ui.MyKeywordHovers;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import com.google.inject.Inject;

public class ARMHoverProvider extends DefaultEObjectHoverProvider{
/** Utility mapping keywords and hovertext. */
    
    @Inject ILabelProvider labelProvider;
	  @Inject MyKeywordHovers keywordHovers;
	  
	    @Override
	    protected XtextBrowserInformationControlInput getHoverInfo(EObject obj, IRegion region, XtextBrowserInformationControlInput prev) {
	        if (obj instanceof Keyword || obj instanceof RuleCall) {
	            String html = getHoverInfoAsHtml(obj);
	            if (html != null) {
	                StringBuffer buffer = new StringBuffer(html);
	                HTMLPrinter.insertPageProlog(buffer, 0, getStyleSheet());
	                HTMLPrinter.addPageEpilog(buffer);
	                return new XtextBrowserInformationControlInput(prev, obj, buffer.toString(), labelProvider);
	            }
	        }
	        return super.getHoverInfo(obj, region, prev);
	    }
	 
	    @Override
	    protected String getHoverInfoAsHtml(EObject o){
	        if (o instanceof Keyword)
	            return keywordHovers.hoverText((Keyword) o);
	        if (o instanceof RuleCall)
	        	return keywordHovers.hoverRuleCall((RuleCall) o);
	        return super.getHoverInfoAsHtml(o);
	    }
}
