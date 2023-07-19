package Practise;
public interface ExIm {
	private void permittedItemsToImport() {
		System.out.println("Import items as per indian government standards....");
	}
	private void permittedItemsToExport() {
		System.out.println("Export items as per indian government standards.....");
	}
	private void currencyForPayment() {//final methods
		System.out.println("payment currency chooen as per indian standard.....");
	}
	default void doImportExport() {//template method
		permittedItemsToExport();
		permittedItemsToImport();
		raiseLetterOfCredit();
		currencyForPayment();
		transport();
	}
	public void raiseLetterOfCredit();
	public void transport();
}
class GokulExportImport implements ExIm{
	
	@Override
	public void raiseLetterOfCredit() {
		System.out.println("gokul raises LC as per gokuls requirements...");
	}
	@Override
	public void transport() {
		System.out.println("gokul supplies tea to america in cycle....");
	}
}
