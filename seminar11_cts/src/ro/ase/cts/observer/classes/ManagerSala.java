package ro.ase.cts.observer.classes;

public class ManagerSala extends Subiect{
	private String numeSala;

	public ManagerSala(String numeSala) {
		super();
		this.numeSala = numeSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		super.trimiteNotificare(this.numeSala + " va gazdui meciul de " + tipMeci);
	}
}
