package org.nasdanika.models.travel.doc;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.DocumentationFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.travel.Traveler;

public class TravelerNodeProcessor extends ModelElementNodeProcessor<Traveler> {

	public TravelerNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
		Collection<DocumentationFactory> documentationFactories) {
		
		super(config, context, prototypeProvider, documentationFactories);
	}		

//	@Override
//	protected String getTypeIcon() {
//		return CATALOG_ICON;
//	}
//	
//	@OutgoingReferenceBuilder(
//			nsURI = SqlPackage.eNS_URI,
//			classID = SqlPackage.CATALOG,
//			referenceID = SqlPackage.CATALOG__SCHEMAS)
//	public void buildSchemasOutgoingReference(
//			EReference eReference,
//			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
//			Collection<Label> labels,
//			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
//			ProgressMonitor progressMonitor) {
//
//		List<Entry<EReferenceConnection, Collection<Label>>> sorted = outgoingLabels.entrySet().stream()
//				.sorted((a,b) -> ((NamedElement) a.getKey().getTarget().get()).getName().compareTo(((NamedElement) b.getKey().getTarget().get()).getName()))
//				.toList();		
//
//		for (Label label: labels) {
//			Action schemasAction = getRoleActionByLocation(
//					((Action) label).getChildren(), 
//					"schemas.html", 
//					"Schemas", 
//					SCHEMA_ICON);
//			
//			for (Entry<EReferenceConnection, Collection<Label>> re: sorted) {
//				schemasAction.getChildren().addAll(re.getValue());
//			}
//			if (label instanceof Action) {										
//				DynamicTableBuilder<Entry<EReferenceConnection, WidgetFactory>> schemasTableBuilder = new DynamicTableBuilder<>("nsd-table");
//				buildNamedElementColumns(schemasTableBuilder, progressMonitor);
//				
//				org.nasdanika.models.html.Tag schemasTable = schemasTableBuilder.build(
//						referenceOutgoingEndpoints.stream().sorted((a,b) -> {
//							NamedElement ane = (NamedElement) a.getKey().getTarget().get();
//							NamedElement bne = (NamedElement) b.getKey().getTarget().get();
//							return ane.getName().compareTo(bne.getName());
//						}).toList(),  
//						"catalog-schemas", 
//						"schemas-table", 
//						progressMonitor);
//				
//				schemasAction.getContent().add(schemasTable);
//			}
//		}
//	}
		
}
