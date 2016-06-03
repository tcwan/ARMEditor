package org.xtext.ui;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.services.ARMGrammarAccess;

@SuppressWarnings("all")
public class MyKeywordHovers {
  @Inject
  private ARMGrammarAccess ga;
  
  private String ADD = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>ADD{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ADC = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>ADC{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ADR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>ADR &lt;register&gt; &lt;label&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SUB = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SUB{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SBC = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SBC{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String RSB = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>RSB{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String RSC = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>RSC{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ADRL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>ADRL &lt;register&gt; &lt;label&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MUL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>MUL{S} Rd, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MLS = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>MLS Rd, Rm, Rs, Rn</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MLA = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>MLA{S} Rd, Rm, Rs, Rn</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String UMULL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>UMULL{S} RdLo, RdHi, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String UMLAL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>UMLAL{S} RdLo, RdHi, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMULL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SMULL{S} RdLo, RdHi, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMLAL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SMLAL{S} RdLo, RdHi, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMUL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>SMULxy Rd, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMULW = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>SMULWy Rd, Rm, Rs</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMLA = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>SMLAxy Rd, Rm, Rs, Rn</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SMLAW = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>SMLAWy Rd, Rm, Rs, Rn</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MOV = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t    ");
      _builder.append("<ul>MOV{S} Rd, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MVN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>MVN{S} Rd, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ASR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>ASR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String LSL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>LSL{S} Rd, Rm, &lt;Rs|sh&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String LSR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>LSR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ROR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>ROR{S} Rd, Rm, &lt;Rs|sh&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String RRX = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<ul>RRX{S} Rd, Rm</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String CLZ = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>clz Rd, Rm</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String CMP = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>CMP Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String CMN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>CMN Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String TST = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>TST Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String TEQ = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>TEQ Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String AND = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>AND{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String EOR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>EOR{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ORR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>ORR{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String ORN = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>ORN{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String BIC = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>BIC{S} Rd, Rn, &lt;Operand2&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String B = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>B &lt;label&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String BL = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>BL &lt;label&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String BX = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>BX Rm</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String BLX = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t\t        ");
      _builder.append("<ul><li>BLX &lt;label&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t\t        ");
      _builder.append("<li>BLX Rm</li></ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String BXJ = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>BXJ Rm</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MRS = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("            \t\t");
      _builder.append("<ul>MRS Rd, &lt;PSR&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String MSR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul><li>MSR APSR_&lt;flags&gt;, Rm</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>MSR APSR_&lt;flags&gt;, #&lt;imm8m&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>MSR &lt;PSR&gt;_&lt;fields&gt;, Rm</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>MSR &lt;PSR&gt;_&lt;fields&gt;, #&lt;imm8m&gt;</li></ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String LDR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<li>Standard ARM opcode:</li>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul><li>LDR {size}{T} Rd, [Rn {, #&lt;offset&gt;}]{!}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDR {size}{T} Rd, [Rn], #&lt;offset&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDR {size} Rd, [Rn, +/-Rm {, &lt;opsh&gt;}]{!}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDR {size}{T} Rd, [Rn], +/-Rm {, &lt;opsh&gt;}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDR {size} Rd, &lt;label&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<li>Pseudo opcode:</li>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul>LDR &lt;register&gt; , = &ltexpression&gt</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String STR = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul><li>STR {size}{T} Rd, [Rn {, #&lt;offset&gt;}]{!}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>STR {size}{T} Rd, [Rn], #&lt;offset&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>STR {size} Rd, [Rn, +/-Rm {, &lt;opsh&gt;}]{!}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>STR {size}{T} Rd, [Rn], +/-Rm {, &lt;opsh&gt;}</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>STR {size} Rd, &lt;label&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String LDM = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul><li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist-PC&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist+PC&gt;</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDM{IA|IB|DA|DB} Rn{!}, &lt;reglist+PC&gt;^</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>LDM{IA|IB|DA|DB} Rn, &lt;reglist-PC&gt;^</li></ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String STM = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("           \t\t \t\t");
      _builder.append("<ul><li>STM{IA|IB|DA|DB} Rn{!}, &lt;reglist&gt;</li>");
      _builder.newLine();
      _builder.append("            \t\t\t");
      _builder.append("<li>STM{IA|IB|DA|DB} Rn{!}, &lt;reglist&gt;^</li></ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String PUSH = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>PUSH &lt;reglist&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String POP = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>POP &lt;reglist&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SWP = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SWP Rd, Rm, [Rn]</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SWPB = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SWPB Rd, Rm, [Rn]</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String SVC = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>SVC &lt;imm24&gt;</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private String Operand2 = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t\t");
      _builder.append("<ul><li>#&lt;imm8m&gt;</li>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.append("<li>Rm {, &lt;opsh&gt;}</li>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.append("<li>Rm, LSL Rs</li>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.append("<li>Rm, LSR Rs</li>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.append("<li>Rm, ASR Rs</li>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.append("<li>Rm, ROR Rs</li></ul>");
      _builder.newLine();
      _builder.append("\t        \t\t\t\t");
      _builder.newLine();
      _builder.append("\t        \t\t\t");
      _builder.append("&lt;opsh&gt; <b><i>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t");
      _builder.append("<ul><li>Rm</li>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t\t");
      _builder.append("<li>Rm, LSL #&lt;shift&gt;</li>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t\t");
      _builder.append("<li>Rm, LSR #&lt;shift&gt;</li>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t\t");
      _builder.append("<li>Rm, ASR #&lt;shift&gt;</li>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t\t");
      _builder.append("<li>Rm, ROR #&lt;shift&gt;</li>");
      _builder.newLine();
      _builder.append("\t    \t\t\t\t\t");
      _builder.append("<li>Rm, RRX </li></ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String registerResult = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Register ranges from");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("<ul> ");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li>r0, r1, r2, r3, r4, r5,</li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li>r6, r7, r8, r9, r10,</li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li>r11, r12, r13, r14, r15</li>");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("</ul>");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("<p> </p>");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("<p>Some ARM environments use :</p>  ");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("<ul>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li> fp = r11 = frame pointer</li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li> ip = r12 = intra-procedure scratch register</li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li> sp = r13 = stack pointer</li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li> lr = r14 = link register </li>");
      _builder.newLine();
      _builder.append("\t        \t");
      _builder.append("<li> pc = r15 = program counter </li>");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String barelShiftRegisterResult = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Constant shift. ");
      _builder.newLine();
      _builder.append("<p>Can be</p> ");
      _builder.newLine();
      _builder.append("<ul>");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("<li> asr = Arithmetic Shift Right </li>");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("<li> lsl = Logical Shift Left </li>");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("<li> lsr = Logical Shift Right</li>");
      _builder.newLine();
      _builder.append("\t\t        ");
      _builder.append("<li> ror = Rotate Right </li>");
      _builder.newLine();
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String psrResult = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Program Status Register (psr) is one of:");
      _builder.newLine();
      _builder.append("<ul>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<li>cpsr");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<p>for use in Debug state, also deprecated synonym for apsr</li></p>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<li>spsr");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<p>on any processor, in privileged software execution only</li></p>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<li>apsr");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<p>follows by flags which specify the apsr flags to be moved. Flags can be one or more of:</p>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<li>nzcvq");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<p>ALU flags field mask (User mode)</p></li>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<li>g");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<p>SIMD GE flags field mask (User mode).</p></li>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</li>");
      _builder.newLine();
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String flagsResult = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Flags specify the apsr flags to be moved.");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<p>Flags can be one or more of:</p>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<ul>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<li>nzcvq");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<p>ALU flags field mask (User mode)</p></li>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<li>g");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("<p>SIMD GE flags field mask (User mode).</p></li>");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String label = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>{$|#|=|.} label </ul>");
      return _builder.toString();
    }
  }.apply();
  
  private final String labelvariable = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>label: </ul>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<i>***Can be integers or expressions.</i>");
      return _builder.toString();
    }
  }.apply();
  
  private final String labelint = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>{+|-} integers</ul>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<i>***Default is positive integers.</i>");
      return _builder.toString();
    }
  }.apply();
  
  private final String labelhex = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<ul>0x00FF</ul>");
      _builder.newLine();
      _builder.append("        \t\t\t");
      _builder.append("<i>***Start with 0x or &.</i>");
      return _builder.toString();
    }
  }.apply();
  
  private String description = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<i><b>Syntax:</i></b>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("<ul><li>#type</li>");
      _builder.newLine();
      _builder.append("\t\t            \t");
      _builder.append("<li>%type</li>");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("</ul>");
      return _builder.toString();
    }
  }.apply();
  
  public String hoverRuleCall(final RuleCall k) {
    String _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        ARMGrammarAccess.Variable_colonElements _variable_colonAccess = this.ga.getVariable_colonAccess();
        RuleCall _variableINTMyINTParserRuleCall_0_1_0 = _variable_colonAccess.getVariableINTMyINTParserRuleCall_0_1_0();
        if (Objects.equal(k, _variableINTMyINTParserRuleCall_0_1_0)) {
          _matched=true;
          _switchResult = this.labelvariable;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Variable_colonElements _variable_colonAccess_1 = this.ga.getVariable_colonAccess();
        RuleCall _variableIDTerminalRuleCall_0_0_0 = _variable_colonAccess_1.getVariableIDTerminalRuleCall_0_0_0();
        if (Objects.equal(k, _variableIDTerminalRuleCall_0_0_0)) {
          _matched=true;
          _switchResult = this.labelvariable;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.VariableElements _variableAccess = this.ga.getVariableAccess();
        RuleCall _variableIntMyINTParserRuleCall_1_0_0 = _variableAccess.getVariableIntMyINTParserRuleCall_1_0_0();
        if (Objects.equal(k, _variableIntMyINTParserRuleCall_1_0_0)) {
          _matched=true;
          _switchResult = this.labelint;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.VariableElements _variableAccess_1 = this.ga.getVariableAccess();
        RuleCall _variableABCIDTerminalRuleCall_1_1_0 = _variableAccess_1.getVariableABCIDTerminalRuleCall_1_1_0();
        if (Objects.equal(k, _variableABCIDTerminalRuleCall_1_1_0)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.VariableElements _variableAccess_2 = this.ga.getVariableAccess();
        RuleCall _variableStringSTRINGTerminalRuleCall_1_2_0 = _variableAccess_2.getVariableStringSTRINGTerminalRuleCall_1_2_0();
        if (Objects.equal(k, _variableStringSTRINGTerminalRuleCall_1_2_0)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.VariableElements _variableAccess_3 = this.ga.getVariableAccess();
        RuleCall _variableHexHEXTerminalRuleCall_1_3_0 = _variableAccess_3.getVariableHexHEXTerminalRuleCall_1_3_0();
        if (Objects.equal(k, _variableHexHEXTerminalRuleCall_1_3_0)) {
          _matched=true;
          _switchResult = this.labelhex;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess = this.ga.getDefinitionAccess();
        RuleCall _variableIntMyINTParserRuleCall_1_0_0_1 = _definitionAccess.getVariableIntMyINTParserRuleCall_1_0_0();
        if (Objects.equal(k, _variableIntMyINTParserRuleCall_1_0_0_1)) {
          _matched=true;
          _switchResult = this.labelint;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_1 = this.ga.getDefinitionAccess();
        RuleCall _variableABCIDTerminalRuleCall_1_1_0_1 = _definitionAccess_1.getVariableABCIDTerminalRuleCall_1_1_0();
        if (Objects.equal(k, _variableABCIDTerminalRuleCall_1_1_0_1)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_2 = this.ga.getDefinitionAccess();
        RuleCall _variableStringSTRINGTerminalRuleCall_1_2_0_1 = _definitionAccess_2.getVariableStringSTRINGTerminalRuleCall_1_2_0();
        if (Objects.equal(k, _variableStringSTRINGTerminalRuleCall_1_2_0_1)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_3 = this.ga.getDefinitionAccess();
        RuleCall _variableHexHEXTerminalRuleCall_1_3_0_1 = _definitionAccess_3.getVariableHexHEXTerminalRuleCall_1_3_0();
        if (Objects.equal(k, _variableHexHEXTerminalRuleCall_1_3_0_1)) {
          _matched=true;
          _switchResult = this.labelhex;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_4 = this.ga.getDefinitionAccess();
        RuleCall _defIntMyINTParserRuleCall_2_1_1_0_0 = _definitionAccess_4.getDefIntMyINTParserRuleCall_2_1_1_0_0();
        if (Objects.equal(k, _defIntMyINTParserRuleCall_2_1_1_0_0)) {
          _matched=true;
          _switchResult = this.labelint;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_5 = this.ga.getDefinitionAccess();
        RuleCall _defABCIDTerminalRuleCall_2_1_1_1_0 = _definitionAccess_5.getDefABCIDTerminalRuleCall_2_1_1_1_0();
        if (Objects.equal(k, _defABCIDTerminalRuleCall_2_1_1_1_0)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_6 = this.ga.getDefinitionAccess();
        RuleCall _defStringSTRINGTerminalRuleCall_2_1_1_2_0 = _definitionAccess_6.getDefStringSTRINGTerminalRuleCall_2_1_1_2_0();
        if (Objects.equal(k, _defStringSTRINGTerminalRuleCall_2_1_1_2_0)) {
          _matched=true;
          _switchResult = this.label;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DefinitionElements _definitionAccess_7 = this.ga.getDefinitionAccess();
        RuleCall _defHexHEXTerminalRuleCall_2_1_1_3_0 = _definitionAccess_7.getDefHexHEXTerminalRuleCall_2_1_1_3_0();
        if (Objects.equal(k, _defHexHEXTerminalRuleCall_2_1_1_3_0)) {
          _matched=true;
          _switchResult = this.labelhex;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DescriptionElements _descriptionAccess = this.ga.getDescriptionAccess();
        RuleCall _intMyINTParserRuleCall_1_0_0 = _descriptionAccess.getIntMyINTParserRuleCall_1_0_0();
        if (Objects.equal(k, _intMyINTParserRuleCall_1_0_0)) {
          _matched=true;
          _switchResult = this.description;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DescriptionElements _descriptionAccess_1 = this.ga.getDescriptionAccess();
        RuleCall _stringSTRINGTerminalRuleCall_1_1_0 = _descriptionAccess_1.getStringSTRINGTerminalRuleCall_1_1_0();
        if (Objects.equal(k, _stringSTRINGTerminalRuleCall_1_1_0)) {
          _matched=true;
          _switchResult = this.description;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.DescriptionElements _descriptionAccess_2 = this.ga.getDescriptionAccess();
        RuleCall _descriptionIDTerminalRuleCall_1_2_0 = _descriptionAccess_2.getDescriptionIDTerminalRuleCall_1_2_0();
        if (Objects.equal(k, _descriptionIDTerminalRuleCall_1_2_0)) {
          _matched=true;
          _switchResult = this.description;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Immediate_labelElements _immediate_labelAccess = this.ga.getImmediate_labelAccess();
        RuleCall _labelIDTerminalRuleCall_2_1_2_0_0 = _immediate_labelAccess.getLabelIDTerminalRuleCall_2_1_2_0_0();
        if (Objects.equal(k, _labelIDTerminalRuleCall_2_1_2_0_0)) {
          _matched=true;
          _switchResult = this.Operand2;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Numeric_backward_forwardElements _numeric_backward_forwardAccess = this.ga.getNumeric_backward_forwardAccess();
        RuleCall _intMyINTParserRuleCall_1_0_0_1 = _numeric_backward_forwardAccess.getIntMyINTParserRuleCall_1_0_0();
        if (Objects.equal(k, _intMyINTParserRuleCall_1_0_0_1)) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<i><b>Syntax:</i></b>");
          _builder.newLine();
          _builder.append("        \t\t\t");
          _builder.append("<ul>label {f|b}</ul>");
          _builder.newLine();
          _builder.append("        \t\t\t");
          _builder.append("<i><b>f|b Syntax:</i></b>");
          _builder.newLine();
          _builder.append("        \t\t\t");
          _builder.append("<ul><i>f : forward");
          _builder.newLine();
          _builder.append("        \t\t\t\t");
          _builder.append("<br>b : backward</br></i></ul>");
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Literal_numericElements _literal_numericAccess = this.ga.getLiteral_numericAccess();
        RuleCall _intPLUS_MINUS_INTTerminalRuleCall_1_0 = _literal_numericAccess.getIntPLUS_MINUS_INTTerminalRuleCall_1_0();
        if (Objects.equal(k, _intPLUS_MINUS_INTTerminalRuleCall_1_0)) {
          _matched=true;
          _switchResult = this.Operand2;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Literal_numericElements _literal_numericAccess_1 = this.ga.getLiteral_numericAccess();
        RuleCall _hexHEXTerminalRuleCall_0_0 = _literal_numericAccess_1.getHexHEXTerminalRuleCall_0_0();
        if (Objects.equal(k, _hexHEXTerminalRuleCall_0_0)) {
          _matched=true;
          _switchResult = this.Operand2;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADD_OPElements _aDD_OPAccess = this.ga.getADD_OPAccess();
        RuleCall _opADD_COMTerminalRuleCall_0_2 = _aDD_OPAccess.getOpADD_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opADD_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ADD;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADC_OPElements _aDC_OPAccess = this.ga.getADC_OPAccess();
        RuleCall _opADC_COMTerminalRuleCall_0_2 = _aDC_OPAccess.getOpADC_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opADC_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ADC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADR_OPElements _aDR_OPAccess = this.ga.getADR_OPAccess();
        RuleCall _opADR_COMTerminalRuleCall_0_2 = _aDR_OPAccess.getOpADR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opADR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ADR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SUB_OPElements _sUB_OPAccess = this.ga.getSUB_OPAccess();
        RuleCall _opSUB_COMTerminalRuleCall_0_2 = _sUB_OPAccess.getOpSUB_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSUB_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SUB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SBC_OPElements _sBC_OPAccess = this.ga.getSBC_OPAccess();
        RuleCall _opSBC_COMTerminalRuleCall_0_2 = _sBC_OPAccess.getOpSBC_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSBC_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SBC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSB_OPElements _rSB_OPAccess = this.ga.getRSB_OPAccess();
        RuleCall _opRSB_COMTerminalRuleCall_0_2 = _rSB_OPAccess.getOpRSB_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opRSB_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.RSB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSC_OPElements _rSC_OPAccess = this.ga.getRSC_OPAccess();
        RuleCall _opRSC_COMTerminalRuleCall_0_2 = _rSC_OPAccess.getOpRSC_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opRSC_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.RSC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADRL_OPElements _aDRL_OPAccess = this.ga.getADRL_OPAccess();
        RuleCall _opADRL_COMTerminalRuleCall_0_2 = _aDRL_OPAccess.getOpADRL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opADRL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ADRL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MUL_OPElements _mUL_OPAccess = this.ga.getMUL_OPAccess();
        RuleCall _opMUL_3R_COMTerminalRuleCall_0_2 = _mUL_OPAccess.getOpMUL_3R_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMUL_3R_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLS_OPElements _mLS_OPAccess = this.ga.getMLS_OPAccess();
        RuleCall _opMUL_4R_COMTerminalRuleCall_0_2 = _mLS_OPAccess.getOpMUL_4R_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMUL_4R_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MLS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLA_OPElements _mLA_OPAccess = this.ga.getMLA_OPAccess();
        RuleCall _opMLA_COMTerminalRuleCall_0_2 = _mLA_OPAccess.getOpMLA_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMLA_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMULL_OPElements _uMULL_OPAccess = this.ga.getUMULL_OPAccess();
        RuleCall _opUMULL_COMTerminalRuleCall_0_2 = _uMULL_OPAccess.getOpUMULL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opUMULL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.UMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMLAL_OPElements _uMLAL_OPAccess = this.ga.getUMLAL_OPAccess();
        RuleCall _opUMLAL_COMTerminalRuleCall_0_2 = _uMLAL_OPAccess.getOpUMLAL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opUMLAL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.UMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULL_OPElements _sMULL_OPAccess = this.ga.getSMULL_OPAccess();
        RuleCall _opSMULL_COMTerminalRuleCall_0_2 = _sMULL_OPAccess.getOpSMULL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMULL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAL_OPElements _sMLAL_OPAccess = this.ga.getSMLAL_OPAccess();
        RuleCall _opSMLAL_COMTerminalRuleCall_0_2 = _sMLAL_OPAccess.getOpSMLAL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMLAL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMUL_OPElements _sMUL_OPAccess = this.ga.getSMUL_OPAccess();
        RuleCall _opSMUL_COMTerminalRuleCall_0_2 = _sMUL_OPAccess.getOpSMUL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMUL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULW_OPElements _sMULW_OPAccess = this.ga.getSMULW_OPAccess();
        RuleCall _opSMULW_COMTerminalRuleCall_0_2 = _sMULW_OPAccess.getOpSMULW_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMULW_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMULW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLA_OPElements _sMLA_OPAccess = this.ga.getSMLA_OPAccess();
        RuleCall _opSMLA_COMTerminalRuleCall_0_2 = _sMLA_OPAccess.getOpSMLA_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMLA_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAW_OPElements _sMLAW_OPAccess = this.ga.getSMLAW_OPAccess();
        RuleCall _opSMLAW_COMTerminalRuleCall_0_2 = _sMLAW_OPAccess.getOpSMLAW_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSMLAW_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SMLAW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MOV_OPElements _mOV_OPAccess = this.ga.getMOV_OPAccess();
        RuleCall _opMOV_COMTerminalRuleCall_0_2 = _mOV_OPAccess.getOpMOV_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMOV_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MOV;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MVN_OPElements _mVN_OPAccess = this.ga.getMVN_OPAccess();
        RuleCall _opMVN_COMTerminalRuleCall_0_2 = _mVN_OPAccess.getOpMVN_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMVN_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MVN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ASR_OPElements _aSR_OPAccess = this.ga.getASR_OPAccess();
        RuleCall _opASR_COMTerminalRuleCall_0_2 = _aSR_OPAccess.getOpASR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opASR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ASR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSL_OPElements _lSL_OPAccess = this.ga.getLSL_OPAccess();
        RuleCall _opLSL_COMTerminalRuleCall_0_2 = _lSL_OPAccess.getOpLSL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opLSL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.LSL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSR_OPElements _lSR_OPAccess = this.ga.getLSR_OPAccess();
        RuleCall _opLSR_COMTerminalRuleCall_0_2 = _lSR_OPAccess.getOpLSR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opLSR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.LSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ROR_OPElements _rOR_OPAccess = this.ga.getROR_OPAccess();
        RuleCall _opROR_COMTerminalRuleCall_0_2 = _rOR_OPAccess.getOpROR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opROR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ROR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RRX_OPElements _rRX_OPAccess = this.ga.getRRX_OPAccess();
        RuleCall _opRRX_COMTerminalRuleCall_0_2 = _rRX_OPAccess.getOpRRX_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opRRX_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.RRX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLZ_OPElements _cLZ_OPAccess = this.ga.getCLZ_OPAccess();
        RuleCall _opCLZ_COMTerminalRuleCall_0_2 = _cLZ_OPAccess.getOpCLZ_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opCLZ_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.CLZ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMP_OPElements _cMP_OPAccess = this.ga.getCMP_OPAccess();
        RuleCall _opCMP_COMTerminalRuleCall_0_2 = _cMP_OPAccess.getOpCMP_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opCMP_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.CMP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMN_OPElements _cMN_OPAccess = this.ga.getCMN_OPAccess();
        RuleCall _opCMN_COMTerminalRuleCall_0_2 = _cMN_OPAccess.getOpCMN_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opCMN_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.CMN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TST_OPElements _tST_OPAccess = this.ga.getTST_OPAccess();
        RuleCall _opTST_COMTerminalRuleCall_0_2 = _tST_OPAccess.getOpTST_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opTST_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.TST;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TEQ_OPElements _tEQ_OPAccess = this.ga.getTEQ_OPAccess();
        RuleCall _opTEQ_COMTerminalRuleCall_0_2 = _tEQ_OPAccess.getOpTEQ_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opTEQ_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.TEQ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.AND_OPElements _aND_OPAccess = this.ga.getAND_OPAccess();
        RuleCall _opAND_COMTerminalRuleCall_0_2 = _aND_OPAccess.getOpAND_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opAND_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.AND;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.EOR_OPElements _eOR_OPAccess = this.ga.getEOR_OPAccess();
        RuleCall _opEOR_COMTerminalRuleCall_0_2 = _eOR_OPAccess.getOpEOR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opEOR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.EOR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORR_OPElements _oRR_OPAccess = this.ga.getORR_OPAccess();
        RuleCall _opORR_COMTerminalRuleCall_0_2 = _oRR_OPAccess.getOpORR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opORR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ORR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORN_OPElements _oRN_OPAccess = this.ga.getORN_OPAccess();
        RuleCall _opORN_COMTerminalRuleCall_0_2 = _oRN_OPAccess.getOpORN_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opORN_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.ORN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BIC_OPElements _bIC_OPAccess = this.ga.getBIC_OPAccess();
        RuleCall _opBIC_COMTerminalRuleCall_0_2 = _bIC_OPAccess.getOpBIC_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opBIC_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.BIC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.B_OPElements _b_OPAccess = this.ga.getB_OPAccess();
        RuleCall _opB_COMTerminalRuleCall_0_2 = _b_OPAccess.getOpB_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opB_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.B;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BL_OPElements _bL_OPAccess = this.ga.getBL_OPAccess();
        RuleCall _opBL_COMTerminalRuleCall_0_2 = _bL_OPAccess.getOpBL_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opBL_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.BL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BX_OPElements _bX_OPAccess = this.ga.getBX_OPAccess();
        RuleCall _opBX_COMTerminalRuleCall_0_2 = _bX_OPAccess.getOpBX_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opBX_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.BX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BLX_OPElements _bLX_OPAccess = this.ga.getBLX_OPAccess();
        RuleCall _opBLX_COMTerminalRuleCall_0_2 = _bLX_OPAccess.getOpBLX_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opBLX_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.BLX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BXJ_OPElements _bXJ_OPAccess = this.ga.getBXJ_OPAccess();
        RuleCall _opBXJ_COMTerminalRuleCall_0_2 = _bXJ_OPAccess.getOpBXJ_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opBXJ_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.BXJ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MRS_OPElements _mRS_OPAccess = this.ga.getMRS_OPAccess();
        RuleCall _opMRS_COMTerminalRuleCall_0_2 = _mRS_OPAccess.getOpMRS_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMRS_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MRS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MSR_OPElements _mSR_OPAccess = this.ga.getMSR_OPAccess();
        RuleCall _opMSR_COMTerminalRuleCall_0_2 = _mSR_OPAccess.getOpMSR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opMSR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.MSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDR_OPElements _lDR_OPAccess = this.ga.getLDR_OPAccess();
        RuleCall _opLDR_COMTerminalRuleCall_0_2 = _lDR_OPAccess.getOpLDR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opLDR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.LDR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STR_OPElements _sTR_OPAccess = this.ga.getSTR_OPAccess();
        RuleCall _opSTR_COMTerminalRuleCall_0_2 = _sTR_OPAccess.getOpSTR_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSTR_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.STR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDM_OPElements _lDM_OPAccess = this.ga.getLDM_OPAccess();
        RuleCall _opLDM_COMTerminalRuleCall_0_2 = _lDM_OPAccess.getOpLDM_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opLDM_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.LDM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STM_OPElements _sTM_OPAccess = this.ga.getSTM_OPAccess();
        RuleCall _opSTM_COMTerminalRuleCall_0_2 = _sTM_OPAccess.getOpSTM_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSTM_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.STM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PUSH_OPElements _pUSH_OPAccess = this.ga.getPUSH_OPAccess();
        RuleCall _opPUSH_COMTerminalRuleCall_0_2 = _pUSH_OPAccess.getOpPUSH_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opPUSH_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.PUSH;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.POP_OPElements _pOP_OPAccess = this.ga.getPOP_OPAccess();
        RuleCall _opPOP_COMTerminalRuleCall_0_2 = _pOP_OPAccess.getOpPOP_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opPOP_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.POP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWP_OPElements _sWP_OPAccess = this.ga.getSWP_OPAccess();
        RuleCall _opSWP_COMTerminalRuleCall_0_2 = _sWP_OPAccess.getOpSWP_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSWP_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SWP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWPB_OPElements _sWPB_OPAccess = this.ga.getSWPB_OPAccess();
        RuleCall _opSWPB_COMTerminalRuleCall_0_2 = _sWPB_OPAccess.getOpSWPB_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSWPB_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SWPB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SVC_OPElements _sVC_OPAccess = this.ga.getSVC_OPAccess();
        RuleCall _opSVC_COMTerminalRuleCall_0_2 = _sVC_OPAccess.getOpSVC_COMTerminalRuleCall_0_2();
        if (Objects.equal(k, _opSVC_COMTerminalRuleCall_0_2)) {
          _matched=true;
          _switchResult = this.SVC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PSR_FIELD_EElements _pSR_FIELD_EAccess = this.ga.getPSR_FIELD_EAccess();
        RuleCall _opPSR_FIELDTerminalRuleCall_0 = _pSR_FIELD_EAccess.getOpPSR_FIELDTerminalRuleCall_0();
        if (Objects.equal(k, _opPSR_FIELDTerminalRuleCall_0)) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("cpsr / spsr");
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.APSR_FLAG_EElements _aPSR_FLAG_EAccess = this.ga.getAPSR_FLAG_EAccess();
        RuleCall _opAPSR_FLAGTerminalRuleCall_0 = _aPSR_FLAG_EAccess.getOpAPSR_FLAGTerminalRuleCall_0();
        if (Objects.equal(k, _opAPSR_FLAGTerminalRuleCall_0)) {
          _matched=true;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("apsr");
          _switchResult = _builder_2.toString();
        }
      }
      final String result = _switchResult;
      _xblockexpression = result.toString();
    }
    return _xblockexpression;
  }
  
  public String hoverText(final Keyword k) {
    String _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        ARMGrammarAccess.NOPElements _nOPAccess = this.ga.getNOPAccess();
        Keyword _opNopKeyword_0_0 = _nOPAccess.getOpNopKeyword_0_0();
        if (Objects.equal(k, _opNopKeyword_0_0)) {
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<i><b>Syntax:</i></b>");
          _builder.newLine();
          _builder.append("        \t");
          _builder.append("<br>nop</br>");
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.NOPElements _nOPAccess_1 = this.ga.getNOPAccess();
        Keyword _opNOPKeyword_0_1 = _nOPAccess_1.getOpNOPKeyword_0_1();
        if (Objects.equal(k, _opNOPKeyword_0_1)) {
          _matched=true;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<i><b>Syntax:</i></b>");
          _builder_1.newLine();
          _builder_1.append("        \t");
          _builder_1.append("<br>NOP</br>");
          _switchResult = _builder_1.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendCodeElements _cExtendCodeAccess = this.ga.getCExtendCodeAccess();
        Keyword _codeExternKeyword_1_0_0 = _cExtendCodeAccess.getCodeExternKeyword_1_0_0();
        if (Objects.equal(k, _codeExternKeyword_1_0_0)) {
          _matched=true;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("<u><b>Usage :</b></u>");
          _builder_2.newLine();
          _builder_2.append("<ul>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<li>Linker directives</li>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<li>The extern directive provides the assembler with a name that is not defined in the current assembly.</li>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<li>.extern imports the symbol only if it is referred to in the current assembly.</li>");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("<li>GA ignores .extern as any unrecognized symbol is treated as external symbols.</li>");
          _builder_2.newLine();
          _builder_2.append("</ul>");
          _builder_2.newLine();
          _builder_2.append("<i><b>Syntax:</i></b>");
          _builder_2.newLine();
          _builder_2.append("<ul>.extern symbol");
          _builder_2.newLine();
          _builder_2.append("</ul>");
          _switchResult = _builder_2.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_Directives_equElements _assembler_Directives_equAccess = this.ga.getAssembler_Directives_equAccess();
        Keyword _codeEquKeyword_1_0 = _assembler_Directives_equAccess.getCodeEquKeyword_1_0();
        if (Objects.equal(k, _codeEquKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("<u><b>Usage :</b></u>");
          _builder_3.newLine();
          _builder_3.append("<ul>");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<li>The EQU directive gives a symbolic name to a numeric constant.</li>");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<li>Use EQU to define name constants. </li>");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<li>Similar to the use of #define to define a constant in C.</li>");
          _builder_3.newLine();
          _builder_3.append("</ul>");
          _builder_3.newLine();
          _builder_3.append("<i><b>Syntax:</b></i>");
          _builder_3.newLine();
          _builder_3.append("<ul>.equ expr{, type}");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<br>.equ expr</br>");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<li>expr</li>");
          _builder_3.newLine();
          _builder_3.append("    \t");
          _builder_3.append("is register-relative address, a PC-relative address, ");
          _builder_3.newLine();
          _builder_3.append("    \t");
          _builder_3.append("an absolute address, or a 32-bit integer constant");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("<li>type</li>");
          _builder_3.newLine();
          _builder_3.append("    \t");
          _builder_3.append("is optional,  ");
          _builder_3.newLine();
          _builder_3.append("    \t");
          _builder_3.append("<strong>can use type only if expr is an absolute address,</strong>");
          _builder_3.newLine();
          _builder_3.append("    \t");
          _builder_3.append("can be a integer");
          _builder_3.newLine();
          _builder_3.append("</ul>");
          _switchResult = _builder_3.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendCodeElements _cExtendCodeAccess_1 = this.ga.getCExtendCodeAccess();
        Keyword _codeDataKeyword_1_0_1 = _cExtendCodeAccess_1.getCodeDataKeyword_1_0_1();
        if (Objects.equal(k, _codeDataKeyword_1_0_1)) {
          _matched=true;
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("<u><b>Usage :</b></u>");
          _builder_4.newLine();
          _builder_4.append("<ul>");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("<li>The DATA directive informs the assembler that a label is a data-in-code label. </li>");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("<li>This means that the label is the address of data within a code segment.</li>");
          _builder_4.newLine();
          _builder_4.append("</ul>");
          _builder_4.newLine();
          _builder_4.append("<i><b>Syntax:</b></i>");
          _builder_4.newLine();
          _builder_4.append("<ul>label data    ");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("<li>label </li>");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("is the label of the data definition.");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("<li>data</li>");
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("directive must be on the same line as label.");
          _builder_4.newLine();
          _builder_4.append("</ul>");
          _switchResult = _builder_4.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendCodeElements _cExtendCodeAccess_2 = this.ga.getCExtendCodeAccess();
        Keyword _codeTextKeyword_1_0_2 = _cExtendCodeAccess_2.getCodeTextKeyword_1_0_2();
        if (Objects.equal(k, _codeTextKeyword_1_0_2)) {
          _matched=true;
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("<u><b>Usage :</b></u>");
          _builder_5.newLine();
          _builder_5.append("<ul>");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("<li>.text</li>");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("<li>Normal section for code.</li>");
          _builder_5.newLine();
          _builder_5.append("</ul>");
          _builder_5.newLine();
          _builder_5.append("<i><b>Syntax:</b></i>");
          _builder_5.newLine();
          _builder_5.append("<ul>.text</ul>");
          _switchResult = _builder_5.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendCodeElements _cExtendCodeAccess_3 = this.ga.getCExtendCodeAccess();
        Keyword _codeGlobalKeyword_1_0_3 = _cExtendCodeAccess_3.getCodeGlobalKeyword_1_0_3();
        if (Objects.equal(k, _codeGlobalKeyword_1_0_3)) {
          _matched=true;
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("<u><b>Usage :</b></u>");
          _builder_6.newLine();
          _builder_6.append("<ul>");
          _builder_6.newLine();
          _builder_6.append("    ");
          _builder_6.append("<li>Linker directives .global</li>");
          _builder_6.newLine();
          _builder_6.append("    ");
          _builder_6.append("<li>Public symbols.</li>");
          _builder_6.newLine();
          _builder_6.append("</ul>");
          _builder_6.newLine();
          _builder_6.append("<i><b>Syntax:</b></i>");
          _builder_6.newLine();
          _builder_6.append("<ul>");
          _builder_6.newLine();
          _builder_6.append("    ");
          _builder_6.append(".global symbol");
          _builder_6.newLine();
          _builder_6.append("<br>GLOBAL / EXPORT</br>");
          _builder_6.newLine();
          _builder_6.append("    ");
          _builder_6.append("<li>Export variables to other modules.</li>");
          _builder_6.newLine();
          _builder_6.append("</ul>");
          _switchResult = _builder_6.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendCodeElements _cExtendCodeAccess_4 = this.ga.getCExtendCodeAccess();
        Keyword _codeEndKeyword_1_0_4 = _cExtendCodeAccess_4.getCodeEndKeyword_1_0_4();
        if (Objects.equal(k, _codeEndKeyword_1_0_4)) {
          _matched=true;
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("<u><b>Usage :</b></u>");
          _builder_7.newLine();
          _builder_7.append("<ul>");
          _builder_7.newLine();
          _builder_7.append("    ");
          _builder_7.append("<li>.end</li>");
          _builder_7.newLine();
          _builder_7.append("    ");
          _builder_7.append("<li>Assembler directives</li>");
          _builder_7.newLine();
          _builder_7.append("    ");
          _builder_7.append("<li>Marks the end of the assembler code in a file. </li>");
          _builder_7.newLine();
          _builder_7.append("    ");
          _builder_7.append("<li>Subsequent lines are ignored.</li>");
          _builder_7.newLine();
          _builder_7.append("</ul>");
          _builder_7.newLine();
          _builder_7.append("<i><b>Syntax:</b></i>");
          _builder_7.newLine();
          _builder_7.append("<ul>.end</ul>");
          _switchResult = _builder_7.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_DirectivesElements _assembler_DirectivesAccess = this.ga.getAssembler_DirectivesAccess();
        Keyword _codeLongKeyword_1_0_0 = _assembler_DirectivesAccess.getCodeLongKeyword_1_0_0();
        if (Objects.equal(k, _codeLongKeyword_1_0_0)) {
          _matched=true;
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("<i><b>Syntax:</b></i>");
          _builder_8.newLine();
          _builder_8.append("            ");
          _builder_8.append("<ul>.long expression [, expression]*</ul>");
          _switchResult = _builder_8.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_DirectivesElements _assembler_DirectivesAccess_1 = this.ga.getAssembler_DirectivesAccess();
        Keyword _codeWordKeyword_1_0_1 = _assembler_DirectivesAccess_1.getCodeWordKeyword_1_0_1();
        if (Objects.equal(k, _codeWordKeyword_1_0_1)) {
          _matched=true;
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("<i><b>Syntax:</b></i>");
          _builder_9.newLine();
          _builder_9.append("            ");
          _builder_9.append("<ul>.word expression [, expression]*</ul>");
          _switchResult = _builder_9.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_DirectivesElements _assembler_DirectivesAccess_2 = this.ga.getAssembler_DirectivesAccess();
        Keyword _codeAsciiKeyword_1_0_2 = _assembler_DirectivesAccess_2.getCodeAsciiKeyword_1_0_2();
        if (Objects.equal(k, _codeAsciiKeyword_1_0_2)) {
          _matched=true;
          StringConcatenation _builder_10 = new StringConcatenation();
          _builder_10.append("<i><b>Syntax:</b></i>");
          _builder_10.newLine();
          _builder_10.append("            ");
          _builder_10.append("<ul>.ascii \"string\"</ul>");
          _switchResult = _builder_10.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_Directives_macroElements _assembler_Directives_macroAccess = this.ga.getAssembler_Directives_macroAccess();
        Keyword _codeMacroKeyword_1_0 = _assembler_Directives_macroAccess.getCodeMacroKeyword_1_0();
        if (Objects.equal(k, _codeMacroKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_11 = new StringConcatenation();
          _builder_11.append("<i><b>Syntax:</b></i>");
          _builder_11.newLine();
          _builder_11.append("            ");
          _builder_11.append("<ul>.macro macname");
          _builder_11.newLine();
          _builder_11.append("            ");
          _builder_11.append("<br>.macro macname macargs...</br>");
          _builder_11.newLine();
          _builder_11.append("            ");
          _builder_11.append(".endm</ul>");
          _switchResult = _builder_11.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assembler_Directives_endmElements _assembler_Directives_endmAccess = this.ga.getAssembler_Directives_endmAccess();
        Keyword _codeEndmKeyword_1_0 = _assembler_Directives_endmAccess.getCodeEndmKeyword_1_0();
        if (Objects.equal(k, _codeEndmKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_12 = new StringConcatenation();
          _builder_12.append("<i><b>Syntax:</b></i>");
          _builder_12.newLine();
          _builder_12.append("            ");
          _builder_12.append("<ul>.macro macname");
          _builder_12.newLine();
          _builder_12.append("            ");
          _builder_12.append("<br>.macro macname macargs...</br>");
          _builder_12.newLine();
          _builder_12.append("            ");
          _builder_12.append(".endm</ul>");
          _switchResult = _builder_12.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.Assember_Directives_typeElements _assember_Directives_typeAccess = this.ga.getAssember_Directives_typeAccess();
        Keyword _codeTypeKeyword_1_0 = _assember_Directives_typeAccess.getCodeTypeKeyword_1_0();
        if (Objects.equal(k, _codeTypeKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_13 = new StringConcatenation();
          _builder_13.append("<i><b>Syntax:</b></i>");
          _builder_13.newLine();
          _builder_13.append("            ");
          _builder_13.append("<ul>.type &lt;name&gt; STT_&lt;TYPE_IN_UPPER_CASE&gt;");
          _builder_13.newLine();
          _builder_13.append("            ");
          _builder_13.append("<br>.type &lt;name&gt;,#&lt;type&gt;</br>");
          _builder_13.newLine();
          _builder_13.append("            ");
          _builder_13.append(".type &lt;name&gt;,%&lt;type&gt;");
          _builder_13.newLine();
          _builder_13.append("            ");
          _builder_13.append("<br>.type &lt;name&gt;,\"&lt;type&gt;\"</br></ul>");
          _switchResult = _builder_13.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _code2byteKeyword_1_0_0 = _aRM_Machine_DirectivesAccess.getCode2byteKeyword_1_0_0();
        if (Objects.equal(k, _code2byteKeyword_1_0_0)) {
          _matched=true;
          StringConcatenation _builder_14 = new StringConcatenation();
          _builder_14.append("<i><b>Syntax:</b></i>");
          _builder_14.newLine();
          _builder_14.append("            ");
          _builder_14.append("<ul>.2byte expression [, expression]*</ul>");
          _switchResult = _builder_14.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_1 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _code4byteKeyword_1_0_1 = _aRM_Machine_DirectivesAccess_1.getCode4byteKeyword_1_0_1();
        if (Objects.equal(k, _code4byteKeyword_1_0_1)) {
          _matched=true;
          StringConcatenation _builder_15 = new StringConcatenation();
          _builder_15.append("<i><b>Syntax:</b></i>");
          _builder_15.newLine();
          _builder_15.append("            ");
          _builder_15.append("<ul>.4byte expression [, expression]*</ul>");
          _switchResult = _builder_15.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_2 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _code8byteKeyword_1_0_2 = _aRM_Machine_DirectivesAccess_2.getCode8byteKeyword_1_0_2();
        if (Objects.equal(k, _code8byteKeyword_1_0_2)) {
          _matched=true;
          StringConcatenation _builder_16 = new StringConcatenation();
          _builder_16.append("<i><b>Syntax:</b></i>");
          _builder_16.newLine();
          _builder_16.append("            ");
          _builder_16.append("<ul>.8byte expression [, expression]*</ul>");
          _switchResult = _builder_16.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_3 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeArchKeyword_1_0_3 = _aRM_Machine_DirectivesAccess_3.getCodeArchKeyword_1_0_3();
        if (Objects.equal(k, _codeArchKeyword_1_0_3)) {
          _matched=true;
          StringConcatenation _builder_17 = new StringConcatenation();
          _builder_17.append("<i><b>Syntax:</b></i>");
          _builder_17.newLine();
          _builder_17.append("            ");
          _builder_17.append("<ul>.arch name</ul>");
          _switchResult = _builder_17.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_4 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeArch_extensionKeyword_1_0_4 = _aRM_Machine_DirectivesAccess_4.getCodeArch_extensionKeyword_1_0_4();
        if (Objects.equal(k, _codeArch_extensionKeyword_1_0_4)) {
          _matched=true;
          StringConcatenation _builder_18 = new StringConcatenation();
          _builder_18.append("<i><b>Syntax:</b></i>");
          _builder_18.newLine();
          _builder_18.append("            ");
          _builder_18.append("<ul>.arch_extension name</ul>");
          _switchResult = _builder_18.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_5 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeArmKeyword_1_0_5 = _aRM_Machine_DirectivesAccess_5.getCodeArmKeyword_1_0_5();
        if (Objects.equal(k, _codeArmKeyword_1_0_5)) {
          _matched=true;
          StringConcatenation _builder_19 = new StringConcatenation();
          _builder_19.append("<i><b>Syntax:</b></i>");
          _builder_19.newLine();
          _builder_19.append("            ");
          _builder_19.append("<ul>.arm</ul>");
          _switchResult = _builder_19.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_6 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeBssKeyword_1_0_6 = _aRM_Machine_DirectivesAccess_6.getCodeBssKeyword_1_0_6();
        if (Objects.equal(k, _codeBssKeyword_1_0_6)) {
          _matched=true;
          StringConcatenation _builder_20 = new StringConcatenation();
          _builder_20.append("<i><b>Syntax:</b></i>");
          _builder_20.newLine();
          _builder_20.append("            ");
          _builder_20.append("<ul>.bss</ul>");
          _switchResult = _builder_20.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_7 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeCantunwindKeyword_1_0_7 = _aRM_Machine_DirectivesAccess_7.getCodeCantunwindKeyword_1_0_7();
        if (Objects.equal(k, _codeCantunwindKeyword_1_0_7)) {
          _matched=true;
          StringConcatenation _builder_21 = new StringConcatenation();
          _builder_21.append("<i><b>Syntax:</b></i>");
          _builder_21.newLine();
          _builder_21.append("            ");
          _builder_21.append("<ul>.cantunwind</ul>");
          _switchResult = _builder_21.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_8 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeCpuKeyword_1_0_8 = _aRM_Machine_DirectivesAccess_8.getCodeCpuKeyword_1_0_8();
        if (Objects.equal(k, _codeCpuKeyword_1_0_8)) {
          _matched=true;
          StringConcatenation _builder_22 = new StringConcatenation();
          _builder_22.append("<i><b>Syntax:</b></i>");
          _builder_22.newLine();
          _builder_22.append("            ");
          _builder_22.append("<ul>.cpu name</ul>");
          _switchResult = _builder_22.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_9 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeEvenKeyword_1_0_9 = _aRM_Machine_DirectivesAccess_9.getCodeEvenKeyword_1_0_9();
        if (Objects.equal(k, _codeEvenKeyword_1_0_9)) {
          _matched=true;
          StringConcatenation _builder_23 = new StringConcatenation();
          _builder_23.append("<i><b>Syntax:</b></i>");
          _builder_23.newLine();
          _builder_23.append("            ");
          _builder_23.append("<ul>.even</ul>");
          _switchResult = _builder_23.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_10 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeExtendKeyword_1_0_10 = _aRM_Machine_DirectivesAccess_10.getCodeExtendKeyword_1_0_10();
        if (Objects.equal(k, _codeExtendKeyword_1_0_10)) {
          _matched=true;
          StringConcatenation _builder_24 = new StringConcatenation();
          _builder_24.append("<i><b>Syntax:</b></i>");
          _builder_24.newLine();
          _builder_24.append("            ");
          _builder_24.append("<ul>.extend expression [, expression]*</ul>");
          _switchResult = _builder_24.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_11 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeLdoubleKeyword_1_0_11 = _aRM_Machine_DirectivesAccess_11.getCodeLdoubleKeyword_1_0_11();
        if (Objects.equal(k, _codeLdoubleKeyword_1_0_11)) {
          _matched=true;
          StringConcatenation _builder_25 = new StringConcatenation();
          _builder_25.append("<i><b>Syntax:</b></i>");
          _builder_25.newLine();
          _builder_25.append("            ");
          _builder_25.append("<ul>.ldouble expression [, expression]*</ul>");
          _switchResult = _builder_25.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_12 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeFnendKeyword_1_0_12 = _aRM_Machine_DirectivesAccess_12.getCodeFnendKeyword_1_0_12();
        if (Objects.equal(k, _codeFnendKeyword_1_0_12)) {
          _matched=true;
          StringConcatenation _builder_26 = new StringConcatenation();
          _builder_26.append("<i><b>Syntax:</b></i>");
          _builder_26.newLine();
          _builder_26.append("            ");
          _builder_26.append("<ul>.fnend</ul>");
          _switchResult = _builder_26.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_13 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeFnstartKeyword_1_0_13 = _aRM_Machine_DirectivesAccess_13.getCodeFnstartKeyword_1_0_13();
        if (Objects.equal(k, _codeFnstartKeyword_1_0_13)) {
          _matched=true;
          StringConcatenation _builder_27 = new StringConcatenation();
          _builder_27.append("<i><b>Syntax:</b></i>");
          _builder_27.newLine();
          _builder_27.append("            ");
          _builder_27.append("<ul>.fnstart</ul>");
          _switchResult = _builder_27.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_14 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeForce_thumbKeyword_1_0_14 = _aRM_Machine_DirectivesAccess_14.getCodeForce_thumbKeyword_1_0_14();
        if (Objects.equal(k, _codeForce_thumbKeyword_1_0_14)) {
          _matched=true;
          StringConcatenation _builder_28 = new StringConcatenation();
          _builder_28.append("<i><b>Syntax:</b></i>");
          _builder_28.newLine();
          _builder_28.append("            ");
          _builder_28.append("<ul>.force_thumb</ul>");
          _switchResult = _builder_28.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_15 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeFpuKeyword_1_0_15 = _aRM_Machine_DirectivesAccess_15.getCodeFpuKeyword_1_0_15();
        if (Objects.equal(k, _codeFpuKeyword_1_0_15)) {
          _matched=true;
          StringConcatenation _builder_29 = new StringConcatenation();
          _builder_29.append("<i><b>Syntax:</b></i>");
          _builder_29.newLine();
          _builder_29.append("            ");
          _builder_29.append("<ul>.fpu name</ul>");
          _switchResult = _builder_29.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_16 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeHandlerdataKeyword_1_0_16 = _aRM_Machine_DirectivesAccess_16.getCodeHandlerdataKeyword_1_0_16();
        if (Objects.equal(k, _codeHandlerdataKeyword_1_0_16)) {
          _matched=true;
          StringConcatenation _builder_30 = new StringConcatenation();
          _builder_30.append("<i><b>Syntax:</b></i>");
          _builder_30.newLine();
          _builder_30.append("            ");
          _builder_30.append("<ul>.handlerdata</ul>");
          _switchResult = _builder_30.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_17 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeLtorgKeyword_1_0_17 = _aRM_Machine_DirectivesAccess_17.getCodeLtorgKeyword_1_0_17();
        if (Objects.equal(k, _codeLtorgKeyword_1_0_17)) {
          _matched=true;
          StringConcatenation _builder_31 = new StringConcatenation();
          _builder_31.append("<i><b>Syntax:</b></i>");
          _builder_31.newLine();
          _builder_31.append("            ");
          _builder_31.append("<ul>.ldouble expression [, expression]*</ul>");
          _switchResult = _builder_31.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_18 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeMovspKeyword_1_0_18 = _aRM_Machine_DirectivesAccess_18.getCodeMovspKeyword_1_0_18();
        if (Objects.equal(k, _codeMovspKeyword_1_0_18)) {
          _matched=true;
          StringConcatenation _builder_32 = new StringConcatenation();
          _builder_32.append("<i><b>Syntax:</b></i>");
          _builder_32.newLine();
          _builder_32.append("            ");
          _builder_32.append("<ul>.movsp reg [, #offset]</ul>");
          _switchResult = _builder_32.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_19 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeObject_archKeyword_1_0_19 = _aRM_Machine_DirectivesAccess_19.getCodeObject_archKeyword_1_0_19();
        if (Objects.equal(k, _codeObject_archKeyword_1_0_19)) {
          _matched=true;
          StringConcatenation _builder_33 = new StringConcatenation();
          _builder_33.append("<i><b>Syntax:</b></i>");
          _builder_33.newLine();
          _builder_33.append("            ");
          _builder_33.append("<ul>.object_arch name</ul>");
          _switchResult = _builder_33.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_20 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codePackedKeyword_1_0_20 = _aRM_Machine_DirectivesAccess_20.getCodePackedKeyword_1_0_20();
        if (Objects.equal(k, _codePackedKeyword_1_0_20)) {
          _matched=true;
          StringConcatenation _builder_34 = new StringConcatenation();
          _builder_34.append("<i><b>Syntax:</b></i>");
          _builder_34.newLine();
          _builder_34.append("            ");
          _builder_34.append("<ul>.packed expression [, expression]*</ul>");
          _switchResult = _builder_34.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_21 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codePersonalityKeyword_1_0_21 = _aRM_Machine_DirectivesAccess_21.getCodePersonalityKeyword_1_0_21();
        if (Objects.equal(k, _codePersonalityKeyword_1_0_21)) {
          _matched=true;
          StringConcatenation _builder_35 = new StringConcatenation();
          _builder_35.append("<i><b>Syntax:</b></i>");
          _builder_35.newLine();
          _builder_35.append("            ");
          _builder_35.append("<ul>.personality name</ul>");
          _switchResult = _builder_35.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_22 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codePersonalityindexKeyword_1_0_22 = _aRM_Machine_DirectivesAccess_22.getCodePersonalityindexKeyword_1_0_22();
        if (Objects.equal(k, _codePersonalityindexKeyword_1_0_22)) {
          _matched=true;
          StringConcatenation _builder_36 = new StringConcatenation();
          _builder_36.append("<i><b>Syntax:</b></i>");
          _builder_36.newLine();
          _builder_36.append("            ");
          _builder_36.append("<ul>.personalityindex index</ul>");
          _switchResult = _builder_36.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_23 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codePoolKeyword_1_0_23 = _aRM_Machine_DirectivesAccess_23.getCodePoolKeyword_1_0_23();
        if (Objects.equal(k, _codePoolKeyword_1_0_23)) {
          _matched=true;
          StringConcatenation _builder_37 = new StringConcatenation();
          _builder_37.append("<i><b>Syntax:</b></i>");
          _builder_37.newLine();
          _builder_37.append("            ");
          _builder_37.append("<ul>.pool</ul>");
          _switchResult = _builder_37.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_24 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeSecrel32Keyword_1_0_24 = _aRM_Machine_DirectivesAccess_24.getCodeSecrel32Keyword_1_0_24();
        if (Objects.equal(k, _codeSecrel32Keyword_1_0_24)) {
          _matched=true;
          StringConcatenation _builder_38 = new StringConcatenation();
          _builder_38.append("<i><b>Syntax:</b></i>");
          _builder_38.newLine();
          _builder_38.append("            ");
          _builder_38.append("<ul>.secrel32 expression [, expression]*</ul>");
          _switchResult = _builder_38.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_25 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeThumbKeyword_1_0_25 = _aRM_Machine_DirectivesAccess_25.getCodeThumbKeyword_1_0_25();
        if (Objects.equal(k, _codeThumbKeyword_1_0_25)) {
          _matched=true;
          StringConcatenation _builder_39 = new StringConcatenation();
          _builder_39.append("<i><b>Syntax:</b></i>");
          _builder_39.newLine();
          _builder_39.append("            ");
          _builder_39.append("<ul>.thumb</ul>");
          _switchResult = _builder_39.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_26 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeThumb_funcKeyword_1_0_26 = _aRM_Machine_DirectivesAccess_26.getCodeThumb_funcKeyword_1_0_26();
        if (Objects.equal(k, _codeThumb_funcKeyword_1_0_26)) {
          _matched=true;
          StringConcatenation _builder_40 = new StringConcatenation();
          _builder_40.append("<i><b>Syntax:</b></i>");
          _builder_40.newLine();
          _builder_40.append("            ");
          _builder_40.append("<ul>.thumb_func</ul>");
          _switchResult = _builder_40.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_27 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeThumb_setKeyword_1_0_27 = _aRM_Machine_DirectivesAccess_27.getCodeThumb_setKeyword_1_0_27();
        if (Objects.equal(k, _codeThumb_setKeyword_1_0_27)) {
          _matched=true;
          StringConcatenation _builder_41 = new StringConcatenation();
          _builder_41.append("<i><b>Syntax:</b></i>");
          _builder_41.newLine();
          _builder_41.append("            ");
          _builder_41.append("<ul>.thumb_set</ul>");
          _switchResult = _builder_41.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_28 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeSpaceKeyword_1_0_28 = _aRM_Machine_DirectivesAccess_28.getCodeSpaceKeyword_1_0_28();
        if (Objects.equal(k, _codeSpaceKeyword_1_0_28)) {
          _matched=true;
          StringConcatenation _builder_42 = new StringConcatenation();
          _builder_42.append("<i><b>Syntax:</b></i>");
          _builder_42.newLine();
          _builder_42.append("            ");
          _builder_42.append("<ul>.space expression [, expression]*</ul>");
          _switchResult = _builder_42.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_DirectivesElements _aRM_Machine_DirectivesAccess_29 = this.ga.getARM_Machine_DirectivesAccess();
        Keyword _codeByteKeyword_1_0_29 = _aRM_Machine_DirectivesAccess_29.getCodeByteKeyword_1_0_29();
        if (Objects.equal(k, _codeByteKeyword_1_0_29)) {
          _matched=true;
          StringConcatenation _builder_43 = new StringConcatenation();
          _builder_43.append("<i><b>Syntax:</b></i>");
          _builder_43.newLine();
          _builder_43.append("            ");
          _builder_43.append("<ul>.byte expression [, expression]*</ul>");
          _switchResult = _builder_43.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_MACHINE_DIRECTIVES_alignElements _aRM_MACHINE_DIRECTIVES_alignAccess = this.ga.getARM_MACHINE_DIRECTIVES_alignAccess();
        Keyword _codeAlignKeyword_1_0 = _aRM_MACHINE_DIRECTIVES_alignAccess.getCodeAlignKeyword_1_0();
        if (Objects.equal(k, _codeAlignKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_44 = new StringConcatenation();
          _builder_44.append("<i><b>Syntax:</b></i>");
          _builder_44.newLine();
          _builder_44.append("            ");
          _builder_44.append("<ul>.align expression [, expression]</ul>");
          _switchResult = _builder_44.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_Directives_codeElements _aRM_Machine_Directives_codeAccess = this.ga.getARM_Machine_Directives_codeAccess();
        Keyword _codeCodeKeyword_1_0 = _aRM_Machine_Directives_codeAccess.getCodeCodeKeyword_1_0();
        if (Objects.equal(k, _codeCodeKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_45 = new StringConcatenation();
          _builder_45.append("<i><b>Syntax:</b></i>");
          _builder_45.newLine();
          _builder_45.append("            ");
          _builder_45.append("<ul>.code [16|32]</ul>");
          _switchResult = _builder_45.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_Directives_syntaxElements _aRM_Machine_Directives_syntaxAccess = this.ga.getARM_Machine_Directives_syntaxAccess();
        Keyword _codeSyntaxKeyword_1_0 = _aRM_Machine_Directives_syntaxAccess.getCodeSyntaxKeyword_1_0();
        if (Objects.equal(k, _codeSyntaxKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_46 = new StringConcatenation();
          _builder_46.append("<i><b>Syntax:</b></i>");
          _builder_46.newLine();
          _builder_46.append("            ");
          _builder_46.append("<ul>.syntax [unified | divided]</ul>");
          _switchResult = _builder_46.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ARM_Machine_Directives_saveElements _aRM_Machine_Directives_saveAccess = this.ga.getARM_Machine_Directives_saveAccess();
        Keyword _codeSaveKeyword_1_0 = _aRM_Machine_Directives_saveAccess.getCodeSaveKeyword_1_0();
        if (Objects.equal(k, _codeSaveKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_47 = new StringConcatenation();
          _builder_47.append("<i><b>Syntax:</b></i>");
          _builder_47.newLine();
          _builder_47.append("            ");
          _builder_47.append("<ul>.save reglist</ul>");
          _switchResult = _builder_47.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CExtendascizElements _cExtendascizAccess = this.ga.getCExtendascizAccess();
        Keyword _codeAscizKeyword_1_0 = _cExtendascizAccess.getCodeAscizKeyword_1_0();
        if (Objects.equal(k, _codeAscizKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_48 = new StringConcatenation();
          _builder_48.append("<u><b>Usage :</b></u>");
          _builder_48.newLine();
          _builder_48.append("<ul>");
          _builder_48.newLine();
          _builder_48.append("    ");
          _builder_48.append("<li>Assembler directives .asciz</li>");
          _builder_48.newLine();
          _builder_48.append("    ");
          _builder_48.append("<li>Declares C-String.</li>");
          _builder_48.newLine();
          _builder_48.append("</ul>");
          _builder_48.newLine();
          _builder_48.append("<i><b>Syntax:</b></i>");
          _builder_48.newLine();
          _builder_48.append("<ul>");
          _builder_48.newLine();
          _builder_48.append("    ");
          _builder_48.append(".asciz \"string\"");
          _builder_48.newLine();
          _builder_48.append("    ");
          _builder_48.append("<li>Declare ASCII C-String. (NULL-terminated)</li>");
          _builder_48.newLine();
          _builder_48.append("</ul>");
          _switchResult = _builder_48.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess = this.ga.getCLangAccess();
        Keyword _codeLoopKeyword_0_5 = _cLangAccess.getCodeLoopKeyword_0_5();
        if (Objects.equal(k, _codeLoopKeyword_0_5)) {
          _matched=true;
          StringConcatenation _builder_49 = new StringConcatenation();
          _builder_49.append("<u><b>Usage :</b></u>");
          _builder_49.newLine();
          _builder_49.append("<ul>");
          _builder_49.newLine();
          _builder_49.append("    ");
          _builder_49.append("<li>loop:</li>");
          _builder_49.newLine();
          _builder_49.append("    ");
          _builder_49.append("<li>Repeat blocks of codes.</li>");
          _builder_49.newLine();
          _builder_49.append("    ");
          _builder_49.append("<strong>Becareful with how you start and stop a loop.</strong>");
          _builder_49.newLine();
          _builder_49.append("</ul>");
          _builder_49.newLine();
          _builder_49.append("<i><b>Syntax:</b></i>");
          _builder_49.newLine();
          _builder_49.append("<ul>");
          _builder_49.newLine();
          _builder_49.append("    ");
          _builder_49.append("loop:");
          _builder_49.newLine();
          _builder_49.append("</ul>");
          _switchResult = _builder_49.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_1 = this.ga.getCLangAccess();
        Keyword _codeBreakKeyword_0_4 = _cLangAccess_1.getCodeBreakKeyword_0_4();
        if (Objects.equal(k, _codeBreakKeyword_0_4)) {
          _matched=true;
          StringConcatenation _builder_50 = new StringConcatenation();
          _builder_50.append("break is a c code.");
          _switchResult = _builder_50.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_2 = this.ga.getCLangAccess();
        Keyword _codeTitleKeyword_0_0 = _cLangAccess_2.getCodeTitleKeyword_0_0();
        if (Objects.equal(k, _codeTitleKeyword_0_0)) {
          _matched=true;
          StringConcatenation _builder_51 = new StringConcatenation();
          _builder_51.append("title is a c code.");
          _switchResult = _builder_51.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_3 = this.ga.getCLangAccess();
        Keyword _codePromptKeyword_0_1 = _cLangAccess_3.getCodePromptKeyword_0_1();
        if (Objects.equal(k, _codePromptKeyword_0_1)) {
          _matched=true;
          StringConcatenation _builder_52 = new StringConcatenation();
          _builder_52.append("prompt is a c code.");
          _switchResult = _builder_52.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_4 = this.ga.getCLangAccess();
        Keyword _codeContentKeyword_0_2 = _cLangAccess_4.getCodeContentKeyword_0_2();
        if (Objects.equal(k, _codeContentKeyword_0_2)) {
          _matched=true;
          StringConcatenation _builder_53 = new StringConcatenation();
          _builder_53.append("content is a c code.");
          _switchResult = _builder_53.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_5 = this.ga.getCLangAccess();
        Keyword _codeMain1Keyword_0_3 = _cLangAccess_5.getCodeMain1Keyword_0_3();
        if (Objects.equal(k, _codeMain1Keyword_0_3)) {
          _matched=true;
          StringConcatenation _builder_54 = new StringConcatenation();
          _builder_54.append("main is a c code.");
          _switchResult = _builder_54.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLangElements _cLangAccess_6 = this.ga.getCLangAccess();
        Keyword _codeExit_mainKeyword_0_6 = _cLangAccess_6.getCodeExit_mainKeyword_0_6();
        if (Objects.equal(k, _codeExit_mainKeyword_0_6)) {
          _matched=true;
          StringConcatenation _builder_55 = new StringConcatenation();
          _builder_55.append("<u><b>Usage :</b></u>");
          _builder_55.newLine();
          _builder_55.append("<ul>");
          _builder_55.newLine();
          _builder_55.append("    ");
          _builder_55.append("<li>exit_main</li>");
          _builder_55.newLine();
          _builder_55.append("    ");
          _builder_55.append("<li>Exit macro block before exit_main</li>");
          _builder_55.newLine();
          _builder_55.append("</ul>");
          _builder_55.newLine();
          _builder_55.append("<i><b>Syntax:</b></i>");
          _builder_55.newLine();
          _builder_55.append("<ul>");
          _builder_55.newLine();
          _builder_55.append("    ");
          _builder_55.append("exit_main");
          _builder_55.newLine();
          _builder_55.append("</ul>");
          _switchResult = _builder_55.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess = this.ga.getPREPROCESSORAccess();
        Keyword _codeIfKeyword_1_0_0 = _pREPROCESSORAccess.getCodeIfKeyword_1_0_0();
        if (Objects.equal(k, _codeIfKeyword_1_0_0)) {
          _matched=true;
          StringConcatenation _builder_56 = new StringConcatenation();
          _builder_56.append("<u><b>Usage :</b></u>");
          _builder_56.newLine();
          _builder_56.append("<ul>");
          _builder_56.newLine();
          _builder_56.append("    ");
          _builder_56.append("<li>Preprocessor directives #if</li>");
          _builder_56.newLine();
          _builder_56.append("    ");
          _builder_56.append("<li>Evaluates an expression for conditional compilation.</li>");
          _builder_56.newLine();
          _builder_56.append("</ul>");
          _builder_56.newLine();
          _builder_56.append("<i><b>Syntax:</b></i>");
          _builder_56.newLine();
          _builder_56.append("<ul>");
          _builder_56.newLine();
          _builder_56.append("\t");
          _builder_56.append("<br>#if expression</br>");
          _builder_56.newLine();
          _builder_56.append("\t");
          _builder_56.append(".");
          _builder_56.newLine();
          _builder_56.append("\t");
          _builder_56.append("<br>.</br>");
          _builder_56.newLine();
          _builder_56.append("\t");
          _builder_56.append(".");
          _builder_56.newLine();
          _builder_56.append("\t");
          _builder_56.append("<br>#endif </br> ");
          _builder_56.newLine();
          _builder_56.append("</ul>");
          _switchResult = _builder_56.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_1 = this.ga.getPREPROCESSORAccess();
        Keyword _codeElifKeyword_1_0_1 = _pREPROCESSORAccess_1.getCodeElifKeyword_1_0_1();
        if (Objects.equal(k, _codeElifKeyword_1_0_1)) {
          _matched=true;
          StringConcatenation _builder_57 = new StringConcatenation();
          _builder_57.append("<u><b>Usage :</b></u>");
          _builder_57.newLine();
          _builder_57.append("<ul>");
          _builder_57.newLine();
          _builder_57.append("    ");
          _builder_57.append("<li>Preprocessor directives #elif</li>");
          _builder_57.newLine();
          _builder_57.append("    ");
          _builder_57.append("<li>Initiates an alternative branch of the if condition, ");
          _builder_57.newLine();
          _builder_57.append("        ");
          _builder_57.append("when the previous #if, #ifdef, #ifndef, or #elif branch was not taken.</li>");
          _builder_57.newLine();
          _builder_57.append("</ul>");
          _builder_57.newLine();
          _builder_57.append("<i><b>Syntax:</b></i>");
          _builder_57.newLine();
          _builder_57.append("<ul>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("#if expression");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append(".");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("#elif expression");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append(".");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("#else");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append(".");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("<br>.</br>");
          _builder_57.newLine();
          _builder_57.append("\t");
          _builder_57.append("#endif ");
          _builder_57.newLine();
          _builder_57.append("</ul>");
          _switchResult = _builder_57.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_2 = this.ga.getPREPROCESSORAccess();
        Keyword _codeErrorKeyword_1_0_2 = _pREPROCESSORAccess_2.getCodeErrorKeyword_1_0_2();
        if (Objects.equal(k, _codeErrorKeyword_1_0_2)) {
          _matched=true;
          StringConcatenation _builder_58 = new StringConcatenation();
          _builder_58.append("<u><b>Usage :</b></u>");
          _builder_58.newLine();
          _builder_58.append("<ul>");
          _builder_58.newLine();
          _builder_58.append("    ");
          _builder_58.append("<li>Preprocessor directives #error</li>");
          _builder_58.newLine();
          _builder_58.append("    ");
          _builder_58.append("<li>Outputs an error message defined by the user.</li>");
          _builder_58.newLine();
          _builder_58.append("</ul>");
          _builder_58.newLine();
          _builder_58.append("<i><b>Syntax:</b></i>");
          _builder_58.newLine();
          _builder_58.append("<ul>#error \"message\"</ul>");
          _switchResult = _builder_58.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_3 = this.ga.getPREPROCESSORAccess();
        Keyword _codePragmaKeyword_1_0_3 = _pREPROCESSORAccess_3.getCodePragmaKeyword_1_0_3();
        if (Objects.equal(k, _codePragmaKeyword_1_0_3)) {
          _matched=true;
          StringConcatenation _builder_59 = new StringConcatenation();
          _builder_59.append("<u><b>Usage :</b></u>");
          _builder_59.newLine();
          _builder_59.append("<ul>");
          _builder_59.newLine();
          _builder_59.append("    ");
          _builder_59.append("<li>Preprocessor directives #pragma</li>");
          _builder_59.newLine();
          _builder_59.append("    ");
          _builder_59.append("<li>Allows you to specify directives that may be included on the compiler command line. </li>");
          _builder_59.newLine();
          _builder_59.append("    ");
          _builder_59.append("<li>Pragmas may contain the same directives that are specified on the command line.</li>");
          _builder_59.newLine();
          _builder_59.append("</ul>");
          _builder_59.newLine();
          _builder_59.append("<i><b>Syntax:</b></i>");
          _builder_59.newLine();
          _builder_59.append("<ul>#pragma directive</ul>");
          _switchResult = _builder_59.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_4 = this.ga.getPREPROCESSORAccess();
        Keyword _codeUndefKeyword_1_0_4 = _pREPROCESSORAccess_4.getCodeUndefKeyword_1_0_4();
        if (Objects.equal(k, _codeUndefKeyword_1_0_4)) {
          _matched=true;
          StringConcatenation _builder_60 = new StringConcatenation();
          _builder_60.append("<u><b>Usage :</b></u>");
          _builder_60.newLine();
          _builder_60.append("<ul>");
          _builder_60.newLine();
          _builder_60.append("    ");
          _builder_60.append("<li>Preprocessor directives #undef</li>");
          _builder_60.newLine();
          _builder_60.append("    ");
          _builder_60.append("<li>Deletes a preprocessor macro or constant definition.</li>");
          _builder_60.newLine();
          _builder_60.append("</ul>");
          _builder_60.newLine();
          _builder_60.append("<i><b>Syntax:</b></i>");
          _builder_60.newLine();
          _builder_60.append("<ul>#undef macro-name</ul>");
          _switchResult = _builder_60.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_5 = this.ga.getPREPROCESSORAccess();
        Keyword _codeIncludeKeyword_1_0_5 = _pREPROCESSORAccess_5.getCodeIncludeKeyword_1_0_5();
        if (Objects.equal(k, _codeIncludeKeyword_1_0_5)) {
          _matched=true;
          StringConcatenation _builder_61 = new StringConcatenation();
          _builder_61.append("<u><b>Usage :</b></u>");
          _builder_61.newLine();
          _builder_61.append("<ul>");
          _builder_61.newLine();
          _builder_61.append("    ");
          _builder_61.append("<li>Preprocessor directives #include</li>");
          _builder_61.newLine();
          _builder_61.append("    ");
          _builder_61.append("<li>Reads source text from an external file.</li>");
          _builder_61.newLine();
          _builder_61.append("</ul>");
          _builder_61.newLine();
          _builder_61.append("<i><b>Syntax:</b></i>");
          _builder_61.newLine();
          _builder_61.append("<ul>#include \"filename\"</ul>");
          _switchResult = _builder_61.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_6 = this.ga.getPREPROCESSORAccess();
        Keyword _codeIfdefKeyword_1_0_6 = _pREPROCESSORAccess_6.getCodeIfdefKeyword_1_0_6();
        if (Objects.equal(k, _codeIfdefKeyword_1_0_6)) {
          _matched=true;
          StringConcatenation _builder_62 = new StringConcatenation();
          _builder_62.append("<u><b>Usage :</b></u>");
          _builder_62.newLine();
          _builder_62.append("<ul>");
          _builder_62.newLine();
          _builder_62.append("    ");
          _builder_62.append("<li>Preprocessor directives #ifdef</li>");
          _builder_62.newLine();
          _builder_62.append("    ");
          _builder_62.append("<li>Evaluation succeeds if the definition is defined.</li>");
          _builder_62.newLine();
          _builder_62.append("</ul>");
          _builder_62.newLine();
          _builder_62.append("<i><b>Syntax:</b></i>");
          _builder_62.newLine();
          _builder_62.append("<ul>#ifdef name</ul>");
          _switchResult = _builder_62.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_7 = this.ga.getPREPROCESSORAccess();
        Keyword _codeIfndefKeyword_1_0_7 = _pREPROCESSORAccess_7.getCodeIfndefKeyword_1_0_7();
        if (Objects.equal(k, _codeIfndefKeyword_1_0_7)) {
          _matched=true;
          StringConcatenation _builder_63 = new StringConcatenation();
          _builder_63.append("<u><b>Usage :</b></u>");
          _builder_63.newLine();
          _builder_63.append("<ul>");
          _builder_63.newLine();
          _builder_63.append("    ");
          _builder_63.append("<li>Preprocessor directives #ifndef</li>");
          _builder_63.newLine();
          _builder_63.append("    ");
          _builder_63.append("<li>Same as #ifdef but the evaluation succeeds if the definition is <strong>not</strong> defined.</li>");
          _builder_63.newLine();
          _builder_63.append("</ul>");
          _builder_63.newLine();
          _builder_63.append("<i><b>Syntax:</b></i>");
          _builder_63.newLine();
          _builder_63.append("<ul>#ifndef name</ul>");
          _switchResult = _builder_63.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSORElements _pREPROCESSORAccess_8 = this.ga.getPREPROCESSORAccess();
        Keyword _codeLineKeyword_1_0_8 = _pREPROCESSORAccess_8.getCodeLineKeyword_1_0_8();
        if (Objects.equal(k, _codeLineKeyword_1_0_8)) {
          _matched=true;
          StringConcatenation _builder_64 = new StringConcatenation();
          _builder_64.append("<u><b>Usage :</b></u>");
          _builder_64.newLine();
          _builder_64.append("<ul>");
          _builder_64.newLine();
          _builder_64.append("    ");
          _builder_64.append("<li>Preprocessor directives #line</li>");
          _builder_64.newLine();
          _builder_64.append("    ");
          _builder_64.append("<li>Specifies a line number and an optional filename</li>");
          _builder_64.newLine();
          _builder_64.append("</ul>");
          _builder_64.newLine();
          _builder_64.append("<i><b>Syntax:</b></i>");
          _builder_64.newLine();
          _builder_64.append("<ul>#line line-number \"filename\"</ul>");
          _switchResult = _builder_64.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSOR_DEFINEElements _pREPROCESSOR_DEFINEAccess = this.ga.getPREPROCESSOR_DEFINEAccess();
        Keyword _codeDefineKeyword_1_0 = _pREPROCESSOR_DEFINEAccess.getCodeDefineKeyword_1_0();
        if (Objects.equal(k, _codeDefineKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_65 = new StringConcatenation();
          _builder_65.append("<u><b>Usage :</b></u>");
          _builder_65.newLine();
          _builder_65.append("<ul>");
          _builder_65.newLine();
          _builder_65.append("    ");
          _builder_65.append("<li>Preprocessor directives #define\t</li>");
          _builder_65.newLine();
          _builder_65.append("    ");
          _builder_65.append("<li>Defines a preprocessor macro or constant.</li>");
          _builder_65.newLine();
          _builder_65.append("</ul>");
          _builder_65.newLine();
          _builder_65.append("<i><b>Syntax:</b></i>");
          _builder_65.newLine();
          _builder_65.append("<ul>#define mycode </ul>");
          _switchResult = _builder_65.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSOR_ENDIFElements _pREPROCESSOR_ENDIFAccess = this.ga.getPREPROCESSOR_ENDIFAccess();
        Keyword _codeEndifKeyword_1_0 = _pREPROCESSOR_ENDIFAccess.getCodeEndifKeyword_1_0();
        if (Objects.equal(k, _codeEndifKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_66 = new StringConcatenation();
          _builder_66.append("<u><b>Usage :</b></u>");
          _builder_66.newLine();
          _builder_66.append("<ul>");
          _builder_66.newLine();
          _builder_66.append("    ");
          _builder_66.append("<li>Preprocessor directives #endif</li>");
          _builder_66.newLine();
          _builder_66.append("    ");
          _builder_66.append("<li>#endif\tEnds a #if, #ifdef, #ifndef, #elif, or #else block.</li>");
          _builder_66.newLine();
          _builder_66.append("</ul>");
          _builder_66.newLine();
          _builder_66.append("<i><b>Syntax:</b></i>");
          _builder_66.newLine();
          _builder_66.append("<ul>#if expression");
          _builder_66.newLine();
          _builder_66.append("<br>.</br>");
          _builder_66.newLine();
          _builder_66.append(".");
          _builder_66.newLine();
          _builder_66.append("<br>.</br>");
          _builder_66.newLine();
          _builder_66.append("#endif");
          _builder_66.newLine();
          _builder_66.append("</ul>");
          _switchResult = _builder_66.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PREPROCESSOR_ELSEElements _pREPROCESSOR_ELSEAccess = this.ga.getPREPROCESSOR_ELSEAccess();
        Keyword _codeElseKeyword_1_0 = _pREPROCESSOR_ELSEAccess.getCodeElseKeyword_1_0();
        if (Objects.equal(k, _codeElseKeyword_1_0)) {
          _matched=true;
          StringConcatenation _builder_67 = new StringConcatenation();
          _builder_67.append("<u><b>Usage :</b></u>");
          _builder_67.newLine();
          _builder_67.append("<ul>");
          _builder_67.newLine();
          _builder_67.append("    ");
          _builder_67.append("<li>Preprocessor directives #else</li>");
          _builder_67.newLine();
          _builder_67.append("    ");
          _builder_67.append("<li>Initiates an alternative branch ");
          _builder_67.newLine();
          _builder_67.append("        ");
          _builder_67.append("when the previous #if, #ifdef, or #ifndef branch was not taken.</li>");
          _builder_67.newLine();
          _builder_67.append("</ul>");
          _builder_67.newLine();
          _builder_67.append("<i><b>Syntax:</b></i>");
          _builder_67.newLine();
          _builder_67.append("<ul>");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("#if expression");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("<br>.</br>");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append(".");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("<br>.</br>");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("#else");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("<br>.</br>");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append(".");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("<br>.</br>");
          _builder_67.newLine();
          _builder_67.append("\t");
          _builder_67.append("#endif ");
          _builder_67.newLine();
          _builder_67.append("</ul>");
          _switchResult = _builder_67.toString();
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADD_OPElements _aDD_OPAccess = this.ga.getADD_OPAccess();
        Keyword _opAddKeyword_0_0 = _aDD_OPAccess.getOpAddKeyword_0_0();
        if (Objects.equal(k, _opAddKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ADD;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADC_OPElements _aDC_OPAccess = this.ga.getADC_OPAccess();
        Keyword _opAdcKeyword_0_0 = _aDC_OPAccess.getOpAdcKeyword_0_0();
        if (Objects.equal(k, _opAdcKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ADC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADR_OPElements _aDR_OPAccess = this.ga.getADR_OPAccess();
        Keyword _opAdrKeyword_0_0 = _aDR_OPAccess.getOpAdrKeyword_0_0();
        if (Objects.equal(k, _opAdrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ADR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SUB_OPElements _sUB_OPAccess = this.ga.getSUB_OPAccess();
        Keyword _opSubKeyword_0_0 = _sUB_OPAccess.getOpSubKeyword_0_0();
        if (Objects.equal(k, _opSubKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SUB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SBC_OPElements _sBC_OPAccess = this.ga.getSBC_OPAccess();
        Keyword _opSbcKeyword_0_0 = _sBC_OPAccess.getOpSbcKeyword_0_0();
        if (Objects.equal(k, _opSbcKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SBC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSB_OPElements _rSB_OPAccess = this.ga.getRSB_OPAccess();
        Keyword _opRsbKeyword_0_0 = _rSB_OPAccess.getOpRsbKeyword_0_0();
        if (Objects.equal(k, _opRsbKeyword_0_0)) {
          _matched=true;
          _switchResult = this.RSB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSC_OPElements _rSC_OPAccess = this.ga.getRSC_OPAccess();
        Keyword _opRscKeyword_0_0 = _rSC_OPAccess.getOpRscKeyword_0_0();
        if (Objects.equal(k, _opRscKeyword_0_0)) {
          _matched=true;
          _switchResult = this.RSC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADRL_OPElements _aDRL_OPAccess = this.ga.getADRL_OPAccess();
        Keyword _opAdrlKeyword_0_0 = _aDRL_OPAccess.getOpAdrlKeyword_0_0();
        if (Objects.equal(k, _opAdrlKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ADRL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADD_OPElements _aDD_OPAccess_1 = this.ga.getADD_OPAccess();
        Keyword _opADDKeyword_0_1 = _aDD_OPAccess_1.getOpADDKeyword_0_1();
        if (Objects.equal(k, _opADDKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ADD;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADC_OPElements _aDC_OPAccess_1 = this.ga.getADC_OPAccess();
        Keyword _opADCKeyword_0_1 = _aDC_OPAccess_1.getOpADCKeyword_0_1();
        if (Objects.equal(k, _opADCKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ADC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADR_OPElements _aDR_OPAccess_1 = this.ga.getADR_OPAccess();
        Keyword _opADRKeyword_0_1 = _aDR_OPAccess_1.getOpADRKeyword_0_1();
        if (Objects.equal(k, _opADRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ADR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SUB_OPElements _sUB_OPAccess_1 = this.ga.getSUB_OPAccess();
        Keyword _opSUBKeyword_0_1 = _sUB_OPAccess_1.getOpSUBKeyword_0_1();
        if (Objects.equal(k, _opSUBKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SUB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SBC_OPElements _sBC_OPAccess_1 = this.ga.getSBC_OPAccess();
        Keyword _opSBCKeyword_0_1 = _sBC_OPAccess_1.getOpSBCKeyword_0_1();
        if (Objects.equal(k, _opSBCKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SBC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSB_OPElements _rSB_OPAccess_1 = this.ga.getRSB_OPAccess();
        Keyword _opRSBKeyword_0_1 = _rSB_OPAccess_1.getOpRSBKeyword_0_1();
        if (Objects.equal(k, _opRSBKeyword_0_1)) {
          _matched=true;
          _switchResult = this.RSB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RSC_OPElements _rSC_OPAccess_1 = this.ga.getRSC_OPAccess();
        Keyword _opRSCKeyword_0_1 = _rSC_OPAccess_1.getOpRSCKeyword_0_1();
        if (Objects.equal(k, _opRSCKeyword_0_1)) {
          _matched=true;
          _switchResult = this.RSC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ADRL_OPElements _aDRL_OPAccess_1 = this.ga.getADRL_OPAccess();
        Keyword _opADRLKeyword_0_1 = _aDRL_OPAccess_1.getOpADRLKeyword_0_1();
        if (Objects.equal(k, _opADRLKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ADRL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MUL_OPElements _mUL_OPAccess = this.ga.getMUL_OPAccess();
        Keyword _opMulKeyword_0_0 = _mUL_OPAccess.getOpMulKeyword_0_0();
        if (Objects.equal(k, _opMulKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MUL_OPElements _mUL_OPAccess_1 = this.ga.getMUL_OPAccess();
        Keyword _opMULKeyword_0_1 = _mUL_OPAccess_1.getOpMULKeyword_0_1();
        if (Objects.equal(k, _opMULKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLS_OPElements _mLS_OPAccess = this.ga.getMLS_OPAccess();
        Keyword _opMlsKeyword_0_0 = _mLS_OPAccess.getOpMlsKeyword_0_0();
        if (Objects.equal(k, _opMlsKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MLS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLS_OPElements _mLS_OPAccess_1 = this.ga.getMLS_OPAccess();
        Keyword _opMLSKeyword_0_1 = _mLS_OPAccess_1.getOpMLSKeyword_0_1();
        if (Objects.equal(k, _opMLSKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MLS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLA_OPElements _mLA_OPAccess = this.ga.getMLA_OPAccess();
        Keyword _opMlaKeyword_0_0 = _mLA_OPAccess.getOpMlaKeyword_0_0();
        if (Objects.equal(k, _opMlaKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMULL_OPElements _uMULL_OPAccess = this.ga.getUMULL_OPAccess();
        Keyword _opUmullKeyword_0_0 = _uMULL_OPAccess.getOpUmullKeyword_0_0();
        if (Objects.equal(k, _opUmullKeyword_0_0)) {
          _matched=true;
          _switchResult = this.UMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMLAL_OPElements _uMLAL_OPAccess = this.ga.getUMLAL_OPAccess();
        Keyword _opUmlalKeyword_0_0 = _uMLAL_OPAccess.getOpUmlalKeyword_0_0();
        if (Objects.equal(k, _opUmlalKeyword_0_0)) {
          _matched=true;
          _switchResult = this.UMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULL_OPElements _sMULL_OPAccess = this.ga.getSMULL_OPAccess();
        Keyword _opSmullKeyword_0_0 = _sMULL_OPAccess.getOpSmullKeyword_0_0();
        if (Objects.equal(k, _opSmullKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAL_OPElements _sMLAL_OPAccess = this.ga.getSMLAL_OPAccess();
        Keyword _opSmlalKeyword_0_0 = _sMLAL_OPAccess.getOpSmlalKeyword_0_0();
        if (Objects.equal(k, _opSmlalKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MLA_OPElements _mLA_OPAccess_1 = this.ga.getMLA_OPAccess();
        Keyword _opMLAKeyword_0_1 = _mLA_OPAccess_1.getOpMLAKeyword_0_1();
        if (Objects.equal(k, _opMLAKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMULL_OPElements _uMULL_OPAccess_1 = this.ga.getUMULL_OPAccess();
        Keyword _opUMULLKeyword_0_1 = _uMULL_OPAccess_1.getOpUMULLKeyword_0_1();
        if (Objects.equal(k, _opUMULLKeyword_0_1)) {
          _matched=true;
          _switchResult = this.UMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.UMLAL_OPElements _uMLAL_OPAccess_1 = this.ga.getUMLAL_OPAccess();
        Keyword _opUMLALKeyword_0_1 = _uMLAL_OPAccess_1.getOpUMLALKeyword_0_1();
        if (Objects.equal(k, _opUMLALKeyword_0_1)) {
          _matched=true;
          _switchResult = this.UMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULL_OPElements _sMULL_OPAccess_1 = this.ga.getSMULL_OPAccess();
        Keyword _opSMULLKeyword_0_1 = _sMULL_OPAccess_1.getOpSMULLKeyword_0_1();
        if (Objects.equal(k, _opSMULLKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMULL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAL_OPElements _sMLAL_OPAccess_1 = this.ga.getSMLAL_OPAccess();
        Keyword _opSMLALKeyword_0_1 = _sMLAL_OPAccess_1.getOpSMLALKeyword_0_1();
        if (Objects.equal(k, _opSMLALKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMLAL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMUL_OPElements _sMUL_OPAccess = this.ga.getSMUL_OPAccess();
        Keyword _opSmulKeyword_0_0 = _sMUL_OPAccess.getOpSmulKeyword_0_0();
        if (Objects.equal(k, _opSmulKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULW_OPElements _sMULW_OPAccess = this.ga.getSMULW_OPAccess();
        Keyword _opSmulwKeyword_0_0 = _sMULW_OPAccess.getOpSmulwKeyword_0_0();
        if (Objects.equal(k, _opSmulwKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMULW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMUL_OPElements _sMUL_OPAccess_1 = this.ga.getSMUL_OPAccess();
        Keyword _opSMULKeyword_0_1 = _sMUL_OPAccess_1.getOpSMULKeyword_0_1();
        if (Objects.equal(k, _opSMULKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMUL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMULW_OPElements _sMULW_OPAccess_1 = this.ga.getSMULW_OPAccess();
        Keyword _opSMULWKeyword_0_1 = _sMULW_OPAccess_1.getOpSMULWKeyword_0_1();
        if (Objects.equal(k, _opSMULWKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMULW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLA_OPElements _sMLA_OPAccess = this.ga.getSMLA_OPAccess();
        Keyword _opSmlaKeyword_0_0 = _sMLA_OPAccess.getOpSmlaKeyword_0_0();
        if (Objects.equal(k, _opSmlaKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAW_OPElements _sMLAW_OPAccess = this.ga.getSMLAW_OPAccess();
        Keyword _opSmlawKeyword_0_0 = _sMLAW_OPAccess.getOpSmlawKeyword_0_0();
        if (Objects.equal(k, _opSmlawKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SMLAW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLA_OPElements _sMLA_OPAccess_1 = this.ga.getSMLA_OPAccess();
        Keyword _opSMLAKeyword_0_1 = _sMLA_OPAccess_1.getOpSMLAKeyword_0_1();
        if (Objects.equal(k, _opSMLAKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMLA;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SMLAW_OPElements _sMLAW_OPAccess_1 = this.ga.getSMLAW_OPAccess();
        Keyword _opSMLAWKeyword_0_1 = _sMLAW_OPAccess_1.getOpSMLAWKeyword_0_1();
        if (Objects.equal(k, _opSMLAWKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SMLAW;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MOV_OPElements _mOV_OPAccess = this.ga.getMOV_OPAccess();
        Keyword _opMovKeyword_0_0 = _mOV_OPAccess.getOpMovKeyword_0_0();
        if (Objects.equal(k, _opMovKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MOV;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MVN_OPElements _mVN_OPAccess = this.ga.getMVN_OPAccess();
        Keyword _opMvnKeyword_0_0 = _mVN_OPAccess.getOpMvnKeyword_0_0();
        if (Objects.equal(k, _opMvnKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MVN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MOV_OPElements _mOV_OPAccess_1 = this.ga.getMOV_OPAccess();
        Keyword _opMOVKeyword_0_1 = _mOV_OPAccess_1.getOpMOVKeyword_0_1();
        if (Objects.equal(k, _opMOVKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MOV;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MVN_OPElements _mVN_OPAccess_1 = this.ga.getMVN_OPAccess();
        Keyword _opMVNKeyword_0_1 = _mVN_OPAccess_1.getOpMVNKeyword_0_1();
        if (Objects.equal(k, _opMVNKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MVN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ASR_OPElements _aSR_OPAccess = this.ga.getASR_OPAccess();
        Keyword _opAsrKeyword_0_0 = _aSR_OPAccess.getOpAsrKeyword_0_0();
        if (Objects.equal(k, _opAsrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ASR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSL_OPElements _lSL_OPAccess = this.ga.getLSL_OPAccess();
        Keyword _opLslKeyword_0_0 = _lSL_OPAccess.getOpLslKeyword_0_0();
        if (Objects.equal(k, _opLslKeyword_0_0)) {
          _matched=true;
          _switchResult = this.LSL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSR_OPElements _lSR_OPAccess = this.ga.getLSR_OPAccess();
        Keyword _opLsrKeyword_0_0 = _lSR_OPAccess.getOpLsrKeyword_0_0();
        if (Objects.equal(k, _opLsrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.LSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ROR_OPElements _rOR_OPAccess = this.ga.getROR_OPAccess();
        Keyword _opRorKeyword_0_0 = _rOR_OPAccess.getOpRorKeyword_0_0();
        if (Objects.equal(k, _opRorKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ROR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RRX_OPElements _rRX_OPAccess = this.ga.getRRX_OPAccess();
        Keyword _opRrxKeyword_0_0 = _rRX_OPAccess.getOpRrxKeyword_0_0();
        if (Objects.equal(k, _opRrxKeyword_0_0)) {
          _matched=true;
          _switchResult = this.RRX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ASR_OPElements _aSR_OPAccess_1 = this.ga.getASR_OPAccess();
        Keyword _opASRKeyword_0_1 = _aSR_OPAccess_1.getOpASRKeyword_0_1();
        if (Objects.equal(k, _opASRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ASR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSL_OPElements _lSL_OPAccess_1 = this.ga.getLSL_OPAccess();
        Keyword _opLSLKeyword_0_1 = _lSL_OPAccess_1.getOpLSLKeyword_0_1();
        if (Objects.equal(k, _opLSLKeyword_0_1)) {
          _matched=true;
          _switchResult = this.LSL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LSR_OPElements _lSR_OPAccess_1 = this.ga.getLSR_OPAccess();
        Keyword _opLSRKeyword_0_1 = _lSR_OPAccess_1.getOpLSRKeyword_0_1();
        if (Objects.equal(k, _opLSRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.LSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ROR_OPElements _rOR_OPAccess_1 = this.ga.getROR_OPAccess();
        Keyword _opRORKeyword_0_1 = _rOR_OPAccess_1.getOpRORKeyword_0_1();
        if (Objects.equal(k, _opRORKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ROR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.RRX_OPElements _rRX_OPAccess_1 = this.ga.getRRX_OPAccess();
        Keyword _opRRXKeyword_0_1 = _rRX_OPAccess_1.getOpRRXKeyword_0_1();
        if (Objects.equal(k, _opRRXKeyword_0_1)) {
          _matched=true;
          _switchResult = this.RRX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLZ_OPElements _cLZ_OPAccess = this.ga.getCLZ_OPAccess();
        Keyword _opClzKeyword_0_0 = _cLZ_OPAccess.getOpClzKeyword_0_0();
        if (Objects.equal(k, _opClzKeyword_0_0)) {
          _matched=true;
          _switchResult = this.CLZ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CLZ_OPElements _cLZ_OPAccess_1 = this.ga.getCLZ_OPAccess();
        Keyword _opCLZKeyword_0_1 = _cLZ_OPAccess_1.getOpCLZKeyword_0_1();
        if (Objects.equal(k, _opCLZKeyword_0_1)) {
          _matched=true;
          _switchResult = this.CLZ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMP_OPElements _cMP_OPAccess = this.ga.getCMP_OPAccess();
        Keyword _opCmpKeyword_0_0 = _cMP_OPAccess.getOpCmpKeyword_0_0();
        if (Objects.equal(k, _opCmpKeyword_0_0)) {
          _matched=true;
          _switchResult = this.CMP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMN_OPElements _cMN_OPAccess = this.ga.getCMN_OPAccess();
        Keyword _opCmnKeyword_0_0 = _cMN_OPAccess.getOpCmnKeyword_0_0();
        if (Objects.equal(k, _opCmnKeyword_0_0)) {
          _matched=true;
          _switchResult = this.CMN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TST_OPElements _tST_OPAccess = this.ga.getTST_OPAccess();
        Keyword _opTstKeyword_0_0 = _tST_OPAccess.getOpTstKeyword_0_0();
        if (Objects.equal(k, _opTstKeyword_0_0)) {
          _matched=true;
          _switchResult = this.TST;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TEQ_OPElements _tEQ_OPAccess = this.ga.getTEQ_OPAccess();
        Keyword _opTeqKeyword_0_0 = _tEQ_OPAccess.getOpTeqKeyword_0_0();
        if (Objects.equal(k, _opTeqKeyword_0_0)) {
          _matched=true;
          _switchResult = this.TEQ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMP_OPElements _cMP_OPAccess_1 = this.ga.getCMP_OPAccess();
        Keyword _opCMPKeyword_0_1 = _cMP_OPAccess_1.getOpCMPKeyword_0_1();
        if (Objects.equal(k, _opCMPKeyword_0_1)) {
          _matched=true;
          _switchResult = this.CMP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.CMN_OPElements _cMN_OPAccess_1 = this.ga.getCMN_OPAccess();
        Keyword _opCMNKeyword_0_1 = _cMN_OPAccess_1.getOpCMNKeyword_0_1();
        if (Objects.equal(k, _opCMNKeyword_0_1)) {
          _matched=true;
          _switchResult = this.CMN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TST_OPElements _tST_OPAccess_1 = this.ga.getTST_OPAccess();
        Keyword _opTSTKeyword_0_1 = _tST_OPAccess_1.getOpTSTKeyword_0_1();
        if (Objects.equal(k, _opTSTKeyword_0_1)) {
          _matched=true;
          _switchResult = this.TST;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.TEQ_OPElements _tEQ_OPAccess_1 = this.ga.getTEQ_OPAccess();
        Keyword _opTEQKeyword_0_1 = _tEQ_OPAccess_1.getOpTEQKeyword_0_1();
        if (Objects.equal(k, _opTEQKeyword_0_1)) {
          _matched=true;
          _switchResult = this.TEQ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.AND_OPElements _aND_OPAccess = this.ga.getAND_OPAccess();
        Keyword _opAndKeyword_0_0 = _aND_OPAccess.getOpAndKeyword_0_0();
        if (Objects.equal(k, _opAndKeyword_0_0)) {
          _matched=true;
          _switchResult = this.AND;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.EOR_OPElements _eOR_OPAccess = this.ga.getEOR_OPAccess();
        Keyword _opEorKeyword_0_0 = _eOR_OPAccess.getOpEorKeyword_0_0();
        if (Objects.equal(k, _opEorKeyword_0_0)) {
          _matched=true;
          _switchResult = this.EOR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORR_OPElements _oRR_OPAccess = this.ga.getORR_OPAccess();
        Keyword _opOrrKeyword_0_0 = _oRR_OPAccess.getOpOrrKeyword_0_0();
        if (Objects.equal(k, _opOrrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ORR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORN_OPElements _oRN_OPAccess = this.ga.getORN_OPAccess();
        Keyword _opOrnKeyword_0_0 = _oRN_OPAccess.getOpOrnKeyword_0_0();
        if (Objects.equal(k, _opOrnKeyword_0_0)) {
          _matched=true;
          _switchResult = this.ORN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BIC_OPElements _bIC_OPAccess = this.ga.getBIC_OPAccess();
        Keyword _opBicKeyword_0_0 = _bIC_OPAccess.getOpBicKeyword_0_0();
        if (Objects.equal(k, _opBicKeyword_0_0)) {
          _matched=true;
          _switchResult = this.BIC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.AND_OPElements _aND_OPAccess_1 = this.ga.getAND_OPAccess();
        Keyword _opANDKeyword_0_1 = _aND_OPAccess_1.getOpANDKeyword_0_1();
        if (Objects.equal(k, _opANDKeyword_0_1)) {
          _matched=true;
          _switchResult = this.AND;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.EOR_OPElements _eOR_OPAccess_1 = this.ga.getEOR_OPAccess();
        Keyword _opEORKeyword_0_1 = _eOR_OPAccess_1.getOpEORKeyword_0_1();
        if (Objects.equal(k, _opEORKeyword_0_1)) {
          _matched=true;
          _switchResult = this.EOR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORR_OPElements _oRR_OPAccess_1 = this.ga.getORR_OPAccess();
        Keyword _opORRKeyword_0_1 = _oRR_OPAccess_1.getOpORRKeyword_0_1();
        if (Objects.equal(k, _opORRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ORR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.ORN_OPElements _oRN_OPAccess_1 = this.ga.getORN_OPAccess();
        Keyword _opORNKeyword_0_1 = _oRN_OPAccess_1.getOpORNKeyword_0_1();
        if (Objects.equal(k, _opORNKeyword_0_1)) {
          _matched=true;
          _switchResult = this.ORN;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BIC_OPElements _bIC_OPAccess_1 = this.ga.getBIC_OPAccess();
        Keyword _opBICKeyword_0_1 = _bIC_OPAccess_1.getOpBICKeyword_0_1();
        if (Objects.equal(k, _opBICKeyword_0_1)) {
          _matched=true;
          _switchResult = this.BIC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.B_OPElements _b_OPAccess = this.ga.getB_OPAccess();
        Keyword _opBKeyword_0_0 = _b_OPAccess.getOpBKeyword_0_0();
        if (Objects.equal(k, _opBKeyword_0_0)) {
          _matched=true;
          _switchResult = this.B;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BL_OPElements _bL_OPAccess = this.ga.getBL_OPAccess();
        Keyword _opBlKeyword_0_0 = _bL_OPAccess.getOpBlKeyword_0_0();
        if (Objects.equal(k, _opBlKeyword_0_0)) {
          _matched=true;
          _switchResult = this.BL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BX_OPElements _bX_OPAccess = this.ga.getBX_OPAccess();
        Keyword _opBxKeyword_0_0 = _bX_OPAccess.getOpBxKeyword_0_0();
        if (Objects.equal(k, _opBxKeyword_0_0)) {
          _matched=true;
          _switchResult = this.BX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BLX_OPElements _bLX_OPAccess = this.ga.getBLX_OPAccess();
        Keyword _opBlxKeyword_0_0 = _bLX_OPAccess.getOpBlxKeyword_0_0();
        if (Objects.equal(k, _opBlxKeyword_0_0)) {
          _matched=true;
          _switchResult = this.BLX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BXJ_OPElements _bXJ_OPAccess = this.ga.getBXJ_OPAccess();
        Keyword _opBxjKeyword_0_0 = _bXJ_OPAccess.getOpBxjKeyword_0_0();
        if (Objects.equal(k, _opBxjKeyword_0_0)) {
          _matched=true;
          _switchResult = this.BXJ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.B_OPElements _b_OPAccess_1 = this.ga.getB_OPAccess();
        Keyword _opBKeyword_0_1 = _b_OPAccess_1.getOpBKeyword_0_1();
        if (Objects.equal(k, _opBKeyword_0_1)) {
          _matched=true;
          _switchResult = this.B;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BL_OPElements _bL_OPAccess_1 = this.ga.getBL_OPAccess();
        Keyword _opBLKeyword_0_1 = _bL_OPAccess_1.getOpBLKeyword_0_1();
        if (Objects.equal(k, _opBLKeyword_0_1)) {
          _matched=true;
          _switchResult = this.BL;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BX_OPElements _bX_OPAccess_1 = this.ga.getBX_OPAccess();
        Keyword _opBXKeyword_0_1 = _bX_OPAccess_1.getOpBXKeyword_0_1();
        if (Objects.equal(k, _opBXKeyword_0_1)) {
          _matched=true;
          _switchResult = this.BX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BLX_OPElements _bLX_OPAccess_1 = this.ga.getBLX_OPAccess();
        Keyword _opBLXKeyword_0_1 = _bLX_OPAccess_1.getOpBLXKeyword_0_1();
        if (Objects.equal(k, _opBLXKeyword_0_1)) {
          _matched=true;
          _switchResult = this.BLX;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BXJ_OPElements _bXJ_OPAccess_1 = this.ga.getBXJ_OPAccess();
        Keyword _opBXJKeyword_0_1 = _bXJ_OPAccess_1.getOpBXJKeyword_0_1();
        if (Objects.equal(k, _opBXJKeyword_0_1)) {
          _matched=true;
          _switchResult = this.BXJ;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MRS_OPElements _mRS_OPAccess = this.ga.getMRS_OPAccess();
        Keyword _opMrsKeyword_0_0 = _mRS_OPAccess.getOpMrsKeyword_0_0();
        if (Objects.equal(k, _opMrsKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MRS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MRS_OPElements _mRS_OPAccess_1 = this.ga.getMRS_OPAccess();
        Keyword _opMRSKeyword_0_1 = _mRS_OPAccess_1.getOpMRSKeyword_0_1();
        if (Objects.equal(k, _opMRSKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MRS;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MSR_OPElements _mSR_OPAccess = this.ga.getMSR_OPAccess();
        Keyword _opMsrKeyword_0_0 = _mSR_OPAccess.getOpMsrKeyword_0_0();
        if (Objects.equal(k, _opMsrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.MSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.MSR_OPElements _mSR_OPAccess_1 = this.ga.getMSR_OPAccess();
        Keyword _opMSRKeyword_0_1 = _mSR_OPAccess_1.getOpMSRKeyword_0_1();
        if (Objects.equal(k, _opMSRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.MSR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDR_OPElements _lDR_OPAccess = this.ga.getLDR_OPAccess();
        Keyword _opLdrKeyword_0_0 = _lDR_OPAccess.getOpLdrKeyword_0_0();
        if (Objects.equal(k, _opLdrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.LDR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STR_OPElements _sTR_OPAccess = this.ga.getSTR_OPAccess();
        Keyword _opStrKeyword_0_0 = _sTR_OPAccess.getOpStrKeyword_0_0();
        if (Objects.equal(k, _opStrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.STR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDR_OPElements _lDR_OPAccess_1 = this.ga.getLDR_OPAccess();
        Keyword _opLDRKeyword_0_1 = _lDR_OPAccess_1.getOpLDRKeyword_0_1();
        if (Objects.equal(k, _opLDRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.LDR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STR_OPElements _sTR_OPAccess_1 = this.ga.getSTR_OPAccess();
        Keyword _opSTRKeyword_0_1 = _sTR_OPAccess_1.getOpSTRKeyword_0_1();
        if (Objects.equal(k, _opSTRKeyword_0_1)) {
          _matched=true;
          _switchResult = this.STR;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDM_OPElements _lDM_OPAccess = this.ga.getLDM_OPAccess();
        Keyword _opLdmKeyword_0_0 = _lDM_OPAccess.getOpLdmKeyword_0_0();
        if (Objects.equal(k, _opLdmKeyword_0_0)) {
          _matched=true;
          _switchResult = this.LDM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STM_OPElements _sTM_OPAccess = this.ga.getSTM_OPAccess();
        Keyword _opStmKeyword_0_0 = _sTM_OPAccess.getOpStmKeyword_0_0();
        if (Objects.equal(k, _opStmKeyword_0_0)) {
          _matched=true;
          _switchResult = this.STM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.LDM_OPElements _lDM_OPAccess_1 = this.ga.getLDM_OPAccess();
        Keyword _opLDMKeyword_0_1 = _lDM_OPAccess_1.getOpLDMKeyword_0_1();
        if (Objects.equal(k, _opLDMKeyword_0_1)) {
          _matched=true;
          _switchResult = this.LDM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.STM_OPElements _sTM_OPAccess_1 = this.ga.getSTM_OPAccess();
        Keyword _opSTMKeyword_0_1 = _sTM_OPAccess_1.getOpSTMKeyword_0_1();
        if (Objects.equal(k, _opSTMKeyword_0_1)) {
          _matched=true;
          _switchResult = this.STM;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PUSH_OPElements _pUSH_OPAccess = this.ga.getPUSH_OPAccess();
        Keyword _opPushKeyword_0_0 = _pUSH_OPAccess.getOpPushKeyword_0_0();
        if (Objects.equal(k, _opPushKeyword_0_0)) {
          _matched=true;
          _switchResult = this.PUSH;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.POP_OPElements _pOP_OPAccess = this.ga.getPOP_OPAccess();
        Keyword _opPopKeyword_0_0 = _pOP_OPAccess.getOpPopKeyword_0_0();
        if (Objects.equal(k, _opPopKeyword_0_0)) {
          _matched=true;
          _switchResult = this.POP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.PUSH_OPElements _pUSH_OPAccess_1 = this.ga.getPUSH_OPAccess();
        Keyword _opPUSHKeyword_0_1 = _pUSH_OPAccess_1.getOpPUSHKeyword_0_1();
        if (Objects.equal(k, _opPUSHKeyword_0_1)) {
          _matched=true;
          _switchResult = this.PUSH;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.POP_OPElements _pOP_OPAccess_1 = this.ga.getPOP_OPAccess();
        Keyword _opPOPKeyword_0_1 = _pOP_OPAccess_1.getOpPOPKeyword_0_1();
        if (Objects.equal(k, _opPOPKeyword_0_1)) {
          _matched=true;
          _switchResult = this.POP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWP_OPElements _sWP_OPAccess = this.ga.getSWP_OPAccess();
        Keyword _opSwpKeyword_0_0 = _sWP_OPAccess.getOpSwpKeyword_0_0();
        if (Objects.equal(k, _opSwpKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SWP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWPB_OPElements _sWPB_OPAccess = this.ga.getSWPB_OPAccess();
        Keyword _opSwpbKeyword_0_0 = _sWPB_OPAccess.getOpSwpbKeyword_0_0();
        if (Objects.equal(k, _opSwpbKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SWPB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWP_OPElements _sWP_OPAccess_1 = this.ga.getSWP_OPAccess();
        Keyword _opSWPKeyword_0_1 = _sWP_OPAccess_1.getOpSWPKeyword_0_1();
        if (Objects.equal(k, _opSWPKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SWP;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SWPB_OPElements _sWPB_OPAccess_1 = this.ga.getSWPB_OPAccess();
        Keyword _opSWPBKeyword_0_1 = _sWPB_OPAccess_1.getOpSWPBKeyword_0_1();
        if (Objects.equal(k, _opSWPBKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SWPB;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SVC_OPElements _sVC_OPAccess = this.ga.getSVC_OPAccess();
        Keyword _opSvcKeyword_0_0 = _sVC_OPAccess.getOpSvcKeyword_0_0();
        if (Objects.equal(k, _opSvcKeyword_0_0)) {
          _matched=true;
          _switchResult = this.SVC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.SVC_OPElements _sVC_OPAccess_1 = this.ga.getSVC_OPAccess();
        Keyword _opSVCKeyword_0_1 = _sVC_OPAccess_1.getOpSVCKeyword_0_1();
        if (Objects.equal(k, _opSVCKeyword_0_1)) {
          _matched=true;
          _switchResult = this.SVC;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess = this.ga.getREGISTERAccess();
        Keyword _r0R0Keyword_0_0 = _rEGISTERAccess.getR0R0Keyword_0_0();
        if (Objects.equal(k, _r0R0Keyword_0_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_1 = this.ga.getREGISTERAccess();
        Keyword _r1R1Keyword_1_0 = _rEGISTERAccess_1.getR1R1Keyword_1_0();
        if (Objects.equal(k, _r1R1Keyword_1_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_2 = this.ga.getREGISTERAccess();
        Keyword _r2R2Keyword_2_0 = _rEGISTERAccess_2.getR2R2Keyword_2_0();
        if (Objects.equal(k, _r2R2Keyword_2_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_3 = this.ga.getREGISTERAccess();
        Keyword _r3R3Keyword_3_0 = _rEGISTERAccess_3.getR3R3Keyword_3_0();
        if (Objects.equal(k, _r3R3Keyword_3_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_4 = this.ga.getREGISTERAccess();
        Keyword _r4R4Keyword_4_0 = _rEGISTERAccess_4.getR4R4Keyword_4_0();
        if (Objects.equal(k, _r4R4Keyword_4_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_5 = this.ga.getREGISTERAccess();
        Keyword _r5R5Keyword_5_0 = _rEGISTERAccess_5.getR5R5Keyword_5_0();
        if (Objects.equal(k, _r5R5Keyword_5_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_6 = this.ga.getREGISTERAccess();
        Keyword _r6R6Keyword_6_0 = _rEGISTERAccess_6.getR6R6Keyword_6_0();
        if (Objects.equal(k, _r6R6Keyword_6_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_7 = this.ga.getREGISTERAccess();
        Keyword _r7R7Keyword_7_0 = _rEGISTERAccess_7.getR7R7Keyword_7_0();
        if (Objects.equal(k, _r7R7Keyword_7_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_8 = this.ga.getREGISTERAccess();
        Keyword _r8R8Keyword_8_0 = _rEGISTERAccess_8.getR8R8Keyword_8_0();
        if (Objects.equal(k, _r8R8Keyword_8_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_9 = this.ga.getREGISTERAccess();
        Keyword _r9R9Keyword_9_0 = _rEGISTERAccess_9.getR9R9Keyword_9_0();
        if (Objects.equal(k, _r9R9Keyword_9_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_10 = this.ga.getREGISTERAccess();
        Keyword _r10R10Keyword_10_0 = _rEGISTERAccess_10.getR10R10Keyword_10_0();
        if (Objects.equal(k, _r10R10Keyword_10_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_11 = this.ga.getREGISTERAccess();
        Keyword _r11R11Keyword_11_0 = _rEGISTERAccess_11.getR11R11Keyword_11_0();
        if (Objects.equal(k, _r11R11Keyword_11_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_12 = this.ga.getREGISTERAccess();
        Keyword _r12R12Keyword_12_0 = _rEGISTERAccess_12.getR12R12Keyword_12_0();
        if (Objects.equal(k, _r12R12Keyword_12_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_13 = this.ga.getREGISTERAccess();
        Keyword _r13R13Keyword_13_0 = _rEGISTERAccess_13.getR13R13Keyword_13_0();
        if (Objects.equal(k, _r13R13Keyword_13_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_14 = this.ga.getREGISTERAccess();
        Keyword _r14R14Keyword_14_0 = _rEGISTERAccess_14.getR14R14Keyword_14_0();
        if (Objects.equal(k, _r14R14Keyword_14_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_15 = this.ga.getREGISTERAccess();
        Keyword _r15R15Keyword_15_0 = _rEGISTERAccess_15.getR15R15Keyword_15_0();
        if (Objects.equal(k, _r15R15Keyword_15_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_16 = this.ga.getREGISTERAccess();
        Keyword _rfpFpKeyword_16_0 = _rEGISTERAccess_16.getRfpFpKeyword_16_0();
        if (Objects.equal(k, _rfpFpKeyword_16_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_17 = this.ga.getREGISTERAccess();
        Keyword _ripIpKeyword_17_0 = _rEGISTERAccess_17.getRipIpKeyword_17_0();
        if (Objects.equal(k, _ripIpKeyword_17_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_18 = this.ga.getREGISTERAccess();
        Keyword _rspSpKeyword_18_0 = _rEGISTERAccess_18.getRspSpKeyword_18_0();
        if (Objects.equal(k, _rspSpKeyword_18_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_19 = this.ga.getREGISTERAccess();
        Keyword _rlrLrKeyword_19_0 = _rEGISTERAccess_19.getRlrLrKeyword_19_0();
        if (Objects.equal(k, _rlrLrKeyword_19_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_20 = this.ga.getREGISTERAccess();
        Keyword _rpcPcKeyword_20_0 = _rEGISTERAccess_20.getRpcPcKeyword_20_0();
        if (Objects.equal(k, _rpcPcKeyword_20_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_21 = this.ga.getREGISTERAccess();
        Keyword _r001R0Keyword_21_0 = _rEGISTERAccess_21.getR001R0Keyword_21_0();
        if (Objects.equal(k, _r001R0Keyword_21_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_22 = this.ga.getREGISTERAccess();
        Keyword _r01R1Keyword_22_0 = _rEGISTERAccess_22.getR01R1Keyword_22_0();
        if (Objects.equal(k, _r01R1Keyword_22_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_23 = this.ga.getREGISTERAccess();
        Keyword _r02R2Keyword_23_0 = _rEGISTERAccess_23.getR02R2Keyword_23_0();
        if (Objects.equal(k, _r02R2Keyword_23_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_24 = this.ga.getREGISTERAccess();
        Keyword _r03R3Keyword_24_0 = _rEGISTERAccess_24.getR03R3Keyword_24_0();
        if (Objects.equal(k, _r03R3Keyword_24_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_25 = this.ga.getREGISTERAccess();
        Keyword _r04R4Keyword_25_0 = _rEGISTERAccess_25.getR04R4Keyword_25_0();
        if (Objects.equal(k, _r04R4Keyword_25_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_26 = this.ga.getREGISTERAccess();
        Keyword _r05R5Keyword_26_0 = _rEGISTERAccess_26.getR05R5Keyword_26_0();
        if (Objects.equal(k, _r05R5Keyword_26_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_27 = this.ga.getREGISTERAccess();
        Keyword _r06R6Keyword_27_0 = _rEGISTERAccess_27.getR06R6Keyword_27_0();
        if (Objects.equal(k, _r06R6Keyword_27_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_28 = this.ga.getREGISTERAccess();
        Keyword _r07R7Keyword_28_0 = _rEGISTERAccess_28.getR07R7Keyword_28_0();
        if (Objects.equal(k, _r07R7Keyword_28_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_29 = this.ga.getREGISTERAccess();
        Keyword _r08R8Keyword_29_0 = _rEGISTERAccess_29.getR08R8Keyword_29_0();
        if (Objects.equal(k, _r08R8Keyword_29_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_30 = this.ga.getREGISTERAccess();
        Keyword _r09R9Keyword_30_0 = _rEGISTERAccess_30.getR09R9Keyword_30_0();
        if (Objects.equal(k, _r09R9Keyword_30_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_31 = this.ga.getREGISTERAccess();
        Keyword _r010R10Keyword_31_0 = _rEGISTERAccess_31.getR010R10Keyword_31_0();
        if (Objects.equal(k, _r010R10Keyword_31_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_32 = this.ga.getREGISTERAccess();
        Keyword _r011R11Keyword_32_0 = _rEGISTERAccess_32.getR011R11Keyword_32_0();
        if (Objects.equal(k, _r011R11Keyword_32_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_33 = this.ga.getREGISTERAccess();
        Keyword _r012R12Keyword_33_0 = _rEGISTERAccess_33.getR012R12Keyword_33_0();
        if (Objects.equal(k, _r012R12Keyword_33_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_34 = this.ga.getREGISTERAccess();
        Keyword _r013R13Keyword_34_0 = _rEGISTERAccess_34.getR013R13Keyword_34_0();
        if (Objects.equal(k, _r013R13Keyword_34_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_35 = this.ga.getREGISTERAccess();
        Keyword _r014R14Keyword_35_0 = _rEGISTERAccess_35.getR014R14Keyword_35_0();
        if (Objects.equal(k, _r014R14Keyword_35_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_36 = this.ga.getREGISTERAccess();
        Keyword _r015R15Keyword_36_0 = _rEGISTERAccess_36.getR015R15Keyword_36_0();
        if (Objects.equal(k, _r015R15Keyword_36_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_37 = this.ga.getREGISTERAccess();
        Keyword _r0FPFPKeyword_37_0 = _rEGISTERAccess_37.getR0FPFPKeyword_37_0();
        if (Objects.equal(k, _r0FPFPKeyword_37_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_38 = this.ga.getREGISTERAccess();
        Keyword _r0IPIPKeyword_38_0 = _rEGISTERAccess_38.getR0IPIPKeyword_38_0();
        if (Objects.equal(k, _r0IPIPKeyword_38_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_39 = this.ga.getREGISTERAccess();
        Keyword _r0SPSPKeyword_39_0 = _rEGISTERAccess_39.getR0SPSPKeyword_39_0();
        if (Objects.equal(k, _r0SPSPKeyword_39_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_40 = this.ga.getREGISTERAccess();
        Keyword _r0LRLRKeyword_40_0 = _rEGISTERAccess_40.getR0LRLRKeyword_40_0();
        if (Objects.equal(k, _r0LRLRKeyword_40_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.REGISTERElements _rEGISTERAccess_41 = this.ga.getREGISTERAccess();
        Keyword _r0PCPCKeyword_41_0 = _rEGISTERAccess_41.getR0PCPCKeyword_41_0();
        if (Objects.equal(k, _r0PCPCKeyword_41_0)) {
          _matched=true;
          _switchResult = this.registerResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERAsrKeyword_0_0 = _bAREL_SHIFT_REGISTERAccess.getBAREL_SHIFT_REGISTERAsrKeyword_0_0();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERAsrKeyword_0_0)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_1 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERLslKeyword_0_1 = _bAREL_SHIFT_REGISTERAccess_1.getBAREL_SHIFT_REGISTERLslKeyword_0_1();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERLslKeyword_0_1)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_2 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERLsrKeyword_0_2 = _bAREL_SHIFT_REGISTERAccess_2.getBAREL_SHIFT_REGISTERLsrKeyword_0_2();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERLsrKeyword_0_2)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_3 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERRorKeyword_0_3 = _bAREL_SHIFT_REGISTERAccess_3.getBAREL_SHIFT_REGISTERRorKeyword_0_3();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERRorKeyword_0_3)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_4 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERASRKeyword_0_4 = _bAREL_SHIFT_REGISTERAccess_4.getBAREL_SHIFT_REGISTERASRKeyword_0_4();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERASRKeyword_0_4)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_5 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERLSLKeyword_0_5 = _bAREL_SHIFT_REGISTERAccess_5.getBAREL_SHIFT_REGISTERLSLKeyword_0_5();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERLSLKeyword_0_5)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_6 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERLSRKeyword_0_6 = _bAREL_SHIFT_REGISTERAccess_6.getBAREL_SHIFT_REGISTERLSRKeyword_0_6();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERLSRKeyword_0_6)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      if (!_matched) {
        ARMGrammarAccess.BAREL_SHIFT_REGISTERElements _bAREL_SHIFT_REGISTERAccess_7 = this.ga.getBAREL_SHIFT_REGISTERAccess();
        Keyword _bAREL_SHIFT_REGISTERRORKeyword_0_7 = _bAREL_SHIFT_REGISTERAccess_7.getBAREL_SHIFT_REGISTERRORKeyword_0_7();
        if (Objects.equal(k, _bAREL_SHIFT_REGISTERRORKeyword_0_7)) {
          _matched=true;
          _switchResult = this.barelShiftRegisterResult;
        }
      }
      final String result = _switchResult;
      _xblockexpression = result.toString();
    }
    return _xblockexpression;
  }
}
