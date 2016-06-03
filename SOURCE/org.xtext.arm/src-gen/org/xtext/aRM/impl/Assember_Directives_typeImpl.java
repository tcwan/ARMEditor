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
import org.xtext.aRM.Assember_Directives_type;
import org.xtext.aRM.description;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assember Directives type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.Assember_Directives_typeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.Assember_Directives_typeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.Assember_Directives_typeImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.Assember_Directives_typeImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Assember_Directives_typeImpl extends CcodeImpl implements Assember_Directives_type
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
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<description> description;

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
  protected Assember_Directives_typeImpl()
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
    return ARMPackage.Literals.ASSEMBER_DIRECTIVES_TYPE;
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
      expression = new EObjectContainmentEList<variable>(variable.class, this, ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<description> getDescription()
  {
    if (description == null)
    {
      description = new EObjectContainmentEList<description>(description.class, this, ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION);
    }
    return description;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DOT, oldDot, dot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ASSEMBER_DIRECTIVES_TYPE__CODE, oldCode, code));
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
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION:
        return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION:
        return getExpression();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION:
        return getDescription();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DOT:
        return isDot();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__CODE:
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
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends variable>)newValue);
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends description>)newValue);
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__CODE:
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
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION:
        getExpression().clear();
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION:
        getDescription().clear();
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__CODE:
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
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DESCRIPTION:
        return description != null && !description.isEmpty();
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.ASSEMBER_DIRECTIVES_TYPE__CODE:
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

} //Assember_Directives_typeImpl
