/**
 */
package org.nasdanika.models.travel.impl;

import java.time.Duration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.travel.Location;
import org.nasdanika.models.travel.Transit;
import org.nasdanika.models.travel.TravelPackage;

import org.nasdanika.models.travel.Traveler;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Period;
import org.nasdanika.ncore.Temporal;

import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.nasdanika.models.travel.impl.TransitImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitImpl extends DocumentedNamedStringIdentityImpl implements Transit {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TravelPackage.Literals.TRANSIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(TravelPackage.TRANSIT__START, NcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, TravelPackage.TRANSIT__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(TravelPackage.TRANSIT__START, NcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(TravelPackage.TRANSIT__END, NcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, TravelPackage.TRANSIT__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(TravelPackage.TRANSIT__END, NcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(TravelPackage.TRANSIT__DURATION, NcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(TravelPackage.TRANSIT__DURATION, NcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getOrigin() {
		return (Location)eDynamicGet(TravelPackage.TRANSIT__ORIGIN, TravelPackage.Literals.TRANSIT__ORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetOrigin() {
		return (Location)eDynamicGet(TravelPackage.TRANSIT__ORIGIN, TravelPackage.Literals.TRANSIT__ORIGIN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Location newOrigin) {
		eDynamicSet(TravelPackage.TRANSIT__ORIGIN, TravelPackage.Literals.TRANSIT__ORIGIN, newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getDestination() {
		return (Location)eDynamicGet(TravelPackage.TRANSIT__DESTINATION, TravelPackage.Literals.TRANSIT__DESTINATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetDestination() {
		return (Location)eDynamicGet(TravelPackage.TRANSIT__DESTINATION, TravelPackage.Literals.TRANSIT__DESTINATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Location newDestination) {
		eDynamicSet(TravelPackage.TRANSIT__DESTINATION, TravelPackage.Literals.TRANSIT__DESTINATION, newDestination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transit> getSegments() {
		return (EList<Transit>)eDynamicGet(TravelPackage.TRANSIT__SEGMENTS, TravelPackage.Literals.TRANSIT__SEGMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Traveler> getParticipants() {
		return (EList<Traveler>)eDynamicGet(TravelPackage.TRANSIT__PARTICIPANTS, TravelPackage.Literals.TRANSIT__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TravelPackage.TRANSIT__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TravelPackage.TRANSIT__START:
				return basicSetStart(null, msgs);
			case TravelPackage.TRANSIT__END:
				return basicSetEnd(null, msgs);
			case TravelPackage.TRANSIT__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case TravelPackage.TRANSIT__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
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
			case TravelPackage.TRANSIT__START:
				return getStart();
			case TravelPackage.TRANSIT__END:
				return getEnd();
			case TravelPackage.TRANSIT__DURATION:
				return getDuration();
			case TravelPackage.TRANSIT__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case TravelPackage.TRANSIT__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case TravelPackage.TRANSIT__SEGMENTS:
				return getSegments();
			case TravelPackage.TRANSIT__PARTICIPANTS:
				return getParticipants();
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
			case TravelPackage.TRANSIT__START:
				setStart((Temporal)newValue);
				return;
			case TravelPackage.TRANSIT__END:
				setEnd((Temporal)newValue);
				return;
			case TravelPackage.TRANSIT__DURATION:
				setDuration((Duration)newValue);
				return;
			case TravelPackage.TRANSIT__ORIGIN:
				setOrigin((Location)newValue);
				return;
			case TravelPackage.TRANSIT__DESTINATION:
				setDestination((Location)newValue);
				return;
			case TravelPackage.TRANSIT__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Transit>)newValue);
				return;
			case TravelPackage.TRANSIT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Traveler>)newValue);
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
			case TravelPackage.TRANSIT__START:
				setStart((Temporal)null);
				return;
			case TravelPackage.TRANSIT__END:
				setEnd((Temporal)null);
				return;
			case TravelPackage.TRANSIT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TravelPackage.TRANSIT__ORIGIN:
				setOrigin((Location)null);
				return;
			case TravelPackage.TRANSIT__DESTINATION:
				setDestination((Location)null);
				return;
			case TravelPackage.TRANSIT__SEGMENTS:
				getSegments().clear();
				return;
			case TravelPackage.TRANSIT__PARTICIPANTS:
				getParticipants().clear();
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
			case TravelPackage.TRANSIT__START:
				return getStart() != null;
			case TravelPackage.TRANSIT__END:
				return getEnd() != null;
			case TravelPackage.TRANSIT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case TravelPackage.TRANSIT__ORIGIN:
				return basicGetOrigin() != null;
			case TravelPackage.TRANSIT__DESTINATION:
				return basicGetDestination() != null;
			case TravelPackage.TRANSIT__SEGMENTS:
				return !getSegments().isEmpty();
			case TravelPackage.TRANSIT__PARTICIPANTS:
				return !getParticipants().isEmpty();
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
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case TravelPackage.TRANSIT__START: return NcorePackage.PERIOD__START;
				case TravelPackage.TRANSIT__END: return NcorePackage.PERIOD__END;
				case TravelPackage.TRANSIT__DURATION: return NcorePackage.PERIOD__DURATION;
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
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NcorePackage.PERIOD__START: return TravelPackage.TRANSIT__START;
				case NcorePackage.PERIOD__END: return TravelPackage.TRANSIT__END;
				case NcorePackage.PERIOD__DURATION: return TravelPackage.TRANSIT__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TransitImpl
