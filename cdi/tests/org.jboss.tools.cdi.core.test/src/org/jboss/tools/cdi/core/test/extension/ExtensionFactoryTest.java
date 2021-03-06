/*******************************************************************************
 * Copyright (c) 2012 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.cdi.core.test.extension;

import java.util.Set;

import org.jboss.tools.cdi.core.extension.CDIExtensionFactory;
import org.jboss.tools.cdi.core.extension.ICDIExtension;
import org.jboss.tools.cdi.core.extension.feature.IProcessAnnotatedTypeFeature;

import junit.framework.TestCase;

public class ExtensionFactoryTest extends TestCase {
	static String RUNTIME = "org.jboss.tools.cdi.core.fake.FakeExtension";
	static String IMPL = "org.jboss.tools.cdi.core.test.extension.CDIExtensionImpl";

	public void testExtensionFactory() throws Exception {
		Set<String> set = CDIExtensionFactory.getInstance().getExtensionClassesByRuntime(RUNTIME);
		assertTrue(set.contains(IMPL));
		ICDIExtension ext = CDIExtensionFactory.getInstance().createExtensionInstance(IMPL);
		Set<Class<?>> fs = CDIExtensionFactory.getInstance().getFeatures(ext);
		assertTrue(fs.contains(IProcessAnnotatedTypeFeature.class));
	}

}
