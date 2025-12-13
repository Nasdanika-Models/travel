package org.nasdanika.models.travel.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.travel.TravelPackage;

@EClassifierNodeProcessorFactory(classifierID = TravelPackage.TRAVELER)
public class TravelerProcessorsFactory {
	private Context context;
	
	public TravelerProcessorsFactory(Context context) {
		this.context = context;
	}	
		
	@EClassifierNodeProcessorFactory(
			icon = "http://travel.models.nasdanika.org/images/solo-traveller.svg", 
			description = "TODO ",
			documentation = """
					TODO										
                    """
	)
	public EClassNodeProcessor createCatalogProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
			@Override
			protected EList<? super Action> getMembersActionCollection(Action parent) {
				return parent.getChildren();
			}
			
			@Override
			protected EList<? super Action> getMembersCollection(Action membersAction) {
				return membersAction.getChildren();
			}
			
		};
	}
	
//	@EStructuralFeatureNodeProcessorFactory(
//			nsURI = TravelPackage.eNS_URI,
//			classID = TravelPackage.CATALOG,
//			featureID = TravelPackage.CATALOG__SCHEMAS,
//			description = "Catalog schemas",
//			documentation = 
//					"""
//					Catalog schemas. 					  					  				
//					
//					"""
//	)
//	public EReferenceNodeProcessor createSchemasProcessor(
//			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
//			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
//			BiConsumer<Label, ProgressMonitor> labelConfigurator,
//			ProgressMonitor progressMonitor) {		
//		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
//			
//			@Override
//			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
//				super.configureLabel(source, label, progressMonitor);
//				if (labelConfigurator != null) {
//					labelConfigurator.accept(label, progressMonitor);
//				}
//			}
//			
//		};
//	}

}
