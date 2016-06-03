/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.ARM_Machine_Directives;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARM Machine Directives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_DirectivesImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARM_Machine_DirectivesImpl extends CcodeImpl implements ARM_Machine_Directives
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected variable expression;

  /**
   * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression2()
   * @generated
   * @ordered
   */
  protected variable expression2;

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
  protected ARM_Machine_DirectivesImpl()
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
    return ARMPackage.Literals.ARM_MACHINE_DIRECTIVES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(variable newExpression, NotificationChain msgs)
  {
    variable oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(variable newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getExpression2()
  {
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression2(variable newExpression2, NotificationChain msgs)
  {
    variable oldExpression2 = expression2;
    expression2 = newExpression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2, oldExpression2, newExpression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression2(variable newExpression2)
  {
    if (newExpression2 != expression2)
    {
      NotificationChain msgs = null;
      if (expression2 != null)
        msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2, null, msgs);
      if (newExpression2 != null)
        msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2, null, msgs);
      msgs = basicSetExpression2(newExpression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2, newExpression2, newExpression2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__DOT, oldDot, dot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES__CODE, oldCode, code));
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2:
        return basicSetExpression2(null, msgs);
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION:
        return getExpression();
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2:
        return getExpression2();
      case ARMPackage.ARM_MACHINE_DIRECTIVES__DOT:
        return isDot();
      case ARMPackage.ARM_MACHINE_DIRECTIVES__CODE:
        return isCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION:
        setExpression((variable)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2:
        setExpression2((variable)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION:
        setExpression((variable)null);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2:
        setExpression2((variable)null);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION:
        return expression != null;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__EXPRESSION2:
        return expression2 != null;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES__CODE:
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

} //ARM_Machine_DirectivesImpl
