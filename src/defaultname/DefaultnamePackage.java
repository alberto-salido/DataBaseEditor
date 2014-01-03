/**
 */
package defaultname;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnameFactory
 * @model kind="package"
 *        annotation="gmf foo='foo'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DefaultnamePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "defaultname";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://defaultname/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "defaultname";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DefaultnamePackage eINSTANCE = defaultname.impl.DefaultnamePackageImpl.init();

  /**
   * The meta object id for the '{@link defaultname.impl.DataBaseElementImpl <em>Data Base Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.impl.DataBaseElementImpl
   * @see defaultname.impl.DefaultnamePackageImpl#getDataBaseElement()
   * @generated
   */
  int DATA_BASE_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BASE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Base Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BASE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link defaultname.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.impl.SchemaImpl
   * @see defaultname.impl.DefaultnamePackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = DATA_BASE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__TABLES = DATA_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = DATA_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link defaultname.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.impl.TableImpl
   * @see defaultname.impl.DefaultnamePackageImpl#getTable()
   * @generated
   */
  int TABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = DATA_BASE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = DATA_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__PRIMARY_KEY = DATA_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__FOREIGN_KEYS = DATA_BASE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = DATA_BASE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link defaultname.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.impl.ColumnImpl
   * @see defaultname.impl.DefaultnamePackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = DATA_BASE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = DATA_BASE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = DATA_BASE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link defaultname.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.impl.ForeignKeyImpl
   * @see defaultname.impl.DefaultnamePackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 4;

  /**
   * The feature id for the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link defaultname.RailsData <em>Rails Data</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see defaultname.RailsData
   * @see defaultname.impl.DefaultnamePackageImpl#getRailsData()
   * @generated
   */
  int RAILS_DATA = 5;


  /**
   * Returns the meta object for class '{@link defaultname.DataBaseElement <em>Data Base Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Base Element</em>'.
   * @see defaultname.DataBaseElement
   * @generated
   */
  EClass getDataBaseElement();

  /**
   * Returns the meta object for the attribute '{@link defaultname.DataBaseElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see defaultname.DataBaseElement#getName()
   * @see #getDataBaseElement()
   * @generated
   */
  EAttribute getDataBaseElement_Name();

  /**
   * Returns the meta object for class '{@link defaultname.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see defaultname.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the containment reference list '{@link defaultname.Schema#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see defaultname.Schema#getTables()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Tables();

  /**
   * Returns the meta object for class '{@link defaultname.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see defaultname.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the containment reference list '{@link defaultname.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see defaultname.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for the reference '{@link defaultname.Table#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Primary Key</em>'.
   * @see defaultname.Table#getPrimaryKey()
   * @see #getTable()
   * @generated
   */
  EReference getTable_PrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link defaultname.Table#getForeignKeys <em>Foreign Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
   * @see defaultname.Table#getForeignKeys()
   * @see #getTable()
   * @generated
   */
  EReference getTable_ForeignKeys();

  /**
   * Returns the meta object for class '{@link defaultname.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see defaultname.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link defaultname.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see defaultname.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the meta object for class '{@link defaultname.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see defaultname.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference '{@link defaultname.ForeignKey#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column</em>'.
   * @see defaultname.ForeignKey#getColumn()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Column();

  /**
   * Returns the meta object for the reference '{@link defaultname.ForeignKey#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see defaultname.ForeignKey#getReference()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Reference();

  /**
   * Returns the meta object for enum '{@link defaultname.RailsData <em>Rails Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rails Data</em>'.
   * @see defaultname.RailsData
   * @generated
   */
  EEnum getRailsData();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DefaultnameFactory getDefaultnameFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link defaultname.impl.DataBaseElementImpl <em>Data Base Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.impl.DataBaseElementImpl
     * @see defaultname.impl.DefaultnamePackageImpl#getDataBaseElement()
     * @generated
     */
    EClass DATA_BASE_ELEMENT = eINSTANCE.getDataBaseElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_BASE_ELEMENT__NAME = eINSTANCE.getDataBaseElement_Name();

    /**
     * The meta object literal for the '{@link defaultname.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.impl.SchemaImpl
     * @see defaultname.impl.DefaultnamePackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

    /**
     * The meta object literal for the '{@link defaultname.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.impl.TableImpl
     * @see defaultname.impl.DefaultnamePackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

    /**
     * The meta object literal for the '{@link defaultname.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.impl.ColumnImpl
     * @see defaultname.impl.DefaultnamePackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '{@link defaultname.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.impl.ForeignKeyImpl
     * @see defaultname.impl.DefaultnamePackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__COLUMN = eINSTANCE.getForeignKey_Column();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__REFERENCE = eINSTANCE.getForeignKey_Reference();

    /**
     * The meta object literal for the '{@link defaultname.RailsData <em>Rails Data</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see defaultname.RailsData
     * @see defaultname.impl.DefaultnamePackageImpl#getRailsData()
     * @generated
     */
    EEnum RAILS_DATA = eINSTANCE.getRailsData();

  }

} //DefaultnamePackage
