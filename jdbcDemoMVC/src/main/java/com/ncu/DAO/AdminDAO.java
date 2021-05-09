package com.ncu.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncu.model.User;

@Repository
public class AdminDAO implements AdminDaoInterface {


	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void AdminDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public int checkCredential(String username,String password) {
		String sqlQuery = "select count(*) from Users where username = '"+username+"' and password = '"+password+"' and  accType = 'Admin' ";
		int verification = this.jdbcTemplate.queryForObject(sqlQuery,Integer.class);
		return verification;
	}
	
	@Override
	public List<User> showEmployees() {
		List<User> employees = this.jdbcTemplate.query(
		        "select * from Users where accType='Guest'",
		        new RowMapper<User>() {
		            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	 User user = new User();
			               user.setUsername(rs.getString(1));
			               user.setFname(rs.getString(4));
			               user.setMinit(rs.getString(5));
			               user.setLname(rs.getString(6));
			               user.setSsn(rs.getInt(7));
			               user.setBdate(rs.getInt(8));
			               user.setAddress(rs.getString(9));
			               user.setSex(rs.getString(10));
			               user.setSalary(rs.getInt(11));
			               user.setSuperSsn(rs.getInt(12));
			               user.setDno(rs.getInt(13));
			               return user;
		            }
		        });
		return employees;
	}

	@Override
	public User getUserobj(String username) {
		User user = this.jdbcTemplate.queryForObject(
		        "select * from Users where username = ?",
		        new Object[]{username},
		        new RowMapper<User>() {
		            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		                User user = new User();
		                user.setUsername(rs.getString(1));
		                user.setAccType(rs.getString(3));
		                user.setFname(rs.getString(4));
		                user.setMinit(rs.getString(5));
		                user.setLname(rs.getString(6));
		                user.setSsn(rs.getInt(7));
		                user.setBdate(rs.getInt(8));
		                user.setAddress(rs.getString(9));
		                user.setSex(rs.getString(10));
		                user.setSalary(rs.getInt(11));
		                user.setSuperSsn(rs.getInt(12));
		                user.setDno(rs.getInt(13));
		                return user;
		            }
		        });
		return user;
	}

	@Override
	public void editEmployee(String target,User user) {
		
		this.jdbcTemplate.update("UPDATE `demospringdb`.`Users` SET `Salary` = '"+user.getSalary()+"', `Dno` = '"+user.getDno()+"' WHERE (`username` = '"+target+"')");
	}

	@Override
	public void deleteEmployeeData(String username) {
		this.jdbcTemplate.update(
		        "delete from Users where username = ?", 
		         username);
		
	}

	
	
}
