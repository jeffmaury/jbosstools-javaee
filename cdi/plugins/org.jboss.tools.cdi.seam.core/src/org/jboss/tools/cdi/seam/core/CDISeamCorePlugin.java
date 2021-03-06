/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.cdi.seam.core;

import org.jboss.tools.common.log.BaseUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author Alexey Kazakov
 */
public class CDISeamCorePlugin extends BaseUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.jboss.tools.cdi.seam.core"; //$NON-NLS-1$

	// Seam 3 International Module Runtime Extension ID
	public static final String CDI_INTERNATIONAL_RUNTIME_EXTENTION = "org.jboss.seam.international.status.TypedStatusMessageBundleExtension";

	// The shared instance
	private static CDISeamCorePlugin plugin;
	
	/**
	 * The constructor
	 */
	public CDISeamCorePlugin() {
		plugin = this;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static CDISeamCorePlugin getDefault() {
		return plugin;
	}
}