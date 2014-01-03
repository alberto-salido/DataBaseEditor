/**
 */
package defaultname.util;

import defaultname.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnamePackage
 * @generated
 */
public class DefaultnameValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final DefaultnameValidator INSTANCE = new DefaultnameValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "defaultname";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultnameValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return DefaultnamePackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case DefaultnamePackage.DATA_BASE_ELEMENT:
        return validateDataBaseElement((DataBaseElement)value, diagnostics, context);
      case DefaultnamePackage.SCHEMA:
        return validateSchema((Schema)value, diagnostics, context);
      case DefaultnamePackage.TABLE:
        return validateTable((Table)value, diagnostics, context);
      case DefaultnamePackage.COLUMN:
        return validateColumn((Column)value, diagnostics, context);
      case DefaultnamePackage.FOREIGN_KEY:
        return validateForeignKey((ForeignKey)value, diagnostics, context);
      case DefaultnamePackage.RAILS_DATA:
        return validateRailsData((RailsData)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataBaseElement(DataBaseElement dataBaseElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(dataBaseElement, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_nameEmpty(dataBaseElement, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_illegalName(dataBaseElement, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the nameEmpty constraint of '<em>Data Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DATA_BASE_ELEMENT__NAME_EMPTY__EEXPRESSION = "not (self.name\n" +
    "\t\t\t->isEmpty())";

  /**
   * Validates the nameEmpty constraint of '<em>Data Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataBaseElement_nameEmpty(DataBaseElement dataBaseElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.DATA_BASE_ELEMENT,
         dataBaseElement,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "nameEmpty",
         DATA_BASE_ELEMENT__NAME_EMPTY__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the illegalName constraint of '<em>Data Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DATA_BASE_ELEMENT__ILLEGAL_NAME__EEXPRESSION = "Sequence{1 .. self.name.size()}\n" +
    "\t\t\t->collect(i | self.name.substring(i, i))\n" +
    "\t\t\t->excludes(' ')";

  /**
   * Validates the illegalName constraint of '<em>Data Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDataBaseElement_illegalName(DataBaseElement dataBaseElement, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.DATA_BASE_ELEMENT,
         dataBaseElement,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "illegalName",
         DATA_BASE_ELEMENT__ILLEGAL_NAME__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(schema, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_nameEmpty(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_illegalName(schema, diagnostics, context);
    if (result || diagnostics != null) result &= validateSchema_tableNameUnique(schema, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the tableNameUnique constraint of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String SCHEMA__TABLE_NAME_UNIQUE__EEXPRESSION = "self.tables\n" +
    "\t\t\t->isUnique(name.toUpperCase())";

  /**
   * Validates the tableNameUnique constraint of '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSchema_tableNameUnique(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.SCHEMA,
         schema,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "tableNameUnique",
         SCHEMA__TABLE_NAME_UNIQUE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_nameEmpty(table, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_illegalName(table, diagnostics, context);
    if (result || diagnostics != null) result &= validateTable_noIdName(table, diagnostics, context);
    if (result || diagnostics != null) result &= validateTable_columnNameUnique(table, diagnostics, context);
    if (result || diagnostics != null) result &= validateTable_cycleForeignKey(table, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the noIdName constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TABLE__NO_ID_NAME__EEXPRESSION = "not (self.columns\n" +
    "\t\t\t->exists(name.toUpperCase() = 'id'.toUpperCase()))";

  /**
   * Validates the noIdName constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTable_noIdName(Table table, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.TABLE,
         table,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "noIdName",
         TABLE__NO_ID_NAME__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the columnNameUnique constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TABLE__COLUMN_NAME_UNIQUE__EEXPRESSION = "self.columns\n" +
    "\t\t\t->isUnique(name.toUpperCase())";

  /**
   * Validates the columnNameUnique constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTable_columnNameUnique(Table table, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.TABLE,
         table,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "columnNameUnique",
         TABLE__COLUMN_NAME_UNIQUE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the cycleForeignKey constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TABLE__CYCLE_FOREIGN_KEY__EEXPRESSION = "not(self.foreignKeys\n" +
    "\t\t\t->notEmpty() and self.foreignKeys\n" +
    "\t\t\t->exists(reference.name = self.name))";

  /**
   * Validates the cycleForeignKey constraint of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTable_cycleForeignKey(Table table, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.TABLE,
         table,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "cycleForeignKey",
         TABLE__CYCLE_FOREIGN_KEY__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(column, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(column, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(column, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_nameEmpty(column, diagnostics, context);
    if (result || diagnostics != null) result &= validateDataBaseElement_illegalName(column, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(foreignKey, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(foreignKey, diagnostics, context);
    if (result || diagnostics != null) result &= validateForeignKey_sameTypeAtLink(foreignKey, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the sameTypeAtLink constraint of '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String FOREIGN_KEY__SAME_TYPE_AT_LINK__EEXPRESSION = "self.column.type = self.reference.primaryKey.type";

  /**
   * Validates the sameTypeAtLink constraint of '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateForeignKey_sameTypeAtLink(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (DefaultnamePackage.Literals.FOREIGN_KEY,
         foreignKey,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "sameTypeAtLink",
         FOREIGN_KEY__SAME_TYPE_AT_LINK__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRailsData(RailsData railsData, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //DefaultnameValidator
