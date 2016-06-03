/**
 */
package org.xtext.aRM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.aRM.ARMPackage;
import org.xtext.aRM.description;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aRM.impl.descriptionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.descriptionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.aRM.impl.descriptionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class descriptionImpl extends MinimalEObjectImpl.Container implements description
{
  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected EList<String> int_;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected EList<String> string;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<String> description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected descriptionImpl()
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
    return ARMPackage.Literals.DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInt()
  {
    if (int_ == null)
    {
      int_ = new EDataTypeEList<String>(String.class, this, ARMPackage.DESCRIPTION__INT);
    }
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getString()
  {
    if (string == null)
    {
      string = new EDataTypeEList<String>(String.class, this, ARMPackage.DESCRIPTION__STRING);
    }
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDescription()
  {
    if (description == null)
    {
      description = new EDataTypeEList<String>(String.class, this, ARMPackage.DESCRIPTION__DESCRIPTION);
    }
    return description;
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
      case ARMPackage.DESCRIPTION__INT:
        return getInt();
      case ARMPackage.DESCRIPTION__STRING:
        return getString();
      case ARMPackage.DESCRIPTION__DESCRIPTION:
        return getDescription();
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
      case ARMPackage.DESCRIPTION__INT:
        getInt().clear();
        getInt().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.DESCRIPTION__STRING:
        getString().clear();
        getString().addAll((Collection<? extends String>)newValue);
        return;
      case ARMPackage.DESCRIPTION__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends String>)newValue);
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
      case ARMPackage.DESCRIPTION__INT:
        getInt().clear();
        return;
      case ARMPackage.DESCRIPTION__STRING:
        getString().clear();
        return;
      case ARMPackage.DESCRIPTION__DESCRIPTION:
        getDescription().clear();
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
      case ARMPackage.DESCRIPTION__INT:
        return int_ != null && !int_.isEmpty();
      case ARMPackage.DESCRIPTION__STRING:
        return string != null && !string.isEmpty();
      case ARMPackage.DESCRIPTION__DESCRIPTION:
        return description != null && !description.isEmpty();
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
    result.append(", string: ");
    result.append(string);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //descriptionImpl
