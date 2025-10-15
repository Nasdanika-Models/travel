import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.travel.doc.TravelNodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.trvel.doc {
		
	requires transitive org.nasdanika.models.travel;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.travel.doc;
	opens org.nasdanika.models.travel.doc; // For loading resources

	provides CapabilityFactory with	TravelNodeProcessorFactoryCapabilityFactory;
	
}
