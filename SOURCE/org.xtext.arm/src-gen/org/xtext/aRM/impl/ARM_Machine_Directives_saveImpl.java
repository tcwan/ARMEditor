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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.ARM_Machine_Directives_save;
import org.xtext.aRM.REGISTER;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARM Machine Directives save</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl#getReglist <em>Reglist</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl#getReglistNum <em>Reglist Num</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.ARM_Machine_Directives_saveImpl#isCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARM_Machine_Directives_saveImpl extends CcodeImpl implements ARM_Machine_Directives_save
{
  /**
   * The cached value of the '{@link #getReglist() <em>Reglist</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReglist()
   * @generated
   * @ordered
   */
  protected EList<String> reglist;

  /**
   * The cached value of the '{@link #getReglistNum() <em>Reglist Num</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReglistNum()
   * @generated
   * @ordered
   */
  protected EList<String> reglistNum;

  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected EList<REGISTER> register;

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
  protected ARM_Machine_Directives_saveImpl()
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
    return ARMPackage.Literals.ARM_MACHINE_DIRECTIVES_SAVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getReglist()
  {
    if (reglist == null)
    {
      reglist = new EDataTypeEList<String>(String.class, this, ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST);
    }
    return reglist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getReglistNum()
  {
    if (reglistNum == null)
    {
      reglistNum = new EDataTypeEList<String>(String.class, this, ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM);
    }
    return reglistNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<REGISTER> getRegister()
  {
    if (register == null)
    {
      register = new EObjectContainmentEList<REGISTER>(REGISTER.class, this, ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER);
    }
    return register;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__DOT, oldDot, dot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__CODE, oldCode, code));
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER:
        return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST:
        return getReglist();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM:
        return getReglistNum();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER:
        return getRegister();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__DOT:
        return isDot();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST:
        getReglist().clear();
        getReglist().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM:
        getReglistNum().clear();
        getReglistNum().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER:
        getRegister().clear();
        getRegister().addAll((Collection<? extends REGISTER>)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__DOT:
        setDot((Boolean)newValue);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST:
        getReglist().clear();
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM:
        getReglistNum().clear();
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER:
        getRegister().clear();
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__DOT:
        setDot(DOT_EDEFAULT);
        return;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__CODE:
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
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST:
        return reglist != null && !reglist.isEmpty();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGLIST_NUM:
        return reglistNum != null && !reglistNum.isEmpty();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__REGISTER:
        return register != null && !register.isEmpty();
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__DOT:
        return dot != DOT_EDEFAULT;
      case ARMPackage.ARM_MACHINE_DIRECTIVES_SAVE__CODE:
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
    result.append(" (reglist: ");
    result.append(reglist);
    result.append(", reglistNum: ");
    result.append(reglistNum);
    result.append(", dot: ");
    result.append(dot);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //ARM_Machine_Directives_saveImpl
