/*
 * generated by Xtext 2.17.0
 */
package poc.rules.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import poc.rules.ruleLanguage.RuleLanguage

@ExtendWith(InjectionExtension)
@InjectWith(RuleLanguageInjectorProvider)
class RuleLanguageParsingTest {
	@Inject
	ParseHelper<RuleLanguage> parseHelper

	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
