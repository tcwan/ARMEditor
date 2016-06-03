/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.PREPROCESSOR_ELSE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PREPROCESSOR ELSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl#isHash <em>Hash</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.PREPROCESSOR_ELSEImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PREPROCESSOR_ELSEImpl extends CcodeImpl implements PREPROCESSOR_ELSE
{
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
  protected PREPROCESSOR_ELSEImpl()
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
    return ARMPackage.Literals.PREPROCESSOR_ELSE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_ELSE__HASH, oldHash, hash));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.PREPROCESSOR_ELSE__CODE, oldCode, code));
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
      case ARMPackage.PREPROCESSOR_ELSE__HASH:
        return isHash();
      case ARMPackage.PREPROCESSOR_ELSE__CODE:
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
      case ARMPackage.PREPROCESSOR_ELSE__HASH:
        setHash((Boolean)newValue);
        return;
      case ARMPackage.PREPROCESSOR_ELSE__CODE:
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
      case ARMPackage.PREPROCESSOR_ELSE__HASH:
        setHash(HASH_EDEFAULT);
        return;
      case ARMPackage.PREPROCESSOR_ELSE__CODE:
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
      case ARMPackage.PREPROCESSOR_ELSE__HASH:
        return hash != HASH_EDEFAULT;
      case ARMPackage.PREPROCESSOR_ELSE__CODE:
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

} //PREPROCESSOR_ELSEImpl
