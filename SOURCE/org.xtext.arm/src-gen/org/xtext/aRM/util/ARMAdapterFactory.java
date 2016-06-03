/**
 */
package org.xtext.aRM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.aRM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.aRM.ARMPackage
 * @generated
 */
public class ARMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ARMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ARMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ARMSwitch<Adapter> modelSwitch =
    new ARMSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseARMInstr(ARMInstr object)
      {
        return createARMInstrAdapter();
      }
      @Override
      public Adapter caseOperationInstr(OperationInstr object)
      {
        return createOperationInstrAdapter();
      }
      @Override
      public Adapter caseCcode(Ccode object)
      {
        return createCcodeAdapter();
      }
      @Override
      public Adapter casevariable_variable(variable_variable object)
      {
        return createvariable_variableAdapter();
      }
      @Override
      public Adapter casevariable_colon(variable_colon object)
      {
        return createvariable_colonAdapter();
      }
      @Override
      public Adapter caselabel_keyword(label_keyword object)
      {
        return createlabel_keywordAdapter();
      }
      @Override
      public Adapter caseadd_sub_instr(add_sub_instr object)
      {
        return createadd_sub_instrAdapter();
      }
      @Override
      public Adapter caseadrl_adr_instr(adrl_adr_instr object)
      {
        return createadrl_adr_instrAdapter();
      }
      @Override
      public Adapter casemul_3R_instr(mul_3R_instr object)
      {
        return createmul_3R_instrAdapter();
      }
      @Override
      public Adapter casemul_4R_instr(mul_4R_instr object)
      {
        return createmul_4R_instrAdapter();
      }
      @Override
      public Adapter casemov_instr(mov_instr object)
      {
        return createmov_instrAdapter();
      }
      @Override
      public Adapter caseshift_instr(shift_instr object)
      {
        return createshift_instrAdapter();
      }
      @Override
      public Adapter caseclz_instr(clz_instr object)
      {
        return createclz_instrAdapter();
      }
      @Override
      public Adapter casecompare_test_instr(compare_test_instr object)
      {
        return createcompare_test_instrAdapter();
      }
      @Override
      public Adapter caselogical_instr(logical_instr object)
      {
        return createlogical_instrAdapter();
      }
      @Override
      public Adapter casebranch_instr(branch_instr object)
      {
        return createbranch_instrAdapter();
      }
      @Override
      public Adapter casemrs_instr(mrs_instr object)
      {
        return createmrs_instrAdapter();
      }
      @Override
      public Adapter casemsr_instr(msr_instr object)
      {
        return createmsr_instrAdapter();
      }
      @Override
      public Adapter caseldr_str_irpre_instr(ldr_str_irpre_instr object)
      {
        return createldr_str_irpre_instrAdapter();
      }
      @Override
      public Adapter caseldr_str_spre_instr(ldr_str_spre_instr object)
      {
        return createldr_str_spre_instrAdapter();
      }
      @Override
      public Adapter caseldr_str_irpsot_instr(ldr_str_irpsot_instr object)
      {
        return createldr_str_irpsot_instrAdapter();
      }
      @Override
      public Adapter caseldr_str_rpost_instr(ldr_str_rpost_instr object)
      {
        return createldr_str_rpost_instrAdapter();
      }
      @Override
      public Adapter caseldm_instr(ldm_instr object)
      {
        return createldm_instrAdapter();
      }
      @Override
      public Adapter casepush_pop_instr(push_pop_instr object)
      {
        return createpush_pop_instrAdapter();
      }
      @Override
      public Adapter casebkpt_instr(bkpt_instr object)
      {
        return createbkpt_instrAdapter();
      }
      @Override
      public Adapter caseswp_instr(swp_instr object)
      {
        return createswp_instrAdapter();
      }
      @Override
      public Adapter casesvc_instr(svc_instr object)
      {
        return createsvc_instrAdapter();
      }
      @Override
      public Adapter caseADD_OP(ADD_OP object)
      {
        return createADD_OPAdapter();
      }
      @Override
      public Adapter caseADC_OP(ADC_OP object)
      {
        return createADC_OPAdapter();
      }
      @Override
      public Adapter caseADR_OP(ADR_OP object)
      {
        return createADR_OPAdapter();
      }
      @Override
      public Adapter caseSUB_OP(SUB_OP object)
      {
        return createSUB_OPAdapter();
      }
      @Override
      public Adapter caseSBC_OP(SBC_OP object)
      {
        return createSBC_OPAdapter();
      }
      @Override
      public Adapter caseRSB_OP(RSB_OP object)
      {
        return createRSB_OPAdapter();
      }
      @Override
      public Adapter caseRSC_OP(RSC_OP object)
      {
        return createRSC_OPAdapter();
      }
      @Override
      public Adapter caseADRL_OP(ADRL_OP object)
      {
        return createADRL_OPAdapter();
      }
      @Override
      public Adapter caseMUL_OP(MUL_OP object)
      {
        return createMUL_OPAdapter();
      }
      @Override
      public Adapter caseMLS_OP(MLS_OP object)
      {
        return createMLS_OPAdapter();
      }
      @Override
      public Adapter caseMLA_OP(MLA_OP object)
      {
        return createMLA_OPAdapter();
      }
      @Override
      public Adapter caseUMULL_OP(UMULL_OP object)
      {
        return createUMULL_OPAdapter();
      }
      @Override
      public Adapter caseUMLAL_OP(UMLAL_OP object)
      {
        return createUMLAL_OPAdapter();
      }
      @Override
      public Adapter caseSMULL_OP(SMULL_OP object)
      {
        return createSMULL_OPAdapter();
      }
      @Override
      public Adapter caseSMLAL_OP(SMLAL_OP object)
      {
        return createSMLAL_OPAdapter();
      }
      @Override
      public Adapter caseSMUL_OP(SMUL_OP object)
      {
        return createSMUL_OPAdapter();
      }
      @Override
      public Adapter caseSMULW_OP(SMULW_OP object)
      {
        return createSMULW_OPAdapter();
      }
      @Override
      public Adapter caseSMLA_OP(SMLA_OP object)
      {
        return createSMLA_OPAdapter();
      }
      @Override
      public Adapter caseSMLAW_OP(SMLAW_OP object)
      {
        return createSMLAW_OPAdapter();
      }
      @Override
      public Adapter caseMOV_OP(MOV_OP object)
      {
        return createMOV_OPAdapter();
      }
      @Override
      public Adapter caseMVN_OP(MVN_OP object)
      {
        return createMVN_OPAdapter();
      }
      @Override
      public Adapter caseASR_OP(ASR_OP object)
      {
        return createASR_OPAdapter();
      }
      @Override
      public Adapter caseLSL_OP(LSL_OP object)
      {
        return createLSL_OPAdapter();
      }
      @Override
      public Adapter caseLSR_OP(LSR_OP object)
      {
        return createLSR_OPAdapter();
      }
      @Override
      public Adapter caseROR_OP(ROR_OP object)
      {
        return createROR_OPAdapter();
      }
      @Override
      public Adapter caseRRX_OP(RRX_OP object)
      {
        return createRRX_OPAdapter();
      }
      @Override
      public Adapter caseCLZ_OP(CLZ_OP object)
      {
        return createCLZ_OPAdapter();
      }
      @Override
      public Adapter caseCMP_OP(CMP_OP object)
      {
        return createCMP_OPAdapter();
      }
      @Override
      public Adapter caseCMN_OP(CMN_OP object)
      {
        return createCMN_OPAdapter();
      }
      @Override
      public Adapter caseTST_OP(TST_OP object)
      {
        return createTST_OPAdapter();
      }
      @Override
      public Adapter caseTEQ_OP(TEQ_OP object)
      {
        return createTEQ_OPAdapter();
      }
      @Override
      public Adapter caseAND_OP(AND_OP object)
      {
        return createAND_OPAdapter();
      }
      @Override
      public Adapter caseEOR_OP(EOR_OP object)
      {
        return createEOR_OPAdapter();
      }
      @Override
      public Adapter caseORR_OP(ORR_OP object)
      {
        return createORR_OPAdapter();
      }
      @Override
      public Adapter caseORN_OP(ORN_OP object)
      {
        return createORN_OPAdapter();
      }
      @Override
      public Adapter caseBIC_OP(BIC_OP object)
      {
        return createBIC_OPAdapter();
      }
      @Override
      public Adapter caseB_OP(B_OP object)
      {
        return createB_OPAdapter();
      }
      @Override
      public Adapter caseBL_OP(BL_OP object)
      {
        return createBL_OPAdapter();
      }
      @Override
      public Adapter caseBX_OP(BX_OP object)
      {
        return createBX_OPAdapter();
      }
      @Override
      public Adapter caseBLX_OP(BLX_OP object)
      {
        return createBLX_OPAdapter();
      }
      @Override
      public Adapter caseBXJ_OP(BXJ_OP object)
      {
        return createBXJ_OPAdapter();
      }
      @Override
      public Adapter caseMRS_OP(MRS_OP object)
      {
        return createMRS_OPAdapter();
      }
      @Override
      public Adapter caseMSR_OP(MSR_OP object)
      {
        return createMSR_OPAdapter();
      }
      @Override
      public Adapter caseLDR_OP(LDR_OP object)
      {
        return createLDR_OPAdapter();
      }
      @Override
      public Adapter caseSTR_OP(STR_OP object)
      {
        return createSTR_OPAdapter();
      }
      @Override
      public Adapter caseLDM_OP(LDM_OP object)
      {
        return createLDM_OPAdapter();
      }
      @Override
      public Adapter caseSTM_OP(STM_OP object)
      {
        return createSTM_OPAdapter();
      }
      @Override
      public Adapter casePUSH_OP(PUSH_OP object)
      {
        return createPUSH_OPAdapter();
      }
      @Override
      public Adapter casePOP_OP(POP_OP object)
      {
        return createPOP_OPAdapter();
      }
      @Override
      public Adapter caseSWP_OP(SWP_OP object)
      {
        return createSWP_OPAdapter();
      }
      @Override
      public Adapter caseSWPB_OP(SWPB_OP object)
      {
        return createSWPB_OPAdapter();
      }
      @Override
      public Adapter caseSVC_OP(SVC_OP object)
      {
        return createSVC_OPAdapter();
      }
      @Override
      public Adapter casePSR_FIELD_E(PSR_FIELD_E object)
      {
        return createPSR_FIELD_EAdapter();
      }
      @Override
      public Adapter caseAPSR_FLAG_E(APSR_FLAG_E object)
      {
        return createAPSR_FLAG_EAdapter();
      }
      @Override
      public Adapter caseNOP(NOP object)
      {
        return createNOPAdapter();
      }
      @Override
      public Adapter casePREPROCESSOR(PREPROCESSOR object)
      {
        return createPREPROCESSORAdapter();
      }
      @Override
      public Adapter casePREPROCESSOR_DEFINE(PREPROCESSOR_DEFINE object)
      {
        return createPREPROCESSOR_DEFINEAdapter();
      }
      @Override
      public Adapter casePREPROCESSOR_ENDIF(PREPROCESSOR_ENDIF object)
      {
        return createPREPROCESSOR_ENDIFAdapter();
      }
      @Override
      public Adapter casePREPROCESSOR_ELSE(PREPROCESSOR_ELSE object)
      {
        return createPREPROCESSOR_ELSEAdapter();
      }
      @Override
      public Adapter caseCExtendCode(CExtendCode object)
      {
        return createCExtendCodeAdapter();
      }
      @Override
      public Adapter caseAssembler_Directives_equ(Assembler_Directives_equ object)
      {
        return createAssembler_Directives_equAdapter();
      }
      @Override
      public Adapter caseAssembler_Directives(Assembler_Directives object)
      {
        return createAssembler_DirectivesAdapter();
      }
      @Override
      public Adapter caseAssembler_Directives_macro(Assembler_Directives_macro object)
      {
        return createAssembler_Directives_macroAdapter();
      }
      @Override
      public Adapter caseAssember_Directives_type(Assember_Directives_type object)
      {
        return createAssember_Directives_typeAdapter();
      }
      @Override
      public Adapter caseAssembler_Directives_endm(Assembler_Directives_endm object)
      {
        return createAssembler_Directives_endmAdapter();
      }
      @Override
      public Adapter caseARM_Machine_Directives(ARM_Machine_Directives object)
      {
        return createARM_Machine_DirectivesAdapter();
      }
      @Override
      public Adapter caseARM_MACHINE_DIRECTIVES_align(ARM_MACHINE_DIRECTIVES_align object)
      {
        return createARM_MACHINE_DIRECTIVES_alignAdapter();
      }
      @Override
      public Adapter caseARM_Machine_Directives_code(ARM_Machine_Directives_code object)
      {
        return createARM_Machine_Directives_codeAdapter();
      }
      @Override
      public Adapter caseARM_Machine_Directives_syntax(ARM_Machine_Directives_syntax object)
      {
        return createARM_Machine_Directives_syntaxAdapter();
      }
      @Override
      public Adapter caseARM_Machine_Directives_save(ARM_Machine_Directives_save object)
      {
        return createARM_Machine_Directives_saveAdapter();
      }
      @Override
      public Adapter caseCExtendasciz(CExtendasciz object)
      {
        return createCExtendascizAdapter();
      }
      @Override
      public Adapter caseCLang(CLang object)
      {
        return createCLangAdapter();
      }
      @Override
      public Adapter caseREGISTER(REGISTER object)
      {
        return createREGISTERAdapter();
      }
      @Override
      public Adapter caseBAREL_SHIFT_REGISTER(BAREL_SHIFT_REGISTER object)
      {
        return createBAREL_SHIFT_REGISTERAdapter();
      }
      @Override
      public Adapter caseOperand2(Operand2 object)
      {
        return createOperand2Adapter();
      }
      @Override
      public Adapter caseopsh(opsh object)
      {
        return createopshAdapter();
      }
      @Override
      public Adapter caseimmediate_label(immediate_label object)
      {
        return createimmediate_labelAdapter();
      }
      @Override
      public Adapter casedescription(description object)
      {
        return createdescriptionAdapter();
      }
      @Override
      public Adapter casevariable(variable object)
      {
        return createvariableAdapter();
      }
      @Override
      public Adapter casedefinition(definition object)
      {
        return createdefinitionAdapter();
      }
      @Override
      public Adapter caserandomEntry(randomEntry object)
      {
        return createrandomEntryAdapter();
      }
      @Override
      public Adapter casers_sh(rs_sh object)
      {
        return creaters_shAdapter();
      }
      @Override
      public Adapter caseflexible_offset(flexible_offset object)
      {
        return createflexible_offsetAdapter();
      }
      @Override
      public Adapter caseliteral_numeric(literal_numeric object)
      {
        return createliteral_numericAdapter();
      }
      @Override
      public Adapter casenumeric_backward_forward(numeric_backward_forward object)
      {
        return createnumeric_backward_forwardAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARMInstr <em>Instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARMInstr
   * @generated
   */
  public Adapter createARMInstrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.OperationInstr <em>Operation Instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.OperationInstr
   * @generated
   */
  public Adapter createOperationInstrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Ccode <em>Ccode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Ccode
   * @generated
   */
  public Adapter createCcodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.variable_variable <em>variable variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.variable_variable
   * @generated
   */
  public Adapter createvariable_variableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.variable_colon <em>variable colon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.variable_colon
   * @generated
   */
  public Adapter createvariable_colonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.label_keyword <em>label keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.label_keyword
   * @generated
   */
  public Adapter createlabel_keywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.add_sub_instr <em>add sub instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.add_sub_instr
   * @generated
   */
  public Adapter createadd_sub_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.adrl_adr_instr <em>adrl adr instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.adrl_adr_instr
   * @generated
   */
  public Adapter createadrl_adr_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.mul_3R_instr <em>mul 3R instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.mul_3R_instr
   * @generated
   */
  public Adapter createmul_3R_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.mul_4R_instr <em>mul 4R instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.mul_4R_instr
   * @generated
   */
  public Adapter createmul_4R_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.mov_instr <em>mov instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.mov_instr
   * @generated
   */
  public Adapter createmov_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.shift_instr <em>shift instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.shift_instr
   * @generated
   */
  public Adapter createshift_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.clz_instr <em>clz instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.clz_instr
   * @generated
   */
  public Adapter createclz_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.compare_test_instr <em>compare test instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.compare_test_instr
   * @generated
   */
  public Adapter createcompare_test_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.logical_instr <em>logical instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.logical_instr
   * @generated
   */
  public Adapter createlogical_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.branch_instr <em>branch instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.branch_instr
   * @generated
   */
  public Adapter createbranch_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.mrs_instr <em>mrs instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.mrs_instr
   * @generated
   */
  public Adapter createmrs_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.msr_instr <em>msr instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.msr_instr
   * @generated
   */
  public Adapter createmsr_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ldr_str_irpre_instr <em>ldr str irpre instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ldr_str_irpre_instr
   * @generated
   */
  public Adapter createldr_str_irpre_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ldr_str_spre_instr <em>ldr str spre instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ldr_str_spre_instr
   * @generated
   */
  public Adapter createldr_str_spre_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ldr_str_irpsot_instr <em>ldr str irpsot instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ldr_str_irpsot_instr
   * @generated
   */
  public Adapter createldr_str_irpsot_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ldr_str_rpost_instr <em>ldr str rpost instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ldr_str_rpost_instr
   * @generated
   */
  public Adapter createldr_str_rpost_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ldm_instr <em>ldm instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ldm_instr
   * @generated
   */
  public Adapter createldm_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.push_pop_instr <em>push pop instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.push_pop_instr
   * @generated
   */
  public Adapter createpush_pop_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.bkpt_instr <em>bkpt instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.bkpt_instr
   * @generated
   */
  public Adapter createbkpt_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.swp_instr <em>swp instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.swp_instr
   * @generated
   */
  public Adapter createswp_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.svc_instr <em>svc instr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.svc_instr
   * @generated
   */
  public Adapter createsvc_instrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ADD_OP <em>ADD OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ADD_OP
   * @generated
   */
  public Adapter createADD_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ADC_OP <em>ADC OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ADC_OP
   * @generated
   */
  public Adapter createADC_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ADR_OP <em>ADR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ADR_OP
   * @generated
   */
  public Adapter createADR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SUB_OP <em>SUB OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SUB_OP
   * @generated
   */
  public Adapter createSUB_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SBC_OP <em>SBC OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SBC_OP
   * @generated
   */
  public Adapter createSBC_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.RSB_OP <em>RSB OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.RSB_OP
   * @generated
   */
  public Adapter createRSB_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.RSC_OP <em>RSC OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.RSC_OP
   * @generated
   */
  public Adapter createRSC_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ADRL_OP <em>ADRL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ADRL_OP
   * @generated
   */
  public Adapter createADRL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MUL_OP <em>MUL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MUL_OP
   * @generated
   */
  public Adapter createMUL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MLS_OP <em>MLS OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MLS_OP
   * @generated
   */
  public Adapter createMLS_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MLA_OP <em>MLA OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MLA_OP
   * @generated
   */
  public Adapter createMLA_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.UMULL_OP <em>UMULL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.UMULL_OP
   * @generated
   */
  public Adapter createUMULL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.UMLAL_OP <em>UMLAL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.UMLAL_OP
   * @generated
   */
  public Adapter createUMLAL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMULL_OP <em>SMULL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMULL_OP
   * @generated
   */
  public Adapter createSMULL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMLAL_OP <em>SMLAL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMLAL_OP
   * @generated
   */
  public Adapter createSMLAL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMUL_OP <em>SMUL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMUL_OP
   * @generated
   */
  public Adapter createSMUL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMULW_OP <em>SMULW OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMULW_OP
   * @generated
   */
  public Adapter createSMULW_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMLA_OP <em>SMLA OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMLA_OP
   * @generated
   */
  public Adapter createSMLA_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SMLAW_OP <em>SMLAW OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SMLAW_OP
   * @generated
   */
  public Adapter createSMLAW_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MOV_OP <em>MOV OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MOV_OP
   * @generated
   */
  public Adapter createMOV_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MVN_OP <em>MVN OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MVN_OP
   * @generated
   */
  public Adapter createMVN_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ASR_OP <em>ASR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ASR_OP
   * @generated
   */
  public Adapter createASR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.LSL_OP <em>LSL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.LSL_OP
   * @generated
   */
  public Adapter createLSL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.LSR_OP <em>LSR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.LSR_OP
   * @generated
   */
  public Adapter createLSR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ROR_OP <em>ROR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ROR_OP
   * @generated
   */
  public Adapter createROR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.RRX_OP <em>RRX OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.RRX_OP
   * @generated
   */
  public Adapter createRRX_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CLZ_OP <em>CLZ OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CLZ_OP
   * @generated
   */
  public Adapter createCLZ_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CMP_OP <em>CMP OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CMP_OP
   * @generated
   */
  public Adapter createCMP_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CMN_OP <em>CMN OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CMN_OP
   * @generated
   */
  public Adapter createCMN_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.TST_OP <em>TST OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.TST_OP
   * @generated
   */
  public Adapter createTST_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.TEQ_OP <em>TEQ OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.TEQ_OP
   * @generated
   */
  public Adapter createTEQ_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.AND_OP <em>AND OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.AND_OP
   * @generated
   */
  public Adapter createAND_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.EOR_OP <em>EOR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.EOR_OP
   * @generated
   */
  public Adapter createEOR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ORR_OP <em>ORR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ORR_OP
   * @generated
   */
  public Adapter createORR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ORN_OP <em>ORN OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ORN_OP
   * @generated
   */
  public Adapter createORN_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BIC_OP <em>BIC OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BIC_OP
   * @generated
   */
  public Adapter createBIC_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.B_OP <em>BOP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.B_OP
   * @generated
   */
  public Adapter createB_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BL_OP <em>BL OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BL_OP
   * @generated
   */
  public Adapter createBL_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BX_OP <em>BX OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BX_OP
   * @generated
   */
  public Adapter createBX_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BLX_OP <em>BLX OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BLX_OP
   * @generated
   */
  public Adapter createBLX_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BXJ_OP <em>BXJ OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BXJ_OP
   * @generated
   */
  public Adapter createBXJ_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MRS_OP <em>MRS OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MRS_OP
   * @generated
   */
  public Adapter createMRS_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.MSR_OP <em>MSR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.MSR_OP
   * @generated
   */
  public Adapter createMSR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.LDR_OP <em>LDR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.LDR_OP
   * @generated
   */
  public Adapter createLDR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.STR_OP <em>STR OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.STR_OP
   * @generated
   */
  public Adapter createSTR_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.LDM_OP <em>LDM OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.LDM_OP
   * @generated
   */
  public Adapter createLDM_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.STM_OP <em>STM OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.STM_OP
   * @generated
   */
  public Adapter createSTM_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PUSH_OP <em>PUSH OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PUSH_OP
   * @generated
   */
  public Adapter createPUSH_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.POP_OP <em>POP OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.POP_OP
   * @generated
   */
  public Adapter createPOP_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SWP_OP <em>SWP OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SWP_OP
   * @generated
   */
  public Adapter createSWP_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SWPB_OP <em>SWPB OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SWPB_OP
   * @generated
   */
  public Adapter createSWPB_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.SVC_OP <em>SVC OP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.SVC_OP
   * @generated
   */
  public Adapter createSVC_OPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PSR_FIELD_E <em>PSR FIELD E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PSR_FIELD_E
   * @generated
   */
  public Adapter createPSR_FIELD_EAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.APSR_FLAG_E <em>APSR FLAG E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.APSR_FLAG_E
   * @generated
   */
  public Adapter createAPSR_FLAG_EAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.NOP <em>NOP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.NOP
   * @generated
   */
  public Adapter createNOPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PREPROCESSOR <em>PREPROCESSOR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PREPROCESSOR
   * @generated
   */
  public Adapter createPREPROCESSORAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PREPROCESSOR_DEFINE <em>PREPROCESSOR DEFINE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE
   * @generated
   */
  public Adapter createPREPROCESSOR_DEFINEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PREPROCESSOR_ENDIF <em>PREPROCESSOR ENDIF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PREPROCESSOR_ENDIF
   * @generated
   */
  public Adapter createPREPROCESSOR_ENDIFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.PREPROCESSOR_ELSE <em>PREPROCESSOR ELSE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.PREPROCESSOR_ELSE
   * @generated
   */
  public Adapter createPREPROCESSOR_ELSEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CExtendCode <em>CExtend Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CExtendCode
   * @generated
   */
  public Adapter createCExtendCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Assembler_Directives_equ <em>Assembler Directives equ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Assembler_Directives_equ
   * @generated
   */
  public Adapter createAssembler_Directives_equAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Assembler_Directives <em>Assembler Directives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Assembler_Directives
   * @generated
   */
  public Adapter createAssembler_DirectivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Assembler_Directives_macro <em>Assembler Directives macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Assembler_Directives_macro
   * @generated
   */
  public Adapter createAssembler_Directives_macroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Assember_Directives_type <em>Assember Directives type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Assember_Directives_type
   * @generated
   */
  public Adapter createAssember_Directives_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Assembler_Directives_endm <em>Assembler Directives endm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Assembler_Directives_endm
   * @generated
   */
  public Adapter createAssembler_Directives_endmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARM_Machine_Directives <em>ARM Machine Directives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARM_Machine_Directives
   * @generated
   */
  public Adapter createARM_Machine_DirectivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align <em>ARM MACHINE DIRECTIVES align</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align
   * @generated
   */
  public Adapter createARM_MACHINE_DIRECTIVES_alignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARM_Machine_Directives_code <em>ARM Machine Directives code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARM_Machine_Directives_code
   * @generated
   */
  public Adapter createARM_Machine_Directives_codeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARM_Machine_Directives_syntax <em>ARM Machine Directives syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARM_Machine_Directives_syntax
   * @generated
   */
  public Adapter createARM_Machine_Directives_syntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.ARM_Machine_Directives_save <em>ARM Machine Directives save</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.ARM_Machine_Directives_save
   * @generated
   */
  public Adapter createARM_Machine_Directives_saveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CExtendasciz <em>CExtendasciz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CExtendasciz
   * @generated
   */
  public Adapter createCExtendascizAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.CLang <em>CLang</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.CLang
   * @generated
   */
  public Adapter createCLangAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.REGISTER <em>REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.REGISTER
   * @generated
   */
  public Adapter createREGISTERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.BAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.BAREL_SHIFT_REGISTER
   * @generated
   */
  public Adapter createBAREL_SHIFT_REGISTERAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.Operand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.Operand2
   * @generated
   */
  public Adapter createOperand2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.opsh <em>opsh</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.opsh
   * @generated
   */
  public Adapter createopshAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.immediate_label <em>immediate label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.immediate_label
   * @generated
   */
  public Adapter createimmediate_labelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.description <em>description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.description
   * @generated
   */
  public Adapter createdescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.variable
   * @generated
   */
  public Adapter createvariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.definition <em>definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.definition
   * @generated
   */
  public Adapter createdefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.randomEntry <em>random Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.randomEntry
   * @generated
   */
  public Adapter createrandomEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.rs_sh <em>rs sh</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.rs_sh
   * @generated
   */
  public Adapter creaters_shAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.flexible_offset <em>flexible offset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.flexible_offset
   * @generated
   */
  public Adapter createflexible_offsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.literal_numeric <em>literal numeric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.literal_numeric
   * @generated
   */
  public Adapter createliteral_numericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.aRM.numeric_backward_forward <em>numeric backward forward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.aRM.numeric_backward_forward
   * @generated
   */
  public Adapter createnumeric_backward_forwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ARMAdapterFactory
