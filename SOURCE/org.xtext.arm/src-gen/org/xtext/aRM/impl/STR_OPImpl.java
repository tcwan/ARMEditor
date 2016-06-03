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
import org.xtext.aRM.STR_OP;
import org.xtext.aRM.immediate_label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STR OP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.STR_OPImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.STR_OPImpl#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.STR_OPImpl#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.STR_OPImpl#isOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STR_OPImpl extends ldr_str_irpre_instrImpl implements STR_OP
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
   * The cached value of the '{@link #getImmediate_label() <em>Immediate label</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImmediate_label()
   * @generated
   * @ordered
   */
  protected EList<immediate_label> immediate_label;

  /**
   * The cached value of the '{@link #getBAREL_SHIFT_REGISTER() <em>BAREL SHIFT REGISTER</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBAREL_SHIFT_REGISTER()
   * @generated
   * @ordered
   */
  protected EList<BAREL_SHIFT_REGISTER> bareL_SHIFT_REGISTER;

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
  protected STR_OPImpl()
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
    return ARMPackage.Literals.STR_OP;
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.STR_OP__REGISTER);
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
      immediate_label = new EObjectContainmentEList<immediate_label>(immediate_label.class, this, ARMPackage.STR_OP__IMMEDIATE_LABEL);
    }
    return immediate_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BAREL_SHIFT_REGISTER> getBAREL_SHIFT_REGISTER()
  {
    if (bareL_SHIFT_REGISTER == null)
    {
      bareL_SHIFT_REGISTER = new EObjectContainmentEList<BAREL_SHIFT_REGISTER>(BAREL_SHIFT_REGISTER.class, this, ARMPackage.STR_OP__BAREL_SHIFT_REGISTER);
    }
    return bareL_SHIFT_REGISTER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.STR_OP__OP, oldOp, op));
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
      case ARMPackage.STR_OP__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.STR_OP__IMMEDIATE_LABEL:
        return ((InternalEList<?>)getImmediate_label()).basicRemove(otherEnd, msgs);
      case ARMPackage.STR_OP__BAREL_SHIFT_REGISTER:
        return ((InternalEList<?>)getBAREL_SHIFT_REGISTER()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.STR_OP__REGISTER:
        return getRegister();
      case ARMPackage.STR_OP__IMMEDIATE_LABEL:
        return getImmediate_label();
      case ARMPackage.STR_OP__BAREL_SHIFT_REGISTER:
        return getBAREL_SHIFT_REGISTER();
      case ARMPackage.STR_OP__OP:
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
      case ARMPackage.STR_OP__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.STR_OP__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        getImmediate_label().addAll((Collection<? extends immediate_label>)newValue);
        return;
      case ARMPackage.STR_OP__BAREL_SHIFT_REGISTER:
        getBAREL_SHIFT_REGISTER().clear();
        getBAREL_SHIFT_REGISTER().addAll((Collection<? extends BAREL_SHIFT_REGISTER>)newValue);
        return;
      case ARMPackage.STR_OP__OP:
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
      case ARMPackage.STR_OP__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.STR_OP__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        return;
      case ARMPackage.STR_OP__BAREL_SHIFT_REGISTER:
        getBAREL_SHIFT_REGISTER().clear();
        return;
      case ARMPackage.STR_OP__OP:
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
      case ARMPackage.STR_OP__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.STR_OP__IMMEDIATE_LABEL:
        return immediate_label != null && !immediate_label.isEmpty();
      case ARMPackage.STR_OP__BAREL_SHIFT_REGISTER:
        return bareL_SHIFT_REGISTER != null && !bareL_SHIFT_REGISTER.isEmpty();
      case ARMPackage.STR_OP__OP:
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

} //STR_OPImpl
