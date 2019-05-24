package stringbenchmarking.ws.resource;

import java.io.IOException;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.ServerConfiguration;
import org.junit.Assert;
import org.junit.Test;

public class JHMStringenchmarkingExecuteResourceITest {

	@Test
	public void test() throws IOException {
//		Endpoint.publish("http://localhost:8000/junit", new JHMStringenchmarkingExecuteResource());
        HttpServer server = HttpServer.createSimpleServer("http://localhost/it-test", 8000);
        ServerConfiguration configuration = server.getServerConfiguration();
        configuration.setJmxEnabled(true);
		server.start();
		Assert.fail("Not yet implemented");
 
	}
}
