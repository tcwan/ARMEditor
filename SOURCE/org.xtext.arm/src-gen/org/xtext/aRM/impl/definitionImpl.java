/**
 */
package org.xtext.aRM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.definition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getVariableInt <em>Variable Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getVariableABC <em>Variable ABC</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getVariableString <em>Variable String</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getVariableHex <em>Variable Hex</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getDefInt <em>Def Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getDefABC <em>Def ABC</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getDefString <em>Def String</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.definitionImpl#getDefHex <em>Def Hex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class definitionImpl extends MinimalEObjectImpl.Container implements definition
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
   * The default value of the '{@link #getDefInt() <em>Def Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefInt()
   * @generated
   * @ordered
   */
  protected static final String DEF_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefInt() <em>Def Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefInt()
   * @generated
   * @ordered
   */
  protected String defInt = DEF_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefABC() <em>Def ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefABC()
   * @generated
   * @ordered
   */
  protected static final String DEF_ABC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefABC() <em>Def ABC</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefABC()
   * @generated
   * @ordered
   */
  protected String defABC = DEF_ABC_EDEFAULT;

  /**
   * The default value of the '{@link #getDefString() <em>Def String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefString()
   * @generated
   * @ordered
   */
  protected static final String DEF_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefString() <em>Def String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefString()
   * @generated
   * @ordered
   */
  protected String defString = DEF_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getDefHex() <em>Def Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefHex()
   * @generated
   * @ordered
   */
  protected static final String DEF_HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefHex() <em>Def Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefHex()
   * @generated
   * @ordered
   */
  protected String defHex = DEF_HEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected definitionImpl()
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
    return ARMPackage.Literals.DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__VARIABLE_INT, oldVariableInt, variableInt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__VARIABLE_ABC, oldVariableABC, variableABC));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__VARIABLE_STRING, oldVariableString, variableString));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__VARIABLE_HEX, oldVariableHex, variableHex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefInt()
  {
    return defInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefInt(String newDefInt)
  {
    String oldDefInt = defInt;
    defInt = newDefInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__DEF_INT, oldDefInt, defInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefABC()
  {
    return defABC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefABC(String newDefABC)
  {
    String oldDefABC = defABC;
    defABC = newDefABC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__DEF_ABC, oldDefABC, defABC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefString()
  {
    return defString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefString(String newDefString)
  {
    String oldDefString = defString;
    defString = newDefString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__DEF_STRING, oldDefString, defString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefHex()
  {
    return defHex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefHex(String newDefHex)
  {
    String oldDefHex = defHex;
    defHex = newDefHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.DEFINITION__DEF_HEX, oldDefHex, defHex));
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
      case ARMPackage.DEFINITION__VARIABLE_INT:
        return getVariableInt();
      case ARMPackage.DEFINITION__VARIABLE_ABC:
        return getVariableABC();
      case ARMPackage.DEFINITION__VARIABLE_STRING:
        return getVariableString();
      case ARMPackage.DEFINITION__VARIABLE_HEX:
        return getVariableHex();
      case ARMPackage.DEFINITION__DEF_INT:
        return getDefInt();
      case ARMPackage.DEFINITION__DEF_ABC:
        return getDefABC();
      case ARMPackage.DEFINITION__DEF_STRING:
        return getDefString();
      case ARMPackage.DEFINITION__DEF_HEX:
        return getDefHex();
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
      case ARMPackage.DEFINITION__VARIABLE_INT:
        setVariableInt((String)newValue);
        return;
      case ARMPackage.DEFINITION__VARIABLE_ABC:
        setVariableABC((String)newValue);
        return;
      case ARMPackage.DEFINITION__VARIABLE_STRING:
        setVariableString((String)newValue);
        return;
      case ARMPackage.DEFINITION__VARIABLE_HEX:
        setVariableHex((String)newValue);
        return;
      case ARMPackage.DEFINITION__DEF_INT:
        setDefInt((String)newValue);
        return;
      case ARMPackage.DEFINITION__DEF_ABC:
        setDefABC((String)newValue);
        return;
      case ARMPackage.DEFINITION__DEF_STRING:
        setDefString((String)newValue);
        return;
      case ARMPackage.DEFINITION__DEF_HEX:
        setDefHex((String)newValue);
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
      case ARMPackage.DEFINITION__VARIABLE_INT:
        setVariableInt(VARIABLE_INT_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__VARIABLE_ABC:
        setVariableABC(VARIABLE_ABC_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__VARIABLE_STRING:
        setVariableString(VARIABLE_STRING_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__VARIABLE_HEX:
        setVariableHex(VARIABLE_HEX_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__DEF_INT:
        setDefInt(DEF_INT_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__DEF_ABC:
        setDefABC(DEF_ABC_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__DEF_STRING:
        setDefString(DEF_STRING_EDEFAULT);
        return;
      case ARMPackage.DEFINITION__DEF_HEX:
        setDefHex(DEF_HEX_EDEFAULT);
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
      case ARMPackage.DEFINITION__VARIABLE_INT:
        return VARIABLE_INT_EDEFAULT == null ? variableInt != null : !VARIABLE_INT_EDEFAULT.equals(variableInt);
      case ARMPackage.DEFINITION__VARIABLE_ABC:
        return VARIABLE_ABC_EDEFAULT == null ? variableABC != null : !VARIABLE_ABC_EDEFAULT.equals(variableABC);
      case ARMPackage.DEFINITION__VARIABLE_STRING:
        return VARIABLE_STRING_EDEFAULT == null ? variableString != null : !VARIABLE_STRING_EDEFAULT.equals(variableString);
      case ARMPackage.DEFINITION__VARIABLE_HEX:
        return VARIABLE_HEX_EDEFAULT == null ? variableHex != null : !VARIABLE_HEX_EDEFAULT.equals(variableHex);
      case ARMPackage.DEFINITION__DEF_INT:
        return DEF_INT_EDEFAULT == null ? defInt != null : !DEF_INT_EDEFAULT.equals(defInt);
      case ARMPackage.DEFINITION__DEF_ABC:
        return DEF_ABC_EDEFAULT == null ? defABC != null : !DEF_ABC_EDEFAULT.equals(defABC);
      case ARMPackage.DEFINITION__DEF_STRING:
        return DEF_STRING_EDEFAULT == null ? defString != null : !DEF_STRING_EDEFAULT.equals(defString);
      case ARMPackage.DEFINITION__DEF_HEX:
        return DEF_HEX_EDEFAULT == null ? defHex != null : !DEF_HEX_EDEFAULT.equals(defHex);
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
    result.append(", defInt: ");
    result.append(defInt);
    result.append(", defABC: ");
    result.append(defABC);
    result.append(", defString: ");
    result.append(defString);
    result.append(", defHex: ");
    result.append(defHex);
    result.append(')');
    return result.toString();
  }

} //definitionImpl
