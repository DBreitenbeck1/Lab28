package co.grandcircus.Lab28;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.Lab28.model.WeatherResponse;

@Component
public class ApiService {

	private RestTemplate rt;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "what is this for?");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	
	public String[] getForecast(Double lat, Double longi) {
		
		String url ="https://forecast.weather.gov/MapClick.php?lat="+ lat + "&lon="
				+longi+"&FcstType=json";
		
		try{
		WeatherResponse response =rt.getForObject(url, WeatherResponse.class);
		
		return response.getData().getText();
		}catch(RestClientException e) {
			System.out.println("Location not found");
			return null;
		}
		
	}
	
		public List<String> getTime() {
		
		String url ="https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
			
		WeatherResponse response =rt.getForObject(url, WeatherResponse.class);
		
		return response.getTime().getName();
		
	}
		
		public String getArea(Double lat, Double longi) {
			
			String url ="https://forecast.weather.gov/MapClick.php?lat="+ lat + "&lon="
					+longi+"&FcstType=json";
				
			WeatherResponse response =rt.getForObject(url, WeatherResponse.class);
			
			return response.getLocation().getAreaDescription();
			
		}

	
	
	
}
