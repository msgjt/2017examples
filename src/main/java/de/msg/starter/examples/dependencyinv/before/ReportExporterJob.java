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
package de.msg.starter.examples.dependencyinv.before;

/**
 * @author msg_starter
 *
 */
public class ReportExporterJob {

	private WorkingHoursReprotExporter exporter;

	public void doExport() {
		// ....
		this.exporter.export();
		// ...
	}

	/**
	 * @param exporter
	 *            the exporter to set
	 */
	public void setExporter(final WorkingHoursReprotExporter exporter) {
		this.exporter = exporter;
	}
}
