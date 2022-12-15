package freire.ermeson.utils;

import freire.ermeson.models.Paciente;

import javax.persistence.EntityManager;
import java.util.Date;

public class AtualizaPaciente {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();

        Paciente buscaPaciente = em.find(Paciente.class,1L);
        buscaPaciente.setDataNascimento(new Date());
        //   System.out.println(buscaPaciente);

        em.getTransaction().commit();
        JpaUtil.fechaConexao();
    }
}
