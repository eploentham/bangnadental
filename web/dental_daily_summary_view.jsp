<%-- 
    Document   : dental_daily_summary_view
    Created on : 12 ส.ค. 2552, 20:22:39
    Author     : pop
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnadental.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
ComboDB combodb = new ComboDB();
Integer row=0;
String text="",flagpage="",branch_id="",cbo_branch="",date_start="",date_end="";
String txt_color="",txt_color1="", dental_date="",row_color="";
DentalTDailySummary dentaldaily = new DentalTDailySummary();
DentalTDailySummaryDB dentaldailydb = new DentalTDailySummaryDB();
Vector v_dental_daily = new Vector();
try {
    if(request.getParameter("flagpage")!=null) {
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
    if(request.getParameter("cbo_branch")!=null) {
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }
    cbo_branch = combodb.getComboBranch(branch_id);
    v_dental_daily = dentaldailydb.getDentalDaily("", "");
    for(int i=0;i<=v_dental_daily.size()-1;i++) {
        row++;
        dentaldaily = (DentalTDailySummary)v_dental_daily.get(i);
        dental_date = config1.DateFormatDB2Show(dentaldaily.getDentalDate(), "ddMMyyyy");
        
        text+="<tr class='style14r' "+row_color+"> <td align='center' width='30'>"+row.toString()+"</td>"
    +"<td width='200'><A HREF='dental_daily_summary_add.jsp?txt_dental_daily_id="+dentaldaily.getDentalDailyId()
    +"&flag=viewdetail' name='dental_daily_summary_add' id='dental_daily_summary_add'>"
        +txt_color+dental_date+" ["+dentaldaily.getDentalDailyId()+"]"
        +txt_color1+"</a></td>"
            +"<td width='50' align='right'>"+txt_color+dentaldaily.getPatientCnt()+txt_color1+"</td>"
            +"<td width='50' align='right'>"+txt_color+dentaldaily.getPatientCntVn()+txt_color1+"</td>"
            +"<td width='50' align='right'>"+txt_color+dentaldaily.getPatientSummary()+txt_color1+"</td>"
            +"<td width='150' align='right'>"+txt_color+dentaldaily.getUcTreatment()+txt_color1+"</td>"
            +"<td width='140' align='right'>"+txt_color+dentaldaily.getUcPrevention()+txt_color1+"</td>"
            +"<td width='200' align='left'>"+txt_color+dentaldaily.getRemark()+txt_color1+"</td>"
            +"</tr>";
        }

    if(text.equals("")){
        text="<tr class='style14r' ><td>ไม่พบข้อมูล</td><td></td><td></td><td></td><td></td><td></td<td></td<td></td</tr>";
        }
    }
catch(Exception ex){
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <style type="text/css" title="currentStyle">
                @import "css/tab.css";
                @import "css/demo_table.css";
                @import "css/jquery-ui-1.8.18.custom.css";
        </style>
        <script type="text/javascript" src="js/jquery-1.6.4.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
        <script type="text/javascript" charset="TIS-620">
            $(document).ready(function() {
                hideLoader();
                //showSearch();
                $("#tab1").css("background-image","url('../images/tabright_click.gif')");
                $("#tab11").html("<font color='red'><b>"+$("#tab11").html()+"</b></font>");
                
            });
            function showLoader() {
                $("#loading").show();
            }
            function hideLoader() {
                $("#loading").hide();
            }
            function showSearch() {
                //$("#back_import_search.jsp", {year: $("#cbo_year").val(),branch_id: $("#cbo_branch").val()});
                showLoader();
                $("#t_back_import_view").load("dental_daily_f_view.jsp",
                {month: $("#cbo_month").val(), year: $("#cbo_year").val(), branch_id: $("#cbo_branch").val(), flagpage:$("#txt_flagpage").val()},
                function() {hideLoader();});
                $("#t_back_import_view").show();
            }
        </script>
    </head>
    <body>
        <form name="dental_daily_summary_view" id="dental_daily_summary_view" action="dental_daily_summary_add.jsp" method="POST">
            <%@include  file="dental_daily_summary_header.jsp" %>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->
            <%if(flagpage.equals("old_date")){ %>
            <tr><td colspan="8">
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>

                <label>&nbsp;&nbsp;วันที่ :&nbsp;<input type="text" name="txt_date_start" id="txt_date_start" value="<% out.print(date_start);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['dental_daily_summary_view'].txt_date_start,'anchor1','dd/MM/yyyy'); return false;"
   NAME="anchor1" ID="anchor1">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<label>&nbsp;&nbsp;ถึงวันที่ :&nbsp;<input type="text" name="txt_date_end" id="txt_date_end" value="<% out.print(date_end);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['dental_daily_summary_view'].txt_date_end,'anchor2','dd/MM/yyyy'); return false;"
   NAME="anchor2" ID="anchor2">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<img src='images/search1.jpeg' alt='' name='hn_search' id='hn_search' border='0' align='middle' title='ค้นหา HN...'>

                        </fieldset>
                </td></tr>
            <% } %>
            <thead>
                <tr bgcolor="#336699"  class="style14w">
                    <th width="15" ><div align="center">ลำดับ</div></th>
                  <th width="80" ><div align="center">วันที่</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">จำนวน</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">จำนวนVN</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">ยอดรายรับ</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">ยอดUC Treatment</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">ยอดUC Prevention</div></th>
                  <th width="200" bgcolor="#336699" ><div align="center">หมายเหตุ</div></th>
                </tr>
            </thead>
            <% out.print(text);%>
            </table>

        </form>
    </body>
</html>
