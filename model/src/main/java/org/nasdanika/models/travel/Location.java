/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.Location#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.travel.TravelPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getLocation_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getChildren();

} // Location
