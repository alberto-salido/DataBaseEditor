/**
 */
package database;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.ForeignKey#getColumn <em>Column</em>}</li>
 *   <li>{@link database.ForeignKey#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getForeignKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameTypeAtLink'"
 *        annotation="gmf.link tool.description='Foreign Key' tool.name='Foreign Key' source='column' target='reference' target.decoration='arrow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sameTypeAtLink='self.column.type = self.reference.primaryKey.type'"
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference.
   * @see #setColumn(Column)
   * @see database.DatabasePackage#getForeignKey_Column()
   * @model required="true"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link database.ForeignKey#getColumn <em>Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Column value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Table)
   * @see database.DatabasePackage#getForeignKey_Reference()
   * @model required="true"
   * @generated
   */
  Table getReference();

  /**
   * Sets the value of the '{@link database.ForeignKey#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Table value);

} // ForeignKey
