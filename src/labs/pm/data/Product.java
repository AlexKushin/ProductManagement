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

package labs.pm.data;
/**
 * {@code Product} class represents properties and behaviours of
 * product objects in the Product Management System
 * <br>
 * Each product has an id, name and price
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link DISCOUNT_RATE discount rate}
 *
 * @version 4.0
 * @author kyshi
 **/

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;
import static labs.pm.data.Rating.NOT_RATED;


public abstract class Product {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private final int id;
    private final String name;
    private final BigDecimal price;
    private final Rating rating;

    public Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


    /**
     * Calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     *
     * @return a {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public abstract Product applyRating(Rating rating);

    @Override
    public String toString() {
        return id + ", " + name + ", " + price
                + ", " + getDiscount() + ", " + rating.getStars();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //distinguish difference between types
        // if (o == null || getClass() != o.getClass()) return false;
        // Product product = (Product) o;

        //checks if objects have common superclass
        if (o instanceof Product product) {
            return id == product.id && Objects.equals(name, product.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

