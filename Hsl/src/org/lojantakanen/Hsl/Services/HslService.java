package org.lojantakanen.Hsl.Services;

import java.util.List;

import org.lojantakanen.Hsl.Model.Route;
import org.lojantakanen.Hsl.Model.Stop;

import retrofit.http.GET;
import retrofit.http.Query;

public interface HslService {
	@GET("/hsl/routes")
	public List<Route> getRoute(@Query("lines") String lines);
	
	@GET("/hsl/stops")
	public List<Stop> getStops(@Query("BBOX") String bbox, @Query("max") int max);
}
