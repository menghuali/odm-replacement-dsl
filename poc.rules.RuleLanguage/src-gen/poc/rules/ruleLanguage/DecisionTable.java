/**
 * generated by Xtext 2.17.0
 */
package poc.rules.ruleLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link poc.rules.ruleLanguage.DecisionTable#getName <em>Name</em>}</li>
 *   <li>{@link poc.rules.ruleLanguage.DecisionTable#getDescription <em>Description</em>}</li>
 *   <li>{@link poc.rules.ruleLanguage.DecisionTable#getConditions <em>Conditions</em>}</li>
 *   <li>{@link poc.rules.ruleLanguage.DecisionTable#getActions <em>Actions</em>}</li>
 *   <li>{@link poc.rules.ruleLanguage.DecisionTable#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable()
 * @model
 * @generated
 */
public interface DecisionTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link poc.rules.ruleLanguage.DecisionTable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link poc.rules.ruleLanguage.DecisionTable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link poc.rules.ruleLanguage.SimpleCondition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<SimpleCondition> getConditions();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link poc.rules.ruleLanguage.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

  /**
   * Returns the value of the '<em><b>Cells</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' attribute list.
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getDecisionTable_Cells()
   * @model unique="false"
   * @generated
   */
  EList<String> getCells();

} // DecisionTable
