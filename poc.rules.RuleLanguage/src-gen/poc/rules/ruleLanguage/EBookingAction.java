/**
 * generated by Xtext 2.17.0
 */
package poc.rules.ruleLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBooking Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link poc.rules.ruleLanguage.EBookingAction#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see poc.rules.ruleLanguage.RuleLanguagePackage#getEBookingAction()
 * @model
 * @generated
 */
public interface EBookingAction extends Action
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference list.
   * The list contents are of type {@link poc.rules.ruleLanguage.BookingAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference list.
   * @see poc.rules.ruleLanguage.RuleLanguagePackage#getEBookingAction_Method()
   * @model
   * @generated
   */
  EList<BookingAction> getMethod();

} // EBookingAction