package freire.ermeson.utils;

import freire.ermeson.models.Paciente;

import javax.persistence.EntityManager;

public class RemovePaciente {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();

        Paciente removerPaciente = em.find(Paciente.class, 1L);
        em.remove(removerPaciente);

        em.getTransaction().commit();
        JpaUtil.fechaConexao();
    }
}
