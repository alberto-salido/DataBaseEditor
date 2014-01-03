/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link defaultname.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link defaultname.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noIdName columnNameUnique cycleForeignKey'"
 *        annotation="gmf.node tool.description='Table' tool.name='Table' border.color='0,0,0' label='name' label.placement='internal' label.icon='false'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noIdName='not (self.columns\n\t\t\t->exists(name.toUpperCase() = \'id\'.toUpperCase()))' columnNameUnique='self.columns\n\t\t\t->isUnique(name.toUpperCase())' cycleForeignKey='not(self.foreignKeys\n\t\t\t->notEmpty() and self.foreignKeys\n\t\t\t->exists(reference.name = self.name))'"
 * @generated
 */
public interface Table extends DataBaseElement
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link defaultname.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see defaultname.DefaultnamePackage#getTable_Columns()
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
   * @see defaultname.DefaultnamePackage#getTable_PrimaryKey()
   * @model required="true"
   * @generated
   */
  Column getPrimaryKey();

  /**
   * Sets the value of the '{@link defaultname.Table#getPrimaryKey <em>Primary Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' reference.
   * @see #getPrimaryKey()
   * @generated
   */
  void setPrimaryKey(Column value);

  /**
   * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
   * The list contents are of type {@link defaultname.ForeignKey}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Keys</em>' containment reference list.
   * @see defaultname.DefaultnamePackage#getTable_ForeignKeys()
   * @model containment="true"
   * @generated
   */
  EList<ForeignKey> getForeignKeys();

} // Table
