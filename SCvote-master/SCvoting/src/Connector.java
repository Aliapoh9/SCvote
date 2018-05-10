import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

import javax.imageio.ImageIO;

public class Connector {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Connector(){
		try{
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sc_candidates", "root", "");
				st = con.createStatement();
				
		}catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public int getAmount(){
		int amountC = 0;
		try {
			String query = "select * from candidates";
			rs = st.executeQuery(query);
			
			while (rs.next()) {
			
				amountC += 1;
				
			}
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}	
		return amountC;
	}
	
	public String getPosition(int RID){
		String position = "";
		try {
			String query = "select * from candidates where RegistrationID = " + RID;
			rs = st.executeQuery(query);
			
			while (rs.next()) {
			
				position = rs.getString("Position");
				
			}
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
		return position;
	}
	
	public String getName(int RID){
		String name = "";
		try {
			String query = "select * from candidates where RegistrationID = " + RID;
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				String firstName = rs.getString("Firstname");
				String lastName = rs.getString("Lastname");
				name = String.format("%s %s", firstName, lastName);
				
			}
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
		return name;
	}
	
	public BufferedImage getPicture(int RID){
		BufferedImage image = null;
		try {
			String query = "select * from candidates where RegistrationID = " + RID;
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				Blob blob = rs.getBlob(4);
				InputStream binaryStream = blob.getBinaryStream();
				image = ImageIO.read(binaryStream);
			}
			
			
		}
		catch(Exception ex){
			System.out.print(ex);
		}
		return image;
		
	}
	
	public BufferedImage getNullPicture(int i){
		BufferedImage image = null;
		try {
			String query = "select * from nullpic where ID = " + i;
			rs = st.executeQuery(query);
			
			while (rs.next()) {
				Blob blob = rs.getBlob(1);
				InputStream binaryStream = blob.getBinaryStream();
				image = ImageIO.read(binaryStream);
			}
			
			
		}
		catch(Exception ex){
			System.out.print(ex);
		}
		return image;
		
	}
	
	public void registerTotalVote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Total Vote`= `Total Vote` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	public void registerHsVote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Highschool`= `Highschool` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	public void registerMsVote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Middle`= `Middle` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	public void registerEsVote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Elementary`= `Elementary` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	public void registerG1Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 1`= `Grade 1` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	public void registerG2Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 2`= `Grade 2` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG3Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 3`= `Grade 3` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG4Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 4`= `Grade 4` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG5Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 5`= `Grade 5` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG6Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 6`= `Grade 6` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG7Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 7`= `Grade 7` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG8Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 8`= `Grade 8` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG9Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 9`= `Grade 9` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG10Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 10`= `Grade 10` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG11Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 11`= `Grade 11` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}
	public void registerG12Vote(String name){
		try {
			System.out.println(name);
			String query = String.format("UPDATE `scores` SET `Grade 12`= `Grade 12` + 1  WHERE `Name` = '%s'", name);
			st.executeUpdate(query);
			
			
		} catch(Exception ex){
			System.out.print(ex);
		}
	}

};
