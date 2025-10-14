import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.travel.ecore.ECoreGenTravelProcessorsCapabilityFactory;

module org.nasdanika.models.travel.ecore {
		
	requires transitive org.nasdanika.models.travel;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.travel.ecore;
	opens org.nasdanika.models.travel.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenTravelProcessorsCapabilityFactory; 		
	
}
