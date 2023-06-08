package com.jmg.checkagro.customer.model;

import com.mongodb.client.model.Collation;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.mapping.Collection;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "customer")

public class Customer implements Serializable {

    @Id
    private Long id;
    private String documentType;
    private String documentNumber;
    private String businessName;
    private String email;
    private String phone;
    private LocalDate creation;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean active;

}
