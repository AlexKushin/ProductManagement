/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public Licence a published by the Free Software Foundation , either version 3 of the Licence , or (at your opinion) ant later version.
 *
 * This program is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY  or FITNESS FOR PRACTICAL PURPOSE. See the GNU General Public Licence for more details.
 *
 * You should have received a copy of the GNU General Public Licence along with this program. If not, see <http://www.gnu.org/licences/>.
 */

package labs.pm.data;

/**
 * @author kyshi
 **/
public class ProductManagerException extends Exception {

    public ProductManagerException() {
        super();
    }

    public ProductManagerException(String message) {
        super(message);
    }

    public ProductManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}
