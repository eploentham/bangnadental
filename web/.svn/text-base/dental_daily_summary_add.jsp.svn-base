<%-- 
    Document   : dental_daily_summary_add
    Created on : 12 ส.ค. 2552, 20:23:00
    Author     : pop
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnadental.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
String flag="", text="", dental_date = "", text1="", width="1150", width_patient_name="120";
String width_doctor_namet="70", width_input="30", width_nettotal="50";
String remark="", uc_treatment="", uc_prevention="", flag_import="";
String dental_daily_id="",flagpage="",text2="", cbo_dental_category="";
String visit_date = "", row_color="",branch_id="103001";
DentalTDailySummaryDB dentaldailydb = new DentalTDailySummaryDB();
Vector v_patient_viewbyfn = new Vector();
Vector v_dental_detail = new Vector();
Vector v_dental = new Vector();
Vector v_dental_catgery = new Vector();
PatientViewByFN patientviewbyfn = new PatientViewByFN();
DentalTDailySummary dentaldaily = new DentalTDailySummary();
DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
Double patient_cnt=0.0, patient_paid=0.0;
Integer row=0;
try {
    if(request.getParameter("flag")!=null) {
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        }
    //if(request.getParameter("flagpage")!=null) {
    //    flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    //    }
    if(request.getParameter("txt_dental_daily_id")!=null) {
        dental_daily_id = new String (request.getParameter("txt_dental_daily_id").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_dental_date")!=null) {
        dental_date = new String (request.getParameter("txt_dental_date").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_remark")!=null) {
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_uc_treatment")!=null) {
        uc_treatment = new String (request.getParameter("txt_uc_treatment").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_uc_prevention")!=null) {
        uc_prevention = new String (request.getParameter("txt_uc_prevention").getBytes("ISO8859_1"),"TIS-620");
        }
    if(flag.equals("viewdetail")) {
        dentaldaily = dentaldailydb.getDentalDailyByPK(dental_daily_id);
        v_dental_detail = dentaldailydb.getDentalDailyDetail(dental_daily_id, "");
        v_patient_viewbyfn = dentaldailydb.getDentalViewByFn(branch_id, dentaldaily.getDentalDate(),"");
        dental_date = dentaldaily.getDentalDate();
        visit_date = config1.DateFormatDB2Show(dental_date, "ddMMyyyy");
        v_dental_catgery = dentaldailydb.getDentalBCategory(branch_id);
        //cbo_dental_category = dentaldailydb.CboDentalBCategory(branch_id, "",v_dental_catgery);
        for(int i=0;i<=v_patient_viewbyfn.size()-1;i++) {
            patientviewbyfn = (PatientViewByFN)v_patient_viewbyfn.get(i);
            text += "<tr class='style14'><td align='left'>"+patientviewbyfn.getFnNamet()+"</td>"
                    +"<td align='right'>"+patientviewbyfn.getPatientNettotal().toString()+"</td>"
                    +"<td align='right'>"+patientviewbyfn.getPatientCntVn().toString()+"</td>"
                    +"</tr>";
            patient_cnt=patient_cnt+patientviewbyfn.getPatientCntVn();
            patient_paid=patient_paid+patientviewbyfn.getPatientNettotal();
            }
        for(int k=0;k<=v_patient_viewbyfn.size()-2;k++) {
            text2+="<br>";
            }
        text2="<tr><td>"+text2+"</td></tr>";
        for(int j=0;j<=v_dental_detail.size()-1;j++) {
            row++;
            row_color="";

            dentaldailydetail = new DentalTDailySummaryDetail();
            dentaldailydetail = (DentalTDailySummaryDetail)v_dental_detail.get(j);
            dental_date = config1.DateFormatDB2Show(dentaldailydetail.getDentalDate(), "ddMMyy");
            if(dentaldailydetail.getPaidId().equals("02")){
                row_color = "bgcolor='#FCF1F6'";
                }
            else{
                row_color="";
                }
            cbo_dental_category = dentaldailydb.CboDentalBCategory(branch_id, dentaldailydetail.getDentalCategoryId(),v_dental_catgery);
            text1+="<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"
                    +"<td width='15' align='center'>"+dental_date+"</td>"
                    +"<td align='center'>"+dentaldailydetail.getDentalTime()+"</td>"
                    +"<td width='"+width_patient_name+"'>"+dentaldailydetail.getPatientFullnamet()+"</td>"
                    +"<td width='40'align='center'>"+dentaldailydetail.getPatientHnNo()+"</td>"
                    +"<td width='15' align='center'>"+dentaldailydetail.getPatientVnId()+"</td>"
                    +"<td width='50' align='left'>"+dentaldailydetail.getPaidNamet()+"</td>"
                    +"<td width='"+width_nettotal+"' align='right'>"
                    +"<input class='input_text' type='text' name='txt_paid_"+row.toString()+"' id='txt_paid_"+row.toString()+"' value='"+dentaldailydetail.getPaid()+"' size='7'></td>"
                    +"<td width='"+width_doctor_namet+"' align='left'>"+dentaldailydetail.getDoctorNamet()+"</td>"
                    //+"<td>"+dentaldailydetail.getTreatmentDescription()+"</td>"
                    +"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_paid_service_"+row.toString()+"' id='txt_paid_service_"+row.toString()+"' value='"+dentaldailydetail.getPriceSerivce()+"' size='5'></td>"
                    //+"<td width='70'><input type='text' name='txt_paid_pharmacy_'"+row.toString()+" id='txt_paid_pharmacy_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_paid_lab_"+row.toString()+"' id='txt_lpaid_ab_"+row.toString()+"' value='"+dentaldailydetail.getPriceLab()+"' size='5'></td>"
                    +"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_paid_x_ray_"+row.toString()+"' id='txt_paid_x_ray_"+row.toString()+"' value='"+dentaldailydetail.getPriceXRay()+"' size='5'></td>"
                    +"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_paid_discount_"+row.toString()+"' id='txt_paid_discount_"+row.toString()+"' value='"+dentaldailydetail.getPriceDiscount()+"' size='5'></td>"
                    +"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_cash_"+row.toString()+"' id='txt_cash_'"+row.toString()+"' value='"+dentaldailydetail.getCash()+"' size='5'></td>"
                    +"<td width='"+width_input+"'><input class='input_text' type='text' name='txt_credit_"+row.toString()+"' id='txt_credit_"+row.toString()+"' value='"+dentaldailydetail.getCredit()+"' size='5'></td>"
                    +"<td width='80'><select name='cbo_dental_category_"+row.toString()+"' id='cbo_dental_category_"+row.toString()+"'>"+cbo_dental_category+"</select></td>"
                    +"<td width='80'><input type='text' name='txt_remark_"+row.toString()+"' id='txt_remark_"+row.toString()+"' value='"+dentaldailydetail.getRemark()+"' size='8'></td>"
                    +"<input class='input_text' type='hidden' name='dental_daily_detail_id_"+row.toString()+"' id='dental_daily_detail_id_"+row.toString()+"' value='"+dentaldailydetail.getDetalDailyDetailId()+"' size='5'>"
                +"</tr>";
            }

        }
    if(flag.equals("import")) {
        width="100%";
        flag_import="1";
        visit_date = config1.DateFormatShow2DB(dental_date, "ddMMyyyy");
        v_patient_viewbyfn = dentaldailydb.setDentalVisitDateDetailImport("103001", visit_date,flag);
        for(int i=0;i<=v_patient_viewbyfn.size()-1;i++){
            patientviewbyfn = (PatientViewByFN)v_patient_viewbyfn.get(i);
            text += "<tr class='style14'><td align='left'>"+patientviewbyfn.getFnNamet()+"</td>"
                    +"<td align='right'>"+patientviewbyfn.getPatientNettotal().toString()+"</td>"
                    +"<td align='right'>"+patientviewbyfn.getPatientCntVn().toString()+"</td>"
                    +"</tr>";
            patient_cnt=patient_cnt+patientviewbyfn.getPatientCntVn();
            patient_paid=patient_paid+patientviewbyfn.getPatientNettotal();
            }
        
        Double cnt = dentaldailydb.getDentalPatientCount("103001", visit_date, "_temp");
        dentaldaily.setPatientCnt(cnt);
        dentaldaily.setPatientCntVn(patient_cnt);
        dentaldaily.setPatientSummary(patient_paid);
        dentaldaily.setDentalDate(dental_date);
        dentaldaily.setRemark(remark);
        
        dentaldaily.setUcTreatment(Double.parseDouble(uc_treatment));
        dentaldaily.setUcPrevention(Double.parseDouble(uc_prevention));

        v_dental_detail = dentaldailydb.getDentalDailyDetail(visit_date, "_temp");
        for(int j=0;j<=v_dental_detail.size()-1;j++){
            row++;
            dentaldailydetail = new DentalTDailySummaryDetail();
            dentaldailydetail = (DentalTDailySummaryDetail)v_dental_detail.get(j);
            dental_date = config1.DateFormatDB2Show(dentaldailydetail.getDentalDate(), "ddMMyy");
            text1+="<tr class='style14'><td width='10' align='center'>"+row.toString()+"</td>"
                    +"<td width='15' align='center'>"+dental_date+"</td>"
                    +"<td align='center'>"+dentaldailydetail.getDentalTime()+"</td>"
                    +"<td width='"+width_patient_name+"'>"+dentaldailydetail.getPatientFullnamet()+"</td>"
                    +"<td width='40'align='center'>"+dentaldailydetail.getPatientHnNo()+"</td>"
                    +"<td width='15' align='center'>"+dentaldailydetail.getPatientVnId()+"</td>"
                    +"<td width='50' align='left'>"+dentaldailydetail.getPaidNamet()+"</td>"
                    +"<td width='"+width_nettotal+"' align='right'>"+dentaldailydetail.getPaid()+"</td>"
                    +"<td width='"+width_doctor_namet+"' align='left'>"+dentaldailydetail.getDoctorNamet()+"</td>"
                    //+"<td>"+dentaldailydetail.getTreatmentDescription()+"</td>"
                    //+"<td width='60'><input type='text' name='txt_paid_service_'"+row.toString()+" id='txt_paid_service_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='70'><input type='text' name='txt_paid_pharmacy_'"+row.toString()+" id='txt_paid_pharmacy_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='70'><input type='text' name='txt_paid_lab_'"+row.toString()+" id='txt_lpaid_ab_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='60'><input type='text' name='txt_paid_x_ray_'"+row.toString()+" id='txt_paid_x_ray_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='60'><input type='text' name='txt_paid_discount_'"+row.toString()+" id='txt_paid_discount_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='60'><input type='text' name='txt_cash_'"+row.toString()+" id='txt_cash_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='60'><input type='text' name='txt_credit_'"+row.toString()+" id='txt_credit_'"+row.toString()+" value='' size='5'></td>"
                    //+"<td width='80'><input type='text' name='txt_remark_'"+row.toString()+" id='txt_remark_'"+row.toString()+" value='' size='8'></td>"
                +"</tr>";
            }
        
        //text="";
        visit_date = config1.DateFormatDB2Show(visit_date, "ddMMyyyy");
        }
    //visit_date = config1.DateFormatDB2Show(dentaldaily.getDentalDate(), "ddMMyyyy");
    }
catch(Exception ex){
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <style type="text/css" title="currentStyle">
                @import "css/tab.css";
                @import "css/jquery-ui-1.7.2.custom.css";
                @import "css/jquery.treeTable.css";

                table.tablecolors td{
                padding: 6px 6px;
                font-size: 12px;
                }
                table.tablecolors .even{
                background-color: #FCF1F6;
                }
                table.tablecolors .odd{
                background-color: #E6EAE9
                }
                table.tablecolors .hovcolor{
                background-color: #E6EAE0;
                color: red;
                }
                table.tablecolors .highlightcolor{
                background-color: #8c2800;
                color:#FFF;
                }
        </style>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/date.js"></SCRIPT>
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>

        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           $(document).ready(function() {
               $("#txt_dental_date").datepicker({ dateFormat: 'dd-mm-yy' });
           });
           
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>

         <style type="text/css">
          .progressBar {
            position: relative;
            width: 256px;
            height: 16px;
            border: 1px solid black;
          }
        </style>
        <style type="text/css">
          div.error {
            color: red;
          }
        </style>
        <script type="text/javascript">
      var framework = new ValidatorFramework();
      window.onload = function() {
        Event.observe('asset_view','submit',function(event) {
          if (!framework.validateForm(event.target))
            Event.stop(event);
        });
        Event.observe('asset_view','keyup',function(event) {
          framework.validateForm(event.target.form);
        });
      }
    </script>
    </head>
    <body>
        <form name="dental_daily_summary_add" id="dental_daily_summary_add" action="dental_daily_summary_save.jsp" method="POST">
            <%@include  file="dental_daily_summary_header.jsp" %>
            <table border="0" align="center" width="100%">
                <thead>
                    <tr>
                        <th colspan="2"  align="center">รายการ
                            &nbsp;&nbsp;&nbsp;1. นำเข้าข้อมูล&nbsp;<button dojoType="dijit.form.Button" id="hn_noButton">...
    <script type="dojo/method" event="onClick">
    //alert('OnClick event...');
    var dental_date = document.getElementById("txt_dental_date").value;
    document.forms[0].action = "dental_daily_summary_add.jsp?flag=import&dental_date="+dental_date;
    document.forms[0].submit();
    //console.log("OnClick event...");
  </script>
</button>
                            <% if(flag_import.equals("1")){ %><label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitsaveimport();" NAME="anchor" ID="anchor">1.1. บันทึกข้อมูลจากการนำเข้า&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label><%}%>
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitsave();" NAME="anchor" ID="anchor">2. บันทึกข้อมูล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
    <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor">3. พิมพ์ข้อมูล&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<A HREF="#" onClick="changesubmitcancel();" NAME="anchor" ID="anchor">
<img src="images/trash1.gif" alt="" width="20" height="16" border="0">ยกเลิกการใช้งาน</A></th>
                    </tr>
                </thead>
        <input type="hidden" name="txt_row" id="txt_row"  value="<%out.print(row);%>">
        <input type="hidden" name="txt_dental_active" id="txt_dental_active"  value="<%out.print(dentaldaily.getDentalActive());%>">
                <tbody>
                    <tr>

<td>

    <table border="0" width="400">
                        <thead>
                            <tr>
                                <th>ประเภทสิทธิการรักษา</th>
                                <th>จำนวนเงิน</th>
                                <th>จำนวนVN</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%out.print(text);%>
                        </tbody>
                    </table>
</td>
<td>
    <table valign="top">
                    <tr>
                        <th>วันที่ :</th>
                        <td class="style14"><input type="hidden" name="txt_dental_daily_id" id="txt_dental_daily_id" value="<% out.print(dentaldaily.getDentalDailyId());%>" readonly="readonly" >
                        <input type="text" name="txt_dental_date" id="txt_dental_date" value="<% out.print(visit_date);%>" readonly="readonly" class="dateinput" size="10">
                        &nbsp;&nbsp;
                        สถิติUC:&nbsp;ป้องกัน :&nbsp;<input type="text" name="txt_uc_treatment" id="txt_uc_treatment" value="<% out.print(dentaldaily.getUcTreatment());%>" size="2">
                        &nbsp;&nbsp;รักษา :&nbsp;<input type="text" name="txt_uc_prevention" id="txt_uc_prevention" value="<% out.print(dentaldaily.getUcPrevention());%>" size="2">
                        </td>
                    </tr>
                    <tr>
                        <th width="100">จำนวนVN :</th>
                        <td class="style14"><input type="text" name="txt_patient_cnt_vn" id="txt_patient_cnt_vn" value="<% out.print(dentaldaily.getPatientCntVn());%>" size="4">
                        &nbsp;&nbsp;&nbsp;
                        จำนวนผู้มาใช้บริการ :<input type="text" name="txt_patient_cnt" id="txt_patient_cnt" value="<% out.print(dentaldaily.getPatientCnt());%>" size="4">
                        &nbsp;&nbsp;&nbsp;
                        ยอดรายรับ :&nbsp;<input type="text" name="txt_patient_summary" id="txt_patient_summary" value="<% out.print(dentaldaily.getPatientSummary());%>" size="7">
                        </td>
                    </tr>
                    <tr>
                        <th>หมายเหตุ :&nbsp;</th>
                        <td class="style14"><input type="text" name="txt_remark" id="txt_remark" value="<% out.print(dentaldaily.getRemark());%>" size="40">
                        
                        </td>
                    </tr>
                    <%out.print(text2);%>
    </table></td>
                </tbody>
            </table>

                        <table border="0" width="<%out.print(width);%>">
    <tbody>
        <tr>
            <td width="100%"><table border="0" width="100%">
                    <thead>
                        <tr>
                            <th width="10" align="center">&nbsp;</th>
                            <th width="15">วันที่</th>
                            <th width="20">เวลา</th>
                            <th width="<%out.print(width_patient_name);%>">ชื่อผู้มาใช้บริการ</th>
                            <th width='40'>HN NO</th>
                            <th width="15">VN</th>
                            <th width="50">ประเภท</th>
                            <th width="<%out.print(width_nettotal);%>">ค่ารักษา</th>
                            <th width="<%out.print(width_doctor_namet);%>">แพทย์</th>
                            
                            
                            <th width='<%out.print(width_input);%>'>หัตถการ</th>
                            <!--<th width='60'>Pharmacy</th>-->
                            <!--<th width='60'>LAB</th>-->
                            <th width='<%out.print(width_input);%>'>X-Ray</th>
                            <th width='<%out.print(width_input);%>'>ส่วนลด</th>
                            <th width='<%out.print(width_input);%>'>เงินสด</th>
                            <th width='<%out.print(width_input);%>'>Credit</th>
                            <th width="80">ประเภทการรักษา</th>
                            <th width="80">หมายเหตุ</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%out.print(text1);%>
                    </tbody>
                </table></td>
                
        </tr>
    </tbody>
</table>

        </form>
    </body>
<script>
  function performSearch() {
        $('resultsContainer').innerHTML = '';
        new Ajax.Request(
          '/aip.chap10/command/SearchForRecipes',
          {
            onSuccess: showResults,
            onFailure: showResults,
            parameters:
              $H({
                terms: $F('searchTermsField')
              }).toQueryString()
          }
        );
        if (!window.progressBar) {
          window.progressBar = new ProgressBar(
            'progressBarContainer',
            {
              className: 'progressBar',
              color: 'blue',
              interval: 1000
            }
          );
        }
        progressBar.start();
      }

      function showResults(request) {
        progressBar.stop();
        $('resultsContainer').innerHTML = request.responseText;
      }
      function changesubmitsaveimport() {
          //var row = document.getElementById("txt_row").value;
          //var usernametfoodsreceive = document.getElementById("cbo_user_foods_receive").value;
          //var usernametnutritionist = document.getElementById("cbo_user_foods_nutritionist").value;
          //var usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
        document.forms[0].action = "dental_daily_summary_save.jsp?flag=import";
        document.forms[0].submit();
        return false;
      }
      function changesubmitsave() {
          var row = document.getElementById("txt_row").value;
          //var usernametfoodsreceive = document.getElementById("cbo_user_foods_receive").value;
          //var usernametnutritionist = document.getElementById("cbo_user_foods_nutritionist").value;
          //var usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
        document.forms[0].action = "dental_daily_summary_save.jsp?flag=normal&row="+row;
        document.forms[0].submit();
        return false;
      }
      function changesubmitprint() {
          var dental_daily_id = document.getElementById("txt_dental_daily_id").value;
      document.forms[0].action = "rpt_report_view.jsp?txt_report_name=dental_daily_summary_detail&dental_daily_id="+dental_daily_id+"&txt_form=daily&flagpage=viewdetail";
      document.forms[0].submit();
        return false;
      }
      function changesubmitcancel() {
        document.forms.dental_daily_summary_add.txt_dental_active.value = '3';
        document.forms[0].action = "dental_daily_summary_save.jsp";
        document.forms[0].submit();
        return false;
      }
  </script>
</html>
