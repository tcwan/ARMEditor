/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>immediate label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.immediate_label#getLiteral_numeric <em>Literal numeric</em>}</li>
 *   <li>{@link org.xtext.aRM.immediate_label#getNumeric_backward_forward <em>Numeric backward forward</em>}</li>
 *   <li>{@link org.xtext.aRM.immediate_label#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.aRM.immediate_label#getNum2 <em>Num2</em>}</li>
 *   <li>{@link org.xtext.aRM.immediate_label#getLabel2 <em>Label2</em>}</li>
 *   <li>{@link org.xtext.aRM.immediate_label#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getimmediate_label()
 * @model
 * @generated
 */
public interface immediate_label extends Operand2
{
  /**
   * Returns the value of the '<em><b>Literal numeric</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.literal_numeric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal numeric</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal numeric</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Literal_numeric()
   * @model containment="true"
   * @generated
   */
  EList<literal_numeric> getLiteral_numeric();

  /**
   * Returns the value of the '<em><b>Numeric backward forward</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.numeric_backward_forward}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric backward forward</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric backward forward</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Numeric_backward_forward()
   * @model containment="true"
   * @generated
   */
  EList<numeric_backward_forward> getNumeric_backward_forward();

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.xtext.aRM.immediate_label#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Num2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num2</em>' attribute.
   * @see #setNum2(String)
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Num2()
   * @model
   * @generated
   */
  String getNum2();

  /**
   * Sets the value of the '{@link org.xtext.aRM.immediate_label#getNum2 <em>Num2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num2</em>' attribute.
   * @see #getNum2()
   * @generated
   */
  void setNum2(String value);

  /**
   * Returns the value of the '<em><b>Label2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label2</em>' attribute.
   * @see #setLabel2(String)
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Label2()
   * @model
   * @generated
   */
  String getLabel2();

  /**
   * Sets the value of the '{@link org.xtext.aRM.immediate_label#getLabel2 <em>Label2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label2</em>' attribute.
   * @see #getLabel2()
   * @generated
   */
  void setLabel2(String value);

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
   * @see org.xtext.aRM.ARMPackage#getimmediate_label_Num()
   * @model
   * @generated
   */
  String getNum();

  /**
   * Sets the value of the '{@link org.xtext.aRM.immediate_label#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(String value);

} // immediate_label
