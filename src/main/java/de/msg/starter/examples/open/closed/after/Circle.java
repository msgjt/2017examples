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
package de.msg.starter.examples.open.closed.after;

/**
 * Represents a circle.
 *
 * @author msg_starter
 *
 */
public class Circle implements Shape {
	private double radius;

	/**
	 * @param radius
	 */
	public Circle(final double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double area() {
		return this.getRadius() * this.getRadius() * Math.PI;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(final double radius) {
		this.radius = radius;
	}

}
