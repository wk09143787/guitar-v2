package guitar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import guitar.dbutil.Dbutil;
import guitar.entity.Builder;
import guitar.entity.GuitarSpec;
import guitar.entity.Type;
import guitar.entity.Wood;

public class GuitarSpecDaoImpl implements GuitarSpecDao {


	@Override
	public GuitarSpec queryGuitarSpec(GuitarSpec guitarSpec) {
		GuitarSpec gSpec = null;
		ResultSet rs = Dbutil.executeQuery("SELECT * FROM GUITARSPEC WHERE serialNumber=? AND builder = ?"
						+ " AND model = ? AND type = ? AND numStrings = ? AND backWood = ? AND topWood = ?", 
						new Object[]{guitarSpec.getSerialNumber(), guitarSpec.getBuilder().toString(), guitarSpec.getModel().toString(), 
								guitarSpec.getType().toString(), guitarSpec.getNumStrings(), guitarSpec.getBackWood().toString(),
								guitarSpec.getTopWood().toString()});
		try{
			while(rs.next()){
				gSpec = new GuitarSpec(Builder.valueOf(rs.getString(2).toUpperCase()),
							rs.getString(3), Type.valueOf(rs.getString(4).toUpperCase()),
							rs.getInt(5), Wood.valueOf(rs.getString(6).toUpperCase()),
							Wood.valueOf(rs.getString(7).toUpperCase()));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return gSpec;
	}

	@Override
	public GuitarSpec queryGuitarSpecByserialNumber(String serialNumber) {
		GuitarSpec gSpec = null;
		ResultSet rs = Dbutil.executeQuery("SELECT * FROM GUITARSPEC WHERE serialNumber=?",
						new Object[]{ serialNumber });
		try{
			while(rs.next()){
				gSpec = new GuitarSpec(Builder.valueOf(rs.getString(2).toUpperCase()),
							rs.getString(3), Type.valueOf(rs.getString(4).toUpperCase()),
							rs.getInt(5), Wood.valueOf(rs.getString(6).toUpperCase()),
							Wood.valueOf(rs.getString(7).toUpperCase()));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return gSpec;
	}

}