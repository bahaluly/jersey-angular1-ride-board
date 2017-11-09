package net.gesher.rides.server.services;

import net.gesher.rides.server.dal.RideDal;
import net.gesher.rides.server.entity.Ride;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import java.util.Date;
import java.util.List;

@Path("ride")
public class RideRestService {

    @GET
    @Path("today")
    public List<Ride> getTodayRides(
            @Context ApplicationProvider applicationProvider
    ){
        return new RideDal(ApplicationProvider.getSessionManager()).getSingleDayRides(new Date());
    }
}
