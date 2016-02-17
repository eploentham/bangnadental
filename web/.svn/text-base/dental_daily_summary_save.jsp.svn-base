<%-- 
    Document   : dental_daily_summary_save
    Created on : 12 Ê.¤. 2552, 20:23:44
    Author     : pop
--%>

<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="bangnadental.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
DentalTDailySummary dentaldaily = new DentalTDailySummary();
DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
DentalTDailySummaryDB dentaldailydb = new DentalTDailySummaryDB();
String branch_id="", flag_redirect="", dental_daily_id="",dental_date="", text="",uc_treatment="";
String uc_prevention="",patient_cnt_vn="",patient_cnt="",patient_summary="",remark="";
String flag="", row1="", dental_time="",patient_fullnamet="", patient_hn_id="", patient_vn_id="";
String paid_category_namet="", paid="", doctor_id="", doctor_namet="", paid_service="";
String paid_pharmacy="", paid_lab="", paid_x_ray="", discount="", cash="", credit="";
String dental_daily_detail_id="",dental_category="",dental_active="";
Integer row=0;
try{

    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else{
        flag_redirect = "";
        }
    if(request.getParameter("flag")!=null){
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        flag = flag.trim();
        }
    else{
        flag = "";
        }
    if(request.getParameter("txt_dental_daily_id")!=null){
        dental_daily_id = new String (request.getParameter("txt_dental_daily_id").getBytes("ISO8859_1"),"TIS-620");
        dental_daily_id = dental_daily_id.trim();
        }
    else{
        dental_daily_id = "";
        }
    dentaldaily.setDentalDailyId(dental_daily_id);
    if(request.getParameter("txt_dental_active")!=null){
        dental_active = new String (request.getParameter("txt_dental_active").getBytes("ISO8859_1"),"TIS-620");
        dental_active = dental_active.trim();
        }
    else{
        dental_active = "";
        }
    if(dental_active.equals("")){
        dental_active="1";
        }
    dentaldaily.setDentalActive(dental_active);
    if(request.getParameter("txt_dental_date")!=null){
        dental_date = new String (request.getParameter("txt_dental_date").getBytes("ISO8859_1"),"TIS-620");
        dental_date = dental_date.trim();
        }
    else{
        dental_date = "";
        }
    //dental_date = config1.DateFormatShow2DB(dental_date, "ddMMyyyy");
    dentaldaily.setDentalDate(dental_date);
    if(request.getParameter("txt_uc_treatment")!=null){
        uc_treatment = new String (request.getParameter("txt_uc_treatment").getBytes("ISO8859_1"),"TIS-620");
        uc_treatment = uc_treatment.trim();
        }
    else{
        uc_treatment = "0.0";
        }
    dentaldaily.setUcTreatment(Double.parseDouble(uc_treatment));
    if(request.getParameter("txt_uc_prevention")!=null){
        uc_prevention = new String (request.getParameter("txt_uc_prevention").getBytes("ISO8859_1"),"TIS-620");
        uc_prevention = uc_prevention.trim();
        }
    else{
        uc_prevention = "0.0";
        }
    dentaldaily.setUcPrevention(Double.parseDouble(uc_prevention));
    if(request.getParameter("txt_patient_cnt_vn")!=null){
        patient_cnt_vn = new String (request.getParameter("txt_patient_cnt_vn").getBytes("ISO8859_1"),"TIS-620");
        patient_cnt_vn = patient_cnt_vn.trim();
        }
    else{
        patient_cnt_vn = "0.0";
        }
    dentaldaily.setPatientCntVn(Double.parseDouble(patient_cnt_vn));
    if(request.getParameter("txt_patient_cnt")!=null){
        patient_cnt = new String (request.getParameter("txt_patient_cnt").getBytes("ISO8859_1"),"TIS-620");
        patient_cnt = patient_cnt.trim();
        }
    else{
        patient_cnt = "0.0";
        }
    dentaldaily.setPatientCnt(Double.parseDouble(patient_cnt));
    if(request.getParameter("txt_patient_summary")!=null){
        patient_summary = new String (request.getParameter("txt_patient_summary").getBytes("ISO8859_1"),"TIS-620");
        patient_summary = patient_summary.trim();
        }
    else{
        patient_summary = "";
        }
    dentaldaily.setPatientSummary(Double.parseDouble(patient_summary));
    if(request.getParameter("txt_remark")!=null){
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        remark = remark.trim();
        }
    else{
        remark = "";
        }
    dentaldaily.setRemark(remark);

    if(request.getParameter("row")!=null){
        row1 = new String (request.getParameter("row").getBytes("ISO8859_1"),"TIS-620");
        row1 = row1.trim();
        }
    else{
        row1 = "0";
        }
    row = Integer.parseInt(row1);
    //dentaldaily.setDentalActive("1");
    
    String chk = dentaldailydb.setSaveDentalDaily(dentaldaily, "");
    if(!chk.equals("")){
        if(flag.equals("import")){
            dentaldailydb.setSaveDetailImport(chk, flag);
            }
        else if(flag.equals("normal")){
            for(Integer i=1;i<=row;i++){
                if(request.getParameter("dental_daily_detail_id_"+i.toString())!=null){
                    dental_daily_detail_id = new String (request.getParameter("dental_daily_detail_id_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    dental_daily_detail_id = dental_daily_detail_id.trim();
                    }
                else{
                    dental_daily_detail_id = "";
                    }
                dentaldailydetail.setDetalDailyDetailId(dental_daily_detail_id);

                if(request.getParameter("txt_paid_"+i.toString())!=null){
                    paid = new String (request.getParameter("txt_paid_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    paid = paid.trim();
                    }
                else{
                    paid = "0.0";
                    }
                dentaldailydetail.setPaid(Double.parseDouble(paid));

                if(request.getParameter("txt_paid_service_"+i.toString())!=null){
                    paid_service = new String (request.getParameter("txt_paid_service_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    paid_service = paid_service.trim();
                    }
                else{
                    paid_service = "0.0";
                    }
                dentaldailydetail.setPriceSerivce(Double.parseDouble(paid_service));
                if(request.getParameter("txt_paid_lab_"+i.toString())!=null){
                    paid_lab = new String (request.getParameter("txt_paid_lab_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    paid_lab = paid_lab.trim();
                    }
                else{
                    paid_lab = "0.0";
                    }
                if(paid_lab.equals("")){
                    paid_lab = "0.0";
                    }
                dentaldailydetail.setPriceLab(Double.parseDouble(paid_lab));
                if(request.getParameter("txt_paid_x_ray_"+i.toString())!=null){
                    paid_x_ray = new String (request.getParameter("txt_paid_x_ray_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    paid_x_ray = paid_x_ray.trim();
                    }
                else{
                    paid_x_ray = "0.0";
                    }
                if(paid_x_ray.equals("")){
                    paid_x_ray = "0.0";
                    }
                dentaldailydetail.setPriceXRay(Double.parseDouble(paid_x_ray));
                if(request.getParameter("txt_paid_discount_"+i.toString())!=null){
                    discount = new String (request.getParameter("txt_paid_discount_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    discount = discount.trim();
                    }
                else{
                    discount = "0.0";
                    }
                if(discount.equals("")){
                    discount = "0.0";
                    }
                dentaldailydetail.setPriceDiscount(Double.parseDouble(discount));
                if(request.getParameter("txt_cash_"+i.toString())!=null){
                    cash = new String (request.getParameter("txt_cash_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    cash = cash.trim();
                    }
                else{
                    cash = "0.0";
                    }
                if(cash.equals("")){
                    cash = "0.0";
                    }
                dentaldailydetail.setCash(Double.parseDouble(cash));
                if(request.getParameter("txt_credit_"+i.toString())!=null){
                    credit = new String (request.getParameter("txt_credit_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    credit = credit.trim();
                    }
                else{
                    credit = "0.0";
                    }
                if(credit.equals("")){
                    credit = "0.0";
                    }
                dentaldailydetail.setCredit(Double.parseDouble(credit));
                if(request.getParameter("txt_remark_"+i.toString())!=null){
                    remark = new String (request.getParameter("txt_remark_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    remark = remark.trim();
                }else{
                    remark = "";
                }
                dentaldailydetail.setRemark(remark);
                if(request.getParameter("cbo_dental_category_"+i.toString())!=null){
                    dental_category = new String (request.getParameter("cbo_dental_category_"+i.toString()).getBytes("ISO8859_1"),"TIS-620");
                    dental_category = dental_category.trim();
                }else{
                    dental_category = "";
                }
                dentaldailydetail.setDentalCategoryId(dental_category);
                
                dentaldailydb.setSaveDentalDailyDetail(dentaldailydetail,"", flag);
                }
            }
        response.sendRedirect("dental_daily_summary_add.jsp?txt_dental_daily_id="+chk+"&flag=viewdetail");
        }
    
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>

