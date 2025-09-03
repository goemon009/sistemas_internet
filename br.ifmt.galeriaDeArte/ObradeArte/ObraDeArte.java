/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifmt.galeriaDeArte;

/**
 *
 * @author leuca
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Calendar;

@Entity
public class ObraDeArte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    @Column(name = "nome_autor", nullable = true)
    private String autor;
    private String tecnica;
    private String tipo;
    private String procedencia;
    private String dimencoes;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_obra", nullable = true)
    private Calendar dataObra;

    public Calendar getDataObra() {
        return dataObra;
    }

    public void setDataObra(Calendar dataObra) {
        this.dataObra = dataObra;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getDimencoes() {
        return dimencoes;
    }

    public void setDimencoes(String dimencoes) {
        this.dimencoes = dimencoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

}
