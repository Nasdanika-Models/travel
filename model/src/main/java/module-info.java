import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.travel.util.TravelEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.travel {
	exports org.nasdanika.models.travel;
	exports org.nasdanika.models.travel.impl;
	exports org.nasdanika.models.travel.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.party;
	
	provides CapabilityFactory with TravelEPackageResourceSetCapabilityFactory;
	
}