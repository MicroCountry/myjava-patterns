package MyJava.patterns.visitor;

public abstract class Visitor {
	public abstract void visitHardDisk(HardDisk e);
	public abstract void visitMainBoard(MainBoard e);
	public abstract void visitCpu(Cpu e);
	public abstract void visitPc(Pc e);
	public abstract void visitCase(Case e);
	public abstract void visitIntegratedBoard(IntegratedBoard e);
}
