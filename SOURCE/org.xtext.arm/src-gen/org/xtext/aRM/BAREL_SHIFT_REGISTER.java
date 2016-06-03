/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BAREL SHIFT REGISTER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.BAREL_SHIFT_REGISTER#isBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}</li>
 *   <li>{@link org.xtext.aRM.BAREL_SHIFT_REGISTER#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getBAREL_SHIFT_REGISTER()
 * @model
 * @generated
 */
public interface BAREL_SHIFT_REGISTER extends opsh, rs_sh
{
  /**
   * Returns the value of the '<em><b>BAREL SHIFT REGISTER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BAREL SHIFT REGISTER</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BAREL SHIFT REGISTER</em>' attribute.
   * @see #setBAREL_SHIFT_REGISTER(boolean)
   * @see org.xtext.aRM.ARMPackage#getBAREL_SHIFT_REGISTER_BAREL_SHIFT_REGISTER()
   * @model
   * @generated
   */
  boolean isBAREL_SHIFT_REGISTER();

  /**
   * Sets the value of the '{@link org.xtext.aRM.BAREL_SHIFT_REGISTER#isBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BAREL SHIFT REGISTER</em>' attribute.
   * @see #isBAREL_SHIFT_REGISTER()
   * @generated
   */
  void setBAREL_SHIFT_REGISTER(boolean value);

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
   * @see org.xtext.aRM.ARMPackage#getBAREL_SHIFT_REGISTER_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

} // BAREL_SHIFT_REGISTER
