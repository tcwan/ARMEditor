/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.literal_numeric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>literal numeric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.literal_numericImpl#getHex <em>Hex</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.literal_numericImpl#getInt <em>Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class literal_numericImpl extends MinimalEObjectImpl.Container implements literal_numeric
{
  /**
   * The default value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected static final String HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected String hex = HEX_EDEFAULT;

  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final String INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected String int_ = INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected literal_numericImpl()
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
    return ARMPackage.Literals.LITERAL_NUMERIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHex()
  {
    return hex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHex(String newHex)
  {
    String oldHex = hex;
    hex = newHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.LITERAL_NUMERIC__HEX, oldHex, hex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(String newInt)
  {
    String oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.LITERAL_NUMERIC__INT, oldInt, int_));
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
      case ARMPackage.LITERAL_NUMERIC__HEX:
        return getHex();
      case ARMPackage.LITERAL_NUMERIC__INT:
        return getInt();
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
      case ARMPackage.LITERAL_NUMERIC__HEX:
        setHex((String)newValue);
        return;
      case ARMPackage.LITERAL_NUMERIC__INT:
        setInt((String)newValue);
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
      case ARMPackage.LITERAL_NUMERIC__HEX:
        setHex(HEX_EDEFAULT);
        return;
      case ARMPackage.LITERAL_NUMERIC__INT:
        setInt(INT_EDEFAULT);
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
      case ARMPackage.LITERAL_NUMERIC__HEX:
        return HEX_EDEFAULT == null ? hex != null : !HEX_EDEFAULT.equals(hex);
      case ARMPackage.LITERAL_NUMERIC__INT:
        return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
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
    result.append(" (hex: ");
    result.append(hex);
    result.append(", int: ");
    result.append(int_);
    result.append(')');
    return result.toString();
  }

} //literal_numericImpl
