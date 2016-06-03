/**
 */
package org.xtext.aRM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>literal numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.literal_numeric#getHex <em>Hex</em>}</li>
 *   <li>{@link org.xtext.aRM.literal_numeric#getInt <em>Int</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getliteral_numeric()
 * @model
 * @generated
 */
public interface literal_numeric extends EObject
{
  /**
   * Returns the value of the '<em><b>Hex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hex</em>' attribute.
   * @see #setHex(String)
   * @see org.xtext.aRM.ARMPackage#getliteral_numeric_Hex()
   * @model
   * @generated
   */
  String getHex();

  /**
   * Sets the value of the '{@link org.xtext.aRM.literal_numeric#getHex <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hex</em>' attribute.
   * @see #getHex()
   * @generated
   */
  void setHex(String value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(String)
   * @see org.xtext.aRM.ARMPackage#getliteral_numeric_Int()
   * @model
   * @generated
   */
  String getInt();

  /**
   * Sets the value of the '{@link org.xtext.aRM.literal_numeric#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(String value);

} // literal_numeric
