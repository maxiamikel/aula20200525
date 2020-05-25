package aula20200525;

public class AppPais {

	public static void main(String[] args) {
		Pais brazil = new Pais("Brazil", +55);
		Pais canada = new Pais("Canada", +32);

		Estado pr = new Estado("Paraná", "PR", 44);
		Estado sc = new Estado("Santa Catarina", "SC", 43);
		Estado sp = new Estado("São Paulo", "SP", 11);

		brazil.addEstado(pr);
		brazil.addEstado(sc);
		brazil.addEstado(sp);

		imprimirNaTela(brazil);

	}

	private static void imprimirNaTela(Pais e) {
		System.out.println("Pais: " + e.getNome());
		System.out.println("Codigo DDI: " + e.getCodigoDDI());
		System.out.println("...............");
		System.out.println("Quandidade de stados: "+e.contarEstado());
		System.out.println("...............");
		for (int i = 0; i < e.getEstado().size(); i += 1) {
			System.out.println("Nome Estado: " + e.getEstado().get(i).getNome());
			System.out.println("Sigla: " + e.getEstado().get(i).getSigla());
			System.out.println("Codigo DDI: " + e.getEstado().get(i).getCodigoDDI());
			System.out.println("-----------------------------");
		}
	}

}
