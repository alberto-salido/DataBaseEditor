/**
 */
package database.impl;

import database.Column;
import database.DataBaseElement;
import database.DatabaseFactory;
import database.DatabasePackage;
import database.ForeignKey;
import database.RailsData;
import database.Schema;
import database.Table;

import database.util.DatabaseValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabasePackageImpl extends EPackageImpl implements DatabasePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataBaseElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreignKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum railsDataEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see database.DatabasePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DatabasePackageImpl()
  {
    super(eNS_URI, DatabaseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DatabasePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DatabasePackage init()
  {
    if (isInited) return (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);

    // Obtain or create and register package
    DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatabasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatabasePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDatabasePackage.createPackageContents();

    // Initialize created meta-data
    theDatabasePackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theDatabasePackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return DatabaseValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theDatabasePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DatabasePackage.eNS_URI, theDatabasePackage);
    return theDatabasePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataBaseElement()
  {
    return dataBaseElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataBaseElement_Name()
  {
    return (EAttribute)dataBaseElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchema()
  {
    return schemaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchema_Tables()
  {
    return (EReference)schemaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTable()
  {
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Columns()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_PrimaryKey()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_ForeignKeys()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumn()
  {
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumn_Type()
  {
    return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeignKey()
  {
    return foreignKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignKey_Column()
  {
    return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignKey_Reference()
  {
    return (EReference)foreignKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRailsData()
  {
    return railsDataEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseFactory getDatabaseFactory()
  {
    return (DatabaseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dataBaseElementEClass = createEClass(DATA_BASE_ELEMENT);
    createEAttribute(dataBaseElementEClass, DATA_BASE_ELEMENT__NAME);

    schemaEClass = createEClass(SCHEMA);
    createEReference(schemaEClass, SCHEMA__TABLES);

    tableEClass = createEClass(TABLE);
    createEReference(tableEClass, TABLE__COLUMNS);
    createEReference(tableEClass, TABLE__PRIMARY_KEY);
    createEReference(tableEClass, TABLE__FOREIGN_KEYS);

    columnEClass = createEClass(COLUMN);
    createEAttribute(columnEClass, COLUMN__TYPE);

    foreignKeyEClass = createEClass(FOREIGN_KEY);
    createEReference(foreignKeyEClass, FOREIGN_KEY__COLUMN);
    createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCE);

    // Create enums
    railsDataEEnum = createEEnum(RAILS_DATA);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    schemaEClass.getESuperTypes().add(this.getDataBaseElement());
    tableEClass.getESuperTypes().add(this.getDataBaseElement());
    columnEClass.getESuperTypes().add(this.getDataBaseElement());

    // Initialize classes and features; add operations and parameters
    initEClass(dataBaseElementEClass, DataBaseElement.class, "DataBaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataBaseElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchema_Tables(), this.getTable(), null, "tables", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 1, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTable_PrimaryKey(), this.getColumn(), null, "primaryKey", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTable_ForeignKeys(), this.getForeignKey(), null, "foreignKeys", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumn_Type(), this.getRailsData(), "type", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForeignKey_Column(), this.getColumn(), null, "column", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignKey_Reference(), this.getTable(), null, "reference", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(railsDataEEnum, RailsData.class, "RailsData");
    addEEnumLiteral(railsDataEEnum, RailsData.BINARY);
    addEEnumLiteral(railsDataEEnum, RailsData.BOOLEAN);
    addEEnumLiteral(railsDataEEnum, RailsData.DATE);
    addEEnumLiteral(railsDataEEnum, RailsData.DATE_TIME);
    addEEnumLiteral(railsDataEEnum, RailsData.DECIMAL);
    addEEnumLiteral(railsDataEEnum, RailsData.FLOAT);
    addEEnumLiteral(railsDataEEnum, RailsData.INTEGER);
    addEEnumLiteral(railsDataEEnum, RailsData.STRING);
    addEEnumLiteral(railsDataEEnum, RailsData.TEXT);
    addEEnumLiteral(railsDataEEnum, RailsData.TIME);
    addEEnumLiteral(railsDataEEnum, RailsData.TIMESTAMP);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
    createPivotAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "foo"
       });														
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });		
    addAnnotation
      (dataBaseElementEClass, 
       source, 
       new String[] 
       {
       "constraints", "nameEmpty illegalName"
       });			
    addAnnotation
      (schemaEClass, 
       source, 
       new String[] 
       {
       "constraints", "tableNameUnique"
       });				
    addAnnotation
      (tableEClass, 
       source, 
       new String[] 
       {
       "constraints", "noIdName columnNameUnique cycleForeignKey"
       });						
    addAnnotation
      (foreignKeyEClass, 
       source, 
       new String[] 
       {
       "constraints", "sameTypeAtLink"
       });		
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createPivotAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
    addAnnotation
      (dataBaseElementEClass, 
       source, 
       new String[] 
       {
       "nameEmpty", "not (self.name\n\t\t\t->isEmpty())",
       "illegalName", "Sequence{1 .. self.name.size()}\n\t\t\t->collect(i | self.name.substring(i, i))\n\t\t\t->excludes(\' \')"
       });				
    addAnnotation
      (schemaEClass, 
       source, 
       new String[] 
       {
       "tableNameUnique", "self.tables\n\t\t\t->isUnique(name.toUpperCase())"
       });				
    addAnnotation
      (tableEClass, 
       source, 
       new String[] 
       {
       "noIdName", "not (self.columns\n\t\t\t->exists(name.toUpperCase() = \'id\'.toUpperCase()))",
       "columnNameUnique", "self.columns\n\t\t\t->isUnique(name.toUpperCase())",
       "cycleForeignKey", "not(self.foreignKeys\n\t\t\t->notEmpty() and self.foreignKeys\n\t\t\t->exists(reference.name = self.name))"
       });						
    addAnnotation
      (foreignKeyEClass, 
       source, 
       new String[] 
       {
       "sameTypeAtLink", "self.column.type = self.reference.primaryKey.type"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";							
    addAnnotation
      (schemaEClass, 
       source, 
       new String[] 
       {
       "foo", "foo"
       });									
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";										
    addAnnotation
      (tableEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Table",
       "tool.name", "Table",
       "border.color", "0,0,0",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });				
    addAnnotation
      (columnEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Column",
       "tool.name", "Column",
       "label", "name,type",
       "figure", "rectangle",
       "label.icon", "true",
       "label.pattern", "{0}:{1}"
       });			
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";												
    addAnnotation
      (getTable_Columns(), 
       source, 
       new String[] 
       {
       "layout", "list"
       });				
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";															
    addAnnotation
      (foreignKeyEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Foreign Key",
       "tool.name", "Foreign Key",
       "source", "column",
       "target", "reference",
       "target.decoration", "arrow"
       });	
  }

} //DatabasePackageImpl
