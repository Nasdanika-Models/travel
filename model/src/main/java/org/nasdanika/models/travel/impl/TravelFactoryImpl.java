/**
 */
package org.nasdanika.models.travel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.travel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelFactoryImpl extends EFactoryImpl implements TravelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TravelFactory init() {
		try {
			TravelFactory theTravelFactory = (TravelFactory)EPackage.Registry.INSTANCE.getEFactory(TravelPackage.eNS_URI);
			if (theTravelFactory != null) {
				return theTravelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TravelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TravelPackage.DIRECTORY: return createDirectory();
			case TravelPackage.JOURNEY_LOG: return createJourneyLog();
			case TravelPackage.TRANSIT: return createTransit();
			case TravelPackage.JOURNEY: return createJourney();
			case TravelPackage.CRUISE: return createCruise();
			case TravelPackage.EXCURSION: return createExcursion();
			case TravelPackage.TRAVELER: return createTraveler();
			case TravelPackage.LOCATION: return createLocation();
			case TravelPackage.CONTINENT: return createContinent();
			case TravelPackage.REGION: return createRegion();
			case TravelPackage.COUNTRY: return createCountry();
			case TravelPackage.ADMINISTRATIVE_DIVISION: return createAdministrativeDivision();
			case TravelPackage.STATE: return createState();
			case TravelPackage.SETTLEMENT: return createSettlement();
			case TravelPackage.CITY: return createCity();
			case TravelPackage.VILLAGE: return createVillage();
			case TravelPackage.ACCOMMODATION: return createAccommodation();
			case TravelPackage.HOTEL: return createHotel();
			case TravelPackage.HOUSE: return createHouse();
			case TravelPackage.APARTMENT: return createApartment();
			case TravelPackage.TRANSPORTATION: return createTransportation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JourneyLog createJourneyLog() {
		JourneyLogImpl journeyLog = new JourneyLogImpl();
		return journeyLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transit createTransit() {
		TransitImpl transit = new TransitImpl();
		return transit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Journey createJourney() {
		JourneyImpl journey = new JourneyImpl();
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cruise createCruise() {
		CruiseImpl cruise = new CruiseImpl();
		return cruise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Excursion createExcursion() {
		ExcursionImpl excursion = new ExcursionImpl();
		return excursion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Traveler createTraveler() {
		TravelerImpl traveler = new TravelerImpl();
		return traveler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Continent createContinent() {
		ContinentImpl continent = new ContinentImpl();
		return continent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeDivision createAdministrativeDivision() {
		AdministrativeDivisionImpl administrativeDivision = new AdministrativeDivisionImpl();
		return administrativeDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Settlement createSettlement() {
		SettlementImpl settlement = new SettlementImpl();
		return settlement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Village createVillage() {
		VillageImpl village = new VillageImpl();
		return village;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accommodation createAccommodation() {
		AccommodationImpl accommodation = new AccommodationImpl();
		return accommodation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Apartment createApartment() {
		ApartmentImpl apartment = new ApartmentImpl();
		return apartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transportation createTransportation() {
		TransportationImpl transportation = new TransportationImpl();
		return transportation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravelPackage getTravelPackage() {
		return (TravelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TravelPackage getPackage() {
		return TravelPackage.eINSTANCE;
	}

} //TravelFactoryImpl
