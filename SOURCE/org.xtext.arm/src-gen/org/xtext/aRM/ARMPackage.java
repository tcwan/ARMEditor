/**
 */
package org.xtext.aRM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.aRM.ARMFactory
 * @model kind="package"
 * @generated
 */
public interface ARMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aRM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/ARM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aRM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ARMPackage eINSTANCE = org.xtext.aRM.impl.ARMPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ModelImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARMInstrImpl <em>Instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARMInstrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARMInstr()
   * @generated
   */
  int ARM_INSTR = 1;

  /**
   * The number of structural features of the '<em>Instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_INSTR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.OperationInstrImpl <em>Operation Instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.OperationInstrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getOperationInstr()
   * @generated
   */
  int OPERATION_INSTR = 2;

  /**
   * The number of structural features of the '<em>Operation Instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_INSTR_FEATURE_COUNT = ARM_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CcodeImpl <em>Ccode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CcodeImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCcode()
   * @generated
   */
  int CCODE = 3;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCODE__LABEL_KEYWORD = ARM_INSTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ccode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CCODE_FEATURE_COUNT = ARM_INSTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.variable_variableImpl <em>variable variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.variable_variableImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable_variable()
   * @generated
   */
  int VARIABLE_VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VARIABLE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VARIABLE__VARIABLE = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VARIABLE__VARIABLE2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>variable variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_VARIABLE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.variable_colonImpl <em>variable colon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.variable_colonImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable_colon()
   * @generated
   */
  int VARIABLE_COLON = 5;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COLON__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COLON__VARIABLE = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable INT</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COLON__VARIABLE_INT = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>variable colon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COLON_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.label_keywordImpl <em>label keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.label_keywordImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getlabel_keyword()
   * @generated
   */
  int LABEL_KEYWORD = 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_KEYWORD__LABEL = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_KEYWORD__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_KEYWORD__REGISTER = 2;

  /**
   * The feature id for the '<em><b>Variable2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_KEYWORD__VARIABLE2 = 3;

  /**
   * The number of structural features of the '<em>label keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_KEYWORD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.add_sub_instrImpl <em>add sub instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.add_sub_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getadd_sub_instr()
   * @generated
   */
  int ADD_SUB_INSTR = 7;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_SUB_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_SUB_INSTR__OPERAND2 = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_SUB_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>add sub instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_SUB_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.adrl_adr_instrImpl <em>adrl adr instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.adrl_adr_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getadrl_adr_instr()
   * @generated
   */
  int ADRL_ADR_INSTR = 8;

  /**
   * The number of structural features of the '<em>adrl adr instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_ADR_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.mul_3R_instrImpl <em>mul 3R instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.mul_3R_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getmul_3R_instr()
   * @generated
   */
  int MUL_3R_INSTR = 9;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_3R_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_3R_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>mul 3R instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_3R_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.mul_4R_instrImpl <em>mul 4R instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.mul_4R_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getmul_4R_instr()
   * @generated
   */
  int MUL_4R_INSTR = 10;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_4R_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_4R_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>mul 4R instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_4R_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.mov_instrImpl <em>mov instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.mov_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getmov_instr()
   * @generated
   */
  int MOV_INSTR = 11;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_INSTR__OPERAND2 = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>mov instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.shift_instrImpl <em>shift instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.shift_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getshift_instr()
   * @generated
   */
  int SHIFT_INSTR = 12;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_INSTR__RS_SH = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>shift instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.clz_instrImpl <em>clz instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.clz_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getclz_instr()
   * @generated
   */
  int CLZ_INSTR = 13;

  /**
   * The number of structural features of the '<em>clz instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLZ_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.compare_test_instrImpl <em>compare test instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.compare_test_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getcompare_test_instr()
   * @generated
   */
  int COMPARE_TEST_INSTR = 14;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_TEST_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_TEST_INSTR__OPERAND2 = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_TEST_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>compare test instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_TEST_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.logical_instrImpl <em>logical instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.logical_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getlogical_instr()
   * @generated
   */
  int LOGICAL_INSTR = 15;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INSTR__OPERAND2 = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>logical instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.branch_instrImpl <em>branch instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.branch_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getbranch_instr()
   * @generated
   */
  int BRANCH_INSTR = 16;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_INSTR__IMMEDIATE_LABEL = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>branch instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.mrs_instrImpl <em>mrs instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.mrs_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getmrs_instr()
   * @generated
   */
  int MRS_INSTR = 17;

  /**
   * The number of structural features of the '<em>mrs instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MRS_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.msr_instrImpl <em>msr instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.msr_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getmsr_instr()
   * @generated
   */
  int MSR_INSTR = 18;

  /**
   * The number of structural features of the '<em>msr instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ldr_str_irpre_instrImpl <em>ldr str irpre instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ldr_str_irpre_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_irpre_instr()
   * @generated
   */
  int LDR_STR_IRPRE_INSTR = 19;

  /**
   * The number of structural features of the '<em>ldr str irpre instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_STR_IRPRE_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ldr_str_spre_instrImpl <em>ldr str spre instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ldr_str_spre_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_spre_instr()
   * @generated
   */
  int LDR_STR_SPRE_INSTR = 20;

  /**
   * The number of structural features of the '<em>ldr str spre instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_STR_SPRE_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ldr_str_irpsot_instrImpl <em>ldr str irpsot instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ldr_str_irpsot_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_irpsot_instr()
   * @generated
   */
  int LDR_STR_IRPSOT_INSTR = 21;

  /**
   * The number of structural features of the '<em>ldr str irpsot instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_STR_IRPSOT_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ldr_str_rpost_instrImpl <em>ldr str rpost instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ldr_str_rpost_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_rpost_instr()
   * @generated
   */
  int LDR_STR_RPOST_INSTR = 22;

  /**
   * The number of structural features of the '<em>ldr str rpost instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_STR_RPOST_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ldm_instrImpl <em>ldm instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ldm_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getldm_instr()
   * @generated
   */
  int LDM_INSTR = 23;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ldm instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.push_pop_instrImpl <em>push pop instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.push_pop_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getpush_pop_instr()
   * @generated
   */
  int PUSH_POP_INSTR = 24;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_POP_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_POP_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>push pop instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_POP_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.bkpt_instrImpl <em>bkpt instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.bkpt_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getbkpt_instr()
   * @generated
   */
  int BKPT_INSTR = 25;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BKPT_INSTR__IMMEDIATE_LABEL = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>bkpt instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BKPT_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.swp_instrImpl <em>swp instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.swp_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getswp_instr()
   * @generated
   */
  int SWP_INSTR = 26;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_INSTR__REGISTER = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_INSTR__IMMEDIATE_LABEL = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_INSTR__OP = OPERATION_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>swp instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.svc_instrImpl <em>svc instr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.svc_instrImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getsvc_instr()
   * @generated
   */
  int SVC_INSTR = 27;

  /**
   * The number of structural features of the '<em>svc instr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVC_INSTR_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ADD_OPImpl <em>ADD OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ADD_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getADD_OP()
   * @generated
   */
  int ADD_OP = 28;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>ADD OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ADC_OPImpl <em>ADC OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ADC_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getADC_OP()
   * @generated
   */
  int ADC_OP = 29;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADC_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADC_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADC_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>ADC OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADC_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ADR_OPImpl <em>ADR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ADR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getADR_OP()
   * @generated
   */
  int ADR_OP = 30;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADR_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADR_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADR_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADR_OP__EXPRESSION = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ADR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADR_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SUB_OPImpl <em>SUB OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SUB_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSUB_OP()
   * @generated
   */
  int SUB_OP = 31;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>SUB OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SBC_OPImpl <em>SBC OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SBC_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSBC_OP()
   * @generated
   */
  int SBC_OP = 32;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBC_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBC_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBC_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>SBC OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SBC_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.RSB_OPImpl <em>RSB OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.RSB_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getRSB_OP()
   * @generated
   */
  int RSB_OP = 33;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSB_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSB_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSB_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>RSB OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSB_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.RSC_OPImpl <em>RSC OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.RSC_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getRSC_OP()
   * @generated
   */
  int RSC_OP = 34;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSC_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSC_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSC_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The number of structural features of the '<em>RSC OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSC_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ADRL_OPImpl <em>ADRL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ADRL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getADRL_OP()
   * @generated
   */
  int ADRL_OP = 35;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_OP__REGISTER = ADD_SUB_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_OP__OPERAND2 = ADD_SUB_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_OP__OP = ADD_SUB_INSTR__OP;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_OP__EXPRESSION = ADD_SUB_INSTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ADRL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADRL_OP_FEATURE_COUNT = ADD_SUB_INSTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MUL_OPImpl <em>MUL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MUL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMUL_OP()
   * @generated
   */
  int MUL_OP = 36;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OP__REGISTER = MUL_3R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OP__OP = MUL_3R_INSTR__OP;

  /**
   * The number of structural features of the '<em>MUL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OP_FEATURE_COUNT = MUL_3R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MLS_OPImpl <em>MLS OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MLS_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMLS_OP()
   * @generated
   */
  int MLS_OP = 37;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLS_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLS_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>MLS OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLS_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MLA_OPImpl <em>MLA OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MLA_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMLA_OP()
   * @generated
   */
  int MLA_OP = 38;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLA_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLA_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>MLA OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MLA_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.UMULL_OPImpl <em>UMULL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.UMULL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getUMULL_OP()
   * @generated
   */
  int UMULL_OP = 39;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMULL_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMULL_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>UMULL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMULL_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.UMLAL_OPImpl <em>UMLAL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.UMLAL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getUMLAL_OP()
   * @generated
   */
  int UMLAL_OP = 40;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMLAL_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMLAL_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>UMLAL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UMLAL_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMULL_OPImpl <em>SMULL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMULL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMULL_OP()
   * @generated
   */
  int SMULL_OP = 41;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULL_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULL_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMULL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULL_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMLAL_OPImpl <em>SMLAL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMLAL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLAL_OP()
   * @generated
   */
  int SMLAL_OP = 42;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAL_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAL_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMLAL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAL_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMUL_OPImpl <em>SMUL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMUL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMUL_OP()
   * @generated
   */
  int SMUL_OP = 43;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMUL_OP__REGISTER = MUL_3R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMUL_OP__OP = MUL_3R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMUL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMUL_OP_FEATURE_COUNT = MUL_3R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMULW_OPImpl <em>SMULW OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMULW_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMULW_OP()
   * @generated
   */
  int SMULW_OP = 44;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULW_OP__REGISTER = MUL_3R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULW_OP__OP = MUL_3R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMULW OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMULW_OP_FEATURE_COUNT = MUL_3R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMLA_OPImpl <em>SMLA OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMLA_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLA_OP()
   * @generated
   */
  int SMLA_OP = 45;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLA_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLA_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMLA OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLA_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SMLAW_OPImpl <em>SMLAW OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SMLAW_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLAW_OP()
   * @generated
   */
  int SMLAW_OP = 46;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAW_OP__REGISTER = MUL_4R_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAW_OP__OP = MUL_4R_INSTR__OP;

  /**
   * The number of structural features of the '<em>SMLAW OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMLAW_OP_FEATURE_COUNT = MUL_4R_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MOV_OPImpl <em>MOV OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MOV_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMOV_OP()
   * @generated
   */
  int MOV_OP = 47;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_OP__REGISTER = MOV_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_OP__OPERAND2 = MOV_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_OP__OP = MOV_INSTR__OP;

  /**
   * The number of structural features of the '<em>MOV OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOV_OP_FEATURE_COUNT = MOV_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MVN_OPImpl <em>MVN OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MVN_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMVN_OP()
   * @generated
   */
  int MVN_OP = 48;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MVN_OP__REGISTER = MOV_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MVN_OP__OPERAND2 = MOV_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MVN_OP__OP = MOV_INSTR__OP;

  /**
   * The number of structural features of the '<em>MVN OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MVN_OP_FEATURE_COUNT = MOV_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ASR_OPImpl <em>ASR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ASR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getASR_OP()
   * @generated
   */
  int ASR_OP = 49;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASR_OP__REGISTER = SHIFT_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASR_OP__RS_SH = SHIFT_INSTR__RS_SH;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASR_OP__OP = SHIFT_INSTR__OP;

  /**
   * The number of structural features of the '<em>ASR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASR_OP_FEATURE_COUNT = SHIFT_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.LSL_OPImpl <em>LSL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.LSL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getLSL_OP()
   * @generated
   */
  int LSL_OP = 50;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSL_OP__REGISTER = SHIFT_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSL_OP__RS_SH = SHIFT_INSTR__RS_SH;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSL_OP__OP = SHIFT_INSTR__OP;

  /**
   * The number of structural features of the '<em>LSL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSL_OP_FEATURE_COUNT = SHIFT_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.LSR_OPImpl <em>LSR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.LSR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getLSR_OP()
   * @generated
   */
  int LSR_OP = 51;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSR_OP__REGISTER = SHIFT_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSR_OP__RS_SH = SHIFT_INSTR__RS_SH;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSR_OP__OP = SHIFT_INSTR__OP;

  /**
   * The number of structural features of the '<em>LSR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSR_OP_FEATURE_COUNT = SHIFT_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ROR_OPImpl <em>ROR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ROR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getROR_OP()
   * @generated
   */
  int ROR_OP = 52;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROR_OP__REGISTER = SHIFT_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROR_OP__RS_SH = SHIFT_INSTR__RS_SH;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROR_OP__OP = SHIFT_INSTR__OP;

  /**
   * The number of structural features of the '<em>ROR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROR_OP_FEATURE_COUNT = SHIFT_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.RRX_OPImpl <em>RRX OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.RRX_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getRRX_OP()
   * @generated
   */
  int RRX_OP = 53;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RRX_OP__REGISTER = SHIFT_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Rs sh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RRX_OP__RS_SH = SHIFT_INSTR__RS_SH;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RRX_OP__OP = SHIFT_INSTR__OP;

  /**
   * The number of structural features of the '<em>RRX OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RRX_OP_FEATURE_COUNT = SHIFT_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CLZ_OPImpl <em>CLZ OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CLZ_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCLZ_OP()
   * @generated
   */
  int CLZ_OP = 54;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLZ_OP__REGISTER = CLZ_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLZ_OP__OP = CLZ_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CLZ OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLZ_OP_FEATURE_COUNT = CLZ_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CMP_OPImpl <em>CMP OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CMP_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCMP_OP()
   * @generated
   */
  int CMP_OP = 55;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_OP__REGISTER = COMPARE_TEST_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_OP__OPERAND2 = COMPARE_TEST_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_OP__OP = COMPARE_TEST_INSTR__OP;

  /**
   * The number of structural features of the '<em>CMP OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_OP_FEATURE_COUNT = COMPARE_TEST_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CMN_OPImpl <em>CMN OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CMN_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCMN_OP()
   * @generated
   */
  int CMN_OP = 56;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMN_OP__REGISTER = COMPARE_TEST_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMN_OP__OPERAND2 = COMPARE_TEST_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMN_OP__OP = COMPARE_TEST_INSTR__OP;

  /**
   * The number of structural features of the '<em>CMN OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMN_OP_FEATURE_COUNT = COMPARE_TEST_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.TST_OPImpl <em>TST OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.TST_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getTST_OP()
   * @generated
   */
  int TST_OP = 57;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TST_OP__REGISTER = COMPARE_TEST_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TST_OP__OPERAND2 = COMPARE_TEST_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TST_OP__OP = COMPARE_TEST_INSTR__OP;

  /**
   * The number of structural features of the '<em>TST OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TST_OP_FEATURE_COUNT = COMPARE_TEST_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.TEQ_OPImpl <em>TEQ OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.TEQ_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getTEQ_OP()
   * @generated
   */
  int TEQ_OP = 58;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEQ_OP__REGISTER = COMPARE_TEST_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEQ_OP__OPERAND2 = COMPARE_TEST_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEQ_OP__OP = COMPARE_TEST_INSTR__OP;

  /**
   * The number of structural features of the '<em>TEQ OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEQ_OP_FEATURE_COUNT = COMPARE_TEST_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.AND_OPImpl <em>AND OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.AND_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAND_OP()
   * @generated
   */
  int AND_OP = 59;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP__REGISTER = LOGICAL_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP__OPERAND2 = LOGICAL_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP__OP = LOGICAL_INSTR__OP;

  /**
   * The number of structural features of the '<em>AND OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OP_FEATURE_COUNT = LOGICAL_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.EOR_OPImpl <em>EOR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.EOR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getEOR_OP()
   * @generated
   */
  int EOR_OP = 60;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOR_OP__REGISTER = LOGICAL_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOR_OP__OPERAND2 = LOGICAL_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOR_OP__OP = LOGICAL_INSTR__OP;

  /**
   * The number of structural features of the '<em>EOR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EOR_OP_FEATURE_COUNT = LOGICAL_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ORR_OPImpl <em>ORR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ORR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getORR_OP()
   * @generated
   */
  int ORR_OP = 61;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORR_OP__REGISTER = LOGICAL_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORR_OP__OPERAND2 = LOGICAL_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORR_OP__OP = LOGICAL_INSTR__OP;

  /**
   * The number of structural features of the '<em>ORR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORR_OP_FEATURE_COUNT = LOGICAL_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ORN_OPImpl <em>ORN OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ORN_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getORN_OP()
   * @generated
   */
  int ORN_OP = 62;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORN_OP__REGISTER = LOGICAL_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORN_OP__OPERAND2 = LOGICAL_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORN_OP__OP = LOGICAL_INSTR__OP;

  /**
   * The number of structural features of the '<em>ORN OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORN_OP_FEATURE_COUNT = LOGICAL_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BIC_OPImpl <em>BIC OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BIC_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBIC_OP()
   * @generated
   */
  int BIC_OP = 63;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIC_OP__REGISTER = LOGICAL_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIC_OP__OPERAND2 = LOGICAL_INSTR__OPERAND2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIC_OP__OP = LOGICAL_INSTR__OP;

  /**
   * The number of structural features of the '<em>BIC OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIC_OP_FEATURE_COUNT = LOGICAL_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.B_OPImpl <em>BOP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.B_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getB_OP()
   * @generated
   */
  int BOP = 64;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOP__IMMEDIATE_LABEL = BRANCH_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOP__REGISTER = BRANCH_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOP__OP = BRANCH_INSTR__OP;

  /**
   * The number of structural features of the '<em>BOP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOP_FEATURE_COUNT = BRANCH_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BL_OPImpl <em>BL OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BL_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBL_OP()
   * @generated
   */
  int BL_OP = 65;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BL_OP__IMMEDIATE_LABEL = BRANCH_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BL_OP__REGISTER = BRANCH_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BL_OP__OP = BRANCH_INSTR__OP;

  /**
   * The number of structural features of the '<em>BL OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BL_OP_FEATURE_COUNT = BRANCH_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BX_OPImpl <em>BX OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BX_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBX_OP()
   * @generated
   */
  int BX_OP = 66;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BX_OP__IMMEDIATE_LABEL = BRANCH_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BX_OP__REGISTER = BRANCH_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BX_OP__OP = BRANCH_INSTR__OP;

  /**
   * The number of structural features of the '<em>BX OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BX_OP_FEATURE_COUNT = BRANCH_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BLX_OPImpl <em>BLX OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BLX_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBLX_OP()
   * @generated
   */
  int BLX_OP = 67;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLX_OP__IMMEDIATE_LABEL = BRANCH_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLX_OP__REGISTER = BRANCH_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLX_OP__OP = BRANCH_INSTR__OP;

  /**
   * The number of structural features of the '<em>BLX OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLX_OP_FEATURE_COUNT = BRANCH_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BXJ_OPImpl <em>BXJ OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BXJ_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBXJ_OP()
   * @generated
   */
  int BXJ_OP = 68;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BXJ_OP__IMMEDIATE_LABEL = BRANCH_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BXJ_OP__REGISTER = BRANCH_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BXJ_OP__OP = BRANCH_INSTR__OP;

  /**
   * The number of structural features of the '<em>BXJ OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BXJ_OP_FEATURE_COUNT = BRANCH_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MRS_OPImpl <em>MRS OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MRS_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMRS_OP()
   * @generated
   */
  int MRS_OP = 69;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MRS_OP__REGISTER = MRS_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>PSR FIELD</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MRS_OP__PSR_FIELD = MRS_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MRS_OP__OP = MRS_INSTR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MRS OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MRS_OP_FEATURE_COUNT = MRS_INSTR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.MSR_OPImpl <em>MSR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.MSR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getMSR_OP()
   * @generated
   */
  int MSR_OP = 70;

  /**
   * The feature id for the '<em><b>APSR FLAG</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP__APSR_FLAG = MSR_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>PSR FIELD</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP__PSR_FIELD = MSR_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP__REGISTER = MSR_INSTR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP__IMMEDIATE_LABEL = MSR_INSTR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP__OP = MSR_INSTR_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>MSR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MSR_OP_FEATURE_COUNT = MSR_INSTR_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.LDR_OPImpl <em>LDR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.LDR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getLDR_OP()
   * @generated
   */
  int LDR_OP = 71;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_OP__REGISTER = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_OP__IMMEDIATE_LABEL = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_OP__BAREL_SHIFT_REGISTER = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_OP__OP = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>LDR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDR_OP_FEATURE_COUNT = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.STR_OPImpl <em>STR OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.STR_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSTR_OP()
   * @generated
   */
  int STR_OP = 72;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_OP__REGISTER = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_OP__IMMEDIATE_LABEL = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_OP__BAREL_SHIFT_REGISTER = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_OP__OP = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>STR OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_OP_FEATURE_COUNT = LDR_STR_IRPRE_INSTR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.LDM_OPImpl <em>LDM OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.LDM_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getLDM_OP()
   * @generated
   */
  int LDM_OP = 73;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_OP__REGISTER = LDM_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_OP__OP = LDM_INSTR__OP;

  /**
   * The number of structural features of the '<em>LDM OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDM_OP_FEATURE_COUNT = LDM_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.STM_OPImpl <em>STM OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.STM_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSTM_OP()
   * @generated
   */
  int STM_OP = 74;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STM_OP__REGISTER = LDM_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STM_OP__OP = LDM_INSTR__OP;

  /**
   * The number of structural features of the '<em>STM OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STM_OP_FEATURE_COUNT = LDM_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PUSH_OPImpl <em>PUSH OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PUSH_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPUSH_OP()
   * @generated
   */
  int PUSH_OP = 75;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_OP__REGISTER = PUSH_POP_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_OP__OP = PUSH_POP_INSTR__OP;

  /**
   * The number of structural features of the '<em>PUSH OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_OP_FEATURE_COUNT = PUSH_POP_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.POP_OPImpl <em>POP OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.POP_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPOP_OP()
   * @generated
   */
  int POP_OP = 76;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_OP__REGISTER = PUSH_POP_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_OP__OP = PUSH_POP_INSTR__OP;

  /**
   * The number of structural features of the '<em>POP OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POP_OP_FEATURE_COUNT = PUSH_POP_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SWP_OPImpl <em>SWP OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SWP_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSWP_OP()
   * @generated
   */
  int SWP_OP = 77;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_OP__REGISTER = SWP_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_OP__IMMEDIATE_LABEL = SWP_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_OP__OP = SWP_INSTR__OP;

  /**
   * The number of structural features of the '<em>SWP OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWP_OP_FEATURE_COUNT = SWP_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SWPB_OPImpl <em>SWPB OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SWPB_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSWPB_OP()
   * @generated
   */
  int SWPB_OP = 78;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWPB_OP__REGISTER = SWP_INSTR__REGISTER;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWPB_OP__IMMEDIATE_LABEL = SWP_INSTR__IMMEDIATE_LABEL;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWPB_OP__OP = SWP_INSTR__OP;

  /**
   * The number of structural features of the '<em>SWPB OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWPB_OP_FEATURE_COUNT = SWP_INSTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.SVC_OPImpl <em>SVC OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.SVC_OPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getSVC_OP()
   * @generated
   */
  int SVC_OP = 79;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVC_OP__IMMEDIATE_LABEL = SVC_INSTR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVC_OP__OP = SVC_INSTR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SVC OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVC_OP_FEATURE_COUNT = SVC_INSTR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PSR_FIELD_EImpl <em>PSR FIELD E</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PSR_FIELD_EImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPSR_FIELD_E()
   * @generated
   */
  int PSR_FIELD_E = 80;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSR_FIELD_E__OP = 0;

  /**
   * The number of structural features of the '<em>PSR FIELD E</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSR_FIELD_E_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.APSR_FLAG_EImpl <em>APSR FLAG E</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.APSR_FLAG_EImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAPSR_FLAG_E()
   * @generated
   */
  int APSR_FLAG_E = 81;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APSR_FLAG_E__OP = 0;

  /**
   * The number of structural features of the '<em>APSR FLAG E</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APSR_FLAG_E_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.NOPImpl <em>NOP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.NOPImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getNOP()
   * @generated
   */
  int NOP = 82;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP__OP = OPERATION_INSTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>NOP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOP_FEATURE_COUNT = OPERATION_INSTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PREPROCESSORImpl <em>PREPROCESSOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PREPROCESSORImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR()
   * @generated
   */
  int PREPROCESSOR = 83;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR__HASH = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>PREPROCESSOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl <em>PREPROCESSOR DEFINE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_DEFINE()
   * @generated
   */
  int PREPROCESSOR_DEFINE = 84;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE__HASH = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>PREPROCESSOR DEFINE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_DEFINE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PREPROCESSOR_ENDIFImpl <em>PREPROCESSOR ENDIF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PREPROCESSOR_ENDIFImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_ENDIF()
   * @generated
   */
  int PREPROCESSOR_ENDIF = 85;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ENDIF__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ENDIF__HASH = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ENDIF__CODE = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PREPROCESSOR ENDIF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ENDIF_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl <em>PREPROCESSOR ELSE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_ELSE()
   * @generated
   */
  int PREPROCESSOR_ELSE = 86;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ELSE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ELSE__HASH = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ELSE__CODE = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PREPROCESSOR ELSE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREPROCESSOR_ELSE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CExtendCodeImpl <em>CExtend Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CExtendCodeImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCExtendCode()
   * @generated
   */
  int CEXTEND_CODE = 87;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>CExtend Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTEND_CODE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Assembler_Directives_equImpl <em>Assembler Directives equ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Assembler_Directives_equImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_equ()
   * @generated
   */
  int ASSEMBLER_DIRECTIVES_EQU = 88;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assembler Directives equ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_EQU_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Assembler_DirectivesImpl <em>Assembler Directives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Assembler_DirectivesImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives()
   * @generated
   */
  int ASSEMBLER_DIRECTIVES = 89;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assembler Directives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Assembler_Directives_macroImpl <em>Assembler Directives macro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Assembler_Directives_macroImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_macro()
   * @generated
   */
  int ASSEMBLER_DIRECTIVES_MACRO = 90;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO__DEFINITION = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assembler Directives macro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_MACRO_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Assember_Directives_typeImpl <em>Assember Directives type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Assember_Directives_typeImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAssember_Directives_type()
   * @generated
   */
  int ASSEMBER_DIRECTIVES_TYPE = 91;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assember Directives type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBER_DIRECTIVES_TYPE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Assembler_Directives_endmImpl <em>Assembler Directives endm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Assembler_Directives_endmImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_endm()
   * @generated
   */
  int ASSEMBLER_DIRECTIVES_ENDM = 92;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_ENDM__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_ENDM__DOT = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_ENDM__CODE = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assembler Directives endm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSEMBLER_DIRECTIVES_ENDM_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl <em>ARM Machine Directives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARM_Machine_DirectivesImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives()
   * @generated
   */
  int ARM_MACHINE_DIRECTIVES = 93;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES__EXPRESSION2 = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>ARM Machine Directives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl <em>ARM MACHINE DIRECTIVES align</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_MACHINE_DIRECTIVES_align()
   * @generated
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN = 94;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN__INT = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN__HEX = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>ARM MACHINE DIRECTIVES align</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_ALIGN_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl <em>ARM Machine Directives code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_code()
   * @generated
   */
  int ARM_MACHINE_DIRECTIVES_CODE = 95;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Arm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE__ARM = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Thumb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE__THUMB = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE__DOT = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE__CODE = CCODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>ARM Machine Directives code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_CODE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_syntaxImpl <em>ARM Machine Directives syntax</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARM_Machine_Directives_syntaxImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_syntax()
   * @generated
   */
  int ARM_MACHINE_DIRECTIVES_SYNTAX = 96;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SYNTAX__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SYNTAX__DOT = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SYNTAX__CODE = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ARM Machine Directives syntax</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SYNTAX_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl <em>ARM Machine Directives save</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_save()
   * @generated
   */
  int ARM_MACHINE_DIRECTIVES_SAVE = 97;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Reglist</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__REGLIST = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reglist Num</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__REGISTER = CCODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__DOT = CCODE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE__CODE = CCODE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>ARM Machine Directives save</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARM_MACHINE_DIRECTIVES_SAVE_FEATURE_COUNT = CCODE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CExtendascizImpl <em>CExtendasciz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CExtendascizImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCExtendasciz()
   * @generated
   */
  int CEXTENDASCIZ = 98;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTENDASCIZ__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTENDASCIZ__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTENDASCIZ__DOT = CCODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTENDASCIZ__CODE = CCODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>CExtendasciz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEXTENDASCIZ_FEATURE_COUNT = CCODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.CLangImpl <em>CLang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.CLangImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getCLang()
   * @generated
   */
  int CLANG = 99;

  /**
   * The feature id for the '<em><b>Label keyword</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLANG__LABEL_KEYWORD = CCODE__LABEL_KEYWORD;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLANG__EXPRESSION = CCODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLANG__CODE = CCODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CLang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLANG_FEATURE_COUNT = CCODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.Operand2Impl <em>Operand2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.Operand2Impl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getOperand2()
   * @generated
   */
  int OPERAND2 = 102;

  /**
   * The number of structural features of the '<em>Operand2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND2_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.REGISTERImpl <em>REGISTER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.REGISTERImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getREGISTER()
   * @generated
   */
  int REGISTER = 100;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__IMMEDIATE_LABEL = OPERAND2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>R0</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0 = OPERAND2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>R1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R1 = OPERAND2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>R2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R2 = OPERAND2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>R3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R3 = OPERAND2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>R4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R4 = OPERAND2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>R5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R5 = OPERAND2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>R6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R6 = OPERAND2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>R7</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R7 = OPERAND2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>R8</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R8 = OPERAND2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>R9</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R9 = OPERAND2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>R10</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R10 = OPERAND2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>R11</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R11 = OPERAND2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>R12</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R12 = OPERAND2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>R13</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R13 = OPERAND2_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>R14</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R14 = OPERAND2_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>R15</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R15 = OPERAND2_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Rfp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__RFP = OPERAND2_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Rip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__RIP = OPERAND2_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Rsp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__RSP = OPERAND2_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Rlr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__RLR = OPERAND2_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Rpc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__RPC = OPERAND2_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>R001</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R001 = OPERAND2_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>R01</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R01 = OPERAND2_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>R02</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R02 = OPERAND2_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>R03</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R03 = OPERAND2_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>R04</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R04 = OPERAND2_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>R05</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R05 = OPERAND2_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>R06</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R06 = OPERAND2_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>R07</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R07 = OPERAND2_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>R08</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R08 = OPERAND2_FEATURE_COUNT + 30;

  /**
   * The feature id for the '<em><b>R09</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R09 = OPERAND2_FEATURE_COUNT + 31;

  /**
   * The feature id for the '<em><b>R010</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R010 = OPERAND2_FEATURE_COUNT + 32;

  /**
   * The feature id for the '<em><b>R011</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R011 = OPERAND2_FEATURE_COUNT + 33;

  /**
   * The feature id for the '<em><b>R012</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R012 = OPERAND2_FEATURE_COUNT + 34;

  /**
   * The feature id for the '<em><b>R013</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R013 = OPERAND2_FEATURE_COUNT + 35;

  /**
   * The feature id for the '<em><b>R014</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R014 = OPERAND2_FEATURE_COUNT + 36;

  /**
   * The feature id for the '<em><b>R015</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R015 = OPERAND2_FEATURE_COUNT + 37;

  /**
   * The feature id for the '<em><b>R0FP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0FP = OPERAND2_FEATURE_COUNT + 38;

  /**
   * The feature id for the '<em><b>R0IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0IP = OPERAND2_FEATURE_COUNT + 39;

  /**
   * The feature id for the '<em><b>R0SP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0SP = OPERAND2_FEATURE_COUNT + 40;

  /**
   * The feature id for the '<em><b>R0LR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0LR = OPERAND2_FEATURE_COUNT + 41;

  /**
   * The feature id for the '<em><b>R0PC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__R0PC = OPERAND2_FEATURE_COUNT + 42;

  /**
   * The feature id for the '<em><b>Opsh</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER__OPSH = OPERAND2_FEATURE_COUNT + 43;

  /**
   * The number of structural features of the '<em>REGISTER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_FEATURE_COUNT = OPERAND2_FEATURE_COUNT + 44;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.opshImpl <em>opsh</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.opshImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getopsh()
   * @generated
   */
  int OPSH = 103;

  /**
   * The number of structural features of the '<em>opsh</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPSH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl <em>BAREL SHIFT REGISTER</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getBAREL_SHIFT_REGISTER()
   * @generated
   */
  int BAREL_SHIFT_REGISTER = 101;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL = OPSH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>BAREL SHIFT REGISTER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER = OPSH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAREL_SHIFT_REGISTER__REGISTER = OPSH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BAREL SHIFT REGISTER</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAREL_SHIFT_REGISTER_FEATURE_COUNT = OPSH_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.immediate_labelImpl <em>immediate label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.immediate_labelImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getimmediate_label()
   * @generated
   */
  int IMMEDIATE_LABEL = 104;

  /**
   * The feature id for the '<em><b>Literal numeric</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__LITERAL_NUMERIC = OPERAND2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Numeric backward forward</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD = OPERAND2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__LABEL = OPERAND2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Num2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__NUM2 = OPERAND2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Label2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__LABEL2 = OPERAND2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL__NUM = OPERAND2_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>immediate label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMMEDIATE_LABEL_FEATURE_COUNT = OPERAND2_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.descriptionImpl <em>description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.descriptionImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getdescription()
   * @generated
   */
  int DESCRIPTION = 105;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__INT = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__STRING = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.variableImpl <em>variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.variableImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable()
   * @generated
   */
  int VARIABLE = 106;

  /**
   * The feature id for the '<em><b>Variable Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE_INT = 0;

  /**
   * The feature id for the '<em><b>Variable ABC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE_ABC = 1;

  /**
   * The feature id for the '<em><b>Variable String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE_STRING = 2;

  /**
   * The feature id for the '<em><b>Variable Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VARIABLE_HEX = 3;

  /**
   * The number of structural features of the '<em>variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.definitionImpl <em>definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.definitionImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getdefinition()
   * @generated
   */
  int DEFINITION = 107;

  /**
   * The feature id for the '<em><b>Variable Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__VARIABLE_INT = 0;

  /**
   * The feature id for the '<em><b>Variable ABC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__VARIABLE_ABC = 1;

  /**
   * The feature id for the '<em><b>Variable String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__VARIABLE_STRING = 2;

  /**
   * The feature id for the '<em><b>Variable Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__VARIABLE_HEX = 3;

  /**
   * The feature id for the '<em><b>Def Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DEF_INT = 4;

  /**
   * The feature id for the '<em><b>Def ABC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DEF_ABC = 5;

  /**
   * The feature id for the '<em><b>Def String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DEF_STRING = 6;

  /**
   * The feature id for the '<em><b>Def Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__DEF_HEX = 7;

  /**
   * The number of structural features of the '<em>definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.randomEntryImpl <em>random Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.randomEntryImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getrandomEntry()
   * @generated
   */
  int RANDOM_ENTRY = 108;

  /**
   * The feature id for the '<em><b>Entry Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ENTRY__ENTRY_INT = 0;

  /**
   * The feature id for the '<em><b>Entry ABC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ENTRY__ENTRY_ABC = 1;

  /**
   * The feature id for the '<em><b>Entry String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ENTRY__ENTRY_STRING = 2;

  /**
   * The feature id for the '<em><b>Entry Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ENTRY__ENTRY_HEX = 3;

  /**
   * The number of structural features of the '<em>random Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_ENTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.rs_shImpl <em>rs sh</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.rs_shImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getrs_sh()
   * @generated
   */
  int RS_SH = 109;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RS_SH__IMMEDIATE_LABEL = 0;

  /**
   * The number of structural features of the '<em>rs sh</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RS_SH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.flexible_offsetImpl <em>flexible offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.flexible_offsetImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getflexible_offset()
   * @generated
   */
  int FLEXIBLE_OFFSET = 110;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__EXPR = 0;

  /**
   * The feature id for the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__EXPR2 = 1;

  /**
   * The feature id for the '<em><b>Register</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__REGISTER = 2;

  /**
   * The feature id for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER = 3;

  /**
   * The feature id for the '<em><b>Immediate label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__IMMEDIATE_LABEL = 4;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET__NUM = 5;

  /**
   * The number of structural features of the '<em>flexible offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLEXIBLE_OFFSET_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.literal_numericImpl <em>literal numeric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.literal_numericImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getliteral_numeric()
   * @generated
   */
  int LITERAL_NUMERIC = 111;

  /**
   * The feature id for the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NUMERIC__HEX = 0;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NUMERIC__INT = 1;

  /**
   * The number of structural features of the '<em>literal numeric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_NUMERIC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.aRM.impl.numeric_backward_forwardImpl <em>numeric backward forward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.aRM.impl.numeric_backward_forwardImpl
   * @see org.xtext.aRM.impl.ARMPackageImpl#getnumeric_backward_forward()
   * @generated
   */
  int NUMERIC_BACKWARD_FORWARD = 112;

  /**
   * The feature id for the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_BACKWARD_FORWARD__HEX = 0;

  /**
   * The feature id for the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_BACKWARD_FORWARD__INT = 1;

  /**
   * The number of structural features of the '<em>numeric backward forward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_BACKWARD_FORWARD_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.aRM.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.aRM.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARMInstr <em>Instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instr</em>'.
   * @see org.xtext.aRM.ARMInstr
   * @generated
   */
  EClass getARMInstr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.OperationInstr <em>Operation Instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Instr</em>'.
   * @see org.xtext.aRM.OperationInstr
   * @generated
   */
  EClass getOperationInstr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Ccode <em>Ccode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ccode</em>'.
   * @see org.xtext.aRM.Ccode
   * @generated
   */
  EClass getCcode();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Ccode#getLabel_keyword <em>Label keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Label keyword</em>'.
   * @see org.xtext.aRM.Ccode#getLabel_keyword()
   * @see #getCcode()
   * @generated
   */
  EReference getCcode_Label_keyword();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.variable_variable <em>variable variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable variable</em>'.
   * @see org.xtext.aRM.variable_variable
   * @generated
   */
  EClass getvariable_variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.variable_variable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.xtext.aRM.variable_variable#getVariable()
   * @see #getvariable_variable()
   * @generated
   */
  EReference getvariable_variable_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.variable_variable#getVariable2 <em>Variable2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable2</em>'.
   * @see org.xtext.aRM.variable_variable#getVariable2()
   * @see #getvariable_variable()
   * @generated
   */
  EReference getvariable_variable_Variable2();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.variable_colon <em>variable colon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable colon</em>'.
   * @see org.xtext.aRM.variable_colon
   * @generated
   */
  EClass getvariable_colon();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.variable_colon#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variable</em>'.
   * @see org.xtext.aRM.variable_colon#getVariable()
   * @see #getvariable_colon()
   * @generated
   */
  EAttribute getvariable_colon_Variable();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.variable_colon#getVariableINT <em>Variable INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Variable INT</em>'.
   * @see org.xtext.aRM.variable_colon#getVariableINT()
   * @see #getvariable_colon()
   * @generated
   */
  EAttribute getvariable_colon_VariableINT();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.label_keyword <em>label keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>label keyword</em>'.
   * @see org.xtext.aRM.label_keyword
   * @generated
   */
  EClass getlabel_keyword();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.label_keyword#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Label</em>'.
   * @see org.xtext.aRM.label_keyword#getLabel()
   * @see #getlabel_keyword()
   * @generated
   */
  EAttribute getlabel_keyword_Label();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.label_keyword#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see org.xtext.aRM.label_keyword#getVariable()
   * @see #getlabel_keyword()
   * @generated
   */
  EReference getlabel_keyword_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.label_keyword#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.label_keyword#getRegister()
   * @see #getlabel_keyword()
   * @generated
   */
  EReference getlabel_keyword_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.label_keyword#getVariable2 <em>Variable2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable2</em>'.
   * @see org.xtext.aRM.label_keyword#getVariable2()
   * @see #getlabel_keyword()
   * @generated
   */
  EReference getlabel_keyword_Variable2();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.add_sub_instr <em>add sub instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>add sub instr</em>'.
   * @see org.xtext.aRM.add_sub_instr
   * @generated
   */
  EClass getadd_sub_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.add_sub_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.add_sub_instr#getRegister()
   * @see #getadd_sub_instr()
   * @generated
   */
  EReference getadd_sub_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.add_sub_instr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operand2</em>'.
   * @see org.xtext.aRM.add_sub_instr#getOperand2()
   * @see #getadd_sub_instr()
   * @generated
   */
  EReference getadd_sub_instr_Operand2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.add_sub_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.add_sub_instr#isOp()
   * @see #getadd_sub_instr()
   * @generated
   */
  EAttribute getadd_sub_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.adrl_adr_instr <em>adrl adr instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>adrl adr instr</em>'.
   * @see org.xtext.aRM.adrl_adr_instr
   * @generated
   */
  EClass getadrl_adr_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.mul_3R_instr <em>mul 3R instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mul 3R instr</em>'.
   * @see org.xtext.aRM.mul_3R_instr
   * @generated
   */
  EClass getmul_3R_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.mul_3R_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.mul_3R_instr#getRegister()
   * @see #getmul_3R_instr()
   * @generated
   */
  EReference getmul_3R_instr_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.mul_3R_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.mul_3R_instr#isOp()
   * @see #getmul_3R_instr()
   * @generated
   */
  EAttribute getmul_3R_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.mul_4R_instr <em>mul 4R instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mul 4R instr</em>'.
   * @see org.xtext.aRM.mul_4R_instr
   * @generated
   */
  EClass getmul_4R_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.mul_4R_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.mul_4R_instr#getRegister()
   * @see #getmul_4R_instr()
   * @generated
   */
  EReference getmul_4R_instr_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.mul_4R_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.mul_4R_instr#isOp()
   * @see #getmul_4R_instr()
   * @generated
   */
  EAttribute getmul_4R_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.mov_instr <em>mov instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mov instr</em>'.
   * @see org.xtext.aRM.mov_instr
   * @generated
   */
  EClass getmov_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.mov_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.mov_instr#getRegister()
   * @see #getmov_instr()
   * @generated
   */
  EReference getmov_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.mov_instr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operand2</em>'.
   * @see org.xtext.aRM.mov_instr#getOperand2()
   * @see #getmov_instr()
   * @generated
   */
  EReference getmov_instr_Operand2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.mov_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.mov_instr#isOp()
   * @see #getmov_instr()
   * @generated
   */
  EAttribute getmov_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.shift_instr <em>shift instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>shift instr</em>'.
   * @see org.xtext.aRM.shift_instr
   * @generated
   */
  EClass getshift_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.shift_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.shift_instr#getRegister()
   * @see #getshift_instr()
   * @generated
   */
  EReference getshift_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.shift_instr#getRs_sh <em>Rs sh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rs sh</em>'.
   * @see org.xtext.aRM.shift_instr#getRs_sh()
   * @see #getshift_instr()
   * @generated
   */
  EReference getshift_instr_Rs_sh();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.shift_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.shift_instr#isOp()
   * @see #getshift_instr()
   * @generated
   */
  EAttribute getshift_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.clz_instr <em>clz instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>clz instr</em>'.
   * @see org.xtext.aRM.clz_instr
   * @generated
   */
  EClass getclz_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.compare_test_instr <em>compare test instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>compare test instr</em>'.
   * @see org.xtext.aRM.compare_test_instr
   * @generated
   */
  EClass getcompare_test_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.compare_test_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.compare_test_instr#getRegister()
   * @see #getcompare_test_instr()
   * @generated
   */
  EReference getcompare_test_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.compare_test_instr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operand2</em>'.
   * @see org.xtext.aRM.compare_test_instr#getOperand2()
   * @see #getcompare_test_instr()
   * @generated
   */
  EReference getcompare_test_instr_Operand2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.compare_test_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.compare_test_instr#isOp()
   * @see #getcompare_test_instr()
   * @generated
   */
  EAttribute getcompare_test_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.logical_instr <em>logical instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>logical instr</em>'.
   * @see org.xtext.aRM.logical_instr
   * @generated
   */
  EClass getlogical_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.logical_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.logical_instr#getRegister()
   * @see #getlogical_instr()
   * @generated
   */
  EReference getlogical_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.logical_instr#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operand2</em>'.
   * @see org.xtext.aRM.logical_instr#getOperand2()
   * @see #getlogical_instr()
   * @generated
   */
  EReference getlogical_instr_Operand2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.logical_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.logical_instr#isOp()
   * @see #getlogical_instr()
   * @generated
   */
  EAttribute getlogical_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.branch_instr <em>branch instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>branch instr</em>'.
   * @see org.xtext.aRM.branch_instr
   * @generated
   */
  EClass getbranch_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.branch_instr#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.branch_instr#getImmediate_label()
   * @see #getbranch_instr()
   * @generated
   */
  EReference getbranch_instr_Immediate_label();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.branch_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.branch_instr#getRegister()
   * @see #getbranch_instr()
   * @generated
   */
  EReference getbranch_instr_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.branch_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.branch_instr#isOp()
   * @see #getbranch_instr()
   * @generated
   */
  EAttribute getbranch_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.mrs_instr <em>mrs instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mrs instr</em>'.
   * @see org.xtext.aRM.mrs_instr
   * @generated
   */
  EClass getmrs_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.msr_instr <em>msr instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>msr instr</em>'.
   * @see org.xtext.aRM.msr_instr
   * @generated
   */
  EClass getmsr_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ldr_str_irpre_instr <em>ldr str irpre instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldr str irpre instr</em>'.
   * @see org.xtext.aRM.ldr_str_irpre_instr
   * @generated
   */
  EClass getldr_str_irpre_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ldr_str_spre_instr <em>ldr str spre instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldr str spre instr</em>'.
   * @see org.xtext.aRM.ldr_str_spre_instr
   * @generated
   */
  EClass getldr_str_spre_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ldr_str_irpsot_instr <em>ldr str irpsot instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldr str irpsot instr</em>'.
   * @see org.xtext.aRM.ldr_str_irpsot_instr
   * @generated
   */
  EClass getldr_str_irpsot_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ldr_str_rpost_instr <em>ldr str rpost instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldr str rpost instr</em>'.
   * @see org.xtext.aRM.ldr_str_rpost_instr
   * @generated
   */
  EClass getldr_str_rpost_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ldm_instr <em>ldm instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldm instr</em>'.
   * @see org.xtext.aRM.ldm_instr
   * @generated
   */
  EClass getldm_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.ldm_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.ldm_instr#getRegister()
   * @see #getldm_instr()
   * @generated
   */
  EReference getldm_instr_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ldm_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.ldm_instr#isOp()
   * @see #getldm_instr()
   * @generated
   */
  EAttribute getldm_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.push_pop_instr <em>push pop instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>push pop instr</em>'.
   * @see org.xtext.aRM.push_pop_instr
   * @generated
   */
  EClass getpush_pop_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.push_pop_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.push_pop_instr#getRegister()
   * @see #getpush_pop_instr()
   * @generated
   */
  EReference getpush_pop_instr_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.push_pop_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.push_pop_instr#isOp()
   * @see #getpush_pop_instr()
   * @generated
   */
  EAttribute getpush_pop_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.bkpt_instr <em>bkpt instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bkpt instr</em>'.
   * @see org.xtext.aRM.bkpt_instr
   * @generated
   */
  EClass getbkpt_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.bkpt_instr#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.bkpt_instr#getImmediate_label()
   * @see #getbkpt_instr()
   * @generated
   */
  EReference getbkpt_instr_Immediate_label();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.swp_instr <em>swp instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>swp instr</em>'.
   * @see org.xtext.aRM.swp_instr
   * @generated
   */
  EClass getswp_instr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.swp_instr#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.swp_instr#getRegister()
   * @see #getswp_instr()
   * @generated
   */
  EReference getswp_instr_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.swp_instr#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.swp_instr#getImmediate_label()
   * @see #getswp_instr()
   * @generated
   */
  EReference getswp_instr_Immediate_label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.swp_instr#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.swp_instr#isOp()
   * @see #getswp_instr()
   * @generated
   */
  EAttribute getswp_instr_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.svc_instr <em>svc instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>svc instr</em>'.
   * @see org.xtext.aRM.svc_instr
   * @generated
   */
  EClass getsvc_instr();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ADD_OP <em>ADD OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADD OP</em>'.
   * @see org.xtext.aRM.ADD_OP
   * @generated
   */
  EClass getADD_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ADC_OP <em>ADC OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADC OP</em>'.
   * @see org.xtext.aRM.ADC_OP
   * @generated
   */
  EClass getADC_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ADR_OP <em>ADR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADR OP</em>'.
   * @see org.xtext.aRM.ADR_OP
   * @generated
   */
  EClass getADR_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.ADR_OP#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.aRM.ADR_OP#getExpression()
   * @see #getADR_OP()
   * @generated
   */
  EReference getADR_OP_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SUB_OP <em>SUB OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SUB OP</em>'.
   * @see org.xtext.aRM.SUB_OP
   * @generated
   */
  EClass getSUB_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SBC_OP <em>SBC OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SBC OP</em>'.
   * @see org.xtext.aRM.SBC_OP
   * @generated
   */
  EClass getSBC_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.RSB_OP <em>RSB OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSB OP</em>'.
   * @see org.xtext.aRM.RSB_OP
   * @generated
   */
  EClass getRSB_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.RSC_OP <em>RSC OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSC OP</em>'.
   * @see org.xtext.aRM.RSC_OP
   * @generated
   */
  EClass getRSC_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ADRL_OP <em>ADRL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADRL OP</em>'.
   * @see org.xtext.aRM.ADRL_OP
   * @generated
   */
  EClass getADRL_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.ADRL_OP#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.aRM.ADRL_OP#getExpression()
   * @see #getADRL_OP()
   * @generated
   */
  EReference getADRL_OP_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MUL_OP <em>MUL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MUL OP</em>'.
   * @see org.xtext.aRM.MUL_OP
   * @generated
   */
  EClass getMUL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MLS_OP <em>MLS OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MLS OP</em>'.
   * @see org.xtext.aRM.MLS_OP
   * @generated
   */
  EClass getMLS_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MLA_OP <em>MLA OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MLA OP</em>'.
   * @see org.xtext.aRM.MLA_OP
   * @generated
   */
  EClass getMLA_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.UMULL_OP <em>UMULL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UMULL OP</em>'.
   * @see org.xtext.aRM.UMULL_OP
   * @generated
   */
  EClass getUMULL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.UMLAL_OP <em>UMLAL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UMLAL OP</em>'.
   * @see org.xtext.aRM.UMLAL_OP
   * @generated
   */
  EClass getUMLAL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMULL_OP <em>SMULL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMULL OP</em>'.
   * @see org.xtext.aRM.SMULL_OP
   * @generated
   */
  EClass getSMULL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMLAL_OP <em>SMLAL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMLAL OP</em>'.
   * @see org.xtext.aRM.SMLAL_OP
   * @generated
   */
  EClass getSMLAL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMUL_OP <em>SMUL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMUL OP</em>'.
   * @see org.xtext.aRM.SMUL_OP
   * @generated
   */
  EClass getSMUL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMULW_OP <em>SMULW OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMULW OP</em>'.
   * @see org.xtext.aRM.SMULW_OP
   * @generated
   */
  EClass getSMULW_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMLA_OP <em>SMLA OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMLA OP</em>'.
   * @see org.xtext.aRM.SMLA_OP
   * @generated
   */
  EClass getSMLA_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SMLAW_OP <em>SMLAW OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMLAW OP</em>'.
   * @see org.xtext.aRM.SMLAW_OP
   * @generated
   */
  EClass getSMLAW_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MOV_OP <em>MOV OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOV OP</em>'.
   * @see org.xtext.aRM.MOV_OP
   * @generated
   */
  EClass getMOV_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MVN_OP <em>MVN OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MVN OP</em>'.
   * @see org.xtext.aRM.MVN_OP
   * @generated
   */
  EClass getMVN_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ASR_OP <em>ASR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ASR OP</em>'.
   * @see org.xtext.aRM.ASR_OP
   * @generated
   */
  EClass getASR_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.LSL_OP <em>LSL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LSL OP</em>'.
   * @see org.xtext.aRM.LSL_OP
   * @generated
   */
  EClass getLSL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.LSR_OP <em>LSR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LSR OP</em>'.
   * @see org.xtext.aRM.LSR_OP
   * @generated
   */
  EClass getLSR_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ROR_OP <em>ROR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ROR OP</em>'.
   * @see org.xtext.aRM.ROR_OP
   * @generated
   */
  EClass getROR_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.RRX_OP <em>RRX OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RRX OP</em>'.
   * @see org.xtext.aRM.RRX_OP
   * @generated
   */
  EClass getRRX_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CLZ_OP <em>CLZ OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLZ OP</em>'.
   * @see org.xtext.aRM.CLZ_OP
   * @generated
   */
  EClass getCLZ_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.CLZ_OP#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.CLZ_OP#getRegister()
   * @see #getCLZ_OP()
   * @generated
   */
  EReference getCLZ_OP_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CLZ_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.CLZ_OP#isOp()
   * @see #getCLZ_OP()
   * @generated
   */
  EAttribute getCLZ_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CMP_OP <em>CMP OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CMP OP</em>'.
   * @see org.xtext.aRM.CMP_OP
   * @generated
   */
  EClass getCMP_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CMN_OP <em>CMN OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CMN OP</em>'.
   * @see org.xtext.aRM.CMN_OP
   * @generated
   */
  EClass getCMN_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.TST_OP <em>TST OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TST OP</em>'.
   * @see org.xtext.aRM.TST_OP
   * @generated
   */
  EClass getTST_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.TEQ_OP <em>TEQ OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TEQ OP</em>'.
   * @see org.xtext.aRM.TEQ_OP
   * @generated
   */
  EClass getTEQ_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.AND_OP <em>AND OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AND OP</em>'.
   * @see org.xtext.aRM.AND_OP
   * @generated
   */
  EClass getAND_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.EOR_OP <em>EOR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EOR OP</em>'.
   * @see org.xtext.aRM.EOR_OP
   * @generated
   */
  EClass getEOR_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ORR_OP <em>ORR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ORR OP</em>'.
   * @see org.xtext.aRM.ORR_OP
   * @generated
   */
  EClass getORR_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ORN_OP <em>ORN OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ORN OP</em>'.
   * @see org.xtext.aRM.ORN_OP
   * @generated
   */
  EClass getORN_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BIC_OP <em>BIC OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BIC OP</em>'.
   * @see org.xtext.aRM.BIC_OP
   * @generated
   */
  EClass getBIC_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.B_OP <em>BOP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOP</em>'.
   * @see org.xtext.aRM.B_OP
   * @generated
   */
  EClass getB_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BL_OP <em>BL OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BL OP</em>'.
   * @see org.xtext.aRM.BL_OP
   * @generated
   */
  EClass getBL_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BX_OP <em>BX OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BX OP</em>'.
   * @see org.xtext.aRM.BX_OP
   * @generated
   */
  EClass getBX_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BLX_OP <em>BLX OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BLX OP</em>'.
   * @see org.xtext.aRM.BLX_OP
   * @generated
   */
  EClass getBLX_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BXJ_OP <em>BXJ OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BXJ OP</em>'.
   * @see org.xtext.aRM.BXJ_OP
   * @generated
   */
  EClass getBXJ_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MRS_OP <em>MRS OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MRS OP</em>'.
   * @see org.xtext.aRM.MRS_OP
   * @generated
   */
  EClass getMRS_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MRS_OP#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.MRS_OP#getRegister()
   * @see #getMRS_OP()
   * @generated
   */
  EReference getMRS_OP_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MRS_OP#getPSR_FIELD <em>PSR FIELD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>PSR FIELD</em>'.
   * @see org.xtext.aRM.MRS_OP#getPSR_FIELD()
   * @see #getMRS_OP()
   * @generated
   */
  EReference getMRS_OP_PSR_FIELD();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.MRS_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.MRS_OP#isOp()
   * @see #getMRS_OP()
   * @generated
   */
  EAttribute getMRS_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.MSR_OP <em>MSR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MSR OP</em>'.
   * @see org.xtext.aRM.MSR_OP
   * @generated
   */
  EClass getMSR_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MSR_OP#getAPSR_FLAG <em>APSR FLAG</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>APSR FLAG</em>'.
   * @see org.xtext.aRM.MSR_OP#getAPSR_FLAG()
   * @see #getMSR_OP()
   * @generated
   */
  EReference getMSR_OP_APSR_FLAG();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MSR_OP#getPSR_FIELD <em>PSR FIELD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>PSR FIELD</em>'.
   * @see org.xtext.aRM.MSR_OP#getPSR_FIELD()
   * @see #getMSR_OP()
   * @generated
   */
  EReference getMSR_OP_PSR_FIELD();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MSR_OP#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.MSR_OP#getRegister()
   * @see #getMSR_OP()
   * @generated
   */
  EReference getMSR_OP_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.MSR_OP#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.MSR_OP#getImmediate_label()
   * @see #getMSR_OP()
   * @generated
   */
  EReference getMSR_OP_Immediate_label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.MSR_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.MSR_OP#isOp()
   * @see #getMSR_OP()
   * @generated
   */
  EAttribute getMSR_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.LDR_OP <em>LDR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LDR OP</em>'.
   * @see org.xtext.aRM.LDR_OP
   * @generated
   */
  EClass getLDR_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.LDR_OP#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.LDR_OP#getRegister()
   * @see #getLDR_OP()
   * @generated
   */
  EReference getLDR_OP_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.LDR_OP#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.LDR_OP#getImmediate_label()
   * @see #getLDR_OP()
   * @generated
   */
  EReference getLDR_OP_Immediate_label();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.LDR_OP#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>BAREL SHIFT REGISTER</em>'.
   * @see org.xtext.aRM.LDR_OP#getBAREL_SHIFT_REGISTER()
   * @see #getLDR_OP()
   * @generated
   */
  EReference getLDR_OP_BAREL_SHIFT_REGISTER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.LDR_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.LDR_OP#isOp()
   * @see #getLDR_OP()
   * @generated
   */
  EAttribute getLDR_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.STR_OP <em>STR OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STR OP</em>'.
   * @see org.xtext.aRM.STR_OP
   * @generated
   */
  EClass getSTR_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.STR_OP#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.STR_OP#getRegister()
   * @see #getSTR_OP()
   * @generated
   */
  EReference getSTR_OP_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.STR_OP#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.STR_OP#getImmediate_label()
   * @see #getSTR_OP()
   * @generated
   */
  EReference getSTR_OP_Immediate_label();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.STR_OP#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>BAREL SHIFT REGISTER</em>'.
   * @see org.xtext.aRM.STR_OP#getBAREL_SHIFT_REGISTER()
   * @see #getSTR_OP()
   * @generated
   */
  EReference getSTR_OP_BAREL_SHIFT_REGISTER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.STR_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.STR_OP#isOp()
   * @see #getSTR_OP()
   * @generated
   */
  EAttribute getSTR_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.LDM_OP <em>LDM OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LDM OP</em>'.
   * @see org.xtext.aRM.LDM_OP
   * @generated
   */
  EClass getLDM_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.STM_OP <em>STM OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STM OP</em>'.
   * @see org.xtext.aRM.STM_OP
   * @generated
   */
  EClass getSTM_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PUSH_OP <em>PUSH OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PUSH OP</em>'.
   * @see org.xtext.aRM.PUSH_OP
   * @generated
   */
  EClass getPUSH_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.POP_OP <em>POP OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>POP OP</em>'.
   * @see org.xtext.aRM.POP_OP
   * @generated
   */
  EClass getPOP_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SWP_OP <em>SWP OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SWP OP</em>'.
   * @see org.xtext.aRM.SWP_OP
   * @generated
   */
  EClass getSWP_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SWPB_OP <em>SWPB OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SWPB OP</em>'.
   * @see org.xtext.aRM.SWPB_OP
   * @generated
   */
  EClass getSWPB_OP();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.SVC_OP <em>SVC OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SVC OP</em>'.
   * @see org.xtext.aRM.SVC_OP
   * @generated
   */
  EClass getSVC_OP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.SVC_OP#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.SVC_OP#getImmediate_label()
   * @see #getSVC_OP()
   * @generated
   */
  EReference getSVC_OP_Immediate_label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.SVC_OP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.SVC_OP#isOp()
   * @see #getSVC_OP()
   * @generated
   */
  EAttribute getSVC_OP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PSR_FIELD_E <em>PSR FIELD E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PSR FIELD E</em>'.
   * @see org.xtext.aRM.PSR_FIELD_E
   * @generated
   */
  EClass getPSR_FIELD_E();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.PSR_FIELD_E#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.xtext.aRM.PSR_FIELD_E#getOp()
   * @see #getPSR_FIELD_E()
   * @generated
   */
  EAttribute getPSR_FIELD_E_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.APSR_FLAG_E <em>APSR FLAG E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>APSR FLAG E</em>'.
   * @see org.xtext.aRM.APSR_FLAG_E
   * @generated
   */
  EClass getAPSR_FLAG_E();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.APSR_FLAG_E#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see org.xtext.aRM.APSR_FLAG_E#getOp()
   * @see #getAPSR_FLAG_E()
   * @generated
   */
  EAttribute getAPSR_FLAG_E_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.NOP <em>NOP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NOP</em>'.
   * @see org.xtext.aRM.NOP
   * @generated
   */
  EClass getNOP();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.NOP#isOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.aRM.NOP#isOp()
   * @see #getNOP()
   * @generated
   */
  EAttribute getNOP_Op();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PREPROCESSOR <em>PREPROCESSOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PREPROCESSOR</em>'.
   * @see org.xtext.aRM.PREPROCESSOR
   * @generated
   */
  EClass getPREPROCESSOR();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.PREPROCESSOR#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.PREPROCESSOR#getExpression()
   * @see #getPREPROCESSOR()
   * @generated
   */
  EReference getPREPROCESSOR_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.PREPROCESSOR#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.aRM.PREPROCESSOR#getExpression2()
   * @see #getPREPROCESSOR()
   * @generated
   */
  EReference getPREPROCESSOR_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR#isHash <em>Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hash</em>'.
   * @see org.xtext.aRM.PREPROCESSOR#isHash()
   * @see #getPREPROCESSOR()
   * @generated
   */
  EAttribute getPREPROCESSOR_Hash();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.PREPROCESSOR#isCode()
   * @see #getPREPROCESSOR()
   * @generated
   */
  EAttribute getPREPROCESSOR_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PREPROCESSOR_DEFINE <em>PREPROCESSOR DEFINE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PREPROCESSOR DEFINE</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE
   * @generated
   */
  EClass getPREPROCESSOR_DEFINE();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression()
   * @see #getPREPROCESSOR_DEFINE()
   * @generated
   */
  EReference getPREPROCESSOR_DEFINE_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression2()
   * @see #getPREPROCESSOR_DEFINE()
   * @generated
   */
  EReference getPREPROCESSOR_DEFINE_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isHash <em>Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hash</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE#isHash()
   * @see #getPREPROCESSOR_DEFINE()
   * @generated
   */
  EAttribute getPREPROCESSOR_DEFINE_Hash();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_DEFINE#isCode()
   * @see #getPREPROCESSOR_DEFINE()
   * @generated
   */
  EAttribute getPREPROCESSOR_DEFINE_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PREPROCESSOR_ENDIF <em>PREPROCESSOR ENDIF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PREPROCESSOR ENDIF</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ENDIF
   * @generated
   */
  EClass getPREPROCESSOR_ENDIF();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_ENDIF#isHash <em>Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hash</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ENDIF#isHash()
   * @see #getPREPROCESSOR_ENDIF()
   * @generated
   */
  EAttribute getPREPROCESSOR_ENDIF_Hash();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_ENDIF#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ENDIF#isCode()
   * @see #getPREPROCESSOR_ENDIF()
   * @generated
   */
  EAttribute getPREPROCESSOR_ENDIF_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.PREPROCESSOR_ELSE <em>PREPROCESSOR ELSE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PREPROCESSOR ELSE</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ELSE
   * @generated
   */
  EClass getPREPROCESSOR_ELSE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_ELSE#isHash <em>Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hash</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ELSE#isHash()
   * @see #getPREPROCESSOR_ELSE()
   * @generated
   */
  EAttribute getPREPROCESSOR_ELSE_Hash();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.PREPROCESSOR_ELSE#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.PREPROCESSOR_ELSE#isCode()
   * @see #getPREPROCESSOR_ELSE()
   * @generated
   */
  EAttribute getPREPROCESSOR_ELSE_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CExtendCode <em>CExtend Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CExtend Code</em>'.
   * @see org.xtext.aRM.CExtendCode
   * @generated
   */
  EClass getCExtendCode();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.CExtendCode#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.aRM.CExtendCode#getExpression()
   * @see #getCExtendCode()
   * @generated
   */
  EReference getCExtendCode_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.CExtendCode#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.aRM.CExtendCode#getExpression2()
   * @see #getCExtendCode()
   * @generated
   */
  EReference getCExtendCode_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CExtendCode#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.CExtendCode#isDot()
   * @see #getCExtendCode()
   * @generated
   */
  EAttribute getCExtendCode_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CExtendCode#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.CExtendCode#isCode()
   * @see #getCExtendCode()
   * @generated
   */
  EAttribute getCExtendCode_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Assembler_Directives_equ <em>Assembler Directives equ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembler Directives equ</em>'.
   * @see org.xtext.aRM.Assembler_Directives_equ
   * @generated
   */
  EClass getAssembler_Directives_equ();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Assembler_Directives_equ#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.aRM.Assembler_Directives_equ#getExpression()
   * @see #getAssembler_Directives_equ()
   * @generated
   */
  EReference getAssembler_Directives_equ_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Assembler_Directives_equ#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.aRM.Assembler_Directives_equ#getExpression2()
   * @see #getAssembler_Directives_equ()
   * @generated
   */
  EReference getAssembler_Directives_equ_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_equ#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.Assembler_Directives_equ#isDot()
   * @see #getAssembler_Directives_equ()
   * @generated
   */
  EAttribute getAssembler_Directives_equ_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_equ#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.Assembler_Directives_equ#isCode()
   * @see #getAssembler_Directives_equ()
   * @generated
   */
  EAttribute getAssembler_Directives_equ_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Assembler_Directives <em>Assembler Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembler Directives</em>'.
   * @see org.xtext.aRM.Assembler_Directives
   * @generated
   */
  EClass getAssembler_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.Assembler_Directives#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.Assembler_Directives#getExpression()
   * @see #getAssembler_Directives()
   * @generated
   */
  EReference getAssembler_Directives_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.Assembler_Directives#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.aRM.Assembler_Directives#getExpression2()
   * @see #getAssembler_Directives()
   * @generated
   */
  EReference getAssembler_Directives_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.Assembler_Directives#isDot()
   * @see #getAssembler_Directives()
   * @generated
   */
  EAttribute getAssembler_Directives_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.Assembler_Directives#isCode()
   * @see #getAssembler_Directives()
   * @generated
   */
  EAttribute getAssembler_Directives_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Assembler_Directives_macro <em>Assembler Directives macro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembler Directives macro</em>'.
   * @see org.xtext.aRM.Assembler_Directives_macro
   * @generated
   */
  EClass getAssembler_Directives_macro();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.Assembler_Directives_macro#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.Assembler_Directives_macro#getExpression()
   * @see #getAssembler_Directives_macro()
   * @generated
   */
  EReference getAssembler_Directives_macro_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.Assembler_Directives_macro#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.xtext.aRM.Assembler_Directives_macro#getDefinition()
   * @see #getAssembler_Directives_macro()
   * @generated
   */
  EReference getAssembler_Directives_macro_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_macro#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.Assembler_Directives_macro#isDot()
   * @see #getAssembler_Directives_macro()
   * @generated
   */
  EAttribute getAssembler_Directives_macro_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_macro#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.Assembler_Directives_macro#isCode()
   * @see #getAssembler_Directives_macro()
   * @generated
   */
  EAttribute getAssembler_Directives_macro_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Assember_Directives_type <em>Assember Directives type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assember Directives type</em>'.
   * @see org.xtext.aRM.Assember_Directives_type
   * @generated
   */
  EClass getAssember_Directives_type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Assember_Directives_type#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.xtext.aRM.Assember_Directives_type#getExpression()
   * @see #getAssember_Directives_type()
   * @generated
   */
  EReference getAssember_Directives_type_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.Assember_Directives_type#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see org.xtext.aRM.Assember_Directives_type#getDescription()
   * @see #getAssember_Directives_type()
   * @generated
   */
  EReference getAssember_Directives_type_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assember_Directives_type#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.Assember_Directives_type#isDot()
   * @see #getAssember_Directives_type()
   * @generated
   */
  EAttribute getAssember_Directives_type_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assember_Directives_type#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.Assember_Directives_type#isCode()
   * @see #getAssember_Directives_type()
   * @generated
   */
  EAttribute getAssember_Directives_type_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Assembler_Directives_endm <em>Assembler Directives endm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assembler Directives endm</em>'.
   * @see org.xtext.aRM.Assembler_Directives_endm
   * @generated
   */
  EClass getAssembler_Directives_endm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_endm#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.Assembler_Directives_endm#isDot()
   * @see #getAssembler_Directives_endm()
   * @generated
   */
  EAttribute getAssembler_Directives_endm_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.Assembler_Directives_endm#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.Assembler_Directives_endm#isCode()
   * @see #getAssembler_Directives_endm()
   * @generated
   */
  EAttribute getAssembler_Directives_endm_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARM_Machine_Directives <em>ARM Machine Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ARM Machine Directives</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives
   * @generated
   */
  EClass getARM_Machine_Directives();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.ARM_Machine_Directives#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives#getExpression()
   * @see #getARM_Machine_Directives()
   * @generated
   */
  EReference getARM_Machine_Directives_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.ARM_Machine_Directives#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives#getExpression2()
   * @see #getARM_Machine_Directives()
   * @generated
   */
  EReference getARM_Machine_Directives_Expression2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives#isDot()
   * @see #getARM_Machine_Directives()
   * @generated
   */
  EAttribute getARM_Machine_Directives_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives#isCode()
   * @see #getARM_Machine_Directives()
   * @generated
   */
  EAttribute getARM_Machine_Directives_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align <em>ARM MACHINE DIRECTIVES align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ARM MACHINE DIRECTIVES align</em>'.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align
   * @generated
   */
  EClass getARM_MACHINE_DIRECTIVES_align();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#getInt()
   * @see #getARM_MACHINE_DIRECTIVES_align()
   * @generated
   */
  EAttribute getARM_MACHINE_DIRECTIVES_align_Int();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#getHex <em>Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex</em>'.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#getHex()
   * @see #getARM_MACHINE_DIRECTIVES_align()
   * @generated
   */
  EAttribute getARM_MACHINE_DIRECTIVES_align_Hex();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#isDot()
   * @see #getARM_MACHINE_DIRECTIVES_align()
   * @generated
   */
  EAttribute getARM_MACHINE_DIRECTIVES_align_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align#isCode()
   * @see #getARM_MACHINE_DIRECTIVES_align()
   * @generated
   */
  EAttribute getARM_MACHINE_DIRECTIVES_align_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARM_Machine_Directives_code <em>ARM Machine Directives code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ARM Machine Directives code</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_code
   * @generated
   */
  EClass getARM_Machine_Directives_code();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_code#isArm <em>Arm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arm</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_code#isArm()
   * @see #getARM_Machine_Directives_code()
   * @generated
   */
  EAttribute getARM_Machine_Directives_code_Arm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_code#isThumb <em>Thumb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thumb</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_code#isThumb()
   * @see #getARM_Machine_Directives_code()
   * @generated
   */
  EAttribute getARM_Machine_Directives_code_Thumb();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_code#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_code#isDot()
   * @see #getARM_Machine_Directives_code()
   * @generated
   */
  EAttribute getARM_Machine_Directives_code_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_code#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_code#isCode()
   * @see #getARM_Machine_Directives_code()
   * @generated
   */
  EAttribute getARM_Machine_Directives_code_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARM_Machine_Directives_syntax <em>ARM Machine Directives syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ARM Machine Directives syntax</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_syntax
   * @generated
   */
  EClass getARM_Machine_Directives_syntax();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_syntax#isDot()
   * @see #getARM_Machine_Directives_syntax()
   * @generated
   */
  EAttribute getARM_Machine_Directives_syntax_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_syntax#isCode()
   * @see #getARM_Machine_Directives_syntax()
   * @generated
   */
  EAttribute getARM_Machine_Directives_syntax_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.ARM_Machine_Directives_save <em>ARM Machine Directives save</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ARM Machine Directives save</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save
   * @generated
   */
  EClass getARM_Machine_Directives_save();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.ARM_Machine_Directives_save#getReglist <em>Reglist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reglist</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save#getReglist()
   * @see #getARM_Machine_Directives_save()
   * @generated
   */
  EAttribute getARM_Machine_Directives_save_Reglist();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.ARM_Machine_Directives_save#getReglistNum <em>Reglist Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Reglist Num</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save#getReglistNum()
   * @see #getARM_Machine_Directives_save()
   * @generated
   */
  EAttribute getARM_Machine_Directives_save_ReglistNum();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.ARM_Machine_Directives_save#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save#getRegister()
   * @see #getARM_Machine_Directives_save()
   * @generated
   */
  EReference getARM_Machine_Directives_save_Register();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_save#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save#isDot()
   * @see #getARM_Machine_Directives_save()
   * @generated
   */
  EAttribute getARM_Machine_Directives_save_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.ARM_Machine_Directives_save#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.ARM_Machine_Directives_save#isCode()
   * @see #getARM_Machine_Directives_save()
   * @generated
   */
  EAttribute getARM_Machine_Directives_save_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CExtendasciz <em>CExtendasciz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CExtendasciz</em>'.
   * @see org.xtext.aRM.CExtendasciz
   * @generated
   */
  EClass getCExtendasciz();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.CExtendasciz#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.CExtendasciz#getExpression()
   * @see #getCExtendasciz()
   * @generated
   */
  EReference getCExtendasciz_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CExtendasciz#isDot <em>Dot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dot</em>'.
   * @see org.xtext.aRM.CExtendasciz#isDot()
   * @see #getCExtendasciz()
   * @generated
   */
  EAttribute getCExtendasciz_Dot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CExtendasciz#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.CExtendasciz#isCode()
   * @see #getCExtendasciz()
   * @generated
   */
  EAttribute getCExtendasciz_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.CLang <em>CLang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLang</em>'.
   * @see org.xtext.aRM.CLang
   * @generated
   */
  EClass getCLang();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.aRM.CLang#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.aRM.CLang#getExpression()
   * @see #getCLang()
   * @generated
   */
  EReference getCLang_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.CLang#isCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.xtext.aRM.CLang#isCode()
   * @see #getCLang()
   * @generated
   */
  EAttribute getCLang_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.REGISTER <em>REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REGISTER</em>'.
   * @see org.xtext.aRM.REGISTER
   * @generated
   */
  EClass getREGISTER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0 <em>R0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0</em>'.
   * @see org.xtext.aRM.REGISTER#isR0()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR1 <em>R1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R1</em>'.
   * @see org.xtext.aRM.REGISTER#isR1()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR2 <em>R2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R2</em>'.
   * @see org.xtext.aRM.REGISTER#isR2()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR3 <em>R3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R3</em>'.
   * @see org.xtext.aRM.REGISTER#isR3()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR4 <em>R4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R4</em>'.
   * @see org.xtext.aRM.REGISTER#isR4()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R4();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR5 <em>R5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R5</em>'.
   * @see org.xtext.aRM.REGISTER#isR5()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R5();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR6 <em>R6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R6</em>'.
   * @see org.xtext.aRM.REGISTER#isR6()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R6();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR7 <em>R7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R7</em>'.
   * @see org.xtext.aRM.REGISTER#isR7()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R7();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR8 <em>R8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R8</em>'.
   * @see org.xtext.aRM.REGISTER#isR8()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R8();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR9 <em>R9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R9</em>'.
   * @see org.xtext.aRM.REGISTER#isR9()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R9();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR10 <em>R10</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R10</em>'.
   * @see org.xtext.aRM.REGISTER#isR10()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R10();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR11 <em>R11</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R11</em>'.
   * @see org.xtext.aRM.REGISTER#isR11()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R11();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR12 <em>R12</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R12</em>'.
   * @see org.xtext.aRM.REGISTER#isR12()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R12();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR13 <em>R13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R13</em>'.
   * @see org.xtext.aRM.REGISTER#isR13()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R13();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR14 <em>R14</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R14</em>'.
   * @see org.xtext.aRM.REGISTER#isR14()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R14();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR15 <em>R15</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R15</em>'.
   * @see org.xtext.aRM.REGISTER#isR15()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R15();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isRfp <em>Rfp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rfp</em>'.
   * @see org.xtext.aRM.REGISTER#isRfp()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_Rfp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isRip <em>Rip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rip</em>'.
   * @see org.xtext.aRM.REGISTER#isRip()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_Rip();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isRsp <em>Rsp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rsp</em>'.
   * @see org.xtext.aRM.REGISTER#isRsp()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_Rsp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isRlr <em>Rlr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rlr</em>'.
   * @see org.xtext.aRM.REGISTER#isRlr()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_Rlr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isRpc <em>Rpc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rpc</em>'.
   * @see org.xtext.aRM.REGISTER#isRpc()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_Rpc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR001 <em>R001</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R001</em>'.
   * @see org.xtext.aRM.REGISTER#isR001()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R001();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR01 <em>R01</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R01</em>'.
   * @see org.xtext.aRM.REGISTER#isR01()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R01();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR02 <em>R02</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R02</em>'.
   * @see org.xtext.aRM.REGISTER#isR02()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R02();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR03 <em>R03</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R03</em>'.
   * @see org.xtext.aRM.REGISTER#isR03()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R03();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR04 <em>R04</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R04</em>'.
   * @see org.xtext.aRM.REGISTER#isR04()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R04();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR05 <em>R05</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R05</em>'.
   * @see org.xtext.aRM.REGISTER#isR05()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R05();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR06 <em>R06</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R06</em>'.
   * @see org.xtext.aRM.REGISTER#isR06()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R06();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR07 <em>R07</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R07</em>'.
   * @see org.xtext.aRM.REGISTER#isR07()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R07();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR08 <em>R08</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R08</em>'.
   * @see org.xtext.aRM.REGISTER#isR08()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R08();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR09 <em>R09</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R09</em>'.
   * @see org.xtext.aRM.REGISTER#isR09()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R09();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR010 <em>R010</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R010</em>'.
   * @see org.xtext.aRM.REGISTER#isR010()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R010();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR011 <em>R011</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R011</em>'.
   * @see org.xtext.aRM.REGISTER#isR011()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R011();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR012 <em>R012</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R012</em>'.
   * @see org.xtext.aRM.REGISTER#isR012()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R012();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR013 <em>R013</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R013</em>'.
   * @see org.xtext.aRM.REGISTER#isR013()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R013();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR014 <em>R014</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R014</em>'.
   * @see org.xtext.aRM.REGISTER#isR014()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R014();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR015 <em>R015</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R015</em>'.
   * @see org.xtext.aRM.REGISTER#isR015()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R015();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0FP <em>R0FP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0FP</em>'.
   * @see org.xtext.aRM.REGISTER#isR0FP()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0FP();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0IP <em>R0IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0IP</em>'.
   * @see org.xtext.aRM.REGISTER#isR0IP()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0IP();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0SP <em>R0SP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0SP</em>'.
   * @see org.xtext.aRM.REGISTER#isR0SP()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0SP();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0LR <em>R0LR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0LR</em>'.
   * @see org.xtext.aRM.REGISTER#isR0LR()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0LR();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.REGISTER#isR0PC <em>R0PC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R0PC</em>'.
   * @see org.xtext.aRM.REGISTER#isR0PC()
   * @see #getREGISTER()
   * @generated
   */
  EAttribute getREGISTER_R0PC();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.REGISTER#getOpsh <em>Opsh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opsh</em>'.
   * @see org.xtext.aRM.REGISTER#getOpsh()
   * @see #getREGISTER()
   * @generated
   */
  EReference getREGISTER_Opsh();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.BAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BAREL SHIFT REGISTER</em>'.
   * @see org.xtext.aRM.BAREL_SHIFT_REGISTER
   * @generated
   */
  EClass getBAREL_SHIFT_REGISTER();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.BAREL_SHIFT_REGISTER#isBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>BAREL SHIFT REGISTER</em>'.
   * @see org.xtext.aRM.BAREL_SHIFT_REGISTER#isBAREL_SHIFT_REGISTER()
   * @see #getBAREL_SHIFT_REGISTER()
   * @generated
   */
  EAttribute getBAREL_SHIFT_REGISTER_BAREL_SHIFT_REGISTER();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.BAREL_SHIFT_REGISTER#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.BAREL_SHIFT_REGISTER#getRegister()
   * @see #getBAREL_SHIFT_REGISTER()
   * @generated
   */
  EReference getBAREL_SHIFT_REGISTER_Register();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.Operand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand2</em>'.
   * @see org.xtext.aRM.Operand2
   * @generated
   */
  EClass getOperand2();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.opsh <em>opsh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>opsh</em>'.
   * @see org.xtext.aRM.opsh
   * @generated
   */
  EClass getopsh();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.immediate_label <em>immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>immediate label</em>'.
   * @see org.xtext.aRM.immediate_label
   * @generated
   */
  EClass getimmediate_label();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.immediate_label#getLiteral_numeric <em>Literal numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal numeric</em>'.
   * @see org.xtext.aRM.immediate_label#getLiteral_numeric()
   * @see #getimmediate_label()
   * @generated
   */
  EReference getimmediate_label_Literal_numeric();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.immediate_label#getNumeric_backward_forward <em>Numeric backward forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Numeric backward forward</em>'.
   * @see org.xtext.aRM.immediate_label#getNumeric_backward_forward()
   * @see #getimmediate_label()
   * @generated
   */
  EReference getimmediate_label_Numeric_backward_forward();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.immediate_label#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.xtext.aRM.immediate_label#getLabel()
   * @see #getimmediate_label()
   * @generated
   */
  EAttribute getimmediate_label_Label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.immediate_label#getNum2 <em>Num2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num2</em>'.
   * @see org.xtext.aRM.immediate_label#getNum2()
   * @see #getimmediate_label()
   * @generated
   */
  EAttribute getimmediate_label_Num2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.immediate_label#getLabel2 <em>Label2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label2</em>'.
   * @see org.xtext.aRM.immediate_label#getLabel2()
   * @see #getimmediate_label()
   * @generated
   */
  EAttribute getimmediate_label_Label2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.immediate_label#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.aRM.immediate_label#getNum()
   * @see #getimmediate_label()
   * @generated
   */
  EAttribute getimmediate_label_Num();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.description <em>description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>description</em>'.
   * @see org.xtext.aRM.description
   * @generated
   */
  EClass getdescription();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.description#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Int</em>'.
   * @see org.xtext.aRM.description#getInt()
   * @see #getdescription()
   * @generated
   */
  EAttribute getdescription_Int();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.description#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>String</em>'.
   * @see org.xtext.aRM.description#getString()
   * @see #getdescription()
   * @generated
   */
  EAttribute getdescription_String();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.aRM.description#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Description</em>'.
   * @see org.xtext.aRM.description#getDescription()
   * @see #getdescription()
   * @generated
   */
  EAttribute getdescription_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>variable</em>'.
   * @see org.xtext.aRM.variable
   * @generated
   */
  EClass getvariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.variable#getVariableInt <em>Variable Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Int</em>'.
   * @see org.xtext.aRM.variable#getVariableInt()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_VariableInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.variable#getVariableABC <em>Variable ABC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable ABC</em>'.
   * @see org.xtext.aRM.variable#getVariableABC()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_VariableABC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.variable#getVariableString <em>Variable String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable String</em>'.
   * @see org.xtext.aRM.variable#getVariableString()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_VariableString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.variable#getVariableHex <em>Variable Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Hex</em>'.
   * @see org.xtext.aRM.variable#getVariableHex()
   * @see #getvariable()
   * @generated
   */
  EAttribute getvariable_VariableHex();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.definition <em>definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>definition</em>'.
   * @see org.xtext.aRM.definition
   * @generated
   */
  EClass getdefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getVariableInt <em>Variable Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Int</em>'.
   * @see org.xtext.aRM.definition#getVariableInt()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_VariableInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getVariableABC <em>Variable ABC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable ABC</em>'.
   * @see org.xtext.aRM.definition#getVariableABC()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_VariableABC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getVariableString <em>Variable String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable String</em>'.
   * @see org.xtext.aRM.definition#getVariableString()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_VariableString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getVariableHex <em>Variable Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Hex</em>'.
   * @see org.xtext.aRM.definition#getVariableHex()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_VariableHex();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getDefInt <em>Def Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def Int</em>'.
   * @see org.xtext.aRM.definition#getDefInt()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_DefInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getDefABC <em>Def ABC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def ABC</em>'.
   * @see org.xtext.aRM.definition#getDefABC()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_DefABC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getDefString <em>Def String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def String</em>'.
   * @see org.xtext.aRM.definition#getDefString()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_DefString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.definition#getDefHex <em>Def Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def Hex</em>'.
   * @see org.xtext.aRM.definition#getDefHex()
   * @see #getdefinition()
   * @generated
   */
  EAttribute getdefinition_DefHex();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.randomEntry <em>random Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>random Entry</em>'.
   * @see org.xtext.aRM.randomEntry
   * @generated
   */
  EClass getrandomEntry();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.randomEntry#getEntryInt <em>Entry Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry Int</em>'.
   * @see org.xtext.aRM.randomEntry#getEntryInt()
   * @see #getrandomEntry()
   * @generated
   */
  EAttribute getrandomEntry_EntryInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.randomEntry#getEntryABC <em>Entry ABC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry ABC</em>'.
   * @see org.xtext.aRM.randomEntry#getEntryABC()
   * @see #getrandomEntry()
   * @generated
   */
  EAttribute getrandomEntry_EntryABC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.randomEntry#getEntryString <em>Entry String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry String</em>'.
   * @see org.xtext.aRM.randomEntry#getEntryString()
   * @see #getrandomEntry()
   * @generated
   */
  EAttribute getrandomEntry_EntryString();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.randomEntry#getEntryHex <em>Entry Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry Hex</em>'.
   * @see org.xtext.aRM.randomEntry#getEntryHex()
   * @see #getrandomEntry()
   * @generated
   */
  EAttribute getrandomEntry_EntryHex();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.rs_sh <em>rs sh</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rs sh</em>'.
   * @see org.xtext.aRM.rs_sh
   * @generated
   */
  EClass getrs_sh();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.rs_sh#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.rs_sh#getImmediate_label()
   * @see #getrs_sh()
   * @generated
   */
  EReference getrs_sh_Immediate_label();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.flexible_offset <em>flexible offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>flexible offset</em>'.
   * @see org.xtext.aRM.flexible_offset
   * @generated
   */
  EClass getflexible_offset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.flexible_offset#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr</em>'.
   * @see org.xtext.aRM.flexible_offset#getExpr()
   * @see #getflexible_offset()
   * @generated
   */
  EAttribute getflexible_offset_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.flexible_offset#getExpr2 <em>Expr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr2</em>'.
   * @see org.xtext.aRM.flexible_offset#getExpr2()
   * @see #getflexible_offset()
   * @generated
   */
  EAttribute getflexible_offset_Expr2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.flexible_offset#getRegister <em>Register</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Register</em>'.
   * @see org.xtext.aRM.flexible_offset#getRegister()
   * @see #getflexible_offset()
   * @generated
   */
  EReference getflexible_offset_Register();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.flexible_offset#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>BAREL SHIFT REGISTER</em>'.
   * @see org.xtext.aRM.flexible_offset#getBAREL_SHIFT_REGISTER()
   * @see #getflexible_offset()
   * @generated
   */
  EReference getflexible_offset_BAREL_SHIFT_REGISTER();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.aRM.flexible_offset#getImmediate_label <em>Immediate label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Immediate label</em>'.
   * @see org.xtext.aRM.flexible_offset#getImmediate_label()
   * @see #getflexible_offset()
   * @generated
   */
  EReference getflexible_offset_Immediate_label();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.flexible_offset#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.aRM.flexible_offset#getNum()
   * @see #getflexible_offset()
   * @generated
   */
  EAttribute getflexible_offset_Num();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.literal_numeric <em>literal numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>literal numeric</em>'.
   * @see org.xtext.aRM.literal_numeric
   * @generated
   */
  EClass getliteral_numeric();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.literal_numeric#getHex <em>Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex</em>'.
   * @see org.xtext.aRM.literal_numeric#getHex()
   * @see #getliteral_numeric()
   * @generated
   */
  EAttribute getliteral_numeric_Hex();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.literal_numeric#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.aRM.literal_numeric#getInt()
   * @see #getliteral_numeric()
   * @generated
   */
  EAttribute getliteral_numeric_Int();

  /**
   * Returns the meta object for class '{@link org.xtext.aRM.numeric_backward_forward <em>numeric backward forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>numeric backward forward</em>'.
   * @see org.xtext.aRM.numeric_backward_forward
   * @generated
   */
  EClass getnumeric_backward_forward();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.numeric_backward_forward#getHex <em>Hex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex</em>'.
   * @see org.xtext.aRM.numeric_backward_forward#getHex()
   * @see #getnumeric_backward_forward()
   * @generated
   */
  EAttribute getnumeric_backward_forward_Hex();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.aRM.numeric_backward_forward#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int</em>'.
   * @see org.xtext.aRM.numeric_backward_forward#getInt()
   * @see #getnumeric_backward_forward()
   * @generated
   */
  EAttribute getnumeric_backward_forward_Int();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ARMFactory getARMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ModelImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARMInstrImpl <em>Instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARMInstrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARMInstr()
     * @generated
     */
    EClass ARM_INSTR = eINSTANCE.getARMInstr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.OperationInstrImpl <em>Operation Instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.OperationInstrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getOperationInstr()
     * @generated
     */
    EClass OPERATION_INSTR = eINSTANCE.getOperationInstr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CcodeImpl <em>Ccode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CcodeImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCcode()
     * @generated
     */
    EClass CCODE = eINSTANCE.getCcode();

    /**
     * The meta object literal for the '<em><b>Label keyword</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CCODE__LABEL_KEYWORD = eINSTANCE.getCcode_Label_keyword();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.variable_variableImpl <em>variable variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.variable_variableImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable_variable()
     * @generated
     */
    EClass VARIABLE_VARIABLE = eINSTANCE.getvariable_variable();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VARIABLE__VARIABLE = eINSTANCE.getvariable_variable_Variable();

    /**
     * The meta object literal for the '<em><b>Variable2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_VARIABLE__VARIABLE2 = eINSTANCE.getvariable_variable_Variable2();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.variable_colonImpl <em>variable colon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.variable_colonImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable_colon()
     * @generated
     */
    EClass VARIABLE_COLON = eINSTANCE.getvariable_colon();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_COLON__VARIABLE = eINSTANCE.getvariable_colon_Variable();

    /**
     * The meta object literal for the '<em><b>Variable INT</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_COLON__VARIABLE_INT = eINSTANCE.getvariable_colon_VariableINT();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.label_keywordImpl <em>label keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.label_keywordImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getlabel_keyword()
     * @generated
     */
    EClass LABEL_KEYWORD = eINSTANCE.getlabel_keyword();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_KEYWORD__LABEL = eINSTANCE.getlabel_keyword_Label();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_KEYWORD__VARIABLE = eINSTANCE.getlabel_keyword_Variable();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_KEYWORD__REGISTER = eINSTANCE.getlabel_keyword_Register();

    /**
     * The meta object literal for the '<em><b>Variable2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL_KEYWORD__VARIABLE2 = eINSTANCE.getlabel_keyword_Variable2();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.add_sub_instrImpl <em>add sub instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.add_sub_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getadd_sub_instr()
     * @generated
     */
    EClass ADD_SUB_INSTR = eINSTANCE.getadd_sub_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_SUB_INSTR__REGISTER = eINSTANCE.getadd_sub_instr_Register();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_SUB_INSTR__OPERAND2 = eINSTANCE.getadd_sub_instr_Operand2();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_SUB_INSTR__OP = eINSTANCE.getadd_sub_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.adrl_adr_instrImpl <em>adrl adr instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.adrl_adr_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getadrl_adr_instr()
     * @generated
     */
    EClass ADRL_ADR_INSTR = eINSTANCE.getadrl_adr_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.mul_3R_instrImpl <em>mul 3R instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.mul_3R_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getmul_3R_instr()
     * @generated
     */
    EClass MUL_3R_INSTR = eINSTANCE.getmul_3R_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_3R_INSTR__REGISTER = eINSTANCE.getmul_3R_instr_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_3R_INSTR__OP = eINSTANCE.getmul_3R_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.mul_4R_instrImpl <em>mul 4R instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.mul_4R_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getmul_4R_instr()
     * @generated
     */
    EClass MUL_4R_INSTR = eINSTANCE.getmul_4R_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_4R_INSTR__REGISTER = eINSTANCE.getmul_4R_instr_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_4R_INSTR__OP = eINSTANCE.getmul_4R_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.mov_instrImpl <em>mov instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.mov_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getmov_instr()
     * @generated
     */
    EClass MOV_INSTR = eINSTANCE.getmov_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOV_INSTR__REGISTER = eINSTANCE.getmov_instr_Register();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOV_INSTR__OPERAND2 = eINSTANCE.getmov_instr_Operand2();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOV_INSTR__OP = eINSTANCE.getmov_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.shift_instrImpl <em>shift instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.shift_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getshift_instr()
     * @generated
     */
    EClass SHIFT_INSTR = eINSTANCE.getshift_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_INSTR__REGISTER = eINSTANCE.getshift_instr_Register();

    /**
     * The meta object literal for the '<em><b>Rs sh</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_INSTR__RS_SH = eINSTANCE.getshift_instr_Rs_sh();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_INSTR__OP = eINSTANCE.getshift_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.clz_instrImpl <em>clz instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.clz_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getclz_instr()
     * @generated
     */
    EClass CLZ_INSTR = eINSTANCE.getclz_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.compare_test_instrImpl <em>compare test instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.compare_test_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getcompare_test_instr()
     * @generated
     */
    EClass COMPARE_TEST_INSTR = eINSTANCE.getcompare_test_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_TEST_INSTR__REGISTER = eINSTANCE.getcompare_test_instr_Register();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_TEST_INSTR__OPERAND2 = eINSTANCE.getcompare_test_instr_Operand2();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_TEST_INSTR__OP = eINSTANCE.getcompare_test_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.logical_instrImpl <em>logical instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.logical_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getlogical_instr()
     * @generated
     */
    EClass LOGICAL_INSTR = eINSTANCE.getlogical_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_INSTR__REGISTER = eINSTANCE.getlogical_instr_Register();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_INSTR__OPERAND2 = eINSTANCE.getlogical_instr_Operand2();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_INSTR__OP = eINSTANCE.getlogical_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.branch_instrImpl <em>branch instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.branch_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getbranch_instr()
     * @generated
     */
    EClass BRANCH_INSTR = eINSTANCE.getbranch_instr();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_INSTR__IMMEDIATE_LABEL = eINSTANCE.getbranch_instr_Immediate_label();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_INSTR__REGISTER = eINSTANCE.getbranch_instr_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH_INSTR__OP = eINSTANCE.getbranch_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.mrs_instrImpl <em>mrs instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.mrs_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getmrs_instr()
     * @generated
     */
    EClass MRS_INSTR = eINSTANCE.getmrs_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.msr_instrImpl <em>msr instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.msr_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getmsr_instr()
     * @generated
     */
    EClass MSR_INSTR = eINSTANCE.getmsr_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ldr_str_irpre_instrImpl <em>ldr str irpre instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ldr_str_irpre_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_irpre_instr()
     * @generated
     */
    EClass LDR_STR_IRPRE_INSTR = eINSTANCE.getldr_str_irpre_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ldr_str_spre_instrImpl <em>ldr str spre instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ldr_str_spre_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_spre_instr()
     * @generated
     */
    EClass LDR_STR_SPRE_INSTR = eINSTANCE.getldr_str_spre_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ldr_str_irpsot_instrImpl <em>ldr str irpsot instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ldr_str_irpsot_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_irpsot_instr()
     * @generated
     */
    EClass LDR_STR_IRPSOT_INSTR = eINSTANCE.getldr_str_irpsot_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ldr_str_rpost_instrImpl <em>ldr str rpost instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ldr_str_rpost_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getldr_str_rpost_instr()
     * @generated
     */
    EClass LDR_STR_RPOST_INSTR = eINSTANCE.getldr_str_rpost_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ldm_instrImpl <em>ldm instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ldm_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getldm_instr()
     * @generated
     */
    EClass LDM_INSTR = eINSTANCE.getldm_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDM_INSTR__REGISTER = eINSTANCE.getldm_instr_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDM_INSTR__OP = eINSTANCE.getldm_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.push_pop_instrImpl <em>push pop instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.push_pop_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getpush_pop_instr()
     * @generated
     */
    EClass PUSH_POP_INSTR = eINSTANCE.getpush_pop_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PUSH_POP_INSTR__REGISTER = eINSTANCE.getpush_pop_instr_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH_POP_INSTR__OP = eINSTANCE.getpush_pop_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.bkpt_instrImpl <em>bkpt instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.bkpt_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getbkpt_instr()
     * @generated
     */
    EClass BKPT_INSTR = eINSTANCE.getbkpt_instr();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BKPT_INSTR__IMMEDIATE_LABEL = eINSTANCE.getbkpt_instr_Immediate_label();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.swp_instrImpl <em>swp instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.swp_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getswp_instr()
     * @generated
     */
    EClass SWP_INSTR = eINSTANCE.getswp_instr();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWP_INSTR__REGISTER = eINSTANCE.getswp_instr_Register();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWP_INSTR__IMMEDIATE_LABEL = eINSTANCE.getswp_instr_Immediate_label();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWP_INSTR__OP = eINSTANCE.getswp_instr_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.svc_instrImpl <em>svc instr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.svc_instrImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getsvc_instr()
     * @generated
     */
    EClass SVC_INSTR = eINSTANCE.getsvc_instr();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ADD_OPImpl <em>ADD OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ADD_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getADD_OP()
     * @generated
     */
    EClass ADD_OP = eINSTANCE.getADD_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ADC_OPImpl <em>ADC OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ADC_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getADC_OP()
     * @generated
     */
    EClass ADC_OP = eINSTANCE.getADC_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ADR_OPImpl <em>ADR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ADR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getADR_OP()
     * @generated
     */
    EClass ADR_OP = eINSTANCE.getADR_OP();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADR_OP__EXPRESSION = eINSTANCE.getADR_OP_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SUB_OPImpl <em>SUB OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SUB_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSUB_OP()
     * @generated
     */
    EClass SUB_OP = eINSTANCE.getSUB_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SBC_OPImpl <em>SBC OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SBC_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSBC_OP()
     * @generated
     */
    EClass SBC_OP = eINSTANCE.getSBC_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.RSB_OPImpl <em>RSB OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.RSB_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getRSB_OP()
     * @generated
     */
    EClass RSB_OP = eINSTANCE.getRSB_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.RSC_OPImpl <em>RSC OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.RSC_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getRSC_OP()
     * @generated
     */
    EClass RSC_OP = eINSTANCE.getRSC_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ADRL_OPImpl <em>ADRL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ADRL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getADRL_OP()
     * @generated
     */
    EClass ADRL_OP = eINSTANCE.getADRL_OP();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADRL_OP__EXPRESSION = eINSTANCE.getADRL_OP_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MUL_OPImpl <em>MUL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MUL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMUL_OP()
     * @generated
     */
    EClass MUL_OP = eINSTANCE.getMUL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MLS_OPImpl <em>MLS OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MLS_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMLS_OP()
     * @generated
     */
    EClass MLS_OP = eINSTANCE.getMLS_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MLA_OPImpl <em>MLA OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MLA_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMLA_OP()
     * @generated
     */
    EClass MLA_OP = eINSTANCE.getMLA_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.UMULL_OPImpl <em>UMULL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.UMULL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getUMULL_OP()
     * @generated
     */
    EClass UMULL_OP = eINSTANCE.getUMULL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.UMLAL_OPImpl <em>UMLAL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.UMLAL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getUMLAL_OP()
     * @generated
     */
    EClass UMLAL_OP = eINSTANCE.getUMLAL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMULL_OPImpl <em>SMULL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMULL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMULL_OP()
     * @generated
     */
    EClass SMULL_OP = eINSTANCE.getSMULL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMLAL_OPImpl <em>SMLAL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMLAL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLAL_OP()
     * @generated
     */
    EClass SMLAL_OP = eINSTANCE.getSMLAL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMUL_OPImpl <em>SMUL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMUL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMUL_OP()
     * @generated
     */
    EClass SMUL_OP = eINSTANCE.getSMUL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMULW_OPImpl <em>SMULW OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMULW_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMULW_OP()
     * @generated
     */
    EClass SMULW_OP = eINSTANCE.getSMULW_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMLA_OPImpl <em>SMLA OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMLA_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLA_OP()
     * @generated
     */
    EClass SMLA_OP = eINSTANCE.getSMLA_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SMLAW_OPImpl <em>SMLAW OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SMLAW_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSMLAW_OP()
     * @generated
     */
    EClass SMLAW_OP = eINSTANCE.getSMLAW_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MOV_OPImpl <em>MOV OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MOV_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMOV_OP()
     * @generated
     */
    EClass MOV_OP = eINSTANCE.getMOV_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MVN_OPImpl <em>MVN OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MVN_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMVN_OP()
     * @generated
     */
    EClass MVN_OP = eINSTANCE.getMVN_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ASR_OPImpl <em>ASR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ASR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getASR_OP()
     * @generated
     */
    EClass ASR_OP = eINSTANCE.getASR_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.LSL_OPImpl <em>LSL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.LSL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getLSL_OP()
     * @generated
     */
    EClass LSL_OP = eINSTANCE.getLSL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.LSR_OPImpl <em>LSR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.LSR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getLSR_OP()
     * @generated
     */
    EClass LSR_OP = eINSTANCE.getLSR_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ROR_OPImpl <em>ROR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ROR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getROR_OP()
     * @generated
     */
    EClass ROR_OP = eINSTANCE.getROR_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.RRX_OPImpl <em>RRX OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.RRX_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getRRX_OP()
     * @generated
     */
    EClass RRX_OP = eINSTANCE.getRRX_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CLZ_OPImpl <em>CLZ OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CLZ_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCLZ_OP()
     * @generated
     */
    EClass CLZ_OP = eINSTANCE.getCLZ_OP();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLZ_OP__REGISTER = eINSTANCE.getCLZ_OP_Register();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLZ_OP__OP = eINSTANCE.getCLZ_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CMP_OPImpl <em>CMP OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CMP_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCMP_OP()
     * @generated
     */
    EClass CMP_OP = eINSTANCE.getCMP_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CMN_OPImpl <em>CMN OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CMN_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCMN_OP()
     * @generated
     */
    EClass CMN_OP = eINSTANCE.getCMN_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.TST_OPImpl <em>TST OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.TST_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getTST_OP()
     * @generated
     */
    EClass TST_OP = eINSTANCE.getTST_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.TEQ_OPImpl <em>TEQ OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.TEQ_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getTEQ_OP()
     * @generated
     */
    EClass TEQ_OP = eINSTANCE.getTEQ_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.AND_OPImpl <em>AND OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.AND_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAND_OP()
     * @generated
     */
    EClass AND_OP = eINSTANCE.getAND_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.EOR_OPImpl <em>EOR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.EOR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getEOR_OP()
     * @generated
     */
    EClass EOR_OP = eINSTANCE.getEOR_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ORR_OPImpl <em>ORR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ORR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getORR_OP()
     * @generated
     */
    EClass ORR_OP = eINSTANCE.getORR_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ORN_OPImpl <em>ORN OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ORN_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getORN_OP()
     * @generated
     */
    EClass ORN_OP = eINSTANCE.getORN_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BIC_OPImpl <em>BIC OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BIC_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBIC_OP()
     * @generated
     */
    EClass BIC_OP = eINSTANCE.getBIC_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.B_OPImpl <em>BOP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.B_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getB_OP()
     * @generated
     */
    EClass BOP = eINSTANCE.getB_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BL_OPImpl <em>BL OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BL_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBL_OP()
     * @generated
     */
    EClass BL_OP = eINSTANCE.getBL_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BX_OPImpl <em>BX OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BX_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBX_OP()
     * @generated
     */
    EClass BX_OP = eINSTANCE.getBX_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BLX_OPImpl <em>BLX OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BLX_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBLX_OP()
     * @generated
     */
    EClass BLX_OP = eINSTANCE.getBLX_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BXJ_OPImpl <em>BXJ OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BXJ_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBXJ_OP()
     * @generated
     */
    EClass BXJ_OP = eINSTANCE.getBXJ_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MRS_OPImpl <em>MRS OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MRS_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMRS_OP()
     * @generated
     */
    EClass MRS_OP = eINSTANCE.getMRS_OP();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MRS_OP__REGISTER = eINSTANCE.getMRS_OP_Register();

    /**
     * The meta object literal for the '<em><b>PSR FIELD</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MRS_OP__PSR_FIELD = eINSTANCE.getMRS_OP_PSR_FIELD();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MRS_OP__OP = eINSTANCE.getMRS_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.MSR_OPImpl <em>MSR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.MSR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getMSR_OP()
     * @generated
     */
    EClass MSR_OP = eINSTANCE.getMSR_OP();

    /**
     * The meta object literal for the '<em><b>APSR FLAG</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSR_OP__APSR_FLAG = eINSTANCE.getMSR_OP_APSR_FLAG();

    /**
     * The meta object literal for the '<em><b>PSR FIELD</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSR_OP__PSR_FIELD = eINSTANCE.getMSR_OP_PSR_FIELD();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSR_OP__REGISTER = eINSTANCE.getMSR_OP_Register();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MSR_OP__IMMEDIATE_LABEL = eINSTANCE.getMSR_OP_Immediate_label();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MSR_OP__OP = eINSTANCE.getMSR_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.LDR_OPImpl <em>LDR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.LDR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getLDR_OP()
     * @generated
     */
    EClass LDR_OP = eINSTANCE.getLDR_OP();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDR_OP__REGISTER = eINSTANCE.getLDR_OP_Register();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDR_OP__IMMEDIATE_LABEL = eINSTANCE.getLDR_OP_Immediate_label();

    /**
     * The meta object literal for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDR_OP__BAREL_SHIFT_REGISTER = eINSTANCE.getLDR_OP_BAREL_SHIFT_REGISTER();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDR_OP__OP = eINSTANCE.getLDR_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.STR_OPImpl <em>STR OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.STR_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSTR_OP()
     * @generated
     */
    EClass STR_OP = eINSTANCE.getSTR_OP();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STR_OP__REGISTER = eINSTANCE.getSTR_OP_Register();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STR_OP__IMMEDIATE_LABEL = eINSTANCE.getSTR_OP_Immediate_label();

    /**
     * The meta object literal for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STR_OP__BAREL_SHIFT_REGISTER = eINSTANCE.getSTR_OP_BAREL_SHIFT_REGISTER();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STR_OP__OP = eINSTANCE.getSTR_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.LDM_OPImpl <em>LDM OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.LDM_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getLDM_OP()
     * @generated
     */
    EClass LDM_OP = eINSTANCE.getLDM_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.STM_OPImpl <em>STM OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.STM_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSTM_OP()
     * @generated
     */
    EClass STM_OP = eINSTANCE.getSTM_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PUSH_OPImpl <em>PUSH OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PUSH_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPUSH_OP()
     * @generated
     */
    EClass PUSH_OP = eINSTANCE.getPUSH_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.POP_OPImpl <em>POP OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.POP_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPOP_OP()
     * @generated
     */
    EClass POP_OP = eINSTANCE.getPOP_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SWP_OPImpl <em>SWP OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SWP_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSWP_OP()
     * @generated
     */
    EClass SWP_OP = eINSTANCE.getSWP_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SWPB_OPImpl <em>SWPB OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SWPB_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSWPB_OP()
     * @generated
     */
    EClass SWPB_OP = eINSTANCE.getSWPB_OP();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.SVC_OPImpl <em>SVC OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.SVC_OPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getSVC_OP()
     * @generated
     */
    EClass SVC_OP = eINSTANCE.getSVC_OP();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SVC_OP__IMMEDIATE_LABEL = eINSTANCE.getSVC_OP_Immediate_label();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SVC_OP__OP = eINSTANCE.getSVC_OP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PSR_FIELD_EImpl <em>PSR FIELD E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PSR_FIELD_EImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPSR_FIELD_E()
     * @generated
     */
    EClass PSR_FIELD_E = eINSTANCE.getPSR_FIELD_E();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSR_FIELD_E__OP = eINSTANCE.getPSR_FIELD_E_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.APSR_FLAG_EImpl <em>APSR FLAG E</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.APSR_FLAG_EImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAPSR_FLAG_E()
     * @generated
     */
    EClass APSR_FLAG_E = eINSTANCE.getAPSR_FLAG_E();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APSR_FLAG_E__OP = eINSTANCE.getAPSR_FLAG_E_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.NOPImpl <em>NOP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.NOPImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getNOP()
     * @generated
     */
    EClass NOP = eINSTANCE.getNOP();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOP__OP = eINSTANCE.getNOP_Op();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PREPROCESSORImpl <em>PREPROCESSOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PREPROCESSORImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR()
     * @generated
     */
    EClass PREPROCESSOR = eINSTANCE.getPREPROCESSOR();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREPROCESSOR__EXPRESSION = eINSTANCE.getPREPROCESSOR_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREPROCESSOR__EXPRESSION2 = eINSTANCE.getPREPROCESSOR_Expression2();

    /**
     * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR__HASH = eINSTANCE.getPREPROCESSOR_Hash();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR__CODE = eINSTANCE.getPREPROCESSOR_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl <em>PREPROCESSOR DEFINE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_DEFINE()
     * @generated
     */
    EClass PREPROCESSOR_DEFINE = eINSTANCE.getPREPROCESSOR_DEFINE();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREPROCESSOR_DEFINE__EXPRESSION = eINSTANCE.getPREPROCESSOR_DEFINE_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREPROCESSOR_DEFINE__EXPRESSION2 = eINSTANCE.getPREPROCESSOR_DEFINE_Expression2();

    /**
     * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_DEFINE__HASH = eINSTANCE.getPREPROCESSOR_DEFINE_Hash();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_DEFINE__CODE = eINSTANCE.getPREPROCESSOR_DEFINE_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PREPROCESSOR_ENDIFImpl <em>PREPROCESSOR ENDIF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PREPROCESSOR_ENDIFImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_ENDIF()
     * @generated
     */
    EClass PREPROCESSOR_ENDIF = eINSTANCE.getPREPROCESSOR_ENDIF();

    /**
     * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_ENDIF__HASH = eINSTANCE.getPREPROCESSOR_ENDIF_Hash();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_ENDIF__CODE = eINSTANCE.getPREPROCESSOR_ENDIF_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl <em>PREPROCESSOR ELSE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getPREPROCESSOR_ELSE()
     * @generated
     */
    EClass PREPROCESSOR_ELSE = eINSTANCE.getPREPROCESSOR_ELSE();

    /**
     * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_ELSE__HASH = eINSTANCE.getPREPROCESSOR_ELSE_Hash();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREPROCESSOR_ELSE__CODE = eINSTANCE.getPREPROCESSOR_ELSE_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CExtendCodeImpl <em>CExtend Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CExtendCodeImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCExtendCode()
     * @generated
     */
    EClass CEXTEND_CODE = eINSTANCE.getCExtendCode();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CEXTEND_CODE__EXPRESSION = eINSTANCE.getCExtendCode_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CEXTEND_CODE__EXPRESSION2 = eINSTANCE.getCExtendCode_Expression2();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CEXTEND_CODE__DOT = eINSTANCE.getCExtendCode_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CEXTEND_CODE__CODE = eINSTANCE.getCExtendCode_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Assembler_Directives_equImpl <em>Assembler Directives equ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Assembler_Directives_equImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_equ()
     * @generated
     */
    EClass ASSEMBLER_DIRECTIVES_EQU = eINSTANCE.getAssembler_Directives_equ();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES_EQU__EXPRESSION = eINSTANCE.getAssembler_Directives_equ_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES_EQU__EXPRESSION2 = eINSTANCE.getAssembler_Directives_equ_Expression2();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_EQU__DOT = eINSTANCE.getAssembler_Directives_equ_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_EQU__CODE = eINSTANCE.getAssembler_Directives_equ_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Assembler_DirectivesImpl <em>Assembler Directives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Assembler_DirectivesImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives()
     * @generated
     */
    EClass ASSEMBLER_DIRECTIVES = eINSTANCE.getAssembler_Directives();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES__EXPRESSION = eINSTANCE.getAssembler_Directives_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES__EXPRESSION2 = eINSTANCE.getAssembler_Directives_Expression2();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES__DOT = eINSTANCE.getAssembler_Directives_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES__CODE = eINSTANCE.getAssembler_Directives_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Assembler_Directives_macroImpl <em>Assembler Directives macro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Assembler_Directives_macroImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_macro()
     * @generated
     */
    EClass ASSEMBLER_DIRECTIVES_MACRO = eINSTANCE.getAssembler_Directives_macro();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES_MACRO__EXPRESSION = eINSTANCE.getAssembler_Directives_macro_Expression();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBLER_DIRECTIVES_MACRO__DEFINITION = eINSTANCE.getAssembler_Directives_macro_Definition();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_MACRO__DOT = eINSTANCE.getAssembler_Directives_macro_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_MACRO__CODE = eINSTANCE.getAssembler_Directives_macro_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Assember_Directives_typeImpl <em>Assember Directives type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Assember_Directives_typeImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAssember_Directives_type()
     * @generated
     */
    EClass ASSEMBER_DIRECTIVES_TYPE = eINSTANCE.getAssember_Directives_type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBER_DIRECTIVES_TYPE__EXPRESSION = eINSTANCE.getAssember_Directives_type_Expression();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION = eINSTANCE.getAssember_Directives_type_Description();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBER_DIRECTIVES_TYPE__DOT = eINSTANCE.getAssember_Directives_type_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBER_DIRECTIVES_TYPE__CODE = eINSTANCE.getAssember_Directives_type_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Assembler_Directives_endmImpl <em>Assembler Directives endm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Assembler_Directives_endmImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getAssembler_Directives_endm()
     * @generated
     */
    EClass ASSEMBLER_DIRECTIVES_ENDM = eINSTANCE.getAssembler_Directives_endm();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_ENDM__DOT = eINSTANCE.getAssembler_Directives_endm_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSEMBLER_DIRECTIVES_ENDM__CODE = eINSTANCE.getAssembler_Directives_endm_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl <em>ARM Machine Directives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARM_Machine_DirectivesImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives()
     * @generated
     */
    EClass ARM_MACHINE_DIRECTIVES = eINSTANCE.getARM_Machine_Directives();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARM_MACHINE_DIRECTIVES__EXPRESSION = eINSTANCE.getARM_Machine_Directives_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARM_MACHINE_DIRECTIVES__EXPRESSION2 = eINSTANCE.getARM_Machine_Directives_Expression2();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES__DOT = eINSTANCE.getARM_Machine_Directives_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES__CODE = eINSTANCE.getARM_Machine_Directives_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl <em>ARM MACHINE DIRECTIVES align</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_MACHINE_DIRECTIVES_align()
     * @generated
     */
    EClass ARM_MACHINE_DIRECTIVES_ALIGN = eINSTANCE.getARM_MACHINE_DIRECTIVES_align();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_ALIGN__INT = eINSTANCE.getARM_MACHINE_DIRECTIVES_align_Int();

    /**
     * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_ALIGN__HEX = eINSTANCE.getARM_MACHINE_DIRECTIVES_align_Hex();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_ALIGN__DOT = eINSTANCE.getARM_MACHINE_DIRECTIVES_align_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_ALIGN__CODE = eINSTANCE.getARM_MACHINE_DIRECTIVES_align_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl <em>ARM Machine Directives code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_code()
     * @generated
     */
    EClass ARM_MACHINE_DIRECTIVES_CODE = eINSTANCE.getARM_Machine_Directives_code();

    /**
     * The meta object literal for the '<em><b>Arm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_CODE__ARM = eINSTANCE.getARM_Machine_Directives_code_Arm();

    /**
     * The meta object literal for the '<em><b>Thumb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_CODE__THUMB = eINSTANCE.getARM_Machine_Directives_code_Thumb();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_CODE__DOT = eINSTANCE.getARM_Machine_Directives_code_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_CODE__CODE = eINSTANCE.getARM_Machine_Directives_code_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_syntaxImpl <em>ARM Machine Directives syntax</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARM_Machine_Directives_syntaxImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_syntax()
     * @generated
     */
    EClass ARM_MACHINE_DIRECTIVES_SYNTAX = eINSTANCE.getARM_Machine_Directives_syntax();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SYNTAX__DOT = eINSTANCE.getARM_Machine_Directives_syntax_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SYNTAX__CODE = eINSTANCE.getARM_Machine_Directives_syntax_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl <em>ARM Machine Directives save</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getARM_Machine_Directives_save()
     * @generated
     */
    EClass ARM_MACHINE_DIRECTIVES_SAVE = eINSTANCE.getARM_Machine_Directives_save();

    /**
     * The meta object literal for the '<em><b>Reglist</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SAVE__REGLIST = eINSTANCE.getARM_Machine_Directives_save_Reglist();

    /**
     * The meta object literal for the '<em><b>Reglist Num</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM = eINSTANCE.getARM_Machine_Directives_save_ReglistNum();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARM_MACHINE_DIRECTIVES_SAVE__REGISTER = eINSTANCE.getARM_Machine_Directives_save_Register();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SAVE__DOT = eINSTANCE.getARM_Machine_Directives_save_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARM_MACHINE_DIRECTIVES_SAVE__CODE = eINSTANCE.getARM_Machine_Directives_save_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CExtendascizImpl <em>CExtendasciz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CExtendascizImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCExtendasciz()
     * @generated
     */
    EClass CEXTENDASCIZ = eINSTANCE.getCExtendasciz();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CEXTENDASCIZ__EXPRESSION = eINSTANCE.getCExtendasciz_Expression();

    /**
     * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CEXTENDASCIZ__DOT = eINSTANCE.getCExtendasciz_Dot();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CEXTENDASCIZ__CODE = eINSTANCE.getCExtendasciz_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.CLangImpl <em>CLang</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.CLangImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getCLang()
     * @generated
     */
    EClass CLANG = eINSTANCE.getCLang();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLANG__EXPRESSION = eINSTANCE.getCLang_Expression();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLANG__CODE = eINSTANCE.getCLang_Code();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.REGISTERImpl <em>REGISTER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.REGISTERImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getREGISTER()
     * @generated
     */
    EClass REGISTER = eINSTANCE.getREGISTER();

    /**
     * The meta object literal for the '<em><b>R0</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0 = eINSTANCE.getREGISTER_R0();

    /**
     * The meta object literal for the '<em><b>R1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R1 = eINSTANCE.getREGISTER_R1();

    /**
     * The meta object literal for the '<em><b>R2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R2 = eINSTANCE.getREGISTER_R2();

    /**
     * The meta object literal for the '<em><b>R3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R3 = eINSTANCE.getREGISTER_R3();

    /**
     * The meta object literal for the '<em><b>R4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R4 = eINSTANCE.getREGISTER_R4();

    /**
     * The meta object literal for the '<em><b>R5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R5 = eINSTANCE.getREGISTER_R5();

    /**
     * The meta object literal for the '<em><b>R6</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R6 = eINSTANCE.getREGISTER_R6();

    /**
     * The meta object literal for the '<em><b>R7</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R7 = eINSTANCE.getREGISTER_R7();

    /**
     * The meta object literal for the '<em><b>R8</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R8 = eINSTANCE.getREGISTER_R8();

    /**
     * The meta object literal for the '<em><b>R9</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R9 = eINSTANCE.getREGISTER_R9();

    /**
     * The meta object literal for the '<em><b>R10</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R10 = eINSTANCE.getREGISTER_R10();

    /**
     * The meta object literal for the '<em><b>R11</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R11 = eINSTANCE.getREGISTER_R11();

    /**
     * The meta object literal for the '<em><b>R12</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R12 = eINSTANCE.getREGISTER_R12();

    /**
     * The meta object literal for the '<em><b>R13</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R13 = eINSTANCE.getREGISTER_R13();

    /**
     * The meta object literal for the '<em><b>R14</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R14 = eINSTANCE.getREGISTER_R14();

    /**
     * The meta object literal for the '<em><b>R15</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R15 = eINSTANCE.getREGISTER_R15();

    /**
     * The meta object literal for the '<em><b>Rfp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__RFP = eINSTANCE.getREGISTER_Rfp();

    /**
     * The meta object literal for the '<em><b>Rip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__RIP = eINSTANCE.getREGISTER_Rip();

    /**
     * The meta object literal for the '<em><b>Rsp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__RSP = eINSTANCE.getREGISTER_Rsp();

    /**
     * The meta object literal for the '<em><b>Rlr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__RLR = eINSTANCE.getREGISTER_Rlr();

    /**
     * The meta object literal for the '<em><b>Rpc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__RPC = eINSTANCE.getREGISTER_Rpc();

    /**
     * The meta object literal for the '<em><b>R001</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R001 = eINSTANCE.getREGISTER_R001();

    /**
     * The meta object literal for the '<em><b>R01</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R01 = eINSTANCE.getREGISTER_R01();

    /**
     * The meta object literal for the '<em><b>R02</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R02 = eINSTANCE.getREGISTER_R02();

    /**
     * The meta object literal for the '<em><b>R03</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R03 = eINSTANCE.getREGISTER_R03();

    /**
     * The meta object literal for the '<em><b>R04</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R04 = eINSTANCE.getREGISTER_R04();

    /**
     * The meta object literal for the '<em><b>R05</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R05 = eINSTANCE.getREGISTER_R05();

    /**
     * The meta object literal for the '<em><b>R06</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R06 = eINSTANCE.getREGISTER_R06();

    /**
     * The meta object literal for the '<em><b>R07</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R07 = eINSTANCE.getREGISTER_R07();

    /**
     * The meta object literal for the '<em><b>R08</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R08 = eINSTANCE.getREGISTER_R08();

    /**
     * The meta object literal for the '<em><b>R09</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R09 = eINSTANCE.getREGISTER_R09();

    /**
     * The meta object literal for the '<em><b>R010</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R010 = eINSTANCE.getREGISTER_R010();

    /**
     * The meta object literal for the '<em><b>R011</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R011 = eINSTANCE.getREGISTER_R011();

    /**
     * The meta object literal for the '<em><b>R012</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R012 = eINSTANCE.getREGISTER_R012();

    /**
     * The meta object literal for the '<em><b>R013</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R013 = eINSTANCE.getREGISTER_R013();

    /**
     * The meta object literal for the '<em><b>R014</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R014 = eINSTANCE.getREGISTER_R014();

    /**
     * The meta object literal for the '<em><b>R015</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R015 = eINSTANCE.getREGISTER_R015();

    /**
     * The meta object literal for the '<em><b>R0FP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0FP = eINSTANCE.getREGISTER_R0FP();

    /**
     * The meta object literal for the '<em><b>R0IP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0IP = eINSTANCE.getREGISTER_R0IP();

    /**
     * The meta object literal for the '<em><b>R0SP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0SP = eINSTANCE.getREGISTER_R0SP();

    /**
     * The meta object literal for the '<em><b>R0LR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0LR = eINSTANCE.getREGISTER_R0LR();

    /**
     * The meta object literal for the '<em><b>R0PC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGISTER__R0PC = eINSTANCE.getREGISTER_R0PC();

    /**
     * The meta object literal for the '<em><b>Opsh</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTER__OPSH = eINSTANCE.getREGISTER_Opsh();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl <em>BAREL SHIFT REGISTER</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getBAREL_SHIFT_REGISTER()
     * @generated
     */
    EClass BAREL_SHIFT_REGISTER = eINSTANCE.getBAREL_SHIFT_REGISTER();

    /**
     * The meta object literal for the '<em><b>BAREL SHIFT REGISTER</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER = eINSTANCE.getBAREL_SHIFT_REGISTER_BAREL_SHIFT_REGISTER();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BAREL_SHIFT_REGISTER__REGISTER = eINSTANCE.getBAREL_SHIFT_REGISTER_Register();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.Operand2Impl <em>Operand2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.Operand2Impl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getOperand2()
     * @generated
     */
    EClass OPERAND2 = eINSTANCE.getOperand2();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.opshImpl <em>opsh</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.opshImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getopsh()
     * @generated
     */
    EClass OPSH = eINSTANCE.getopsh();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.immediate_labelImpl <em>immediate label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.immediate_labelImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getimmediate_label()
     * @generated
     */
    EClass IMMEDIATE_LABEL = eINSTANCE.getimmediate_label();

    /**
     * The meta object literal for the '<em><b>Literal numeric</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMMEDIATE_LABEL__LITERAL_NUMERIC = eINSTANCE.getimmediate_label_Literal_numeric();

    /**
     * The meta object literal for the '<em><b>Numeric backward forward</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD = eINSTANCE.getimmediate_label_Numeric_backward_forward();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMMEDIATE_LABEL__LABEL = eINSTANCE.getimmediate_label_Label();

    /**
     * The meta object literal for the '<em><b>Num2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMMEDIATE_LABEL__NUM2 = eINSTANCE.getimmediate_label_Num2();

    /**
     * The meta object literal for the '<em><b>Label2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMMEDIATE_LABEL__LABEL2 = eINSTANCE.getimmediate_label_Label2();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMMEDIATE_LABEL__NUM = eINSTANCE.getimmediate_label_Num();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.descriptionImpl <em>description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.descriptionImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getdescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getdescription();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__INT = eINSTANCE.getdescription_Int();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__STRING = eINSTANCE.getdescription_String();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__DESCRIPTION = eINSTANCE.getdescription_Description();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.variableImpl <em>variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.variableImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getvariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getvariable();

    /**
     * The meta object literal for the '<em><b>Variable Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VARIABLE_INT = eINSTANCE.getvariable_VariableInt();

    /**
     * The meta object literal for the '<em><b>Variable ABC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VARIABLE_ABC = eINSTANCE.getvariable_VariableABC();

    /**
     * The meta object literal for the '<em><b>Variable String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VARIABLE_STRING = eINSTANCE.getvariable_VariableString();

    /**
     * The meta object literal for the '<em><b>Variable Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VARIABLE_HEX = eINSTANCE.getvariable_VariableHex();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.definitionImpl <em>definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.definitionImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getdefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getdefinition();

    /**
     * The meta object literal for the '<em><b>Variable Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__VARIABLE_INT = eINSTANCE.getdefinition_VariableInt();

    /**
     * The meta object literal for the '<em><b>Variable ABC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__VARIABLE_ABC = eINSTANCE.getdefinition_VariableABC();

    /**
     * The meta object literal for the '<em><b>Variable String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__VARIABLE_STRING = eINSTANCE.getdefinition_VariableString();

    /**
     * The meta object literal for the '<em><b>Variable Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__VARIABLE_HEX = eINSTANCE.getdefinition_VariableHex();

    /**
     * The meta object literal for the '<em><b>Def Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DEF_INT = eINSTANCE.getdefinition_DefInt();

    /**
     * The meta object literal for the '<em><b>Def ABC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DEF_ABC = eINSTANCE.getdefinition_DefABC();

    /**
     * The meta object literal for the '<em><b>Def String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DEF_STRING = eINSTANCE.getdefinition_DefString();

    /**
     * The meta object literal for the '<em><b>Def Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__DEF_HEX = eINSTANCE.getdefinition_DefHex();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.randomEntryImpl <em>random Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.randomEntryImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getrandomEntry()
     * @generated
     */
    EClass RANDOM_ENTRY = eINSTANCE.getrandomEntry();

    /**
     * The meta object literal for the '<em><b>Entry Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_ENTRY__ENTRY_INT = eINSTANCE.getrandomEntry_EntryInt();

    /**
     * The meta object literal for the '<em><b>Entry ABC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_ENTRY__ENTRY_ABC = eINSTANCE.getrandomEntry_EntryABC();

    /**
     * The meta object literal for the '<em><b>Entry String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_ENTRY__ENTRY_STRING = eINSTANCE.getrandomEntry_EntryString();

    /**
     * The meta object literal for the '<em><b>Entry Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_ENTRY__ENTRY_HEX = eINSTANCE.getrandomEntry_EntryHex();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.rs_shImpl <em>rs sh</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.rs_shImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getrs_sh()
     * @generated
     */
    EClass RS_SH = eINSTANCE.getrs_sh();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RS_SH__IMMEDIATE_LABEL = eINSTANCE.getrs_sh_Immediate_label();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.flexible_offsetImpl <em>flexible offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.flexible_offsetImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getflexible_offset()
     * @generated
     */
    EClass FLEXIBLE_OFFSET = eINSTANCE.getflexible_offset();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLEXIBLE_OFFSET__EXPR = eINSTANCE.getflexible_offset_Expr();

    /**
     * The meta object literal for the '<em><b>Expr2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLEXIBLE_OFFSET__EXPR2 = eINSTANCE.getflexible_offset_Expr2();

    /**
     * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLEXIBLE_OFFSET__REGISTER = eINSTANCE.getflexible_offset_Register();

    /**
     * The meta object literal for the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER = eINSTANCE.getflexible_offset_BAREL_SHIFT_REGISTER();

    /**
     * The meta object literal for the '<em><b>Immediate label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLEXIBLE_OFFSET__IMMEDIATE_LABEL = eINSTANCE.getflexible_offset_Immediate_label();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLEXIBLE_OFFSET__NUM = eINSTANCE.getflexible_offset_Num();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.literal_numericImpl <em>literal numeric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.literal_numericImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getliteral_numeric()
     * @generated
     */
    EClass LITERAL_NUMERIC = eINSTANCE.getliteral_numeric();

    /**
     * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_NUMERIC__HEX = eINSTANCE.getliteral_numeric_Hex();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_NUMERIC__INT = eINSTANCE.getliteral_numeric_Int();

    /**
     * The meta object literal for the '{@link org.xtext.aRM.impl.numeric_backward_forwardImpl <em>numeric backward forward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.aRM.impl.numeric_backward_forwardImpl
     * @see org.xtext.aRM.impl.ARMPackageImpl#getnumeric_backward_forward()
     * @generated
     */
    EClass NUMERIC_BACKWARD_FORWARD = eINSTANCE.getnumeric_backward_forward();

    /**
     * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_BACKWARD_FORWARD__HEX = eINSTANCE.getnumeric_backward_forward_Hex();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_BACKWARD_FORWARD__INT = eINSTANCE.getnumeric_backward_forward_Int();

  }

} //ARMPackage
