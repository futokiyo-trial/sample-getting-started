/*******************************************************************************
 * Copyright (c) 2017, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/

package io.openliberty.sample.system;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.github.futokiyo.jougai.Edomae;

@ApplicationScoped
public class SystemConfig {

  @Inject
  @ConfigProperty(name = "io_openliberty_sample_system_inMaintenance")
  Provider<Boolean> inMaintenance;


  public boolean isInMaintenance() {
  	System.out.println("SystemConfig#isInMaintenance() start");
  	Edomae edomae = new Edomae();
  	edomae.hello();
  	System.out.println("SystemConfig#isInMaintenance() end");
    return inMaintenance.get();
  }
}
