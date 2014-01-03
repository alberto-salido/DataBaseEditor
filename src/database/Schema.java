/**
 */
package database;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Schema#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getSchema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tableNameUnique'"
 *        annotation="gmf.diagram foo='foo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot tableNameUnique='self.tables\n\t\t\t->isUnique(name.toUpperCase())'"
 * @generated
 */
public interface Schema extends DataBaseElement
{
  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link database.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see database.DatabasePackage#getSchema_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

} // Schema
