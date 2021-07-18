
public class StringMatch {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void match() {
		char uem[] = email.toCharArray();
		//System.out.println("uem length is \t"+uem.length);
		int check = 0;
		String emails[] = {"manohar123@gmail.com","hari@gmail.com"};
		//System.out.println(emails.length+"\t"+emails);
		for(int i=0;i<emails.length;i++) {
			char em[] = emails[i].toCharArray();
			//System.out.println("em length is \t"+em.length);
			for(int j=0;j<uem.length;j++) {
				if(j>=em.length) {
					break;
				}
				if(uem[j]==em[j]) {
					check++;
				}
			}
			if(check==uem.length) {
				System.out.println("Match Found");
				check=0;
				break;
			}
			else if(check != uem.length && i==emails.length-1) {
				System.out.println("Match Not Found");
				break;
			}
		}
	}
}
