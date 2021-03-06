/**
 * generated by Xtext 2.17.0
 */
package poc.rules.ruleLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link poc.rules.ruleLanguage.FlightPhrase#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see poc.rules.ruleLanguage.RuleLanguagePackage#getFlightPhrase()
 * @model
 * @generated
 */
public interface FlightPhrase extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getFlightPhrase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link poc.rules.ruleLanguage.FlightPhrase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FlightPhrase
