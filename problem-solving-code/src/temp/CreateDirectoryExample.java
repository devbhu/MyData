package temp;

import java.io.File;
/*class nAryNode {
	int data;
	nAryNode left,right;
	nAryNode (int d){
		data=d;
		left=null;
		right=null;
		}
  }*/

public class CreateDirectoryExample {
	/*nAryNode root;
	void createDirectory(){
		
	}*/
    public static void main(String[] args) {

       /* File file = new File("C:\\Directory1");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
        else 
        	System.out.println("Failed to create directory!");*/
        File files = new File("C:\\Directory2\\Sub2\\Sub-Sub6");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } /*else {
                System.out.println("Failed to create multiple directories!");
            }*/
        }
        else
        	 System.out.println("Failed to create multiple directories! because its already exist");
        	

    }

}