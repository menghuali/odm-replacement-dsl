/*
 * generated by Xtext 2.17.0
 */
package poc.rules.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import poc.rules.services.RuleLanguageGrammarAccess;

@SuppressWarnings("all")
public class RuleLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RuleLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BookingCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_BookingCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q;
	protected AbstractElementAlias match_BookingCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q;
	protected AbstractElementAlias match_ECondition_LeftParenthesisKeyword_1_q;
	protected AbstractElementAlias match_ECondition_NotKeyword_2_q;
	protected AbstractElementAlias match_ECondition_RightParenthesisKeyword_4_q;
	protected AbstractElementAlias match_ECondition___AndKeyword_0_0_or_OrKeyword_0_1__q;
	protected AbstractElementAlias match_FlightCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_FlightCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q;
	protected AbstractElementAlias match_FlightCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q;
	protected AbstractElementAlias match_GuestCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_GuestCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q;
	protected AbstractElementAlias match_GuestCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q;
	protected AbstractElementAlias match_NotificationCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_NotificationCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q;
	protected AbstractElementAlias match_NotificationCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q;
	protected AbstractElementAlias match_Rule_ElseKeyword_6_0_q;
	protected AbstractElementAlias match_Rule_WhenKeyword_3_0_q;
	protected AbstractElementAlias match_TripCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_TripCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q;
	protected AbstractElementAlias match_TripCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RuleLanguageGrammarAccess) access;
		match_BookingCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getOrKeyword_3_0_1()));
		match_BookingCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getOperatorParserRuleCall_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getVALUEParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getVALUESParserRuleCall_2_1_1())));
		match_BookingCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getOperatorParserRuleCall_3_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getVALUEParserRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getBookingConditionAccess().getVALUESParserRuleCall_3_2_1_1())));
		match_ECondition_LeftParenthesisKeyword_1_q = new TokenAlias(false, true, grammarAccess.getEConditionAccess().getLeftParenthesisKeyword_1());
		match_ECondition_NotKeyword_2_q = new TokenAlias(false, true, grammarAccess.getEConditionAccess().getNotKeyword_2());
		match_ECondition_RightParenthesisKeyword_4_q = new TokenAlias(false, true, grammarAccess.getEConditionAccess().getRightParenthesisKeyword_4());
		match_ECondition___AndKeyword_0_0_or_OrKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getEConditionAccess().getAndKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEConditionAccess().getOrKeyword_0_1()));
		match_FlightCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getOrKeyword_3_0_1()));
		match_FlightCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getOperatorParserRuleCall_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getVALUEParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getVALUESParserRuleCall_2_1_1())));
		match_FlightCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getOperatorParserRuleCall_3_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getVALUEParserRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getFlightConditionAccess().getVALUESParserRuleCall_3_2_1_1())));
		match_GuestCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getOrKeyword_3_0_1()));
		match_GuestCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getOperatorParserRuleCall_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getVALUEParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getVALUESParserRuleCall_2_1_1())));
		match_GuestCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getOperatorParserRuleCall_3_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getVALUEParserRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getGuestConditionAccess().getVALUESParserRuleCall_3_2_1_1())));
		match_NotificationCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getOrKeyword_3_0_1()));
		match_NotificationCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getOperatorParserRuleCall_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getVALUEParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getVALUESParserRuleCall_2_1_1())));
		match_NotificationCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getOperatorParserRuleCall_3_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getVALUEParserRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getNotificationConditionAccess().getVALUESParserRuleCall_3_2_1_1())));
		match_Rule_ElseKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getRuleAccess().getElseKeyword_6_0());
		match_Rule_WhenKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getRuleAccess().getWhenKeyword_3_0());
		match_TripCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getOrKeyword_3_0_1()));
		match_TripCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getOperatorParserRuleCall_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getVALUEParserRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getVALUESParserRuleCall_2_1_1())));
		match_TripCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getOperatorParserRuleCall_3_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getVALUEParserRuleCall_3_2_1_0()), new TokenAlias(false, false, grammarAccess.getTripConditionAccess().getVALUESParserRuleCall_3_2_1_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getOperatorToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVALUERule())
			return getVALUEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVALUESRule())
			return getVALUESToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Operator:
	 * 	('==' | '<=' | '>=' | 'in' | 'contain');
	 */
	protected String getOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "==";
	}
	
	/**
	 * VALUE:
	 * 	INT | STRING | 'true' | 'false';
	 */
	protected String getVALUEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * VALUES:
	 * 	'(' VALUE (',' VALUE)* ')';
	 */
	protected String getVALUESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "()";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BookingCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_BookingCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BookingCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q.equals(syntax))
				emit_BookingCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_BookingCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q.equals(syntax))
				emit_BookingCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECondition_LeftParenthesisKeyword_1_q.equals(syntax))
				emit_ECondition_LeftParenthesisKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECondition_NotKeyword_2_q.equals(syntax))
				emit_ECondition_NotKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECondition_RightParenthesisKeyword_4_q.equals(syntax))
				emit_ECondition_RightParenthesisKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ECondition___AndKeyword_0_0_or_OrKeyword_0_1__q.equals(syntax))
				emit_ECondition___AndKeyword_0_0_or_OrKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FlightCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_FlightCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FlightCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q.equals(syntax))
				emit_FlightCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FlightCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q.equals(syntax))
				emit_FlightCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GuestCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_GuestCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GuestCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q.equals(syntax))
				emit_GuestCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GuestCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q.equals(syntax))
				emit_GuestCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NotificationCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_NotificationCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NotificationCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q.equals(syntax))
				emit_NotificationCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NotificationCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q.equals(syntax))
				emit_NotificationCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Rule_ElseKeyword_6_0_q.equals(syntax))
				emit_Rule_ElseKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Rule_WhenKeyword_3_0_q.equals(syntax))
				emit_Rule_WhenKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TripCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_TripCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TripCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q.equals(syntax))
				emit_TripCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TripCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q.equals(syntax))
				emit_TripCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[BookingPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) method+=[BookingPhrase|ID]
	 */
	protected void emit_BookingCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[BookingPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[BookingPhrase|ID] (ambiguity) ('and' | 'or') method+=[BookingPhrase|ID]
	 *     method+=[BookingPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_BookingCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[BookingPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[BookingPhrase|ID] (ambiguity) ('and' | 'or') method+=[BookingPhrase|ID]
	 *     method+=[BookingPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_BookingCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('And' | 'Or')? (ambiguity) 'Not'? 'booking' method+=[BookingPhrase|ID]
	 *     (rule start) ('And' | 'Or')? (ambiguity) 'Not'? 'flight' method+=[FlightPhrase|ID]
	 *     (rule start) ('And' | 'Or')? (ambiguity) 'Not'? 'guest' method+=[GuestPhrase|ID]
	 *     (rule start) ('And' | 'Or')? (ambiguity) 'Not'? 'notification' method+=[NotificationPhrase|ID]
	 *     (rule start) ('And' | 'Or')? (ambiguity) 'Not'? 'trip' method+=[TripPhrase|ID]
	 */
	protected void emit_ECondition_LeftParenthesisKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Not'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('And' | 'Or')? '('? (ambiguity) 'booking' method+=[BookingPhrase|ID]
	 *     (rule start) ('And' | 'Or')? '('? (ambiguity) 'flight' method+=[FlightPhrase|ID]
	 *     (rule start) ('And' | 'Or')? '('? (ambiguity) 'guest' method+=[GuestPhrase|ID]
	 *     (rule start) ('And' | 'Or')? '('? (ambiguity) 'notification' method+=[NotificationPhrase|ID]
	 *     (rule start) ('And' | 'Or')? '('? (ambiguity) 'trip' method+=[TripPhrase|ID]
	 */
	protected void emit_ECondition_NotKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[BookingPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) (rule end)
	 *     method+=[FlightPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) (rule end)
	 *     method+=[GuestPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) (rule end)
	 *     method+=[NotificationPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) (rule end)
	 *     method+=[TripPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) (rule end)
	 */
	protected void emit_ECondition_RightParenthesisKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('And' | 'Or')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '('? 'Not'? 'booking' method+=[BookingPhrase|ID]
	 *     (rule start) (ambiguity) '('? 'Not'? 'flight' method+=[FlightPhrase|ID]
	 *     (rule start) (ambiguity) '('? 'Not'? 'guest' method+=[GuestPhrase|ID]
	 *     (rule start) (ambiguity) '('? 'Not'? 'notification' method+=[NotificationPhrase|ID]
	 *     (rule start) (ambiguity) '('? 'Not'? 'trip' method+=[TripPhrase|ID]
	 */
	protected void emit_ECondition___AndKeyword_0_0_or_OrKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[FlightPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) method+=[FlightPhrase|ID]
	 */
	protected void emit_FlightCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[FlightPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[FlightPhrase|ID] (ambiguity) ('and' | 'or') method+=[FlightPhrase|ID]
	 *     method+=[FlightPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_FlightCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[FlightPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[FlightPhrase|ID] (ambiguity) ('and' | 'or') method+=[FlightPhrase|ID]
	 *     method+=[FlightPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_FlightCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[GuestPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) method+=[GuestPhrase|ID]
	 */
	protected void emit_GuestCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[GuestPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[GuestPhrase|ID] (ambiguity) ('and' | 'or') method+=[GuestPhrase|ID]
	 *     method+=[GuestPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_GuestCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[GuestPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[GuestPhrase|ID] (ambiguity) ('and' | 'or') method+=[GuestPhrase|ID]
	 *     method+=[GuestPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_GuestCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[NotificationPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) method+=[NotificationPhrase|ID]
	 */
	protected void emit_NotificationCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[NotificationPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[NotificationPhrase|ID] (ambiguity) ('and' | 'or') method+=[NotificationPhrase|ID]
	 *     method+=[NotificationPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_NotificationCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[NotificationPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[NotificationPhrase|ID] (ambiguity) ('and' | 'or') method+=[NotificationPhrase|ID]
	 *     method+=[NotificationPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_NotificationCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Else'?
	 *
	 * This ambiguous syntax occurs at:
	 *     actions+=Action (ambiguity) (rule end)
	 *     conditions+=ECondition 'Then' (ambiguity) (rule end)
	 *     description=STRING 'When'? 'Then' (ambiguity) (rule end)
	 *     name=ID 'When'? 'Then' (ambiguity) (rule end)
	 */
	protected void emit_Rule_ElseKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'When'?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=STRING (ambiguity) 'Then' 'Else' actions+=Action
	 *     description=STRING (ambiguity) 'Then' 'Else'? (rule end)
	 *     description=STRING (ambiguity) 'Then' actions+=Action
	 *     name=ID (ambiguity) 'Then' 'Else' actions+=Action
	 *     name=ID (ambiguity) 'Then' 'Else'? (rule end)
	 *     name=ID (ambiguity) 'Then' actions+=Action
	 */
	protected void emit_Rule_WhenKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[TripPhrase|ID] (Operator (VALUE | VALUES))? (ambiguity) method+=[TripPhrase|ID]
	 */
	protected void emit_TripCondition_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[TripPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[TripPhrase|ID] (ambiguity) ('and' | 'or') method+=[TripPhrase|ID]
	 *     method+=[TripPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_TripCondition___OperatorParserRuleCall_2_0___VALUEParserRuleCall_2_1_0_or_VALUESParserRuleCall_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (Operator (VALUE | VALUES))?
	 *
	 * This ambiguous syntax occurs at:
	 *     method+=[TripPhrase|ID] (ambiguity) ')'? (rule end)
	 *     method+=[TripPhrase|ID] (ambiguity) ('and' | 'or') method+=[TripPhrase|ID]
	 *     method+=[TripPhrase|ID] (ambiguity) (rule end)
	 */
	protected void emit_TripCondition___OperatorParserRuleCall_3_2_0___VALUEParserRuleCall_3_2_1_0_or_VALUESParserRuleCall_3_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
