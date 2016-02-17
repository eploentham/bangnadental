package bangnadental;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import bangnaLibrary.Config1;
import bangnaLibrary.DoctorOrderLab;
import bangnaLibrary.PatientViewByFN;
import bangnaLibrary.PatientVisit;
import bangnaLibrary.PatientVisitPaid;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pop
 */
public class DentalTDailySummaryDB {
    private Config1 config1;
    private DentalTDailySummary dentaldaily;
    private DentalTDailySummaryDetail dentaldailydetail;
    public DentalTDailySummaryDB(){
        config1 = new Config1();
        initConfig1(config1);
    }
    public DentalTDailySummaryDB(Config1 cf){
        config1 = cf;
        initConfig1(cf);
    }
    public void initConfig1(Config1 cf){
        dentaldaily = new DentalTDailySummary();
        dentaldailydetail = new DentalTDailySummaryDetail();
    }
    public String getMaxRowDentalDaily(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+dentaldaily.getFDentalDailyId()+") as cnt From "+dentaldaily.getDentalTDailySummary();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
//            conn.close();
            if(max!=null && !max.equals("")){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "11700001";
            }
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRowDentalDailyDetail(Connection conn,String flagpage){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+dentaldailydetail.getFDentalDailyDetailId()+") as cnt From "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage;
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
//            conn.close();
            if(max!=null && !max.equals("")){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "11800001";
            }
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public DentalTDailySummary getDentalDailyByPK(String dental_daily_id) {
        Connection conn;
        DentalTDailySummary dentaldaily = new DentalTDailySummary();
//        BDepartment department = new BDepartment();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            String sql="";
            sql="Select dd.* "
                +"From "+dentaldaily.getDentalTDailySummary()+" as dd "
                +"Where "+dentaldaily.getFDentalDailyId()+" = '"+dental_daily_id+"' ";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                dentaldaily = new DentalTDailySummary();
                dentaldaily.setDentalDailyId(config1.StringNull(rs.getString(dentaldaily.getFDentalDailyId())));
                dentaldaily.setDentalDate(config1.StringNull(rs.getString(dentaldaily.getFDentalDate())));
                dentaldaily.setDentalActive(config1.StringNull(rs.getString(dentaldaily.getFDentalActive())));
                dentaldaily.setPatientCnt(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientCnt()))));
                dentaldaily.setPatientSummary(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientSummary()))));

                dentaldaily.setRemark(config1.StringNull(rs.getString(dentaldaily.getFRemark())));
                dentaldaily.setUcPrevention(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFUcPreventiont()))));
                dentaldaily.setUcTreatment(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFUcTreatment()))));
                dentaldaily.setDateCreate(config1.StringNull(rs.getString(dentaldaily.getFDateCreate())));
                dentaldaily.setDateModify(config1.StringNull(rs.getString(dentaldaily.getFDateModify())));
                
                dentaldaily.setDateCancel(config1.StringNull(rs.getString(dentaldaily.getFDateCancel())));
                dentaldaily.setUserIdCreate(config1.StringNull(rs.getString(dentaldaily.getFUserIdCreate())));
                dentaldaily.setUserIdModify(config1.StringNull(rs.getString(dentaldaily.getFUserIdModify())));
                dentaldaily.setUserIdCancel(config1.StringNull(rs.getString(dentaldaily.getFUserIdCancel())));
                dentaldaily.setBranchId(config1.StringNull(rs.getString(dentaldaily.getFBranchId())));

                dentaldaily.setPatientCntVn(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientCntVn()))));
                
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dentaldaily;
    }
    public Vector getDentalDaily(String branch_id, String flag) {
        Connection conn;
        DentalTDailySummary dentaldaily = new DentalTDailySummary();
        Vector v_dentaldaily = new Vector();
//        BDepartment department = new BDepartment();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            String sql="";
            sql="Select dd.* "
                +"From "+dentaldaily.getDentalTDailySummary()+" as dd "
                +"Where "+dentaldaily.getFDentalActive()+" = '1' "
                +"Order By "+dentaldaily.getFDentalDate()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                dentaldaily = new DentalTDailySummary();
                dentaldaily.setDentalDailyId(config1.StringNull(rs.getString(dentaldaily.getFDentalDailyId())));
                dentaldaily.setDentalDate(config1.StringNull(rs.getString(dentaldaily.getFDentalDate())));
                dentaldaily.setDentalActive(config1.StringNull(rs.getString(dentaldaily.getFDentalActive())));
                dentaldaily.setPatientCnt(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientCnt()))));
                dentaldaily.setPatientSummary(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientSummary()))));

                dentaldaily.setRemark(config1.StringNull(rs.getString(dentaldaily.getFRemark())));
                dentaldaily.setUcPrevention(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFUcPreventiont()))));
                dentaldaily.setUcTreatment(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFUcTreatment()))));
                dentaldaily.setDateCreate(config1.StringNull(rs.getString(dentaldaily.getFDateCreate())));
                dentaldaily.setDateModify(config1.StringNull(rs.getString(dentaldaily.getFDateModify())));

                dentaldaily.setDateCancel(config1.StringNull(rs.getString(dentaldaily.getFDateCancel())));
                dentaldaily.setUserIdCreate(config1.StringNull(rs.getString(dentaldaily.getFUserIdCreate())));
                dentaldaily.setUserIdModify(config1.StringNull(rs.getString(dentaldaily.getFUserIdModify())));
                dentaldaily.setUserIdCancel(config1.StringNull(rs.getString(dentaldaily.getFUserIdCancel())));
                dentaldaily.setBranchId(config1.StringNull(rs.getString(dentaldaily.getFBranchId())));

                dentaldaily.setPatientCntVn(Double.parseDouble(config1.StringNull(rs.getString(dentaldaily.getFPatientCntVn()))));
                v_dentaldaily.add(dentaldaily);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_dentaldaily;
    }
    public DentalTDailySummaryDetail getDentalDailyDetailByPK(String dental_daily_detail_id, String flagpage) {
        Connection conn;
        DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
//        BDepartment department = new BDepartment();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            String sql="";
            sql="Select ddd.* "
                +"From "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage+" as ddd "
                +"Where "+dentaldailydetail.getFDentalDailyDetailId()+" = '"+dental_daily_detail_id+"' ";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                dentaldailydetail = new DentalTDailySummaryDetail();
                dentaldailydetail.setDetalDailyDetailId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailId())));
                dentaldailydetail.setDentalDailyId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyId())));
                dentaldailydetail.setDentalDailyDetailActive(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailActive())));
                dentaldailydetail.setDentalDate(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDate())));
                dentaldailydetail.setDentalTime(config1.StringNull(rs.getString(dentaldailydetail.getFDentalTime())));

                dentaldailydetail.setDoctorId(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorId())));
                dentaldailydetail.setDoctorNamet(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorNamet())));
                dentaldailydetail.setFnId(config1.StringNull(rs.getString(dentaldailydetail.getFFnId())));
                dentaldailydetail.setFnNamet(config1.StringNull(rs.getString(dentaldailydetail.getFFnNamet())));
                dentaldailydetail.setItemId(config1.StringNull(rs.getString(dentaldailydetail.getFItemId())));

                dentaldailydetail.setItemNamet(config1.StringNull(rs.getString(dentaldailydetail.getFItemNamet())));
                dentaldailydetail.setItemNettoal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemNettotal()))));
                dentaldailydetail.setItemQty(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemQty()))));
                dentaldailydetail.setPatientHnNo(config1.StringNull(rs.getString(dentaldailydetail.getFPatientHnNo())));
                dentaldailydetail.setPatientFullnamet(config1.StringNull(rs.getString(dentaldailydetail.getFPatientFullNamet())));

                dentaldailydetail.setRemark(config1.StringNull(rs.getString(dentaldailydetail.getFRemark())));
                dentaldailydetail.setTreatmentDescription(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentDescription())));
                dentaldailydetail.setTreatmentNettotal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentNettotal()))));
                dentaldailydetail.setDentalCategoryId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalCategoryId())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dentaldailydetail;
    }
    public Vector getDentalDailyDetail(String dental_daily_id, String flagpage) {
        Connection conn;
        DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
        Vector v_dentaldailydetail = new Vector();
        String sql="";
//        BDepartment department = new BDepartment();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            
            if(flagpage.equals("_temp")){
//        sql="Select ddd."+dentaldailydetail.getFDentalDate()+",ddd."+dentaldailydetail.getFDentalTime()+", "
//        +dentaldailydetail.getFPatientHnNo()+","+dentaldailydetail.getFPatientFullNamet()+","
//        +dentaldailydetail.getFDentalDailyDetailActive()+","
//        +dentaldailydetail.getFDentalDailyId()+","+dentaldailydetail.getFDoctorId()+","
//        +dentaldailydetail.getFDoctorNamet()+","+dentaldailydetail.getFRemark()+", "
//        +dentaldailydetail.getFPaidId()+","+dentaldailydetail.getFPaidNamet()+", "
//        +"sum("+dentaldailydetail.getFItemNettotal()+") as "+dentaldailydetail.getFItemNettotal()+" "
//        +"From "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage+" as ddd "
//        +"Where "+dentaldailydetail.getFDentalDate()+" = '"+dental_daily_id+"' "
//        +"Group By "+dentaldailydetail.getFDentalDate()+","+dentaldailydetail.getFDentalTime()+","
//        +dentaldailydetail.getFPatientHnNo()+","+dentaldailydetail.getFPatientFullNamet()+","
//        +dentaldailydetail.getFDentalDailyDetailActive()+","
//        +dentaldailydetail.getFDentalDailyId()+","+dentaldailydetail.getFDoctorId()+","
//        +dentaldailydetail.getFDoctorNamet()+","+dentaldailydetail.getFRemark()+", "
//        +dentaldailydetail.getFPaidId()+","+dentaldailydetail.getFPaidNamet()+" "
//        +"Order By "+dentaldailydetail.getFDentalDate()+","+dentaldailydetail.getFDentalTime();
                sql="Select ddd.* "
        +"From "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage+" as ddd "
        +"Where "+dentaldailydetail.getFDentalDate()+" = '"+dental_daily_id+"' "
        +"Order By "+dentaldailydetail.getFDentalDate()+","+dentaldailydetail.getFDentalTime()+","
                +dentaldailydetail.getFDentalDailyDetailId();
            }
            else {
                if(flagpage.equals("_tempimport")){
                    sql="Select ddd.* "
                    +"From "+dentaldailydetail.getDentalTDailySummaryDetail()+"_temp as ddd "
                    +"Where "+dentaldailydetail.getFDentalDailyId()+" = '' ";
                }
                else{
        sql="Select ddd.* "
        +"From "+dentaldailydetail.getDentalTDailySummaryDetail()+" as ddd "
        +"Where "+dentaldailydetail.getFDentalDailyId()+" = '"+dental_daily_id+"' "
        +"Order By "+dentaldailydetail.getFDentalDate()+","+dentaldailydetail.getFDentalTime()+","
                +dentaldailydetail.getFDentalDailyDetailId();
                }
                    //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            }
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                dentaldailydetail = new DentalTDailySummaryDetail();
                if(flagpage.equals("_temp")){
//                dentaldailydetail.setDetalDailyDetailId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailId())));
                dentaldailydetail.setDentalDailyId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyId())));
                dentaldailydetail.setDentalDailyDetailActive(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailActive())));
                dentaldailydetail.setDentalDate(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDate())));
                dentaldailydetail.setDentalTime(config1.StringNull(rs.getString(dentaldailydetail.getFDentalTime())));

//                dentaldailydetail.setDoctorId(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorId())));
                dentaldailydetail.setDoctorNamet(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorNamet())));
//                dentaldailydetail.setFnId(config1.StringNull(rs.getString(dentaldailydetail.getFFnId())));
//                dentaldailydetail.setFnNamet(config1.StringNull(rs.getString(dentaldailydetail.getFFnNamet())));
//                dentaldailydetail.setItemId(config1.StringNull(rs.getString(dentaldailydetail.getFItemId())));

//                dentaldailydetail.setItemNamet(config1.StringNull(rs.getString(dentaldailydetail.getFItemNamet())));
                dentaldailydetail.setItemNettoal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemNettotal()))));
//                dentaldailydetail.setItemQty(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemQty()))));
                dentaldailydetail.setPatientHnNo(config1.StringNull(rs.getString(dentaldailydetail.getFPatientHnNo())));
                dentaldailydetail.setPatientFullnamet(config1.StringNull(rs.getString(dentaldailydetail.getFPatientFullNamet())));

//                dentaldailydetail.setRemark(config1.StringNull(rs.getString(dentaldailydetail.getFRemark())));
//                dentaldailydetail.setTreatmentDescription(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentDescription())));
//                dentaldailydetail.setTreatmentNettotal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentNettotal()))));
                dentaldailydetail.setPaidNamet(config1.StringNull(rs.getString(dentaldailydetail.getFPaidNamet())));
                dentaldailydetail.setPaidId(config1.StringNull(rs.getString(dentaldailydetail.getFPaidId())));
                dentaldailydetail.setPatientVnId(config1.StringNull(rs.getString(dentaldailydetail.getFPatientVnId())));
                dentaldailydetail.setPaid(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPaid()))));
                dentaldailydetail.setCash(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFCash()))));

                }
                else{
                dentaldailydetail.setDetalDailyDetailId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailId())));
                dentaldailydetail.setDentalDailyId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyId())));
                dentaldailydetail.setDentalDailyDetailActive(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDailyDetailActive())));
                dentaldailydetail.setDentalDate(config1.StringNull(rs.getString(dentaldailydetail.getFDentalDate())));
                dentaldailydetail.setDentalTime(config1.StringNull(rs.getString(dentaldailydetail.getFDentalTime())));

                dentaldailydetail.setDoctorId(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorId())));
                dentaldailydetail.setDoctorNamet(config1.StringNull(rs.getString(dentaldailydetail.getFDoctorNamet())));
                dentaldailydetail.setFnId(config1.StringNull(rs.getString(dentaldailydetail.getFFnId())));
                dentaldailydetail.setFnNamet(config1.StringNull(rs.getString(dentaldailydetail.getFFnNamet())));
                dentaldailydetail.setItemId(config1.StringNull(rs.getString(dentaldailydetail.getFItemId())));

                dentaldailydetail.setItemNamet(config1.StringNull(rs.getString(dentaldailydetail.getFItemNamet())));
                dentaldailydetail.setItemNettoal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemNettotal()))));
                dentaldailydetail.setItemQty(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFItemQty()))));
                dentaldailydetail.setPatientHnNo(config1.StringNull(rs.getString(dentaldailydetail.getFPatientHnNo())));
                dentaldailydetail.setPatientFullnamet(config1.StringNull(rs.getString(dentaldailydetail.getFPatientFullNamet())));

                dentaldailydetail.setRemark(config1.StringNull(rs.getString(dentaldailydetail.getFRemark())));
                dentaldailydetail.setTreatmentDescription(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentDescription())));
                dentaldailydetail.setTreatmentNettotal(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFTreatmentNettotal()))));
                dentaldailydetail.setPaidNamet(config1.StringNull(rs.getString(dentaldailydetail.getFPaidNamet())));
                dentaldailydetail.setPaidId(config1.StringNull(rs.getString(dentaldailydetail.getFPaidId())));

                dentaldailydetail.setPaid(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPaid()))));
                dentaldailydetail.setPriceSerivce(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPriceService()))));
                dentaldailydetail.setPricePharmacy(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPricePharmacy()))));
                dentaldailydetail.setPriceLab(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPriceLab()))));
                dentaldailydetail.setPriceXRay(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPriceXRay()))));

                dentaldailydetail.setPriceDiscount(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFPriceDiscount()))));
                dentaldailydetail.setCredit(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFCredit()))));
                dentaldailydetail.setPatientVnId(config1.StringNull(rs.getString(dentaldailydetail.getFPatientVnId())));
                dentaldailydetail.setCash(Double.parseDouble(config1.StringNull(rs.getString(dentaldailydetail.getFCash()))));
                dentaldailydetail.setDentalCategoryId(config1.StringNull(rs.getString(dentaldailydetail.getFDentalCategoryId())));

                }
                v_dentaldailydetail.add(dentaldailydetail);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_dentaldailydetail;
    }
    public String setSaveDentalDaily(DentalTDailySummary item, String flagpage) throws Exception {
        int chk=0;
        String sql="", max="", dental_date="";
        DentalTDailySummary dentaldaily = new DentalTDailySummary();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            dentaldaily = getDentalDailyByPK(item.getDentalDailyId());
            item.setRemark(item.getRemark().replace("'", "''"));
            dental_date=config1.DateFormatShow2DB(item.getDentalDate(), "ddMMyyyy");

            if(dentaldaily.getDentalDailyId().equals("")){
                max = getMaxRowDentalDaily(conn);
                sql="Insert Into "+dentaldaily.getDentalTDailySummary()+"("
                        +dentaldaily.getFDentalDailyId()+", "+dentaldaily.getFBranchId()+", "
                        +dentaldaily.getFDentalDate()+","+ dentaldaily.getFDentalActive()+","
                        +dentaldaily.getFPatientCnt()+","+ dentaldaily.getFPatientSummary()+","
                        +dentaldaily.getFRemark()+","+ dentaldaily.getFUcPreventiont()+","
                        +dentaldaily.getFUcTreatment()+","+ dentaldaily.getFUserIdCreate()+","
                        +dentaldaily.getFUserIdModify()+","+ dentaldaily.getFUserIdCancel()+","
                        +dentaldaily.getFDateCreate()+","+ dentaldaily.getFDateModify()+","
                        +dentaldaily.getFDateCancel()+","+dentaldaily.getFPatientCntVn()+") "
                        +"Values('"+max+"','"+item.getBranchId() + "','"
                        +dental_date+"','"+item.getDentalActive() + "','"
                        +item.getPatientCnt()+"','"+item.getPatientSummary() + "','"
                        +item.getRemark()+"',"+item.getUcPrevention() + ","
                        +item.getUcTreatment()+",'"+item.getUserIdCreate() + "','"
                        +item.getUserIdModify()+"','"+item.getUserIdCancel() + "','"
                        +item.getDateCreate()+"','"+item.getDateModify() + "','"
                        +item.getDateCancel()+"',"+item.getPatientCntVn()+") ";
            }
            else{
                max = item.getDentalDailyId();
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+dentaldaily.getDentalTDailySummary()+" set "
                +dentaldaily.getFBranchId()+" = '"+item.getBranchId()+"', "
                +dentaldaily.getFDentalDate()+" = '"+dental_date+"', "
                +dentaldaily.getFDentalActive()+" = '"+item.getDentalActive()+"', "
                +dentaldaily.getFPatientCnt()+" = '"+item.getPatientCnt()+"', "
                +dentaldaily.getFPatientSummary()+" = '"+item.getPatientSummary()+"', "
                +dentaldaily.getFRemark()+" = '"+item.getRemark()+"', "
                +dentaldaily.getFUcPreventiont()+" = '"+item.getUcPrevention()+"', "
                +dentaldaily.getFUcTreatment()+" = '"+item.getUcTreatment()+"', "
                +dentaldaily.getFDateCreate()+" = '"+item.getDateCreate()+"', "
                +dentaldaily.getFDateModify()+" = '"+item.getDateModify()+"', "
                +dentaldaily.getFDateCancel()+" = '"+item.getDateCancel()+"', "
                +dentaldaily.getFUserIdCreate()+" = '"+item.getUserIdCreate()+"', "
                +dentaldaily.getFUserIdModify()+" = '"+item.getUserIdModify()+"', "
                +dentaldaily.getFUserIdCancel()+" = '"+item.getUserIdCancel()+"', "
                +dentaldaily.getFPatientCntVn()+" = '"+item.getPatientCntVn()+"' "
                +"Where "+dentaldaily.getFDentalDailyId()+" = '"+item.getDentalDailyId()+"'";
//                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String setSaveDentalDailyDetail(DentalTDailySummaryDetail item, String flagpage, String flag) throws Exception {
        int chk=0;
        String sql="", max="", dental_date="", time="";
        DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            dentaldailydetail = getDentalDailyDetailByPK(item.getDetalDailyDetailId(),flagpage);
            item.setRemark(item.getRemark().replace("'", "''"));
            item.setDoctorNamet(item.getDoctorNamet().replace("'", "''"));
            item.setPatientFullnamet(item.getPatientFullnamet().replace("'", "''"));
            item.setItemNamet(item.getItemNamet().replace("'", "''"));
            item.setFnNamet(item.getFnNamet().replace("'", "''"));
            item.setTreatmentDescription(item.getTreatmentDescription().replace("'", "''"));
            dental_date=config1.DateFormatShow2DB(item.getDentalDate(), "ddMMyyyy");
            dental_date=item.getDentalDate();

            if(dentaldailydetail.getDetalDailyDetailId().equals("")){
                time = "0000"+item.getDentalTime();
                item.setDentalTime(time.substring(time.length()-4, time.length()));
                max = getMaxRowDentalDailyDetail(conn,flagpage);
                sql="Insert Into "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage+"("
                        +dentaldailydetail.getFDentalDailyDetailId()+", "+dentaldailydetail.getFDentalDailyId()+", "
                        +dentaldailydetail.getFDentalDate()+","+ dentaldailydetail.getFDentalDailyDetailActive()+","
                        +dentaldailydetail.getFDentalTime()+","+ dentaldailydetail.getFDoctorId()+","
                        +dentaldailydetail.getFDoctorNamet()+","+ dentaldailydetail.getFFnId()+","
                        +dentaldailydetail.getFFnNamet()+","+ dentaldailydetail.getFItemId()+","
                        +dentaldailydetail.getFItemNamet()+","+ dentaldailydetail.getFItemNettotal()+","
                        +dentaldailydetail.getFItemQty()+","+ dentaldailydetail.getFPatientHnNo()+","
                        +dentaldailydetail.getFPatientFullNamet()+","+ dentaldailydetail.getFRemark()+","
                        +dentaldailydetail.getFPaidId()+","+ dentaldailydetail.getFPaidNamet()+","
                        +dentaldailydetail.getFTreatmentDescription()+","+ dentaldailydetail.getFTreatmentNettotal()+","
                        +dentaldailydetail.getFPatientVnId()+","+dentaldailydetail.getFPaid()+","
                        +dentaldailydetail.getFCash()+","+dentaldailydetail.getFCredit()+","
                        +dentaldailydetail.getFPriceDiscount()+","+dentaldailydetail.getFDentalCategoryId()+") "
                        +"Values('"+max+"','"+item.getDentalDailyId() + "','"
                        +dental_date+"','"+item.getDentalDailyDetailActive() + "','"
                        +item.getDentalTime()+"','"+item.getDoctorId() + "','"
                        +item.getDoctorNamet()+"','"+item.getFnId() + "','"
                        +item.getFnNamet()+"','"+item.getItemId() + "','"
                        +item.getItemNamet()+"',"+item.getItemNettoal() + ","
                        +item.getItemQty()+",'"+item.getPatientHnNo() + "','"
                        +item.getPatientFullnamet()+"','"+item.getRemark() + "','"
                        +item.getPaidId()+"','"+item.getPaidNamet() + "','"
                        +item.getTreatmentDescription()+"',"+item.getTreatmentNettotal()+",'"
                        +item.getPatientVnId()+ "',"+item.getPaid()+","
                        +item.getCash()+","+item.getCredit()+","
                        +item.getPriceDiscount()+",'"+item.getDentalCategoryId()+"') ";
            }
            else{
                max = item.getDentalDailyId();
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                if(flag.equals("import")){
                    sql = "Update "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage+" set "
                +dentaldailydetail.getFDentalDailyId()+" = '"+item.getDentalDailyId()+"', "
                +dentaldailydetail.getFDentalDate()+" = '"+dental_date+"', "
                +dentaldailydetail.getFDentalDailyDetailActive()+" = '"+item.getDentalDailyDetailActive()+"', "
                +dentaldailydetail.getFDentalTime()+" = '"+item.getDentalTime()+"', "
                +dentaldailydetail.getFDoctorId()+" = '"+item.getDoctorId()+"', "
                +dentaldailydetail.getFDoctorNamet()+" = '"+item.getDoctorNamet()+"', "
                +dentaldailydetail.getFFnId()+" = '"+item.getFnId()+"', "
                +dentaldailydetail.getFFnNamet()+" = '"+item.getFnNamet()+"', "
                +dentaldailydetail.getFItemId()+" = '"+item.getItemId()+"', "
                +dentaldailydetail.getFItemNamet()+" = '"+item.getItemNamet()+"', "
                +dentaldailydetail.getFItemNettotal()+" = "+item.getItemNettoal()+", "
                +dentaldailydetail.getFItemQty()+" = "+item.getItemQty()+", "
                +dentaldailydetail.getFPatientHnNo()+" = '"+item.getPatientHnNo()+"', "
                +dentaldailydetail.getFPatientFullNamet()+" = '"+item.getPatientFullnamet()+"', "
                +dentaldailydetail.getFRemark()+" = '"+item.getRemark()+"', "
                +dentaldailydetail.getFTreatmentDescription()+" = '"+item.getTreatmentDescription()+"', "
                +dentaldailydetail.getFPaidId()+" = '"+item.getPaidId()+"', "
                +dentaldailydetail.getFPaidNamet()+" = '"+item.getPaidNamet()+"', "
                +dentaldailydetail.getFTreatmentNettotal()+" = "+item.getTreatmentNettotal()+", "
                +dentaldailydetail.getFPatientVnId()+" = '"+item.getPatientVnId()+"', "
                +dentaldailydetail.getFCash()+" = "+item.getCash()+", "
                +dentaldailydetail.getFCredit()+" = "+item.getCredit()+" "                
                +"Where "+dentaldailydetail.getFDentalDailyDetailId()+" = '"+item.getDetalDailyDetailId()+"'";
                }
                else if(flag.equals("normal")){
                    sql = "Update "+dentaldailydetail.getDentalTDailySummaryDetail()+" set "
//                +dentaldailydetail.getFDentalDailyId()+" = '"+item.getDentalDailyId()+"', "
//                +dentaldailydetail.getFDentalDate()+" = '"+dental_date+"', "
//                +dentaldailydetail.getFDentalDailyDetailActive()+" = '"+item.getDentalDailyDetailActive()+"', "
//                +dentaldailydetail.getFDentalTime()+" = '"+item.getDentalTime()+"', "
//                +dentaldailydetail.getFDoctorId()+" = '"+item.getDoctorId()+"', "
//                +dentaldailydetail.getFDoctorNamet()+" = '"+item.getDoctorNamet()+"', "
//                +dentaldailydetail.getFFnId()+" = '"+item.getFnId()+"', "
//                +dentaldailydetail.getFFnNamet()+" = '"+item.getFnNamet()+"', "
//                +dentaldailydetail.getFItemId()+" = '"+item.getItemId()+"', "
//                +dentaldailydetail.getFItemNamet()+" = '"+item.getItemNamet()+"', "
//                +dentaldailydetail.getFItemNettotal()+" = "+item.getItemNettoal()+", "
//                +dentaldailydetail.getFItemQty()+" = "+item.getItemQty()+", "
//                +dentaldailydetail.getFPatientHnNo()+" = '"+item.getPatientHnNo()+"', "
//                +dentaldailydetail.getFPatientFullNamet()+" = '"+item.getPatientFullnamet()+"', "                
//                +dentaldailydetail.getFTreatmentDescription()+" = '"+item.getTreatmentDescription()+"', "
//                +dentaldailydetail.getFPaidId()+" = '"+item.getPaidId()+"', "
//                +dentaldailydetail.getFPaidNamet()+" = '"+item.getPaidNamet()+"', "
//                +dentaldailydetail.getFTreatmentNettotal()+" = "+item.getTreatmentNettotal()+", "
//                +dentaldailydetail.getFPatientVnId()+" = '"+item.getPatientVnId()+"' "
                +dentaldailydetail.getFRemark()+" = '"+item.getRemark()+"', "
                +dentaldailydetail.getFPriceService()+" = "+item.getPriceSerivce()+", "
                +dentaldailydetail.getFPriceLab()+" = "+item.getPriceLab()+", "
                +dentaldailydetail.getFPriceXRay()+" = "+item.getPriceXRay()+", "
                +dentaldailydetail.getFPriceDiscount()+" = "+item.getPriceDiscount()+", "
                +dentaldailydetail.getFCredit()+" = "+item.getCredit()+", "
                +dentaldailydetail.getFPaid()+" = "+item.getPaid()+", "
                +dentaldailydetail.getFCash()+" = "+item.getCash()+", "
                +dentaldailydetail.getFDentalCategoryId()+" = '"+item.getDentalCategoryId()+"' "
                +"Where "+dentaldailydetail.getFDentalDailyDetailId()+" = '"+item.getDetalDailyDetailId()+"'";
                }
//                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public Vector setDentalVisitDateDetailImport(String branch_id, String visit_date, String flag){
        Vector v_visit = new Vector();
        Vector v_doctor_order_lab = new Vector();
        Vector v_dental_daily_detail = new Vector();
        Vector v_patient_visit_paid = new Vector();
        Vector v_patient_viewbyfn = new Vector();
        Vector v_patient_paid_item = new Vector();
        Double paid=0.0, discount=0.0, service=0.0;

        try{
            v_visit = config1.getPatientVisit(branch_id, visit_date,"115");
            PatientVisit patientvisit = new PatientVisit();
            DoctorOrderLab doctororderlab = new DoctorOrderLab();
            DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
            PatientVisitPaid patientvisitpaid = new PatientVisitPaid();
            for(int i=0;i<=v_visit.size()-1;i++){
                dentaldailydetail = new DentalTDailySummaryDetail();
                patientvisit = (PatientVisit)v_visit.get(i);

                dentaldailydetail.setDentalDate(patientvisit.getVisitDate().substring(0, 10));
                dentaldailydetail.setDentalTime(patientvisit.getVisitTime());
                dentaldailydetail.setPatientHnNo(patientvisit.getPatientId());
                dentaldailydetail.setPatientFullnamet(patientvisit.getPatientNamet());
                dentaldailydetail.setPatientVnId(patientvisit.getVisitVn());
                dentaldailydetail.setDentalDailyDetailActive("1");
                dentaldailydetail.setDoctorId(patientvisit.getVisitDoctorId());
                dentaldailydetail.setDoctorNamet(patientvisit.getVisitDoctorNamet());
                dentaldailydetail.setPaidId(patientvisit.getVisitPaidId());
                dentaldailydetail.setPaidNamet(patientvisit.getVisitPaidNamet());
                dentaldailydetail.setPatientVnId(patientvisit.getVisitVn());
                //
                paid=0.0; discount=0.0; service=0.0;
                if(patientvisit.getPatientId().equals("1461432")){
                    paid=0.0;
                }
                v_doctor_order_lab = config1.getDoctorOrderLabByPatientHnNo(branch_id, visit_date, patientvisit.getVisitDoctorId(), patientvisit.getPatientId());
                v_patient_visit_paid = config1.getPatientVisitPaid(branch_id, visit_date, patientvisit.getPatientId(), patientvisit.getVisitVn());
                v_patient_paid_item = config1.getPatientVisitPaidByItem(branch_id, visit_date, patientvisit.getPatientId(), patientvisit.getVisitVn());
                for(int k=0;k<=v_patient_visit_paid.size()-1;k++){
                    patientvisitpaid = new PatientVisitPaid();
                    patientvisitpaid = (PatientVisitPaid)v_patient_visit_paid.get(k);
                    paid += patientvisitpaid.getPaid();
                }
                for(int k=0;k<=v_patient_paid_item.size()-1;k++){
                    patientvisitpaid = new PatientVisitPaid();
                    patientvisitpaid = (PatientVisitPaid)v_patient_paid_item.get(k);
                    if(patientvisitpaid.getItemId().equals("517")){
                        discount += patientvisitpaid.getPaid();
                    }
                    if(patientvisitpaid.getItemId().equals("448") || patientvisitpaid.getItemId().equals("468")){
                        service +=patientvisitpaid.getPaid();
                    }
                }
                paid = paid-service;
                dentaldailydetail.setPriceDiscount(discount);
                dentaldailydetail.setPaid(paid);
                if(dentaldailydetail.getPaidId().equals("02")){
                    dentaldailydetail.setCash(paid);
                    dentaldailydetail.setCredit(0.0);
                }
                else{
                    dentaldailydetail.setCash(0.0);
                    dentaldailydetail.setCredit(paid);
                }



                v_dental_daily_detail.add(dentaldailydetail);




//                for(int j=0;j<=v_doctor_order_lab.size()-1;j++){
//                    doctororderlab = new DoctorOrderLab();
//                    doctororderlab = (DoctorOrderLab)v_doctor_order_lab.get(j);
//
//
//
//                    dentaldailydetail.setFnId("lab");
//                    dentaldailydetail.setFnNamet("ค่า LAB");
//
//                    dentaldailydetail.setItemId(doctororderlab.getLabId());
//                    dentaldailydetail.setItemNamet(doctororderlab.getLabNamet());
//                    dentaldailydetail.setItemNettoal(doctororderlab.getPriceSale());
//
//
//                    v_dental_daily_detail.add(dentaldailydetail);
//                }
                
//                    patientvisitpaid = new PatientVisitPaid();
//                    patientvisitpaid = (PatientVisitPaid)v_patient_visit_paid.get(k);
//                    dentaldailydetail.setDentalDate(patientvisitpaid.getPaidDate());
//                    dentaldailydetail.setDentalTime(patientvisit.getVisitTime());
//                    dentaldailydetail.setPatientHnNo(patientvisit.getPatientId());
//                    dentaldailydetail.setPatientFullnamet(patientvisit.getPatientNamet());
//                    dentaldailydetail.setPatientVnId(patientvisit.getVisitVn());
//
//                    dentaldailydetail.setDentalDailyDetailActive("1");
//                    dentaldailydetail.setDoctorId(patientvisit.getVisitDoctorId());
//                    dentaldailydetail.setDoctorNamet(patientvisit.getVisitDoctorNamet());
//                    dentaldailydetail.setFnId("paid");
//                    dentaldailydetail.setFnNamet("ค่า paid");
//
//                    dentaldailydetail.setItemId(patientvisitpaid.getFnId());
//                    dentaldailydetail.setItemNamet(patientvisitpaid.getFnNamet());
//                    dentaldailydetail.setItemNettoal(patientvisitpaid.getPaid());
//                    dentaldailydetail.setPaidId(patientvisit.getVisitPaidId());
//                    dentaldailydetail.setPaidNamet(patientvisit.getVisitPaidNamet());
//
//                    v_dental_daily_detail.add(dentaldailydetail);
//                }

            }
            for(int l=0;l<=v_dental_daily_detail.size()-1;l++){
                dentaldailydetail = new DentalTDailySummaryDetail();
                dentaldailydetail = (DentalTDailySummaryDetail)v_dental_daily_detail.get(l);
                setSaveDentalDailyDetail(dentaldailydetail,"_temp", flag);
            }
            v_patient_viewbyfn = getDentalViewByFn(branch_id, visit_date, "_temp");
        }
        catch(Exception ex){
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_viewbyfn;
    }
    public Vector getDentalViewByFn(String branch_id, String visit_date, String flagpage){
        Connection conn;
        Statement st;
        String sql="";
        Vector v_patient_fn = new Vector();
        PatientViewByFN patientviewbyfn = new PatientViewByFN();
        try {
            sql="Select dental_date, paid_id, paid_namet, count(patient_hn_no) as cnt, sum(paid) as paid "
                +"From dental_t_daily_summary_detail"+flagpage+" "
                +"Where dental_date = '"+visit_date+"' "
                +"group by dental_date, paid_id, paid_namet "
                +"order by dental_date, cnt desc";
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                patientviewbyfn = new PatientViewByFN();
                patientviewbyfn.setFnId(rs.getString("paid_id"));
                patientviewbyfn.setFnNamet(rs.getString("paid_namet"));
                patientviewbyfn.setPatientCntVn(Double.parseDouble(rs.getString("cnt")));
                patientviewbyfn.setPatientNettotal(Double.parseDouble(rs.getString("paid")));
                patientviewbyfn.setVisitDate(config1.DateFormatDB2Show(rs.getString("dental_date"),"ddMMyyyy"));
                v_patient_fn.add(patientviewbyfn);
            }
            rs.close();
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_fn;
    }
    public Double getDentalPatientCount(String branch_id, String visit_date, String flagpage){
        Connection conn;
        Statement st;
        String sql="";
        Double cnt = 0.0;
//        PatientViewByFN patientviewbyfn = new PatientViewByFN();
        try {
            sql="select count(distinct patient_hn_no) as cnt "
                +"From dental_t_daily_summary_detail"+flagpage+" "
                +"Where dental_date = '"+visit_date+"' ";
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                cnt = Double.parseDouble(rs.getString("cnt"));
            }
            rs.close();
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnt;
    }
    public Vector getDentalViewByPatient(String branch_id, String visit_date, String flagpage) {
        Connection conn;
        Statement st;
        String sql="";
        Vector v_patient_fn = new Vector();
        PatientViewByFN patientviewbyfn = new PatientViewByFN();
        try {
            sql="select dental_date, paid_id, paid_namet, count(patient_hn_no) as cnt, sum(item_nettotal) as nettotal "
                +"From dental_t_daily_summary_detail"+flagpage+" "
                +"Where dental_date = '"+visit_date+"' "
                +"group by dental_date, paid_id, paid_namet "
                +"order by dental_date, cnt desc";
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                patientviewbyfn = new PatientViewByFN();
                patientviewbyfn.setFnId(rs.getString("paid_id"));
                patientviewbyfn.setFnNamet(rs.getString("paid_namet"));
                patientviewbyfn.setPatientCntVn(Double.parseDouble(rs.getString("cnt")));
                patientviewbyfn.setPatientNettotal(Double.parseDouble(rs.getString("nettotal")));
                patientviewbyfn.setVisitDate(config1.DateFormatDB2Show(rs.getString("dental_date"),"ddMMyyyy"));
                v_patient_fn.add(patientviewbyfn);
            }
            rs.close();
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_fn;
    }
    public void setDeleteDentaldailyDetail(String flagpage) {
        Connection conn;
        Statement st;
        String sql="";
        DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
        try {
            sql="Delete From "+dentaldailydetail.getDentalTDailySummaryDetail()+flagpage;
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            st.executeUpdate(sql);
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setSaveDetailImport(String dental_daily_id,String flag){
        Vector v_detail = new Vector();
        v_detail = getDentalDailyDetail(dental_daily_id,"_tempimport");
        DentalTDailySummaryDetail dentaldailydetail = new DentalTDailySummaryDetail();
        for(int i=0;i<=v_detail.size()-1;i++){
            dentaldailydetail = (DentalTDailySummaryDetail) v_detail.get(i);
            dentaldailydetail.setDentalDailyId(dental_daily_id);
            dentaldailydetail.setDetalDailyDetailId("");
            try {
                setSaveDentalDailyDetail(dentaldailydetail, "", flag);
            } catch (Exception ex) {
                Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setDeleteDentaldailyDetail("_temp");
    }
    public String CboDentalBCategory(String branch_id, String selected){
        String txt="",sql="";
        Vector v_dentalcategory = new Vector();
        DentalBCategory dentalcategory = new DentalBCategory();
        v_dentalcategory = getDentalBCategory(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_dentalcategory.size()-1;i++) {
            dentalcategory = (DentalBCategory) v_dentalcategory.get(i);
            if(dentalcategory.getDentalCategoryId().equals(selected)){
                txt += "<option value='"+dentalcategory.getDentalCategoryId()+"' selected>"+dentalcategory.getDentalCategoryNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+dentalcategory.getDentalCategoryId()+"' >"+dentalcategory.getDentalCategoryNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboDentalBCategory(String branch_id, String selected, Vector v_dentalcategory){
        String txt="",sql="";
//        Vector v_dentalcategory = new Vector();
        DentalBCategory dentalcategory = new DentalBCategory();
//        v_dentalcategory = getDentalBCategory(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_dentalcategory.size()-1;i++) {
            dentalcategory = (DentalBCategory) v_dentalcategory.get(i);
            if(dentalcategory.getDentalCategoryId().equals(selected)){
                txt += "<option value='"+dentalcategory.getDentalCategoryId()+"' selected>"+dentalcategory.getDentalCategoryNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+dentalcategory.getDentalCategoryId()+"' >"+dentalcategory.getDentalCategoryNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getDentalBCategory(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        DentalBCategory dentalcategory = new DentalBCategory();
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Select "+dentalcategory.getFDentalCategoryId()+", "+dentalcategory.getFDentalCategoryNamet()+" "
                    +"From "+dentalcategory.getDentalBCategory()+" "
                    +"Where "+dentalcategory.getFDentalCategoryActive()+"='1'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                dentalcategory = new DentalBCategory();
                dentalcategory.setDentalCategoryId(rs.getString(dentalcategory.getFDentalCategoryId()));
                dentalcategory.setDentalCategoryNamet(rs.getString(dentalcategory.getFDentalCategoryNamet()));
                v_result.add(dentalcategory);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }

}
