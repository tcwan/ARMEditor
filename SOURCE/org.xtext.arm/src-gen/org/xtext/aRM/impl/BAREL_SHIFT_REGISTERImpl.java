/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.BAREL_SHIFT_REGISTER;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.immediate_label;
import org.xtext.aRM.rs_sh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BAREL SHIFT REGISTER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl#isBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.BAREL_SHIFT_REGISTERImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BAREL_SHIFT_REGISTERImpl extends opshImpl implements BAREL_SHIFT_REGISTER
{
  /**
   * The cached value of the '{@link #getImmediate_label() <em>Immediate label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImmediate_label()
   * @generated
   * @ordered
   */
  protected EList<immediate_label> immediate_label;

  /**
   * The default value of the '{@link #isBAREL_SHIFT_REGISTER() <em>BAREL SHIFT REGISTER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBAREL_SHIFT_REGISTER()
   * @generated
   * @ordered
   */
  protected static final boolean BAREL_SHIFT_REGISTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBAREL_SHIFT_REGISTER() <em>BAREL SHIFT REGISTER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBAREL_SHIFT_REGISTER()
   * @generated
   * @ordered
   */
  protected boolean bareL_SHIFT_REGISTER = BAREL_SHIFT_REGISTER_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BAREL_SHIFT_REGISTERImpl()
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
    return ARMPackage.Literals.BAREL_SHIFT_REGISTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<immediate_label> getImmediate_label()
  {
    if (immediate_label == null)
    {
      immediate_label = new EObjectContainmentEList<immediate_label>(immediate_label.class, this, ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL);
    }
    return immediate_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBAREL_SHIFT_REGISTER()
  {
    return bareL_SHIFT_REGISTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBAREL_SHIFT_REGISTER(boolean newBAREL_SHIFT_REGISTER)
  {
    boolean oldBAREL_SHIFT_REGISTER = bareL_SHIFT_REGISTER;
    bareL_SHIFT_REGISTER = newBAREL_SHIFT_REGISTER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER, oldBAREL_SHIFT_REGISTER, bareL_SHIFT_REGISTER));
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.BAREL_SHIFT_REGISTER__REGISTER);
    }
    return register;
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
      case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL:
        return ((InternalEList<?>)getImmediate_label()).basicRemove(otherEnd, msgs);
      case ARMPackage.BAREL_SHIFT_REGISTER__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL:
        return getImmediate_label();
      case ARMPackage.BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER:
        return isBAREL_SHIFT_REGISTER();
      case ARMPackage.BAREL_SHIFT_REGISTER__REGISTER:
        return getRegister();
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
      case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        getImmediate_label().addAll((Collection<? extends immediate_label>)newValue);
        return;
      case ARMPackage.BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER:
        setBAREL_SHIFT_REGISTER((Boolean)newValue);
        return;
      case ARMPackage.BAREL_SHIFT_REGISTER__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
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
      case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        return;
      case ARMPackage.BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER:
        setBAREL_SHIFT_REGISTER(BAREL_SHIFT_REGISTER_EDEFAULT);
        return;
      case ARMPackage.BAREL_SHIFT_REGISTER__REGISTER:
        getRegister().clear();
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
      case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL:
        return immediate_label != null && !immediate_label.isEmpty();
      case ARMPackage.BAREL_SHIFT_REGISTER__BAREL_SHIFT_REGISTER:
        return bareL_SHIFT_REGISTER != BAREL_SHIFT_REGISTER_EDEFAULT;
      case ARMPackage.BAREL_SHIFT_REGISTER__REGISTER:
        return register != null && !register.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == rs_sh.class)
    {
      switch (derivedFeatureID)
      {
        case ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL: return ARMPackage.RS_SH__IMMEDIATE_LABEL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == rs_sh.class)
    {
      switch (baseFeatureID)
      {
        case ARMPackage.RS_SH__IMMEDIATE_LABEL: return ARMPackage.BAREL_SHIFT_REGISTER__IMMEDIATE_LABEL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (BAREL_SHIFT_REGISTER: ");
    result.append(bareL_SHIFT_REGISTER);
    result.append(')');
    return result.toString();
  }

} //BAREL_SHIFT_REGISTERImpl
