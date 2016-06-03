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
import org.xtext.aRM.MRS_OP;
import org.xtext.aRM.PSR_FIELD_E;
import org.xtext.aRM.REGISTER;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRS OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.MRS_OPImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MRS_OPImpl#getPSR_FIELD <em>PSR FIELD</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MRS_OPImpl#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRS_OPImpl extends mrs_instrImpl implements MRS_OP
{
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
   * The cached value of the '{@link #getPSR_FIELD() <em>PSR FIELD</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPSR_FIELD()
   * @generated
   * @ordered
   */
  protected EList<PSR_FIELD_E> psR_FIELD;

  /**
   * The default value of the '{@link #isOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOp()
   * @generated
   * @ordered
   */
  protected static final boolean OP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOp()
   * @generated
   * @ordered
   */
  protected boolean op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MRS_OPImpl()
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
    return ARMPackage.Literals.MRS_OP;
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.MRS_OP__REGISTER);
    }
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PSR_FIELD_E> getPSR_FIELD()
  {
    if (psR_FIELD == null)
    {
      psR_FIELD = new EObjectContainmentEList<PSR_FIELD_E>(PSR_FIELD_E.class, this, ARMPackage.MRS_OP__PSR_FIELD);
    }
    return psR_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(boolean newOp)
  {
    boolean oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.MRS_OP__OP, oldOp, op));
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
      case ARMPackage.MRS_OP__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.MRS_OP__PSR_FIELD:
        return ((InternalEList<?>)getPSR_FIELD()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.MRS_OP__REGISTER:
        return getRegister();
      case ARMPackage.MRS_OP__PSR_FIELD:
        return getPSR_FIELD();
      case ARMPackage.MRS_OP__OP:
        return isOp();
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
      case ARMPackage.MRS_OP__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.MRS_OP__PSR_FIELD:
        getPSR_FIELD().clear();
        getPSR_FIELD().addAll((Collection<? extends PSR_FIELD_E>)newValue);
        return;
      case ARMPackage.MRS_OP__OP:
        setOp((Boolean)newValue);
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
      case ARMPackage.MRS_OP__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.MRS_OP__PSR_FIELD:
        getPSR_FIELD().clear();
        return;
      case ARMPackage.MRS_OP__OP:
        setOp(OP_EDEFAULT);
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
      case ARMPackage.MRS_OP__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.MRS_OP__PSR_FIELD:
        return psR_FIELD != null && !psR_FIELD.isEmpty();
      case ARMPackage.MRS_OP__OP:
        return op != OP_EDEFAULT;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //MRS_OPImpl
