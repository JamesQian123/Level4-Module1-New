package _03_Text_Funkifier;

public class DemoClassForImplement implements TextFunkifier{
	
	private String unfunkifiedText;
	
    public DemoClassForImplement(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
  
    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(unfunkifiedText);
		char[] arr = sb.toString().toCharArray();
		StringBuilder stb = new StringBuilder();
		stb.append(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			stb.append(Character.toUpperCase(arr[i]));
		}
		return stb.toString();
	}

}
