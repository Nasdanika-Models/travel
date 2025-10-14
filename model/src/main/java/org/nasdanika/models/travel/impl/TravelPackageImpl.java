/**
 */
package org.nasdanika.models.travel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.models.travel.Accommodation;
import org.nasdanika.models.travel.AdministrativeDivision;
import org.nasdanika.models.travel.Apartment;
import org.nasdanika.models.travel.City;
import org.nasdanika.models.travel.Continent;
import org.nasdanika.models.travel.Country;
import org.nasdanika.models.travel.Cruise;
import org.nasdanika.models.travel.Directory;
import org.nasdanika.models.travel.Excursion;
import org.nasdanika.models.travel.Hotel;
import org.nasdanika.models.travel.House;
import org.nasdanika.models.travel.Journey;
import org.nasdanika.models.travel.JourneyLog;
import org.nasdanika.models.travel.Location;
import org.nasdanika.models.travel.Region;
import org.nasdanika.models.travel.Settlement;
import org.nasdanika.models.travel.State;
import org.nasdanika.models.travel.Transit;
import org.nasdanika.models.travel.Transportation;
import org.nasdanika.models.travel.TravelFactory;
import org.nasdanika.models.travel.TravelPackage;
import org.nasdanika.models.travel.Traveler;
import org.nasdanika.models.travel.Village;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TravelPackageImpl extends EPackageImpl implements TravelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cruiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excursionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeDivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settlementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass villageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.travel.TravelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TravelPackageImpl() {
		super(eNS_URI, TravelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TravelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TravelPackage init() {
		if (isInited) return (TravelPackage)EPackage.Registry.INSTANCE.getEPackage(TravelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTravelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TravelPackageImpl theTravelPackage = registeredTravelPackage instanceof TravelPackageImpl ? (TravelPackageImpl)registeredTravelPackage : new TravelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTravelPackage.createPackageContents();

		// Initialize created meta-data
		theTravelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTravelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TravelPackage.eNS_URI, theTravelPackage);
		return theTravelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectory_Travelers() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectory_Locations() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourneyLog() {
		return journeyLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJourneyLog_Journeys() {
		return (EReference)journeyLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransit() {
		return transitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransit_Origin() {
		return (EReference)transitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransit_Destination() {
		return (EReference)transitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransit_Segments() {
		return (EReference)transitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransit_Participants() {
		return (EReference)transitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCruise() {
		return cruiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExcursion() {
		return excursionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraveler() {
		return travelerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraveler_Transits() {
		return (EReference)travelerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocation_Children() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinent() {
		return continentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrativeDivision() {
		return administrativeDivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSettlement() {
		return settlementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVillage() {
		return villageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodation() {
		return accommodationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApartment() {
		return apartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportation() {
		return transportationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TravelFactory getTravelFactory() {
		return (TravelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__TRAVELERS);
		createEReference(directoryEClass, DIRECTORY__LOCATIONS);

		journeyLogEClass = createEClass(JOURNEY_LOG);
		createEReference(journeyLogEClass, JOURNEY_LOG__JOURNEYS);

		transitEClass = createEClass(TRANSIT);
		createEReference(transitEClass, TRANSIT__ORIGIN);
		createEReference(transitEClass, TRANSIT__DESTINATION);
		createEReference(transitEClass, TRANSIT__SEGMENTS);
		createEReference(transitEClass, TRANSIT__PARTICIPANTS);

		journeyEClass = createEClass(JOURNEY);

		cruiseEClass = createEClass(CRUISE);

		excursionEClass = createEClass(EXCURSION);

		travelerEClass = createEClass(TRAVELER);
		createEReference(travelerEClass, TRAVELER__TRANSITS);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__CHILDREN);

		continentEClass = createEClass(CONTINENT);

		regionEClass = createEClass(REGION);

		countryEClass = createEClass(COUNTRY);

		administrativeDivisionEClass = createEClass(ADMINISTRATIVE_DIVISION);

		stateEClass = createEClass(STATE);

		settlementEClass = createEClass(SETTLEMENT);

		cityEClass = createEClass(CITY);

		villageEClass = createEClass(VILLAGE);

		accommodationEClass = createEClass(ACCOMMODATION);

		hotelEClass = createEClass(HOTEL);

		houseEClass = createEClass(HOUSE);

		apartmentEClass = createEClass(APARTMENT);

		transportationEClass = createEClass(TRANSPORTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		directoryEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		journeyLogEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		journeyLogEClass.getESuperTypes().add(this.getDirectory());
		transitEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		transitEClass.getESuperTypes().add(theNcorePackage.getPeriod());
		journeyEClass.getESuperTypes().add(this.getTransit());
		journeyEClass.getESuperTypes().add(this.getDirectory());
		cruiseEClass.getESuperTypes().add(this.getTransit());
		excursionEClass.getESuperTypes().add(this.getTransit());
		travelerEClass.getESuperTypes().add(thePartyPackage.getPerson());
		locationEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedStringIdentity());
		continentEClass.getESuperTypes().add(this.getLocation());
		regionEClass.getESuperTypes().add(this.getLocation());
		countryEClass.getESuperTypes().add(this.getLocation());
		administrativeDivisionEClass.getESuperTypes().add(this.getLocation());
		stateEClass.getESuperTypes().add(this.getAdministrativeDivision());
		settlementEClass.getESuperTypes().add(this.getLocation());
		cityEClass.getESuperTypes().add(this.getSettlement());
		villageEClass.getESuperTypes().add(this.getSettlement());
		accommodationEClass.getESuperTypes().add(this.getLocation());
		hotelEClass.getESuperTypes().add(this.getAccommodation());
		houseEClass.getESuperTypes().add(this.getAccommodation());
		apartmentEClass.getESuperTypes().add(this.getAccommodation());

		// Initialize classes, features, and operations; add parameters
		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Travelers(), this.getTraveler(), null, "travelers", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectory_Locations(), this.getLocation(), null, "locations", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyLogEClass, JourneyLog.class, "JourneyLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneyLog_Journeys(), this.getJourney(), null, "journeys", null, 0, -1, JourneyLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getJourneyLog_Journeys().getEKeys().add(theNcorePackage.getStringIdentity_Id());

		initEClass(transitEClass, Transit.class, "Transit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransit_Origin(), this.getLocation(), null, "origin", null, 1, 1, Transit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransit_Destination(), this.getLocation(), null, "destination", null, 0, 1, Transit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransit_Segments(), this.getTransit(), null, "segments", null, 0, -1, Transit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTransit_Segments().getEKeys().add(theNcorePackage.getStringIdentity_Id());
		initEReference(getTransit_Participants(), this.getTraveler(), this.getTraveler_Transits(), "participants", null, 0, -1, Transit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cruiseEClass, Cruise.class, "Cruise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excursionEClass, Excursion.class, "Excursion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(travelerEClass, Traveler.class, "Traveler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraveler_Transits(), this.getTransit(), this.getTransit_Participants(), "transits", null, 0, -1, Traveler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Children(), this.getLocation(), null, "children", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continentEClass, Continent.class, "Continent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(administrativeDivisionEClass, AdministrativeDivision.class, "AdministrativeDivision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(settlementEClass, Settlement.class, "Settlement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(villageEClass, Village.class, "Village", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accommodationEClass, Accommodation.class, "Accommodation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apartmentEClass, Apartment.class, "Apartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportationEClass, Transportation.class, "Transportation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TravelPackageImpl
