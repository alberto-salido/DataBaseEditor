/**
 */
package database;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link database.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link database.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noIdName columnNameUnique cycleForeignKey'"
 *        annotation="gmf.node tool.description='Table' tool.name='Table' border.color='0,0,0' label='name' label.placement='internal' label.icon='false'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noIdName='not (self.columns\n\t\t\t->exists(name.toUpperCase() = \'id\'.toUpperCase()))' columnNameUnique='self.columns\n\t\t\t->isUnique(name.toUpperCase())' cycleForeignKey='not(self.foreignKeys\n\t\t\t->notEmpty() and self.foreignKeys\n\t\t\t->exists(reference.name = self.name))'"
 * @generated
 */
public interface Table extends DataBaseElement
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link database.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see database.DatabasePackage#getTable_Columns()
   * @model containment="true" required="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' reference.
   * @see #setPrimaryKey(Column)
   * @see database.DatabasePackage#getTable_PrimaryKey()
   * @model required="true"
   * @generated
   */
  Column getPrimaryKey();

  /**
   * Sets the value of the '{@link database.Table#getPrimaryKey <em>Primary Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(Column value);

  /**
   * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
   * The list contents are of type {@link database.ForeignKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Keys</em>' containment reference list.
   * @see database.DatabasePackage#getTable_ForeignKeys()
   * @model containment="true"
   * @generated
   */
  EList<ForeignKey> getForeignKeys();

} // Table
