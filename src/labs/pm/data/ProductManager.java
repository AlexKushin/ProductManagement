/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public Licence a published by the Free Software Foundation , either version 3 of the Licence , or (at your opinion) ant later version.
 *
 * This program is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY  or FITNESS FOR PRACTICAL PURPOSE. See the GNU General Public Licence for more details.
 *
 * You should have received a copy of the GNU General Public Licence along with this program. If not, see <http://www.gnu.org/licences/>.
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author kyshi
 **/
public class ProductManager {

    private Product product;
    private Review review;

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate destBefore) {
        product = new Food(id, name, price, rating, destBefore);
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        product = new Drink(id, name, price, rating);
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comment) {
        review = new Review(rating, comment);
        this.product = product.applyRating(rating);
        return this.product;
    }

    public void printProductReport() {
        StringBuilder txt = new StringBuilder();
        txt.append(product);
        txt.append("\n");
        if (review != null) {
            txt.append(review);
        } else {
            txt.append("Not reviewed");
        }
        txt.append("\n");
        System.out.println(txt);
    }
}
