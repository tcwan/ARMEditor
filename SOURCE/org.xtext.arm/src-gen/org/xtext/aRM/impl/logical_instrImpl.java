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
import org.xtext.aRM.Operand2;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.logical_instr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>logical instr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.logical_instrImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.logical_instrImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.logical_instrImpl#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class logical_instrImpl extends OperationInstrImpl implements logical_instr
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
   * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand2()
   * @generated
   * @ordered
   */
  protected EList<Operand2> operand2;

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
  protected logical_instrImpl()
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
    return ARMPackage.Literals.LOGICAL_INSTR;
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.LOGICAL_INSTR__REGISTER);
    }
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operand2> getOperand2()
  {
    if (operand2 == null)
    {
      operand2 = new EObjectContainmentEList<Operand2>(Operand2.class, this, ARMPackage.LOGICAL_INSTR__OPERAND2);
    }
    return operand2;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.LOGICAL_INSTR__OP, oldOp, op));
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
      case ARMPackage.LOGICAL_INSTR__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.LOGICAL_INSTR__OPERAND2:
        return ((InternalEList<?>)getOperand2()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.LOGICAL_INSTR__REGISTER:
        return getRegister();
      case ARMPackage.LOGICAL_INSTR__OPERAND2:
        return getOperand2();
      case ARMPackage.LOGICAL_INSTR__OP:
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
      case ARMPackage.LOGICAL_INSTR__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.LOGICAL_INSTR__OPERAND2:
        getOperand2().clear();
        getOperand2().addAll((Collection<? extends Operand2>)newValue);
        return;
      case ARMPackage.LOGICAL_INSTR__OP:
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
      case ARMPackage.LOGICAL_INSTR__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.LOGICAL_INSTR__OPERAND2:
        getOperand2().clear();
        return;
      case ARMPackage.LOGICAL_INSTR__OP:
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
      case ARMPackage.LOGICAL_INSTR__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.LOGICAL_INSTR__OPERAND2:
        return operand2 != null && !operand2.isEmpty();
      case ARMPackage.LOGICAL_INSTR__OP:
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

} //logical_instrImpl
