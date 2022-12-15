package freire.ermeson.utils;

import javax.persistence.EntityManager;

public class ConsultarPaciente {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.conexao();
        em.getTransaction().begin();

        em.getTransaction().commit();
        JpaUtil.fechaConexao();
    }
}
