package edu.msg.ro.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.msg.ro.dos.WeatherCondition;

/**
 * Weather condition service.
 */
@Path("/json/weather")
public class JSONWeatherService {

	/**
	 * http://127.0.0.1:8080/RESTfulExample/example/json/weather/get/
	 * 
	 * @return the current weather condition.
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public WeatherCondition getWeatherInJSON() {
		WeatherCondition weatherCondition = new WeatherCondition();
		weatherCondition.setCondition("Raining");
		weatherCondition.setTemperature(12);

		return weatherCondition;
	}

	/**
	 * http://127.0.0.1:8080/RESTfulExample/example/json/weather/post/
	 * 
	 * @param condition
	 *            the condition to save.
	 * @return the status.
	 */
	@POST
	@Path("/post")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response saveWatherInJSON(WeatherCondition condition) {
		String result = "Current weather saved: " + condition;

		return Response.status(201).entity(result).build();
	}
}