/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLZ OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.CLZ_OP#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.CLZ_OP#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getCLZ_OP()
 * @model
 * @generated
 */
public interface CLZ_OP extends clz_instr
{
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
   * @see org.xtext.aRM.ARMPackage#getCLZ_OP_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

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
   * @see org.xtext.aRM.ARMPackage#getCLZ_OP_Op()
   * @model
   * @generated
   */
  boolean isOp();

  /**
   * Sets the value of the '{@link org.xtext.aRM.CLZ_OP#isOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #isOp()
   * @generated
   */
  void setOp(boolean value);

} // CLZ_OP
