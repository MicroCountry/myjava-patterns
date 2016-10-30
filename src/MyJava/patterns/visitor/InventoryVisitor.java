package MyJava.patterns.visitor;

import java.util.Vector;

public class InventoryVisitor extends Visitor {
	private Vector inv;
	public InventoryVisitor(){
		inv = new Vector(10,5);
	}
	public int size(){
		return inv.size();
	}
	@Override
	public void visitHardDisk(HardDisk e) {
		inv.addElement(e);
	}
	@Override
	public void visitMainBoard(MainBoard e) {
		inv.addElement(e);
	}
	@Override
	public void visitCpu(Cpu e) {
		inv.addElement(e);
	}
	@Override
	public void visitPc(Pc e) {
		inv.addElement(e);
	}
	@Override
	public void visitCase(Case e) {
		inv.addElement(e);
	}
	@Override
	public void visitIntegratedBoard(IntegratedBoard e) {
		inv.addElement(e);
	}
	
}
