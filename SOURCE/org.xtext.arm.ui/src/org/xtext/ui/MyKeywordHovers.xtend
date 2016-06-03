package org.xtext.ui
import org.xtext.services.ARMGrammarAccess;
import com.google.inject.Inject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall

class MyKeywordHovers {
	@Inject ARMGrammarAccess ga;
		
		var ADD = '''<i><b>Syntax:</i></b>
        			<ul>ADD{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var ADC = '''<i><b>Syntax:</i></b>
        			<ul>ADC{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var ADR = '''<i><b>Syntax:</i></b>
        			<ul>ADR &lt;register&gt; &lt;label&gt;</ul>'''
        			
        var SUB = '''<i><b>Syntax:</i></b>
        			<ul>SUB{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var SBC = '''<i><b>Syntax:</i></b>
        			<ul>SBC{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var RSB = '''<i><b>Syntax:</i></b>
        			<ul>RSB{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var RSC = '''<i><b>Syntax:</i></b>
        			<ul>RSC{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var ADRL = '''<i><b>Syntax:</i></b>
					<ul>ADRL &lt;register&gt; &lt;label&gt;</ul>'''
		
        var MUL ='''<i><b>Syntax:</i></b>
            		<ul>MUL{S} Rd, Rm, Rs</ul>'''
            				
		var MLS ='''<i><b>Syntax:</i></b>
            		<ul>MLS Rd, Rm, Rs, Rn</ul>'''
        
        var MLA ='''<i><b>Syntax:</i></b>
            		<ul>MLA{S} Rd, Rm, Rs, Rn</ul>'''
            		
        var UMULL ='''<i><b>Syntax:</i></b>
        			<ul>UMULL{S} RdLo, RdHi, Rm, Rs</ul>'''
        			
        var UMLAL ='''<i><b>Syntax:</i></b>
        			<ul>UMLAL{S} RdLo, RdHi, Rm, Rs</ul>'''
        			
        var SMULL ='''<i><b>Syntax:</i></b>
        			<ul>SMULL{S} RdLo, RdHi, Rm, Rs</ul>'''
        			
        var SMLAL ='''<i><b>Syntax:</i></b>
        			<ul>SMLAL{S} RdLo, RdHi, Rm, Rs</ul>'''
        
        var SMUL = '''<i><b>Syntax:</i></b>
            		<ul>SMULxy Rd, Rm, Rs</ul>'''
            		
        var SMULW ='''<i><b>Syntax:</i></b>
            		<ul>SMULWy Rd, Rm, Rs</ul>'''
        
        var SMLA ='''<i><b>Syntax:</i></b>
            		<ul>SMLAxy Rd, Rm, Rs, Rn</ul>'''
            		
        var SMLAW='''<i><b>Syntax:</i></b>
            		<ul>SMLAWy Rd, Rm, Rs, Rn</ul>'''
        
        var MOV ='''<i><b>Syntax:</i></b>
        		    <ul>MOV{S} Rd, &lt;Operand2&gt;</ul>'''
        		    
        var MVN ='''<i><b>Syntax:</i></b>
            		<ul>MVN{S} Rd, &lt;Operand2&gt;</ul>'''        

        var ASR ='''<i><b>Syntax:</i></b>
					<ul>ASR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>'''
					
		var LSL ='''<i><b>Syntax:</i></b>
					<ul>LSL{S} Rd, Rm, &lt;Rs|sh&gt;</ul>'''
					
		var LSR ='''<i><b>Syntax:</i></b>
					<ul>LSR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>'''
					
		var ROR ='''<i><b>Syntax:</i></b>
					<ul>ROR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>'''
					
		var RRX ='''<i><b>Syntax:</i></b>
					<ul>RRX{S} Rd, Rm</ul>'''
			
		var CLZ ='''<i><b>Syntax:</i></b>
            		<ul>clz Rd, Rm</ul>'''
        
        var CMP ='''<i><b>Syntax:</i></b>
        			<ul>CMP Rn, &lt;Operand2&gt;</ul>'''
        			
        var CMN ='''<i><b>Syntax:</i></b>
        			<ul>CMN Rn, &lt;Operand2&gt;</ul>'''
        			
        var TST ='''<i><b>Syntax:</i></b>
        			<ul>TST Rn, &lt;Operand2&gt;</ul>'''
        			
        var TEQ ='''<i><b>Syntax:</i></b>
        			<ul>TEQ Rn, &lt;Operand2&gt;</ul>'''
        
        var AND ='''<i><b>Syntax:</i></b>
        			<ul>AND{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var EOR ='''<i><b>Syntax:</i></b>
        			<ul>EOR{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var ORR ='''<i><b>Syntax:</i></b>
        			<ul>ORR{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var ORN ='''<i><b>Syntax:</i></b>
        			<ul>ORN{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        			
        var BIC ='''<i><b>Syntax:</i></b>
        			<ul>BIC{S} Rd, Rn, &lt;Operand2&gt;</ul>'''
        
        var B ='''<i><b>Syntax:</i></b>
            		<ul>B &lt;label&gt;</ul>'''
            		
        var BL ='''<i><b>Syntax:</i></b>
        			<ul>BL &lt;label&gt;</ul>'''
        			
        var BX ='''<i><b>Syntax:</i></b>
        			<ul>BX Rm</ul>'''
        			
        var BLX='''<i><b>Syntax:</i></b>
			        <ul><li>BLX &lt;label&gt;</li>
			        <li>BLX Rm</li></ul>'''
			        
        var BXJ ='''<i><b>Syntax:</i></b>
        			<ul>BXJ Rm</ul>'''
        			
        var MRS ='''<i><b>Syntax:</i></b>
            		<ul>MRS Rd, &lt;PSR&gt;</ul>'''	
        
        var MSR ='''<i><b>Syntax:</i></b>
		            <ul><li>MSR APSR_&lt;flags&gt;, Rm</li>
		            	<li>MSR APSR_&lt;flags&gt;, #&lt;imm8m&gt;</li>
		            	<li>MSR &lt;PSR&gt;_&lt;fields&gt;, Rm</li>
		            	<li>MSR &lt;PSR&gt;_&lt;fields&gt;, #&lt;imm8m&gt;</li></ul>'''
		            	
        var LDR ='''<i><b>Syntax:</i></b>
		            <li>Standard ARM opcode:</li>
		            <ul><li>LDR {size}{T} Rd, [Rn {, #&lt;offset&gt;}]{!}</li>
		            	<li>LDR {size}{T} Rd, [Rn], #&lt;offset&gt;</li>
		            	<li>LDR {size} Rd, [Rn, +/-Rm {, &lt;opsh&gt;}]{!}</li>
		            	<li>LDR {size}{T} Rd, [Rn], +/-Rm {, &lt;opsh&gt;}</li>
		            	<li>LDR {size} Rd, &lt;label&gt;</li>
		            </ul>
		            <li>Pseudo opcode:</li>
		            <ul>LDR &lt;register&gt; , = &ltexpression&gt</ul>'''
		            
        var STR ='''<i><b>Syntax:</i></b>
		            <ul><li>STR {size}{T} Rd, [Rn {, #&lt;offset&gt;}]{!}</li>
		            	<li>STR {size}{T} Rd, [Rn], #&lt;offset&gt;</li>
		            	<li>STR {size} Rd, [Rn, +/-Rm {, &lt;opsh&gt;}]{!}</li>
		            	<li>STR {size}{T} Rd, [Rn], +/-Rm {, &lt;opsh&gt;}</li>
		            	<li>STR {size} Rd, &lt;label&gt;</li>
		            </ul>'''
		            
        var LDM ='''<i><b>Syntax:</i></b>
		            <ul><li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist-PC&gt;</li>
		            	<li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist+PC&gt;</li>
		            	<li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist+PC&gt;^</li>
		            	<li>LDM{IA|IB|DA|DB} Rn, &lt;reglist-PC&gt;^</li></ul>'''
		            	
        var STM ='''<i><b>Syntax:</i></b>
           		 		<ul><li>STM{IA|IB|DA|DB} Rn{!}, &lt;reglist&gt;</li>
            			<li>STM{IA|IB|DA|DB} Rn{!}, &lt;reglist&gt;^</li></ul>'''
            	    				
		var PUSH ='''<i><b>Syntax:</i></b>
        			<ul>PUSH &lt;reglist&gt;</ul>'''
        			
        var POP ='''<i><b>Syntax:</i></b>
        			<ul>POP &lt;reglist&gt;</ul>'''
        			
		var SWP ='''<i><b>Syntax:</i></b>
        			<ul>SWP Rd, Rm, [Rn]</ul>'''
        			
        var SWPB ='''<i><b>Syntax:</i></b>
        			<ul>SWPB Rd, Rm, [Rn]</ul>'''
        			
		var SVC ='''<i><b>Syntax:</i></b>
        			<ul>SVC &lt;imm24&gt;</ul>''' 
        
        var Operand2 ='''<i><b>Syntax:</i></b>
        				<ul><li>#&lt;imm8m&gt;</li>
	        				<li>Rm {, &lt;opsh&gt;}</li>
	        				<li>Rm, LSL Rs</li>
	        				<li>Rm, LSR Rs</li>
	        				<li>Rm, ASR Rs</li>
	        				<li>Rm, ROR Rs</li></ul>
	        				
	        			&lt;opsh&gt; <b><i>Syntax:</i></b>
	    				<ul><li>Rm</li>
	    					<li>Rm, LSL #&lt;shift&gt;</li>
	    					<li>Rm, LSR #&lt;shift&gt;</li>
	    					<li>Rm, ASR #&lt;shift&gt;</li>
	    					<li>Rm, ROR #&lt;shift&gt;</li>
	    					<li>Rm, RRX </li></ul>'''	 
	    					 						           			    			
		val registerResult = '''Register ranges from
        	<ul> 
	        	<li>r0, r1, r2, r3, r4, r5,</li>
	        	<li>r6, r7, r8, r9, r10,</li>
	        	<li>r11, r12, r13, r14, r15</li>
        	</ul>
        	<p> </p>
        	<p>Some ARM environments use :</p>  
        	<ul>
	        	<li> fp = r11 = frame pointer</li>
	        	<li> ip = r12 = intra-procedure scratch register</li>
	        	<li> sp = r13 = stack pointer</li>
	        	<li> lr = r14 = link register </li>
	        	<li> pc = r15 = program counter </li>
        	</ul>'''
        
        val barelShiftRegisterResult = '''
	        Constant shift. 
	        <p>Can be</p> 
	        <ul>
		        <li> asr = Arithmetic Shift Right </li>
		        <li> lsl = Logical Shift Left </li>
		        <li> lsr = Logical Shift Right</li>
		        <li> ror = Rotate Right </li>
	        </ul>'''
        
        val psrResult = '''
			Program Status Register (psr) is one of:
			<ul>
				<li>cpsr
					<p>for use in Debug state, also deprecated synonym for apsr</li></p>
				<li>spsr
					<p>on any processor, in privileged software execution only</li></p>
				<li>apsr
					<p>follows by flags which specify the apsr flags to be moved. Flags can be one or more of:</p>
					<li>nzcvq
						<p>ALU flags field mask (User mode)</p></li>
					<li>g
						<p>SIMD GE flags field mask (User mode).</p></li>
				</li>
			</ul>'''
		
		val flagsResult = '''Flags specify the apsr flags to be moved.
				<p>Flags can be one or more of:</p>
				<ul>
				<li>nzcvq
					<p>ALU flags field mask (User mode)</p></li>
				<li>g
					<p>SIMD GE flags field mask (User mode).</p></li>
				</ul>'''
		
		val label = '''<i><b>Syntax:</i></b>
        			<ul>{$|#|=|.} label </ul>'''
        
        val labelvariable = '''<i><b>Syntax:</i></b>
        			<ul>label: </ul>
        			<i>***Can be integers or expressions.</i>'''
        						
		val labelint = '''<i><b>Syntax:</i></b>
        			<ul>{+|-} integers</ul>
        			<i>***Default is positive integers.</i>'''
        
        val labelhex = '''<i><b>Syntax:</i></b>
        			<ul>0x00FF</ul>
        			<i>***Start with 0x or &.</i>'''
        			
        var description ='''<i><b>Syntax:</i></b>
		            <ul><li>#type</li>
		            	<li>%type</li>
		            </ul>'''
        						
	def hoverRuleCall(RuleCall k){
		val result = switch(k)	{
			case ga.getVariable_colonAccess.getVariableINTMyINTParserRuleCall_0_1_0:labelvariable
			case ga.getVariable_colonAccess.getVariableIDTerminalRuleCall_0_0_0:labelvariable
			case ga.getVariableAccess.getVariableIntMyINTParserRuleCall_1_0_0: labelint
			case ga.getVariableAccess.getVariableABCIDTerminalRuleCall_1_1_0: label
			case ga.getVariableAccess.getVariableStringSTRINGTerminalRuleCall_1_2_0: label
			case ga.getVariableAccess.getVariableHexHEXTerminalRuleCall_1_3_0: labelhex
			case ga.getDefinitionAccess.getVariableIntMyINTParserRuleCall_1_0_0: labelint
			case ga.getDefinitionAccess.getVariableABCIDTerminalRuleCall_1_1_0: label
			case ga.getDefinitionAccess.getVariableStringSTRINGTerminalRuleCall_1_2_0: label
			case ga.getDefinitionAccess.getVariableHexHEXTerminalRuleCall_1_3_0: labelhex
			case ga.getDefinitionAccess.getDefIntMyINTParserRuleCall_2_1_1_0_0: labelint
			case ga.getDefinitionAccess.getDefABCIDTerminalRuleCall_2_1_1_1_0: label
			case ga.getDefinitionAccess.getDefStringSTRINGTerminalRuleCall_2_1_1_2_0: label
			case ga.getDefinitionAccess.getDefHexHEXTerminalRuleCall_2_1_1_3_0: labelhex
			case ga.getDescriptionAccess.getIntMyINTParserRuleCall_1_0_0:description
			case ga.getDescriptionAccess.getStringSTRINGTerminalRuleCall_1_1_0:description
			case ga.getDescriptionAccess.getDescriptionIDTerminalRuleCall_1_2_0:description
			
			case ga.getImmediate_labelAccess.getLabelIDTerminalRuleCall_2_1_2_0_0:Operand2
			case ga.getNumeric_backward_forwardAccess.getIntMyINTParserRuleCall_1_0_0:
				'''<i><b>Syntax:</i></b>
        			<ul>label {f|b}</ul>
        			<i><b>f|b Syntax:</i></b>
        			<ul><i>f : forward
        				<br>b : backward</br></i></ul>'''
			case ga.getLiteral_numericAccess.getIntPLUS_MINUS_INTTerminalRuleCall_1_0:Operand2
			case ga.getLiteral_numericAccess.getHexHEXTerminalRuleCall_0_0:Operand2            
            
			case ga.getADD_OPAccess.getOpADD_COMTerminalRuleCall_0_2:ADD
			case ga.getADC_OPAccess.getOpADC_COMTerminalRuleCall_0_2:ADC
            case ga.getADR_OPAccess.getOpADR_COMTerminalRuleCall_0_2:ADR
            case ga.getSUB_OPAccess.getOpSUB_COMTerminalRuleCall_0_2:SUB
            case ga.getSBC_OPAccess.getOpSBC_COMTerminalRuleCall_0_2:SBC
            case ga.getRSB_OPAccess.getOpRSB_COMTerminalRuleCall_0_2:RSB
            case ga.getRSC_OPAccess.getOpRSC_COMTerminalRuleCall_0_2:RSC
            case ga.getADRL_OPAccess.getOpADRL_COMTerminalRuleCall_0_2:ADRL
            
			case ga.getMUL_OPAccess.getOpMUL_3R_COMTerminalRuleCall_0_2:MUL
            
            case ga.getMLS_OPAccess.getOpMUL_4R_COMTerminalRuleCall_0_2:MLS
            
			case ga.getMLA_OPAccess.getOpMLA_COMTerminalRuleCall_0_2:MLA
            case ga.getUMULL_OPAccess.getOpUMULL_COMTerminalRuleCall_0_2:UMULL
            case ga.getUMLAL_OPAccess.getOpUMLAL_COMTerminalRuleCall_0_2:UMLAL
            case ga.getSMULL_OPAccess.getOpSMULL_COMTerminalRuleCall_0_2:SMULL
            case ga.getSMLAL_OPAccess.getOpSMLAL_COMTerminalRuleCall_0_2:SMLAL
            
			case ga.getSMUL_OPAccess.getOpSMUL_COMTerminalRuleCall_0_2:SMUL
			case ga.getSMULW_OPAccess.getOpSMULW_COMTerminalRuleCall_0_2:SMULW
			
			case ga.getSMLA_OPAccess.getOpSMLA_COMTerminalRuleCall_0_2:SMLA
			case ga.getSMLAW_OPAccess.getOpSMLAW_COMTerminalRuleCall_0_2:SMLAW
			
			case ga.getMOV_OPAccess.getOpMOV_COMTerminalRuleCall_0_2:MOV
			case ga.getMVN_OPAccess.getOpMVN_COMTerminalRuleCall_0_2:MVN
			
			case ga.getASR_OPAccess.getOpASR_COMTerminalRuleCall_0_2:ASR
			case ga.getLSL_OPAccess.getOpLSL_COMTerminalRuleCall_0_2:LSL
			case ga.getLSR_OPAccess.getOpLSR_COMTerminalRuleCall_0_2:LSR
			case ga.getROR_OPAccess.getOpROR_COMTerminalRuleCall_0_2:ROR
			case ga.getRRX_OPAccess.getOpRRX_COMTerminalRuleCall_0_2:RRX
			
			case ga.getCLZ_OPAccess.getOpCLZ_COMTerminalRuleCall_0_2:CLZ
			
			case ga.getCMP_OPAccess.getOpCMP_COMTerminalRuleCall_0_2:CMP
            case ga.getCMN_OPAccess.getOpCMN_COMTerminalRuleCall_0_2:CMN
            case ga.getTST_OPAccess.getOpTST_COMTerminalRuleCall_0_2:TST
            case ga.getTEQ_OPAccess.getOpTEQ_COMTerminalRuleCall_0_2:TEQ
			
			case ga.getAND_OPAccess.getOpAND_COMTerminalRuleCall_0_2:AND
            case ga.getEOR_OPAccess.getOpEOR_COMTerminalRuleCall_0_2:EOR
            case ga.getORR_OPAccess.getOpORR_COMTerminalRuleCall_0_2:ORR
            case ga.getORN_OPAccess.getOpORN_COMTerminalRuleCall_0_2:ORN
            case ga.getBIC_OPAccess.getOpBIC_COMTerminalRuleCall_0_2:BIC
            
			case ga.getB_OPAccess.getOpB_COMTerminalRuleCall_0_2:B
            case ga.getBL_OPAccess.getOpBL_COMTerminalRuleCall_0_2:BL
            case ga.getBX_OPAccess.getOpBX_COMTerminalRuleCall_0_2:BX
            case ga.getBLX_OPAccess.getOpBLX_COMTerminalRuleCall_0_2:BLX
            case ga.getBXJ_OPAccess.getOpBXJ_COMTerminalRuleCall_0_2:BXJ
            
			case ga.getMRS_OPAccess.getOpMRS_COMTerminalRuleCall_0_2:MRS
			case ga.getMSR_OPAccess.getOpMSR_COMTerminalRuleCall_0_2:MSR
			
			case ga.getLDR_OPAccess.getOpLDR_COMTerminalRuleCall_0_2:LDR
            case ga.getSTR_OPAccess.getOpSTR_COMTerminalRuleCall_0_2:STR
            
			case ga.getLDM_OPAccess.getOpLDM_COMTerminalRuleCall_0_2:LDM
            case ga.getSTM_OPAccess.getOpSTM_COMTerminalRuleCall_0_2:STM
            
            case ga.getPUSH_OPAccess.getOpPUSH_COMTerminalRuleCall_0_2:PUSH
            case ga.getPOP_OPAccess.getOpPOP_COMTerminalRuleCall_0_2:POP
            
			case ga.getSWP_OPAccess.getOpSWP_COMTerminalRuleCall_0_2:SWP
            case ga.getSWPB_OPAccess.getOpSWPB_COMTerminalRuleCall_0_2:SWPB
            
			case ga.getSVC_OPAccess.getOpSVC_COMTerminalRuleCall_0_2:SVC
	
			case ga.getPSR_FIELD_EAccess.getOpPSR_FIELDTerminalRuleCall_0:'''
			cpsr / spsr'''
			case ga.getAPSR_FLAG_EAccess.getOpAPSR_FLAGTerminalRuleCall_0:'''
			apsr'''
		}
		result.toString;
	}
	
    def hoverText(Keyword k) {
        val result = switch (k) {
        	case ga.getNOPAccess.getOpNopKeyword_0_0:'''<i><b>Syntax:</i></b>
        	<br>nop</br>'''
        	case ga.getNOPAccess.getOpNOPKeyword_0_1:'''<i><b>Syntax:</i></b>
        	<br>NOP</br>'''
            case ga.getCExtendCodeAccess.getCodeExternKeyword_1_0_0:'''
            	<u><b>Usage :</b></u>
            	<ul>
            		<li>Linker directives</li>
            		<li>The extern directive provides the assembler with a name that is not defined in the current assembly.</li>
            		<li>.extern imports the symbol only if it is referred to in the current assembly.</li>
            		<li>GA ignores .extern as any unrecognized symbol is treated as external symbols.</li>
            	</ul>
            	<i><b>Syntax:</i></b>
            	<ul>.extern symbol
            	</ul>'''
            case ga.getAssembler_Directives_equAccess.getCodeEquKeyword_1_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>The EQU directive gives a symbolic name to a numeric constant.</li>
				    <li>Use EQU to define name constants. </li>
				    <li>Similar to the use of #define to define a constant in C.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>.equ expr{, type}
				    <br>.equ expr</br>
				    <li>expr</li>
				    	is register-relative address, a PC-relative address, 
				    	an absolute address, or a 32-bit integer constant
				    <li>type</li>
				    	is optional,  
				    	<strong>can use type only if expr is an absolute address,</strong>
				    	can be a integer
				</ul>'''
            case ga.getCExtendCodeAccess.getCodeDataKeyword_1_0_1:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>The DATA directive informs the assembler that a label is a data-in-code label. </li>
				    <li>This means that the label is the address of data within a code segment.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>label data    
				    <li>label </li>
				    is the label of the data definition.
				    <li>data</li>
				    directive must be on the same line as label.
				</ul>'''
            case ga.getCExtendCodeAccess.getCodeTextKeyword_1_0_2:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>.text</li>
				    <li>Normal section for code.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>.text</ul>'''
            case ga.getCExtendCodeAccess.getCodeGlobalKeyword_1_0_3:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Linker directives .global</li>
				    <li>Public symbols.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
				    .global symbol
				<br>GLOBAL / EXPORT</br>
				    <li>Export variables to other modules.</li>
				</ul>'''
            case ga.getCExtendCodeAccess.getCodeEndKeyword_1_0_4:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>.end</li>
				    <li>Assembler directives</li>
				    <li>Marks the end of the assembler code in a file. </li>
				    <li>Subsequent lines are ignored.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>.end</ul>'''
			case ga.getAssembler_DirectivesAccess.getCodeLongKeyword_1_0_0:'''<i><b>Syntax:</b></i>
            <ul>.long expression [, expression]*</ul>'''	
            case ga.getAssembler_DirectivesAccess.getCodeWordKeyword_1_0_1:'''<i><b>Syntax:</b></i>
            <ul>.word expression [, expression]*</ul>'''
            case ga.getAssembler_DirectivesAccess.getCodeAsciiKeyword_1_0_2:'''<i><b>Syntax:</b></i>
            <ul>.ascii "string"</ul>'''
            case ga.getAssembler_Directives_macroAccess.getCodeMacroKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.macro macname
            <br>.macro macname macargs...</br>
            .endm</ul>'''
            case ga.getAssembler_Directives_endmAccess.getCodeEndmKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.macro macname
            <br>.macro macname macargs...</br>
            .endm</ul>'''
            case ga.getAssember_Directives_typeAccess.getCodeTypeKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.type &lt;name&gt; STT_&lt;TYPE_IN_UPPER_CASE&gt;
            <br>.type &lt;name&gt;,#&lt;type&gt;</br>
            .type &lt;name&gt;,%&lt;type&gt;
            <br>.type &lt;name&gt;,"&lt;type&gt;"</br></ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCode2byteKeyword_1_0_0:'''<i><b>Syntax:</b></i>
            <ul>.2byte expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCode4byteKeyword_1_0_1:'''<i><b>Syntax:</b></i>
            <ul>.4byte expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCode8byteKeyword_1_0_2:'''<i><b>Syntax:</b></i>
            <ul>.8byte expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeArchKeyword_1_0_3:'''<i><b>Syntax:</b></i>
            <ul>.arch name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeArch_extensionKeyword_1_0_4:'''<i><b>Syntax:</b></i>
            <ul>.arch_extension name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeArmKeyword_1_0_5:'''<i><b>Syntax:</b></i>
            <ul>.arm</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeBssKeyword_1_0_6:'''<i><b>Syntax:</b></i>
            <ul>.bss</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeCantunwindKeyword_1_0_7:'''<i><b>Syntax:</b></i>
            <ul>.cantunwind</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeCpuKeyword_1_0_8:'''<i><b>Syntax:</b></i>
            <ul>.cpu name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeEvenKeyword_1_0_9:'''<i><b>Syntax:</b></i>
            <ul>.even</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeExtendKeyword_1_0_10:'''<i><b>Syntax:</b></i>
            <ul>.extend expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeLdoubleKeyword_1_0_11:'''<i><b>Syntax:</b></i>
            <ul>.ldouble expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeFnendKeyword_1_0_12:'''<i><b>Syntax:</b></i>
            <ul>.fnend</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeFnstartKeyword_1_0_13:'''<i><b>Syntax:</b></i>
            <ul>.fnstart</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeForce_thumbKeyword_1_0_14:'''<i><b>Syntax:</b></i>
            <ul>.force_thumb</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeFpuKeyword_1_0_15:'''<i><b>Syntax:</b></i>
            <ul>.fpu name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeHandlerdataKeyword_1_0_16:'''<i><b>Syntax:</b></i>
            <ul>.handlerdata</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeLtorgKeyword_1_0_17:'''<i><b>Syntax:</b></i>
            <ul>.ldouble expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeMovspKeyword_1_0_18:'''<i><b>Syntax:</b></i>
            <ul>.movsp reg [, #offset]</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeObject_archKeyword_1_0_19:'''<i><b>Syntax:</b></i>
            <ul>.object_arch name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodePackedKeyword_1_0_20:'''<i><b>Syntax:</b></i>
            <ul>.packed expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodePersonalityKeyword_1_0_21:'''<i><b>Syntax:</b></i>
            <ul>.personality name</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodePersonalityindexKeyword_1_0_22:'''<i><b>Syntax:</b></i>
            <ul>.personalityindex index</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodePoolKeyword_1_0_23:'''<i><b>Syntax:</b></i>
            <ul>.pool</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeSecrel32Keyword_1_0_24:'''<i><b>Syntax:</b></i>
            <ul>.secrel32 expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeThumbKeyword_1_0_25:'''<i><b>Syntax:</b></i>
            <ul>.thumb</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeThumb_funcKeyword_1_0_26:'''<i><b>Syntax:</b></i>
            <ul>.thumb_func</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeThumb_setKeyword_1_0_27:'''<i><b>Syntax:</b></i>
            <ul>.thumb_set</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeSpaceKeyword_1_0_28:'''<i><b>Syntax:</b></i>
            <ul>.space expression [, expression]*</ul>'''
            case ga.getARM_Machine_DirectivesAccess.getCodeByteKeyword_1_0_29:'''<i><b>Syntax:</b></i>
            <ul>.byte expression [, expression]*</ul>'''
            case ga.getARM_MACHINE_DIRECTIVES_alignAccess.getCodeAlignKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.align expression [, expression]</ul>'''
            case ga.getARM_Machine_Directives_codeAccess.getCodeCodeKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.code [16|32]</ul>'''
            case ga.getARM_Machine_Directives_syntaxAccess.getCodeSyntaxKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.syntax [unified | divided]</ul>'''
            case ga.getARM_Machine_Directives_saveAccess.getCodeSaveKeyword_1_0:'''<i><b>Syntax:</b></i>
            <ul>.save reglist</ul>'''
            case ga.getCExtendascizAccess.getCodeAscizKeyword_1_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Assembler directives .asciz</li>
				    <li>Declares C-String.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
				    .asciz "string"
				    <li>Declare ASCII C-String. (NULL-terminated)</li>
				</ul>'''
            case ga.getCLangAccess.getCodeLoopKeyword_0_5:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>loop:</li>
				    <li>Repeat blocks of codes.</li>
				    <strong>Becareful with how you start and stop a loop.</strong>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
				    loop:
				</ul>'''
            case ga.getCLangAccess.getCodeBreakKeyword_0_4:'''
            	break is a c code.'''
            case ga.getCLangAccess.getCodeTitleKeyword_0_0:'''
            	title is a c code.'''
            case ga.getCLangAccess.getCodePromptKeyword_0_1:'''
            	prompt is a c code.'''
            case ga.getCLangAccess.getCodeContentKeyword_0_2:'''
            	content is a c code.'''
            case ga.getCLangAccess.getCodeMain1Keyword_0_3:'''
            	main is a c code.'''
            case ga.getCLangAccess.getCodeExit_mainKeyword_0_6:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>exit_main</li>
				    <li>Exit macro block before exit_main</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
				    exit_main
				</ul>'''
            case ga.getPREPROCESSORAccess.getCodeIfKeyword_1_0_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #if</li>
				    <li>Evaluates an expression for conditional compilation.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
					<br>#if expression</br>
					.
					<br>.</br>
					.
					<br>#endif </br> 
				</ul>'''
            
            case ga.getPREPROCESSORAccess.getCodeElifKeyword_1_0_1:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #elif</li>
				    <li>Initiates an alternative branch of the if condition, 
				        when the previous #if, #ifdef, #ifndef, or #elif branch was not taken.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
					#if expression
					<br>.</br>
					.
					<br>.</br>
					#elif expression
					<br>.</br>
					.
					<br>.</br>
					#else
					<br>.</br>
					.
					<br>.</br>
					#endif 
				</ul>'''
            case ga.getPREPROCESSORAccess.getCodeErrorKeyword_1_0_2:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #error</li>
				    <li>Outputs an error message defined by the user.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#error "message"</ul>'''
            case ga.getPREPROCESSORAccess.getCodePragmaKeyword_1_0_3:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #pragma</li>
				    <li>Allows you to specify directives that may be included on the compiler command line. </li>
				    <li>Pragmas may contain the same directives that are specified on the command line.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#pragma directive</ul>'''
            case ga.getPREPROCESSORAccess.getCodeUndefKeyword_1_0_4:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #undef</li>
				    <li>Deletes a preprocessor macro or constant definition.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#undef macro-name</ul>'''
            case ga.getPREPROCESSORAccess.getCodeIncludeKeyword_1_0_5:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #include</li>
				    <li>Reads source text from an external file.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#include "filename"</ul>'''
            case ga.getPREPROCESSORAccess.getCodeIfdefKeyword_1_0_6:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #ifdef</li>
				    <li>Evaluation succeeds if the definition is defined.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#ifdef name</ul>'''
            case ga.getPREPROCESSORAccess.getCodeIfndefKeyword_1_0_7:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #ifndef</li>
				    <li>Same as #ifdef but the evaluation succeeds if the definition is <strong>not</strong> defined.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#ifndef name</ul>'''
            case ga.getPREPROCESSORAccess.getCodeLineKeyword_1_0_8:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #line</li>
				    <li>Specifies a line number and an optional filename</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#line line-number "filename"</ul>'''
			case ga.getPREPROCESSOR_DEFINEAccess.getCodeDefineKeyword_1_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #define	</li>
				    <li>Defines a preprocessor macro or constant.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#define mycode </ul>'''
			case ga.getPREPROCESSOR_ENDIFAccess.getCodeEndifKeyword_1_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #endif</li>
				    <li>#endif	Ends a #if, #ifdef, #ifndef, #elif, or #else block.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>#if expression
				<br>.</br>
				.
				<br>.</br>
				#endif
				</ul>'''
            case ga.getPREPROCESSOR_ELSEAccess.getCodeElseKeyword_1_0:'''
				<u><b>Usage :</b></u>
				<ul>
				    <li>Preprocessor directives #else</li>
				    <li>Initiates an alternative branch 
				        when the previous #if, #ifdef, or #ifndef branch was not taken.</li>
				</ul>
				<i><b>Syntax:</b></i>
				<ul>
					#if expression
					<br>.</br>
					.
					<br>.</br>
					#else
					<br>.</br>
					.
					<br>.</br>
					#endif 
				</ul>'''
            case ga.getADD_OPAccess.getOpAddKeyword_0_0:ADD
			case ga.getADC_OPAccess.getOpAdcKeyword_0_0:ADC
            case ga.getADR_OPAccess.getOpAdrKeyword_0_0:ADR
            case ga.getSUB_OPAccess.getOpSubKeyword_0_0:SUB
            case ga.getSBC_OPAccess.getOpSbcKeyword_0_0:SBC
            case ga.getRSB_OPAccess.getOpRsbKeyword_0_0:RSB
            case ga.getRSC_OPAccess.getOpRscKeyword_0_0:RSC
            case ga.getADRL_OPAccess.getOpAdrlKeyword_0_0:ADRL
            case ga.getADD_OPAccess.getOpADDKeyword_0_1:ADD
			case ga.getADC_OPAccess.getOpADCKeyword_0_1:ADC
            case ga.getADR_OPAccess.getOpADRKeyword_0_1:ADR
            case ga.getSUB_OPAccess.getOpSUBKeyword_0_1:SUB
            case ga.getSBC_OPAccess.getOpSBCKeyword_0_1:SBC
            case ga.getRSB_OPAccess.getOpRSBKeyword_0_1:RSB
            case ga.getRSC_OPAccess.getOpRSCKeyword_0_1:RSC
            case ga.getADRL_OPAccess.getOpADRLKeyword_0_1:ADRL
            
            case ga.getMUL_OPAccess.getOpMulKeyword_0_0:MUL
            case ga.getMUL_OPAccess.getOpMULKeyword_0_1:MUL
            
            case ga.getMLS_OPAccess.getOpMlsKeyword_0_0:MLS
            case ga.getMLS_OPAccess.getOpMLSKeyword_0_1:MLS
            
            case ga.getMLA_OPAccess.getOpMlaKeyword_0_0:MLA
            case ga.getUMULL_OPAccess.getOpUmullKeyword_0_0:UMULL
            case ga.getUMLAL_OPAccess.getOpUmlalKeyword_0_0:UMLAL
            case ga.getSMULL_OPAccess.getOpSmullKeyword_0_0:SMULL
            case ga.getSMLAL_OPAccess.getOpSmlalKeyword_0_0:SMLAL
            case ga.getMLA_OPAccess.getOpMLAKeyword_0_1:MLA
            case ga.getUMULL_OPAccess.getOpUMULLKeyword_0_1:UMULL
            case ga.getUMLAL_OPAccess.getOpUMLALKeyword_0_1:UMLAL
            case ga.getSMULL_OPAccess.getOpSMULLKeyword_0_1:SMULL
            case ga.getSMLAL_OPAccess.getOpSMLALKeyword_0_1:SMLAL
            
            case ga.getSMUL_OPAccess.getOpSmulKeyword_0_0:SMUL
            case ga.getSMULW_OPAccess.getOpSmulwKeyword_0_0:SMULW
            case ga.getSMUL_OPAccess.getOpSMULKeyword_0_1:SMUL
            case ga.getSMULW_OPAccess.getOpSMULWKeyword_0_1:SMULW
            
            case ga.getSMLA_OPAccess.getOpSmlaKeyword_0_0:SMLA
            case ga.getSMLAW_OPAccess.getOpSmlawKeyword_0_0:SMLAW
            case ga.getSMLA_OPAccess.getOpSMLAKeyword_0_1:SMLA
            case ga.getSMLAW_OPAccess.getOpSMLAWKeyword_0_1:SMLAW
            
            case ga.getMOV_OPAccess.getOpMovKeyword_0_0:MOV
            case ga.getMVN_OPAccess.getOpMvnKeyword_0_0:MVN
            case ga.getMOV_OPAccess.getOpMOVKeyword_0_1:MOV
            case ga.getMVN_OPAccess.getOpMVNKeyword_0_1:MVN
            
            case ga.getASR_OPAccess.getOpAsrKeyword_0_0:ASR
			case ga.getLSL_OPAccess.getOpLslKeyword_0_0:LSL
			case ga.getLSR_OPAccess.getOpLsrKeyword_0_0:LSR
			case ga.getROR_OPAccess.getOpRorKeyword_0_0:ROR
			case ga.getRRX_OPAccess.getOpRrxKeyword_0_0:RRX
			case ga.getASR_OPAccess.getOpASRKeyword_0_1:ASR
			case ga.getLSL_OPAccess.getOpLSLKeyword_0_1:LSL
			case ga.getLSR_OPAccess.getOpLSRKeyword_0_1:LSR
			case ga.getROR_OPAccess.getOpRORKeyword_0_1:ROR
			case ga.getRRX_OPAccess.getOpRRXKeyword_0_1:RRX
			
            case ga.getCLZ_OPAccess.getOpClzKeyword_0_0:CLZ
            case ga.getCLZ_OPAccess.getOpCLZKeyword_0_1:CLZ
            
            case ga.getCMP_OPAccess.getOpCmpKeyword_0_0:CMP
            case ga.getCMN_OPAccess.getOpCmnKeyword_0_0:CMN
            case ga.getTST_OPAccess.getOpTstKeyword_0_0:TST
            case ga.getTEQ_OPAccess.getOpTeqKeyword_0_0:TEQ
            case ga.getCMP_OPAccess.getOpCMPKeyword_0_1:CMP
            case ga.getCMN_OPAccess.getOpCMNKeyword_0_1:CMN
            case ga.getTST_OPAccess.getOpTSTKeyword_0_1:TST
            case ga.getTEQ_OPAccess.getOpTEQKeyword_0_1:TEQ
            
            case ga.getAND_OPAccess.getOpAndKeyword_0_0:AND
            case ga.getEOR_OPAccess.getOpEorKeyword_0_0:EOR
            case ga.getORR_OPAccess.getOpOrrKeyword_0_0:ORR
            case ga.getORN_OPAccess.getOpOrnKeyword_0_0:ORN
            case ga.getBIC_OPAccess.getOpBicKeyword_0_0:BIC
            case ga.getAND_OPAccess.getOpANDKeyword_0_1:AND
            case ga.getEOR_OPAccess.getOpEORKeyword_0_1:EOR
            case ga.getORR_OPAccess.getOpORRKeyword_0_1:ORR
            case ga.getORN_OPAccess.getOpORNKeyword_0_1:ORN
            case ga.getBIC_OPAccess.getOpBICKeyword_0_1:BIC
            
            case ga.getB_OPAccess.getOpBKeyword_0_0:B
            case ga.getBL_OPAccess.getOpBlKeyword_0_0:BL
            case ga.getBX_OPAccess.getOpBxKeyword_0_0:BX
            case ga.getBLX_OPAccess.getOpBlxKeyword_0_0:BLX
            case ga.getBXJ_OPAccess.getOpBxjKeyword_0_0:BXJ
            case ga.getB_OPAccess.getOpBKeyword_0_1:B
            case ga.getBL_OPAccess.getOpBLKeyword_0_1:BL
            case ga.getBX_OPAccess.getOpBXKeyword_0_1:BX
            case ga.getBLX_OPAccess.getOpBLXKeyword_0_1:BLX
            case ga.getBXJ_OPAccess.getOpBXJKeyword_0_1:BXJ
            
            case ga.getMRS_OPAccess.getOpMrsKeyword_0_0:MRS
            case ga.getMRS_OPAccess.getOpMRSKeyword_0_1:MRS
            
            case ga.getMSR_OPAccess.getOpMsrKeyword_0_0:MSR
            case ga.getMSR_OPAccess.getOpMSRKeyword_0_1:MSR
            	
            case ga.getLDR_OPAccess.getOpLdrKeyword_0_0:LDR
            case ga.getSTR_OPAccess.getOpStrKeyword_0_0:STR
            case ga.getLDR_OPAccess.getOpLDRKeyword_0_1:LDR
            case ga.getSTR_OPAccess.getOpSTRKeyword_0_1:STR
            
            case ga.getLDM_OPAccess.getOpLdmKeyword_0_0:LDM
            case ga.getSTM_OPAccess.getOpStmKeyword_0_0:STM
            case ga.getLDM_OPAccess.getOpLDMKeyword_0_1:LDM
            case ga.getSTM_OPAccess.getOpSTMKeyword_0_1:STM
            	
            case ga.getPUSH_OPAccess.getOpPushKeyword_0_0:PUSH
            case ga.getPOP_OPAccess.getOpPopKeyword_0_0:POP
            case ga.getPUSH_OPAccess.getOpPUSHKeyword_0_1:PUSH
            case ga.getPOP_OPAccess.getOpPOPKeyword_0_1:POP
            
            case ga.getSWP_OPAccess.getOpSwpKeyword_0_0:SWP
            case ga.getSWPB_OPAccess.getOpSwpbKeyword_0_0:SWPB
            case ga.getSWP_OPAccess.getOpSWPKeyword_0_1:SWP
            case ga.getSWPB_OPAccess.getOpSWPBKeyword_0_1:SWPB
            
            case ga.getSVC_OPAccess.getOpSvcKeyword_0_0:SVC
            case ga.getSVC_OPAccess.getOpSVCKeyword_0_1:SVC
            
            case ga.getREGISTERAccess.getR0R0Keyword_0_0:
            	registerResult
            case ga.getREGISTERAccess.getR1R1Keyword_1_0:
            	registerResult
            case ga.getREGISTERAccess.getR2R2Keyword_2_0:
            	registerResult
            case ga.getREGISTERAccess.getR3R3Keyword_3_0:
            	registerResult
            case ga.getREGISTERAccess.getR4R4Keyword_4_0:
            	registerResult
            case ga.getREGISTERAccess.getR5R5Keyword_5_0:
            	registerResult
            case ga.getREGISTERAccess.getR6R6Keyword_6_0:
            	registerResult
            case ga.getREGISTERAccess.getR7R7Keyword_7_0:
            	registerResult
            case ga.getREGISTERAccess.getR8R8Keyword_8_0:
            	registerResult
            case ga.getREGISTERAccess.getR9R9Keyword_9_0:
            	registerResult
            case ga.getREGISTERAccess.getR10R10Keyword_10_0:
            	registerResult
            case ga.getREGISTERAccess.getR11R11Keyword_11_0:
            	registerResult
            case ga.getREGISTERAccess.getR12R12Keyword_12_0:
            	registerResult
            case ga.getREGISTERAccess.getR13R13Keyword_13_0:
            	registerResult
            case ga.getREGISTERAccess.getR14R14Keyword_14_0:
            	registerResult
            case ga.getREGISTERAccess.getR15R15Keyword_15_0:
            	registerResult
            case ga.getREGISTERAccess.getRfpFpKeyword_16_0:
            	registerResult
            case ga.getREGISTERAccess.getRipIpKeyword_17_0:
            	registerResult
            case ga.getREGISTERAccess.getRspSpKeyword_18_0:
            	registerResult
            case ga.getREGISTERAccess.getRlrLrKeyword_19_0:
            	registerResult
            case ga.getREGISTERAccess.getRpcPcKeyword_20_0:
            	registerResult	
            case ga.getREGISTERAccess.getR001R0Keyword_21_0:
            	registerResult
            case ga.getREGISTERAccess.getR01R1Keyword_22_0:
            	registerResult
            case ga.getREGISTERAccess.getR02R2Keyword_23_0:
            	registerResult
            case ga.getREGISTERAccess.getR03R3Keyword_24_0:
            	registerResult
            case ga.getREGISTERAccess.getR04R4Keyword_25_0:
            	registerResult
            case ga.getREGISTERAccess.getR05R5Keyword_26_0:
            	registerResult
            case ga.getREGISTERAccess.getR06R6Keyword_27_0:
            	registerResult
            case ga.getREGISTERAccess.getR07R7Keyword_28_0:
            	registerResult
            case ga.getREGISTERAccess.getR08R8Keyword_29_0:
            	registerResult
            case ga.getREGISTERAccess.getR09R9Keyword_30_0:
            	registerResult
            case ga.getREGISTERAccess.getR010R10Keyword_31_0:
            	registerResult
            case ga.getREGISTERAccess.getR011R11Keyword_32_0:
            	registerResult
            case ga.getREGISTERAccess.getR012R12Keyword_33_0:
            	registerResult
            case ga.getREGISTERAccess.getR013R13Keyword_34_0:
            	registerResult
            case ga.getREGISTERAccess.getR014R14Keyword_35_0:
            	registerResult
            case ga.getREGISTERAccess.getR015R15Keyword_36_0:
            	registerResult
            case ga.getREGISTERAccess.getR0FPFPKeyword_37_0:
            	registerResult
            case ga.getREGISTERAccess.getR0IPIPKeyword_38_0:
            	registerResult
            case ga.getREGISTERAccess.getR0SPSPKeyword_39_0:
            	registerResult
            case ga.getREGISTERAccess.getR0LRLRKeyword_40_0:
            	registerResult
            case ga.getREGISTERAccess.getR0PCPCKeyword_41_0:
            	registerResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERAsrKeyword_0_0:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERLslKeyword_0_1:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERLsrKeyword_0_2:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERRorKeyword_0_3:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERASRKeyword_0_4:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERLSLKeyword_0_5:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERLSRKeyword_0_6:
            	barelShiftRegisterResult
            case ga.getBAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERRORKeyword_0_7:
            	barelShiftRegisterResult
           
        }
        result.toString;
    }
}