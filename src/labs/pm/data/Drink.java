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
import java.time.LocalTime;

/**
 * @author kyshi
 **/
public class Drink extends Product {
    Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();

        return (now.isAfter(LocalTime.of(16, 30)) &&
                now.isBefore(LocalTime.of(18, 30)))
                ? super.getDiscount() : BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }
}
