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
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.rs_sh;
import org.xtext.aRM.shift_instr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>shift instr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.shift_instrImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.shift_instrImpl#getRs_sh <em>Rs sh</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.shift_instrImpl#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class shift_instrImpl extends OperationInstrImpl implements shift_instr
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
   * The cached value of the '{@link #getRs_sh() <em>Rs sh</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRs_sh()
   * @generated
   * @ordered
   */
  protected EList<rs_sh> rs_sh;

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
  protected shift_instrImpl()
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
    return ARMPackage.Literals.SHIFT_INSTR;
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.SHIFT_INSTR__REGISTER);
    }
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rs_sh> getRs_sh()
  {
    if (rs_sh == null)
    {
      rs_sh = new EObjectContainmentEList<rs_sh>(rs_sh.class, this, ARMPackage.SHIFT_INSTR__RS_SH);
    }
    return rs_sh;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.SHIFT_INSTR__OP, oldOp, op));
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
      case ARMPackage.SHIFT_INSTR__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.SHIFT_INSTR__RS_SH:
        return ((InternalEList<?>)getRs_sh()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.SHIFT_INSTR__REGISTER:
        return getRegister();
      case ARMPackage.SHIFT_INSTR__RS_SH:
        return getRs_sh();
      case ARMPackage.SHIFT_INSTR__OP:
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
      case ARMPackage.SHIFT_INSTR__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.SHIFT_INSTR__RS_SH:
        getRs_sh().clear();
        getRs_sh().addAll((Collection<? extends rs_sh>)newValue);
        return;
      case ARMPackage.SHIFT_INSTR__OP:
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
      case ARMPackage.SHIFT_INSTR__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.SHIFT_INSTR__RS_SH:
        getRs_sh().clear();
        return;
      case ARMPackage.SHIFT_INSTR__OP:
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
      case ARMPackage.SHIFT_INSTR__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.SHIFT_INSTR__RS_SH:
        return rs_sh != null && !rs_sh.isEmpty();
      case ARMPackage.SHIFT_INSTR__OP:
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

} //shift_instrImpl
