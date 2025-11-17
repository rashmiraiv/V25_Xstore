// Copyright (c) 2004, 2025, Oracle and/or its affiliates. All rights reserved.
package dtv.dev.config;

import dtv.util.config.ConfigPathPropertySource;

/**
 * An extension of {@link ConfigPathPropertySource} that allows developers to place their config path
 * properties in a safe, non-production-affecting location where they will not have to worry about not
 * committing it. To make usage of this setting jvm parameter dev.configPath.properties.location needs to be
 * setup on launcher.
 *
 */
public class DevConfigPathPropertySource
    extends ConfigPathPropertySource {

  private static final String CONFIGURATION_PROPERTY_PATH = "dev.configPath.properties.location";

  @Override
  protected String getConfigPathPropertiesLocation() {
    return System.getProperties().getProperty(CONFIGURATION_PROPERTY_PATH);
  }
}
