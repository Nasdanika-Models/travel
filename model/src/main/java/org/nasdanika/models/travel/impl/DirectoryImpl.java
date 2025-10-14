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
import org.nasdanika.models.travel.Location;
import org.nasdanika.models.travel.TravelPackage;
import org.nasdanika.models.travel.Traveler;

import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.impl.DirectoryImpl#getTravelers <em>Travelers</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.DirectoryImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectoryImpl extends DocumentedNamedStringIdentityImpl implements Directory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravelPackage.Literals.DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Traveler> getTravelers() {
		return (EList<Traveler>)eDynamicGet(TravelPackage.DIRECTORY__TRAVELERS, TravelPackage.Literals.DIRECTORY__TRAVELERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(TravelPackage.DIRECTORY__LOCATIONS, TravelPackage.Literals.DIRECTORY__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TravelPackage.DIRECTORY__TRAVELERS:
				return ((InternalEList<?>)getTravelers()).basicRemove(otherEnd, msgs);
			case TravelPackage.DIRECTORY__LOCATIONS:
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
			case TravelPackage.DIRECTORY__TRAVELERS:
				return getTravelers();
			case TravelPackage.DIRECTORY__LOCATIONS:
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
			case TravelPackage.DIRECTORY__TRAVELERS:
				getTravelers().clear();
				getTravelers().addAll((Collection<? extends Traveler>)newValue);
				return;
			case TravelPackage.DIRECTORY__LOCATIONS:
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
			case TravelPackage.DIRECTORY__TRAVELERS:
				getTravelers().clear();
				return;
			case TravelPackage.DIRECTORY__LOCATIONS:
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
			case TravelPackage.DIRECTORY__TRAVELERS:
				return !getTravelers().isEmpty();
			case TravelPackage.DIRECTORY__LOCATIONS:
				return !getLocations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectoryImpl
