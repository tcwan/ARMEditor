/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.variableImpl#getVariableInt <em>Variable Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.variableImpl#getVariableABC <em>Variable ABC</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.variableImpl#getVariableString <em>Variable String</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.variableImpl#getVariableHex <em>Variable Hex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variableImpl extends MinimalEObjectImpl.Container implements variable
{
  /**
   * The default value of the '{@link #getVariableInt() <em>Variable Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableInt()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableInt() <em>Variable Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableInt()
   * @generated
   * @ordered
   */
  protected String variableInt = VARIABLE_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableABC() <em>Variable ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableABC()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_ABC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableABC() <em>Variable ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableABC()
   * @generated
   * @ordered
   */
  protected String variableABC = VARIABLE_ABC_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableString() <em>Variable String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableString()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableString() <em>Variable String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableString()
   * @generated
   * @ordered
   */
  protected String variableString = VARIABLE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getVariableHex() <em>Variable Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableHex()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariableHex() <em>Variable Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableHex()
   * @generated
   * @ordered
   */
  protected String variableHex = VARIABLE_HEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variableImpl()
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
    return ARMPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableInt()
  {
    return variableInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableInt(String newVariableInt)
  {
    String oldVariableInt = variableInt;
    variableInt = newVariableInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.VARIABLE__VARIABLE_INT, oldVariableInt, variableInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableABC()
  {
    return variableABC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableABC(String newVariableABC)
  {
    String oldVariableABC = variableABC;
    variableABC = newVariableABC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.VARIABLE__VARIABLE_ABC, oldVariableABC, variableABC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableString()
  {
    return variableString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableString(String newVariableString)
  {
    String oldVariableString = variableString;
    variableString = newVariableString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.VARIABLE__VARIABLE_STRING, oldVariableString, variableString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariableHex()
  {
    return variableHex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableHex(String newVariableHex)
  {
    String oldVariableHex = variableHex;
    variableHex = newVariableHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.VARIABLE__VARIABLE_HEX, oldVariableHex, variableHex));
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
      case ARMPackage.VARIABLE__VARIABLE_INT:
        return getVariableInt();
      case ARMPackage.VARIABLE__VARIABLE_ABC:
        return getVariableABC();
      case ARMPackage.VARIABLE__VARIABLE_STRING:
        return getVariableString();
      case ARMPackage.VARIABLE__VARIABLE_HEX:
        return getVariableHex();
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
      case ARMPackage.VARIABLE__VARIABLE_INT:
        setVariableInt((String)newValue);
        return;
      case ARMPackage.VARIABLE__VARIABLE_ABC:
        setVariableABC((String)newValue);
        return;
      case ARMPackage.VARIABLE__VARIABLE_STRING:
        setVariableString((String)newValue);
        return;
      case ARMPackage.VARIABLE__VARIABLE_HEX:
        setVariableHex((String)newValue);
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
      case ARMPackage.VARIABLE__VARIABLE_INT:
        setVariableInt(VARIABLE_INT_EDEFAULT);
        return;
      case ARMPackage.VARIABLE__VARIABLE_ABC:
        setVariableABC(VARIABLE_ABC_EDEFAULT);
        return;
      case ARMPackage.VARIABLE__VARIABLE_STRING:
        setVariableString(VARIABLE_STRING_EDEFAULT);
        return;
      case ARMPackage.VARIABLE__VARIABLE_HEX:
        setVariableHex(VARIABLE_HEX_EDEFAULT);
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
      case ARMPackage.VARIABLE__VARIABLE_INT:
        return VARIABLE_INT_EDEFAULT == null ? variableInt != null : !VARIABLE_INT_EDEFAULT.equals(variableInt);
      case ARMPackage.VARIABLE__VARIABLE_ABC:
        return VARIABLE_ABC_EDEFAULT == null ? variableABC != null : !VARIABLE_ABC_EDEFAULT.equals(variableABC);
      case ARMPackage.VARIABLE__VARIABLE_STRING:
        return VARIABLE_STRING_EDEFAULT == null ? variableString != null : !VARIABLE_STRING_EDEFAULT.equals(variableString);
      case ARMPackage.VARIABLE__VARIABLE_HEX:
        return VARIABLE_HEX_EDEFAULT == null ? variableHex != null : !VARIABLE_HEX_EDEFAULT.equals(variableHex);
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
    result.append(" (variableInt: ");
    result.append(variableInt);
    result.append(", variableABC: ");
    result.append(variableABC);
    result.append(", variableString: ");
    result.append(variableString);
    result.append(", variableHex: ");
    result.append(variableHex);
    result.append(')');
    return result.toString();
  }

} //variableImpl
