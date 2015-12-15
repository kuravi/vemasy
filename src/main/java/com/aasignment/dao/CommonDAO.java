package com.aasignment.dao;
/**
 * this class implements GenericDAO 
 * link {@* Control classes}
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aasignment.model.Vehical;


public class CommonDAO  implements GenericDAO{
	private static final Logger logger = LoggerFactory.getLogger(CommonDAO.class);
	private Connection conn = null;	
	private DataSource dataSource;

	
	public List<Vehical> getAllVehicalsbyOwner(String ownerId) {
		logger.info("passed id "+ownerId);
		List<Vehical> ownersVehicals = new ArrayList<Vehical>();
		String sql = "SELECT * FROM VEHICAL ";
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setString(1, ownerId);
			List<Vehical> vehicalList =  new ArrayList<Vehical>();
			Vehical vehical  = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				vehical = new Vehical(
						rs.getString("VEHICAL_NUMBER"),
						rs.getString("DESCRIPTION"), 
						rs.getString("VEHICAL_TYPE")
				);
			vehicalList.add(vehical);
			}
			rs.close();
			ps.close();
			return vehicalList ;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	
	
	public Vehical findVehicalbyNumber(String vehId){
			
			String sql = "SELECT * FROM VEHICAL WHERE VEHICAL_NUMBER = ?";
			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, vehId);
				Vehical vehical  = null;
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					vehical = new Vehical(
							rs.getString("VEHICAL_NUMBER"),
							rs.getString("DESCRIPTION"), 
							rs.getString("VEHICAL_TYPE")
					);
				}
				rs.close();
				ps.close();
				return vehical ;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				if (conn != null) {
					try {
					conn.close();
					} catch (SQLException e) {}
				}
			}
	}
	
	
	
	public void addVehical(Vehical vehical) {
		logger.info("add Vehicalsby ID : "+vehical.getNumber() + "Descrition "+vehical.getDescription() );
		
		try{
			conn = dataSource.getConnection();
			String sql = "INSERT INTO VEHICAL (VEHICAL_NUMBER,DESCRIPTION,VEHICAL_TYPE)VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vehical.getNumber());
			ps.setString(2, vehical.getDescription());
			ps.setString(3, vehical.getType());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	@Override
	public void updateVehical(Vehical vehical) {
			logger.info("update Vehicalsby ID : "+vehical.getNumber() + "Descrition "+vehical.getDescription() );
		
		try{
			conn = dataSource.getConnection();
			String sql = "UPDATE VEHICAL SET (DESCRIPTION,VEHICAL_TYPE)VALUES (?,?) WHERE VEHICAL_NUMBER = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, vehical.getDescription());
			ps.setString(2, vehical.getType());
			ps.setString(3, vehical.getNumber());
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}



	@Override
	public void deleteVehical(String id) {
		logger.info("update Vehical ID : "+id );
		
		try{
			conn = dataSource.getConnection();
			String sql = "DELETE FROM  VEHICAL  WHERE VEHICAL_NUMBER = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setString(1, id);
			ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
