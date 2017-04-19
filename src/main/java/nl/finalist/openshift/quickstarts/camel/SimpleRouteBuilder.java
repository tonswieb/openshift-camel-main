package nl.finalist.openshift.quickstarts.camel;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("timer:foo?period=2000")
			.routeId("simple-route")
			.transform().method("myTransformer")
			.log(">>> ${body}");		
	}
}
