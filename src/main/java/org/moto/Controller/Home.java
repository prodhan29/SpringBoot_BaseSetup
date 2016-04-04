package org.moto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Nahid on 4/4/2016.
 */

@Controller
public class Home {

    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping("/home")
    @ResponseBody
    public String home(){

        List ls =  jdbc.queryForList("SELECT * from notices ");
        System.out.println(ls);
        return "List of all: "+ls.toString();

    }
}
