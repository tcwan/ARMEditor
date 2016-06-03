/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARM Machine Directives save</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_save#getReglist <em>Reglist</em>}</li>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_save#getReglistNum <em>Reglist Num</em>}</li>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_save#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_save#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.ARM_Machine_Directives_save#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save()
 * @model
 * @generated
 */
public interface ARM_Machine_Directives_save extends Ccode
{
  /**
   * Returns the value of the '<em><b>Reglist</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reglist</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reglist</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save_Reglist()
   * @model unique="false"
   * @generated
   */
  EList<String> getReglist();

  /**
   * Returns the value of the '<em><b>Reglist Num</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reglist Num</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reglist Num</em>' attribute list.
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save_ReglistNum()
   * @model unique="false"
   * @generated
   */
  EList<String> getReglistNum();

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
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

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
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save_Dot()
   * @model
   * @generated
   */
  boolean isDot();

  /**
   * Sets the value of the '{@link org.xtext.aRM.ARM_Machine_Directives_save#isDot <em>Dot</em>}' attribute.
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
   * @see org.xtext.aRM.ARMPackage#getARM_Machine_Directives_save_Code()
   * @model
   * @generated
   */
  boolean isCode();

  /**
   * Sets the value of the '{@link org.xtext.aRM.ARM_Machine_Directives_save#isCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #isCode()
   * @generated
   */
  void setCode(boolean value);

} // ARM_Machine_Directives_save
