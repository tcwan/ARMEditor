/**
 */
package org.xtext.aRM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PREPROCESSOR DEFINE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isHash <em>Hash</em>}</li>
 *   <li>{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getPREPROCESSOR_DEFINE()
 * @model
 * @generated
 */
public interface PREPROCESSOR_DEFINE extends Ccode
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(variable)
   * @see org.xtext.aRM.ARMPackage#getPREPROCESSOR_DEFINE_Expression()
   * @model containment="true"
   * @generated
   */
  variable getExpression();

  /**
   * Sets the value of the '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(variable value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference.
   * @see #setExpression2(variable)
   * @see org.xtext.aRM.ARMPackage#getPREPROCESSOR_DEFINE_Expression2()
   * @model containment="true"
   * @generated
   */
  variable getExpression2();

  /**
   * Sets the value of the '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#getExpression2 <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression2</em>' containment reference.
   * @see #getExpression2()
   * @generated
   */
  void setExpression2(variable value);

  /**
   * Returns the value of the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hash</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hash</em>' attribute.
   * @see #setHash(boolean)
   * @see org.xtext.aRM.ARMPackage#getPREPROCESSOR_DEFINE_Hash()
   * @model
   * @generated
   */
  boolean isHash();

  /**
   * Sets the value of the '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isHash <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash</em>' attribute.
   * @see #isHash()
   * @generated
   */
  void setHash(boolean value);

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
   * @see org.xtext.aRM.ARMPackage#getPREPROCESSOR_DEFINE_Code()
   * @model
   * @generated
   */
  boolean isCode();

  /**
   * Sets the value of the '{@link org.xtext.aRM.PREPROCESSOR_DEFINE#isCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #isCode()
   * @generated
   */
  void setCode(boolean value);

} // PREPROCESSOR_DEFINE
