/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.ARM_Machine_Directives_code;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARM Machine Directives code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl#isArm <em>Arm</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl#isThumb <em>Thumb</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_codeImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARM_Machine_Directives_codeImpl extends CcodeImpl implements ARM_Machine_Directives_code
{
  /**
   * The default value of the '{@link #isArm() <em>Arm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArm()
   * @generated
   * @ordered
   */
  protected static final boolean ARM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArm() <em>Arm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArm()
   * @generated
   * @ordered
   */
  protected boolean arm = ARM_EDEFAULT;

  /**
   * The default value of the '{@link #isThumb() <em>Thumb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isThumb()
   * @generated
   * @ordered
   */
  protected static final boolean THUMB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isThumb() <em>Thumb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isThumb()
   * @generated
   * @ordered
   */
  protected boolean thumb = THUMB_EDEFAULT;

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
  protected ARM_Machine_Directives_codeImpl()
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
    return ARMPackage.Literals.ARM_MACHINE_DIRECTIVES_CODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArm()
  {
    return arm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArm(boolean newArm)
  {
    boolean oldArm = arm;
    arm = newArm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__ARM, oldArm, arm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isThumb()
  {
    return thumb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThumb(boolean newThumb)
  {
    boolean oldThumb = thumb;
    thumb = newThumb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__THUMB, oldThumb, thumb));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__DOT, oldDot, dot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__CODE, oldCode, code));
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__ARM:
        return isArm();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__THUMB:
        return isThumb();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__DOT:
        return isDot();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__ARM:
        setArm((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__THUMB:
        setThumb((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__ARM:
        setArm(ARM_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__THUMB:
        setThumb(THUMB_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__ARM:
        return arm != ARM_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__THUMB:
        return thumb != THUMB_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_CODE__CODE:
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
    result.append(" (arm: ");
    result.append(arm);
    result.append(", thumb: ");
    result.append(thumb);
    result.append(", dot: ");
    result.append(dot);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //ARM_Machine_Directives_codeImpl
