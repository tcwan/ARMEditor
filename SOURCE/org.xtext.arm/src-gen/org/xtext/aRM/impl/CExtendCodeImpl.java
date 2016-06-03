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
import org.xtext.aRM.CExtendCode;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CExtend Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.CExtendCodeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.CExtendCodeImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.CExtendCodeImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.CExtendCodeImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CExtendCodeImpl extends CcodeImpl implements CExtendCode
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<variable> expression;

  /**
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected EList<variable> expression2;

  /**
   * The default value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected static final boolean DOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDot() <em>Dot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDot()
   * @generated
   * @ordered
   */
  protected boolean dot = DOT_EDEFAULT;

  /**
   * The default value of the '{@link #isCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCode()
   * @generated
   * @ordered
   */
  protected static final boolean CODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCode()
   * @generated
   * @ordered
   */
  protected boolean code = CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CExtendCodeImpl()
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
    return ARMPackage.Literals.CEXTEND_CODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.CEXTEND_CODE__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable> getExpression2()
  {
    if (expression2 == null)
    {
      expression2 = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.CEXTEND_CODE__EXPRESSION2);
    }
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDot()
  {
    return dot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDot(boolean newDot)
  {
    boolean oldDot = dot;
    dot = newDot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.CEXTEND_CODE__DOT, oldDot, dot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(boolean newCode)
  {
    boolean oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.CEXTEND_CODE__CODE, oldCode, code));
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
      case ARMPackage.CEXTEND_CODE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case ARMPackage.CEXTEND_CODE__EXPRESSION2:
        return ((InternalEList<?>)getExpression2()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.CEXTEND_CODE__EXPRESSION:
        return getExpression();
      case ARMPackage.CEXTEND_CODE__EXPRESSION2:
        return getExpression2();
      case ARMPackage.CEXTEND_CODE__DOT:
        return isDot();
      case ARMPackage.CEXTEND_CODE__CODE:
        return isCode();
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
      case ARMPackage.CEXTEND_CODE__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends variable>)newValue);
        return;
      case ARMPackage.CEXTEND_CODE__EXPRESSION2:
        getExpression2().clear();
        getExpression2().addAll((Collection<? extends variable>)newValue);
        return;
      case ARMPackage.CEXTEND_CODE__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.CEXTEND_CODE__CODE:
        setCode((Boolean)newValue);
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
      case ARMPackage.CEXTEND_CODE__EXPRESSION:
        getExpression().clear();
        return;
      case ARMPackage.CEXTEND_CODE__EXPRESSION2:
        getExpression2().clear();
        return;
      case ARMPackage.CEXTEND_CODE__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.CEXTEND_CODE__CODE:
        setCode(CODE_EDEFAULT);
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
      case ARMPackage.CEXTEND_CODE__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case ARMPackage.CEXTEND_CODE__EXPRESSION2:
        return expression2 != null && !expression2.isEmpty();
      case ARMPackage.CEXTEND_CODE__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.CEXTEND_CODE__CODE:
        return code != CODE_EDEFAULT;
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
    result.append(" (dot: ");
    result.append(dot);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //CExtendCodeImpl
