/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSR OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.MSR_OP#getAPSR_FLAG <em>APSR FLAG</em>}</li>
 *   <li>{@link org.xtext.aRM.MSR_OP#getPSR_FIELD <em>PSR FIELD</em>}</li>
 *   <li>{@link org.xtext.aRM.MSR_OP#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.MSR_OP#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.MSR_OP#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getMSR_OP()
 * @model
 * @generated
 */
public interface MSR_OP extends msr_instr
{
  /**
   * Returns the value of the '<em><b>APSR FLAG</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.APSR_FLAG_E}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>APSR FLAG</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>APSR FLAG</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getMSR_OP_APSR_FLAG()
   * @model containment="true"
   * @generated
   */
  EList<APSR_FLAG_E> getAPSR_FLAG();

  /**
   * Returns the value of the '<em><b>PSR FIELD</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.PSR_FIELD_E}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PSR FIELD</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PSR FIELD</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getMSR_OP_PSR_FIELD()
   * @model containment="true"
   * @generated
   */
  EList<PSR_FIELD_E> getPSR_FIELD();

  /**
   * Returns the value of the '<em><b>Register</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.REGISTER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Register</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Register</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getMSR_OP_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

  /**
   * Returns the value of the '<em><b>Immediate label</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.immediate_label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Immediate label</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Immediate label</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getMSR_OP_Immediate_label()
   * @model containment="true"
   * @generated
   */
  EList<immediate_label> getImmediate_label();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(boolean)
   * @see org.xtext.aRM.ARMPackage#getMSR_OP_Op()
   * @model
   * @generated
   */
  boolean isOp();

  /**
   * Sets the value of the '{@link org.xtext.aRM.MSR_OP#isOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #isOp()
   * @generated
   */
  void setOp(boolean value);

} // MSR_OP
