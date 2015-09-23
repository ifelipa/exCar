
public class CotxeHibrid extends Cotxe{
	int kw;

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}
	
	public double potFiscal(){
		return 0.08 - this.nCilindros * Math.pow((this.cilindrada /this.nCilindros),0.6 * (this.kw/200.0));
	}

		
}
