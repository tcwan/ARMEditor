/*
 * generated by Xtext
 */
package org.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.ui.internal.ARMActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ARMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ARMActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ARMActivator.getInstance().getInjector(ARMActivator.ORG_XTEXT_ARM);
	}
	
}
