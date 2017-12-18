package br.com.caelum.estoque.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RelatorioService {

	@WebMethod(operationName = "GerarRelatorio")
	@Oneway
	public void gerarRelatorio() {
		// TESTE
	}

}
