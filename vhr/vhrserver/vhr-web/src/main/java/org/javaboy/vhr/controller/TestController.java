package org.javaboy.vhr.controller;

import org.javaboy.vhr.model.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @author meehom
 * @data 2022/8/17 - 19:45
 */

@RestController
public class TestController {

	@RequestMapping("/test")
	public RespBean testException() throws SQLException {
		SQLException exp = new SQLException();
		throw exp;
	}
}
