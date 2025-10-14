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
import org.nasdanika.models.travel.Location;
import org.nasdanika.models.travel.TravelPackage;
import org.nasdanika.models.travel.Traveler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyImpl#getTravelers <em>Travelers</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.JourneyImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyImpl extends TransitImpl implements Journey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravelPackage.Literals.JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Traveler> getTravelers() {
		return (EList<Traveler>)eDynamicGet(TravelPackage.JOURNEY__TRAVELERS, TravelPackage.Literals.DIRECTORY__TRAVELERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(TravelPackage.JOURNEY__LOCATIONS, TravelPackage.Literals.DIRECTORY__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TravelPackage.JOURNEY__TRAVELERS:
				return ((InternalEList<?>)getTravelers()).basicRemove(otherEnd, msgs);
			case TravelPackage.JOURNEY__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case TravelPackage.JOURNEY__TRAVELERS:
				return getTravelers();
			case TravelPackage.JOURNEY__LOCATIONS:
				return getLocations();
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
			case TravelPackage.JOURNEY__TRAVELERS:
				getTravelers().clear();
				getTravelers().addAll((Collection<? extends Traveler>)newValue);
				return;
			case TravelPackage.JOURNEY__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
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
			case TravelPackage.JOURNEY__TRAVELERS:
				getTravelers().clear();
				return;
			case TravelPackage.JOURNEY__LOCATIONS:
				getLocations().clear();
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
			case TravelPackage.JOURNEY__TRAVELERS:
				return !getTravelers().isEmpty();
			case TravelPackage.JOURNEY__LOCATIONS:
				return !getLocations().isEmpty();
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
		if (baseClass == Directory.class) {
			switch (derivedFeatureID) {
				case TravelPackage.JOURNEY__TRAVELERS: return TravelPackage.DIRECTORY__TRAVELERS;
				case TravelPackage.JOURNEY__LOCATIONS: return TravelPackage.DIRECTORY__LOCATIONS;
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
		if (baseClass == Directory.class) {
			switch (baseFeatureID) {
				case TravelPackage.DIRECTORY__TRAVELERS: return TravelPackage.JOURNEY__TRAVELERS;
				case TravelPackage.DIRECTORY__LOCATIONS: return TravelPackage.JOURNEY__LOCATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JourneyImpl
