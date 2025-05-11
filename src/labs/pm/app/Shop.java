/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public Licence as
 * published by the Free Software Foundation , either version 3 of
 * the Licence , or (at your opinion) ant later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY  or FITNESS FOR PRACTICAL PURPOSE. See the
 * GNU General Public Licence for more details.
 *
 * You should have received a copy of the GNU General Public
 * Licence along with this program. If not, see
 * <http://www.gnu.org/licences/>.
 */
package labs.pm.app;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author kyshi
 **/

import labs.pm.data.*;


public class Shop {
    public static void main(String[] args) {
        ProductManager pm = ProductManager.getInstance();
        pm.printProductReport(101, "en-GB");
        pm.printProductReport(103, "en-GB");
        pm.printProductReport(103, "en-GB");
    }
}