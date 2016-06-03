/**
 */
package org.xtext.aRM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ccode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.Ccode#getLabel_keyword <em>Label keyword</em>}</li>
 * </ul>
 *
 * @see org.xtext.aRM.ARMPackage#getCcode()
 * @model
 * @generated
 */
public interface Ccode extends ARMInstr
{
  /**
   * Returns the value of the '<em><b>Label keyword</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.aRM.label_keyword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label keyword</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label keyword</em>' containment reference list.
   * @see org.xtext.aRM.ARMPackage#getCcode_Label_keyword()
   * @model containment="true"
   * @generated
   */
  EList<label_keyword> getLabel_keyword();

} // Ccode
