package com.imcore.common.model;

/**
 * 产品类表详细详情
 * 
 * @author Administrator
 * 
 */
public class CategoryDetail {
	// 实体类注意事项
	// 1.访问修饰符必须是public
	// 2.字段名称得跟JSON字符串中相应的key一致，包括大小写
	// 3.注意JSON字符串中的value的类型，带双引号
	public String imageUrl;
	public String name;
	public float price;
	public int id;
	public int categoryId;
	public String description;
	public String serialNo;

}