package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(unfunkifiedText);
		char[] arr = sb.toString().toCharArray();
		StringBuilder stb = new StringBuilder();
		stb.append(Character.toLowerCase(arr[0]));
		for(int i =1; i < sb.length(); i++) {
			if(i%2 == 0) {
				stb.append(arr[i]);
			}
			if(i%2 == 1) {
				stb.append(Character.toUpperCase(arr[i]));
			}
		}
		
		return stb.toString();
	}

}
