import java.io.*;
public class Arjun_bala{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("dr_petareya.jpg");
			FileOutputStream fos = new FileOutputStream("CEAVB-Generated.jpg");
			int temp = fis.read();
			int counter = 0;

			String secretMsg = "My name is meet chhe.";
			byte[] byteArray = secretMsg.getBytes();
			String check;

			while(temp>-1){
				counter++;
				if(counter==5229){
					fos.write(secretMsg.length());
				}
				if(counter>=5230 && counter<(5230+byteArray.length)){
					fos.write(byteArray[counter-5230]);
				}
				else{
					fos.write(temp);
					temp = fis.read();	
				}



				
			}
		while()

			fos.close();
			fis.close();

			System.out.println("New file created");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}
}
