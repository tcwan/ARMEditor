/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.aRM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ARMFactoryImpl extends EFactoryImpl implements ARMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ARMFactory init()
  {
    try
    {
      ARMFactory theARMFactory = (ARMFactory)EPackage.Registry.INSTANCE.getEFactory(ARMPackage.eNS_URI);
      if (theARMFactory != null)
      {
        return theARMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ARMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ARMPackage.MODEL: return createModel();
      case ARMPackage.ARM_INSTR: return createARMInstr();
      case ARMPackage.OPERATION_INSTR: return createOperationInstr();
      case ARMPackage.CCODE: return createCcode();
      case ARMPackage.VARIABLE_VARIABLE: return createvariable_variable();
      case ARMPackage.VARIABLE_COLON: return createvariable_colon();
      case ARMPackage.LABEL_KEYWORD: return createlabel_keyword();
      case ARMPackage.ADD_SUB_INSTR: return createadd_sub_instr();
      case ARMPackage.ADRL_ADR_INSTR: return createadrl_adr_instr();
      case ARMPackage.MUL_3R_INSTR: return createmul_3R_instr();
      case ARMPackage.MUL_4R_INSTR: return createmul_4R_instr();
      case ARMPackage.MOV_INSTR: return createmov_instr();
      case ARMPackage.SHIFT_INSTR: return createshift_instr();
      case ARMPackage.CLZ_INSTR: return createclz_instr();
      case ARMPackage.COMPARE_TEST_INSTR: return createcompare_test_instr();
      case ARMPackage.LOGICAL_INSTR: return createlogical_instr();
      case ARMPackage.BRANCH_INSTR: return createbranch_instr();
      case ARMPackage.MRS_INSTR: return createmrs_instr();
      case ARMPackage.MSR_INSTR: return createmsr_instr();
      case ARMPackage.LDR_STR_IRPRE_INSTR: return createldr_str_irpre_instr();
      case ARMPackage.LDR_STR_SPRE_INSTR: return createldr_str_spre_instr();
      case ARMPackage.LDR_STR_IRPSOT_INSTR: return createldr_str_irpsot_instr();
      case ARMPackage.LDR_STR_RPOST_INSTR: return createldr_str_rpost_instr();
      case ARMPackage.LDM_INSTR: return createldm_instr();
      case ARMPackage.PUSH_POP_INSTR: return createpush_pop_instr();
      case ARMPackage.BKPT_INSTR: return createbkpt_instr();
      case ARMPackage.SWP_INSTR: return createswp_instr();
      case ARMPackage.SVC_INSTR: return createsvc_instr();
      case ARMPackage.ADD_OP: return createADD_OP();
      case ARMPackage.ADC_OP: return createADC_OP();
      case ARMPackage.ADR_OP: return createADR_OP();
      case ARMPackage.SUB_OP: return createSUB_OP();
      case ARMPackage.SBC_OP: return createSBC_OP();
      case ARMPackage.RSB_OP: return createRSB_OP();
      case ARMPackage.RSC_OP: return createRSC_OP();
      case ARMPackage.ADRL_OP: return createADRL_OP();
      case ARMPackage.MUL_OP: return createMUL_OP();
      case ARMPackage.MLS_OP: return createMLS_OP();
      case ARMPackage.MLA_OP: return createMLA_OP();
      case ARMPackage.UMULL_OP: return createUMULL_OP();
      case ARMPackage.UMLAL_OP: return createUMLAL_OP();
      case ARMPackage.SMULL_OP: return createSMULL_OP();
      case ARMPackage.SMLAL_OP: return createSMLAL_OP();
      case ARMPackage.SMUL_OP: return createSMUL_OP();
      case ARMPackage.SMULW_OP: return createSMULW_OP();
      case ARMPackage.SMLA_OP: return createSMLA_OP();
      case ARMPackage.SMLAW_OP: return createSMLAW_OP();
      case ARMPackage.MOV_OP: return createMOV_OP();
      case ARMPackage.MVN_OP: return createMVN_OP();
      case ARMPackage.ASR_OP: return createASR_OP();
      case ARMPackage.LSL_OP: return createLSL_OP();
      case ARMPackage.LSR_OP: return createLSR_OP();
      case ARMPackage.ROR_OP: return createROR_OP();
      case ARMPackage.RRX_OP: return createRRX_OP();
      case ARMPackage.CLZ_OP: return createCLZ_OP();
      case ARMPackage.CMP_OP: return createCMP_OP();
      case ARMPackage.CMN_OP: return createCMN_OP();
      case ARMPackage.TST_OP: return createTST_OP();
      case ARMPackage.TEQ_OP: return createTEQ_OP();
      case ARMPackage.AND_OP: return createAND_OP();
      case ARMPackage.EOR_OP: return createEOR_OP();
      case ARMPackage.ORR_OP: return createORR_OP();
      case ARMPackage.ORN_OP: return createORN_OP();
      case ARMPackage.BIC_OP: return createBIC_OP();
      case ARMPackage.BOP: return createB_OP();
      case ARMPackage.BL_OP: return createBL_OP();
      case ARMPackage.BX_OP: return createBX_OP();
      case ARMPackage.BLX_OP: return createBLX_OP();
      case ARMPackage.BXJ_OP: return createBXJ_OP();
      case ARMPackage.MRS_OP: return createMRS_OP();
      case ARMPackage.MSR_OP: return createMSR_OP();
      case ARMPackage.LDR_OP: return createLDR_OP();
      case ARMPackage.STR_OP: return createSTR_OP();
      case ARMPackage.LDM_OP: return createLDM_OP();
      case ARMPackage.STM_OP: return createSTM_OP();
      case ARMPackage.PUSH_OP: return createPUSH_OP();
      case ARMPackage.POP_OP: return createPOP_OP();
      case ARMPackage.SWP_OP: return createSWP_OP();
      case ARMPackage.SWPB_OP: return createSWPB_OP();
      case ARMPackage.SVC_OP: return createSVC_OP();
      case ARMPackage.PSR_FIELD_E: return createPSR_FIELD_E();
      case ARMPackage.APSR_FLAG_E: return createAPSR_FLAG_E();
      case ARMPackage.NOP: return createNOP();
      case ARMPackage.PREPROCESSOR: return createPREPROCESSOR();
      case ARMPackage.PREPROCESSOR_DEFINE: return createPREPROCESSOR_DEFINE();
      case ARMPackage.PREPROCESSOR_ENDIF: return createPREPROCESSOR_ENDIF();
      case ARMPackage.PREPROCESSOR_ELSE: return createPREPROCESSOR_ELSE();
      case ARMPackage.CEXTEND_CODE: return createCExtendCode();
      case ARMPackage.ASSEMBLER_DIRECTIVES_EQU: return createAssembler_Directives_equ();
      case ARMPackage.ASSEMBLER_DIRECTIVES: return createAssembler_Directives();
      case ARMPackage.ASSEMBLER_DIRECTIVES_MACRO: return createAssembler_Directives_macro();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE: return createAssember_Directives_type();
      case ARMPackage.ASSEMBLER_DIRECTIVES_ENDM: return createAssembler_Directives_endm();
      case ARMPackage.ARM_MACHINE_DIRECTIVES: return createARM_Machine_Directives();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN: return createARM_MACHINE_DIRECTIVES_align();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE: return createARM_Machine_Directives_code();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SYNTAX: return createARM_Machine_Directives_syntax();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE: return createARM_Machine_Directives_save();
      case ARMPackage.CEXTENDASCIZ: return createCExtendasciz();
      case ARMPackage.CLANG: return createCLang();
      case ARMPackage.REGISTER: return createREGISTER();
      case ARMPackage.BAREL_SHIFT_REGISTER: return createBAREL_SHIFT_REGISTER();
      case ARMPackage.OPERAND2: return createOperand2();
      case ARMPackage.OPSH: return createopsh();
      case ARMPackage.IMMEDIATE_LABEL: return createimmediate_label();
      case ARMPackage.DESCRIPTION: return createdescription();
      case ARMPackage.VARIABLE: return createvariable();
      case ARMPackage.DEFINITION: return createdefinition();
      case ARMPackage.RANDOM_ENTRY: return createrandomEntry();
      case ARMPackage.RS_SH: return creaters_sh();
      case ARMPackage.FLEXIBLE_OFFSET: return createflexible_offset();
      case ARMPackage.LITERAL_NUMERIC: return createliteral_numeric();
      case ARMPackage.NUMERIC_BACKWARD_FORWARD: return createnumeric_backward_forward();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMInstr createARMInstr()
  {
    ARMInstrImpl armInstr = new ARMInstrImpl();
    return armInstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationInstr createOperationInstr()
  {
    OperationInstrImpl operationInstr = new OperationInstrImpl();
    return operationInstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ccode createCcode()
  {
    CcodeImpl ccode = new CcodeImpl();
    return ccode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_variable createvariable_variable()
  {
    variable_variableImpl variable_variable = new variable_variableImpl();
    return variable_variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_colon createvariable_colon()
  {
    variable_colonImpl variable_colon = new variable_colonImpl();
    return variable_colon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_keyword createlabel_keyword()
  {
    label_keywordImpl label_keyword = new label_keywordImpl();
    return label_keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public add_sub_instr createadd_sub_instr()
  {
    add_sub_instrImpl add_sub_instr = new add_sub_instrImpl();
    return add_sub_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public adrl_adr_instr createadrl_adr_instr()
  {
    adrl_adr_instrImpl adrl_adr_instr = new adrl_adr_instrImpl();
    return adrl_adr_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mul_3R_instr createmul_3R_instr()
  {
    mul_3R_instrImpl mul_3R_instr = new mul_3R_instrImpl();
    return mul_3R_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mul_4R_instr createmul_4R_instr()
  {
    mul_4R_instrImpl mul_4R_instr = new mul_4R_instrImpl();
    return mul_4R_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mov_instr createmov_instr()
  {
    mov_instrImpl mov_instr = new mov_instrImpl();
    return mov_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shift_instr createshift_instr()
  {
    shift_instrImpl shift_instr = new shift_instrImpl();
    return shift_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public clz_instr createclz_instr()
  {
    clz_instrImpl clz_instr = new clz_instrImpl();
    return clz_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compare_test_instr createcompare_test_instr()
  {
    compare_test_instrImpl compare_test_instr = new compare_test_instrImpl();
    return compare_test_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_instr createlogical_instr()
  {
    logical_instrImpl logical_instr = new logical_instrImpl();
    return logical_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public branch_instr createbranch_instr()
  {
    branch_instrImpl branch_instr = new branch_instrImpl();
    return branch_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mrs_instr createmrs_instr()
  {
    mrs_instrImpl mrs_instr = new mrs_instrImpl();
    return mrs_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public msr_instr createmsr_instr()
  {
    msr_instrImpl msr_instr = new msr_instrImpl();
    return msr_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldr_str_irpre_instr createldr_str_irpre_instr()
  {
    ldr_str_irpre_instrImpl ldr_str_irpre_instr = new ldr_str_irpre_instrImpl();
    return ldr_str_irpre_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldr_str_spre_instr createldr_str_spre_instr()
  {
    ldr_str_spre_instrImpl ldr_str_spre_instr = new ldr_str_spre_instrImpl();
    return ldr_str_spre_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldr_str_irpsot_instr createldr_str_irpsot_instr()
  {
    ldr_str_irpsot_instrImpl ldr_str_irpsot_instr = new ldr_str_irpsot_instrImpl();
    return ldr_str_irpsot_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldr_str_rpost_instr createldr_str_rpost_instr()
  {
    ldr_str_rpost_instrImpl ldr_str_rpost_instr = new ldr_str_rpost_instrImpl();
    return ldr_str_rpost_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldm_instr createldm_instr()
  {
    ldm_instrImpl ldm_instr = new ldm_instrImpl();
    return ldm_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public push_pop_instr createpush_pop_instr()
  {
    push_pop_instrImpl push_pop_instr = new push_pop_instrImpl();
    return push_pop_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bkpt_instr createbkpt_instr()
  {
    bkpt_instrImpl bkpt_instr = new bkpt_instrImpl();
    return bkpt_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public swp_instr createswp_instr()
  {
    swp_instrImpl swp_instr = new swp_instrImpl();
    return swp_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public svc_instr createsvc_instr()
  {
    svc_instrImpl svc_instr = new svc_instrImpl();
    return svc_instr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADD_OP createADD_OP()
  {
    ADD_OPImpl adD_OP = new ADD_OPImpl();
    return adD_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADC_OP createADC_OP()
  {
    ADC_OPImpl adC_OP = new ADC_OPImpl();
    return adC_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADR_OP createADR_OP()
  {
    ADR_OPImpl adR_OP = new ADR_OPImpl();
    return adR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUB_OP createSUB_OP()
  {
    SUB_OPImpl suB_OP = new SUB_OPImpl();
    return suB_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SBC_OP createSBC_OP()
  {
    SBC_OPImpl sbC_OP = new SBC_OPImpl();
    return sbC_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSB_OP createRSB_OP()
  {
    RSB_OPImpl rsB_OP = new RSB_OPImpl();
    return rsB_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSC_OP createRSC_OP()
  {
    RSC_OPImpl rsC_OP = new RSC_OPImpl();
    return rsC_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADRL_OP createADRL_OP()
  {
    ADRL_OPImpl adrL_OP = new ADRL_OPImpl();
    return adrL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MUL_OP createMUL_OP()
  {
    MUL_OPImpl muL_OP = new MUL_OPImpl();
    return muL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLS_OP createMLS_OP()
  {
    MLS_OPImpl mlS_OP = new MLS_OPImpl();
    return mlS_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLA_OP createMLA_OP()
  {
    MLA_OPImpl mlA_OP = new MLA_OPImpl();
    return mlA_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UMULL_OP createUMULL_OP()
  {
    UMULL_OPImpl umulL_OP = new UMULL_OPImpl();
    return umulL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UMLAL_OP createUMLAL_OP()
  {
    UMLAL_OPImpl umlaL_OP = new UMLAL_OPImpl();
    return umlaL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMULL_OP createSMULL_OP()
  {
    SMULL_OPImpl smulL_OP = new SMULL_OPImpl();
    return smulL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMLAL_OP createSMLAL_OP()
  {
    SMLAL_OPImpl smlaL_OP = new SMLAL_OPImpl();
    return smlaL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMUL_OP createSMUL_OP()
  {
    SMUL_OPImpl smuL_OP = new SMUL_OPImpl();
    return smuL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMULW_OP createSMULW_OP()
  {
    SMULW_OPImpl smulW_OP = new SMULW_OPImpl();
    return smulW_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMLA_OP createSMLA_OP()
  {
    SMLA_OPImpl smlA_OP = new SMLA_OPImpl();
    return smlA_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMLAW_OP createSMLAW_OP()
  {
    SMLAW_OPImpl smlaW_OP = new SMLAW_OPImpl();
    return smlaW_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOV_OP createMOV_OP()
  {
    MOV_OPImpl moV_OP = new MOV_OPImpl();
    return moV_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MVN_OP createMVN_OP()
  {
    MVN_OPImpl mvN_OP = new MVN_OPImpl();
    return mvN_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASR_OP createASR_OP()
  {
    ASR_OPImpl asR_OP = new ASR_OPImpl();
    return asR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSL_OP createLSL_OP()
  {
    LSL_OPImpl lsL_OP = new LSL_OPImpl();
    return lsL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSR_OP createLSR_OP()
  {
    LSR_OPImpl lsR_OP = new LSR_OPImpl();
    return lsR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ROR_OP createROR_OP()
  {
    ROR_OPImpl roR_OP = new ROR_OPImpl();
    return roR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RRX_OP createRRX_OP()
  {
    RRX_OPImpl rrX_OP = new RRX_OPImpl();
    return rrX_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLZ_OP createCLZ_OP()
  {
    CLZ_OPImpl clZ_OP = new CLZ_OPImpl();
    return clZ_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMP_OP createCMP_OP()
  {
    CMP_OPImpl cmP_OP = new CMP_OPImpl();
    return cmP_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CMN_OP createCMN_OP()
  {
    CMN_OPImpl cmN_OP = new CMN_OPImpl();
    return cmN_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TST_OP createTST_OP()
  {
    TST_OPImpl tsT_OP = new TST_OPImpl();
    return tsT_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TEQ_OP createTEQ_OP()
  {
    TEQ_OPImpl teQ_OP = new TEQ_OPImpl();
    return teQ_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AND_OP createAND_OP()
  {
    AND_OPImpl anD_OP = new AND_OPImpl();
    return anD_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOR_OP createEOR_OP()
  {
    EOR_OPImpl eoR_OP = new EOR_OPImpl();
    return eoR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORR_OP createORR_OP()
  {
    ORR_OPImpl orR_OP = new ORR_OPImpl();
    return orR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORN_OP createORN_OP()
  {
    ORN_OPImpl orN_OP = new ORN_OPImpl();
    return orN_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BIC_OP createBIC_OP()
  {
    BIC_OPImpl biC_OP = new BIC_OPImpl();
    return biC_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public B_OP createB_OP()
  {
    B_OPImpl b_OP = new B_OPImpl();
    return b_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BL_OP createBL_OP()
  {
    BL_OPImpl bL_OP = new BL_OPImpl();
    return bL_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BX_OP createBX_OP()
  {
    BX_OPImpl bX_OP = new BX_OPImpl();
    return bX_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BLX_OP createBLX_OP()
  {
    BLX_OPImpl blX_OP = new BLX_OPImpl();
    return blX_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BXJ_OP createBXJ_OP()
  {
    BXJ_OPImpl bxJ_OP = new BXJ_OPImpl();
    return bxJ_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MRS_OP createMRS_OP()
  {
    MRS_OPImpl mrS_OP = new MRS_OPImpl();
    return mrS_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MSR_OP createMSR_OP()
  {
    MSR_OPImpl msR_OP = new MSR_OPImpl();
    return msR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDR_OP createLDR_OP()
  {
    LDR_OPImpl ldR_OP = new LDR_OPImpl();
    return ldR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STR_OP createSTR_OP()
  {
    STR_OPImpl stR_OP = new STR_OPImpl();
    return stR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDM_OP createLDM_OP()
  {
    LDM_OPImpl ldM_OP = new LDM_OPImpl();
    return ldM_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STM_OP createSTM_OP()
  {
    STM_OPImpl stM_OP = new STM_OPImpl();
    return stM_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PUSH_OP createPUSH_OP()
  {
    PUSH_OPImpl pusH_OP = new PUSH_OPImpl();
    return pusH_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POP_OP createPOP_OP()
  {
    POP_OPImpl poP_OP = new POP_OPImpl();
    return poP_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWP_OP createSWP_OP()
  {
    SWP_OPImpl swP_OP = new SWP_OPImpl();
    return swP_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SWPB_OP createSWPB_OP()
  {
    SWPB_OPImpl swpB_OP = new SWPB_OPImpl();
    return swpB_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SVC_OP createSVC_OP()
  {
    SVC_OPImpl svC_OP = new SVC_OPImpl();
    return svC_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PSR_FIELD_E createPSR_FIELD_E()
  {
    PSR_FIELD_EImpl psR_FIELD_E = new PSR_FIELD_EImpl();
    return psR_FIELD_E;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public APSR_FLAG_E createAPSR_FLAG_E()
  {
    APSR_FLAG_EImpl apsR_FLAG_E = new APSR_FLAG_EImpl();
    return apsR_FLAG_E;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NOP createNOP()
  {
    NOPImpl nop = new NOPImpl();
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREPROCESSOR createPREPROCESSOR()
  {
    PREPROCESSORImpl preprocessor = new PREPROCESSORImpl();
    return preprocessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREPROCESSOR_DEFINE createPREPROCESSOR_DEFINE()
  {
    PREPROCESSOR_DEFINEImpl preprocessoR_DEFINE = new PREPROCESSOR_DEFINEImpl();
    return preprocessoR_DEFINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREPROCESSOR_ENDIF createPREPROCESSOR_ENDIF()
  {
    PREPROCESSOR_ENDIFImpl preprocessoR_ENDIF = new PREPROCESSOR_ENDIFImpl();
    return preprocessoR_ENDIF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PREPROCESSOR_ELSE createPREPROCESSOR_ELSE()
  {
    PREPROCESSOR_ELSEImpl preprocessoR_ELSE = new PREPROCESSOR_ELSEImpl();
    return preprocessoR_ELSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CExtendCode createCExtendCode()
  {
    CExtendCodeImpl cExtendCode = new CExtendCodeImpl();
    return cExtendCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembler_Directives_equ createAssembler_Directives_equ()
  {
    Assembler_Directives_equImpl assembler_Directives_equ = new Assembler_Directives_equImpl();
    return assembler_Directives_equ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembler_Directives createAssembler_Directives()
  {
    Assembler_DirectivesImpl assembler_Directives = new Assembler_DirectivesImpl();
    return assembler_Directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembler_Directives_macro createAssembler_Directives_macro()
  {
    Assembler_Directives_macroImpl assembler_Directives_macro = new Assembler_Directives_macroImpl();
    return assembler_Directives_macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assember_Directives_type createAssember_Directives_type()
  {
    Assember_Directives_typeImpl assember_Directives_type = new Assember_Directives_typeImpl();
    return assember_Directives_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assembler_Directives_endm createAssembler_Directives_endm()
  {
    Assembler_Directives_endmImpl assembler_Directives_endm = new Assembler_Directives_endmImpl();
    return assembler_Directives_endm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARM_Machine_Directives createARM_Machine_Directives()
  {
    ARM_Machine_DirectivesImpl arM_Machine_Directives = new ARM_Machine_DirectivesImpl();
    return arM_Machine_Directives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARM_MACHINE_DIRECTIVES_align createARM_MACHINE_DIRECTIVES_align()
  {
    ARM_MACHINE_DIRECTIVES_alignImpl arM_MACHINE_DIRECTIVES_align = new ARM_MACHINE_DIRECTIVES_alignImpl();
    return arM_MACHINE_DIRECTIVES_align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARM_Machine_Directives_code createARM_Machine_Directives_code()
  {
    ARM_Machine_Directives_codeImpl arM_Machine_Directives_code = new ARM_Machine_Directives_codeImpl();
    return arM_Machine_Directives_code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARM_Machine_Directives_syntax createARM_Machine_Directives_syntax()
  {
    ARM_Machine_Directives_syntaxImpl arM_Machine_Directives_syntax = new ARM_Machine_Directives_syntaxImpl();
    return arM_Machine_Directives_syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARM_Machine_Directives_save createARM_Machine_Directives_save()
  {
    ARM_Machine_Directives_saveImpl arM_Machine_Directives_save = new ARM_Machine_Directives_saveImpl();
    return arM_Machine_Directives_save;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CExtendasciz createCExtendasciz()
  {
    CExtendascizImpl cExtendasciz = new CExtendascizImpl();
    return cExtendasciz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLang createCLang()
  {
    CLangImpl cLang = new CLangImpl();
    return cLang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGISTER createREGISTER()
  {
    REGISTERImpl register = new REGISTERImpl();
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BAREL_SHIFT_REGISTER createBAREL_SHIFT_REGISTER()
  {
    BAREL_SHIFT_REGISTERImpl bareL_SHIFT_REGISTER = new BAREL_SHIFT_REGISTERImpl();
    return bareL_SHIFT_REGISTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand2 createOperand2()
  {
    Operand2Impl operand2 = new Operand2Impl();
    return operand2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public opsh createopsh()
  {
    opshImpl opsh = new opshImpl();
    return opsh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public immediate_label createimmediate_label()
  {
    immediate_labelImpl immediate_label = new immediate_labelImpl();
    return immediate_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public description createdescription()
  {
    descriptionImpl description = new descriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public definition createdefinition()
  {
    definitionImpl definition = new definitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public randomEntry createrandomEntry()
  {
    randomEntryImpl randomEntry = new randomEntryImpl();
    return randomEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rs_sh creaters_sh()
  {
    rs_shImpl rs_sh = new rs_shImpl();
    return rs_sh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public flexible_offset createflexible_offset()
  {
    flexible_offsetImpl flexible_offset = new flexible_offsetImpl();
    return flexible_offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal_numeric createliteral_numeric()
  {
    literal_numericImpl literal_numeric = new literal_numericImpl();
    return literal_numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public numeric_backward_forward createnumeric_backward_forward()
  {
    numeric_backward_forwardImpl numeric_backward_forward = new numeric_backward_forwardImpl();
    return numeric_backward_forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMPackage getARMPackage()
  {
    return (ARMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ARMPackage getPackage()
  {
    return ARMPackage.eINSTANCE;
  }

} //ARMFactoryImpl
