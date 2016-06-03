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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.BAREL_SHIFT_REGISTER;
import org.xtext.aRM.REGISTER;
import org.xtext.aRM.flexible_offset;
import org.xtext.aRM.immediate_label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>flexible offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getBAREL_SHIFT_REGISTER <em>BAREL SHIFT REGISTER</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getImmediate_label <em>Immediate label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.flexible_offsetImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class flexible_offsetImpl extends MinimalEObjectImpl.Container implements flexible_offset
{
  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected String expr = EXPR_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected static final String EXPR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected String expr2 = EXPR2_EDEFAULT;

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
   * The cached value of the '{@link #getBAREL_SHIFT_REGISTER() <em>BAREL SHIFT REGISTER</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBAREL_SHIFT_REGISTER()
   * @generated
   * @ordered
   */
  protected EList<BAREL_SHIFT_REGISTER> bareL_SHIFT_REGISTER;

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
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final String NUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected String num = NUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected flexible_offsetImpl()
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
    return ARMPackage.Literals.FLEXIBLE_OFFSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(String newExpr)
  {
    String oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.FLEXIBLE_OFFSET__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr2(String newExpr2)
  {
    String oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.FLEXIBLE_OFFSET__EXPR2, oldExpr2, expr2));
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
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.FLEXIBLE_OFFSET__REGISTER);
    }
    return register;
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
      bareL_SHIFT_REGISTER = new EObjectContainmentEList<BAREL_SHIFT_REGISTER>(BAREL_SHIFT_REGISTER.class, this, ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER);
    }
    return bareL_SHIFT_REGISTER;
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
      immediate_label = new EObjectContainmentEList<immediate_label>(immediate_label.class, this, ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL);
    }
    return immediate_label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(String newNum)
  {
    String oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.FLEXIBLE_OFFSET__NUM, oldNum, num));
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
      case ARMPackage.FLEXIBLE_OFFSET__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
      case ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER:
        return ((InternalEList<?>)getBAREL_SHIFT_REGISTER()).basicRemove(otherEnd, msgs);
      case ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL:
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
      case ARMPackage.FLEXIBLE_OFFSET__EXPR:
        return getExpr();
      case ARMPackage.FLEXIBLE_OFFSET__EXPR2:
        return getExpr2();
      case ARMPackage.FLEXIBLE_OFFSET__REGISTER:
        return getRegister();
      case ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER:
        return getBAREL_SHIFT_REGISTER();
      case ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL:
        return getImmediate_label();
      case ARMPackage.FLEXIBLE_OFFSET__NUM:
        return getNum();
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
      case ARMPackage.FLEXIBLE_OFFSET__EXPR:
        setExpr((String)newValue);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__EXPR2:
        setExpr2((String)newValue);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER:
        getBAREL_SHIFT_REGISTER().clear();
        getBAREL_SHIFT_REGISTER().addAll((Collection<? extends BAREL_SHIFT_REGISTER>)newValue);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        getImmediate_label().addAll((Collection<? extends immediate_label>)newValue);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__NUM:
        setNum((String)newValue);
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
      case ARMPackage.FLEXIBLE_OFFSET__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__EXPR2:
        setExpr2(EXPR2_EDEFAULT);
        return;
      case ARMPackage.FLEXIBLE_OFFSET__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER:
        getBAREL_SHIFT_REGISTER().clear();
        return;
      case ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL:
        getImmediate_label().clear();
        return;
      case ARMPackage.FLEXIBLE_OFFSET__NUM:
        setNum(NUM_EDEFAULT);
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
      case ARMPackage.FLEXIBLE_OFFSET__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case ARMPackage.FLEXIBLE_OFFSET__EXPR2:
        return EXPR2_EDEFAULT == null ? expr2 != null : !EXPR2_EDEFAULT.equals(expr2);
      case ARMPackage.FLEXIBLE_OFFSET__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.FLEXIBLE_OFFSET__BAREL_SHIFT_REGISTER:
        return bareL_SHIFT_REGISTER != null && !bareL_SHIFT_REGISTER.isEmpty();
      case ARMPackage.FLEXIBLE_OFFSET__IMMEDIATE_LABEL:
        return immediate_label != null && !immediate_label.isEmpty();
      case ARMPackage.FLEXIBLE_OFFSET__NUM:
        return NUM_EDEFAULT == null ? num != null : !NUM_EDEFAULT.equals(num);
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
    result.append(" (expr: ");
    result.append(expr);
    result.append(", expr2: ");
    result.append(expr2);
    result.append(", num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //flexible_offsetImpl
