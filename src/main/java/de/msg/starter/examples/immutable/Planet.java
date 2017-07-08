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
package de.msg.starter.examples.immutable;

/**
 * @author msg_starter
 *
 */
import java.util.Date;

/**
 * Planet is an immutable class, since there is no way to change its state after
 * construction.
 */
public final class Planet {

	/**
	 * A mutable object field. In this case, the state of this mutable field is
	 * to be changed only by this class. (In other cases, it makes perfect sense
	 * to allow the state of a field to be changed outside the native class;
	 * this is the case when a field acts as a "pointer" to an object created
	 * elsewhere.)
	 */
	private final Date fDateOfDiscovery;

	/**
	 * Final primitive data is always immutable.
	 */
	private final double fMass;

	/**
	 * An immutable object field. (String objects never change state.)
	 */
	private final String fName;

	// /**
	// * Returns a mutable object - likely bad style.
	// *
	// * The caller gets a direct reference to the internal field. This is
	// usually dangerous,
	// * since the Date object state can be changed both by this class and its
	// caller.
	// * That is, this class is no longer in complete control of fDate.
	// */
	// public Date getDateOfDiscovery() {
	// return fDateOfDiscovery;
	// }

	public Planet(final double aMass, final String aName,
			final Date aDateOfDiscovery) {
		this.fMass = aMass;
		this.fName = aName;
		// make a private copy of aDateOfDiscovery
		// this is the only way to keep the fDateOfDiscovery
		// field private, and shields this class from any changes that
		// the caller may make to the original aDateOfDiscovery object
		this.fDateOfDiscovery = new Date(aDateOfDiscovery.getTime());
	}

	// PRIVATE

	/**
	 * Returns a mutable object - good style.
	 *
	 * Returns a defensive copy of the field. The caller of this method can do
	 * anything they want with the returned Date object, without affecting the
	 * internals of this class in any way. Why? Because they do not have a
	 * reference to fDate. Rather, they are playing with a second Date that
	 * initially has the same data as fDate.
	 */
	public Date getDateOfDiscovery() {
		return new Date(this.fDateOfDiscovery.getTime());
	}

	/**
	 * Returns a primitive value.
	 *
	 * The caller can do whatever they want with the return value, without
	 * affecting the internals of this class. Why? Because this is a primitive
	 * value. The caller sees its "own" double that simply has the same value as
	 * fMass.
	 */
	public double getMass() {
		return this.fMass;
	}

	/**
	 * Returns an immutable object.
	 *
	 * The caller gets a direct reference to the internal field. But this is not
	 * dangerous, since String is immutable and cannot be changed.
	 */
	public String getName() {
		return this.fName;
	}
}
