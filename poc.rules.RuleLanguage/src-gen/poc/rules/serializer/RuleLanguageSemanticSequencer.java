/*
 * generated by Xtext 2.17.0
 */
package poc.rules.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import poc.rules.ruleLanguage.BookingAction;
import poc.rules.ruleLanguage.BookingCondition;
import poc.rules.ruleLanguage.BookingPhrase;
import poc.rules.ruleLanguage.DecisionTable;
import poc.rules.ruleLanguage.EBookingAction;
import poc.rules.ruleLanguage.EFlightAction;
import poc.rules.ruleLanguage.EGuestAction;
import poc.rules.ruleLanguage.ENotificationAction;
import poc.rules.ruleLanguage.ETripAction;
import poc.rules.ruleLanguage.FlightAction;
import poc.rules.ruleLanguage.FlightCondition;
import poc.rules.ruleLanguage.FlightPhrase;
import poc.rules.ruleLanguage.GuestAction;
import poc.rules.ruleLanguage.GuestCondition;
import poc.rules.ruleLanguage.GuestPhrase;
import poc.rules.ruleLanguage.NotificationAction;
import poc.rules.ruleLanguage.NotificationCondition;
import poc.rules.ruleLanguage.NotificationPhrase;
import poc.rules.ruleLanguage.Rule;
import poc.rules.ruleLanguage.RuleLanguage;
import poc.rules.ruleLanguage.RuleLanguagePackage;
import poc.rules.ruleLanguage.RulePackage;
import poc.rules.ruleLanguage.TripAction;
import poc.rules.ruleLanguage.TripCondition;
import poc.rules.ruleLanguage.TripPhrase;
import poc.rules.services.RuleLanguageGrammarAccess;

@SuppressWarnings("all")
public class RuleLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RuleLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RuleLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RuleLanguagePackage.BOOKING_ACTION:
				sequence_BookingAction(context, (BookingAction) semanticObject); 
				return; 
			case RuleLanguagePackage.BOOKING_CONDITION:
				sequence_BookingCondition(context, (BookingCondition) semanticObject); 
				return; 
			case RuleLanguagePackage.BOOKING_PHRASE:
				sequence_BookingPhrase(context, (BookingPhrase) semanticObject); 
				return; 
			case RuleLanguagePackage.DECISION_TABLE:
				sequence_DecisionTable(context, (DecisionTable) semanticObject); 
				return; 
			case RuleLanguagePackage.EBOOKING_ACTION:
				sequence_EBookingAction(context, (EBookingAction) semanticObject); 
				return; 
			case RuleLanguagePackage.EFLIGHT_ACTION:
				sequence_EFlightAction(context, (EFlightAction) semanticObject); 
				return; 
			case RuleLanguagePackage.EGUEST_ACTION:
				sequence_EGuestAction(context, (EGuestAction) semanticObject); 
				return; 
			case RuleLanguagePackage.ENOTIFICATION_ACTION:
				sequence_ENotificationAction(context, (ENotificationAction) semanticObject); 
				return; 
			case RuleLanguagePackage.ETRIP_ACTION:
				sequence_ETripAction(context, (ETripAction) semanticObject); 
				return; 
			case RuleLanguagePackage.FLIGHT_ACTION:
				sequence_FlightAction(context, (FlightAction) semanticObject); 
				return; 
			case RuleLanguagePackage.FLIGHT_CONDITION:
				sequence_FlightCondition(context, (FlightCondition) semanticObject); 
				return; 
			case RuleLanguagePackage.FLIGHT_PHRASE:
				sequence_FlightPhrase(context, (FlightPhrase) semanticObject); 
				return; 
			case RuleLanguagePackage.GUEST_ACTION:
				sequence_GuestAction(context, (GuestAction) semanticObject); 
				return; 
			case RuleLanguagePackage.GUEST_CONDITION:
				sequence_GuestCondition(context, (GuestCondition) semanticObject); 
				return; 
			case RuleLanguagePackage.GUEST_PHRASE:
				sequence_GuestPhrase(context, (GuestPhrase) semanticObject); 
				return; 
			case RuleLanguagePackage.NOTIFICATION_ACTION:
				sequence_NotificationAction(context, (NotificationAction) semanticObject); 
				return; 
			case RuleLanguagePackage.NOTIFICATION_CONDITION:
				sequence_NotificationCondition(context, (NotificationCondition) semanticObject); 
				return; 
			case RuleLanguagePackage.NOTIFICATION_PHRASE:
				sequence_NotificationPhrase(context, (NotificationPhrase) semanticObject); 
				return; 
			case RuleLanguagePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case RuleLanguagePackage.RULE_LANGUAGE:
				sequence_RuleLanguage(context, (RuleLanguage) semanticObject); 
				return; 
			case RuleLanguagePackage.RULE_PACKAGE:
				sequence_RulePackage(context, (RulePackage) semanticObject); 
				return; 
			case RuleLanguagePackage.TRIP_ACTION:
				sequence_TripAction(context, (TripAction) semanticObject); 
				return; 
			case RuleLanguagePackage.TRIP_CONDITION:
				sequence_TripCondition(context, (TripCondition) semanticObject); 
				return; 
			case RuleLanguagePackage.TRIP_PHRASE:
				sequence_TripPhrase(context, (TripPhrase) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Element returns BookingAction
	 *     BookingAction returns BookingAction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BookingAction(ISerializationContext context, BookingAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.BOOKING_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.BOOKING_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBookingActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ECondition returns BookingCondition
	 *     Condition returns BookingCondition
	 *     SimpleCondition returns BookingCondition
	 *     BookingCondition returns BookingCondition
	 *
	 * Constraint:
	 *     (method+=[BookingPhrase|ID] method+=[BookingPhrase|ID]*)
	 */
	protected void sequence_BookingCondition(ISerializationContext context, BookingCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns BookingPhrase
	 *     BookingPhrase returns BookingPhrase
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BookingPhrase(ISerializationContext context, BookingPhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.BOOKING_PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.BOOKING_PHRASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBookingPhraseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DecisionTable returns DecisionTable
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         conditions+=SimpleCondition 
	 *         conditions+=SimpleCondition* 
	 *         actions+=Action 
	 *         actions+=Action* 
	 *         (cells+=VALUE cells+=VALUE*)*
	 *     )
	 */
	protected void sequence_DecisionTable(ISerializationContext context, DecisionTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns EBookingAction
	 *     Action returns EBookingAction
	 *     EBookingAction returns EBookingAction
	 *
	 * Constraint:
	 *     (method+=[BookingAction|ID] (param+=VALUE | param+=VALUES)? (method+=[BookingAction|ID] (param+=VALUE | param+=VALUES)?)*)
	 */
	protected void sequence_EBookingAction(ISerializationContext context, EBookingAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns EFlightAction
	 *     Action returns EFlightAction
	 *     EFlightAction returns EFlightAction
	 *
	 * Constraint:
	 *     (method+=[FlightAction|ID] (param+=VALUE | param+=VALUES)? (method+=[FlightAction|ID] (param+=VALUE | param+=VALUES)?)*)
	 */
	protected void sequence_EFlightAction(ISerializationContext context, EFlightAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns EGuestAction
	 *     Action returns EGuestAction
	 *     EGuestAction returns EGuestAction
	 *
	 * Constraint:
	 *     (method+=[GuestAction|ID] (param+=VALUE | param+=VALUES)? (method+=[GuestAction|ID] (param+=VALUE | param+=VALUES)?)*)
	 */
	protected void sequence_EGuestAction(ISerializationContext context, EGuestAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ENotificationAction
	 *     Action returns ENotificationAction
	 *     ENotificationAction returns ENotificationAction
	 *
	 * Constraint:
	 *     (method+=[NotificationAction|ID] (param+=VALUE | param+=VALUES)? (method+=[NotificationAction|ID] (param+=VALUE | param+=VALUES)?)*)
	 */
	protected void sequence_ENotificationAction(ISerializationContext context, ENotificationAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ETripAction
	 *     Action returns ETripAction
	 *     ETripAction returns ETripAction
	 *
	 * Constraint:
	 *     (method+=[TripAction|ID] (param+=VALUE | param+=VALUES)? (method+=[TripAction|ID] (param+=VALUE | param+=VALUES)?)*)
	 */
	protected void sequence_ETripAction(ISerializationContext context, ETripAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns FlightAction
	 *     FlightAction returns FlightAction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FlightAction(ISerializationContext context, FlightAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.FLIGHT_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.FLIGHT_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlightActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ECondition returns FlightCondition
	 *     Condition returns FlightCondition
	 *     SimpleCondition returns FlightCondition
	 *     FlightCondition returns FlightCondition
	 *
	 * Constraint:
	 *     (method+=[FlightPhrase|ID] method+=[FlightPhrase|ID]*)
	 */
	protected void sequence_FlightCondition(ISerializationContext context, FlightCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns FlightPhrase
	 *     FlightPhrase returns FlightPhrase
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FlightPhrase(ISerializationContext context, FlightPhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.FLIGHT_PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.FLIGHT_PHRASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlightPhraseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns GuestAction
	 *     GuestAction returns GuestAction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_GuestAction(ISerializationContext context, GuestAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.GUEST_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.GUEST_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuestActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ECondition returns GuestCondition
	 *     Condition returns GuestCondition
	 *     SimpleCondition returns GuestCondition
	 *     GuestCondition returns GuestCondition
	 *
	 * Constraint:
	 *     (method+=[GuestPhrase|ID] method+=[GuestPhrase|ID]*)
	 */
	protected void sequence_GuestCondition(ISerializationContext context, GuestCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns GuestPhrase
	 *     GuestPhrase returns GuestPhrase
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_GuestPhrase(ISerializationContext context, GuestPhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.GUEST_PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.GUEST_PHRASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuestPhraseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns NotificationAction
	 *     NotificationAction returns NotificationAction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NotificationAction(ISerializationContext context, NotificationAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.NOTIFICATION_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.NOTIFICATION_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotificationActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ECondition returns NotificationCondition
	 *     Condition returns NotificationCondition
	 *     SimpleCondition returns NotificationCondition
	 *     NotificationCondition returns NotificationCondition
	 *
	 * Constraint:
	 *     (method+=[NotificationPhrase|ID] method+=[NotificationPhrase|ID]*)
	 */
	protected void sequence_NotificationCondition(ISerializationContext context, NotificationCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns NotificationPhrase
	 *     NotificationPhrase returns NotificationPhrase
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NotificationPhrase(ISerializationContext context, NotificationPhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.NOTIFICATION_PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.NOTIFICATION_PHRASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotificationPhraseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RuleLanguage returns RuleLanguage
	 *
	 * Constraint:
	 *     elements+=Element+
	 */
	protected void sequence_RuleLanguage(ISerializationContext context, RuleLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns RulePackage
	 *     RulePackage returns RulePackage
	 *
	 * Constraint:
	 *     (name=QualifiedName (elements+=Rule | elements+=DecisionTable)*)
	 */
	protected void sequence_RulePackage(ISerializationContext context, RulePackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (name=ID description=STRING? conditions+=ECondition* actions+=Action* actions+=Action*)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns TripAction
	 *     TripAction returns TripAction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TripAction(ISerializationContext context, TripAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.TRIP_ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.TRIP_ACTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTripActionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ECondition returns TripCondition
	 *     Condition returns TripCondition
	 *     SimpleCondition returns TripCondition
	 *     TripCondition returns TripCondition
	 *
	 * Constraint:
	 *     (method+=[TripPhrase|ID] method+=[TripPhrase|ID]*)
	 */
	protected void sequence_TripCondition(ISerializationContext context, TripCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns TripPhrase
	 *     TripPhrase returns TripPhrase
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TripPhrase(ISerializationContext context, TripPhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleLanguagePackage.Literals.TRIP_PHRASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleLanguagePackage.Literals.TRIP_PHRASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTripPhraseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
