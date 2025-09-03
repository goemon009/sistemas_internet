import br.ifmt.galeriaDeArte.ObraDeArte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leuca
 */
public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GaleriaArtePU");
        
        EntityManager em = emf.createEntityManager();
        
        ObraDeArte obra = new ObraDeArte();
        obra.setTitulo("Femmes au jardin");
        obra.setAutor("Claude Monet");
        obra.setTecnica("Óleo sobre tela");
        obra.setTipo("Quadro");
        obra.setDataObra(parseData("13/12/2023"));
        obra.setProcedencia("Duvidosa");
        obra.setDimencoes("154cm x 154cm");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obra);
        tx.commit();
        em.close();
        emf.close();
    }
    
    private static Calendar parseData(String data){
        try{
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex){
            throw new IllegalArgumentException(ex);
        }
    }
}
