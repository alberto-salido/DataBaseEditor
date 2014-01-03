/**
 */
package database.impl;

import database.Column;
import database.DatabasePackage;
import database.ForeignKey;
import database.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link database.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link database.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link database.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends DataBaseElementImpl implements Table
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected Column primaryKey;

  /**
   * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKeys()
   * @generated
   * @ordered
   */
  protected EList<ForeignKey> foreignKeys;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DatabasePackage.Literals.TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, DatabasePackage.TABLE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column getPrimaryKey()
  {
    if (primaryKey != null && primaryKey.eIsProxy())
    {
      InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
      primaryKey = (Column)eResolveProxy(oldPrimaryKey);
      if (primaryKey != oldPrimaryKey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
      }
    }
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column basicGetPrimaryKey()
  {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKey(Column newPrimaryKey)
  {
    Column oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForeignKey> getForeignKeys()
  {
    if (foreignKeys == null)
    {
      foreignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, DatabasePackage.TABLE__FOREIGN_KEYS);
    }
    return foreignKeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DatabasePackage.TABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case DatabasePackage.TABLE__FOREIGN_KEYS:
        return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DatabasePackage.TABLE__COLUMNS:
        return getColumns();
      case DatabasePackage.TABLE__PRIMARY_KEY:
        if (resolve) return getPrimaryKey();
        return basicGetPrimaryKey();
      case DatabasePackage.TABLE__FOREIGN_KEYS:
        return getForeignKeys();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DatabasePackage.TABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case DatabasePackage.TABLE__PRIMARY_KEY:
        setPrimaryKey((Column)newValue);
        return;
      case DatabasePackage.TABLE__FOREIGN_KEYS:
        getForeignKeys().clear();
        getForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DatabasePackage.TABLE__COLUMNS:
        getColumns().clear();
        return;
      case DatabasePackage.TABLE__PRIMARY_KEY:
        setPrimaryKey((Column)null);
        return;
      case DatabasePackage.TABLE__FOREIGN_KEYS:
        getForeignKeys().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DatabasePackage.TABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
      case DatabasePackage.TABLE__PRIMARY_KEY:
        return primaryKey != null;
      case DatabasePackage.TABLE__FOREIGN_KEYS:
        return foreignKeys != null && !foreignKeys.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TableImpl
