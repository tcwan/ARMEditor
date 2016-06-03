package org.xtext.ui;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ARMHighlightingCalculator implements ISemanticHighlightingCalculator{
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;
		    
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if(node instanceof CompositeNodeWithSemanticElement){
				CompositeNodeWithSemanticElement compositeNode = (CompositeNodeWithSemanticElement) node;
				
				if (node.getSemanticElement() instanceof org.xtext.aRM.REGISTER){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.REGISTER_ID);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.BAREL_SHIFT_REGISTER){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.BAREL_SHIFT_R);
				}
				
				else if (node.getSemanticElement() instanceof org.xtext.aRM.PREPROCESSOR
							|| node.getSemanticElement() instanceof org.xtext.aRM.CExtendCode
							|| node.getSemanticElement() instanceof org.xtext.aRM.CLang
							|| node.getSemanticElement() instanceof org.xtext.aRM.PREPROCESSOR_ELSE
							|| node.getSemanticElement() instanceof org.xtext.aRM.PREPROCESSOR_DEFINE
							|| node.getSemanticElement() instanceof org.xtext.aRM.PREPROCESSOR_ENDIF
							){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.PREPROCESSOR);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.ARM_Machine_Directives
						|| node.getSemanticElement() instanceof org.xtext.aRM.CExtendasciz
						|| node.getSemanticElement() instanceof org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align
						|| node.getSemanticElement() instanceof org.xtext.aRM.ARM_Machine_Directives_code
						|| node.getSemanticElement() instanceof org.xtext.aRM.ARM_Machine_Directives_syntax
						|| node.getSemanticElement() instanceof org.xtext.aRM.ARM_Machine_Directives_save
						|| node.getSemanticElement() instanceof org.xtext.aRM.Assembler_Directives
						|| node.getSemanticElement() instanceof org.xtext.aRM.Assembler_Directives_macro
						|| node.getSemanticElement() instanceof org.xtext.aRM.Assember_Directives_type
						|| node.getSemanticElement() instanceof org.xtext.aRM.Assembler_Directives_endm
						|| node.getSemanticElement() instanceof org.xtext.aRM.Assembler_Directives_equ
						){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.ARM_Machine_Directives);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.variable
							|| node.getSemanticElement() instanceof org.xtext.aRM.immediate_label
							|| node.getSemanticElement() instanceof org.xtext.aRM.definition
							|| node.getSemanticElement() instanceof org.xtext.aRM.description
							){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.LABEL);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.variable_colon){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.VARIABLE);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.PSR_FIELD_E
						|| node.getSemanticElement() instanceof org.xtext.aRM.APSR_FLAG_E){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.PSR_FIELD_E);
				}
				else if (node.getSemanticElement() instanceof org.xtext.aRM.add_sub_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.mul_3R_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.mul_4R_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.mov_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.shift_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.clz_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.compare_test_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.logical_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.branch_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.mrs_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.msr_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.ldr_str_irpre_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.ldr_str_spre_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.ldr_str_irpsot_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.ldr_str_rpost_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.ldm_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.push_pop_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.bkpt_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.swp_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.svc_instr
							|| node.getSemanticElement() instanceof org.xtext.aRM.NOP
							){
					acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.OPERATION_ID);
				}				
			}
			/*if(node.getGrammarElement() instanceof TerminalRuleImpl ){
				 TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
				 if( ge.getName().equalsIgnoreCase( "LABEL_B_F" ) ) 
				 acceptor.addPosition(node.getOffset(), node.getLength(), ARMHighlightingConfiguration.OPERATION_ID);
			}*/
		}
	}
}
