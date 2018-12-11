package br.com.modelagemconceitual.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.modelagemconceitual.domain.Pedido;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Integer>{

}