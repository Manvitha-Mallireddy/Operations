package com.DevOperations;

import java.util.ResourceBundle;

public class Operations {
public int add()
{
	ResourceBundle rs=ResourceBundle.getBundle("config");
	int x=Integer.parseInt(rs.getString("a"));
	int y=Integer.parseInt(rs.getString("b"));
	return x+y;
}
public int sub()
{
	ResourceBundle rs=ResourceBundle.getBundle("config");
	int x=Integer.parseInt(rs.getString("a"));
	int y=Integer.parseInt(rs.getString("b"));
	return x-y;
}
public int multi()
{
	ResourceBundle rs=ResourceBundle.getBundle("config");
	int x=Integer.parseInt(rs.getString("a"));
	int y=Integer.parseInt(rs.getString("b"));
	return x*y;
}
public int div()
{
	ResourceBundle rs=ResourceBundle.getBundle("config");
	int x=Integer.parseInt(rs.getString("a"));
	int y=Integer.parseInt(rs.getString("b"));
	return x/y;
}
}
