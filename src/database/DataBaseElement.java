/**
 */
package database;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.DataBaseElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getDataBaseElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameEmpty illegalName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameEmpty='not (self.name\n\t\t\t->isEmpty())' illegalName='Sequence{1 .. self.name.size()}\n\t\t\t->collect(i | self.name.substring(i, i))\n\t\t\t->excludes(\' \')'"
 * @generated
 */
public interface DataBaseElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see database.DatabasePackage#getDataBaseElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link database.DataBaseElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DataBaseElement
