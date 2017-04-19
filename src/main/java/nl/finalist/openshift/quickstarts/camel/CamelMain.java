package nl.finalist.openshift.quickstarts.camel;

import org.apache.camel.main.Main;

public class CamelMain {

	private Main main;
	
	public static void main(String[] args) throws Exception {
		CamelMain camelMain = new CamelMain();
		camelMain.boot();
	}

    public void boot() throws Exception {
        // create a Main instance
        main = new Main();
        // bind MyBean into the registry
        main.bind("myTransformer", new MyTransformer());
        // add routes
        main.addRouteBuilder(new SimpleRouteBuilder());
        // add event listener
//        main.addMainListener(new Events());
        // set the properties from a file
//        main.setPropertyPlaceholderLocations("example.properties");
        // run until you terminate the JVM
        main.run();
    }
}
