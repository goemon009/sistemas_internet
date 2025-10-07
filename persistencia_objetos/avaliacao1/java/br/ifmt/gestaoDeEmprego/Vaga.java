/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifmt.gestaoDeEmprego;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author leuca
 */
@Entity
@Table(name = "Vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cargo", nullable = true)
    private String titulo_cargo;
    private String empresa;
    @Column(name = "endereco", nullable = true)
    private String localizacao;
    @Column(name = "tipo_contrato", nullable = true)
    private int tipo_contrato;
    private String descricao;
    private double salario;

    public int getId() {
        return id;
    }

    public String getTitulo_cargo() {
        return titulo_cargo;
    }

    public void setTitulo_cargo(String titulo_cargo) {
        this.titulo_cargo = titulo_cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(int tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
