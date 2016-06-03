/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>label keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.label_keyword#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.aRM.label_keyword#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.label_keyword#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.label_keyword#getVariable2 <em>Variable2</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getlabel_keyword()
 * @model
 * @generated
 */
public interface label_keyword extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getlabel_keyword_Label()
   * @model unique="false"
   * @generated
   */
  EList<String> getLabel();

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
   * @see org.xtext.aRM.ARMPackage#getlabel_keyword_Variable()
   * @model containment="true"
   * @generated
   */
  EList<variable> getVariable();

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
   * @see org.xtext.aRM.ARMPackage#getlabel_keyword_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

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
   * @see org.xtext.aRM.ARMPackage#getlabel_keyword_Variable2()
   * @model containment="true"
   * @generated
   */
  EList<variable> getVariable2();

} // label_keyword
