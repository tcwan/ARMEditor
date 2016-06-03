/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.variable_colon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable colon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.variable_colonImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.variable_colonImpl#getVariableINT <em>Variable INT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variable_colonImpl extends CcodeImpl implements variable_colon
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<String> variable;

  /**
   * The cached value of the '{@link #getVariableINT() <em>Variable INT</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableINT()
   * @generated
   * @ordered
   */
  protected EList<String> variableINT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_colonImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ARMPackage.Literals.VARIABLE_COLON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVariable()
  {
    if (variable == null)
    {
      variable = new EDataTypeEList<String>(String.class, this, ARMPackage.VARIABLE_COLON__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVariableINT()
  {
    if (variableINT == null)
    {
      variableINT = new EDataTypeEList<String>(String.class, this, ARMPackage.VARIABLE_COLON__VARIABLE_INT);
    }
    return variableINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ARMPackage.VARIABLE_COLON__VARIABLE:
        return getVariable();
      case ARMPackage.VARIABLE_COLON__VARIABLE_INT:
        return getVariableINT();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ARMPackage.VARIABLE_COLON__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.VARIABLE_COLON__VARIABLE_INT:
        getVariableINT().clear();
        getVariableINT().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ARMPackage.VARIABLE_COLON__VARIABLE:
        getVariable().clear();
        return;
      case ARMPackage.VARIABLE_COLON__VARIABLE_INT:
        getVariableINT().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ARMPackage.VARIABLE_COLON__VARIABLE:
        return variable != null && !variable.isEmpty();
      case ARMPackage.VARIABLE_COLON__VARIABLE_INT:
        return variableINT != null && !variableINT.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (variable: ");
    result.append(variable);
    result.append(", variableINT: ");
    result.append(variableINT);
    result.append(')');
    return result.toString();
  }

} //variable_colonImpl
