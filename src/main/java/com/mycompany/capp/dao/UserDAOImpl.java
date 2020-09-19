/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.dao;

import com.mycompany.capp.domain.User;
import com.mycompany.capp.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author manish
 */
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

    @Override
    public void save(User u) {
        String sql = "INSERT INTO user(name , phone , email , address , loginName , password , role , loginStatus)"
                + "VALUES(:name , :phone , :email , :address , :loginName , :password , :role , :loginStatus)";
        Map m = new HashMap();
        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("loginName", u.getLoginName());
        m.put("password", u.getPassword());
        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());

        KeyHolder kh = new GeneratedKeyHolder();
        SqlParameterSource ps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, ps, kh);
        Integer userid = kh.getKey().intValue();
        u.setUserid(userid);
    }

    @Override
    public void update(User u) {
        String sql = "UPDATE user"
                + " SET name=:name,"
                + "phone=:phone,"
                + "email=:email,"
                + "address=:address,"
                + "role=:role,"
                + "loginStatus=:loginStatus "
                + "WHERE userid=:userid";
        Map m = new HashMap();
        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());
        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());
        m.put("userid", u.getUserid());
        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(User u) {
        this.delete(u.getUserid());
    }

    @Override
    public void delete(Integer userid) {
        String sql = "DELETE FROM user where userid=?";
        getJdbcTemplate().update(sql, userid);
    }

    @Override
    public User findById(Integer userid) {
        String sql = "SELECT userid,name,phone,email,address,loginName,role,loginStatus"
                + " FROM user WHERE userId=?";
        User u = getJdbcTemplate().queryForObject(sql, new UserRowMapper(),userid);
        return u;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT userid,name,phone,email,address,loginName,role,loginStatus"
                + " FROM user";
        // List<User> users = getJdbcTemplate().query(sql, new UserRowMapper());
        return getJdbcTemplate().query(sql, new UserRowMapper());
    }

    @Override
    public List<User> findByProperty(String propName, Object propValue) {
        String sql = "SELECT userid,name,phone,email,address,loginName,role,loginStatus"
                + " FROM user WHERE "+propName+"=?";
        return getJdbcTemplate().query(sql, new UserRowMapper(),propValue);
    }

}
