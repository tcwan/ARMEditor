/**
 */
package org.xtext.aRM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.NOP#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getNOP()
 * @model
 * @generated
 */
public interface NOP extends OperationInstr
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(boolean)
   * @see org.xtext.aRM.ARMPackage#getNOP_Op()
   * @model
   * @generated
   */
  boolean isOp();

  /**
   * Sets the value of the '{@link org.xtext.aRM.NOP#isOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #isOp()
   * @generated
   */
  void setOp(boolean value);

} // NOP
