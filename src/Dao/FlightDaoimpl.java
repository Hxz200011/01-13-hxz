package Dao;

import Bean.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoimpl implements  IFlightDao {

    @Override
    public void insertFlight(Flight flight) throws SQLException {

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightid());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentseatsNumber());
        pstmt.setString(5,flight.getDepartureAirport());
        pstmt.setString(6,flight.getDestinationAirPort());
        pstmt.setString(7,flight.getDepartureTime());

        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> allFlights= new HashSet<Flight>();//容器

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql ="SELECT * FROM flight";
        PreparedStatement pstmt =conn.prepareStatement(sql);
        ResultSet rs =pstmt.executeQuery();


        while (rs.next()){
            String id =rs.getString("ID");
            String flightid =rs.getString("FLIGHT_ID");
            String planeType =rs.getString("PLANE_TYPE");
            int currentseatsNumber =rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport =rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort =rs.getString("DESTINATION_AIRPORT");
            String departureTime =rs.getString("DEPARTURE_TIME");

            Flight flight=new Flight(id,  flightid,  planeType, currentseatsNumber,
                    departureAirport, destinationAirPort,  departureTime);

            allFlights.add(flight);


        }
        return allFlights;
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
