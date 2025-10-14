/**
 */
package org.nasdanika.models.travel.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.travel.Country;
import org.nasdanika.models.travel.TravelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CountryImpl extends LocationImpl implements Country {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravelPackage.Literals.COUNTRY;
	}

} //CountryImpl
