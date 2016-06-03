/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable colon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.variable_colon#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.variable_colon#getVariableINT <em>Variable INT</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getvariable_colon()
 * @model
 * @generated
 */
public interface variable_colon extends Ccode
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getvariable_colon_Variable()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariable();

  /**
   * Returns the value of the '<em><b>Variable INT</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable INT</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable INT</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getvariable_colon_VariableINT()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariableINT();

} // variable_colon
