/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSR FIELD E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.PSR_FIELD_E#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getPSR_FIELD_E()
 * @model
 * @generated
 */
public interface PSR_FIELD_E extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getPSR_FIELD_E_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

} // PSR_FIELD_E
