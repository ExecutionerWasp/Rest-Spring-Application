package app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.json.bind.annotation.JsonbDateFormat;
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
    @JsonProperty
    private Integer id;

    @NonNull
    @Column(name = "NAME")
    @JsonProperty
    private String name;

    @Column(name = "REGION")
    @JsonProperty
    private String region;

    @Column(name = "DISTRICT")
    @JsonProperty
    private String district;

    @Column(name = "ADDRESS")
    @JsonProperty
    private String address;

    @Column(name = "ADDRESS_FIELD")
    @JsonProperty
    private String addressField;

    @Column(name = "CREATED_BY")
    @JsonProperty
    private Integer createdBy;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATE")
    @JsonProperty
    @JsonbDateFormat("dd-MM-yyyy")
    private Date dateCreate;

    @Column(name = "UPDATE_BY")
    @JsonProperty
    private Integer updateBy;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_UPDATE")
    @JsonProperty
    @JsonbDateFormat("dd-MM-yyyy")
    private Date dateUpdate;

    @Column(name = "TYPE_COMPANY")
    @JsonProperty
    private String typeCompany;

    @Column(name = "ALL_AREA")
    @JsonProperty
    private Integer allArea;

    @Column(name = "EQUIPMENT")
    @JsonProperty
    private String equipment;

    @Column(name = "SOURCE")
    @JsonProperty
    private String source;

    @Column(name = "WHAT_EVENT")
    @JsonProperty
    private String whatEvent;

    @Column(name = "LAST_ACT")
    @JsonProperty
    private String lastAct;

    @Column(name = "TYPE_IN_CRM")
    @JsonProperty
    private String typeInCrm;

    @Column(name = "AGROHOLDING_STATUS")
    @JsonProperty
    private Integer agroholdingStatus;

    @Column(name = "AGROHOLDING_1")
    @JsonProperty
    private String agroholdingFirst;

    @Column(name = "AGROHOLDING_2")
    @JsonProperty
    private String agroholdingSecond;

    @Column(name = "PRODUCTS")
    @JsonProperty
    private String products;

    @Column(name = "FAX")
    @JsonProperty
    private String fax;

    @Column(name = "WEB_SITE")
    @JsonProperty
    private String webSite;

    @Column(name = "E_CODE")
    @JsonProperty
    private Integer eCode;

    @Column(name = "SUM_OF_PURCHASE")
    @JsonProperty
    private Double sumOfPurchase;

    @Column(name = "qualified")
    @JsonProperty
    private Integer qualified;

    @Column(name = "warm_category")
    @JsonProperty
    private String warmCategory;

    @Column(name = "FIRST_COMMENT")
    @JsonProperty
    private String firstComment;

    @Column(name = "lat")
    @JsonProperty
    private Float lat;

    @Column(name = "lng")
    @JsonProperty
    private Float lng;
}
