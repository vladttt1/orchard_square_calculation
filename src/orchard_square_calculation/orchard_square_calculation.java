package orchard_square_calculation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class orchard_square_calculation {
	

    private static Scanner sh;

	/**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
    	
    	 
    	
     double width,rLen,qSqr,scHer,spEac,saPri,ssChe,saLm,spEar;
        double cHer,pEac,aPri,sChe,aLm,pEar;
        FileOutputStream fos=new FileOutputStream ("orchard_square.txt");
        System.setOut(new PrintStream(fos));
        System.out.println("ВВЕДИТЕ СХЕМУ ПОСАДКИ");
   sh = new Scanner(System.in);
    
      width = sh.nextDouble();
      System.out.println(" Введите количество рядов вишни");
      cHer=sh.nextDouble();
      System.out.println(" Введите количество рядов персика");
      pEac=sh.nextDouble();
      System.out.println(" Введите количество рядов абрикоса");
      aPri=sh.nextDouble();
      System.out.println(" Введите количество рядов черешни");
      sChe=sh.nextDouble();
      System.out.println(" Введите количество рядов миндаля");
      aLm=sh.nextDouble();
      System.out.println(" Введите количество рядов  груши");
      pEar=sh.nextDouble();
      
      System.out.println("Длина  ряда");
      rLen=sh.nextDouble();
      System.out.println("Количество  рядов ");
      sh.nextDouble();
      qSqr=((cHer+pEac+aPri+sChe+aLm+pEar)*width)* (rLen);
      System.out.println(" площадь сада равна"+qSqr);
      scHer=cHer*width*rLen;
      System.out.println(" Площадь вишни " +scHer);
      spEac=pEac*width*rLen;
      System.out.println("Персика "+spEac);
      saPri=aPri*width*rLen;
      System.out.println("Абрикоса "+saPri);
      ssChe=sChe*width*rLen;
      System.out.println("Черешни "+ ssChe);
      saLm=aLm*width*rLen;
      System.out.println("Миндаля "+saLm);
      spEar=pEar*width*rLen;
      System.out.println("Груши "+spEar);
      
      
    }
    


	
		// TODO Auto-generated method stub

	}


