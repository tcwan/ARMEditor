package org.xtext.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ARMHighlightingConfiguration extends DefaultHighlightingConfiguration{
	public static final String CONSTANT_ID = "constant";
	public static final String REGISTER_ID = "register";
	public static final String OPERATION_ID = "operation";
	public static final String BAREL_SHIFT_R = "barel_shift_r";
	public static final String FLAG = "flag";
	public static final String PREPROCESSOR = "preprocessor";
	public static final String ARM_Machine_Directives = "arm_machine_directives";
	public static final String LABEL = "label";
	public static final String PSR_FIELD_E = "psrfielde";
	public static final String VARIABLE = "variable";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(CONSTANT_ID, "Constants", constantTextStyle());
		acceptor.acceptDefaultHighlighting(OPERATION_ID, "Operation", waterBlueTextStyle());
		acceptor.acceptDefaultHighlighting(REGISTER_ID, "Register", waterRedTextStyle());
		acceptor.acceptDefaultHighlighting(BAREL_SHIFT_R, "Barel Shift Register", chocolateTextStyle());
		acceptor.acceptDefaultHighlighting(PREPROCESSOR, "Preprocessor", greyTextStyle());
		acceptor.acceptDefaultHighlighting(ARM_Machine_Directives, "ARM Machine Directives", greyTextStyle());
		acceptor.acceptDefaultHighlighting(FLAG, "Flag", chocolateTextStyle());
		acceptor.acceptDefaultHighlighting(LABEL, "Label", mediumGreenTextStyle());
		acceptor.acceptDefaultHighlighting(PSR_FIELD_E, "PSR Field", chocolateTextStyle());
		acceptor.acceptDefaultHighlighting(VARIABLE, "Variable", purpleTextStyle());
	}
	

	public TextStyle constantTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(1, 1, 254));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//medium green 102, 153, 0
	public TextStyle mediumGreenTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(0,100,0));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//purple
	public TextStyle purpleTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(104, 10, 132));
		//style.setStyle(SWT.BOLD);
		return style;
	}
	//water blue 0, 136, 230
	public TextStyle waterBlueTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(0, 0, 128));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//highlight green
	public TextStyle highlightGreenTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(0, 255, 0));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//maroon
	public TextStyle maroonTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(179, 0, 0));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//dark red
	public TextStyle waterRedTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(128,0,0));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//chocolate
	public TextStyle chocolateTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(139,69,19));
		style.setStyle(SWT.BOLD);
		return style;
	}
	//keyword purple  //grey 105,105,105
	public TextStyle greyTextStyle() {
		TextStyle style = new TextStyle();
		style.setColor(new RGB(128,0,128));
		style.setStyle(SWT.BOLD);
		return style;
	}
}
