/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ImportImpl#getImport_type <em>Import type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ImportImpl#getImport_num <em>Import num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import
{
  /**
   * The default value of the '{@link #getImport_type() <em>Import type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport_type()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImport_type() <em>Import type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport_type()
   * @generated
   * @ordered
   */
  protected String import_type = IMPORT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getImport_num() <em>Import num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport_num()
   * @generated
   * @ordered
   */
  protected static final int IMPORT_NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImport_num() <em>Import num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport_num()
   * @generated
   * @ordered
   */
  protected int import_num = IMPORT_NUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
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
    return MyDslPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImport_type()
  {
    return import_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImport_type(String newImport_type)
  {
    String oldImport_type = import_type;
    import_type = newImport_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMPORT__IMPORT_TYPE, oldImport_type, import_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getImport_num()
  {
    return import_num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImport_num(int newImport_num)
  {
    int oldImport_num = import_num;
    import_num = newImport_num;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IMPORT__IMPORT_NUM, oldImport_num, import_num));
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
      case MyDslPackage.IMPORT__IMPORT_TYPE:
        return getImport_type();
      case MyDslPackage.IMPORT__IMPORT_NUM:
        return getImport_num();
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
      case MyDslPackage.IMPORT__IMPORT_TYPE:
        setImport_type((String)newValue);
        return;
      case MyDslPackage.IMPORT__IMPORT_NUM:
        setImport_num((Integer)newValue);
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
      case MyDslPackage.IMPORT__IMPORT_TYPE:
        setImport_type(IMPORT_TYPE_EDEFAULT);
        return;
      case MyDslPackage.IMPORT__IMPORT_NUM:
        setImport_num(IMPORT_NUM_EDEFAULT);
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
      case MyDslPackage.IMPORT__IMPORT_TYPE:
        return IMPORT_TYPE_EDEFAULT == null ? import_type != null : !IMPORT_TYPE_EDEFAULT.equals(import_type);
      case MyDslPackage.IMPORT__IMPORT_NUM:
        return import_num != IMPORT_NUM_EDEFAULT;
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
    result.append(" (Import_type: ");
    result.append(import_type);
    result.append(", import_num: ");
    result.append(import_num);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
