/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifmt.gestaoDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author leuca
 */
public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestaoEmpregoPU");
        
        EntityManager em = emf.createEntityManager();
        
        Vaga vaga = new Vaga();
        vaga.setTitulo_cargo("Lixeiro");
        vaga.setEmpresa("Prefeitura de Cuiabá");
        vaga.setLocalizacao("Bostil");
        vaga.setTipo_contrato(1);
        vaga.setDescricao("Limpar a rua");
        vaga.setSalario(1500.00);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(vaga);
        tx.commit();
        em.close();
        emf.close();

    }
}
