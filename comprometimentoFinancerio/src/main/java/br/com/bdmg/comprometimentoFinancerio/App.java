package br.com.bdmg.comprometimentoFinancerio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {

	public static void main(String[] args){
//Bens ficticios
		Bens casa1 = new Bens(1,"Casa1",1000000);
		Bens casa2 = new Bens(2,"Casa2",2000000);
		Bens casa3 = new Bens(3,"Casa3",3000000);
		Bens casa4 = new Bens(4,"Casa4",4000000);
		Bens casa5 = new Bens(5,"Casa5",5000000);
		Bens casa6 = new Bens(6,"Casa6",6000000);
		Bens casa7 = new Bens(7,"Casa7",7000000);
		Bens casa8 = new Bens(8,"Casa8",8000000);
		Bens casa9 = new Bens(9,"Casa9",9000000);
		Bens casa10 = new Bens(10,"Casa10",10000000);
		Bens casa11= new Bens(11,"Casa11",11000000);
		Bens casa12 = new Bens(12,"Casa12",12000000);
		Bens casa13 = new Bens(13,"Casa13",13000000);
		Bens casa14 = new Bens(14,"Casa14",14000000);
		Bens casa15 = new Bens(15,"Casa15",15000000);
		Bens loja1 = new Bens(16,"Loja1",100000);
		Bens loja2 = new Bens(17,"Loja2",200000);
		Bens loja3 = new Bens(18,"Loja3",300000);
		Bens loja4 = new Bens(19,"Loja4",400000);
		Bens loja5 = new Bens(20,"Loja5",500000);
//lista de bens ficticios		
		ArrayList<Bens> listaBens1 = new ArrayList<Bens>();
		listaBens1.add(casa1);
		ArrayList<Bens> listaBens2 = new ArrayList<Bens>();
		listaBens2.add(casa2);
		listaBens2.add(casa3);
		ArrayList<Bens> listaBens3 = new ArrayList<Bens>();
		listaBens3.add(casa4);
		listaBens3.add(casa5);
		listaBens3.add(casa6);
		ArrayList<Bens> listaBens4 = new ArrayList<Bens>();
		listaBens4.add(casa7);
		listaBens4.add(casa8);
		listaBens4.add(casa9);
		listaBens4.add(casa10);
		ArrayList<Bens> listaBens5 = new ArrayList<Bens>();
		listaBens5.add(casa11);
		listaBens5.add(casa12);
		listaBens5.add(casa13);
		listaBens5.add(casa14);
		listaBens5.add(casa15);
		ArrayList<Bens> listaBens6 = new ArrayList<Bens>();
		listaBens6.add(loja1);
		listaBens6.add(loja2);
		listaBens6.add(loja3);
		ArrayList<Bens> listaBens7 = new ArrayList<Bens>();
		listaBens7.add(loja4);
		listaBens7.add(loja5);
//pessoaJuridica		
		PessoaJuridica empresaA = new PessoaJuridica(0001, "empresaA", null, null);
		PessoaJuridica empresaB = new PessoaJuridica(0002, "empresaB", null, null);
		PessoaJuridica empresaC = new PessoaJuridica(0003, "empresaC", null, null);
		PessoaJuridica empresaD = new PessoaJuridica(0004, "empresaD", null, null);
		PessoaJuridica empresaTeste = new PessoaJuridica(0005, "empresaTeste", null, null);
		PessoaJuridica empresa0socios = new PessoaJuridica(0006, "empresa0socios", null, null);
//pessoa Fisica
		PessoaFisica pessoa1 = new PessoaFisica(1000, "pessoa1", null);
		PessoaFisica pessoa2 = new PessoaFisica(2000, "pessoa2", null);
		PessoaFisica pessoa3 = new PessoaFisica(3000, "pessoa3", null);
		PessoaFisica pessoa4 = new PessoaFisica(4000, "pessoa4", null);
		PessoaFisica pessoa5 = new PessoaFisica(5000, "pessoa5", null);

//setando bens
		pessoa1.setBens(listaBens1);
		pessoa2.setBens(listaBens2);
		pessoa3.setBens(listaBens3);
		pessoa4.setBens(listaBens4);
		pessoa5.setBens(listaBens5);
		empresaTeste.setBens(listaBens6);
		empresa0socios.setBens(listaBens7);
//setando sociedade
		ArrayList<Pessoa> sociedade1 = new ArrayList<Pessoa>();
		sociedade1.add(pessoa1);
		sociedade1.add(pessoa2);
		sociedade1.add(empresaD);
		empresaA.setSociedade(sociedade1);

		ArrayList<Pessoa> sociedade2 = new ArrayList<Pessoa>();
		sociedade2.add(empresaA);
		sociedade2.add(pessoa3);
		empresaB.setSociedade(sociedade2);

		ArrayList<Pessoa> sociedade3 = new ArrayList<Pessoa>();
		sociedade3.add(empresaA);
		sociedade3.add(empresaB);
		sociedade3.add(empresaC);
		sociedade3.add(pessoa1);
		empresaC.setSociedade(sociedade3);

		ArrayList<Pessoa> sociedade4 = new ArrayList<Pessoa>();
		sociedade4.add(empresaC);
		sociedade4.add(pessoa4);
		sociedade4.add(pessoa5);
		empresaD.setSociedade(sociedade4);

		ArrayList<Pessoa> sociedade5 = new ArrayList<Pessoa>();
		sociedade5.add(pessoa1);
		sociedade5.add(empresa0socios);
		empresaTeste.setSociedade(sociedade5);

		ArrayList<Pessoa> sociedade6 = new ArrayList<Pessoa>();
		sociedade6.add(pessoa1);
		sociedade6.add(empresaTeste);
		empresa0socios.setSociedade(sociedade6);

//metodos
		//Cria map com a empresa principal e seus bens
		Map<Integer, Integer> sociosEbens = new HashMap<Integer, Integer>();
		buscaSociedade(empresaA, sociosEbens);

		System.out.println(sociosEbens);
		int sum = sociosEbens.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum); 
	}

	private static void buscaSociedade(Pessoa empresa, Map<Integer, Integer> sociosEbens) {
		int qtdBens = Objects.isNull(empresa.getBens()) ? 0 : empresa.getBens().size();
		int numDocumento = empresa.getDocumento();
		
		if(Objects.isNull(empresa.getSociedade())) {
			return;
		}

		System.out.println( "#1# numdocumento: " +numDocumento );
		sociosEbens.put(numDocumento, qtdBens);
		
		
		
		
		System.out.println( "#2# numdocumento: " +numDocumento );
		
		if(Objects.nonNull(empresa.getSociedade())) {
			for (Pessoa socio : empresa.getSociedade()) {
				
				if(isContemNoArray(sociosEbens, socio)) {
					continue;
				}
				
				if(!isContemNoArray(sociosEbens, socio)) {
					
					int qtdBensSocio = Objects.isNull(socio.getBens()) ? 0 : socio.getBens().size();
					int numDocumentoSocio = socio.getDocumento();
					
					sociosEbens.put(numDocumentoSocio, qtdBensSocio);

					if(socio.getTipoPessoa().equals(TipoPessoa.JURIDICA)) {
						for (Pessoa p : socio.getSociedade()) {
								buscaSociedade(p,sociosEbens);
						}
					}
				}
			}
		}		
	}

	private static boolean isContemNoArray(Map<Integer, Integer> sociosEbens, Pessoa pessoa) {
		return sociosEbens.containsKey(pessoa.getDocumento());
	}


}
