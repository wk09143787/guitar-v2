package java.guitar.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
public class Dbutil {
	private static ComboPooledDataSource dataSource=new ComboPooledDataSource();
//	private static DataSource dataSource=null;
	 static {
		try {
//			Context initContext = new InitialContext();
//          Context envContext = (Context)
//                           initContext.lookup("java:/comp/env");
//          dataSource = (DataSource) envContext.lookup("jdbc/demo");
			dataSource.setDriverClass("org.sqlite.JDBC");
			dataSource.setJdbcUrl("jdbc:sqlite:C:\\Users\\ColdWater\\Desktop\\guitar.db3");
			dataSource.setUser("");
			dataSource.setPassword("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	 public static Connection getConnection(){
		 Connection conn=null;
		 try {
			 conn= Dbutil.dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	 }
	 public static boolean executeUpdate(String sql,Object[] args){
		 boolean sign=false;
		 Connection conn=null;
		 PreparedStatement pst=null;
		 try{
			 conn=dataSource.getConnection();
			 pst=conn.prepareStatement(sql);
			 if(args!=null&&args.length>0){
				 for(int i=0;i<args.length;i++){
					 pst.setObject(i+1, args[i]);
				 }
			 }
			 int rows=pst.executeUpdate();
			 sign=rows>0?true:false;
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return sign;
	 }
	 public static ResultSet executeQuery(String sql,Object[] args){
		 Connection conn=null;
		 PreparedStatement pst=null;
		 ResultSet rs=null;
		 try{
			 conn=Dbutil.dataSource.getConnection();
			 pst=conn.prepareStatement(sql);
			 if(args!=null&&args.length>0){
				 for(int i=0;i<args.length;i++){
					 pst.setObject(i+1, args[i]);
				 }
			 }
			 rs=pst.executeQuery();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	 public static void closeAll(ResultSet rs,Statement st,Connection conn){
		 try{
			 if(rs!=null) rs.close();
			 if(st!=null) st.close();
			 if(conn!=null) conn.close();
		 }catch(SQLException e){
			 e.printStackTrace();
		 }
	 }

}
