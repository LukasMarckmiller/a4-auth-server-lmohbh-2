// CHECKSTYLE:OFF
// Never change a running System :-)
package edu.hm;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Start the application without an AppServer like tomcat.
 *
 * @author <a mailto:axel.boettcher@hm.edu>Axel B&ouml;ttcher</a>
 */
class JettyStarter {

    private static final String APP_URL = "/";
    private static final int PORT = 8083;
    private static final String WEBAPP_DIR = "./src/main/webapp/";

    /**
     * Deploy local directories using Jetty without needing a container-based deployment.
     *
     * @param args unused
     * @throws Exception might throw for several reasons.
     */
    public static void main(String... args) throws Exception {
        Server jetty = new Server(PORT);
        WebAppContext context = new WebAppContext(WEBAPP_DIR, APP_URL);
        jetty.setHandler(context);
        jetty.start();
        System.out.println("Jetty listening on port " + PORT);
        jetty.join();
    }

}