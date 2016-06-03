/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CExtend Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.CExtendCode#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.CExtendCode#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.aRM.CExtendCode#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.CExtendCode#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getCExtendCode()
 * @model
 * @generated
 */
public interface CExtendCode extends Ccode
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
   * @see org.xtext.aRM.ARMPackage#getCExtendCode_Expression()
   * @model containment="true"
   * @generated
   */
  EList<variable> getExpression();

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getCExtendCode_Expression2()
   * @model containment="true"
   * @generated
   */
  EList<variable> getExpression2();

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
   * @see org.xtext.aRM.ARMPackage#getCExtendCode_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link org.xtext.aRM.CExtendCode#isDot <em>Dot</em>}' attribute.
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
   * @see org.xtext.aRM.ARMPackage#getCExtendCode_Code()
   * @model
   * @generated
   */
  boolean isCode();

  /**
   * Sets the value of the '{@link org.xtext.aRM.CExtendCode#isCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #isCode()
   * @generated
   */
  void setCode(boolean value);

} // CExtendCode
