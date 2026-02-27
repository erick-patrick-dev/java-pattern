package dio.java_pattern.service;

import dio.java_pattern.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de Cliente.
 * Isso possibilita a existência de múltiplas implementações da interface.
 *
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
