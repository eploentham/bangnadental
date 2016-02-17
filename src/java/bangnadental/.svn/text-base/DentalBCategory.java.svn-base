package bangnadental;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pop
 */
@Entity
@Table(name = "dental_b_category", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "DentalBCategory.findAll", query = "SELECT d FROM DentalBCategory d"), @NamedQuery(name = "DentalBCategory.findByDentalCategoryId", query = "SELECT d FROM DentalBCategory d WHERE d.dentalCategoryId = :dentalCategoryId"), @NamedQuery(name = "DentalBCategory.findByDentalCategoryNamet", query = "SELECT d FROM DentalBCategory d WHERE d.dentalCategoryNamet = :dentalCategoryNamet"), @NamedQuery(name = "DentalBCategory.findByDentalCategoryActive", query = "SELECT d FROM DentalBCategory d WHERE d.dentalCategoryActive = :dentalCategoryActive")})
public class DentalBCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dental_category_id", nullable = false, length = 255)
    private String dentalCategoryId="";
    @Column(name = "dental_category_namet", length = 255)
    private String dentalCategoryNamet="";
    @Column(name = "dental_category_active", length = 255)
    private String dentalCategoryActive="";

    public DentalBCategory() {
    }
    public String getDentalBCategory() {
        return "dental_b_category";
    }

    public String getFDentalCategoryId() {
        return "dental_category_id";
    }
    public String getFDentalCategoryNamet() {
        return "dental_category_namet";
    }
    public String getFDentalCategoryActive() {
        return "dental_category_active";
    }

    public DentalBCategory(String dentalCategoryId) {
        this.dentalCategoryId = dentalCategoryId;
    }

    public String getDentalCategoryId() {
        return dentalCategoryId;
    }
    public void setDentalCategoryId(String dentalCategoryId) {
        this.dentalCategoryId = dentalCategoryId;
    }

    public String getDentalCategoryNamet() {
        return dentalCategoryNamet;
    }
    public void setDentalCategoryNamet(String dentalCategoryNamet) {
        this.dentalCategoryNamet = dentalCategoryNamet;
    }

    public String getDentalCategoryActive() {
        return dentalCategoryActive;
    }
    public void setDentalCategoryActive(String dentalCategoryActive) {
        this.dentalCategoryActive = dentalCategoryActive;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dentalCategoryId != null ? dentalCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DentalBCategory)) {
            return false;
        }
        DentalBCategory other = (DentalBCategory) object;
        if ((this.dentalCategoryId == null && other.dentalCategoryId != null) || (this.dentalCategoryId != null && !this.dentalCategoryId.equals(other.dentalCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.DentalBCategory[dentalCategoryId=" + dentalCategoryId + "]";
    }

}
