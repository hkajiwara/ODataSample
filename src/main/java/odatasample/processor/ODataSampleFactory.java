package odatasample.processor;

import org.apache.olingo.odata2.api.*;
import org.apache.olingo.odata2.api.exception.*;
import org.apache.olingo.odata2.api.processor.ODataContext;
import org.apache.olingo.odata2.annotation.processor.api.AnnotationServiceFactory;

public class ODataSampleFactory extends ODataServiceFactory {
	
	private static class AnnotationInstances {
		final static String MODEL_PACKAGE = "odatasample.model";
		final static ODataService ANNOTATION_ODATA_SERVICE;
		
		static {
			try {
				ANNOTATION_ODATA_SERVICE = AnnotationServiceFactory.createAnnotationService(MODEL_PACKAGE);
			} catch (ODataApplicationException ex) {
				throw new RuntimeException("Exception during sample data generation.", ex);
			} catch (ODataException ex) {
				throw new RuntimeException("Exception during data source initialization generation.", ex);
			}
		}
	}
	
	@Override
	public ODataService createService(final ODataContext context) throws ODataException {
		return AnnotationInstances.ANNOTATION_ODATA_SERVICE;
	}
}