package exception_file_program;

public class FolderNameValidation {
 
	void validate(String s) throws FolderNameException {
		if(s.contains(" ")) {
			throw new FolderNameException("Folder name can not have a space.");
		}
		else
		{
			System.out.println("Valid folder name");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "JavaP rograms";
         FolderNameValidation obj = new FolderNameValidation();
         try {
			obj.validate(s);
		} catch (FolderNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println("Done.....");
	}

}
