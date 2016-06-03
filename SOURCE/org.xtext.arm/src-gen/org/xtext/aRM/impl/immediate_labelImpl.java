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
import org.xtext.aRM.immediate_label;
import org.xtext.aRM.literal_numeric;
import org.xtext.aRM.numeric_backward_forward;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>immediate label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getLiteral_numeric <em>Literal numeric</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getNumeric_backward_forward <em>Numeric backward forward</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getNum2 <em>Num2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getLabel2 <em>Label2</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.immediate_labelImpl#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class immediate_labelImpl extends Operand2Impl implements immediate_label
{
  /**
   * The cached value of the '{@link #getLiteral_numeric() <em>Literal numeric</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral_numeric()
   * @generated
   * @ordered
   */
  protected EList<literal_numeric> literal_numeric;

  /**
   * The cached value of the '{@link #getNumeric_backward_forward() <em>Numeric backward forward</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeric_backward_forward()
   * @generated
   * @ordered
   */
  protected EList<numeric_backward_forward> numeric_backward_forward;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getNum2() <em>Num2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum2()
   * @generated
   * @ordered
   */
  protected static final String NUM2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNum2() <em>Num2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum2()
   * @generated
   * @ordered
   */
  protected String num2 = NUM2_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel2() <em>Label2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel2()
   * @generated
   * @ordered
   */
  protected static final String LABEL2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel2() <em>Label2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel2()
   * @generated
   * @ordered
   */
  protected String label2 = LABEL2_EDEFAULT;

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
  protected immediate_labelImpl()
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
    return ARMPackage.Literals.IMMEDIATE_LABEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<literal_numeric> getLiteral_numeric()
  {
    if (literal_numeric == null)
    {
      literal_numeric = new EObjectContainmentEList<literal_numeric>(literal_numeric.class, this, ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC);
    }
    return literal_numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<numeric_backward_forward> getNumeric_backward_forward()
  {
    if (numeric_backward_forward == null)
    {
      numeric_backward_forward = new EObjectContainmentEList<numeric_backward_forward>(numeric_backward_forward.class, this, ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD);
    }
    return numeric_backward_forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.IMMEDIATE_LABEL__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNum2()
  {
    return num2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum2(String newNum2)
  {
    String oldNum2 = num2;
    num2 = newNum2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.IMMEDIATE_LABEL__NUM2, oldNum2, num2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel2()
  {
    return label2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel2(String newLabel2)
  {
    String oldLabel2 = label2;
    label2 = newLabel2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.IMMEDIATE_LABEL__LABEL2, oldLabel2, label2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.IMMEDIATE_LABEL__NUM, oldNum, num));
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
      case ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC:
        return ((InternalEList<?>)getLiteral_numeric()).basicRemove(otherEnd, msgs);
      case ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD:
        return ((InternalEList<?>)getNumeric_backward_forward()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC:
        return getLiteral_numeric();
      case ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD:
        return getNumeric_backward_forward();
      case ARMPackage.IMMEDIATE_LABEL__LABEL:
        return getLabel();
      case ARMPackage.IMMEDIATE_LABEL__NUM2:
        return getNum2();
      case ARMPackage.IMMEDIATE_LABEL__LABEL2:
        return getLabel2();
      case ARMPackage.IMMEDIATE_LABEL__NUM:
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
      case ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC:
        getLiteral_numeric().clear();
        getLiteral_numeric().addAll((Collection<? extends literal_numeric>)newValue);
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD:
        getNumeric_backward_forward().clear();
        getNumeric_backward_forward().addAll((Collection<? extends numeric_backward_forward>)newValue);
        return;
      case ARMPackage.IMMEDIATE_LABEL__LABEL:
        setLabel((String)newValue);
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUM2:
        setNum2((String)newValue);
        return;
      case ARMPackage.IMMEDIATE_LABEL__LABEL2:
        setLabel2((String)newValue);
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUM:
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
      case ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC:
        getLiteral_numeric().clear();
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD:
        getNumeric_backward_forward().clear();
        return;
      case ARMPackage.IMMEDIATE_LABEL__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUM2:
        setNum2(NUM2_EDEFAULT);
        return;
      case ARMPackage.IMMEDIATE_LABEL__LABEL2:
        setLabel2(LABEL2_EDEFAULT);
        return;
      case ARMPackage.IMMEDIATE_LABEL__NUM:
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
      case ARMPackage.IMMEDIATE_LABEL__LITERAL_NUMERIC:
        return literal_numeric != null && !literal_numeric.isEmpty();
      case ARMPackage.IMMEDIATE_LABEL__NUMERIC_BACKWARD_FORWARD:
        return numeric_backward_forward != null && !numeric_backward_forward.isEmpty();
      case ARMPackage.IMMEDIATE_LABEL__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case ARMPackage.IMMEDIATE_LABEL__NUM2:
        return NUM2_EDEFAULT == null ? num2 != null : !NUM2_EDEFAULT.equals(num2);
      case ARMPackage.IMMEDIATE_LABEL__LABEL2:
        return LABEL2_EDEFAULT == null ? label2 != null : !LABEL2_EDEFAULT.equals(label2);
      case ARMPackage.IMMEDIATE_LABEL__NUM:
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
    result.append(" (label: ");
    result.append(label);
    result.append(", num2: ");
    result.append(num2);
    result.append(", label2: ");
    result.append(label2);
    result.append(", num: ");
    result.append(num);
    result.append(')');
    return result.toString();
  }

} //immediate_labelImpl
