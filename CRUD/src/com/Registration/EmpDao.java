 package com.Registration;
    import java.util.*;  
    import java.sql.*;  
      
    public class EmpDao {  
      
        public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
        public static int save(Emp e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "insert into user(fname,sname,password,email) values (?,?,?,?)");  
                ps.setString(1,e.getFname());  
                ps.setString(2,e.getSname());  
                ps.setString(3,e.getPassword());  
                ps.setString(4,e.getEmail());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int update(Emp e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "update user set fname=?,sname=?,password=?,email=? where id=?");  
                ps.setString(1,e.getFname());  
                ps.setString(2,e.getSname());  
                ps.setString(3,e.getPassword());  
                ps.setString(4,e.getEmail());  
                ps.setInt(5,e.getId());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int delete(int id){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("delete from user where id=?");  
                ps.setInt(1,id);  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return status;  
        }  
        public static Emp getEmployeeById(int id){  
            Emp e=new Emp();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from user where id=?");  
                ps.setInt(1,id);  
                ResultSet rs=ps.executeQuery();  
                if(rs.next()){  
                    e.setId(rs.getInt(1));  
                    e.setFname(rs.getString(2));  
                    e.setSname(rs.getString(3));  
                    e.setPassword(rs.getString(4));  
                    e.setEmail(rs.getString(5));  
                }  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return e;  
        }  
        public static List<Emp> getAllEmployees(){  
            List<Emp> list=new ArrayList<Emp>();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from user");  
                ResultSet rs=ps.executeQuery();  
                while(rs.next()){  
                    Emp e=new Emp();  
                    e.setId(rs.getInt(1));  
                    e.setFname(rs.getString(2));  
                    e.setSname(rs.getString(3));  
                    e.setPassword(rs.getString(4));  
                    e.setEmail(rs.getString(5));  
                    list.add(e);  
                }  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return list;  
        }  
    }  