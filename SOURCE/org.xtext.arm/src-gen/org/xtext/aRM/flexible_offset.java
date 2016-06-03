/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>flexible offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.flexible_offset#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.aRM.flexible_offset#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.aRM.flexible_offset#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.flexible_offset#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}</li>
 *   <li>{@link org.xtext.aRM.flexible_offset#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.flexible_offset#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getflexible_offset()
 * @model
 * @generated
 */
public interface flexible_offset extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see #setExpr(String)
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_Expr()
   * @model
   * @generated
   */
  String getExpr();

  /**
   * Sets the value of the '{@link org.xtext.aRM.flexible_offset#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see #getExpr()
   * @generated
   */
  void setExpr(String value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' attribute.
   * @see #setExpr2(String)
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_Expr2()
   * @model
   * @generated
   */
  String getExpr2();

  /**
   * Sets the value of the '{@link org.xtext.aRM.flexible_offset#getExpr2 <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' attribute.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(String value);

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
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_Register()
   * @model containment="true"
   * @generated
   */
  EList<REGISTER> getRegister();

  /**
   * Returns the value of the '<em><b>BAREL SHIFT REGISTER</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.BAREL_SHIFT_REGISTER}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BAREL SHIFT REGISTER</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BAREL SHIFT REGISTER</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_BAREL_SHIFT_REGISTER()
   * @model containment="true"
   * @generated
   */
  EList<BAREL_SHIFT_REGISTER> getBAREL_SHIFT_REGISTER();

  /**
   * Returns the value of the '<em><b>Immediate label</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.immediate_label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Immediate label</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Immediate label</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_Immediate_label()
   * @model containment="true"
   * @generated
   */
  EList<immediate_label> getImmediate_label();

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(String)
   * @see org.xtext.aRM.ARMPackage#getflexible_offset_Num()
   * @model
   * @generated
   */
  String getNum();

  /**
   * Sets the value of the '{@link org.xtext.aRM.flexible_offset#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(String value);

} // flexible_offset
