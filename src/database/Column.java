/**
 */
package database;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link database.Column#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see database.DatabasePackage#getColumn()
 * @model annotation="gmf.node tool.description='Column' tool.name='Column' label='name,type' figure='rectangle' label.icon='true' label.pattern='{0}:{1}'"
 * @generated
 */
public interface Column extends DataBaseElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link database.RailsData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see database.RailsData
   * @see #setType(RailsData)
   * @see database.DatabasePackage#getColumn_Type()
   * @model
   * @generated
   */
  RailsData getType();

  /**
   * Sets the value of the '{@link database.Column#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see database.RailsData
   * @see #getType()
   * @generated
   */
  void setType(RailsData value);

} // Column
