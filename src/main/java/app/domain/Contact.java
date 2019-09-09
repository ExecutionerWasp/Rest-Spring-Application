package app.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "a_new_crm")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
    @Id
    @Column(name = "ID")
    @NonNull
    private Integer id;

    @NonNull
    @Column(name = "NAME")
    private String name;

    @Column(name = "REGION")
    private String region;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ADDRESS_FIELD")
    private String addressField;

    @Column(name = "CREATED_BY")
    private Integer createdBy;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATE")
    private Date dateCreate;

    @Column(name = "UPDATE_BY")
    private Integer updateBy;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    @Column(name = "TYPE_COMPANY")
    private String typeCompany;

    @Column(name = "ALL_AREA")
    private Integer allArea;

    @Column(name = "EQUIPMENT")
    private String equipment;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "WHAT_EVENT")
    private String whatEvent;

    @Column(name = "LAST_ACT")
    private String lastAct;

    @Column(name = "TYPE_IN_CRM")
    private String typeInCrm;

    @Column(name = "AGROHOLDING_STATUS")
    private Integer agroholdingStatus;

    @Column(name = "AGROHOLDING_1")
    private String agroholdingFirst;

    @Column(name = "AGROHOLDING_2")
    private String agroholdingSecond;

    @Column(name = "PRODUCTS")
    private String products;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "WEB_SITE")
    private String webSite;

    @Column(name = "E_CODE")
    private Integer eCode;

    @Column(name = "SUM_OF_PURCHASE")
    private Double sumOfPurchase;

    @Column(name = "qualified")
    private Integer qualified;

    @Column(name = "warm_category")
    private String warmCategory;

    @Column(name = "FIRST_COMMENT")
    private String firstComment;

    @Column(name = "lat")
    private Float lat;

    @Column(name = "lng")
    private Float lng;
}
