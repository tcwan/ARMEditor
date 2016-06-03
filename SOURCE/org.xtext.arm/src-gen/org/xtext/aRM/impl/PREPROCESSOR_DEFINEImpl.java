/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.PREPROCESSOR_DEFINE;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PREPROCESSOR DEFINE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl#isHash <em>Hash</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_DEFINEImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PREPROCESSOR_DEFINEImpl extends CcodeImpl implements PREPROCESSOR_DEFINE
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
   * The default value of the '{@link #isHash() <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHash()
   * @generated
   * @ordered
   */
  protected static final boolean HASH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHash() <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHash()
   * @generated
   * @ordered
   */
  protected boolean hash = HASH_EDEFAULT;

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
  protected PREPROCESSOR_DEFINEImpl()
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
    return ARMPackage.Literals.PREPROCESSOR_DEFINE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2, oldExpression2, newExpression2);
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
        msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2, null, msgs);
      if (newExpression2 != null)
        msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2, null, msgs);
      msgs = basicSetExpression2(newExpression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2, newExpression2, newExpression2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHash()
  {
    return hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHash(boolean newHash)
  {
    boolean oldHash = hash;
    hash = newHash;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__HASH, oldHash, hash));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_DEFINE__CODE, oldCode, code));
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
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2:
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
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION:
        return getExpression();
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2:
        return getExpression2();
      case ARMPackage.PREPROCESSOR_DEFINE__HASH:
        return isHash();
      case ARMPackage.PREPROCESSOR_DEFINE__CODE:
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
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION:
        setExpression((variable)newValue);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2:
        setExpression2((variable)newValue);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__HASH:
        setHash((Boolean)newValue);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__CODE:
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
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION:
        setExpression((variable)null);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2:
        setExpression2((variable)null);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__HASH:
        setHash(HASH_EDEFAULT);
        return;
      case ARMPackage.PREPROCESSOR_DEFINE__CODE:
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
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION:
        return expression != null;
      case ARMPackage.PREPROCESSOR_DEFINE__EXPRESSION2:
        return expression2 != null;
      case ARMPackage.PREPROCESSOR_DEFINE__HASH:
        return hash != HASH_EDEFAULT;
      case ARMPackage.PREPROCESSOR_DEFINE__CODE:
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
    result.append(" (hash: ");
    result.append(hash);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //PREPROCESSOR_DEFINEImpl
