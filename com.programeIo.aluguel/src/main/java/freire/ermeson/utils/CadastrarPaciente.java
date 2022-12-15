package freire.ermeson.utils;

import freire.ermeson.models.Paciente;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class CadastrarPaciente {


    public static void main(String[] args) {

        Paciente p1 = new Paciente("Icaro de Oliveira","29621226716");
        Paciente p2 = new Paciente("VINICIUS JUNIOR", "25488385878");

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(p1);
        pacientes.add(p2);

        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();
        for(Paciente p : pacientes){
            em.persist(p);
        }
        em.getTransaction().commit();
        JpaUtil.fechaConexao();
    }
}
