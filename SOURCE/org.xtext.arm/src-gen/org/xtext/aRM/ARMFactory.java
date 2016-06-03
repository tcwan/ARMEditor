/**
 */
package org.xtext.aRM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.aRM.ARMPackage
 * @generated
 */
public interface ARMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ARMFactory eINSTANCE = org.xtext.aRM.impl.ARMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instr</em>'.
   * @generated
   */
  ARMInstr createARMInstr();

  /**
   * Returns a new object of class '<em>Operation Instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Instr</em>'.
   * @generated
   */
  OperationInstr createOperationInstr();

  /**
   * Returns a new object of class '<em>Ccode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ccode</em>'.
   * @generated
   */
  Ccode createCcode();

  /**
   * Returns a new object of class '<em>variable variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable variable</em>'.
   * @generated
   */
  variable_variable createvariable_variable();

  /**
   * Returns a new object of class '<em>variable colon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable colon</em>'.
   * @generated
   */
  variable_colon createvariable_colon();

  /**
   * Returns a new object of class '<em>label keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>label keyword</em>'.
   * @generated
   */
  label_keyword createlabel_keyword();

  /**
   * Returns a new object of class '<em>add sub instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>add sub instr</em>'.
   * @generated
   */
  add_sub_instr createadd_sub_instr();

  /**
   * Returns a new object of class '<em>adrl adr instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>adrl adr instr</em>'.
   * @generated
   */
  adrl_adr_instr createadrl_adr_instr();

  /**
   * Returns a new object of class '<em>mul 3R instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mul 3R instr</em>'.
   * @generated
   */
  mul_3R_instr createmul_3R_instr();

  /**
   * Returns a new object of class '<em>mul 4R instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mul 4R instr</em>'.
   * @generated
   */
  mul_4R_instr createmul_4R_instr();

  /**
   * Returns a new object of class '<em>mov instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mov instr</em>'.
   * @generated
   */
  mov_instr createmov_instr();

  /**
   * Returns a new object of class '<em>shift instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>shift instr</em>'.
   * @generated
   */
  shift_instr createshift_instr();

  /**
   * Returns a new object of class '<em>clz instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>clz instr</em>'.
   * @generated
   */
  clz_instr createclz_instr();

  /**
   * Returns a new object of class '<em>compare test instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>compare test instr</em>'.
   * @generated
   */
  compare_test_instr createcompare_test_instr();

  /**
   * Returns a new object of class '<em>logical instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>logical instr</em>'.
   * @generated
   */
  logical_instr createlogical_instr();

  /**
   * Returns a new object of class '<em>branch instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>branch instr</em>'.
   * @generated
   */
  branch_instr createbranch_instr();

  /**
   * Returns a new object of class '<em>mrs instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mrs instr</em>'.
   * @generated
   */
  mrs_instr createmrs_instr();

  /**
   * Returns a new object of class '<em>msr instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>msr instr</em>'.
   * @generated
   */
  msr_instr createmsr_instr();

  /**
   * Returns a new object of class '<em>ldr str irpre instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ldr str irpre instr</em>'.
   * @generated
   */
  ldr_str_irpre_instr createldr_str_irpre_instr();

  /**
   * Returns a new object of class '<em>ldr str spre instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ldr str spre instr</em>'.
   * @generated
   */
  ldr_str_spre_instr createldr_str_spre_instr();

  /**
   * Returns a new object of class '<em>ldr str irpsot instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ldr str irpsot instr</em>'.
   * @generated
   */
  ldr_str_irpsot_instr createldr_str_irpsot_instr();

  /**
   * Returns a new object of class '<em>ldr str rpost instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ldr str rpost instr</em>'.
   * @generated
   */
  ldr_str_rpost_instr createldr_str_rpost_instr();

  /**
   * Returns a new object of class '<em>ldm instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ldm instr</em>'.
   * @generated
   */
  ldm_instr createldm_instr();

  /**
   * Returns a new object of class '<em>push pop instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>push pop instr</em>'.
   * @generated
   */
  push_pop_instr createpush_pop_instr();

  /**
   * Returns a new object of class '<em>bkpt instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bkpt instr</em>'.
   * @generated
   */
  bkpt_instr createbkpt_instr();

  /**
   * Returns a new object of class '<em>swp instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>swp instr</em>'.
   * @generated
   */
  swp_instr createswp_instr();

  /**
   * Returns a new object of class '<em>svc instr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>svc instr</em>'.
   * @generated
   */
  svc_instr createsvc_instr();

  /**
   * Returns a new object of class '<em>ADD OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADD OP</em>'.
   * @generated
   */
  ADD_OP createADD_OP();

  /**
   * Returns a new object of class '<em>ADC OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADC OP</em>'.
   * @generated
   */
  ADC_OP createADC_OP();

  /**
   * Returns a new object of class '<em>ADR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADR OP</em>'.
   * @generated
   */
  ADR_OP createADR_OP();

  /**
   * Returns a new object of class '<em>SUB OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SUB OP</em>'.
   * @generated
   */
  SUB_OP createSUB_OP();

  /**
   * Returns a new object of class '<em>SBC OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SBC OP</em>'.
   * @generated
   */
  SBC_OP createSBC_OP();

  /**
   * Returns a new object of class '<em>RSB OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RSB OP</em>'.
   * @generated
   */
  RSB_OP createRSB_OP();

  /**
   * Returns a new object of class '<em>RSC OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RSC OP</em>'.
   * @generated
   */
  RSC_OP createRSC_OP();

  /**
   * Returns a new object of class '<em>ADRL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADRL OP</em>'.
   * @generated
   */
  ADRL_OP createADRL_OP();

  /**
   * Returns a new object of class '<em>MUL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MUL OP</em>'.
   * @generated
   */
  MUL_OP createMUL_OP();

  /**
   * Returns a new object of class '<em>MLS OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MLS OP</em>'.
   * @generated
   */
  MLS_OP createMLS_OP();

  /**
   * Returns a new object of class '<em>MLA OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MLA OP</em>'.
   * @generated
   */
  MLA_OP createMLA_OP();

  /**
   * Returns a new object of class '<em>UMULL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UMULL OP</em>'.
   * @generated
   */
  UMULL_OP createUMULL_OP();

  /**
   * Returns a new object of class '<em>UMLAL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UMLAL OP</em>'.
   * @generated
   */
  UMLAL_OP createUMLAL_OP();

  /**
   * Returns a new object of class '<em>SMULL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMULL OP</em>'.
   * @generated
   */
  SMULL_OP createSMULL_OP();

  /**
   * Returns a new object of class '<em>SMLAL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMLAL OP</em>'.
   * @generated
   */
  SMLAL_OP createSMLAL_OP();

  /**
   * Returns a new object of class '<em>SMUL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMUL OP</em>'.
   * @generated
   */
  SMUL_OP createSMUL_OP();

  /**
   * Returns a new object of class '<em>SMULW OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMULW OP</em>'.
   * @generated
   */
  SMULW_OP createSMULW_OP();

  /**
   * Returns a new object of class '<em>SMLA OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMLA OP</em>'.
   * @generated
   */
  SMLA_OP createSMLA_OP();

  /**
   * Returns a new object of class '<em>SMLAW OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMLAW OP</em>'.
   * @generated
   */
  SMLAW_OP createSMLAW_OP();

  /**
   * Returns a new object of class '<em>MOV OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MOV OP</em>'.
   * @generated
   */
  MOV_OP createMOV_OP();

  /**
   * Returns a new object of class '<em>MVN OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MVN OP</em>'.
   * @generated
   */
  MVN_OP createMVN_OP();

  /**
   * Returns a new object of class '<em>ASR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ASR OP</em>'.
   * @generated
   */
  ASR_OP createASR_OP();

  /**
   * Returns a new object of class '<em>LSL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LSL OP</em>'.
   * @generated
   */
  LSL_OP createLSL_OP();

  /**
   * Returns a new object of class '<em>LSR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LSR OP</em>'.
   * @generated
   */
  LSR_OP createLSR_OP();

  /**
   * Returns a new object of class '<em>ROR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ROR OP</em>'.
   * @generated
   */
  ROR_OP createROR_OP();

  /**
   * Returns a new object of class '<em>RRX OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RRX OP</em>'.
   * @generated
   */
  RRX_OP createRRX_OP();

  /**
   * Returns a new object of class '<em>CLZ OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CLZ OP</em>'.
   * @generated
   */
  CLZ_OP createCLZ_OP();

  /**
   * Returns a new object of class '<em>CMP OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CMP OP</em>'.
   * @generated
   */
  CMP_OP createCMP_OP();

  /**
   * Returns a new object of class '<em>CMN OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CMN OP</em>'.
   * @generated
   */
  CMN_OP createCMN_OP();

  /**
   * Returns a new object of class '<em>TST OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TST OP</em>'.
   * @generated
   */
  TST_OP createTST_OP();

  /**
   * Returns a new object of class '<em>TEQ OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TEQ OP</em>'.
   * @generated
   */
  TEQ_OP createTEQ_OP();

  /**
   * Returns a new object of class '<em>AND OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>AND OP</em>'.
   * @generated
   */
  AND_OP createAND_OP();

  /**
   * Returns a new object of class '<em>EOR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EOR OP</em>'.
   * @generated
   */
  EOR_OP createEOR_OP();

  /**
   * Returns a new object of class '<em>ORR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ORR OP</em>'.
   * @generated
   */
  ORR_OP createORR_OP();

  /**
   * Returns a new object of class '<em>ORN OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ORN OP</em>'.
   * @generated
   */
  ORN_OP createORN_OP();

  /**
   * Returns a new object of class '<em>BIC OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BIC OP</em>'.
   * @generated
   */
  BIC_OP createBIC_OP();

  /**
   * Returns a new object of class '<em>BOP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOP</em>'.
   * @generated
   */
  B_OP createB_OP();

  /**
   * Returns a new object of class '<em>BL OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BL OP</em>'.
   * @generated
   */
  BL_OP createBL_OP();

  /**
   * Returns a new object of class '<em>BX OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BX OP</em>'.
   * @generated
   */
  BX_OP createBX_OP();

  /**
   * Returns a new object of class '<em>BLX OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BLX OP</em>'.
   * @generated
   */
  BLX_OP createBLX_OP();

  /**
   * Returns a new object of class '<em>BXJ OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BXJ OP</em>'.
   * @generated
   */
  BXJ_OP createBXJ_OP();

  /**
   * Returns a new object of class '<em>MRS OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MRS OP</em>'.
   * @generated
   */
  MRS_OP createMRS_OP();

  /**
   * Returns a new object of class '<em>MSR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MSR OP</em>'.
   * @generated
   */
  MSR_OP createMSR_OP();

  /**
   * Returns a new object of class '<em>LDR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LDR OP</em>'.
   * @generated
   */
  LDR_OP createLDR_OP();

  /**
   * Returns a new object of class '<em>STR OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STR OP</em>'.
   * @generated
   */
  STR_OP createSTR_OP();

  /**
   * Returns a new object of class '<em>LDM OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LDM OP</em>'.
   * @generated
   */
  LDM_OP createLDM_OP();

  /**
   * Returns a new object of class '<em>STM OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STM OP</em>'.
   * @generated
   */
  STM_OP createSTM_OP();

  /**
   * Returns a new object of class '<em>PUSH OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PUSH OP</em>'.
   * @generated
   */
  PUSH_OP createPUSH_OP();

  /**
   * Returns a new object of class '<em>POP OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>POP OP</em>'.
   * @generated
   */
  POP_OP createPOP_OP();

  /**
   * Returns a new object of class '<em>SWP OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SWP OP</em>'.
   * @generated
   */
  SWP_OP createSWP_OP();

  /**
   * Returns a new object of class '<em>SWPB OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SWPB OP</em>'.
   * @generated
   */
  SWPB_OP createSWPB_OP();

  /**
   * Returns a new object of class '<em>SVC OP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SVC OP</em>'.
   * @generated
   */
  SVC_OP createSVC_OP();

  /**
   * Returns a new object of class '<em>PSR FIELD E</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PSR FIELD E</em>'.
   * @generated
   */
  PSR_FIELD_E createPSR_FIELD_E();

  /**
   * Returns a new object of class '<em>APSR FLAG E</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>APSR FLAG E</em>'.
   * @generated
   */
  APSR_FLAG_E createAPSR_FLAG_E();

  /**
   * Returns a new object of class '<em>NOP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NOP</em>'.
   * @generated
   */
  NOP createNOP();

  /**
   * Returns a new object of class '<em>PREPROCESSOR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PREPROCESSOR</em>'.
   * @generated
   */
  PREPROCESSOR createPREPROCESSOR();

  /**
   * Returns a new object of class '<em>PREPROCESSOR DEFINE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PREPROCESSOR DEFINE</em>'.
   * @generated
   */
  PREPROCESSOR_DEFINE createPREPROCESSOR_DEFINE();

  /**
   * Returns a new object of class '<em>PREPROCESSOR ENDIF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PREPROCESSOR ENDIF</em>'.
   * @generated
   */
  PREPROCESSOR_ENDIF createPREPROCESSOR_ENDIF();

  /**
   * Returns a new object of class '<em>PREPROCESSOR ELSE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PREPROCESSOR ELSE</em>'.
   * @generated
   */
  PREPROCESSOR_ELSE createPREPROCESSOR_ELSE();

  /**
   * Returns a new object of class '<em>CExtend Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CExtend Code</em>'.
   * @generated
   */
  CExtendCode createCExtendCode();

  /**
   * Returns a new object of class '<em>Assembler Directives equ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembler Directives equ</em>'.
   * @generated
   */
  Assembler_Directives_equ createAssembler_Directives_equ();

  /**
   * Returns a new object of class '<em>Assembler Directives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembler Directives</em>'.
   * @generated
   */
  Assembler_Directives createAssembler_Directives();

  /**
   * Returns a new object of class '<em>Assembler Directives macro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembler Directives macro</em>'.
   * @generated
   */
  Assembler_Directives_macro createAssembler_Directives_macro();

  /**
   * Returns a new object of class '<em>Assember Directives type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assember Directives type</em>'.
   * @generated
   */
  Assember_Directives_type createAssember_Directives_type();

  /**
   * Returns a new object of class '<em>Assembler Directives endm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assembler Directives endm</em>'.
   * @generated
   */
  Assembler_Directives_endm createAssembler_Directives_endm();

  /**
   * Returns a new object of class '<em>ARM Machine Directives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARM Machine Directives</em>'.
   * @generated
   */
  ARM_Machine_Directives createARM_Machine_Directives();

  /**
   * Returns a new object of class '<em>ARM MACHINE DIRECTIVES align</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARM MACHINE DIRECTIVES align</em>'.
   * @generated
   */
  ARM_MACHINE_DIRECTIVES_align createARM_MACHINE_DIRECTIVES_align();

  /**
   * Returns a new object of class '<em>ARM Machine Directives code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARM Machine Directives code</em>'.
   * @generated
   */
  ARM_Machine_Directives_code createARM_Machine_Directives_code();

  /**
   * Returns a new object of class '<em>ARM Machine Directives syntax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARM Machine Directives syntax</em>'.
   * @generated
   */
  ARM_Machine_Directives_syntax createARM_Machine_Directives_syntax();

  /**
   * Returns a new object of class '<em>ARM Machine Directives save</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ARM Machine Directives save</em>'.
   * @generated
   */
  ARM_Machine_Directives_save createARM_Machine_Directives_save();

  /**
   * Returns a new object of class '<em>CExtendasciz</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CExtendasciz</em>'.
   * @generated
   */
  CExtendasciz createCExtendasciz();

  /**
   * Returns a new object of class '<em>CLang</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CLang</em>'.
   * @generated
   */
  CLang createCLang();

  /**
   * Returns a new object of class '<em>REGISTER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REGISTER</em>'.
   * @generated
   */
  REGISTER createREGISTER();

  /**
   * Returns a new object of class '<em>BAREL SHIFT REGISTER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BAREL SHIFT REGISTER</em>'.
   * @generated
   */
  BAREL_SHIFT_REGISTER createBAREL_SHIFT_REGISTER();

  /**
   * Returns a new object of class '<em>Operand2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operand2</em>'.
   * @generated
   */
  Operand2 createOperand2();

  /**
   * Returns a new object of class '<em>opsh</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>opsh</em>'.
   * @generated
   */
  opsh createopsh();

  /**
   * Returns a new object of class '<em>immediate label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>immediate label</em>'.
   * @generated
   */
  immediate_label createimmediate_label();

  /**
   * Returns a new object of class '<em>description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>description</em>'.
   * @generated
   */
  description createdescription();

  /**
   * Returns a new object of class '<em>variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>variable</em>'.
   * @generated
   */
  variable createvariable();

  /**
   * Returns a new object of class '<em>definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>definition</em>'.
   * @generated
   */
  definition createdefinition();

  /**
   * Returns a new object of class '<em>random Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>random Entry</em>'.
   * @generated
   */
  randomEntry createrandomEntry();

  /**
   * Returns a new object of class '<em>rs sh</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rs sh</em>'.
   * @generated
   */
  rs_sh creaters_sh();

  /**
   * Returns a new object of class '<em>flexible offset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>flexible offset</em>'.
   * @generated
   */
  flexible_offset createflexible_offset();

  /**
   * Returns a new object of class '<em>literal numeric</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>literal numeric</em>'.
   * @generated
   */
  literal_numeric createliteral_numeric();

  /**
   * Returns a new object of class '<em>numeric backward forward</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>numeric backward forward</em>'.
   * @generated
   */
  numeric_backward_forward createnumeric_backward_forward();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ARMPackage getARMPackage();

} //ARMFactory
