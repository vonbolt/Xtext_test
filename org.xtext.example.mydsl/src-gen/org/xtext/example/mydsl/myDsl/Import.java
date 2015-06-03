/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Import#getImport_type <em>Import type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Import#getImport_num <em>Import num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Import type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import type</em>' attribute.
   * @see #setImport_type(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport_Import_type()
   * @model
   * @generated
   */
  String getImport_type();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Import#getImport_type <em>Import type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import type</em>' attribute.
   * @see #getImport_type()
   * @generated
   */
  void setImport_type(String value);

  /**
   * Returns the value of the '<em><b>Import num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import num</em>' attribute.
   * @see #setImport_num(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getImport_Import_num()
   * @model
   * @generated
   */
  int getImport_num();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Import#getImport_num <em>Import num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import num</em>' attribute.
   * @see #getImport_num()
   * @generated
   */
  void setImport_num(int value);

} // Import
