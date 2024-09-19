package hello;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class HelloWorldResource {

	@Inject
	private HelloService helloService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Hello hello() {
		return new Hello(helloService.sayHello());
	}
}