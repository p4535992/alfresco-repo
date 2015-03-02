package org.smartlabs.core.cmis.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2015-03-01T13:47:38.358-04:30
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "RepositoryService", 
                  wsdlLocation = "https://cmis.alfresco.com/cmisws/NavigationService?wsdl",
                  targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/") 
public class RepositoryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RepositoryService");
    public final static QName RepositoryServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "RepositoryServicePort");
    static {
        URL url = null;
        try {
            url = new URL("https://cmis.alfresco.com/cmisws/NavigationService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RepositoryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://cmis.alfresco.com/cmisws/NavigationService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RepositoryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RepositoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RepositoryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns RepositoryServicePort
     */
    @WebEndpoint(name = "RepositoryServicePort")
    public RepositoryServicePort getRepositoryServicePort() {
        return super.getPort(RepositoryServicePort, RepositoryServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RepositoryServicePort
     */
    @WebEndpoint(name = "RepositoryServicePort")
    public RepositoryServicePort getRepositoryServicePort(WebServiceFeature... features) {
        return super.getPort(RepositoryServicePort, RepositoryServicePort.class, features);
    }

}