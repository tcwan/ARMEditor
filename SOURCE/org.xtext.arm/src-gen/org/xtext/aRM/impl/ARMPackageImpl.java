/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.aRM.ARMFactory;
import org.xtext.aRM.ARMInstr;
import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align;
import org.xtext.aRM.ARM_Machine_Directives;
import org.xtext.aRM.ARM_Machine_Directives_code;
import org.xtext.aRM.ARM_Machine_Directives_save;
import org.xtext.aRM.ARM_Machine_Directives_syntax;
import org.xtext.aRM.Assember_Directives_type;
import org.xtext.aRM.Assembler_Directives;
import org.xtext.aRM.Assembler_Directives_endm;
import org.xtext.aRM.Assembler_Directives_equ;
import org.xtext.aRM.Assembler_Directives_macro;
import org.xtext.aRM.B_OP;
import org.xtext.aRM.CExtendCode;
import org.xtext.aRM.CExtendasciz;
import org.xtext.aRM.CLang;
import org.xtext.aRM.Ccode;
import org.xtext.aRM.Model;
import org.xtext.aRM.Operand2;
import org.xtext.aRM.OperationInstr;
import org.xtext.aRM.add_sub_instr;
import org.xtext.aRM.adrl_adr_instr;
import org.xtext.aRM.bkpt_instr;
import org.xtext.aRM.branch_instr;
import org.xtext.aRM.clz_instr;
import org.xtext.aRM.compare_test_instr;
import org.xtext.aRM.definition;
import org.xtext.aRM.description;
import org.xtext.aRM.flexible_offset;
import org.xtext.aRM.immediate_label;
import org.xtext.aRM.label_keyword;
import org.xtext.aRM.ldm_instr;
import org.xtext.aRM.ldr_str_irpre_instr;
import org.xtext.aRM.ldr_str_irpsot_instr;
import org.xtext.aRM.ldr_str_rpost_instr;
import org.xtext.aRM.ldr_str_spre_instr;
import org.xtext.aRM.literal_numeric;
import org.xtext.aRM.logical_instr;
import org.xtext.aRM.mov_instr;
import org.xtext.aRM.mrs_instr;
import org.xtext.aRM.msr_instr;
import org.xtext.aRM.mul_3R_instr;
import org.xtext.aRM.mul_4R_instr;
import org.xtext.aRM.numeric_backward_forward;
import org.xtext.aRM.opsh;
import org.xtext.aRM.push_pop_instr;
import org.xtext.aRM.randomEntry;
import org.xtext.aRM.rs_sh;
import org.xtext.aRM.shift_instr;
import org.xtext.aRM.svc_instr;
import org.xtext.aRM.swp_instr;
import org.xtext.aRM.variable;
import org.xtext.aRM.variable_colon;
import org.xtext.aRM.variable_variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ARMPackageImpl extends EPackageImpl implements ARMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armInstrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationInstrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ccodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_colonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass label_keywordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass add_sub_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adrl_adr_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mul_3R_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mul_4R_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mov_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shift_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clz_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compare_test_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branch_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mrs_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass msr_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldr_str_irpre_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldr_str_spre_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldr_str_irpsot_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldr_str_rpost_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldm_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass push_pop_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bkpt_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swp_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass svc_instrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adD_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suB_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sbC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rsB_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rsC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adrL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass muL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mlS_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mlA_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass umulL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass umlaL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smulL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smlaL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smuL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smulW_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smlA_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smlaW_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moV_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mvN_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lsL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lsR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rrX_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clZ_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmP_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmN_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tsT_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass teQ_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anD_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eoR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orN_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass biC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass b_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bX_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blX_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bxJ_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mrS_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass msR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stR_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldM_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stM_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pusH_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass poP_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swP_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swpB_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass svC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass psR_FIELD_EEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apsR_FLAG_EEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preprocessorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preprocessoR_DEFINEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preprocessoR_ENDIFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preprocessoR_ELSEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cExtendCodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembler_Directives_equEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembler_DirectivesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembler_Directives_macroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assember_Directives_typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assembler_Directives_endmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arM_Machine_DirectivesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arM_MACHINE_DIRECTIVES_alignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arM_Machine_Directives_codeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arM_Machine_Directives_syntaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arM_Machine_Directives_saveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cExtendascizEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cLangEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass registerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bareL_SHIFT_REGISTEREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operand2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opshEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass immediate_labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass randomEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rs_shEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flexible_offsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literal_numericEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeric_backward_forwardEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.aRM.ARMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ARMPackageImpl()
  {
    super(eNS_URI, ARMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ARMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ARMPackage init()
  {
    if (isInited) return (ARMPackage)EPackage.Registry.INSTANCE.getEPackage(ARMPackage.eNS_URI);

    // Obtain or create and register package
    ARMPackageImpl theARMPackage = (ARMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ARMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ARMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theARMPackage.createPackageContents();

    // Initialize created meta-data
    theARMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theARMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ARMPackage.eNS_URI, theARMPackage);
    return theARMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARMInstr()
  {
    return armInstrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationInstr()
  {
    return operationInstrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCcode()
  {
    return ccodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCcode_Label_keyword()
  {
    return (EReference)ccodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_variable()
  {
    return variable_variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_variable_Variable()
  {
    return (EReference)variable_variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvariable_variable_Variable2()
  {
    return (EReference)variable_variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable_colon()
  {
    return variable_colonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_colon_Variable()
  {
    return (EAttribute)variable_colonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_colon_VariableINT()
  {
    return (EAttribute)variable_colonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel_keyword()
  {
    return label_keywordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabel_keyword_Label()
  {
    return (EAttribute)label_keywordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabel_keyword_Variable()
  {
    return (EReference)label_keywordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabel_keyword_Register()
  {
    return (EReference)label_keywordEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlabel_keyword_Variable2()
  {
    return (EReference)label_keywordEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadd_sub_instr()
  {
    return add_sub_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadd_sub_instr_Register()
  {
    return (EReference)add_sub_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getadd_sub_instr_Operand2()
  {
    return (EReference)add_sub_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getadd_sub_instr_Op()
  {
    return (EAttribute)add_sub_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadrl_adr_instr()
  {
    return adrl_adr_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmul_3R_instr()
  {
    return mul_3R_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmul_3R_instr_Register()
  {
    return (EReference)mul_3R_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmul_3R_instr_Op()
  {
    return (EAttribute)mul_3R_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmul_4R_instr()
  {
    return mul_4R_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmul_4R_instr_Register()
  {
    return (EReference)mul_4R_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmul_4R_instr_Op()
  {
    return (EAttribute)mul_4R_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmov_instr()
  {
    return mov_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmov_instr_Register()
  {
    return (EReference)mov_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmov_instr_Operand2()
  {
    return (EReference)mov_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmov_instr_Op()
  {
    return (EAttribute)mov_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getshift_instr()
  {
    return shift_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getshift_instr_Register()
  {
    return (EReference)shift_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getshift_instr_Rs_sh()
  {
    return (EReference)shift_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getshift_instr_Op()
  {
    return (EAttribute)shift_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclz_instr()
  {
    return clz_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcompare_test_instr()
  {
    return compare_test_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompare_test_instr_Register()
  {
    return (EReference)compare_test_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcompare_test_instr_Operand2()
  {
    return (EReference)compare_test_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcompare_test_instr_Op()
  {
    return (EAttribute)compare_test_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlogical_instr()
  {
    return logical_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_instr_Register()
  {
    return (EReference)logical_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlogical_instr_Operand2()
  {
    return (EReference)logical_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlogical_instr_Op()
  {
    return (EAttribute)logical_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbranch_instr()
  {
    return branch_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbranch_instr_Immediate_label()
  {
    return (EReference)branch_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbranch_instr_Register()
  {
    return (EReference)branch_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getbranch_instr_Op()
  {
    return (EAttribute)branch_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmrs_instr()
  {
    return mrs_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmsr_instr()
  {
    return msr_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldr_str_irpre_instr()
  {
    return ldr_str_irpre_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldr_str_spre_instr()
  {
    return ldr_str_spre_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldr_str_irpsot_instr()
  {
    return ldr_str_irpsot_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldr_str_rpost_instr()
  {
    return ldr_str_rpost_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldm_instr()
  {
    return ldm_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getldm_instr_Register()
  {
    return (EReference)ldm_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldm_instr_Op()
  {
    return (EAttribute)ldm_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpush_pop_instr()
  {
    return push_pop_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpush_pop_instr_Register()
  {
    return (EReference)push_pop_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpush_pop_instr_Op()
  {
    return (EAttribute)push_pop_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbkpt_instr()
  {
    return bkpt_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getbkpt_instr_Immediate_label()
  {
    return (EReference)bkpt_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getswp_instr()
  {
    return swp_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getswp_instr_Register()
  {
    return (EReference)swp_instrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getswp_instr_Immediate_label()
  {
    return (EReference)swp_instrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getswp_instr_Op()
  {
    return (EAttribute)swp_instrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsvc_instr()
  {
    return svc_instrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADD_OP()
  {
    return adD_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADC_OP()
  {
    return adC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADR_OP()
  {
    return adR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getADR_OP_Expression()
  {
    return (EReference)adR_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSUB_OP()
  {
    return suB_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSBC_OP()
  {
    return sbC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRSB_OP()
  {
    return rsB_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRSC_OP()
  {
    return rsC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADRL_OP()
  {
    return adrL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getADRL_OP_Expression()
  {
    return (EReference)adrL_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMUL_OP()
  {
    return muL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMLS_OP()
  {
    return mlS_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMLA_OP()
  {
    return mlA_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUMULL_OP()
  {
    return umulL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUMLAL_OP()
  {
    return umlaL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMULL_OP()
  {
    return smulL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMLAL_OP()
  {
    return smlaL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMUL_OP()
  {
    return smuL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMULW_OP()
  {
    return smulW_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMLA_OP()
  {
    return smlA_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMLAW_OP()
  {
    return smlaW_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOV_OP()
  {
    return moV_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMVN_OP()
  {
    return mvN_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getASR_OP()
  {
    return asR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLSL_OP()
  {
    return lsL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLSR_OP()
  {
    return lsR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getROR_OP()
  {
    return roR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRRX_OP()
  {
    return rrX_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLZ_OP()
  {
    return clZ_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLZ_OP_Register()
  {
    return (EReference)clZ_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCLZ_OP_Op()
  {
    return (EAttribute)clZ_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCMP_OP()
  {
    return cmP_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCMN_OP()
  {
    return cmN_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTST_OP()
  {
    return tsT_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTEQ_OP()
  {
    return teQ_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAND_OP()
  {
    return anD_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEOR_OP()
  {
    return eoR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getORR_OP()
  {
    return orR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getORN_OP()
  {
    return orN_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBIC_OP()
  {
    return biC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getB_OP()
  {
    return b_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBL_OP()
  {
    return bL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBX_OP()
  {
    return bX_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBLX_OP()
  {
    return blX_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBXJ_OP()
  {
    return bxJ_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMRS_OP()
  {
    return mrS_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMRS_OP_Register()
  {
    return (EReference)mrS_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMRS_OP_PSR_FIELD()
  {
    return (EReference)mrS_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMRS_OP_Op()
  {
    return (EAttribute)mrS_OPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMSR_OP()
  {
    return msR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSR_OP_APSR_FLAG()
  {
    return (EReference)msR_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSR_OP_PSR_FIELD()
  {
    return (EReference)msR_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSR_OP_Register()
  {
    return (EReference)msR_OPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMSR_OP_Immediate_label()
  {
    return (EReference)msR_OPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMSR_OP_Op()
  {
    return (EAttribute)msR_OPEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDR_OP()
  {
    return ldR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDR_OP_Register()
  {
    return (EReference)ldR_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDR_OP_Immediate_label()
  {
    return (EReference)ldR_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDR_OP_BAREL_SHIFT_REGISTER()
  {
    return (EReference)ldR_OPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDR_OP_Op()
  {
    return (EAttribute)ldR_OPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTR_OP()
  {
    return stR_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTR_OP_Register()
  {
    return (EReference)stR_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTR_OP_Immediate_label()
  {
    return (EReference)stR_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTR_OP_BAREL_SHIFT_REGISTER()
  {
    return (EReference)stR_OPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTR_OP_Op()
  {
    return (EAttribute)stR_OPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDM_OP()
  {
    return ldM_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTM_OP()
  {
    return stM_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPUSH_OP()
  {
    return pusH_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPOP_OP()
  {
    return poP_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSWP_OP()
  {
    return swP_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSWPB_OP()
  {
    return swpB_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSVC_OP()
  {
    return svC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVC_OP_Immediate_label()
  {
    return (EReference)svC_OPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSVC_OP_Op()
  {
    return (EAttribute)svC_OPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPSR_FIELD_E()
  {
    return psR_FIELD_EEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPSR_FIELD_E_Op()
  {
    return (EAttribute)psR_FIELD_EEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAPSR_FLAG_E()
  {
    return apsR_FLAG_EEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAPSR_FLAG_E_Op()
  {
    return (EAttribute)apsR_FLAG_EEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNOP()
  {
    return nopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNOP_Op()
  {
    return (EAttribute)nopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREPROCESSOR()
  {
    return preprocessorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPREPROCESSOR_Expression()
  {
    return (EReference)preprocessorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPREPROCESSOR_Expression2()
  {
    return (EReference)preprocessorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_Hash()
  {
    return (EAttribute)preprocessorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_Code()
  {
    return (EAttribute)preprocessorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREPROCESSOR_DEFINE()
  {
    return preprocessoR_DEFINEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPREPROCESSOR_DEFINE_Expression()
  {
    return (EReference)preprocessoR_DEFINEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPREPROCESSOR_DEFINE_Expression2()
  {
    return (EReference)preprocessoR_DEFINEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_DEFINE_Hash()
  {
    return (EAttribute)preprocessoR_DEFINEEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_DEFINE_Code()
  {
    return (EAttribute)preprocessoR_DEFINEEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREPROCESSOR_ENDIF()
  {
    return preprocessoR_ENDIFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_ENDIF_Hash()
  {
    return (EAttribute)preprocessoR_ENDIFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_ENDIF_Code()
  {
    return (EAttribute)preprocessoR_ENDIFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPREPROCESSOR_ELSE()
  {
    return preprocessoR_ELSEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_ELSE_Hash()
  {
    return (EAttribute)preprocessoR_ELSEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPREPROCESSOR_ELSE_Code()
  {
    return (EAttribute)preprocessoR_ELSEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCExtendCode()
  {
    return cExtendCodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCExtendCode_Expression()
  {
    return (EReference)cExtendCodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCExtendCode_Expression2()
  {
    return (EReference)cExtendCodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCExtendCode_Dot()
  {
    return (EAttribute)cExtendCodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCExtendCode_Code()
  {
    return (EAttribute)cExtendCodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembler_Directives_equ()
  {
    return assembler_Directives_equEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_equ_Expression()
  {
    return (EReference)assembler_Directives_equEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_equ_Expression2()
  {
    return (EReference)assembler_Directives_equEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_equ_Dot()
  {
    return (EAttribute)assembler_Directives_equEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_equ_Code()
  {
    return (EAttribute)assembler_Directives_equEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembler_Directives()
  {
    return assembler_DirectivesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_Expression()
  {
    return (EReference)assembler_DirectivesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_Expression2()
  {
    return (EReference)assembler_DirectivesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_Dot()
  {
    return (EAttribute)assembler_DirectivesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_Code()
  {
    return (EAttribute)assembler_DirectivesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembler_Directives_macro()
  {
    return assembler_Directives_macroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_macro_Expression()
  {
    return (EReference)assembler_Directives_macroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssembler_Directives_macro_Definition()
  {
    return (EReference)assembler_Directives_macroEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_macro_Dot()
  {
    return (EAttribute)assembler_Directives_macroEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_macro_Code()
  {
    return (EAttribute)assembler_Directives_macroEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssember_Directives_type()
  {
    return assember_Directives_typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssember_Directives_type_Expression()
  {
    return (EReference)assember_Directives_typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssember_Directives_type_Description()
  {
    return (EReference)assember_Directives_typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssember_Directives_type_Dot()
  {
    return (EAttribute)assember_Directives_typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssember_Directives_type_Code()
  {
    return (EAttribute)assember_Directives_typeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssembler_Directives_endm()
  {
    return assembler_Directives_endmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_endm_Dot()
  {
    return (EAttribute)assembler_Directives_endmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssembler_Directives_endm_Code()
  {
    return (EAttribute)assembler_Directives_endmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARM_Machine_Directives()
  {
    return arM_Machine_DirectivesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getARM_Machine_Directives_Expression()
  {
    return (EReference)arM_Machine_DirectivesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getARM_Machine_Directives_Expression2()
  {
    return (EReference)arM_Machine_DirectivesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_Dot()
  {
    return (EAttribute)arM_Machine_DirectivesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_Code()
  {
    return (EAttribute)arM_Machine_DirectivesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARM_MACHINE_DIRECTIVES_align()
  {
    return arM_MACHINE_DIRECTIVES_alignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_MACHINE_DIRECTIVES_align_Int()
  {
    return (EAttribute)arM_MACHINE_DIRECTIVES_alignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_MACHINE_DIRECTIVES_align_Hex()
  {
    return (EAttribute)arM_MACHINE_DIRECTIVES_alignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_MACHINE_DIRECTIVES_align_Dot()
  {
    return (EAttribute)arM_MACHINE_DIRECTIVES_alignEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_MACHINE_DIRECTIVES_align_Code()
  {
    return (EAttribute)arM_MACHINE_DIRECTIVES_alignEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARM_Machine_Directives_code()
  {
    return arM_Machine_Directives_codeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_code_Arm()
  {
    return (EAttribute)arM_Machine_Directives_codeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_code_Thumb()
  {
    return (EAttribute)arM_Machine_Directives_codeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_code_Dot()
  {
    return (EAttribute)arM_Machine_Directives_codeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_code_Code()
  {
    return (EAttribute)arM_Machine_Directives_codeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARM_Machine_Directives_syntax()
  {
    return arM_Machine_Directives_syntaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_syntax_Dot()
  {
    return (EAttribute)arM_Machine_Directives_syntaxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_syntax_Code()
  {
    return (EAttribute)arM_Machine_Directives_syntaxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARM_Machine_Directives_save()
  {
    return arM_Machine_Directives_saveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_save_Reglist()
  {
    return (EAttribute)arM_Machine_Directives_saveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_save_ReglistNum()
  {
    return (EAttribute)arM_Machine_Directives_saveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getARM_Machine_Directives_save_Register()
  {
    return (EReference)arM_Machine_Directives_saveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_save_Dot()
  {
    return (EAttribute)arM_Machine_Directives_saveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getARM_Machine_Directives_save_Code()
  {
    return (EAttribute)arM_Machine_Directives_saveEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCExtendasciz()
  {
    return cExtendascizEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCExtendasciz_Expression()
  {
    return (EReference)cExtendascizEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCExtendasciz_Dot()
  {
    return (EAttribute)cExtendascizEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCExtendasciz_Code()
  {
    return (EAttribute)cExtendascizEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLang()
  {
    return cLangEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLang_Expression()
  {
    return (EReference)cLangEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCLang_Code()
  {
    return (EAttribute)cLangEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREGISTER()
  {
    return registerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R1()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R2()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R3()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R4()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R5()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R6()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R7()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R8()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R9()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R10()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R11()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R12()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R13()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R14()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R15()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_Rfp()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_Rip()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_Rsp()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_Rlr()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_Rpc()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R001()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R01()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R02()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R03()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R04()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R05()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R06()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R07()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R08()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R09()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R010()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R011()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R012()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R013()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R014()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R015()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0FP()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0IP()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0SP()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0LR()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREGISTER_R0PC()
  {
    return (EAttribute)registerEClass.getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getREGISTER_Opsh()
  {
    return (EReference)registerEClass.getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBAREL_SHIFT_REGISTER()
  {
    return bareL_SHIFT_REGISTEREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBAREL_SHIFT_REGISTER_BAREL_SHIFT_REGISTER()
  {
    return (EAttribute)bareL_SHIFT_REGISTEREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBAREL_SHIFT_REGISTER_Register()
  {
    return (EReference)bareL_SHIFT_REGISTEREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperand2()
  {
    return operand2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getopsh()
  {
    return opshEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getimmediate_label()
  {
    return immediate_labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getimmediate_label_Literal_numeric()
  {
    return (EReference)immediate_labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getimmediate_label_Numeric_backward_forward()
  {
    return (EReference)immediate_labelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimmediate_label_Label()
  {
    return (EAttribute)immediate_labelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimmediate_label_Num2()
  {
    return (EAttribute)immediate_labelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimmediate_label_Label2()
  {
    return (EAttribute)immediate_labelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getimmediate_label_Num()
  {
    return (EAttribute)immediate_labelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdescription_Int()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdescription_String()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdescription_Description()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_VariableInt()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_VariableABC()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_VariableString()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvariable_VariableHex()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_VariableInt()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_VariableABC()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_VariableString()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_VariableHex()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_DefInt()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_DefABC()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_DefString()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdefinition_DefHex()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrandomEntry()
  {
    return randomEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrandomEntry_EntryInt()
  {
    return (EAttribute)randomEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrandomEntry_EntryABC()
  {
    return (EAttribute)randomEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrandomEntry_EntryString()
  {
    return (EAttribute)randomEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrandomEntry_EntryHex()
  {
    return (EAttribute)randomEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrs_sh()
  {
    return rs_shEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrs_sh_Immediate_label()
  {
    return (EReference)rs_shEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getflexible_offset()
  {
    return flexible_offsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getflexible_offset_Expr()
  {
    return (EAttribute)flexible_offsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getflexible_offset_Expr2()
  {
    return (EAttribute)flexible_offsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getflexible_offset_Register()
  {
    return (EReference)flexible_offsetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getflexible_offset_BAREL_SHIFT_REGISTER()
  {
    return (EReference)flexible_offsetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getflexible_offset_Immediate_label()
  {
    return (EReference)flexible_offsetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getflexible_offset_Num()
  {
    return (EAttribute)flexible_offsetEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getliteral_numeric()
  {
    return literal_numericEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_numeric_Hex()
  {
    return (EAttribute)literal_numericEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getliteral_numeric_Int()
  {
    return (EAttribute)literal_numericEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnumeric_backward_forward()
  {
    return numeric_backward_forwardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumeric_backward_forward_Hex()
  {
    return (EAttribute)numeric_backward_forwardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumeric_backward_forward_Int()
  {
    return (EAttribute)numeric_backward_forwardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMFactory getARMFactory()
  {
    return (ARMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    armInstrEClass = createEClass(ARM_INSTR);

    operationInstrEClass = createEClass(OPERATION_INSTR);

    ccodeEClass = createEClass(CCODE);
    createEReference(ccodeEClass, CCODE__LABEL_KEYWORD);

    variable_variableEClass = createEClass(VARIABLE_VARIABLE);
    createEReference(variable_variableEClass, VARIABLE_VARIABLE__VARIABLE);
    createEReference(variable_variableEClass, VARIABLE_VARIABLE__VARIABLE2);

    variable_colonEClass = createEClass(VARIABLE_COLON);
    createEAttribute(variable_colonEClass, VARIABLE_COLON__VARIABLE);
    createEAttribute(variable_colonEClass, VARIABLE_COLON__VARIABLE_INT);

    label_keywordEClass = createEClass(LABEL_KEYWORD);
    createEAttribute(label_keywordEClass, LABEL_KEYWORD__LABEL);
    createEReference(label_keywordEClass, LABEL_KEYWORD__VARIABLE);
    createEReference(label_keywordEClass, LABEL_KEYWORD__REGISTER);
    createEReference(label_keywordEClass, LABEL_KEYWORD__VARIABLE2);

    add_sub_instrEClass = createEClass(ADD_SUB_INSTR);
    createEReference(add_sub_instrEClass, ADD_SUB_INSTR__REGISTER);
    createEReference(add_sub_instrEClass, ADD_SUB_INSTR__OPERAND2);
    createEAttribute(add_sub_instrEClass, ADD_SUB_INSTR__OP);

    adrl_adr_instrEClass = createEClass(ADRL_ADR_INSTR);

    mul_3R_instrEClass = createEClass(MUL_3R_INSTR);
    createEReference(mul_3R_instrEClass, MUL_3R_INSTR__REGISTER);
    createEAttribute(mul_3R_instrEClass, MUL_3R_INSTR__OP);

    mul_4R_instrEClass = createEClass(MUL_4R_INSTR);
    createEReference(mul_4R_instrEClass, MUL_4R_INSTR__REGISTER);
    createEAttribute(mul_4R_instrEClass, MUL_4R_INSTR__OP);

    mov_instrEClass = createEClass(MOV_INSTR);
    createEReference(mov_instrEClass, MOV_INSTR__REGISTER);
    createEReference(mov_instrEClass, MOV_INSTR__OPERAND2);
    createEAttribute(mov_instrEClass, MOV_INSTR__OP);

    shift_instrEClass = createEClass(SHIFT_INSTR);
    createEReference(shift_instrEClass, SHIFT_INSTR__REGISTER);
    createEReference(shift_instrEClass, SHIFT_INSTR__RS_SH);
    createEAttribute(shift_instrEClass, SHIFT_INSTR__OP);

    clz_instrEClass = createEClass(CLZ_INSTR);

    compare_test_instrEClass = createEClass(COMPARE_TEST_INSTR);
    createEReference(compare_test_instrEClass, COMPARE_TEST_INSTR__REGISTER);
    createEReference(compare_test_instrEClass, COMPARE_TEST_INSTR__OPERAND2);
    createEAttribute(compare_test_instrEClass, COMPARE_TEST_INSTR__OP);

    logical_instrEClass = createEClass(LOGICAL_INSTR);
    createEReference(logical_instrEClass, LOGICAL_INSTR__REGISTER);
    createEReference(logical_instrEClass, LOGICAL_INSTR__OPERAND2);
    createEAttribute(logical_instrEClass, LOGICAL_INSTR__OP);

    branch_instrEClass = createEClass(BRANCH_INSTR);
    createEReference(branch_instrEClass, BRANCH_INSTR__IMMEDIATE_LABEL);
    createEReference(branch_instrEClass, BRANCH_INSTR__REGISTER);
    createEAttribute(branch_instrEClass, BRANCH_INSTR__OP);

    mrs_instrEClass = createEClass(MRS_INSTR);

    msr_instrEClass = createEClass(MSR_INSTR);

    ldr_str_irpre_instrEClass = createEClass(LDR_STR_IRPRE_INSTR);

    ldr_str_spre_instrEClass = createEClass(LDR_STR_SPRE_INSTR);

    ldr_str_irpsot_instrEClass = createEClass(LDR_STR_IRPSOT_INSTR);

    ldr_str_rpost_instrEClass = createEClass(LDR_STR_RPOST_INSTR);

    ldm_instrEClass = createEClass(LDM_INSTR);
    createEReference(ldm_instrEClass, LDM_INSTR__REGISTER);
    createEAttribute(ldm_instrEClass, LDM_INSTR__OP);

    push_pop_instrEClass = createEClass(PUSH_POP_INSTR);
    createEReference(push_pop_instrEClass, PUSH_POP_INSTR__REGISTER);
    createEAttribute(push_pop_instrEClass, PUSH_POP_INSTR__OP);

    bkpt_instrEClass = createEClass(BKPT_INSTR);
    createEReference(bkpt_instrEClass, BKPT_INSTR__IMMEDIATE_LABEL);

    swp_instrEClass = createEClass(SWP_INSTR);
    createEReference(swp_instrEClass, SWP_INSTR__REGISTER);
    createEReference(swp_instrEClass, SWP_INSTR__IMMEDIATE_LABEL);
    createEAttribute(swp_instrEClass, SWP_INSTR__OP);

    svc_instrEClass = createEClass(SVC_INSTR);

    adD_OPEClass = createEClass(ADD_OP);

    adC_OPEClass = createEClass(ADC_OP);

    adR_OPEClass = createEClass(ADR_OP);
    createEReference(adR_OPEClass, ADR_OP__EXPRESSION);

    suB_OPEClass = createEClass(SUB_OP);

    sbC_OPEClass = createEClass(SBC_OP);

    rsB_OPEClass = createEClass(RSB_OP);

    rsC_OPEClass = createEClass(RSC_OP);

    adrL_OPEClass = createEClass(ADRL_OP);
    createEReference(adrL_OPEClass, ADRL_OP__EXPRESSION);

    muL_OPEClass = createEClass(MUL_OP);

    mlS_OPEClass = createEClass(MLS_OP);

    mlA_OPEClass = createEClass(MLA_OP);

    umulL_OPEClass = createEClass(UMULL_OP);

    umlaL_OPEClass = createEClass(UMLAL_OP);

    smulL_OPEClass = createEClass(SMULL_OP);

    smlaL_OPEClass = createEClass(SMLAL_OP);

    smuL_OPEClass = createEClass(SMUL_OP);

    smulW_OPEClass = createEClass(SMULW_OP);

    smlA_OPEClass = createEClass(SMLA_OP);

    smlaW_OPEClass = createEClass(SMLAW_OP);

    moV_OPEClass = createEClass(MOV_OP);

    mvN_OPEClass = createEClass(MVN_OP);

    asR_OPEClass = createEClass(ASR_OP);

    lsL_OPEClass = createEClass(LSL_OP);

    lsR_OPEClass = createEClass(LSR_OP);

    roR_OPEClass = createEClass(ROR_OP);

    rrX_OPEClass = createEClass(RRX_OP);

    clZ_OPEClass = createEClass(CLZ_OP);
    createEReference(clZ_OPEClass, CLZ_OP__REGISTER);
    createEAttribute(clZ_OPEClass, CLZ_OP__OP);

    cmP_OPEClass = createEClass(CMP_OP);

    cmN_OPEClass = createEClass(CMN_OP);

    tsT_OPEClass = createEClass(TST_OP);

    teQ_OPEClass = createEClass(TEQ_OP);

    anD_OPEClass = createEClass(AND_OP);

    eoR_OPEClass = createEClass(EOR_OP);

    orR_OPEClass = createEClass(ORR_OP);

    orN_OPEClass = createEClass(ORN_OP);

    biC_OPEClass = createEClass(BIC_OP);

    b_OPEClass = createEClass(BOP);

    bL_OPEClass = createEClass(BL_OP);

    bX_OPEClass = createEClass(BX_OP);

    blX_OPEClass = createEClass(BLX_OP);

    bxJ_OPEClass = createEClass(BXJ_OP);

    mrS_OPEClass = createEClass(MRS_OP);
    createEReference(mrS_OPEClass, MRS_OP__REGISTER);
    createEReference(mrS_OPEClass, MRS_OP__PSR_FIELD);
    createEAttribute(mrS_OPEClass, MRS_OP__OP);

    msR_OPEClass = createEClass(MSR_OP);
    createEReference(msR_OPEClass, MSR_OP__APSR_FLAG);
    createEReference(msR_OPEClass, MSR_OP__PSR_FIELD);
    createEReference(msR_OPEClass, MSR_OP__REGISTER);
    createEReference(msR_OPEClass, MSR_OP__IMMEDIATE_LABEL);
    createEAttribute(msR_OPEClass, MSR_OP__OP);

    ldR_OPEClass = createEClass(LDR_OP);
    createEReference(ldR_OPEClass, LDR_OP__REGISTER);
    createEReference(ldR_OPEClass, LDR_OP__IMMEDIATE_LABEL);
    createEReference(ldR_OPEClass, LDR_OP__BAREL_SHIFT_REGISTER);
    createEAttribute(ldR_OPEClass, LDR_OP__OP);

    stR_OPEClass = createEClass(STR_OP);
    createEReference(stR_OPEClass, STR_OP__REGISTER);
    createEReference(stR_OPEClass, STR_OP__IMMEDIATE_LABEL);
    createEReference(stR_OPEClass, STR_OP__BAREL_SHIFT_REGISTER);
    createEAttribute(stR_OPEClass, STR_OP__OP);

    ldM_OPEClass = createEClass(LDM_OP);

    stM_OPEClass = createEClass(STM_OP);

    pusH_OPEClass = createEClass(PUSH_OP);

    poP_OPEClass = createEClass(POP_OP);

    swP_OPEClass = createEClass(SWP_OP);

    swpB_OPEClass = createEClass(SWPB_OP);

    svC_OPEClass = createEClass(SVC_OP);
    createEReference(svC_OPEClass, SVC_OP__IMMEDIATE_LABEL);
    createEAttribute(svC_OPEClass, SVC_OP__OP);

    psR_FIELD_EEClass = createEClass(PSR_FIELD_E);
    createEAttribute(psR_FIELD_EEClass, PSR_FIELD_E__OP);

    apsR_FLAG_EEClass = createEClass(APSR_FLAG_E);
    createEAttribute(apsR_FLAG_EEClass, APSR_FLAG_E__OP);

    nopEClass = createEClass(NOP);
    createEAttribute(nopEClass, NOP__OP);

    preprocessorEClass = createEClass(PREPROCESSOR);
    createEReference(preprocessorEClass, PREPROCESSOR__EXPRESSION);
    createEReference(preprocessorEClass, PREPROCESSOR__EXPRESSION2);
    createEAttribute(preprocessorEClass, PREPROCESSOR__HASH);
    createEAttribute(preprocessorEClass, PREPROCESSOR__CODE);

    preprocessoR_DEFINEEClass = createEClass(PREPROCESSOR_DEFINE);
    createEReference(preprocessoR_DEFINEEClass, PREPROCESSOR_DEFINE__EXPRESSION);
    createEReference(preprocessoR_DEFINEEClass, PREPROCESSOR_DEFINE__EXPRESSION2);
    createEAttribute(preprocessoR_DEFINEEClass, PREPROCESSOR_DEFINE__HASH);
    createEAttribute(preprocessoR_DEFINEEClass, PREPROCESSOR_DEFINE__CODE);

    preprocessoR_ENDIFEClass = createEClass(PREPROCESSOR_ENDIF);
    createEAttribute(preprocessoR_ENDIFEClass, PREPROCESSOR_ENDIF__HASH);
    createEAttribute(preprocessoR_ENDIFEClass, PREPROCESSOR_ENDIF__CODE);

    preprocessoR_ELSEEClass = createEClass(PREPROCESSOR_ELSE);
    createEAttribute(preprocessoR_ELSEEClass, PREPROCESSOR_ELSE__HASH);
    createEAttribute(preprocessoR_ELSEEClass, PREPROCESSOR_ELSE__CODE);

    cExtendCodeEClass = createEClass(CEXTEND_CODE);
    createEReference(cExtendCodeEClass, CEXTEND_CODE__EXPRESSION);
    createEReference(cExtendCodeEClass, CEXTEND_CODE__EXPRESSION2);
    createEAttribute(cExtendCodeEClass, CEXTEND_CODE__DOT);
    createEAttribute(cExtendCodeEClass, CEXTEND_CODE__CODE);

    assembler_Directives_equEClass = createEClass(ASSEMBLER_DIRECTIVES_EQU);
    createEReference(assembler_Directives_equEClass, ASSEMBLER_DIRECTIVES_EQU__EXPRESSION);
    createEReference(assembler_Directives_equEClass, ASSEMBLER_DIRECTIVES_EQU__EXPRESSION2);
    createEAttribute(assembler_Directives_equEClass, ASSEMBLER_DIRECTIVES_EQU__DOT);
    createEAttribute(assembler_Directives_equEClass, ASSEMBLER_DIRECTIVES_EQU__CODE);

    assembler_DirectivesEClass = createEClass(ASSEMBLER_DIRECTIVES);
    createEReference(assembler_DirectivesEClass, ASSEMBLER_DIRECTIVES__EXPRESSION);
    createEReference(assembler_DirectivesEClass, ASSEMBLER_DIRECTIVES__EXPRESSION2);
    createEAttribute(assembler_DirectivesEClass, ASSEMBLER_DIRECTIVES__DOT);
    createEAttribute(assembler_DirectivesEClass, ASSEMBLER_DIRECTIVES__CODE);

    assembler_Directives_macroEClass = createEClass(ASSEMBLER_DIRECTIVES_MACRO);
    createEReference(assembler_Directives_macroEClass, ASSEMBLER_DIRECTIVES_MACRO__EXPRESSION);
    createEReference(assembler_Directives_macroEClass, ASSEMBLER_DIRECTIVES_MACRO__DEFINITION);
    createEAttribute(assembler_Directives_macroEClass, ASSEMBLER_DIRECTIVES_MACRO__DOT);
    createEAttribute(assembler_Directives_macroEClass, ASSEMBLER_DIRECTIVES_MACRO__CODE);

    assember_Directives_typeEClass = createEClass(ASSEMBER_DIRECTIVES_TYPE);
    createEReference(assember_Directives_typeEClass, ASSEMBER_DIRECTIVES_TYPE__EXPRESSION);
    createEReference(assember_Directives_typeEClass, ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION);
    createEAttribute(assember_Directives_typeEClass, ASSEMBER_DIRECTIVES_TYPE__DOT);
    createEAttribute(assember_Directives_typeEClass, ASSEMBER_DIRECTIVES_TYPE__CODE);

    assembler_Directives_endmEClass = createEClass(ASSEMBLER_DIRECTIVES_ENDM);
    createEAttribute(assembler_Directives_endmEClass, ASSEMBLER_DIRECTIVES_ENDM__DOT);
    createEAttribute(assembler_Directives_endmEClass, ASSEMBLER_DIRECTIVES_ENDM__CODE);

    arM_Machine_DirectivesEClass = createEClass(ARM_MACHINE_DIRECTIVES);
    createEReference(arM_Machine_DirectivesEClass, ARM_MACHINE_DIRECTIVES__EXPRESSION);
    createEReference(arM_Machine_DirectivesEClass, ARM_MACHINE_DIRECTIVES__EXPRESSION2);
    createEAttribute(arM_Machine_DirectivesEClass, ARM_MACHINE_DIRECTIVES__DOT);
    createEAttribute(arM_Machine_DirectivesEClass, ARM_MACHINE_DIRECTIVES__CODE);

    arM_MACHINE_DIRECTIVES_alignEClass = createEClass(ARM_MACHINE_DIRECTIVES_ALIGN);
    createEAttribute(arM_MACHINE_DIRECTIVES_alignEClass, ARM_MACHINE_DIRECTIVES_ALIGN__INT);
    createEAttribute(arM_MACHINE_DIRECTIVES_alignEClass, ARM_MACHINE_DIRECTIVES_ALIGN__HEX);
    createEAttribute(arM_MACHINE_DIRECTIVES_alignEClass, ARM_MACHINE_DIRECTIVES_ALIGN__DOT);
    createEAttribute(arM_MACHINE_DIRECTIVES_alignEClass, ARM_MACHINE_DIRECTIVES_ALIGN__CODE);

    arM_Machine_Directives_codeEClass = createEClass(ARM_MACHINE_DIRECTIVES_CODE);
    createEAttribute(arM_Machine_Directives_codeEClass, ARM_MACHINE_DIRECTIVES_CODE__ARM);
    createEAttribute(arM_Machine_Directives_codeEClass, ARM_MACHINE_DIRECTIVES_CODE__THUMB);
    createEAttribute(arM_Machine_Directives_codeEClass, ARM_MACHINE_DIRECTIVES_CODE__DOT);
    createEAttribute(arM_Machine_Directives_codeEClass, ARM_MACHINE_DIRECTIVES_CODE__CODE);

    arM_Machine_Directives_syntaxEClass = createEClass(ARM_MACHINE_DIRECTIVES_SYNTAX);
    createEAttribute(arM_Machine_Directives_syntaxEClass, ARM_MACHINE_DIRECTIVES_SYNTAX__DOT);
    createEAttribute(arM_Machine_Directives_syntaxEClass, ARM_MACHINE_DIRECTIVES_SYNTAX__CODE);

    arM_Machine_Directives_saveEClass = createEClass(ARM_MACHINE_DIRECTIVES_SAVE);
    createEAttribute(arM_Machine_Directives_saveEClass, ARM_MACHINE_DIRECTIVES_SAVE__REGLIST);
    createEAttribute(arM_Machine_Directives_saveEClass, ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM);
    createEReference(arM_Machine_Directives_saveEClass, ARM_MACHINE_DIRECTIVES_SAVE__REGISTER);
    createEAttribute(arM_Machine_Directives_saveEClass, ARM_MACHINE_DIRECTIVES_SAVE__DOT);
    createEAttribute(arM_Machine_Directives_saveEClass, ARM_MACHINE_DIRECTIVES_SAVE__CODE);

    cExtendascizEClass = createEClass(CEXTENDASCIZ);
    createEReference(cExtendascizEClass, CEXTENDASCIZ__EXPRESSION);
    createEAttribute(cExtendascizEClass, CEXTENDASCIZ__DOT);
    createEAttribute(cExtendascizEClass, CEXTENDASCIZ__CODE);

    cLangEClass = createEClass(CLANG);
    createEReference(cLangEClass, CLANG__EXPRESSION);
    createEAttribute(cLangEClass, CLANG__CODE);

    registerEClass = createEClass(REGISTER);
    createEAttribute(registerEClass, REGISTER__R0);
    createEAttribute(registerEClass, REGISTER__R1);
    createEAttribute(registerEClass, REGISTER__R2);
    createEAttribute(registerEClass, REGISTER__R3);
    createEAttribute(registerEClass, REGISTER__R4);
    createEAttribute(registerEClass, REGISTER__R5);
    createEAttribute(registerEClass, REGISTER__R6);
    createEAttribute(registerEClass, REGISTER__R7);
    createEAttribute(registerEClass, REGISTER__R8);
    createEAttribute(registerEClass, REGISTER__R9);
    createEAttribute(registerEClass, REGISTER__R10);
    createEAttribute(registerEClass, REGISTER__R11);
    createEAttribute(registerEClass, REGISTER__R12);
    createEAttribute(registerEClass, REGISTER__R13);
    createEAttribute(registerEClass, REGISTER__R14);
    createEAttribute(registerEClass, REGISTER__R15);
    createEAttribute(registerEClass, REGISTER__RFP);
    createEAttribute(registerEClass, REGISTER__RIP);
    createEAttribute(registerEClass, REGISTER__RSP);
    createEAttribute(registerEClass, REGISTER__RLR);
    createEAttribute(registerEClass, REGISTER__RPC);
    createEAttribute(registerEClass, REGISTER__R001);
    createEAttribute(registerEClass, REGISTER__R01);
    createEAttribute(registerEClass, REGISTER__R02);
    createEAttribute(registerEClass, REGISTER__R03);
    createEAttribute(registerEClass, REGISTER__R04);
    createEAttribute(registerEClass, REGISTER__R05);
    createEAttribute(registerEClass, REGISTER__R06);
    createEAttribute(registerEClass, REGISTER__R07);
    createEAttribute(registerEClass, REGISTER__R08);
    createEAttribute(registerEClass, REGISTER__R09);
    createEAttribute(registerEClass, REGISTER__R010);
    createEAttribute(registerEClass, REGISTER__R011);
    createEAttribute(registerEClass, REGISTER__R012);
    createEAttribute(registerEClass, REGISTER__R013);
    createEAttribute(registerEClass, REGISTER__R014);
    createEAttribute(registerEClass, REGISTER__R015);
    createEAttribute(registerEClass, REGISTER__R0FP);
    createEAttribute(registerEClass, REGISTER__R0IP);
    createEAttribute(registerEClass, REGISTER__R0SP);
    createEAttribute(registerEClass, REGISTER__R0LR);
    createEAttribute(registerEClass, REGISTER__R0PC);
    createEReference(registerEClass, REGISTER__OPSH);

    bareL_SHIFT_REGISTEREClass = createEClass(BAREL_SHIFT_REGISTER);
    createEAttribute(bareL_SHIFT_REGISTEREClass, BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER);
    createEReference(bareL_SHIFT_REGISTEREClass, BAREL_SHIFT_REGISTER__REGISTER);

    operand2EClass = createEClass(OPERAND2);

    opshEClass = createEClass(OPSH);

    immediate_labelEClass = createEClass(IMMEDIATE_LABEL);
    createEReference(immediate_labelEClass, IMMEDIATE_LABEL__LITERAL_NUMERIC);
    createEReference(immediate_labelEClass, IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD);
    createEAttribute(immediate_labelEClass, IMMEDIATE_LABEL__LABEL);
    createEAttribute(immediate_labelEClass, IMMEDIATE_LABEL__NUM2);
    createEAttribute(immediate_labelEClass, IMMEDIATE_LABEL__LABEL2);
    createEAttribute(immediate_labelEClass, IMMEDIATE_LABEL__NUM);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__INT);
    createEAttribute(descriptionEClass, DESCRIPTION__STRING);
    createEAttribute(descriptionEClass, DESCRIPTION__DESCRIPTION);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__VARIABLE_INT);
    createEAttribute(variableEClass, VARIABLE__VARIABLE_ABC);
    createEAttribute(variableEClass, VARIABLE__VARIABLE_STRING);
    createEAttribute(variableEClass, VARIABLE__VARIABLE_HEX);

    definitionEClass = createEClass(DEFINITION);
    createEAttribute(definitionEClass, DEFINITION__VARIABLE_INT);
    createEAttribute(definitionEClass, DEFINITION__VARIABLE_ABC);
    createEAttribute(definitionEClass, DEFINITION__VARIABLE_STRING);
    createEAttribute(definitionEClass, DEFINITION__VARIABLE_HEX);
    createEAttribute(definitionEClass, DEFINITION__DEF_INT);
    createEAttribute(definitionEClass, DEFINITION__DEF_ABC);
    createEAttribute(definitionEClass, DEFINITION__DEF_STRING);
    createEAttribute(definitionEClass, DEFINITION__DEF_HEX);

    randomEntryEClass = createEClass(RANDOM_ENTRY);
    createEAttribute(randomEntryEClass, RANDOM_ENTRY__ENTRY_INT);
    createEAttribute(randomEntryEClass, RANDOM_ENTRY__ENTRY_ABC);
    createEAttribute(randomEntryEClass, RANDOM_ENTRY__ENTRY_STRING);
    createEAttribute(randomEntryEClass, RANDOM_ENTRY__ENTRY_HEX);

    rs_shEClass = createEClass(RS_SH);
    createEReference(rs_shEClass, RS_SH__IMMEDIATE_LABEL);

    flexible_offsetEClass = createEClass(FLEXIBLE_OFFSET);
    createEAttribute(flexible_offsetEClass, FLEXIBLE_OFFSET__EXPR);
    createEAttribute(flexible_offsetEClass, FLEXIBLE_OFFSET__EXPR2);
    createEReference(flexible_offsetEClass, FLEXIBLE_OFFSET__REGISTER);
    createEReference(flexible_offsetEClass, FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER);
    createEReference(flexible_offsetEClass, FLEXIBLE_OFFSET__IMMEDIATE_LABEL);
    createEAttribute(flexible_offsetEClass, FLEXIBLE_OFFSET__NUM);

    literal_numericEClass = createEClass(LITERAL_NUMERIC);
    createEAttribute(literal_numericEClass, LITERAL_NUMERIC__HEX);
    createEAttribute(literal_numericEClass, LITERAL_NUMERIC__INT);

    numeric_backward_forwardEClass = createEClass(NUMERIC_BACKWARD_FORWARD);
    createEAttribute(numeric_backward_forwardEClass, NUMERIC_BACKWARD_FORWARD__HEX);
    createEAttribute(numeric_backward_forwardEClass, NUMERIC_BACKWARD_FORWARD__INT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    operationInstrEClass.getESuperTypes().add(this.getARMInstr());
    ccodeEClass.getESuperTypes().add(this.getARMInstr());
    variable_variableEClass.getESuperTypes().add(this.getCcode());
    variable_colonEClass.getESuperTypes().add(this.getCcode());
    add_sub_instrEClass.getESuperTypes().add(this.getOperationInstr());
    adrl_adr_instrEClass.getESuperTypes().add(this.getOperationInstr());
    mul_3R_instrEClass.getESuperTypes().add(this.getOperationInstr());
    mul_4R_instrEClass.getESuperTypes().add(this.getOperationInstr());
    mov_instrEClass.getESuperTypes().add(this.getOperationInstr());
    shift_instrEClass.getESuperTypes().add(this.getOperationInstr());
    clz_instrEClass.getESuperTypes().add(this.getOperationInstr());
    compare_test_instrEClass.getESuperTypes().add(this.getOperationInstr());
    logical_instrEClass.getESuperTypes().add(this.getOperationInstr());
    branch_instrEClass.getESuperTypes().add(this.getOperationInstr());
    mrs_instrEClass.getESuperTypes().add(this.getOperationInstr());
    msr_instrEClass.getESuperTypes().add(this.getOperationInstr());
    ldr_str_irpre_instrEClass.getESuperTypes().add(this.getOperationInstr());
    ldr_str_spre_instrEClass.getESuperTypes().add(this.getOperationInstr());
    ldr_str_irpsot_instrEClass.getESuperTypes().add(this.getOperationInstr());
    ldr_str_rpost_instrEClass.getESuperTypes().add(this.getOperationInstr());
    ldm_instrEClass.getESuperTypes().add(this.getOperationInstr());
    push_pop_instrEClass.getESuperTypes().add(this.getOperationInstr());
    bkpt_instrEClass.getESuperTypes().add(this.getOperationInstr());
    swp_instrEClass.getESuperTypes().add(this.getOperationInstr());
    svc_instrEClass.getESuperTypes().add(this.getOperationInstr());
    adD_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    adC_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    adR_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    adR_OPEClass.getESuperTypes().add(this.getadrl_adr_instr());
    suB_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    sbC_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    rsB_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    rsC_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    adrL_OPEClass.getESuperTypes().add(this.getadd_sub_instr());
    adrL_OPEClass.getESuperTypes().add(this.getadrl_adr_instr());
    muL_OPEClass.getESuperTypes().add(this.getmul_3R_instr());
    mlS_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    mlA_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    umulL_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    umlaL_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    smulL_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    smlaL_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    smuL_OPEClass.getESuperTypes().add(this.getmul_3R_instr());
    smulW_OPEClass.getESuperTypes().add(this.getmul_3R_instr());
    smlA_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    smlaW_OPEClass.getESuperTypes().add(this.getmul_4R_instr());
    moV_OPEClass.getESuperTypes().add(this.getmov_instr());
    mvN_OPEClass.getESuperTypes().add(this.getmov_instr());
    asR_OPEClass.getESuperTypes().add(this.getshift_instr());
    lsL_OPEClass.getESuperTypes().add(this.getshift_instr());
    lsR_OPEClass.getESuperTypes().add(this.getshift_instr());
    roR_OPEClass.getESuperTypes().add(this.getshift_instr());
    rrX_OPEClass.getESuperTypes().add(this.getshift_instr());
    clZ_OPEClass.getESuperTypes().add(this.getclz_instr());
    cmP_OPEClass.getESuperTypes().add(this.getcompare_test_instr());
    cmN_OPEClass.getESuperTypes().add(this.getcompare_test_instr());
    tsT_OPEClass.getESuperTypes().add(this.getcompare_test_instr());
    teQ_OPEClass.getESuperTypes().add(this.getcompare_test_instr());
    anD_OPEClass.getESuperTypes().add(this.getlogical_instr());
    eoR_OPEClass.getESuperTypes().add(this.getlogical_instr());
    orR_OPEClass.getESuperTypes().add(this.getlogical_instr());
    orN_OPEClass.getESuperTypes().add(this.getlogical_instr());
    biC_OPEClass.getESuperTypes().add(this.getlogical_instr());
    b_OPEClass.getESuperTypes().add(this.getbranch_instr());
    bL_OPEClass.getESuperTypes().add(this.getbranch_instr());
    bX_OPEClass.getESuperTypes().add(this.getbranch_instr());
    blX_OPEClass.getESuperTypes().add(this.getbranch_instr());
    bxJ_OPEClass.getESuperTypes().add(this.getbranch_instr());
    mrS_OPEClass.getESuperTypes().add(this.getmrs_instr());
    msR_OPEClass.getESuperTypes().add(this.getmsr_instr());
    ldR_OPEClass.getESuperTypes().add(this.getldr_str_irpre_instr());
    ldR_OPEClass.getESuperTypes().add(this.getldr_str_spre_instr());
    ldR_OPEClass.getESuperTypes().add(this.getldr_str_irpsot_instr());
    ldR_OPEClass.getESuperTypes().add(this.getldr_str_rpost_instr());
    stR_OPEClass.getESuperTypes().add(this.getldr_str_irpre_instr());
    stR_OPEClass.getESuperTypes().add(this.getldr_str_spre_instr());
    stR_OPEClass.getESuperTypes().add(this.getldr_str_irpsot_instr());
    stR_OPEClass.getESuperTypes().add(this.getldr_str_rpost_instr());
    ldM_OPEClass.getESuperTypes().add(this.getldm_instr());
    stM_OPEClass.getESuperTypes().add(this.getldm_instr());
    pusH_OPEClass.getESuperTypes().add(this.getpush_pop_instr());
    poP_OPEClass.getESuperTypes().add(this.getpush_pop_instr());
    swP_OPEClass.getESuperTypes().add(this.getswp_instr());
    swpB_OPEClass.getESuperTypes().add(this.getswp_instr());
    svC_OPEClass.getESuperTypes().add(this.getsvc_instr());
    nopEClass.getESuperTypes().add(this.getOperationInstr());
    preprocessorEClass.getESuperTypes().add(this.getCcode());
    preprocessoR_DEFINEEClass.getESuperTypes().add(this.getCcode());
    preprocessoR_ENDIFEClass.getESuperTypes().add(this.getCcode());
    preprocessoR_ELSEEClass.getESuperTypes().add(this.getCcode());
    cExtendCodeEClass.getESuperTypes().add(this.getCcode());
    assembler_Directives_equEClass.getESuperTypes().add(this.getCcode());
    assembler_DirectivesEClass.getESuperTypes().add(this.getCcode());
    assembler_Directives_macroEClass.getESuperTypes().add(this.getCcode());
    assember_Directives_typeEClass.getESuperTypes().add(this.getCcode());
    assembler_Directives_endmEClass.getESuperTypes().add(this.getCcode());
    arM_Machine_DirectivesEClass.getESuperTypes().add(this.getCcode());
    arM_MACHINE_DIRECTIVES_alignEClass.getESuperTypes().add(this.getCcode());
    arM_Machine_Directives_codeEClass.getESuperTypes().add(this.getCcode());
    arM_Machine_Directives_syntaxEClass.getESuperTypes().add(this.getCcode());
    arM_Machine_Directives_saveEClass.getESuperTypes().add(this.getCcode());
    cExtendascizEClass.getESuperTypes().add(this.getCcode());
    cLangEClass.getESuperTypes().add(this.getCcode());
    registerEClass.getESuperTypes().add(this.getOperand2());
    registerEClass.getESuperTypes().add(this.getrs_sh());
    bareL_SHIFT_REGISTEREClass.getESuperTypes().add(this.getopsh());
    bareL_SHIFT_REGISTEREClass.getESuperTypes().add(this.getrs_sh());
    immediate_labelEClass.getESuperTypes().add(this.getOperand2());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getARMInstr(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(armInstrEClass, ARMInstr.class, "ARMInstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationInstrEClass, OperationInstr.class, "OperationInstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ccodeEClass, Ccode.class, "Ccode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCcode_Label_keyword(), this.getlabel_keyword(), null, "label_keyword", null, 0, -1, Ccode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_variableEClass, variable_variable.class, "variable_variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvariable_variable_Variable(), this.getvariable(), null, "variable", null, 0, -1, variable_variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getvariable_variable_Variable2(), this.getvariable(), null, "variable2", null, 0, -1, variable_variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_colonEClass, variable_colon.class, "variable_colon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_colon_Variable(), ecorePackage.getEString(), "variable", null, 0, -1, variable_colon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariable_colon_VariableINT(), ecorePackage.getEString(), "variableINT", null, 0, -1, variable_colon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(label_keywordEClass, label_keyword.class, "label_keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlabel_keyword_Label(), ecorePackage.getEString(), "label", null, 0, -1, label_keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabel_keyword_Variable(), this.getvariable(), null, "variable", null, 0, -1, label_keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabel_keyword_Register(), this.getREGISTER(), null, "register", null, 0, -1, label_keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlabel_keyword_Variable2(), this.getvariable(), null, "variable2", null, 0, -1, label_keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(add_sub_instrEClass, add_sub_instr.class, "add_sub_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getadd_sub_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, add_sub_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getadd_sub_instr_Operand2(), this.getOperand2(), null, "Operand2", null, 0, -1, add_sub_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getadd_sub_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, add_sub_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(adrl_adr_instrEClass, adrl_adr_instr.class, "adrl_adr_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mul_3R_instrEClass, mul_3R_instr.class, "mul_3R_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmul_3R_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, mul_3R_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmul_3R_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, mul_3R_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mul_4R_instrEClass, mul_4R_instr.class, "mul_4R_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmul_4R_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, mul_4R_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmul_4R_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, mul_4R_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mov_instrEClass, mov_instr.class, "mov_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmov_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, mov_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmov_instr_Operand2(), this.getOperand2(), null, "Operand2", null, 0, -1, mov_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getmov_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, mov_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shift_instrEClass, shift_instr.class, "shift_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getshift_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, shift_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getshift_instr_Rs_sh(), this.getrs_sh(), null, "rs_sh", null, 0, -1, shift_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getshift_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, shift_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clz_instrEClass, clz_instr.class, "clz_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compare_test_instrEClass, compare_test_instr.class, "compare_test_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcompare_test_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, compare_test_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcompare_test_instr_Operand2(), this.getOperand2(), null, "Operand2", null, 0, -1, compare_test_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcompare_test_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, compare_test_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_instrEClass, logical_instr.class, "logical_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlogical_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, logical_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getlogical_instr_Operand2(), this.getOperand2(), null, "Operand2", null, 0, -1, logical_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlogical_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, logical_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branch_instrEClass, branch_instr.class, "branch_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbranch_instr_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, branch_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getbranch_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, branch_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getbranch_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, branch_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mrs_instrEClass, mrs_instr.class, "mrs_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(msr_instrEClass, msr_instr.class, "msr_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldr_str_irpre_instrEClass, ldr_str_irpre_instr.class, "ldr_str_irpre_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldr_str_spre_instrEClass, ldr_str_spre_instr.class, "ldr_str_spre_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldr_str_irpsot_instrEClass, ldr_str_irpsot_instr.class, "ldr_str_irpsot_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldr_str_rpost_instrEClass, ldr_str_rpost_instr.class, "ldr_str_rpost_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ldm_instrEClass, ldm_instr.class, "ldm_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getldm_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, ldm_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldm_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, ldm_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(push_pop_instrEClass, push_pop_instr.class, "push_pop_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpush_pop_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, push_pop_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpush_pop_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, push_pop_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bkpt_instrEClass, bkpt_instr.class, "bkpt_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getbkpt_instr_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, bkpt_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(swp_instrEClass, swp_instr.class, "swp_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getswp_instr_Register(), this.getREGISTER(), null, "register", null, 0, -1, swp_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getswp_instr_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, swp_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getswp_instr_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, swp_instr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(svc_instrEClass, svc_instr.class, "svc_instr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(adD_OPEClass, org.xtext.aRM.ADD_OP.class, "ADD_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(adC_OPEClass, org.xtext.aRM.ADC_OP.class, "ADC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(adR_OPEClass, org.xtext.aRM.ADR_OP.class, "ADR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getADR_OP_Expression(), this.getrandomEntry(), null, "expression", null, 0, -1, org.xtext.aRM.ADR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suB_OPEClass, org.xtext.aRM.SUB_OP.class, "SUB_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sbC_OPEClass, org.xtext.aRM.SBC_OP.class, "SBC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rsB_OPEClass, org.xtext.aRM.RSB_OP.class, "RSB_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rsC_OPEClass, org.xtext.aRM.RSC_OP.class, "RSC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(adrL_OPEClass, org.xtext.aRM.ADRL_OP.class, "ADRL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getADRL_OP_Expression(), this.getrandomEntry(), null, "expression", null, 0, -1, org.xtext.aRM.ADRL_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(muL_OPEClass, org.xtext.aRM.MUL_OP.class, "MUL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mlS_OPEClass, org.xtext.aRM.MLS_OP.class, "MLS_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mlA_OPEClass, org.xtext.aRM.MLA_OP.class, "MLA_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(umulL_OPEClass, org.xtext.aRM.UMULL_OP.class, "UMULL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(umlaL_OPEClass, org.xtext.aRM.UMLAL_OP.class, "UMLAL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smulL_OPEClass, org.xtext.aRM.SMULL_OP.class, "SMULL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smlaL_OPEClass, org.xtext.aRM.SMLAL_OP.class, "SMLAL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smuL_OPEClass, org.xtext.aRM.SMUL_OP.class, "SMUL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smulW_OPEClass, org.xtext.aRM.SMULW_OP.class, "SMULW_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smlA_OPEClass, org.xtext.aRM.SMLA_OP.class, "SMLA_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smlaW_OPEClass, org.xtext.aRM.SMLAW_OP.class, "SMLAW_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moV_OPEClass, org.xtext.aRM.MOV_OP.class, "MOV_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mvN_OPEClass, org.xtext.aRM.MVN_OP.class, "MVN_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asR_OPEClass, org.xtext.aRM.ASR_OP.class, "ASR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lsL_OPEClass, org.xtext.aRM.LSL_OP.class, "LSL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lsR_OPEClass, org.xtext.aRM.LSR_OP.class, "LSR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roR_OPEClass, org.xtext.aRM.ROR_OP.class, "ROR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rrX_OPEClass, org.xtext.aRM.RRX_OP.class, "RRX_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clZ_OPEClass, org.xtext.aRM.CLZ_OP.class, "CLZ_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCLZ_OP_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.CLZ_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCLZ_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.CLZ_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cmP_OPEClass, org.xtext.aRM.CMP_OP.class, "CMP_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cmN_OPEClass, org.xtext.aRM.CMN_OP.class, "CMN_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tsT_OPEClass, org.xtext.aRM.TST_OP.class, "TST_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(teQ_OPEClass, org.xtext.aRM.TEQ_OP.class, "TEQ_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anD_OPEClass, org.xtext.aRM.AND_OP.class, "AND_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eoR_OPEClass, org.xtext.aRM.EOR_OP.class, "EOR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orR_OPEClass, org.xtext.aRM.ORR_OP.class, "ORR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orN_OPEClass, org.xtext.aRM.ORN_OP.class, "ORN_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(biC_OPEClass, org.xtext.aRM.BIC_OP.class, "BIC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(b_OPEClass, B_OP.class, "B_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bL_OPEClass, org.xtext.aRM.BL_OP.class, "BL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bX_OPEClass, org.xtext.aRM.BX_OP.class, "BX_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blX_OPEClass, org.xtext.aRM.BLX_OP.class, "BLX_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bxJ_OPEClass, org.xtext.aRM.BXJ_OP.class, "BXJ_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mrS_OPEClass, org.xtext.aRM.MRS_OP.class, "MRS_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMRS_OP_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.MRS_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMRS_OP_PSR_FIELD(), this.getPSR_FIELD_E(), null, "PSR_FIELD", null, 0, -1, org.xtext.aRM.MRS_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMRS_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.MRS_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(msR_OPEClass, org.xtext.aRM.MSR_OP.class, "MSR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMSR_OP_APSR_FLAG(), this.getAPSR_FLAG_E(), null, "APSR_FLAG", null, 0, -1, org.xtext.aRM.MSR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMSR_OP_PSR_FIELD(), this.getPSR_FIELD_E(), null, "PSR_FIELD", null, 0, -1, org.xtext.aRM.MSR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMSR_OP_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.MSR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMSR_OP_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, org.xtext.aRM.MSR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMSR_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.MSR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldR_OPEClass, org.xtext.aRM.LDR_OP.class, "LDR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDR_OP_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.LDR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDR_OP_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, org.xtext.aRM.LDR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDR_OP_BAREL_SHIFT_REGISTER(), this.getBAREL_SHIFT_REGISTER(), null, "BAREL_SHIFT_REGISTER", null, 0, -1, org.xtext.aRM.LDR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLDR_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.LDR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stR_OPEClass, org.xtext.aRM.STR_OP.class, "STR_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSTR_OP_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.STR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSTR_OP_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, org.xtext.aRM.STR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSTR_OP_BAREL_SHIFT_REGISTER(), this.getBAREL_SHIFT_REGISTER(), null, "BAREL_SHIFT_REGISTER", null, 0, -1, org.xtext.aRM.STR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSTR_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.STR_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldM_OPEClass, org.xtext.aRM.LDM_OP.class, "LDM_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stM_OPEClass, org.xtext.aRM.STM_OP.class, "STM_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pusH_OPEClass, org.xtext.aRM.PUSH_OP.class, "PUSH_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(poP_OPEClass, org.xtext.aRM.POP_OP.class, "POP_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(swP_OPEClass, org.xtext.aRM.SWP_OP.class, "SWP_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(swpB_OPEClass, org.xtext.aRM.SWPB_OP.class, "SWPB_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(svC_OPEClass, org.xtext.aRM.SVC_OP.class, "SVC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSVC_OP_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, org.xtext.aRM.SVC_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSVC_OP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.SVC_OP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(psR_FIELD_EEClass, org.xtext.aRM.PSR_FIELD_E.class, "PSR_FIELD_E", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPSR_FIELD_E_Op(), ecorePackage.getEString(), "op", null, 0, -1, org.xtext.aRM.PSR_FIELD_E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(apsR_FLAG_EEClass, org.xtext.aRM.APSR_FLAG_E.class, "APSR_FLAG_E", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAPSR_FLAG_E_Op(), ecorePackage.getEString(), "op", null, 0, -1, org.xtext.aRM.APSR_FLAG_E.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nopEClass, org.xtext.aRM.NOP.class, "NOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNOP_Op(), ecorePackage.getEBoolean(), "op", null, 0, 1, org.xtext.aRM.NOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preprocessorEClass, org.xtext.aRM.PREPROCESSOR.class, "PREPROCESSOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPREPROCESSOR_Expression(), this.getvariable(), null, "expression", null, 0, 1, org.xtext.aRM.PREPROCESSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPREPROCESSOR_Expression2(), this.getvariable(), null, "expression2", null, 0, 1, org.xtext.aRM.PREPROCESSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_Hash(), ecorePackage.getEBoolean(), "hash", null, 0, 1, org.xtext.aRM.PREPROCESSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, org.xtext.aRM.PREPROCESSOR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preprocessoR_DEFINEEClass, org.xtext.aRM.PREPROCESSOR_DEFINE.class, "PREPROCESSOR_DEFINE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPREPROCESSOR_DEFINE_Expression(), this.getvariable(), null, "expression", null, 0, 1, org.xtext.aRM.PREPROCESSOR_DEFINE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPREPROCESSOR_DEFINE_Expression2(), this.getvariable(), null, "expression2", null, 0, 1, org.xtext.aRM.PREPROCESSOR_DEFINE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_DEFINE_Hash(), ecorePackage.getEBoolean(), "hash", null, 0, 1, org.xtext.aRM.PREPROCESSOR_DEFINE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_DEFINE_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, org.xtext.aRM.PREPROCESSOR_DEFINE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preprocessoR_ENDIFEClass, org.xtext.aRM.PREPROCESSOR_ENDIF.class, "PREPROCESSOR_ENDIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPREPROCESSOR_ENDIF_Hash(), ecorePackage.getEBoolean(), "hash", null, 0, 1, org.xtext.aRM.PREPROCESSOR_ENDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_ENDIF_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, org.xtext.aRM.PREPROCESSOR_ENDIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preprocessoR_ELSEEClass, org.xtext.aRM.PREPROCESSOR_ELSE.class, "PREPROCESSOR_ELSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPREPROCESSOR_ELSE_Hash(), ecorePackage.getEBoolean(), "hash", null, 0, 1, org.xtext.aRM.PREPROCESSOR_ELSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPREPROCESSOR_ELSE_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, org.xtext.aRM.PREPROCESSOR_ELSE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cExtendCodeEClass, CExtendCode.class, "CExtendCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCExtendCode_Expression(), this.getvariable(), null, "expression", null, 0, -1, CExtendCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCExtendCode_Expression2(), this.getvariable(), null, "expression2", null, 0, -1, CExtendCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCExtendCode_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, CExtendCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCExtendCode_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, CExtendCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assembler_Directives_equEClass, Assembler_Directives_equ.class, "Assembler_Directives_equ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssembler_Directives_equ_Expression(), this.getvariable(), null, "expression", null, 0, -1, Assembler_Directives_equ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssembler_Directives_equ_Expression2(), this.getvariable(), null, "expression2", null, 0, -1, Assembler_Directives_equ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_equ_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, Assembler_Directives_equ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_equ_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, Assembler_Directives_equ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assembler_DirectivesEClass, Assembler_Directives.class, "Assembler_Directives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssembler_Directives_Expression(), this.getvariable(), null, "expression", null, 0, 1, Assembler_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssembler_Directives_Expression2(), this.getvariable(), null, "expression2", null, 0, 1, Assembler_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, Assembler_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, Assembler_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assembler_Directives_macroEClass, Assembler_Directives_macro.class, "Assembler_Directives_macro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssembler_Directives_macro_Expression(), this.getdefinition(), null, "expression", null, 0, 1, Assembler_Directives_macro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssembler_Directives_macro_Definition(), this.getdefinition(), null, "definition", null, 0, 1, Assembler_Directives_macro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_macro_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, Assembler_Directives_macro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_macro_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, Assembler_Directives_macro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assember_Directives_typeEClass, Assember_Directives_type.class, "Assember_Directives_type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssember_Directives_type_Expression(), this.getvariable(), null, "expression", null, 0, -1, Assember_Directives_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssember_Directives_type_Description(), this.getdescription(), null, "description", null, 0, -1, Assember_Directives_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssember_Directives_type_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, Assember_Directives_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssember_Directives_type_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, Assember_Directives_type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assembler_Directives_endmEClass, Assembler_Directives_endm.class, "Assembler_Directives_endm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssembler_Directives_endm_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, Assembler_Directives_endm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssembler_Directives_endm_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, Assembler_Directives_endm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arM_Machine_DirectivesEClass, ARM_Machine_Directives.class, "ARM_Machine_Directives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getARM_Machine_Directives_Expression(), this.getvariable(), null, "expression", null, 0, 1, ARM_Machine_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getARM_Machine_Directives_Expression2(), this.getvariable(), null, "expression2", null, 0, 1, ARM_Machine_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, ARM_Machine_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, ARM_Machine_Directives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arM_MACHINE_DIRECTIVES_alignEClass, ARM_MACHINE_DIRECTIVES_align.class, "ARM_MACHINE_DIRECTIVES_align", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getARM_MACHINE_DIRECTIVES_align_Int(), ecorePackage.getEString(), "int", null, 0, 1, ARM_MACHINE_DIRECTIVES_align.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_MACHINE_DIRECTIVES_align_Hex(), ecorePackage.getEString(), "hex", null, 0, 1, ARM_MACHINE_DIRECTIVES_align.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_MACHINE_DIRECTIVES_align_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, ARM_MACHINE_DIRECTIVES_align.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_MACHINE_DIRECTIVES_align_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, ARM_MACHINE_DIRECTIVES_align.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arM_Machine_Directives_codeEClass, ARM_Machine_Directives_code.class, "ARM_Machine_Directives_code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getARM_Machine_Directives_code_Arm(), ecorePackage.getEBoolean(), "arm", null, 0, 1, ARM_Machine_Directives_code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_code_Thumb(), ecorePackage.getEBoolean(), "thumb", null, 0, 1, ARM_Machine_Directives_code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_code_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, ARM_Machine_Directives_code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_code_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, ARM_Machine_Directives_code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arM_Machine_Directives_syntaxEClass, ARM_Machine_Directives_syntax.class, "ARM_Machine_Directives_syntax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getARM_Machine_Directives_syntax_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, ARM_Machine_Directives_syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_syntax_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, ARM_Machine_Directives_syntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arM_Machine_Directives_saveEClass, ARM_Machine_Directives_save.class, "ARM_Machine_Directives_save", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getARM_Machine_Directives_save_Reglist(), ecorePackage.getEString(), "reglist", null, 0, -1, ARM_Machine_Directives_save.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_save_ReglistNum(), ecorePackage.getEString(), "reglistNum", null, 0, -1, ARM_Machine_Directives_save.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getARM_Machine_Directives_save_Register(), this.getREGISTER(), null, "register", null, 0, -1, ARM_Machine_Directives_save.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_save_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, ARM_Machine_Directives_save.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getARM_Machine_Directives_save_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, ARM_Machine_Directives_save.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cExtendascizEClass, CExtendasciz.class, "CExtendasciz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCExtendasciz_Expression(), this.getvariable(), null, "expression", null, 0, 1, CExtendasciz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCExtendasciz_Dot(), ecorePackage.getEBoolean(), "dot", null, 0, 1, CExtendasciz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCExtendasciz_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, CExtendasciz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cLangEClass, CLang.class, "CLang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCLang_Expression(), this.getvariable(), null, "expression", null, 0, 1, CLang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCLang_Code(), ecorePackage.getEBoolean(), "code", null, 0, 1, CLang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registerEClass, org.xtext.aRM.REGISTER.class, "REGISTER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getREGISTER_R0(), ecorePackage.getEBoolean(), "r0", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R1(), ecorePackage.getEBoolean(), "r1", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R2(), ecorePackage.getEBoolean(), "r2", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R3(), ecorePackage.getEBoolean(), "r3", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R4(), ecorePackage.getEBoolean(), "r4", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R5(), ecorePackage.getEBoolean(), "r5", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R6(), ecorePackage.getEBoolean(), "r6", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R7(), ecorePackage.getEBoolean(), "r7", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R8(), ecorePackage.getEBoolean(), "r8", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R9(), ecorePackage.getEBoolean(), "r9", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R10(), ecorePackage.getEBoolean(), "r10", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R11(), ecorePackage.getEBoolean(), "r11", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R12(), ecorePackage.getEBoolean(), "r12", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R13(), ecorePackage.getEBoolean(), "r13", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R14(), ecorePackage.getEBoolean(), "r14", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R15(), ecorePackage.getEBoolean(), "r15", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_Rfp(), ecorePackage.getEBoolean(), "rfp", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_Rip(), ecorePackage.getEBoolean(), "rip", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_Rsp(), ecorePackage.getEBoolean(), "rsp", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_Rlr(), ecorePackage.getEBoolean(), "rlr", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_Rpc(), ecorePackage.getEBoolean(), "rpc", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R001(), ecorePackage.getEBoolean(), "R001", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R01(), ecorePackage.getEBoolean(), "R01", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R02(), ecorePackage.getEBoolean(), "R02", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R03(), ecorePackage.getEBoolean(), "R03", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R04(), ecorePackage.getEBoolean(), "R04", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R05(), ecorePackage.getEBoolean(), "R05", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R06(), ecorePackage.getEBoolean(), "R06", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R07(), ecorePackage.getEBoolean(), "R07", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R08(), ecorePackage.getEBoolean(), "R08", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R09(), ecorePackage.getEBoolean(), "R09", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R010(), ecorePackage.getEBoolean(), "R010", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R011(), ecorePackage.getEBoolean(), "R011", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R012(), ecorePackage.getEBoolean(), "R012", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R013(), ecorePackage.getEBoolean(), "R013", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R014(), ecorePackage.getEBoolean(), "R014", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R015(), ecorePackage.getEBoolean(), "R015", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R0FP(), ecorePackage.getEBoolean(), "R0FP", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R0IP(), ecorePackage.getEBoolean(), "R0IP", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R0SP(), ecorePackage.getEBoolean(), "R0SP", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R0LR(), ecorePackage.getEBoolean(), "R0LR", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getREGISTER_R0PC(), ecorePackage.getEBoolean(), "R0PC", null, 0, 1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getREGISTER_Opsh(), this.getopsh(), null, "opsh", null, 0, -1, org.xtext.aRM.REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bareL_SHIFT_REGISTEREClass, org.xtext.aRM.BAREL_SHIFT_REGISTER.class, "BAREL_SHIFT_REGISTER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBAREL_SHIFT_REGISTER_BAREL_SHIFT_REGISTER(), ecorePackage.getEBoolean(), "BAREL_SHIFT_REGISTER", null, 0, 1, org.xtext.aRM.BAREL_SHIFT_REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBAREL_SHIFT_REGISTER_Register(), this.getREGISTER(), null, "register", null, 0, -1, org.xtext.aRM.BAREL_SHIFT_REGISTER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operand2EClass, Operand2.class, "Operand2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(opshEClass, opsh.class, "opsh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(immediate_labelEClass, immediate_label.class, "immediate_label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getimmediate_label_Literal_numeric(), this.getliteral_numeric(), null, "literal_numeric", null, 0, -1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getimmediate_label_Numeric_backward_forward(), this.getnumeric_backward_forward(), null, "numeric_backward_forward", null, 0, -1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getimmediate_label_Label(), ecorePackage.getEString(), "label", null, 0, 1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getimmediate_label_Num2(), ecorePackage.getEString(), "num2", null, 0, 1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getimmediate_label_Label2(), ecorePackage.getEString(), "label2", null, 0, 1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getimmediate_label_Num(), ecorePackage.getEString(), "num", null, 0, 1, immediate_label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, description.class, "description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdescription_Int(), ecorePackage.getEString(), "int", null, 0, -1, description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdescription_String(), ecorePackage.getEString(), "string", null, 0, -1, description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdescription_Description(), ecorePackage.getEString(), "description", null, 0, -1, description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, variable.class, "variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvariable_VariableInt(), ecorePackage.getEString(), "variableInt", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariable_VariableABC(), ecorePackage.getEString(), "variableABC", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariable_VariableString(), ecorePackage.getEString(), "variableString", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvariable_VariableHex(), ecorePackage.getEString(), "variableHex", null, 0, 1, variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, definition.class, "definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdefinition_VariableInt(), ecorePackage.getEString(), "variableInt", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_VariableABC(), ecorePackage.getEString(), "variableABC", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_VariableString(), ecorePackage.getEString(), "variableString", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_VariableHex(), ecorePackage.getEString(), "variableHex", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_DefInt(), ecorePackage.getEString(), "defInt", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_DefABC(), ecorePackage.getEString(), "defABC", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_DefString(), ecorePackage.getEString(), "defString", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getdefinition_DefHex(), ecorePackage.getEString(), "defHex", null, 0, 1, definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(randomEntryEClass, randomEntry.class, "randomEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrandomEntry_EntryInt(), ecorePackage.getEString(), "entryInt", null, 0, 1, randomEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrandomEntry_EntryABC(), ecorePackage.getEString(), "entryABC", null, 0, 1, randomEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrandomEntry_EntryString(), ecorePackage.getEString(), "entryString", null, 0, 1, randomEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrandomEntry_EntryHex(), ecorePackage.getEString(), "entryHex", null, 0, 1, randomEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rs_shEClass, rs_sh.class, "rs_sh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrs_sh_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, rs_sh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flexible_offsetEClass, flexible_offset.class, "flexible_offset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getflexible_offset_Expr(), ecorePackage.getEString(), "expr", null, 0, 1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getflexible_offset_Expr2(), ecorePackage.getEString(), "expr2", null, 0, 1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getflexible_offset_Register(), this.getREGISTER(), null, "register", null, 0, -1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getflexible_offset_BAREL_SHIFT_REGISTER(), this.getBAREL_SHIFT_REGISTER(), null, "BAREL_SHIFT_REGISTER", null, 0, -1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getflexible_offset_Immediate_label(), this.getimmediate_label(), null, "immediate_label", null, 0, -1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getflexible_offset_Num(), ecorePackage.getEString(), "num", null, 0, 1, flexible_offset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literal_numericEClass, literal_numeric.class, "literal_numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getliteral_numeric_Hex(), ecorePackage.getEString(), "hex", null, 0, 1, literal_numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getliteral_numeric_Int(), ecorePackage.getEString(), "int", null, 0, 1, literal_numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeric_backward_forwardEClass, numeric_backward_forward.class, "numeric_backward_forward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnumeric_backward_forward_Hex(), ecorePackage.getEString(), "hex", null, 0, 1, numeric_backward_forward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getnumeric_backward_forward_Int(), ecorePackage.getEString(), "int", null, 0, 1, numeric_backward_forward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ARMPackageImpl
