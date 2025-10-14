/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.Directory#getTravelers <em>Travelers</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.Directory#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.travel.TravelPackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Travelers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Traveler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travelers</em>' containment reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getDirectory_Travelers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Traveler> getTravelers();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getDirectory_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // Directory
