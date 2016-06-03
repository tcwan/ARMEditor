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
import org.xtext.aRM.Ccode;
import org.xtext.aRM.label_keyword;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ccode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.CcodeImpl#getLabel_keyword <em>Label keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CcodeImpl extends ARMInstrImpl implements Ccode
{
  /**
   * The cached value of the '{@link #getLabel_keyword() <em>Label keyword</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel_keyword()
   * @generated
   * @ordered
   */
  protected EList<label_keyword> label_keyword;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CcodeImpl()
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
    return ARMPackage.Literals.CCODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<label_keyword> getLabel_keyword()
  {
    if (label_keyword == null)
    {
      label_keyword = new EObjectContainmentEList<label_keyword>(label_keyword.class, this, ARMPackage.CCODE__LABEL_KEYWORD);
    }
    return label_keyword;
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
      case ARMPackage.CCODE__LABEL_KEYWORD:
        return ((InternalEList<?>)getLabel_keyword()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.CCODE__LABEL_KEYWORD:
        return getLabel_keyword();
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
      case ARMPackage.CCODE__LABEL_KEYWORD:
        getLabel_keyword().clear();
        getLabel_keyword().addAll((Collection<? extends label_keyword>)newValue);
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
      case ARMPackage.CCODE__LABEL_KEYWORD:
        getLabel_keyword().clear();
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
      case ARMPackage.CCODE__LABEL_KEYWORD:
        return label_keyword != null && !label_keyword.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CcodeImpl
