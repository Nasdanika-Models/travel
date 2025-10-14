package org.nasdanika.models.travel.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.travel.TravelPackage;

@EPackageNodeProcessorFactory(nsURI = TravelPackage.eNS_URI)
public class EcoreGenTravelProcessorsFactory {

	private Context context;
	
	@Factory
	public final TravelerProcessorsFactory travelerProcessorsFactory;

	// TODO - other classes
	
	public EcoreGenTravelProcessorsFactory(Context context) {
		this.context = context;
		
		travelerProcessorsFactory = new TravelerProcessorsFactory(context);
	}
	
	@EPackageNodeProcessorFactory(
			label = "Travel Model",
			icon = "https://travel.models.nasdanika.org/images/journey-book.svg",
			description = "A model of travels/journeys for planning and memoirs",
			actionPrototype = """
                    app-action:
                      content:
                        content-markdown:
                          source:
                            content-resource:
                              location: travel.md
					"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
