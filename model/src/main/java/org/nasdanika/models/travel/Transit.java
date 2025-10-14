/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.Transit#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.Transit#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.Transit#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.Transit#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.travel.TravelPackage#getTransit()
 * @model
 * @generated
 */
public interface Transit extends DocumentedNamedStringIdentity, Period {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Location)
	 * @see org.nasdanika.models.travel.TravelPackage#getTransit_Origin()
	 * @model required="true"
	 * @generated
	 */
	Location getOrigin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.travel.Transit#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Location value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Location)
	 * @see org.nasdanika.models.travel.TravelPackage#getTransit_Destination()
	 * @model
	 * @generated
	 */
	Location getDestination();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.travel.Transit#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Location value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Transit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getTransit_Segments()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Transit> getSegments();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.travel.Traveler}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.travel.Traveler#getTransits <em>Transits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.travel.TravelPackage#getTransit_Participants()
	 * @see org.nasdanika.models.travel.Traveler#getTransits
	 * @model opposite="transits"
	 * @generated
	 */
	EList<Traveler> getParticipants();

} // Transit
