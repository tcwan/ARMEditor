/**
 */
package org.xtext.aRM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARM Machine Directives syntax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_syntax()
 * @model
 * @generated
 */
public interface ARM_Machine_Directives_syntax extends Ccode
{
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
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_syntax_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isDot <em>Dot</em>}' attribute.
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
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_syntax_Code()
   * @model
   * @generated
   */
  boolean isCode();

  /**
   * Sets the value of the '{@link org.xtext.aRM.ARM_Machine_Directives_syntax#isCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #isCode()
   * @generated
   */
  void setCode(boolean value);

} // ARM_Machine_Directives_syntax
