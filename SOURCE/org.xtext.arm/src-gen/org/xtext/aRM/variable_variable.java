/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.variable_variable#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.variable_variable#getVariable2 <em>Variable2</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getvariable_variable()
 * @model
 * @generated
 */
public interface variable_variable extends Ccode
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getvariable_variable_Variable()
   * @model containment="true"
   * @generated
   */
  EList<variable> getVariable();

  /**
   * Returns the value of the '<em><b>Variable2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable2</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getvariable_variable_Variable2()
   * @model containment="true"
   * @generated
   */
  EList<variable> getVariable2();

} // variable_variable
