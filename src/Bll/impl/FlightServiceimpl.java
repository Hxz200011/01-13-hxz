package Bll.impl;

import Dao.FlightDaoimpl;
import Dao.IFlightDao;
import Bean.Flight;

import java.sql.*;
import java.util.Set;

import static javafx.scene.input.KeyCode.V;

public class FlightServiceimpl implements IFlightService {
    IFlightDao iFlightDao;//定义一个类
    public FlightServiceimpl(){
        iFlightDao =new FlightDaoimpl();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);

    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {

        return iFlightDao.getAllFlights();
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
