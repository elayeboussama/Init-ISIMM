package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Unite implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_unite", nullable = false)
    private Long idUnite;

    @Column(length = 100)
    private String name;




    @ManyToMany
    private Set<Semestre> semestres;


    public Unite() {

    }
    @OneToMany(mappedBy = "unite",fetch=FetchType.LAZY)
    private Set<Matiere> matieres;


    public Unite(String name, Set<Matiere> matieres, Set<Semestre> semestres) {
        this.name = name;
        this.matieres = matieres;
        this.semestres = semestres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(Set<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Set<Semestre> getSemestres() {
        return semestres;
    }

    public void setSemestres(Set<Semestre> semestres) {
        this.semestres = semestres;
    }
}
//Constructors

//Getters and Setters
