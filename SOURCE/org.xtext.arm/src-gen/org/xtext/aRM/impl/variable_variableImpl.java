/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.variable;
import org.xtext.aRM.variable_variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.variable_variableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.variable_variableImpl#getVariable2 <em>Variable2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variable_variableImpl extends CcodeImpl implements variable_variable
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<variable> variable;

  /**
   * The cached value of the '{@link #getVariable2() <em>Variable2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable2()
   * @generated
   * @ordered
   */
  protected EList<variable> variable2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_variableImpl()
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
    return ARMPackage.Literals.VARIABLE_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.VARIABLE_VARIABLE__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable> getVariable2()
  {
    if (variable2 == null)
    {
      variable2 = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.VARIABLE_VARIABLE__VARIABLE2);
    }
    return variable2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE2:
        return ((InternalEList<?>)getVariable2()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE:
        return getVariable();
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE2:
        return getVariable2();
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
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends variable>)newValue);
        return;
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE2:
        getVariable2().clear();
        getVariable2().addAll((Collection<? extends variable>)newValue);
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
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE:
        getVariable().clear();
        return;
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE2:
        getVariable2().clear();
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
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE:
        return variable != null && !variable.isEmpty();
      case ARMPackage.VARIABLE_VARIABLE__VARIABLE2:
        return variable2 != null && !variable2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //variable_variableImpl
