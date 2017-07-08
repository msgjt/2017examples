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
package de.msg.starter.examples.strings;

/**
 * @author msg_starter
 *
 */
public class StringExample {
	public static void main(final String[] args) {
		final String s1 = "Hello"; // String literal
		final String s2 = "Hello"; // String literal
		final String s3 = s1; // same reference
		final String s4 = new String("Hello"); // String object
		final String s5 = new String("Hello"); // String object

		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
	}
}
