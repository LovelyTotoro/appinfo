package com.app.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.apache.log4j.helpers.DateTimeDateFormat;

public class data_dictionary {
	private int id;
	private String typeCode;
	private String typeName;
	private int valueId;
	private String valueName;
	private int createdBy;
	private Date creationDate;
	private int modifyBy;
	private Date modifyDate; 
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //从前端或者自己模拟一个日期格式，转为String即可
	//    String dateStr = format.format(date);
	//    String sql="insert into t_pay_info(title,content,price,type_id,contact,phone,insert_dt)"
	//                +"values(?, ?, ?, ?, ?, ?, ?);";
	//    String[] params = {"初中英语辅导","擅长初中英语辅导，能够与学生进行良好的沟通，稳步提升学生成绩","100", "3","Latinyrain","15185077780",dateStr};
	//    DBUtil.update(sql, params);

}
