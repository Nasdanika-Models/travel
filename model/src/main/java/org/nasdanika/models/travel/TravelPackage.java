/**
 */
package org.nasdanika.models.travel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.party.PartyPackage;

import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.travel.TravelFactory
 * @model kind="package"
 * @generated
 */
public interface TravelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "travel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/travel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.travel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TravelPackage eINSTANCE = org.nasdanika.models.travel.impl.TravelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.DirectoryImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Travelers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__TRAVELERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__LOCATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.JourneyLogImpl <em>Journey Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.JourneyLogImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getJourneyLog()
	 * @generated
	 */
	int JOURNEY_LOG = 1;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__MARKERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__URIS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__UUID = NcorePackage.DOCUMENTED_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_ELEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__NAME = NcorePackage.DOCUMENTED_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__ID = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Travelers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__TRAVELERS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__LOCATIONS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Journeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG__JOURNEYS = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Journey Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Journey Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_LOG_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.TransitImpl <em>Transit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.TransitImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTransit()
	 * @generated
	 */
	int TRANSIT = 2;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__START = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__END = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__DURATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__ORIGIN = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__DESTINATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__SEGMENTS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT__PARTICIPANTS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIT_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.JourneyImpl <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.JourneyImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getJourney()
	 * @generated
	 */
	int JOURNEY = 3;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__MARKERS = TRANSIT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__URIS = TRANSIT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DESCRIPTION = TRANSIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__UUID = TRANSIT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__LABEL_PROTOTYPE = TRANSIT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__REPRESENTATIONS = TRANSIT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ANNOTATIONS = TRANSIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__NAME = TRANSIT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DOCUMENTATION = TRANSIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__CONTEXT_HELP = TRANSIT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ID = TRANSIT__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__START = TRANSIT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__END = TRANSIT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DURATION = TRANSIT__DURATION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ORIGIN = TRANSIT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DESTINATION = TRANSIT__DESTINATION;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__SEGMENTS = TRANSIT__SEGMENTS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__PARTICIPANTS = TRANSIT__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Travelers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__TRAVELERS = TRANSIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__LOCATIONS = TRANSIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_FEATURE_COUNT = TRANSIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATION_COUNT = TRANSIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.CruiseImpl <em>Cruise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.CruiseImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCruise()
	 * @generated
	 */
	int CRUISE = 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__MARKERS = TRANSIT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__URIS = TRANSIT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__DESCRIPTION = TRANSIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__UUID = TRANSIT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__LABEL_PROTOTYPE = TRANSIT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__REPRESENTATIONS = TRANSIT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__ANNOTATIONS = TRANSIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__NAME = TRANSIT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__DOCUMENTATION = TRANSIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__CONTEXT_HELP = TRANSIT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__ID = TRANSIT__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__START = TRANSIT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__END = TRANSIT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__DURATION = TRANSIT__DURATION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__ORIGIN = TRANSIT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__DESTINATION = TRANSIT__DESTINATION;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__SEGMENTS = TRANSIT__SEGMENTS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE__PARTICIPANTS = TRANSIT__PARTICIPANTS;

	/**
	 * The number of structural features of the '<em>Cruise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE_FEATURE_COUNT = TRANSIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cruise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUISE_OPERATION_COUNT = TRANSIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.ExcursionImpl <em>Excursion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.ExcursionImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getExcursion()
	 * @generated
	 */
	int EXCURSION = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__MARKERS = TRANSIT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__URIS = TRANSIT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__DESCRIPTION = TRANSIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__UUID = TRANSIT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__LABEL_PROTOTYPE = TRANSIT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__REPRESENTATIONS = TRANSIT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__ANNOTATIONS = TRANSIT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__NAME = TRANSIT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__DOCUMENTATION = TRANSIT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__CONTEXT_HELP = TRANSIT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__ID = TRANSIT__ID;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__START = TRANSIT__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__END = TRANSIT__END;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__DURATION = TRANSIT__DURATION;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__ORIGIN = TRANSIT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__DESTINATION = TRANSIT__DESTINATION;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__SEGMENTS = TRANSIT__SEGMENTS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION__PARTICIPANTS = TRANSIT__PARTICIPANTS;

	/**
	 * The number of structural features of the '<em>Excursion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION_FEATURE_COUNT = TRANSIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excursion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCURSION_OPERATION_COUNT = TRANSIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.TravelerImpl <em>Traveler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.TravelerImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTraveler()
	 * @generated
	 */
	int TRAVELER = 6;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__MARKERS = PartyPackage.PERSON__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__URIS = PartyPackage.PERSON__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__DESCRIPTION = PartyPackage.PERSON__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__UUID = PartyPackage.PERSON__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__LABEL_PROTOTYPE = PartyPackage.PERSON__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__REPRESENTATIONS = PartyPackage.PERSON__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__ANNOTATIONS = PartyPackage.PERSON__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__NAME = PartyPackage.PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__DOCUMENTATION = PartyPackage.PERSON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__CONTEXT_HELP = PartyPackage.PERSON__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__ID = PartyPackage.PERSON__ID;

	/**
	 * The feature id for the '<em><b>Contact Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__CONTACT_METHODS = PartyPackage.PERSON__CONTACT_METHODS;

	/**
	 * The feature id for the '<em><b>Transits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER__TRANSITS = PartyPackage.PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traveler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER_FEATURE_COUNT = PartyPackage.PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Traveler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVELER_OPERATION_COUNT = PartyPackage.PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.LocationImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__MARKERS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URIS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__UUID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LABEL_PROTOTYPE = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REPRESENTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ANNOTATIONS = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DOCUMENTATION = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTEXT_HELP = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CHILDREN = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NcorePackage.DOCUMENTED_NAMED_STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.ContinentImpl <em>Continent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.ContinentImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getContinent()
	 * @generated
	 */
	int CONTINENT = 8;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Continent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Continent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINENT_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.RegionImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 9;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.CountryImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 10;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.AdministrativeDivisionImpl <em>Administrative Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.AdministrativeDivisionImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getAdministrativeDivision()
	 * @generated
	 */
	int ADMINISTRATIVE_DIVISION = 11;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Administrative Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Administrative Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_DIVISION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.StateImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__MARKERS = ADMINISTRATIVE_DIVISION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__URIS = ADMINISTRATIVE_DIVISION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESCRIPTION = ADMINISTRATIVE_DIVISION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__UUID = ADMINISTRATIVE_DIVISION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL_PROTOTYPE = ADMINISTRATIVE_DIVISION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REPRESENTATIONS = ADMINISTRATIVE_DIVISION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANNOTATIONS = ADMINISTRATIVE_DIVISION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ADMINISTRATIVE_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DOCUMENTATION = ADMINISTRATIVE_DIVISION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTEXT_HELP = ADMINISTRATIVE_DIVISION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = ADMINISTRATIVE_DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHILDREN = ADMINISTRATIVE_DIVISION__CHILDREN;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ADMINISTRATIVE_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = ADMINISTRATIVE_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.SettlementImpl <em>Settlement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.SettlementImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getSettlement()
	 * @generated
	 */
	int SETTLEMENT = 13;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Settlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Settlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.CityImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 14;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__MARKERS = SETTLEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__URIS = SETTLEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__DESCRIPTION = SETTLEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__UUID = SETTLEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__LABEL_PROTOTYPE = SETTLEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__REPRESENTATIONS = SETTLEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ANNOTATIONS = SETTLEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = SETTLEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__DOCUMENTATION = SETTLEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CONTEXT_HELP = SETTLEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__ID = SETTLEMENT__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CHILDREN = SETTLEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = SETTLEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = SETTLEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.VillageImpl <em>Village</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.VillageImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getVillage()
	 * @generated
	 */
	int VILLAGE = 15;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__MARKERS = SETTLEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__URIS = SETTLEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__DESCRIPTION = SETTLEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__UUID = SETTLEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__LABEL_PROTOTYPE = SETTLEMENT__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__REPRESENTATIONS = SETTLEMENT__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__ANNOTATIONS = SETTLEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__NAME = SETTLEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__DOCUMENTATION = SETTLEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__CONTEXT_HELP = SETTLEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__ID = SETTLEMENT__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE__CHILDREN = SETTLEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Village</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE_FEATURE_COUNT = SETTLEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Village</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLAGE_OPERATION_COUNT = SETTLEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.AccommodationImpl <em>Accommodation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.AccommodationImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getAccommodation()
	 * @generated
	 */
	int ACCOMMODATION = 16;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__MARKERS = LOCATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__URIS = LOCATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__DESCRIPTION = LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__UUID = LOCATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__LABEL_PROTOTYPE = LOCATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__REPRESENTATIONS = LOCATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__ANNOTATIONS = LOCATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__NAME = LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__DOCUMENTATION = LOCATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__CONTEXT_HELP = LOCATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__ID = LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION__CHILDREN = LOCATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Accommodation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accommodation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.HotelImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 17;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__MARKERS = ACCOMMODATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__URIS = ACCOMMODATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__DESCRIPTION = ACCOMMODATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__UUID = ACCOMMODATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__LABEL_PROTOTYPE = ACCOMMODATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__REPRESENTATIONS = ACCOMMODATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__ANNOTATIONS = ACCOMMODATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__NAME = ACCOMMODATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__DOCUMENTATION = ACCOMMODATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CONTEXT_HELP = ACCOMMODATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__ID = ACCOMMODATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CHILDREN = ACCOMMODATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = ACCOMMODATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = ACCOMMODATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.HouseImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 18;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__MARKERS = ACCOMMODATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__URIS = ACCOMMODATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__DESCRIPTION = ACCOMMODATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__UUID = ACCOMMODATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__LABEL_PROTOTYPE = ACCOMMODATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__REPRESENTATIONS = ACCOMMODATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ANNOTATIONS = ACCOMMODATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = ACCOMMODATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__DOCUMENTATION = ACCOMMODATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__CONTEXT_HELP = ACCOMMODATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ID = ACCOMMODATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__CHILDREN = ACCOMMODATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = ACCOMMODATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = ACCOMMODATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.ApartmentImpl <em>Apartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.ApartmentImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getApartment()
	 * @generated
	 */
	int APARTMENT = 19;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__MARKERS = ACCOMMODATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__URIS = ACCOMMODATION__URIS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__DESCRIPTION = ACCOMMODATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__UUID = ACCOMMODATION__UUID;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__LABEL_PROTOTYPE = ACCOMMODATION__LABEL_PROTOTYPE;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__REPRESENTATIONS = ACCOMMODATION__REPRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__ANNOTATIONS = ACCOMMODATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__NAME = ACCOMMODATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__DOCUMENTATION = ACCOMMODATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__CONTEXT_HELP = ACCOMMODATION__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__ID = ACCOMMODATION__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT__CHILDREN = ACCOMMODATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Apartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT_FEATURE_COUNT = ACCOMMODATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Apartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APARTMENT_OPERATION_COUNT = ACCOMMODATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.travel.impl.TransportationImpl <em>Transportation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.travel.impl.TransportationImpl
	 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTransportation()
	 * @generated
	 */
	int TRANSPORTATION = 20;

	/**
	 * The number of structural features of the '<em>Transportation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transportation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.nasdanika.models.travel.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.travel.Directory#getTravelers <em>Travelers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Travelers</em>'.
	 * @see org.nasdanika.models.travel.Directory#getTravelers()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Travelers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.travel.Directory#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.nasdanika.models.travel.Directory#getLocations()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Locations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.JourneyLog <em>Journey Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Log</em>'.
	 * @see org.nasdanika.models.travel.JourneyLog
	 * @generated
	 */
	EClass getJourneyLog();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.travel.JourneyLog#getJourneys <em>Journeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journeys</em>'.
	 * @see org.nasdanika.models.travel.JourneyLog#getJourneys()
	 * @see #getJourneyLog()
	 * @generated
	 */
	EReference getJourneyLog_Journeys();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Transit <em>Transit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transit</em>'.
	 * @see org.nasdanika.models.travel.Transit
	 * @generated
	 */
	EClass getTransit();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.travel.Transit#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see org.nasdanika.models.travel.Transit#getOrigin()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Origin();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.travel.Transit#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.nasdanika.models.travel.Transit#getDestination()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Destination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.travel.Transit#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.nasdanika.models.travel.Transit#getSegments()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Segments();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.travel.Transit#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see org.nasdanika.models.travel.Transit#getParticipants()
	 * @see #getTransit()
	 * @generated
	 */
	EReference getTransit_Participants();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see org.nasdanika.models.travel.Journey
	 * @generated
	 */
	EClass getJourney();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Cruise <em>Cruise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cruise</em>'.
	 * @see org.nasdanika.models.travel.Cruise
	 * @generated
	 */
	EClass getCruise();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Excursion <em>Excursion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excursion</em>'.
	 * @see org.nasdanika.models.travel.Excursion
	 * @generated
	 */
	EClass getExcursion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Traveler <em>Traveler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traveler</em>'.
	 * @see org.nasdanika.models.travel.Traveler
	 * @generated
	 */
	EClass getTraveler();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.travel.Traveler#getTransits <em>Transits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transits</em>'.
	 * @see org.nasdanika.models.travel.Traveler#getTransits()
	 * @see #getTraveler()
	 * @generated
	 */
	EReference getTraveler_Transits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.nasdanika.models.travel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.travel.Location#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.travel.Location#getChildren()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Continent <em>Continent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continent</em>'.
	 * @see org.nasdanika.models.travel.Continent
	 * @generated
	 */
	EClass getContinent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.nasdanika.models.travel.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.nasdanika.models.travel.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.AdministrativeDivision <em>Administrative Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Division</em>'.
	 * @see org.nasdanika.models.travel.AdministrativeDivision
	 * @generated
	 */
	EClass getAdministrativeDivision();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.nasdanika.models.travel.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Settlement <em>Settlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement</em>'.
	 * @see org.nasdanika.models.travel.Settlement
	 * @generated
	 */
	EClass getSettlement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see org.nasdanika.models.travel.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Village <em>Village</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Village</em>'.
	 * @see org.nasdanika.models.travel.Village
	 * @generated
	 */
	EClass getVillage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Accommodation <em>Accommodation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation</em>'.
	 * @see org.nasdanika.models.travel.Accommodation
	 * @generated
	 */
	EClass getAccommodation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see org.nasdanika.models.travel.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see org.nasdanika.models.travel.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Apartment <em>Apartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apartment</em>'.
	 * @see org.nasdanika.models.travel.Apartment
	 * @generated
	 */
	EClass getApartment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.travel.Transportation <em>Transportation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation</em>'.
	 * @see org.nasdanika.models.travel.Transportation
	 * @generated
	 */
	EClass getTransportation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TravelFactory getTravelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.DirectoryImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Travelers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__TRAVELERS = eINSTANCE.getDirectory_Travelers();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__LOCATIONS = eINSTANCE.getDirectory_Locations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.JourneyLogImpl <em>Journey Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.JourneyLogImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getJourneyLog()
		 * @generated
		 */
		EClass JOURNEY_LOG = eINSTANCE.getJourneyLog();

		/**
		 * The meta object literal for the '<em><b>Journeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_LOG__JOURNEYS = eINSTANCE.getJourneyLog_Journeys();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.TransitImpl <em>Transit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.TransitImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTransit()
		 * @generated
		 */
		EClass TRANSIT = eINSTANCE.getTransit();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__ORIGIN = eINSTANCE.getTransit_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__DESTINATION = eINSTANCE.getTransit_Destination();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__SEGMENTS = eINSTANCE.getTransit_Segments();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIT__PARTICIPANTS = eINSTANCE.getTransit_Participants();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.JourneyImpl <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.JourneyImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getJourney()
		 * @generated
		 */
		EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.CruiseImpl <em>Cruise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.CruiseImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCruise()
		 * @generated
		 */
		EClass CRUISE = eINSTANCE.getCruise();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.ExcursionImpl <em>Excursion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.ExcursionImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getExcursion()
		 * @generated
		 */
		EClass EXCURSION = eINSTANCE.getExcursion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.TravelerImpl <em>Traveler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.TravelerImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTraveler()
		 * @generated
		 */
		EClass TRAVELER = eINSTANCE.getTraveler();

		/**
		 * The meta object literal for the '<em><b>Transits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVELER__TRANSITS = eINSTANCE.getTraveler_Transits();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.LocationImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CHILDREN = eINSTANCE.getLocation_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.ContinentImpl <em>Continent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.ContinentImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getContinent()
		 * @generated
		 */
		EClass CONTINENT = eINSTANCE.getContinent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.RegionImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.CountryImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.AdministrativeDivisionImpl <em>Administrative Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.AdministrativeDivisionImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getAdministrativeDivision()
		 * @generated
		 */
		EClass ADMINISTRATIVE_DIVISION = eINSTANCE.getAdministrativeDivision();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.StateImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.SettlementImpl <em>Settlement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.SettlementImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getSettlement()
		 * @generated
		 */
		EClass SETTLEMENT = eINSTANCE.getSettlement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.CityImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.VillageImpl <em>Village</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.VillageImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getVillage()
		 * @generated
		 */
		EClass VILLAGE = eINSTANCE.getVillage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.AccommodationImpl <em>Accommodation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.AccommodationImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getAccommodation()
		 * @generated
		 */
		EClass ACCOMMODATION = eINSTANCE.getAccommodation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.HotelImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.HouseImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.ApartmentImpl <em>Apartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.ApartmentImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getApartment()
		 * @generated
		 */
		EClass APARTMENT = eINSTANCE.getApartment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.travel.impl.TransportationImpl <em>Transportation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.travel.impl.TransportationImpl
		 * @see org.nasdanika.models.travel.impl.TravelPackageImpl#getTransportation()
		 * @generated
		 */
		EClass TRANSPORTATION = eINSTANCE.getTransportation();

	}

} //TravelPackage
