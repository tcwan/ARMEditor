/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.ARM_MACHINE_DIRECTIVES_align;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARM MACHINE DIRECTIVES align</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl#getHex <em>Hex</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_MACHINE_DIRECTIVES_alignImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARM_MACHINE_DIRECTIVES_alignImpl extends CcodeImpl implements ARM_MACHINE_DIRECTIVES_align
{
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
  protected ARM_MACHINE_DIRECTIVES_alignImpl()
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
    return ARMPackage.Literals.ARM_MACHINE_DIRECTIVES_ALIGN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__INT, oldInt, int_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__HEX, oldHex, hex));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__DOT, oldDot, dot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__CODE, oldCode, code));
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__INT:
        return getInt();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__HEX:
        return getHex();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__DOT:
        return isDot();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__INT:
        setInt((String)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__HEX:
        setHex((String)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__INT:
        setInt(INT_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__HEX:
        setHex(HEX_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__INT:
        return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__HEX:
        return HEX_EDEFAULT == null ? hex != null : !HEX_EDEFAULT.equals(hex);
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_ALIGN__CODE:
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
    result.append(" (int: ");
    result.append(int_);
    result.append(", hex: ");
    result.append(hex);
    result.append(", dot: ");
    result.append(dot);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //ARM_MACHINE_DIRECTIVES_alignImpl
