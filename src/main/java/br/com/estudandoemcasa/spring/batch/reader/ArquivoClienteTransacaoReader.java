package br.com.estudandoemcasa.spring.batch.reader;

import br.com.estudandoemcasa.spring.batch.model.Cliente;
import br.com.estudandoemcasa.spring.batch.model.Transacao;
import org.springframework.batch.item.*;

public class ArquivoClienteTransacaoReader implements ItemStreamReader<Cliente> {

    private Object objAtual;
    private final ItemStreamReader<Object> delega;

    public ArquivoClienteTransacaoReader(ItemStreamReader<Object> delega) {
        this.delega = delega;
    }

    @Override
    public Cliente read() throws Exception {

        if(objAtual == null){
            objAtual = delega.read();
        }

        Cliente cliente = (Cliente) objAtual;
        objAtual = null;

        if(cliente != null){
            while(peek() instanceof Transacao){
                cliente.getListaTransacao().add((Transacao) objAtual);
            }
        }

        return cliente;
    }

    private Object peek() throws Exception {
        objAtual = delega.read();
        return objAtual;
    }


    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        delega.open(executionContext);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        delega.update(executionContext);
    }

    @Override
    public void close() throws ItemStreamException {
        delega.close();
    }
}
