/**
 *
 * $Id$
 */
package RoleteWheel.validation;

import RoleteWheel.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RoleteWheel.Root}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RootValidator {
	boolean validate();

	boolean validateWheel(EList<Double> value);
	boolean validateFeatures(EList<Feature> value);
	boolean validateDenominatorP(double value);
	boolean validateName(String value);
}