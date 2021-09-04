/*
 * Created on 25 Jul 2021 ( Time 02:07:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "mekanik"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="mekanik", catalog="bengkel_nirwana" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="MekanikEntity.countAll", query="SELECT COUNT(x) FROM MekanikEntity x" )
} )
public class MekanikEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="id_mekanik", nullable=false, length=15)
    private String     idMekanik    ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="nama_mekanik", nullable=false, length=45)
    private String     namaMekanik  ;

    @Column(name="no_hp", nullable=false, length=13)
    private String     noHp         ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public MekanikEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdMekanik( String idMekanik ) {
        this.idMekanik = idMekanik ;
    }
    public String getIdMekanik() {
        return this.idMekanik;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : nama_mekanik ( VARCHAR ) 
    public void setNamaMekanik( String namaMekanik ) {
        this.namaMekanik = namaMekanik;
    }
    public String getNamaMekanik() {
        return this.namaMekanik;
    }

    //--- DATABASE MAPPING : no_hp ( VARCHAR ) 
    public void setNoHp( String noHp ) {
        this.noHp = noHp;
    }
    public String getNoHp() {
        return this.noHp;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idMekanik);
        sb.append("]:"); 
        sb.append(namaMekanik);
        sb.append("|");
        sb.append(noHp);
        return sb.toString(); 
    } 

}