package com.docfin.platform.model;

import com.docfin.platform.DbSettings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by amit on 8/16/16.
 */
@Entity
@Table(name = "COUNTRY", schema = "DOCFIN_PLATFORM")
public class Country extends AbstractEntity {

    @NotNull
    @Column(name = "NAME", length = DbSettings.SHORT_TEXT)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Country  create(String name) {
        Country country = new Country();
        country.setName(name);
        country.lastModifiedBy = System.getProperty("user.name");
        country.createdBy = System.getProperty("user.name");
        country.lastModifiedOn = new Date();
        country.createdOn = new Date();
        return country;
    }
}
