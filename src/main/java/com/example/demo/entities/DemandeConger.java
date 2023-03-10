package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class DemandeConger implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_demande_conger", nullable = false)
    private Long idDemandeConger;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employer")
    private Employer employer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="enseignant")
    private Enseignant enseignant;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SA")
    private StaffAdministratif SA;


    public enum etat{ACCEPTE, ATTENTE, REFUSE}
    public enum cause{MALADIE, MATERNITE, PATERNITE,CORONA }
    public enum typecongé{PAYE ,SANSSOLDE}

    private cause type;
    private typecongé Typecongé;
    private String Justification;
    private Date DateDebut;
    private Date DateFin;
    private etat EtatDemande;

    public DemandeConger() {

    }

    public DemandeConger( Employer employer, Enseignant enseignant, StaffAdministratif SA, cause type, typecongé typecongé, String justification, Date dateDebut, Date dateFin, etat etatDemande) {
        this.employer = employer;
        this.enseignant = enseignant;
        this.SA = SA;
        this.type = type;
        Typecongé = typecongé;
        Justification = justification;
        DateDebut = dateDebut;
        DateFin = dateFin;
        EtatDemande = etatDemande;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public StaffAdministratif getSA() {
        return SA;
    }

    public void setSA(StaffAdministratif SA) {
        this.SA = SA;
    }

    public cause getType() {
        return type;
    }

    public void setType(cause type) {
        this.type = type;
    }

    public typecongé getTypecongé() {
        return Typecongé;
    }

    public void setTypecongé(typecongé typecongé) {
        Typecongé = typecongé;
    }

    public String getJustification() {
        return Justification;
    }

    public void setJustification(String justification) {
        Justification = justification;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }

    public etat getEtatDemande() {
        return EtatDemande;
    }

    public void setEtatDemande(etat etatDemande) {
        EtatDemande = etatDemande;
    }
}
//Constructors

//Getters and Setters
