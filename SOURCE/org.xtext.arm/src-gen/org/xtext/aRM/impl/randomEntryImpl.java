/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.randomEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>random Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.randomEntryImpl#getEntryInt <em>Entry Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.randomEntryImpl#getEntryABC <em>Entry ABC</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.randomEntryImpl#getEntryString <em>Entry String</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.randomEntryImpl#getEntryHex <em>Entry Hex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class randomEntryImpl extends MinimalEObjectImpl.Container implements randomEntry
{
  /**
   * The default value of the '{@link #getEntryInt() <em>Entry Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryInt()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryInt() <em>Entry Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryInt()
   * @generated
   * @ordered
   */
  protected String entryInt = ENTRY_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getEntryABC() <em>Entry ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryABC()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_ABC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryABC() <em>Entry ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryABC()
   * @generated
   * @ordered
   */
  protected String entryABC = ENTRY_ABC_EDEFAULT;

  /**
   * The default value of the '{@link #getEntryString() <em>Entry String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryString()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryString() <em>Entry String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryString()
   * @generated
   * @ordered
   */
  protected String entryString = ENTRY_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getEntryHex() <em>Entry Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryHex()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryHex() <em>Entry Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryHex()
   * @generated
   * @ordered
   */
  protected String entryHex = ENTRY_HEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected randomEntryImpl()
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
    return ARMPackage.Literals.RANDOM_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryInt()
  {
    return entryInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryInt(String newEntryInt)
  {
    String oldEntryInt = entryInt;
    entryInt = newEntryInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.RANDOM_ENTRY__ENTRY_INT, oldEntryInt, entryInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryABC()
  {
    return entryABC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryABC(String newEntryABC)
  {
    String oldEntryABC = entryABC;
    entryABC = newEntryABC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.RANDOM_ENTRY__ENTRY_ABC, oldEntryABC, entryABC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryString()
  {
    return entryString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryString(String newEntryString)
  {
    String oldEntryString = entryString;
    entryString = newEntryString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.RANDOM_ENTRY__ENTRY_STRING, oldEntryString, entryString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntryHex()
  {
    return entryHex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryHex(String newEntryHex)
  {
    String oldEntryHex = entryHex;
    entryHex = newEntryHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.RANDOM_ENTRY__ENTRY_HEX, oldEntryHex, entryHex));
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
      case ARMPackage.RANDOM_ENTRY__ENTRY_INT:
        return getEntryInt();
      case ARMPackage.RANDOM_ENTRY__ENTRY_ABC:
        return getEntryABC();
      case ARMPackage.RANDOM_ENTRY__ENTRY_STRING:
        return getEntryString();
      case ARMPackage.RANDOM_ENTRY__ENTRY_HEX:
        return getEntryHex();
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
      case ARMPackage.RANDOM_ENTRY__ENTRY_INT:
        setEntryInt((String)newValue);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_ABC:
        setEntryABC((String)newValue);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_STRING:
        setEntryString((String)newValue);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_HEX:
        setEntryHex((String)newValue);
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
      case ARMPackage.RANDOM_ENTRY__ENTRY_INT:
        setEntryInt(ENTRY_INT_EDEFAULT);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_ABC:
        setEntryABC(ENTRY_ABC_EDEFAULT);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_STRING:
        setEntryString(ENTRY_STRING_EDEFAULT);
        return;
      case ARMPackage.RANDOM_ENTRY__ENTRY_HEX:
        setEntryHex(ENTRY_HEX_EDEFAULT);
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
      case ARMPackage.RANDOM_ENTRY__ENTRY_INT:
        return ENTRY_INT_EDEFAULT == null ? entryInt != null : !ENTRY_INT_EDEFAULT.equals(entryInt);
      case ARMPackage.RANDOM_ENTRY__ENTRY_ABC:
        return ENTRY_ABC_EDEFAULT == null ? entryABC != null : !ENTRY_ABC_EDEFAULT.equals(entryABC);
      case ARMPackage.RANDOM_ENTRY__ENTRY_STRING:
        return ENTRY_STRING_EDEFAULT == null ? entryString != null : !ENTRY_STRING_EDEFAULT.equals(entryString);
      case ARMPackage.RANDOM_ENTRY__ENTRY_HEX:
        return ENTRY_HEX_EDEFAULT == null ? entryHex != null : !ENTRY_HEX_EDEFAULT.equals(entryHex);
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
    result.append(" (entryInt: ");
    result.append(entryInt);
    result.append(", entryABC: ");
    result.append(entryABC);
    result.append(", entryString: ");
    result.append(entryString);
    result.append(", entryHex: ");
    result.append(entryHex);
    result.append(')');
    return result.toString();
  }

} //randomEntryImpl
