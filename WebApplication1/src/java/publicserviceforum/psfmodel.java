/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publicserviceforum;
/**
 *
 * @author MANMOHAN SINGH
 */
import java.util.ArrayList;
import java.sql.*;
import sun.security.util.Password;
public class psfmodel {
  PreparedStatement pst;
    ResultSet rst;
    ConnectClass cobj ;
public void changeApplicationObjection(String appid,String date,String description)
    {
        cobj = new ConnectClass();
        cobj.connect();
        try
        {
            System.out.print(date);
            pst = cobj.con.prepareStatement("update tb_Application set objectiondate=?, objectiondetail=? where Application_id=?");
            pst.setString(1,date);
            pst.setString(2,description);
            pst.setLong(3,Long.parseLong(appid));
            pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("problem in the method applyservice"+ex);
        }
        finally
        {
            cobj.disconnect();
        }


}
    public void changeStatusAccepted(String appid)
    {
        cobj = new ConnectClass();
        cobj.connect();
        try
        {
            System.out.print(appid);
            pst = cobj.con.prepareStatement("update tb_Application set status='Accepted' where Application_id=?");
            pst.setLong(1,Long.parseLong(appid));
            pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("problem in the method applyservice"+ex);
        }
        finally
        {
            cobj.disconnect();
        }

    }
public boolean applyServiceSave(String userid,String cityid,String serviceid,String date1,String description)
    {
        boolean flag = false;
        System.out.println("entered apply service model"+date1);
        cobj = new ConnectClass();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareCall("{call applyservice(?,?,?,?,?)}");
            pst.setLong(1,Long.parseLong(userid));
            pst.setLong(2,Long.parseLong(cityid));
            pst.setLong(3,Long.parseLong(serviceid) );
            pst.setString(4,date1 );
            pst.setString(5,description );

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the method applyservice"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        //System.out.println("exiting in the method serviceCityMappingSave");
    return flag;
    }


    public boolean signupSave(String adhar, String name, String lname, String fname, String mname, String blood, String category, String qualification, String dob, String hno, String address, String city, String tehsil, String district, String state, String pincode, String pancard, String voter, String email, String pssword)
    {
        boolean flag = false;
        System.out.println("entered sign up model");
        cobj = new ConnectClass();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareCall("{call formsave(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pst.setString(1, adhar);
             pst.setString(2,name );
pst.setString(3,lname );
pst.setString(4,fname );
pst.setString(5,mname );
pst.setString(6,blood );
pst.setString(7,category );
pst.setString(8,qualification );
pst.setString(9,dob );
pst.setString(10,hno );
pst.setString(11,address );
pst.setString(12,city );
pst.setString(13,tehsil );
pst.setString(14,district );
pst.setString(15,state );
pst.setLong(16,Long.parseLong(pincode) );
pst.setString(17,pancard );
pst.setString(18,voter );
pst.setString(19,email );
pst.setString(20,pssword );

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method signupSave"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method serviceCityMappingSave");
        
    return flag;
    }

public boolean signupUpdate(String signupid,String adhar, String name, String lname, String fname, String mname, String blood, String category, String qualification, String dob, String hno, String address, String city, String tehsil, String district, String state, String pincode, String pancard, String voter, String email, String pssword)
    {
        boolean flag = false;
        System.out.println("entered myprofile model"+signupid);
        cobj = new ConnectClass();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareCall("{call myprofileupdate(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            pst.setLong(1, Long.parseLong(signupid));
            pst.setString(2, adhar);
             pst.setString(3,name );
            pst.setString(4,lname );
pst.setString(5,fname );
pst.setString(6,mname );
pst.setString(7,blood );
pst.setString(8,category );
pst.setString(9,qualification );
pst.setString(10,dob );
pst.setString(11,hno );
pst.setString(12,address );
pst.setString(13,city );
pst.setString(14,tehsil );
pst.setString(15,district );
pst.setString(16,state );
pst.setLong(17,Long.parseLong(pincode) );
pst.setString(18,pancard );
pst.setString(19,voter );
pst.setString(20,email );
pst.setString(21,pssword );

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method signupSave"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method serviceCityMappingSave");

    return flag;
    }

    public boolean serviceCityMappingSave(String cityid , String serviceid)
    {
        System.out.println("enter in the method serviceCityMappingSave");
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag = false;
        try
        {
            pst = cobj.con.prepareCall("{call mappingCityServiceSave(?,?)}");
            pst.setLong(1, Long.parseLong(cityid));
             pst.setLong(2, Long.parseLong(serviceid));

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method serviceCityMappingSave"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method serviceCityMappingSave");
        return flag;
    }

     public boolean serviceSave(String servicename , String sectionid ,String deptid ,String document)
    {
        System.out.println("enter in the method serviceSave");
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag = false;
        try
        {
            pst = cobj.con.prepareCall("{call serviceSave(?,?,?,?)}");
            pst.setString(1, servicename);
            pst.setLong(2, Long.parseLong(sectionid));
             pst.setLong(3, Long.parseLong(deptid));
             pst.setString(4, document);

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method service"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method service");
        return flag;
    }

      public boolean loginSave(String username , String password)
    {
        System.out.println("enter in the method loginSave");
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag = false;
        try
        {
            pst = cobj.con.prepareCall("{call loginSave(?,?)}");
           pst.setString(1, username);
           pst.setString(2, password);

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method Login Save"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method Loginsave");
        return flag;
    }
       public boolean checkAdminLogin(String un ,String pw)
    {
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag= false;
        try
        {
            pst = cobj.con.prepareStatement("Select * from tb_login where username=? and password = ?");
            pst.setString(1,un);
            pst.setString(2,pw);
            rst = pst.executeQuery();
            if(rst.next())
            {
                flag = true;
            }
            rst.close();
        }
        catch(Exception ex)
        {
        System.out.print("Error in login" + ex);
        }
        cobj.disconnect();
        return flag;
    }
       public boolean changeadminpassword(String un ,String pw, String npw)
    {
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag= false;
        try
        {
            pst = cobj.con.prepareStatement("update tb_login set password = ? where username=? and password = ?");
            pst.setString(1,npw);
            pst.setString(2,un);
            pst.setString(3,pw);
            if(pst.executeUpdate()>0)
            {
                flag = true;
            }
           // rst.close();
        }
        catch(Exception ex)
        {
        System.out.print("Error in admin change password" + ex);
        }
        cobj.disconnect();
        return flag;
    }

       public boolean changeuserpassword(String un ,String pw, String npw)
    {
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag= false;
        try
        {
            pst = cobj.con.prepareStatement("update tb_signup set password = ? where email_id=? and password = ?");
            pst.setString(1,npw);
            pst.setString(2,un);
            pst.setString(3,pw);
            if(pst.executeUpdate()>0)
            {
                flag = true;
            }
         //   rst.close();
        }
        catch(Exception ex)
        {
        System.out.print("Error in user change password" + ex);
        }
        cobj.disconnect();
        return flag;
    }

       public long checkUserLogin(String un ,String pw)
    {
        cobj = new ConnectClass();
        cobj.connect();
        long flag= 0;
        try
        {
            pst = cobj.con.prepareStatement("Select * from tb_signup where Aadhaar_Card_No=? and password = ?");
            pst.setString(1,un);
            pst.setString(2,pw);
            rst = pst.executeQuery();
            if(rst.next())
            {
                flag = rst.getLong(1);
            }
            rst.close();
        }
        catch(Exception ex)
        {
        System.out.print("Error in user login" + ex);
        }
        cobj.disconnect();
        return flag;
    }



        public boolean citySave(String CityName)
    {
        boolean flag=false;
         cobj = new ConnectClass();
        cobj.connect();

        try
        {
            pst=cobj.con.prepareCall("{call CitySave(?)}");
            pst.setString(1,CityName);

            if(pst.execute()==false)
            {
                if(pst.getUpdateCount()>0)
                    flag=true;
            }
        }

        catch(Exception ex)
        {
            System.out.println("method save dept problem"+ex);
        }

        finally
        {
            cobj.disconnect();
        }

        return flag;
    }


        public boolean sectionSave(String SectionName)
    {
         System.out.println("enter in section save");
        boolean flag=false;
         cobj = new ConnectClass();
        cobj.connect();

        try
        {
            pst=cobj.con.prepareCall("{call SectionSave(?)}");
            pst.setString(1,SectionName);

            if(pst.execute()==false)
            {
                if(pst.getUpdateCount()>0)
                    flag=true;
            }
        }

        catch(Exception ex)
        {
            System.out.println("method save section problem"+ex);
        }

        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in section save");

        return flag;
    }

    public boolean departmentSave(String DepartmentName, String DepartmentCity, String DepartmentAddress,
                                  String DepartmentImage, String DepartmentMap,String OfficerName,String OfficerContact
                                  ,String OfficerEmail)
    {
        System.out.println("Entered in dept save method");
        boolean flag=false;
        cobj = new ConnectClass();
        cobj.connect();

        try
        {
            pst=cobj.con.prepareCall("{call DepartmentSave(?,?,?,?,?,?,?,?)}");
            pst.setString(1,DepartmentName);
            pst.setString(2,DepartmentCity);
            pst.setString(3,DepartmentAddress);
            pst.setString(4,DepartmentImage);
            pst.setString(5,DepartmentMap);
            pst.setString(6,OfficerName);
            pst.setString(7,OfficerContact);
            pst.setString(8,OfficerEmail);


            if(pst.execute()==false)
            {
                if(pst.getUpdateCount()>0)
                    flag=true;
            }
        }

        catch(Exception ex)
        {
            System.out.println("method save dept problem"+ex);
        }

        finally
        {
            cobj.disconnect();
        }
        System.out.println("Exiting in dept save method");

        return flag;
    }

    public ArrayList citySelect(String cityid)
    {
        System.out.println("enter in the city select method"+ cityid);
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_city where city_id = ?");
            pst.setLong(1,Long.parseLong(cityid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the city select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the city select method");
        return aobj;
    }

      public boolean cityUpdate(String id,String city )
    {
        System.out.println("enter in city update method ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call cityUpdate(?,?)}");

              
                    pst.setLong(1,Long.parseLong(id));
                    pst.setString(2,city);
                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;

        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in city update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in city updat");
        return flag;
}

public ArrayList deptSelect(String deptid)
    {
        System.out.println("enter in the dept select method");
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_department where dept_id = ?");
            pst.setLong(1,Long.parseLong(deptid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
                aobj.add(rst.getString(3).trim());
                aobj.add(rst.getString(4).trim());
                aobj.add(rst.getString(5).trim());
                aobj.add(rst.getString(6).trim());
                aobj.add(rst.getString(7).trim());
                aobj.add(rst.getString(8).trim());
                aobj.add(rst.getString(9).trim());
            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the dept select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the dept select method");
        return aobj;
    }
        public boolean deptUpdate(String deptid,String DepartmentName, String DepartmentCity, String DepartmentAddress,
                                  String DepartmentImage, String DepartmentMap,String OfficerName,String OfficerContact
                                  ,String OfficerEmail )
    {
        System.out.println("enter in city update method dept ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call departmentupdate(?,?,?,?,?,?,?,?,?)}");
                pst.setLong(1,Long.parseLong(deptid));
                pst.setString(2,DepartmentName);
                     pst.setString(3,DepartmentCity);
                      pst.setString(4,DepartmentAddress);
                      pst.setString(5,DepartmentImage);
                      pst.setString(6,DepartmentMap);
                      pst.setString(7,OfficerName);
                      pst.setString(8,OfficerContact);
                      pst.setString(9,OfficerEmail);
                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in dept update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in dept updat");
        return flag;
}

          public ArrayList sectionSelect(String sid)
    {
        System.out.println("enter in the section select method");
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_section where section_id = ?");
            pst.setLong(1,Long.parseLong(sid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the section select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the section select method");
        return aobj;
    }
            public boolean sectionUpdate(String id,String section )
    {
        System.out.println("enter in section update method ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call sectionUpdate(?,?)}");
                pst.setLong(1,Long.parseLong(id));
               pst.setString(2,section);
                    

                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;

        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in section update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in section updat");
        return flag;
}
             public ArrayList serviceCitySelect(String mid)
    {
        System.out.println("enter in the citysection select method");
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_mapping where mapping_id = ?");
            pst.setLong(1,Long.parseLong(mid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
                aobj.add(rst.getString(3).trim());
            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the cityservice select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the cityservice select method");
        return aobj;
    }
             public boolean servicecityUpdate(String id,String city,String service )
    {
        System.out.println("enter in servicecityUpdate update method ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call mappingCityServiceUpdate(?,?,?)}");

               pst.setString(2,city);
               pst.setString(3,service);
                    pst.setLong(1,Long.parseLong(id));

                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;

        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in servicecity update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in servicecity updat");
        return flag;
}



                public ArrayList serviceSelect(String sid)
    {
        System.out.println("enter in the section select method");
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_service where service_id = ?");
            pst.setLong(1,Long.parseLong(sid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
                aobj.add(rst.getString(3).trim());
                aobj.add(rst.getString(4).trim());
                aobj.add(rst.getString(5).trim());
            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the service select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the service select method");
        return aobj;
    }
                 public boolean serviceUpdate(String id,String service,String sectionid,String deptid,String document )
    {
        System.out.println("enter in service update method ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call serviceUpdate(?,?,?,?,?)}");

               pst.setString(2,service);
               pst.setString(5,document);
                    pst.setLong(1,Long.parseLong(id));
                    pst.setLong(3,Long.parseLong(sectionid));
                    pst.setLong(4,Long.parseLong(deptid));

                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;

        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in service update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in service updat");
        return flag;
}

    public boolean feedbackSave(String signupid , String description ,String date)
    {
        System.out.println("enter in the method fed back");
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag = false;
        try
        {
            pst = cobj.con.prepareCall("{call feedbackSave(?,?,?)}");
            pst.setLong(1, Long.parseLong(signupid));
            pst.setString(2, description);
            pst.setString(3,date);

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method save"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method service");
        return flag;
    }


              public boolean newsSave(String title , String description ,String date)
    {
        System.out.println("enter in the method newssave");
        cobj = new ConnectClass();
        cobj.connect();
        boolean flag = false;
        try
        {
            pst = cobj.con.prepareCall("{call newssave(?,?,?)}");
            pst.setString(1,title);
            pst.setString(2, description);
            pst.setString(3,date);

             if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;
                    }

        }
        catch(Exception ex)
        {
            System.out.println("problem in the method news save"+ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in the method news save");
        return flag;
    }

                       public ArrayList newsSelect(String mid)
    {
        System.out.println("enter in the  news select method");
        cobj = new ConnectClass();
        ArrayList aobj = new ArrayList();
        cobj.connect();
        try
        {
            pst = cobj.con.prepareStatement("select * from tb_news where news_id = ?");
            pst.setLong(1,Long.parseLong(mid));
            rst = pst.executeQuery();
            while(rst.next())
            {
                aobj.add(rst.getString(1).trim());
                aobj.add(rst.getString(2).trim());
                aobj.add(rst.getString(3).trim());
                 aobj.add(rst.getString(4).trim());

            }
        }
        catch(Exception ex)
        {
            System.out.println("problem in the news select method"+ex);
        }
     finally
        {
            cobj.disconnect();
        }
        System.out.println("exit from the news select method");
        return aobj;
    }

   public boolean newsupdate(String id,String title,String description , String date )
    {
        System.out.println("enter in news update method ");
         cobj = new ConnectClass();
        cobj.connect();
      boolean flag = false;
        PreparedStatement pst;
        ResultSet rst;
        try
        {
            pst = cobj.con.prepareCall("{call newsUpdate(?,?,?,?)}");

                     pst.setString(2,title);
                       pst.setString(3,description);
                    pst.setLong(1,Long.parseLong(id));
                     pst.setString(4,date);
                    if(pst.execute()==false)
                    {
                        if(pst.getUpdateCount()>0)
                    flag = true;

        }
        }
        catch(Exception ex)
        {
        System.out.println("Error in news update" + ex);
        }
        finally
        {
            cobj.disconnect();
        }
        System.out.println("exiting in news updat");
        return flag;
}

}
