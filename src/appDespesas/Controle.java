package appDespesas;

import java.time.LocalDate;

public class Controle {
public static void main(String[] args) {
	DespesaPessoal despesaPessoal = new DespesaPessoal("125.987.654-91");
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,27),"Luz",50.77));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Farmarcia",22.77));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Feira",15.50));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,2),"Gas",30.55));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,4),"Luz",80.33));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,1,5),"Internet",74.12));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Mercado",100.22));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Farmarcia",42.21));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Feira",30.15));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,2),"Gas",20.17));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,4),"Luz",67.31));
	despesaPessoal.despesas.add(new Despesa(LocalDate.of(2020,2,5),"Internet",55.43));
	System.out.println(despesaPessoal.getTotal());
	despesaPessoal.imprime();
}
}