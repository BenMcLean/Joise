/*
 * Copyright (C) 2013 Jason Taylor.
 * Released as open-source under the Apache License, Version 2.0.
 * 
 * ============================================================================
 * | Joise
 * ============================================================================
 * 
 * Copyright (C) 2013 Jason Taylor
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ============================================================================
 * | Accidental Noise Library
 * | --------------------------------------------------------------------------
 * | Joise is a derivative work based on Josua Tippetts' C++ library:
 * | http://accidentalnoise.sourceforge.net/index.html
 * ============================================================================
 * 
 * Copyright (C) 2011 Joshua Tippetts
 * 
 *   This software is provided 'as-is', without any express or implied
 *   warranty.  In no event will the authors be held liable for any damages
 *   arising from the use of this software.
 * 
 *   Permission is granted to anyone to use this software for any purpose,
 *   including commercial applications, and to alter it and redistribute it
 *   freely, subject to the following restrictions:
 * 
 *   1. The origin of this software must not be misrepresented; you must not
 *      claim that you wrote the original software. If you use this software
 *      in a product, an acknowledgment in the product documentation would be
 *      appreciated but is not required.
 *   2. Altered source versions must be plainly marked as such, and must not be
 *      misrepresented as being the original software.
 *   3. This notice may not be removed or altered from any source distribution.
 */

package com.sudoplay.joise.mapping;

public enum MappingMode {
    NORMAL, SEAMLESS_X, SEAMLESS_Y, SEAMLESS_Z, SEAMLESS_XY, SEAMLESS_XZ, SEAMLESS_YZ, SEAMLESS_XYZ;

    public String toString() {
        return toString(this);
    }

    public static String toString(MappingMode mappingMode) {
        switch (mappingMode) {
            case NORMAL:
                return "NORMAL";
            case SEAMLESS_X:
                return "SEAMLESS_X";
            case SEAMLESS_Y:
                return "SEAMLESS_Y";
            case SEAMLESS_Z:
                return "SEAMLESS_Z";
            case SEAMLESS_XY:
                return "SEAMLESS_XY";
            case SEAMLESS_XZ:
                return "SEAMLESS_XZ";
            case SEAMLESS_YZ:
                return "SEAMLESS_YZ";
            case SEAMLESS_XYZ:
                return "SEAMLESS_XYZ";
        }
        throw (new UnsupportedOperationException());
    }

    public static MappingMode get(String string) {
        if (string.equalsIgnoreCase("NORMAL")) return NORMAL;
        if (string.equalsIgnoreCase("SEAMLESS_X")) return SEAMLESS_X;
        if (string.equalsIgnoreCase("SEAMLESS_Y")) return SEAMLESS_Y;
        if (string.equalsIgnoreCase("SEAMLESS_Z")) return SEAMLESS_Z;
        if (string.equalsIgnoreCase("SEAMLESS_XY")) return SEAMLESS_XY;
        if (string.equalsIgnoreCase("SEAMLESS_XZ")) return SEAMLESS_XZ;
        if (string.equalsIgnoreCase("SEAMLESS_YZ")) return SEAMLESS_YZ;
        if (string.equalsIgnoreCase("SEAMLESS_XYZ")) return SEAMLESS_XYZ;
        throw (new UnsupportedOperationException());
    }
}
