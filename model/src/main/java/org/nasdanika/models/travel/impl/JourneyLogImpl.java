/**
 */
package org.nasdanika.models.travel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.travel.Directory;
import org.nasdanika.models.travel.Journey;
import org.nasdanika.models.travel.JourneyLog;
import org.nasdanika.models.travel.Location;
import org.nasdanika.models.travel.TravelPackage;
import org.nasdanika.models.travel.Traveler;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.StringIdentity;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyLogImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyLogImpl#getTravelers <em>Travelers</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyLogImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyLogImpl#getJourneys <em>Journeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyLogImpl extends DocumentedNamedElementImpl implements JourneyLog {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravelPackage.Literals.JOURNEY_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(TravelPackage.JOURNEY_LOG__ID, NcorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(TravelPackage.JOURNEY_LOG__ID, NcorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Traveler> getTravelers() {
		return (EList<Traveler>)eDynamicGet(TravelPackage.JOURNEY_LOG__TRAVELERS, TravelPackage.Literals.DIRECTORY__TRAVELERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(TravelPackage.JOURNEY_LOG__LOCATIONS, TravelPackage.Literals.DIRECTORY__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Journey> getJourneys() {
		return (EList<Journey>)eDynamicGet(TravelPackage.JOURNEY_LOG__JOURNEYS, TravelPackage.Literals.JOURNEY_LOG__JOURNEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TravelPackage.JOURNEY_LOG__TRAVELERS:
				return ((InternalEList<?>)getTravelers()).basicRemove(otherEnd, msgs);
			case TravelPackage.JOURNEY_LOG__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case TravelPackage.JOURNEY_LOG__JOURNEYS:
				return ((InternalEList<?>)getJourneys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TravelPackage.JOURNEY_LOG__ID:
				return getId();
			case TravelPackage.JOURNEY_LOG__TRAVELERS:
				return getTravelers();
			case TravelPackage.JOURNEY_LOG__LOCATIONS:
				return getLocations();
			case TravelPackage.JOURNEY_LOG__JOURNEYS:
				return getJourneys();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TravelPackage.JOURNEY_LOG__ID:
				setId((String)newValue);
				return;
			case TravelPackage.JOURNEY_LOG__TRAVELERS:
				getTravelers().clear();
				getTravelers().addAll((Collection<? extends Traveler>)newValue);
				return;
			case TravelPackage.JOURNEY_LOG__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case TravelPackage.JOURNEY_LOG__JOURNEYS:
				getJourneys().clear();
				getJourneys().addAll((Collection<? extends Journey>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TravelPackage.JOURNEY_LOG__ID:
				setId(ID_EDEFAULT);
				return;
			case TravelPackage.JOURNEY_LOG__TRAVELERS:
				getTravelers().clear();
				return;
			case TravelPackage.JOURNEY_LOG__LOCATIONS:
				getLocations().clear();
				return;
			case TravelPackage.JOURNEY_LOG__JOURNEYS:
				getJourneys().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TravelPackage.JOURNEY_LOG__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case TravelPackage.JOURNEY_LOG__TRAVELERS:
				return !getTravelers().isEmpty();
			case TravelPackage.JOURNEY_LOG__LOCATIONS:
				return !getLocations().isEmpty();
			case TravelPackage.JOURNEY_LOG__JOURNEYS:
				return !getJourneys().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StringIdentity.class) {
			switch (derivedFeatureID) {
				case TravelPackage.JOURNEY_LOG__ID: return NcorePackage.STRING_IDENTITY__ID;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Directory.class) {
			switch (derivedFeatureID) {
				case TravelPackage.JOURNEY_LOG__TRAVELERS: return TravelPackage.DIRECTORY__TRAVELERS;
				case TravelPackage.JOURNEY_LOG__LOCATIONS: return TravelPackage.DIRECTORY__LOCATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StringIdentity.class) {
			switch (baseFeatureID) {
				case NcorePackage.STRING_IDENTITY__ID: return TravelPackage.JOURNEY_LOG__ID;
				default: return -1;
			}
		}
		if (baseClass == DocumentedNamedStringIdentity.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Directory.class) {
			switch (baseFeatureID) {
				case TravelPackage.DIRECTORY__TRAVELERS: return TravelPackage.JOURNEY_LOG__TRAVELERS;
				case TravelPackage.DIRECTORY__LOCATIONS: return TravelPackage.JOURNEY_LOG__LOCATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JourneyLogImpl
