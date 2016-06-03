/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVC OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.SVC_OP#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.SVC_OP#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getSVC_OP()
 * @model
 * @generated
 */
public interface SVC_OP extends svc_instr
{
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
   * @see org.xtext.aRM.ARMPackage#getSVC_OP_Immediate_label()
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
   * @see org.xtext.aRM.ARMPackage#getSVC_OP_Op()
   * @model
   * @generated
   */
  boolean isOp();

  /**
   * Sets the value of the '{@link org.xtext.aRM.SVC_OP#isOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #isOp()
   * @generated
   */
  void setOp(boolean value);

} // SVC_OP
