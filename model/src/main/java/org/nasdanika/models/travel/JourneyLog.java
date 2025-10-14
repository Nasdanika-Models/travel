/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.JourneyLog#getJourneys <em>Journeys</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.travel.TravelPackage#getJourneyLog()
 * @model
 * @generated
 */
public interface JourneyLog extends DocumentedNamedElement, Directory {
	/**
	 * Returns the value of the '<em><b>Journeys</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Journey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journeys</em>' containment reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getJourneyLog_Journeys()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Journey> getJourneys();

} // JourneyLog
