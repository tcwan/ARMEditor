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

import org.xtext.aRM.APSR_FLAG_E;
import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.MSR_OP;
import org.xtext.aRM.PSR_FIELD_E;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.immediate_label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSR OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.MSR_OPImpl#getAPSR_FLAG <em>APSR FLAG</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MSR_OPImpl#getPSR_FIELD <em>PSR FIELD</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MSR_OPImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MSR_OPImpl#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.MSR_OPImpl#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSR_OPImpl extends msr_instrImpl implements MSR_OP
{
  /**
   * The cached value of the '{@link #getAPSR_FLAG() <em>APSR FLAG</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAPSR_FLAG()
   * @generated
   * @ordered
   */
  protected EList<APSR_FLAG_E> apsR_FLAG;

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
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected EList<REGISTER> register;

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
  protected MSR_OPImpl()
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
    return ARMPackage.Literals.MSR_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<APSR_FLAG_E> getAPSR_FLAG()
  {
    if (apsR_FLAG == null)
    {
      apsR_FLAG = new EObjectContainmentEList<APSR_FLAG_E>(APSR_FLAG_E.class, this, ARMPackage.MSR_OP__APSR_FLAG);
    }
    return apsR_FLAG;
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
      psR_FIELD = new EObjectContainmentEList<PSR_FIELD_E>(PSR_FIELD_E.class, this, ARMPackage.MSR_OP__PSR_FIELD);
    }
    return psR_FIELD;
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.MSR_OP__REGISTER);
    }
    return register;
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
      immediate_label = new EObjectContainmentEList<immediate_label>(immediate_label.class, this, ARMPackage.MSR_OP__IMMEDIATE_LABEL);
    }
    return immediate_label;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.MSR_OP__OP, oldOp, op));
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
      case ARMPackage.MSR_OP__APSR_FLAG:
        return ((InternalEList<?>)getAPSR_FLAG()).basicRemove(otherEnd, msgs);
      case ARMPackage.MSR_OP__PSR_FIELD:
        return ((InternalEList<?>)getPSR_FIELD()).basicRemove(otherEnd, msgs);
      case ARMPackage.MSR_OP__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.MSR_OP__IMMEDIATE_LABEL:
        return ((InternalEList<?>)getImmediate_label()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.MSR_OP__APSR_FLAG:
        return getAPSR_FLAG();
      case ARMPackage.MSR_OP__PSR_FIELD:
        return getPSR_FIELD();
      case ARMPackage.MSR_OP__REGISTER:
        return getRegister();
      case ARMPackage.MSR_OP__IMMEDIATE_LABEL:
        return getImmediate_label();
      case ARMPackage.MSR_OP__OP:
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
      case ARMPackage.MSR_OP__APSR_FLAG:
        getAPSR_FLAG().clear();
        getAPSR_FLAG().addAll((Collection<? extends APSR_FLAG_E>)newValue);
        return;
      case ARMPackage.MSR_OP__PSR_FIELD:
        getPSR_FIELD().clear();
        getPSR_FIELD().addAll((Collection<? extends PSR_FIELD_E>)newValue);
        return;
      case ARMPackage.MSR_OP__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.MSR_OP__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        getImmediate_label().addAll((Collection<? extends immediate_label>)newValue);
        return;
      case ARMPackage.MSR_OP__OP:
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
      case ARMPackage.MSR_OP__APSR_FLAG:
        getAPSR_FLAG().clear();
        return;
      case ARMPackage.MSR_OP__PSR_FIELD:
        getPSR_FIELD().clear();
        return;
      case ARMPackage.MSR_OP__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.MSR_OP__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        return;
      case ARMPackage.MSR_OP__OP:
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
      case ARMPackage.MSR_OP__APSR_FLAG:
        return apsR_FLAG != null && !apsR_FLAG.isEmpty();
      case ARMPackage.MSR_OP__PSR_FIELD:
        return psR_FIELD != null && !psR_FIELD.isEmpty();
      case ARMPackage.MSR_OP__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.MSR_OP__IMMEDIATE_LABEL:
        return immediate_label != null && !immediate_label.isEmpty();
      case ARMPackage.MSR_OP__OP:
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

} //MSR_OPImpl
