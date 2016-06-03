/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bkpt instr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.bkpt_instr#getImmediate_label <em>Immediate label</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getbkpt_instr()
 * @model
 * @generated
 */
public interface bkpt_instr extends OperationInstr
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
   * @see org.xtext.aRM.ARMPackage#getbkpt_instr_Immediate_label()
   * @model containment="true"
   * @generated
   */
  EList<immediate_label> getImmediate_label();

} // bkpt_instr
