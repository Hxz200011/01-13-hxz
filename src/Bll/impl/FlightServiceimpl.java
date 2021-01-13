package Bll.impl;

import Dao.FlightDaoimpl;
import Dao.IFlightDao;
import Bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceimpl implements IFlightService {
    IFlightDao IFlightDao;//定义一个类
    public FlightServiceimpl(){
        IFlightDao =new FlightDaoimpl();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        IFlightDao.insertFlight(flight);
        System.out.println("界面传来的航班信息"+flight+"\n");

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String DepartureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String DestinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
