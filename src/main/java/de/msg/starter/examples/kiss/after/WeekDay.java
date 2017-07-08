/**
 * This file is part of msg starter kit.

    msg starter kit is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with msg starter kit.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.msg.starter.examples.kiss.after;

/**
 * @author msg_starter
 *
 */
public class WeekDay {

	public String getName(final int dayOfWeek) {
		switch (dayOfWeek) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			throw new IllegalArgumentException(
					"dayOfWeek must be in range 1..7");
		}
	}

}
