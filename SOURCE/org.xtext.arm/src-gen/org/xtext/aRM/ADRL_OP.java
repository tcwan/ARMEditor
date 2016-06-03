/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADRL OP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.ADRL_OP#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getADRL_OP()
 * @model
 * @generated
 */
public interface ADRL_OP extends add_sub_instr, adrl_adr_instr
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.randomEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getADRL_OP_Expression()
   * @model containment="true"
   * @generated
   */
  EList<randomEntry> getExpression();

} // ADRL_OP
