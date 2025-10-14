/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.party.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traveler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.Traveler#getTransits <em>Transits</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.travel.TravelPackage#getTraveler()
 * @model
 * @generated
 */
public interface Traveler extends Person {

	/**
	 * Returns the value of the '<em><b>Transits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Transit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.travel.Transit#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transits</em>' reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getTraveler_Transits()
	 * @see org.nasdanika.models.travel.Transit#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Transit> getTransits();
} // Traveler
