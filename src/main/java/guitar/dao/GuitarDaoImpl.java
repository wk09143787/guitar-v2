package java.guitar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import java.guitar.dbutil.Dbutil;
import java.guitar.entity.Guitar;
import java.guitar.entity.GuitarSpec;

public class GuitarDaoImpl implements GuitarDao {


	GuitarSpecDao guitarSpecDao = new GuitarSpecDaoImpl();

	@Override
	public List<Guitar> getAll() {
		
		List<Guitar> guitarList = new LinkedList<Guitar>();
		ResultSet rs = Dbutil.executeQuery("SELECT * FROM GUITAR", new Object[]{ });
		try{
			while(rs.next()){
				
				GuitarSpec guitarSpec = guitarSpecDao.queryGuitarSpecByserialNumber( rs.getString(3) );
				Guitar guitar = new Guitar(rs.getString(1), rs.getDouble(2), guitarSpec);
				guitarList.add(guitar);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarList;
	}

	@Override
	public Guitar getBySerialNumber(String serialNumber) {
		Guitar guitar = null;
		ResultSet rs = Dbutil.executeQuery("SELECT * FROM GUITAR WHERE serialNumber=?",
						new Object[]{ serialNumber });
		try{
			while(rs.next()){
				GuitarSpec guitarSpec = guitarSpecDao.queryGuitarSpecByserialNumber( rs.getString(3) );
				guitar = new Guitar(rs.getString(1), rs.getDouble(2), guitarSpec);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitar;
	}

	

}