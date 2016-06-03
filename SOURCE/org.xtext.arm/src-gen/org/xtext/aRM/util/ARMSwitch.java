/**
 */
package org.xtext.aRM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.aRM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.aRM.ARMPackage
 * @generated
 */
public class ARMSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ARMPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARMSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ARMPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ARMPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_INSTR:
      {
        ARMInstr armInstr = (ARMInstr)theEObject;
        T result = caseARMInstr(armInstr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.OPERATION_INSTR:
      {
        OperationInstr operationInstr = (OperationInstr)theEObject;
        T result = caseOperationInstr(operationInstr);
        if (result == null) result = caseARMInstr(operationInstr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CCODE:
      {
        Ccode ccode = (Ccode)theEObject;
        T result = caseCcode(ccode);
        if (result == null) result = caseARMInstr(ccode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.VARIABLE_VARIABLE:
      {
        variable_variable variable_variable = (variable_variable)theEObject;
        T result = casevariable_variable(variable_variable);
        if (result == null) result = caseCcode(variable_variable);
        if (result == null) result = caseARMInstr(variable_variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.VARIABLE_COLON:
      {
        variable_colon variable_colon = (variable_colon)theEObject;
        T result = casevariable_colon(variable_colon);
        if (result == null) result = caseCcode(variable_colon);
        if (result == null) result = caseARMInstr(variable_colon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LABEL_KEYWORD:
      {
        label_keyword label_keyword = (label_keyword)theEObject;
        T result = caselabel_keyword(label_keyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADD_SUB_INSTR:
      {
        add_sub_instr add_sub_instr = (add_sub_instr)theEObject;
        T result = caseadd_sub_instr(add_sub_instr);
        if (result == null) result = caseOperationInstr(add_sub_instr);
        if (result == null) result = caseARMInstr(add_sub_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADRL_ADR_INSTR:
      {
        adrl_adr_instr adrl_adr_instr = (adrl_adr_instr)theEObject;
        T result = caseadrl_adr_instr(adrl_adr_instr);
        if (result == null) result = caseOperationInstr(adrl_adr_instr);
        if (result == null) result = caseARMInstr(adrl_adr_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MUL_3R_INSTR:
      {
        mul_3R_instr mul_3R_instr = (mul_3R_instr)theEObject;
        T result = casemul_3R_instr(mul_3R_instr);
        if (result == null) result = caseOperationInstr(mul_3R_instr);
        if (result == null) result = caseARMInstr(mul_3R_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MUL_4R_INSTR:
      {
        mul_4R_instr mul_4R_instr = (mul_4R_instr)theEObject;
        T result = casemul_4R_instr(mul_4R_instr);
        if (result == null) result = caseOperationInstr(mul_4R_instr);
        if (result == null) result = caseARMInstr(mul_4R_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MOV_INSTR:
      {
        mov_instr mov_instr = (mov_instr)theEObject;
        T result = casemov_instr(mov_instr);
        if (result == null) result = caseOperationInstr(mov_instr);
        if (result == null) result = caseARMInstr(mov_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SHIFT_INSTR:
      {
        shift_instr shift_instr = (shift_instr)theEObject;
        T result = caseshift_instr(shift_instr);
        if (result == null) result = caseOperationInstr(shift_instr);
        if (result == null) result = caseARMInstr(shift_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CLZ_INSTR:
      {
        clz_instr clz_instr = (clz_instr)theEObject;
        T result = caseclz_instr(clz_instr);
        if (result == null) result = caseOperationInstr(clz_instr);
        if (result == null) result = caseARMInstr(clz_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.COMPARE_TEST_INSTR:
      {
        compare_test_instr compare_test_instr = (compare_test_instr)theEObject;
        T result = casecompare_test_instr(compare_test_instr);
        if (result == null) result = caseOperationInstr(compare_test_instr);
        if (result == null) result = caseARMInstr(compare_test_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LOGICAL_INSTR:
      {
        logical_instr logical_instr = (logical_instr)theEObject;
        T result = caselogical_instr(logical_instr);
        if (result == null) result = caseOperationInstr(logical_instr);
        if (result == null) result = caseARMInstr(logical_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BRANCH_INSTR:
      {
        branch_instr branch_instr = (branch_instr)theEObject;
        T result = casebranch_instr(branch_instr);
        if (result == null) result = caseOperationInstr(branch_instr);
        if (result == null) result = caseARMInstr(branch_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MRS_INSTR:
      {
        mrs_instr mrs_instr = (mrs_instr)theEObject;
        T result = casemrs_instr(mrs_instr);
        if (result == null) result = caseOperationInstr(mrs_instr);
        if (result == null) result = caseARMInstr(mrs_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MSR_INSTR:
      {
        msr_instr msr_instr = (msr_instr)theEObject;
        T result = casemsr_instr(msr_instr);
        if (result == null) result = caseOperationInstr(msr_instr);
        if (result == null) result = caseARMInstr(msr_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDR_STR_IRPRE_INSTR:
      {
        ldr_str_irpre_instr ldr_str_irpre_instr = (ldr_str_irpre_instr)theEObject;
        T result = caseldr_str_irpre_instr(ldr_str_irpre_instr);
        if (result == null) result = caseOperationInstr(ldr_str_irpre_instr);
        if (result == null) result = caseARMInstr(ldr_str_irpre_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDR_STR_SPRE_INSTR:
      {
        ldr_str_spre_instr ldr_str_spre_instr = (ldr_str_spre_instr)theEObject;
        T result = caseldr_str_spre_instr(ldr_str_spre_instr);
        if (result == null) result = caseOperationInstr(ldr_str_spre_instr);
        if (result == null) result = caseARMInstr(ldr_str_spre_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDR_STR_IRPSOT_INSTR:
      {
        ldr_str_irpsot_instr ldr_str_irpsot_instr = (ldr_str_irpsot_instr)theEObject;
        T result = caseldr_str_irpsot_instr(ldr_str_irpsot_instr);
        if (result == null) result = caseOperationInstr(ldr_str_irpsot_instr);
        if (result == null) result = caseARMInstr(ldr_str_irpsot_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDR_STR_RPOST_INSTR:
      {
        ldr_str_rpost_instr ldr_str_rpost_instr = (ldr_str_rpost_instr)theEObject;
        T result = caseldr_str_rpost_instr(ldr_str_rpost_instr);
        if (result == null) result = caseOperationInstr(ldr_str_rpost_instr);
        if (result == null) result = caseARMInstr(ldr_str_rpost_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDM_INSTR:
      {
        ldm_instr ldm_instr = (ldm_instr)theEObject;
        T result = caseldm_instr(ldm_instr);
        if (result == null) result = caseOperationInstr(ldm_instr);
        if (result == null) result = caseARMInstr(ldm_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PUSH_POP_INSTR:
      {
        push_pop_instr push_pop_instr = (push_pop_instr)theEObject;
        T result = casepush_pop_instr(push_pop_instr);
        if (result == null) result = caseOperationInstr(push_pop_instr);
        if (result == null) result = caseARMInstr(push_pop_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BKPT_INSTR:
      {
        bkpt_instr bkpt_instr = (bkpt_instr)theEObject;
        T result = casebkpt_instr(bkpt_instr);
        if (result == null) result = caseOperationInstr(bkpt_instr);
        if (result == null) result = caseARMInstr(bkpt_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SWP_INSTR:
      {
        swp_instr swp_instr = (swp_instr)theEObject;
        T result = caseswp_instr(swp_instr);
        if (result == null) result = caseOperationInstr(swp_instr);
        if (result == null) result = caseARMInstr(swp_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SVC_INSTR:
      {
        svc_instr svc_instr = (svc_instr)theEObject;
        T result = casesvc_instr(svc_instr);
        if (result == null) result = caseOperationInstr(svc_instr);
        if (result == null) result = caseARMInstr(svc_instr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADD_OP:
      {
        ADD_OP adD_OP = (ADD_OP)theEObject;
        T result = caseADD_OP(adD_OP);
        if (result == null) result = caseadd_sub_instr(adD_OP);
        if (result == null) result = caseOperationInstr(adD_OP);
        if (result == null) result = caseARMInstr(adD_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADC_OP:
      {
        ADC_OP adC_OP = (ADC_OP)theEObject;
        T result = caseADC_OP(adC_OP);
        if (result == null) result = caseadd_sub_instr(adC_OP);
        if (result == null) result = caseOperationInstr(adC_OP);
        if (result == null) result = caseARMInstr(adC_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADR_OP:
      {
        ADR_OP adR_OP = (ADR_OP)theEObject;
        T result = caseADR_OP(adR_OP);
        if (result == null) result = caseadd_sub_instr(adR_OP);
        if (result == null) result = caseadrl_adr_instr(adR_OP);
        if (result == null) result = caseOperationInstr(adR_OP);
        if (result == null) result = caseARMInstr(adR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SUB_OP:
      {
        SUB_OP suB_OP = (SUB_OP)theEObject;
        T result = caseSUB_OP(suB_OP);
        if (result == null) result = caseadd_sub_instr(suB_OP);
        if (result == null) result = caseOperationInstr(suB_OP);
        if (result == null) result = caseARMInstr(suB_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SBC_OP:
      {
        SBC_OP sbC_OP = (SBC_OP)theEObject;
        T result = caseSBC_OP(sbC_OP);
        if (result == null) result = caseadd_sub_instr(sbC_OP);
        if (result == null) result = caseOperationInstr(sbC_OP);
        if (result == null) result = caseARMInstr(sbC_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.RSB_OP:
      {
        RSB_OP rsB_OP = (RSB_OP)theEObject;
        T result = caseRSB_OP(rsB_OP);
        if (result == null) result = caseadd_sub_instr(rsB_OP);
        if (result == null) result = caseOperationInstr(rsB_OP);
        if (result == null) result = caseARMInstr(rsB_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.RSC_OP:
      {
        RSC_OP rsC_OP = (RSC_OP)theEObject;
        T result = caseRSC_OP(rsC_OP);
        if (result == null) result = caseadd_sub_instr(rsC_OP);
        if (result == null) result = caseOperationInstr(rsC_OP);
        if (result == null) result = caseARMInstr(rsC_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ADRL_OP:
      {
        ADRL_OP adrL_OP = (ADRL_OP)theEObject;
        T result = caseADRL_OP(adrL_OP);
        if (result == null) result = caseadd_sub_instr(adrL_OP);
        if (result == null) result = caseadrl_adr_instr(adrL_OP);
        if (result == null) result = caseOperationInstr(adrL_OP);
        if (result == null) result = caseARMInstr(adrL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MUL_OP:
      {
        MUL_OP muL_OP = (MUL_OP)theEObject;
        T result = caseMUL_OP(muL_OP);
        if (result == null) result = casemul_3R_instr(muL_OP);
        if (result == null) result = caseOperationInstr(muL_OP);
        if (result == null) result = caseARMInstr(muL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MLS_OP:
      {
        MLS_OP mlS_OP = (MLS_OP)theEObject;
        T result = caseMLS_OP(mlS_OP);
        if (result == null) result = casemul_4R_instr(mlS_OP);
        if (result == null) result = caseOperationInstr(mlS_OP);
        if (result == null) result = caseARMInstr(mlS_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MLA_OP:
      {
        MLA_OP mlA_OP = (MLA_OP)theEObject;
        T result = caseMLA_OP(mlA_OP);
        if (result == null) result = casemul_4R_instr(mlA_OP);
        if (result == null) result = caseOperationInstr(mlA_OP);
        if (result == null) result = caseARMInstr(mlA_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.UMULL_OP:
      {
        UMULL_OP umulL_OP = (UMULL_OP)theEObject;
        T result = caseUMULL_OP(umulL_OP);
        if (result == null) result = casemul_4R_instr(umulL_OP);
        if (result == null) result = caseOperationInstr(umulL_OP);
        if (result == null) result = caseARMInstr(umulL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.UMLAL_OP:
      {
        UMLAL_OP umlaL_OP = (UMLAL_OP)theEObject;
        T result = caseUMLAL_OP(umlaL_OP);
        if (result == null) result = casemul_4R_instr(umlaL_OP);
        if (result == null) result = caseOperationInstr(umlaL_OP);
        if (result == null) result = caseARMInstr(umlaL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMULL_OP:
      {
        SMULL_OP smulL_OP = (SMULL_OP)theEObject;
        T result = caseSMULL_OP(smulL_OP);
        if (result == null) result = casemul_4R_instr(smulL_OP);
        if (result == null) result = caseOperationInstr(smulL_OP);
        if (result == null) result = caseARMInstr(smulL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMLAL_OP:
      {
        SMLAL_OP smlaL_OP = (SMLAL_OP)theEObject;
        T result = caseSMLAL_OP(smlaL_OP);
        if (result == null) result = casemul_4R_instr(smlaL_OP);
        if (result == null) result = caseOperationInstr(smlaL_OP);
        if (result == null) result = caseARMInstr(smlaL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMUL_OP:
      {
        SMUL_OP smuL_OP = (SMUL_OP)theEObject;
        T result = caseSMUL_OP(smuL_OP);
        if (result == null) result = casemul_3R_instr(smuL_OP);
        if (result == null) result = caseOperationInstr(smuL_OP);
        if (result == null) result = caseARMInstr(smuL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMULW_OP:
      {
        SMULW_OP smulW_OP = (SMULW_OP)theEObject;
        T result = caseSMULW_OP(smulW_OP);
        if (result == null) result = casemul_3R_instr(smulW_OP);
        if (result == null) result = caseOperationInstr(smulW_OP);
        if (result == null) result = caseARMInstr(smulW_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMLA_OP:
      {
        SMLA_OP smlA_OP = (SMLA_OP)theEObject;
        T result = caseSMLA_OP(smlA_OP);
        if (result == null) result = casemul_4R_instr(smlA_OP);
        if (result == null) result = caseOperationInstr(smlA_OP);
        if (result == null) result = caseARMInstr(smlA_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SMLAW_OP:
      {
        SMLAW_OP smlaW_OP = (SMLAW_OP)theEObject;
        T result = caseSMLAW_OP(smlaW_OP);
        if (result == null) result = casemul_4R_instr(smlaW_OP);
        if (result == null) result = caseOperationInstr(smlaW_OP);
        if (result == null) result = caseARMInstr(smlaW_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MOV_OP:
      {
        MOV_OP moV_OP = (MOV_OP)theEObject;
        T result = caseMOV_OP(moV_OP);
        if (result == null) result = casemov_instr(moV_OP);
        if (result == null) result = caseOperationInstr(moV_OP);
        if (result == null) result = caseARMInstr(moV_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MVN_OP:
      {
        MVN_OP mvN_OP = (MVN_OP)theEObject;
        T result = caseMVN_OP(mvN_OP);
        if (result == null) result = casemov_instr(mvN_OP);
        if (result == null) result = caseOperationInstr(mvN_OP);
        if (result == null) result = caseARMInstr(mvN_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASR_OP:
      {
        ASR_OP asR_OP = (ASR_OP)theEObject;
        T result = caseASR_OP(asR_OP);
        if (result == null) result = caseshift_instr(asR_OP);
        if (result == null) result = caseOperationInstr(asR_OP);
        if (result == null) result = caseARMInstr(asR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LSL_OP:
      {
        LSL_OP lsL_OP = (LSL_OP)theEObject;
        T result = caseLSL_OP(lsL_OP);
        if (result == null) result = caseshift_instr(lsL_OP);
        if (result == null) result = caseOperationInstr(lsL_OP);
        if (result == null) result = caseARMInstr(lsL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LSR_OP:
      {
        LSR_OP lsR_OP = (LSR_OP)theEObject;
        T result = caseLSR_OP(lsR_OP);
        if (result == null) result = caseshift_instr(lsR_OP);
        if (result == null) result = caseOperationInstr(lsR_OP);
        if (result == null) result = caseARMInstr(lsR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ROR_OP:
      {
        ROR_OP roR_OP = (ROR_OP)theEObject;
        T result = caseROR_OP(roR_OP);
        if (result == null) result = caseshift_instr(roR_OP);
        if (result == null) result = caseOperationInstr(roR_OP);
        if (result == null) result = caseARMInstr(roR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.RRX_OP:
      {
        RRX_OP rrX_OP = (RRX_OP)theEObject;
        T result = caseRRX_OP(rrX_OP);
        if (result == null) result = caseshift_instr(rrX_OP);
        if (result == null) result = caseOperationInstr(rrX_OP);
        if (result == null) result = caseARMInstr(rrX_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CLZ_OP:
      {
        CLZ_OP clZ_OP = (CLZ_OP)theEObject;
        T result = caseCLZ_OP(clZ_OP);
        if (result == null) result = caseclz_instr(clZ_OP);
        if (result == null) result = caseOperationInstr(clZ_OP);
        if (result == null) result = caseARMInstr(clZ_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CMP_OP:
      {
        CMP_OP cmP_OP = (CMP_OP)theEObject;
        T result = caseCMP_OP(cmP_OP);
        if (result == null) result = casecompare_test_instr(cmP_OP);
        if (result == null) result = caseOperationInstr(cmP_OP);
        if (result == null) result = caseARMInstr(cmP_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CMN_OP:
      {
        CMN_OP cmN_OP = (CMN_OP)theEObject;
        T result = caseCMN_OP(cmN_OP);
        if (result == null) result = casecompare_test_instr(cmN_OP);
        if (result == null) result = caseOperationInstr(cmN_OP);
        if (result == null) result = caseARMInstr(cmN_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.TST_OP:
      {
        TST_OP tsT_OP = (TST_OP)theEObject;
        T result = caseTST_OP(tsT_OP);
        if (result == null) result = casecompare_test_instr(tsT_OP);
        if (result == null) result = caseOperationInstr(tsT_OP);
        if (result == null) result = caseARMInstr(tsT_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.TEQ_OP:
      {
        TEQ_OP teQ_OP = (TEQ_OP)theEObject;
        T result = caseTEQ_OP(teQ_OP);
        if (result == null) result = casecompare_test_instr(teQ_OP);
        if (result == null) result = caseOperationInstr(teQ_OP);
        if (result == null) result = caseARMInstr(teQ_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.AND_OP:
      {
        AND_OP anD_OP = (AND_OP)theEObject;
        T result = caseAND_OP(anD_OP);
        if (result == null) result = caselogical_instr(anD_OP);
        if (result == null) result = caseOperationInstr(anD_OP);
        if (result == null) result = caseARMInstr(anD_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.EOR_OP:
      {
        EOR_OP eoR_OP = (EOR_OP)theEObject;
        T result = caseEOR_OP(eoR_OP);
        if (result == null) result = caselogical_instr(eoR_OP);
        if (result == null) result = caseOperationInstr(eoR_OP);
        if (result == null) result = caseARMInstr(eoR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ORR_OP:
      {
        ORR_OP orR_OP = (ORR_OP)theEObject;
        T result = caseORR_OP(orR_OP);
        if (result == null) result = caselogical_instr(orR_OP);
        if (result == null) result = caseOperationInstr(orR_OP);
        if (result == null) result = caseARMInstr(orR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ORN_OP:
      {
        ORN_OP orN_OP = (ORN_OP)theEObject;
        T result = caseORN_OP(orN_OP);
        if (result == null) result = caselogical_instr(orN_OP);
        if (result == null) result = caseOperationInstr(orN_OP);
        if (result == null) result = caseARMInstr(orN_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BIC_OP:
      {
        BIC_OP biC_OP = (BIC_OP)theEObject;
        T result = caseBIC_OP(biC_OP);
        if (result == null) result = caselogical_instr(biC_OP);
        if (result == null) result = caseOperationInstr(biC_OP);
        if (result == null) result = caseARMInstr(biC_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BOP:
      {
        B_OP b_OP = (B_OP)theEObject;
        T result = caseB_OP(b_OP);
        if (result == null) result = casebranch_instr(b_OP);
        if (result == null) result = caseOperationInstr(b_OP);
        if (result == null) result = caseARMInstr(b_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BL_OP:
      {
        BL_OP bL_OP = (BL_OP)theEObject;
        T result = caseBL_OP(bL_OP);
        if (result == null) result = casebranch_instr(bL_OP);
        if (result == null) result = caseOperationInstr(bL_OP);
        if (result == null) result = caseARMInstr(bL_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BX_OP:
      {
        BX_OP bX_OP = (BX_OP)theEObject;
        T result = caseBX_OP(bX_OP);
        if (result == null) result = casebranch_instr(bX_OP);
        if (result == null) result = caseOperationInstr(bX_OP);
        if (result == null) result = caseARMInstr(bX_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BLX_OP:
      {
        BLX_OP blX_OP = (BLX_OP)theEObject;
        T result = caseBLX_OP(blX_OP);
        if (result == null) result = casebranch_instr(blX_OP);
        if (result == null) result = caseOperationInstr(blX_OP);
        if (result == null) result = caseARMInstr(blX_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BXJ_OP:
      {
        BXJ_OP bxJ_OP = (BXJ_OP)theEObject;
        T result = caseBXJ_OP(bxJ_OP);
        if (result == null) result = casebranch_instr(bxJ_OP);
        if (result == null) result = caseOperationInstr(bxJ_OP);
        if (result == null) result = caseARMInstr(bxJ_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MRS_OP:
      {
        MRS_OP mrS_OP = (MRS_OP)theEObject;
        T result = caseMRS_OP(mrS_OP);
        if (result == null) result = casemrs_instr(mrS_OP);
        if (result == null) result = caseOperationInstr(mrS_OP);
        if (result == null) result = caseARMInstr(mrS_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.MSR_OP:
      {
        MSR_OP msR_OP = (MSR_OP)theEObject;
        T result = caseMSR_OP(msR_OP);
        if (result == null) result = casemsr_instr(msR_OP);
        if (result == null) result = caseOperationInstr(msR_OP);
        if (result == null) result = caseARMInstr(msR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDR_OP:
      {
        LDR_OP ldR_OP = (LDR_OP)theEObject;
        T result = caseLDR_OP(ldR_OP);
        if (result == null) result = caseldr_str_irpre_instr(ldR_OP);
        if (result == null) result = caseldr_str_spre_instr(ldR_OP);
        if (result == null) result = caseldr_str_irpsot_instr(ldR_OP);
        if (result == null) result = caseldr_str_rpost_instr(ldR_OP);
        if (result == null) result = caseOperationInstr(ldR_OP);
        if (result == null) result = caseARMInstr(ldR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.STR_OP:
      {
        STR_OP stR_OP = (STR_OP)theEObject;
        T result = caseSTR_OP(stR_OP);
        if (result == null) result = caseldr_str_irpre_instr(stR_OP);
        if (result == null) result = caseldr_str_spre_instr(stR_OP);
        if (result == null) result = caseldr_str_irpsot_instr(stR_OP);
        if (result == null) result = caseldr_str_rpost_instr(stR_OP);
        if (result == null) result = caseOperationInstr(stR_OP);
        if (result == null) result = caseARMInstr(stR_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LDM_OP:
      {
        LDM_OP ldM_OP = (LDM_OP)theEObject;
        T result = caseLDM_OP(ldM_OP);
        if (result == null) result = caseldm_instr(ldM_OP);
        if (result == null) result = caseOperationInstr(ldM_OP);
        if (result == null) result = caseARMInstr(ldM_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.STM_OP:
      {
        STM_OP stM_OP = (STM_OP)theEObject;
        T result = caseSTM_OP(stM_OP);
        if (result == null) result = caseldm_instr(stM_OP);
        if (result == null) result = caseOperationInstr(stM_OP);
        if (result == null) result = caseARMInstr(stM_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PUSH_OP:
      {
        PUSH_OP pusH_OP = (PUSH_OP)theEObject;
        T result = casePUSH_OP(pusH_OP);
        if (result == null) result = casepush_pop_instr(pusH_OP);
        if (result == null) result = caseOperationInstr(pusH_OP);
        if (result == null) result = caseARMInstr(pusH_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.POP_OP:
      {
        POP_OP poP_OP = (POP_OP)theEObject;
        T result = casePOP_OP(poP_OP);
        if (result == null) result = casepush_pop_instr(poP_OP);
        if (result == null) result = caseOperationInstr(poP_OP);
        if (result == null) result = caseARMInstr(poP_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SWP_OP:
      {
        SWP_OP swP_OP = (SWP_OP)theEObject;
        T result = caseSWP_OP(swP_OP);
        if (result == null) result = caseswp_instr(swP_OP);
        if (result == null) result = caseOperationInstr(swP_OP);
        if (result == null) result = caseARMInstr(swP_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SWPB_OP:
      {
        SWPB_OP swpB_OP = (SWPB_OP)theEObject;
        T result = caseSWPB_OP(swpB_OP);
        if (result == null) result = caseswp_instr(swpB_OP);
        if (result == null) result = caseOperationInstr(swpB_OP);
        if (result == null) result = caseARMInstr(swpB_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.SVC_OP:
      {
        SVC_OP svC_OP = (SVC_OP)theEObject;
        T result = caseSVC_OP(svC_OP);
        if (result == null) result = casesvc_instr(svC_OP);
        if (result == null) result = caseOperationInstr(svC_OP);
        if (result == null) result = caseARMInstr(svC_OP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PSR_FIELD_E:
      {
        PSR_FIELD_E psR_FIELD_E = (PSR_FIELD_E)theEObject;
        T result = casePSR_FIELD_E(psR_FIELD_E);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.APSR_FLAG_E:
      {
        APSR_FLAG_E apsR_FLAG_E = (APSR_FLAG_E)theEObject;
        T result = caseAPSR_FLAG_E(apsR_FLAG_E);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.NOP:
      {
        NOP nop = (NOP)theEObject;
        T result = caseNOP(nop);
        if (result == null) result = caseOperationInstr(nop);
        if (result == null) result = caseARMInstr(nop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PREPROCESSOR:
      {
        PREPROCESSOR preprocessor = (PREPROCESSOR)theEObject;
        T result = casePREPROCESSOR(preprocessor);
        if (result == null) result = caseCcode(preprocessor);
        if (result == null) result = caseARMInstr(preprocessor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PREPROCESSOR_DEFINE:
      {
        PREPROCESSOR_DEFINE preprocessoR_DEFINE = (PREPROCESSOR_DEFINE)theEObject;
        T result = casePREPROCESSOR_DEFINE(preprocessoR_DEFINE);
        if (result == null) result = caseCcode(preprocessoR_DEFINE);
        if (result == null) result = caseARMInstr(preprocessoR_DEFINE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PREPROCESSOR_ENDIF:
      {
        PREPROCESSOR_ENDIF preprocessoR_ENDIF = (PREPROCESSOR_ENDIF)theEObject;
        T result = casePREPROCESSOR_ENDIF(preprocessoR_ENDIF);
        if (result == null) result = caseCcode(preprocessoR_ENDIF);
        if (result == null) result = caseARMInstr(preprocessoR_ENDIF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.PREPROCESSOR_ELSE:
      {
        PREPROCESSOR_ELSE preprocessoR_ELSE = (PREPROCESSOR_ELSE)theEObject;
        T result = casePREPROCESSOR_ELSE(preprocessoR_ELSE);
        if (result == null) result = caseCcode(preprocessoR_ELSE);
        if (result == null) result = caseARMInstr(preprocessoR_ELSE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CEXTEND_CODE:
      {
        CExtendCode cExtendCode = (CExtendCode)theEObject;
        T result = caseCExtendCode(cExtendCode);
        if (result == null) result = caseCcode(cExtendCode);
        if (result == null) result = caseARMInstr(cExtendCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASSEMBLER_DIRECTIVES_EQU:
      {
        Assembler_Directives_equ assembler_Directives_equ = (Assembler_Directives_equ)theEObject;
        T result = caseAssembler_Directives_equ(assembler_Directives_equ);
        if (result == null) result = caseCcode(assembler_Directives_equ);
        if (result == null) result = caseARMInstr(assembler_Directives_equ);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASSEMBLER_DIRECTIVES:
      {
        Assembler_Directives assembler_Directives = (Assembler_Directives)theEObject;
        T result = caseAssembler_Directives(assembler_Directives);
        if (result == null) result = caseCcode(assembler_Directives);
        if (result == null) result = caseARMInstr(assembler_Directives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASSEMBLER_DIRECTIVES_MACRO:
      {
        Assembler_Directives_macro assembler_Directives_macro = (Assembler_Directives_macro)theEObject;
        T result = caseAssembler_Directives_macro(assembler_Directives_macro);
        if (result == null) result = caseCcode(assembler_Directives_macro);
        if (result == null) result = caseARMInstr(assembler_Directives_macro);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE:
      {
        Assember_Directives_type assember_Directives_type = (Assember_Directives_type)theEObject;
        T result = caseAssember_Directives_type(assember_Directives_type);
        if (result == null) result = caseCcode(assember_Directives_type);
        if (result == null) result = caseARMInstr(assember_Directives_type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ASSEMBLER_DIRECTIVES_ENDM:
      {
        Assembler_Directives_endm assembler_Directives_endm = (Assembler_Directives_endm)theEObject;
        T result = caseAssembler_Directives_endm(assembler_Directives_endm);
        if (result == null) result = caseCcode(assembler_Directives_endm);
        if (result == null) result = caseARMInstr(assembler_Directives_endm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_MACHINE_DIRECTIVES:
      {
        ARM_Machine_Directives arM_Machine_Directives = (ARM_Machine_Directives)theEObject;
        T result = caseARM_Machine_Directives(arM_Machine_Directives);
        if (result == null) result = caseCcode(arM_Machine_Directives);
        if (result == null) result = caseARMInstr(arM_Machine_Directives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN:
      {
        ARM_MACHINE_DIRECTIVES_align arM_MACHINE_DIRECTIVES_align = (ARM_MACHINE_DIRECTIVES_align)theEObject;
        T result = caseARM_MACHINE_DIRECTIVES_align(arM_MACHINE_DIRECTIVES_align);
        if (result == null) result = caseCcode(arM_MACHINE_DIRECTIVES_align);
        if (result == null) result = caseARMInstr(arM_MACHINE_DIRECTIVES_align);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE:
      {
        ARM_Machine_Directives_code arM_Machine_Directives_code = (ARM_Machine_Directives_code)theEObject;
        T result = caseARM_Machine_Directives_code(arM_Machine_Directives_code);
        if (result == null) result = caseCcode(arM_Machine_Directives_code);
        if (result == null) result = caseARMInstr(arM_Machine_Directives_code);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SYNTAX:
      {
        ARM_Machine_Directives_syntax arM_Machine_Directives_syntax = (ARM_Machine_Directives_syntax)theEObject;
        T result = caseARM_Machine_Directives_syntax(arM_Machine_Directives_syntax);
        if (result == null) result = caseCcode(arM_Machine_Directives_syntax);
        if (result == null) result = caseARMInstr(arM_Machine_Directives_syntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE:
      {
        ARM_Machine_Directives_save arM_Machine_Directives_save = (ARM_Machine_Directives_save)theEObject;
        T result = caseARM_Machine_Directives_save(arM_Machine_Directives_save);
        if (result == null) result = caseCcode(arM_Machine_Directives_save);
        if (result == null) result = caseARMInstr(arM_Machine_Directives_save);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CEXTENDASCIZ:
      {
        CExtendasciz cExtendasciz = (CExtendasciz)theEObject;
        T result = caseCExtendasciz(cExtendasciz);
        if (result == null) result = caseCcode(cExtendasciz);
        if (result == null) result = caseARMInstr(cExtendasciz);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.CLANG:
      {
        CLang cLang = (CLang)theEObject;
        T result = caseCLang(cLang);
        if (result == null) result = caseCcode(cLang);
        if (result == null) result = caseARMInstr(cLang);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.REGISTER:
      {
        REGISTER register = (REGISTER)theEObject;
        T result = caseREGISTER(register);
        if (result == null) result = caseOperand2(register);
        if (result == null) result = casers_sh(register);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.BAREL_SHIFT_REGISTER:
      {
        BAREL_SHIFT_REGISTER bareL_SHIFT_REGISTER = (BAREL_SHIFT_REGISTER)theEObject;
        T result = caseBAREL_SHIFT_REGISTER(bareL_SHIFT_REGISTER);
        if (result == null) result = caseopsh(bareL_SHIFT_REGISTER);
        if (result == null) result = casers_sh(bareL_SHIFT_REGISTER);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.OPERAND2:
      {
        Operand2 operand2 = (Operand2)theEObject;
        T result = caseOperand2(operand2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.OPSH:
      {
        opsh opsh = (opsh)theEObject;
        T result = caseopsh(opsh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.IMMEDIATE_LABEL:
      {
        immediate_label immediate_label = (immediate_label)theEObject;
        T result = caseimmediate_label(immediate_label);
        if (result == null) result = caseOperand2(immediate_label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.DESCRIPTION:
      {
        description description = (description)theEObject;
        T result = casedescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.VARIABLE:
      {
        variable variable = (variable)theEObject;
        T result = casevariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.DEFINITION:
      {
        definition definition = (definition)theEObject;
        T result = casedefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.RANDOM_ENTRY:
      {
        randomEntry randomEntry = (randomEntry)theEObject;
        T result = caserandomEntry(randomEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.RS_SH:
      {
        rs_sh rs_sh = (rs_sh)theEObject;
        T result = casers_sh(rs_sh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.FLEXIBLE_OFFSET:
      {
        flexible_offset flexible_offset = (flexible_offset)theEObject;
        T result = caseflexible_offset(flexible_offset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.LITERAL_NUMERIC:
      {
        literal_numeric literal_numeric = (literal_numeric)theEObject;
        T result = caseliteral_numeric(literal_numeric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ARMPackage.NUMERIC_BACKWARD_FORWARD:
      {
        numeric_backward_forward numeric_backward_forward = (numeric_backward_forward)theEObject;
        T result = casenumeric_backward_forward(numeric_backward_forward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARMInstr(ARMInstr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationInstr(OperationInstr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ccode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ccode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCcode(Ccode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_variable(variable_variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable colon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable colon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable_colon(variable_colon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>label keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>label keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselabel_keyword(label_keyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>add sub instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>add sub instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadd_sub_instr(add_sub_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>adrl adr instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>adrl adr instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseadrl_adr_instr(adrl_adr_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mul 3R instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mul 3R instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemul_3R_instr(mul_3R_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mul 4R instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mul 4R instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemul_4R_instr(mul_4R_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mov instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mov instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemov_instr(mov_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>shift instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>shift instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseshift_instr(shift_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>clz instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>clz instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclz_instr(clz_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>compare test instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>compare test instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecompare_test_instr(compare_test_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>logical instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>logical instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselogical_instr(logical_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>branch instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>branch instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebranch_instr(branch_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mrs instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mrs instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemrs_instr(mrs_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>msr instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>msr instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemsr_instr(msr_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldr str irpre instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldr str irpre instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldr_str_irpre_instr(ldr_str_irpre_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldr str spre instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldr str spre instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldr_str_spre_instr(ldr_str_spre_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldr str irpsot instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldr str irpsot instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldr_str_irpsot_instr(ldr_str_irpsot_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldr str rpost instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldr str rpost instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldr_str_rpost_instr(ldr_str_rpost_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldm instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldm instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldm_instr(ldm_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>push pop instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>push pop instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepush_pop_instr(push_pop_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bkpt instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bkpt instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebkpt_instr(bkpt_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>swp instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>swp instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseswp_instr(swp_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>svc instr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>svc instr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesvc_instr(svc_instr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADD OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADD OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADD_OP(ADD_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADC OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADC OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADC_OP(ADC_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADR_OP(ADR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SUB OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SUB OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSUB_OP(SUB_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SBC OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SBC OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSBC_OP(SBC_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RSB OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RSB OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRSB_OP(RSB_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RSC OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RSC OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRSC_OP(RSC_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADRL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADRL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADRL_OP(ADRL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MUL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MUL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMUL_OP(MUL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MLS OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLS OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMLS_OP(MLS_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MLA OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MLA OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMLA_OP(MLA_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UMULL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UMULL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUMULL_OP(UMULL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UMLAL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UMLAL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUMLAL_OP(UMLAL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMULL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMULL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMULL_OP(SMULL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMLAL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMLAL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMLAL_OP(SMLAL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMUL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMUL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMUL_OP(SMUL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMULW OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMULW OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMULW_OP(SMULW_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMLA OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMLA OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMLA_OP(SMLA_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMLAW OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMLAW OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMLAW_OP(SMLAW_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOV OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOV OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOV_OP(MOV_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MVN OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MVN OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMVN_OP(MVN_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASR_OP(ASR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LSL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LSL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLSL_OP(LSL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LSR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LSR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLSR_OP(LSR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ROR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ROR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseROR_OP(ROR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RRX OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RRX OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRRX_OP(RRX_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CLZ OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CLZ OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCLZ_OP(CLZ_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CMP OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CMP OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCMP_OP(CMP_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CMN OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CMN OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCMN_OP(CMN_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TST OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TST OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTST_OP(TST_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TEQ OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TEQ OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTEQ_OP(TEQ_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AND OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AND OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAND_OP(AND_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EOR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EOR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEOR_OP(EOR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORR_OP(ORR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORN OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORN OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORN_OP(ORN_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BIC OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BIC OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBIC_OP(BIC_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseB_OP(B_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BL OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BL OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBL_OP(BL_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BX OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BX OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBX_OP(BX_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BLX OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BLX OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBLX_OP(BLX_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BXJ OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BXJ OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBXJ_OP(BXJ_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MRS OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MRS OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMRS_OP(MRS_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MSR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MSR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMSR_OP(MSR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LDR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LDR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLDR_OP(LDR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STR OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STR OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTR_OP(STR_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LDM OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LDM OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLDM_OP(LDM_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STM OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STM OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTM_OP(STM_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PUSH OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PUSH OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePUSH_OP(PUSH_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POP OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POP OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOP_OP(POP_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SWP OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SWP OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSWP_OP(SWP_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SWPB OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SWPB OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSWPB_OP(SWPB_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVC OP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVC OP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSVC_OP(SVC_OP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PSR FIELD E</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PSR FIELD E</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePSR_FIELD_E(PSR_FIELD_E object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>APSR FLAG E</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>APSR FLAG E</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAPSR_FLAG_E(APSR_FLAG_E object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NOP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NOP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNOP(NOP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PREPROCESSOR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PREPROCESSOR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREPROCESSOR(PREPROCESSOR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PREPROCESSOR DEFINE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PREPROCESSOR DEFINE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREPROCESSOR_DEFINE(PREPROCESSOR_DEFINE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PREPROCESSOR ENDIF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PREPROCESSOR ENDIF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREPROCESSOR_ENDIF(PREPROCESSOR_ENDIF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PREPROCESSOR ELSE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PREPROCESSOR ELSE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePREPROCESSOR_ELSE(PREPROCESSOR_ELSE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CExtend Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CExtend Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCExtendCode(CExtendCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembler Directives equ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembler Directives equ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembler_Directives_equ(Assembler_Directives_equ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembler Directives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembler Directives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembler_Directives(Assembler_Directives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembler Directives macro</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembler Directives macro</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembler_Directives_macro(Assembler_Directives_macro object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assember Directives type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assember Directives type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssember_Directives_type(Assember_Directives_type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assembler Directives endm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assembler Directives endm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssembler_Directives_endm(Assembler_Directives_endm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARM Machine Directives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARM Machine Directives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARM_Machine_Directives(ARM_Machine_Directives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARM MACHINE DIRECTIVES align</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARM MACHINE DIRECTIVES align</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARM_MACHINE_DIRECTIVES_align(ARM_MACHINE_DIRECTIVES_align object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARM Machine Directives code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARM Machine Directives code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARM_Machine_Directives_code(ARM_Machine_Directives_code object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARM Machine Directives syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARM Machine Directives syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARM_Machine_Directives_syntax(ARM_Machine_Directives_syntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ARM Machine Directives save</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ARM Machine Directives save</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARM_Machine_Directives_save(ARM_Machine_Directives_save object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CExtendasciz</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CExtendasciz</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCExtendasciz(CExtendasciz object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CLang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CLang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCLang(CLang object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REGISTER</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REGISTER</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseREGISTER(REGISTER object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BAREL SHIFT REGISTER</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BAREL SHIFT REGISTER</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBAREL_SHIFT_REGISTER(BAREL_SHIFT_REGISTER object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operand2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operand2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperand2(Operand2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>opsh</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>opsh</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseopsh(opsh object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>immediate label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>immediate label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseimmediate_label(immediate_label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedescription(description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariable(variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedefinition(definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>random Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>random Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserandomEntry(randomEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rs sh</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rs sh</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casers_sh(rs_sh object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>flexible offset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>flexible offset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseflexible_offset(flexible_offset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>literal numeric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>literal numeric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseliteral_numeric(literal_numeric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>numeric backward forward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>numeric backward forward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenumeric_backward_forward(numeric_backward_forward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ARMSwitch
