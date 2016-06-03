/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assember Directives type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.Assember_Directives_type#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.Assember_Directives_type#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.aRM.Assember_Directives_type#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.Assember_Directives_type#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getAssember_Directives_type()
 * @model
 * @generated
 */
public interface Assember_Directives_type extends Ccode
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getAssember_Directives_type_Expression()
   * @model containment="true"
   * @generated
   */
  EList<variable> getExpression();

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.description}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getAssember_Directives_type_Description()
   * @model containment="true"
   * @generated
   */
  EList<description> getDescription();

  /**
   * Returns the value of the '<em><b>Dot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dot</em>' attribute.
   * @see #setDot(boolean)
   * @see org.xtext.aRM.ARMPackage#getAssember_Directives_type_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link org.xtext.aRM.Assember_Directives_type#isDot <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dot</em>' attribute.
   * @see #isDot()
   * @generated
   */
  void setDot(boolean value);

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(boolean)
   * @see org.xtext.aRM.ARMPackage#getAssember_Directives_type_Code()
   * @model
   * @generated
   */
  boolean isCode();

  /**
   * Sets the value of the '{@link org.xtext.aRM.Assember_Directives_type#isCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #isCode()
   * @generated
   */
  void setCode(boolean value);

} // Assember_Directives_type
