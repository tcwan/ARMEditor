/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.label_keyword;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>label keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.label_keywordImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.label_keywordImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.label_keywordImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.label_keywordImpl#getVariable2 <em>Variable2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class label_keywordImpl extends MinimalEObjectImpl.Container implements label_keyword
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EList<String> label;

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
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected EList<REGISTER> register;

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
  protected label_keywordImpl()
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
    return ARMPackage.Literals.LABEL_KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLabel()
  {
    if (label == null)
    {
      label = new EDataTypeEList<String>(String.class, this, ARMPackage.LABEL_KEYWORD__LABEL);
    }
    return label;
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
      variable = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.LABEL_KEYWORD__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<REGISTER> getRegister()
  {
    if (register == null)
    {
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.LABEL_KEYWORD__REGISTER);
    }
    return register;
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
      variable2 = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.LABEL_KEYWORD__VARIABLE2);
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
      case ARMPackage.LABEL_KEYWORD__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case ARMPackage.LABEL_KEYWORD__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.LABEL_KEYWORD__VARIABLE2:
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
      case ARMPackage.LABEL_KEYWORD__LABEL:
        return getLabel();
      case ARMPackage.LABEL_KEYWORD__VARIABLE:
        return getVariable();
      case ARMPackage.LABEL_KEYWORD__REGISTER:
        return getRegister();
      case ARMPackage.LABEL_KEYWORD__VARIABLE2:
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
      case ARMPackage.LABEL_KEYWORD__LABEL:
        getLabel().clear();
        getLabel().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.LABEL_KEYWORD__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends variable>)newValue);
        return;
      case ARMPackage.LABEL_KEYWORD__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.LABEL_KEYWORD__VARIABLE2:
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
      case ARMPackage.LABEL_KEYWORD__LABEL:
        getLabel().clear();
        return;
      case ARMPackage.LABEL_KEYWORD__VARIABLE:
        getVariable().clear();
        return;
      case ARMPackage.LABEL_KEYWORD__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.LABEL_KEYWORD__VARIABLE2:
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
      case ARMPackage.LABEL_KEYWORD__LABEL:
        return label != null && !label.isEmpty();
      case ARMPackage.LABEL_KEYWORD__VARIABLE:
        return variable != null && !variable.isEmpty();
      case ARMPackage.LABEL_KEYWORD__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.LABEL_KEYWORD__VARIABLE2:
        return variable2 != null && !variable2.isEmpty();
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
    result.append(" (label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //label_keywordImpl
