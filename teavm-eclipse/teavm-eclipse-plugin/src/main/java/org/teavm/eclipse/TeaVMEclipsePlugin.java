/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.eclipse;

import org.eclipse.core.runtime.Plugin;

/**
 *
 * @author Alexey Andreev <konsoletyper@gmail.com>
 */
public class TeaVMEclipsePlugin extends Plugin {
    public static final String ID = "org.teavm.eclipse";

    public static final String NATURE_ID = "org.teavm.eclipse.nature";

    private static TeaVMEclipsePlugin defaultInstance;

    static {
    }

    public TeaVMEclipsePlugin() {
        defaultInstance = this;
    }

    public static TeaVMEclipsePlugin getDefault() {
        return defaultInstance;
    }
}