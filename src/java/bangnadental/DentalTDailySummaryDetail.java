package bangnadental;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.bangna.usecase.connection.Persistent;
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;

/**
 *
 * @author pop
 */
//@Entity
//@Table(name = "dental_t_daily_summary_detail", catalog = "bangna", schema = "public")
//@NamedQueries({@NamedQuery(name = "DentalTDailySummaryDetail.findAll", query = "SELECT d FROM DentalTDailySummaryDetail d"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDentalDailyId", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.dentalDailyId = :dentalDailyId"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDentalDate", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.dentalDate = :dentalDate"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDentalTime", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.dentalTime = :dentalTime"), @NamedQuery(name = "DentalTDailySummaryDetail.findByPatientHnNo", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.patientHnNo = :patientHnNo"), @NamedQuery(name = "DentalTDailySummaryDetail.findByPatientFullnamet", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.patientFullnamet = :patientFullnamet"), @NamedQuery(name = "DentalTDailySummaryDetail.findByFnId", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.fnId = :fnId"), @NamedQuery(name = "DentalTDailySummaryDetail.findByFnNamet", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.fnNamet = :fnNamet"), @NamedQuery(name = "DentalTDailySummaryDetail.findByTreatment", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.treatment = :treatment"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDoctorId", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.doctorId = :doctorId"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDoctorNamet", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.doctorNamet = :doctorNamet"), @NamedQuery(name = "DentalTDailySummaryDetail.findByNettotalTreatment", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.nettotalTreatment = :nettotalTreatment"), @NamedQuery(name = "DentalTDailySummaryDetail.findByItemId", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.itemId = :itemId"), @NamedQuery(name = "DentalTDailySummaryDetail.findByItemNamet", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.itemNamet = :itemNamet"), @NamedQuery(name = "DentalTDailySummaryDetail.findByItemQty", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.itemQty = :itemQty"), @NamedQuery(name = "DentalTDailySummaryDetail.findByItemNettoal", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.itemNettoal = :itemNettoal"), @NamedQuery(name = "DentalTDailySummaryDetail.findByDentalDailyFnActive", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.dentalDailyFnActive = :dentalDailyFnActive"), @NamedQuery(name = "DentalTDailySummaryDetail.findByRemark", query = "SELECT d FROM DentalTDailySummaryDetail d WHERE d.remark = :remark")})
public class DentalTDailySummaryDetail extends Persistent{
//    private static final long serialVersionUID = 1L;
//    @Id
//    @Basic(optional = false)
//    @Column(name = "dental_daily_id", nullable = false, length = 255)
    public String dentalDailyId="";
//    @Column(name = "dental_daily_detail_id", nullable = false, length = 255)
    public String dentalDailyDetailId="";
//    @Column(name = "dental_date", length = 255)
    public String dentalDate="";
//    @Column(name = "dental_time", length = 255)
    public String dentalTime="";
//    @Column(name = "patient_hn_no", length = 255)
    public String patientHnNo="";
//    @Column(name = "patient_fullnamet", length = 255)
    public String patientFullnamet="";
//    @Column(name = "fn_id", length = 255)
    public String fnId="";
//    @Column(name = "fn_namet", length = 255)
    public String fnNamet="";
//    @Column(name = "treatment_description", length = 255)
    public String treatmentDescription="";
//    @Column(name = "doctor_id", length = 255)
    public String doctorId="";
//    @Column(name = "doctor_namet", length = 255)
    public String doctorNamet="";
//    @Column(name = "treatment_nettotal", precision = 17, scale = 17)
    public Double treatmentNettotal=0.0;
//    @Column(name = "item_id", length = 255)
    public String itemId="";
//    @Column(name = "item_namet", length = 255)
    public String itemNamet="";
//    @Column(name = "item_qty", precision = 17, scale = 17)
    public Double itemQty=0.0;
//    @Column(name = "item_nettoal", precision = 17, scale = 17)
    public Double itemNettoal=0.0;
//    @Column(name = "dental_daily_detail_active", length = 255)
    public String dentalDailyDetailActive="";
//    @Column(name = "remark", length = 255)
    public String remark="";
//    @Column(name = "paid_id", length = 255)
    public String paidId="";
//    @Column(name = "paid_namet", length = 255)
    public String paidNamet="";
//    @Column(name = "patient_vn_id", length = 255)
    public String patientVnId="";
//    @Column(name = "price_service", length = 255)
    public Double priceService=0.0;
//    @Column(name = "price_pharmacy", length = 255)
    public Double pricePharmacy=0.0;
//    @Column(name = "price_x_ray", length = 255)
    public Double priceXRay=0.0;
//    @Column(name = "price_lab", length = 255)
    public Double priceLab=0.0;
//    @Column(name = "price_discount", length = 255)
    public Double priceDiscount=0.0;
//    @Column(name = "paid ", length = 255)
    public Double paid =0.0;
//    @Column(name = "credit", length = 255)
    public Double credit=0.0;
//    @Column(name = "cash", length = 255)
    public Double cash=0.0;
//    @Column(name = "dental_category_id", length = 255)
    public String dentalCategoryId="";

    public DentalTDailySummaryDetail() {
    }

    public String getDentalTDailySummaryDetail() {
        return "dental_t_daily_summary_detail";
    }

    public String getFDentalDailyId() {
        return "dental_daily_id";
    }
    public String getFDentalDailyDetailId() {
        return "dental_daily_detail_id";
    }
    public String getFDentalDate() {
        return "dental_date";
    }
    public String getFDentalTime() {
        return "dental_time";
    }
    public String getFPatientHnNo() {
        return "patient_hn_no";
    }
    public String getFPatientFullNamet() {
        return "patient_fullnamet";
    }
    public String getFFnId() {
        return "fn_id";
    }
    public String getFFnNamet() {
        return "fn_namet";
    }
    public String getFTreatmentDescription() {
        return "treatment_description";
    }
    public String getFTreatmentNettotal() {
        return "treatment_nettotal";
    }
    public String getFDoctorId() {
        return "doctor_id";
    }
    public String getFDoctorNamet() {
        return "doctor_namet";
    }
    public String getFItemId() {
        return "item_id";
    }
    public String getFItemNamet() {
        return "item_namet";
    }
    public String getFItemQty() {
        return "item_qty";
    }
    public String getFItemNettotal() {
        return "item_nettotal";
    }
    public String getFDentalDailyDetailActive() {
        return "dental_daily_detail_active";
    }
    public String getFRemark() {
        return "remark";
    }
    public String getFPaidId() {
        return "paid_id";
    }
    public String getFPaidNamet() {
        return "paid_namet";
    }
    public String getFPatientVnId() {
        return "patient_vn_id";
    }
    public String getFPricePharmacy() {
        return "price_pharmacy";
    }
    public String getFPriceService() {
        return "price_service";
    }
    public String getFPriceXRay() {
        return "price_x_ray";
    }
    public String getFPriceLab() {
        return "price_lab";
    }
    public String getFPriceDiscount() {
        return "price_discount";
    }
    public String getFPaid() {
        return "paid";
    }
    public String getFCredit() {
        return "credit";
    }
    public String getFCash() {
        return "cash";
    }
    public String getFDentalCategoryId() {
        return "dental_category_id";
    }

    public DentalTDailySummaryDetail(String dentalDailyId) {
        this.dentalDailyId = dentalDailyId;
    }

    public String getDentalDailyId() {
        return dentalDailyId;
    }
    public void setDentalDailyId(String dentalDailyId) {
        this.dentalDailyId = dentalDailyId;
    }

    public String getDentalDate() {
        return dentalDate;
    }

    public void setDentalDate(String dentalDate) {
        this.dentalDate = dentalDate;
    }

    public String getDentalTime() {
        return dentalTime;
    }

    public void setDentalTime(String dentalTime) {
        this.dentalTime = dentalTime;
    }

    public String getPatientHnNo() {
        return patientHnNo;
    }

    public void setPatientHnNo(String patientHnNo) {
        this.patientHnNo = patientHnNo;
    }

    public String getPatientFullnamet() {
        return patientFullnamet;
    }

    public void setPatientFullnamet(String patientFullnamet) {
        this.patientFullnamet = patientFullnamet;
    }

    public String getFnId() {
        return fnId;
    }

    public void setFnId(String fnId) {
        this.fnId = fnId;
    }

    public String getFnNamet() {
        return fnNamet;
    }
    public void setFnNamet(String fnNamet) {
        this.fnNamet = fnNamet;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorNamet() {
        String txt="";
        if(doctorNamet.equals("ท.ญ. พรเพชร หรูจิตรวัฒนา")){//ประกันสังคม (บ.1)
            txt="ท.ญ. พรเพชร";
        }
        else if(doctorNamet.equals("ท.ญ. สุทิพา ชินสว่างวัฒนกุล")){//
            txt="ท.ญ. สุทิพา";
        }
        else if(doctorNamet.equals("ท.ญ. ธีรินทร์  ลิ้มโสภาธรรม")){//
            txt="ท.ญ. ธีรินทร์";
        }
        else if(doctorNamet.equals("ท.ญ. วีรยา ชินสว่างวัฒนกุล")){//
            txt="ท.ญ. วีรยา";
        }
        else if(doctorNamet.equals("ท.พ. สันติ ชัยวัฒน์")){//
            txt="ท.พ. สันติ";
        }
//        else if(paidNamet.equals("ประกันสังคม (บ.1)")){//
//            txt="ปกส.บ1";
//        }
        else {
            txt = doctorNamet;
        }
        return txt;
    }

    public void setDoctorNamet(String doctorNamet) {
        this.doctorNamet = doctorNamet;
    }

    public Double getTreatmentNettotal() {
        return treatmentNettotal;
    }

    public void setTreatmentNettotal(Double treatmentNettotal) {
        this.treatmentNettotal = treatmentNettotal;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemNamet() {
        return itemNamet;
    }
    public void setItemNamet(String itemNamet) {
        this.itemNamet = itemNamet;
    }

    public Double getItemQty() {
        return itemQty;
    }
    public void setItemQty(Double itemQty) {
        this.itemQty = itemQty;
    }

    public Double getItemNettoal() {
        return itemNettoal;
    }
    public void setItemNettoal(Double itemNettoal) {
        this.itemNettoal = itemNettoal;
    }

    public String getDentalDailyDetailActive() {
        return dentalDailyDetailActive;
    }
    public void setDentalDailyDetailActive(String dentalDailyDetailActive) {
        this.dentalDailyDetailActive = dentalDailyDetailActive;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDetalDailyDetailId() {
        return dentalDailyDetailId;
    }
    public void setDetalDailyDetailId(String dentalDailyDetailId) {
        this.dentalDailyDetailId = dentalDailyDetailId;
    }

    public String getPaidId() {
        return paidId;
    }
    public void setPaidId(String paidId) {
        this.paidId = paidId;
    }

    public String getPaidNamet() {
        String txt="";
        if(paidNamet.equals("โครงการประกันสุขภาพถ้วนหน้า")){//ประกันสังคม (บ.1)
            txt="UC";
        }
        else if(paidNamet.equals("ประกันสังคม (บ.1)")){//
            txt="ปกส.บ1";
        }
        else if(paidNamet.equals("ประกันสังคม (บ.2)")){//
            txt="ปกส.บ2";
        }
        else if(paidNamet.equals("โครงการ ANC")){//
            txt="ANC";
        }
        else if(paidNamet.equals("ประกันสังคมอิสระ (บ.1)")){//
            txt="ปกส.อ บ1";
        }
        else if(paidNamet.equals("โครงการประกันสุขภาพถ้วนหน้า(สมุทรปราการ)")){//
            txt="UC. สป";
        }
        else {
            txt = paidNamet;
        }
        return txt;
    }
    public void setPaidNamet(String paidNamet) {
        this.paidNamet = paidNamet;
    }
    public String getPatientVnId() {
        return patientVnId;
    }
    public void setPatientVnId(String patientVnId) {
        this.patientVnId = patientVnId;
    }

    public Double getPriceSerivce() {
        return priceService;
    }
    public void setPriceSerivce(Double priceService) {
        this.priceService = priceService;
    }

    public Double getPricePharmacy() {
        return pricePharmacy;
    }
    public void setPricePharmacy(Double pricePharmacy) {
        this.pricePharmacy = pricePharmacy;
    }

    public Double getPriceXRay() {
        return priceXRay;
    }
    public void setPriceXRay(Double priceXRay) {
        this.priceXRay = priceXRay;
    }

    public Double getPriceLab() {
        return priceLab;
    }
    public void setPriceLab(Double priceLab) {
        this.priceLab = priceLab;
    }

    public Double getPriceDiscount() {
        return priceDiscount;
    }
    public void setPriceDiscount(Double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Double getPaid() {
        return paid;
    }
    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getCredit() {
        return credit;
    }
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }
    public void setDentalCategoryId(String dentalCategoryId) {
        this.dentalCategoryId = dentalCategoryId;
    }
    public String getDentalCategoryId() {
        return dentalCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dentalDailyId != null ? dentalDailyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DentalTDailySummaryDetail)) {
            return false;
        }
        DentalTDailySummaryDetail other = (DentalTDailySummaryDetail) object;
        if ((this.dentalDailyId == null && other.dentalDailyId != null) || (this.dentalDailyId != null && !this.dentalDailyId.equals(other.dentalDailyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.DentalTDailySummaryDetail[dentalDailyId=" + dentalDailyId + "]";
    }

}
