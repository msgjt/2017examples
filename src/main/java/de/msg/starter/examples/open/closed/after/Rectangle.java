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
 * Class which represents a rectangle.
 *
 * @author msg_starter
 *
 */
public class Rectangle implements Shape {
	private double height;
	private double width;

	/**
	 * @param height
	 * @param width
	 */
	public Rectangle(final double height, final double width) {
		super();
		this.height = height;
		this.width = width;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double area() {
		return this.getWidth() * this.getHeight();
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return this.width;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(final double height) {
		this.height = height;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(final double width) {
		this.width = width;
	}
}
