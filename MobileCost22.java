import javax.swing.JOptionPane;

public class MobileCost22 {
        public static void main(String args[]){
                double priceSMS,priceData,ratio,pricePmb;
                int im;
		String a,b,c,d;
                
               a=JOptionPane.showInputDialog("Please enter the price of an SMS");
                
               b=JOptionPane.showInputDialog("Please enter the price of a MB");
		c=a.substring(1);
		d=b.substring(1);

		priceSMS=Double.parseDouble(c);
		priceData=Double.parseDouble(d);

		
                priceSMS=(priceSMS/priceData);
                ratio=(1024*1024)*priceSMS;
                pricePmb=ratio/140;
                im= (int) pricePmb;
                
               JOptionPane.showMessageDialog(null,"IM's you would send for that price= "+ im);
               System.exit(0);


           }

  }

