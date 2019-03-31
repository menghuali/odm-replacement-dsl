/**
 * generated by Xtext 2.17.0
 */
package poc.rules.ruleLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import poc.rules.ruleLanguage.ETripAction;
import poc.rules.ruleLanguage.RuleLanguagePackage;
import poc.rules.ruleLanguage.TripAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETrip Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link poc.rules.ruleLanguage.impl.ETripActionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETripActionImpl extends ActionImpl implements ETripAction
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<TripAction> method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETripActionImpl()
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
    return RuleLanguagePackage.Literals.ETRIP_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TripAction> getMethod()
  {
    if (method == null)
    {
      method = new EObjectResolvingEList<TripAction>(TripAction.class, this, RuleLanguagePackage.ETRIP_ACTION__METHOD);
    }
    return method;
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
      case RuleLanguagePackage.ETRIP_ACTION__METHOD:
        return getMethod();
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
      case RuleLanguagePackage.ETRIP_ACTION__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends TripAction>)newValue);
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
      case RuleLanguagePackage.ETRIP_ACTION__METHOD:
        getMethod().clear();
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
      case RuleLanguagePackage.ETRIP_ACTION__METHOD:
        return method != null && !method.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ETripActionImpl
