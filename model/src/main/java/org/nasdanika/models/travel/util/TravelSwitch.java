/**
 */
package org.nasdanika.models.travel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;

import org.nasdanika.models.party.Party;
import org.nasdanika.models.party.Person;

import org.nasdanika.models.travel.*;

import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.travel.TravelPackage
 * @generated
 */
public class TravelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TravelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelSwitch() {
		if (modelPackage == null) {
			modelPackage = TravelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TravelPackage.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = caseDocumentedNamedStringIdentity(directory);
				if (result == null) result = caseDocumentedNamedElement(directory);
				if (result == null) result = caseStringIdentity(directory);
				if (result == null) result = caseNamedElement(directory);
				if (result == null) result = caseDocumented(directory);
				if (result == null) result = caseModelElement(directory);
				if (result == null) result = caseMarked(directory);
				if (result == null) result = caseAdaptable(directory);
				if (result == null) result = caseIMarked(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.JOURNEY_LOG: {
				JourneyLog journeyLog = (JourneyLog)theEObject;
				T result = caseJourneyLog(journeyLog);
				if (result == null) result = caseDirectory(journeyLog);
				if (result == null) result = caseNamedElement(journeyLog);
				if (result == null) result = caseDocumented(journeyLog);
				if (result == null) result = caseDocumentedNamedStringIdentity(journeyLog);
				if (result == null) result = caseDocumentedNamedElement(journeyLog);
				if (result == null) result = caseModelElement(journeyLog);
				if (result == null) result = caseStringIdentity(journeyLog);
				if (result == null) result = caseMarked(journeyLog);
				if (result == null) result = caseAdaptable(journeyLog);
				if (result == null) result = caseIMarked(journeyLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.TRANSIT: {
				Transit transit = (Transit)theEObject;
				T result = caseTransit(transit);
				if (result == null) result = caseDocumentedNamedStringIdentity(transit);
				if (result == null) result = casePeriod(transit);
				if (result == null) result = caseDocumentedNamedElement(transit);
				if (result == null) result = caseStringIdentity(transit);
				if (result == null) result = caseNamedElement(transit);
				if (result == null) result = caseDocumented(transit);
				if (result == null) result = caseModelElement(transit);
				if (result == null) result = caseMarked(transit);
				if (result == null) result = caseAdaptable(transit);
				if (result == null) result = caseIMarked(transit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.JOURNEY: {
				Journey journey = (Journey)theEObject;
				T result = caseJourney(journey);
				if (result == null) result = caseTransit(journey);
				if (result == null) result = caseDirectory(journey);
				if (result == null) result = caseDocumentedNamedStringIdentity(journey);
				if (result == null) result = casePeriod(journey);
				if (result == null) result = caseDocumentedNamedElement(journey);
				if (result == null) result = caseStringIdentity(journey);
				if (result == null) result = caseNamedElement(journey);
				if (result == null) result = caseDocumented(journey);
				if (result == null) result = caseModelElement(journey);
				if (result == null) result = caseMarked(journey);
				if (result == null) result = caseAdaptable(journey);
				if (result == null) result = caseIMarked(journey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.CRUISE: {
				Cruise cruise = (Cruise)theEObject;
				T result = caseCruise(cruise);
				if (result == null) result = caseTransit(cruise);
				if (result == null) result = caseDocumentedNamedStringIdentity(cruise);
				if (result == null) result = casePeriod(cruise);
				if (result == null) result = caseDocumentedNamedElement(cruise);
				if (result == null) result = caseStringIdentity(cruise);
				if (result == null) result = caseNamedElement(cruise);
				if (result == null) result = caseDocumented(cruise);
				if (result == null) result = caseModelElement(cruise);
				if (result == null) result = caseMarked(cruise);
				if (result == null) result = caseAdaptable(cruise);
				if (result == null) result = caseIMarked(cruise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.EXCURSION: {
				Excursion excursion = (Excursion)theEObject;
				T result = caseExcursion(excursion);
				if (result == null) result = caseTransit(excursion);
				if (result == null) result = caseDocumentedNamedStringIdentity(excursion);
				if (result == null) result = casePeriod(excursion);
				if (result == null) result = caseDocumentedNamedElement(excursion);
				if (result == null) result = caseStringIdentity(excursion);
				if (result == null) result = caseNamedElement(excursion);
				if (result == null) result = caseDocumented(excursion);
				if (result == null) result = caseModelElement(excursion);
				if (result == null) result = caseMarked(excursion);
				if (result == null) result = caseAdaptable(excursion);
				if (result == null) result = caseIMarked(excursion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.TRAVELER: {
				Traveler traveler = (Traveler)theEObject;
				T result = caseTraveler(traveler);
				if (result == null) result = casePerson(traveler);
				if (result == null) result = caseParty(traveler);
				if (result == null) result = caseDocumentedNamedStringIdentity(traveler);
				if (result == null) result = caseDocumentedNamedElement(traveler);
				if (result == null) result = caseStringIdentity(traveler);
				if (result == null) result = caseNamedElement(traveler);
				if (result == null) result = caseDocumented(traveler);
				if (result == null) result = caseModelElement(traveler);
				if (result == null) result = caseMarked(traveler);
				if (result == null) result = caseAdaptable(traveler);
				if (result == null) result = caseIMarked(traveler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseDocumentedNamedStringIdentity(location);
				if (result == null) result = caseDocumentedNamedElement(location);
				if (result == null) result = caseStringIdentity(location);
				if (result == null) result = caseNamedElement(location);
				if (result == null) result = caseDocumented(location);
				if (result == null) result = caseModelElement(location);
				if (result == null) result = caseMarked(location);
				if (result == null) result = caseAdaptable(location);
				if (result == null) result = caseIMarked(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.CONTINENT: {
				Continent continent = (Continent)theEObject;
				T result = caseContinent(continent);
				if (result == null) result = caseLocation(continent);
				if (result == null) result = caseDocumentedNamedStringIdentity(continent);
				if (result == null) result = caseDocumentedNamedElement(continent);
				if (result == null) result = caseStringIdentity(continent);
				if (result == null) result = caseNamedElement(continent);
				if (result == null) result = caseDocumented(continent);
				if (result == null) result = caseModelElement(continent);
				if (result == null) result = caseMarked(continent);
				if (result == null) result = caseAdaptable(continent);
				if (result == null) result = caseIMarked(continent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseLocation(region);
				if (result == null) result = caseDocumentedNamedStringIdentity(region);
				if (result == null) result = caseDocumentedNamedElement(region);
				if (result == null) result = caseStringIdentity(region);
				if (result == null) result = caseNamedElement(region);
				if (result == null) result = caseDocumented(region);
				if (result == null) result = caseModelElement(region);
				if (result == null) result = caseMarked(region);
				if (result == null) result = caseAdaptable(region);
				if (result == null) result = caseIMarked(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = caseLocation(country);
				if (result == null) result = caseDocumentedNamedStringIdentity(country);
				if (result == null) result = caseDocumentedNamedElement(country);
				if (result == null) result = caseStringIdentity(country);
				if (result == null) result = caseNamedElement(country);
				if (result == null) result = caseDocumented(country);
				if (result == null) result = caseModelElement(country);
				if (result == null) result = caseMarked(country);
				if (result == null) result = caseAdaptable(country);
				if (result == null) result = caseIMarked(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.ADMINISTRATIVE_DIVISION: {
				AdministrativeDivision administrativeDivision = (AdministrativeDivision)theEObject;
				T result = caseAdministrativeDivision(administrativeDivision);
				if (result == null) result = caseLocation(administrativeDivision);
				if (result == null) result = caseDocumentedNamedStringIdentity(administrativeDivision);
				if (result == null) result = caseDocumentedNamedElement(administrativeDivision);
				if (result == null) result = caseStringIdentity(administrativeDivision);
				if (result == null) result = caseNamedElement(administrativeDivision);
				if (result == null) result = caseDocumented(administrativeDivision);
				if (result == null) result = caseModelElement(administrativeDivision);
				if (result == null) result = caseMarked(administrativeDivision);
				if (result == null) result = caseAdaptable(administrativeDivision);
				if (result == null) result = caseIMarked(administrativeDivision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseAdministrativeDivision(state);
				if (result == null) result = caseLocation(state);
				if (result == null) result = caseDocumentedNamedStringIdentity(state);
				if (result == null) result = caseDocumentedNamedElement(state);
				if (result == null) result = caseStringIdentity(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = caseDocumented(state);
				if (result == null) result = caseModelElement(state);
				if (result == null) result = caseMarked(state);
				if (result == null) result = caseAdaptable(state);
				if (result == null) result = caseIMarked(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.SETTLEMENT: {
				Settlement settlement = (Settlement)theEObject;
				T result = caseSettlement(settlement);
				if (result == null) result = caseLocation(settlement);
				if (result == null) result = caseDocumentedNamedStringIdentity(settlement);
				if (result == null) result = caseDocumentedNamedElement(settlement);
				if (result == null) result = caseStringIdentity(settlement);
				if (result == null) result = caseNamedElement(settlement);
				if (result == null) result = caseDocumented(settlement);
				if (result == null) result = caseModelElement(settlement);
				if (result == null) result = caseMarked(settlement);
				if (result == null) result = caseAdaptable(settlement);
				if (result == null) result = caseIMarked(settlement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = caseSettlement(city);
				if (result == null) result = caseLocation(city);
				if (result == null) result = caseDocumentedNamedStringIdentity(city);
				if (result == null) result = caseDocumentedNamedElement(city);
				if (result == null) result = caseStringIdentity(city);
				if (result == null) result = caseNamedElement(city);
				if (result == null) result = caseDocumented(city);
				if (result == null) result = caseModelElement(city);
				if (result == null) result = caseMarked(city);
				if (result == null) result = caseAdaptable(city);
				if (result == null) result = caseIMarked(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.VILLAGE: {
				Village village = (Village)theEObject;
				T result = caseVillage(village);
				if (result == null) result = caseSettlement(village);
				if (result == null) result = caseLocation(village);
				if (result == null) result = caseDocumentedNamedStringIdentity(village);
				if (result == null) result = caseDocumentedNamedElement(village);
				if (result == null) result = caseStringIdentity(village);
				if (result == null) result = caseNamedElement(village);
				if (result == null) result = caseDocumented(village);
				if (result == null) result = caseModelElement(village);
				if (result == null) result = caseMarked(village);
				if (result == null) result = caseAdaptable(village);
				if (result == null) result = caseIMarked(village);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.ACCOMMODATION: {
				Accommodation accommodation = (Accommodation)theEObject;
				T result = caseAccommodation(accommodation);
				if (result == null) result = caseLocation(accommodation);
				if (result == null) result = caseDocumentedNamedStringIdentity(accommodation);
				if (result == null) result = caseDocumentedNamedElement(accommodation);
				if (result == null) result = caseStringIdentity(accommodation);
				if (result == null) result = caseNamedElement(accommodation);
				if (result == null) result = caseDocumented(accommodation);
				if (result == null) result = caseModelElement(accommodation);
				if (result == null) result = caseMarked(accommodation);
				if (result == null) result = caseAdaptable(accommodation);
				if (result == null) result = caseIMarked(accommodation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.HOTEL: {
				Hotel hotel = (Hotel)theEObject;
				T result = caseHotel(hotel);
				if (result == null) result = caseAccommodation(hotel);
				if (result == null) result = caseLocation(hotel);
				if (result == null) result = caseDocumentedNamedStringIdentity(hotel);
				if (result == null) result = caseDocumentedNamedElement(hotel);
				if (result == null) result = caseStringIdentity(hotel);
				if (result == null) result = caseNamedElement(hotel);
				if (result == null) result = caseDocumented(hotel);
				if (result == null) result = caseModelElement(hotel);
				if (result == null) result = caseMarked(hotel);
				if (result == null) result = caseAdaptable(hotel);
				if (result == null) result = caseIMarked(hotel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.HOUSE: {
				House house = (House)theEObject;
				T result = caseHouse(house);
				if (result == null) result = caseAccommodation(house);
				if (result == null) result = caseLocation(house);
				if (result == null) result = caseDocumentedNamedStringIdentity(house);
				if (result == null) result = caseDocumentedNamedElement(house);
				if (result == null) result = caseStringIdentity(house);
				if (result == null) result = caseNamedElement(house);
				if (result == null) result = caseDocumented(house);
				if (result == null) result = caseModelElement(house);
				if (result == null) result = caseMarked(house);
				if (result == null) result = caseAdaptable(house);
				if (result == null) result = caseIMarked(house);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.APARTMENT: {
				Apartment apartment = (Apartment)theEObject;
				T result = caseApartment(apartment);
				if (result == null) result = caseAccommodation(apartment);
				if (result == null) result = caseLocation(apartment);
				if (result == null) result = caseDocumentedNamedStringIdentity(apartment);
				if (result == null) result = caseDocumentedNamedElement(apartment);
				if (result == null) result = caseStringIdentity(apartment);
				if (result == null) result = caseNamedElement(apartment);
				if (result == null) result = caseDocumented(apartment);
				if (result == null) result = caseModelElement(apartment);
				if (result == null) result = caseMarked(apartment);
				if (result == null) result = caseAdaptable(apartment);
				if (result == null) result = caseIMarked(apartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TravelPackage.TRANSPORTATION: {
				Transportation transportation = (Transportation)theEObject;
				T result = caseTransportation(transportation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourneyLog(JourneyLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransit(Transit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJourney(Journey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cruise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cruise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCruise(Cruise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excursion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excursion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcursion(Excursion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traveler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traveler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraveler(Traveler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinent(Continent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrative Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrative Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrativeDivision(AdministrativeDivision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settlement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettlement(Settlement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Village</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Village</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVillage(Village object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accommodation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accommodation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccommodation(Accommodation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel(Hotel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouse(House object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApartment(Apartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportation(Transportation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TravelSwitch
