/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.description#getInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.aRM.description#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.aRM.description#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getdescription()
 * @model
 * @generated
 */
public interface description extends EObject
{
  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getdescription_Int()
   * @model unique="false"
   * @generated
   */
  EList<String> getInt();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getdescription_String()
   * @model unique="false"
   * @generated
   */
  EList<String> getString();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getdescription_Description()
   * @model unique="false"
   * @generated
   */
  EList<String> getDescription();

} // description
