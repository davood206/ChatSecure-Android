/*
 * Copyright (C) 2008 Esmertec AG. Copyright (C) 2008 The Android Open Source
 * Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package info.guardianproject.otr.app.im.plugin;

import java.util.Map;

public interface ImPlugin {
    /**
     * Gets a map of branding resources for the provider. The keys are defined
     * in {@link info.guardianproject.otr.app.im.plugin.BrandingResourceIDs}.
     * The values are the resource identifiers generated by the aapt tool.
     *
     * @return The map of branding resources.
     */
    Map<Integer, Integer> getResourceMap();

    /**
     * Gets the configuration for the provider. The keys MUST match the values
     * defined in {@link ImConfigNames} and {@link ImpsConfigNames}
     *
     * @return the configuration for the provider.
     */
    Map<String, String> getProviderConfig();
}
