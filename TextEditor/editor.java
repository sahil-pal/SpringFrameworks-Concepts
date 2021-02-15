package TextEditor;

public class editor {

	private spellChecker sc;
	
	public editor(spellChecker sc) {
		this.sc = sc;
	}
	
	public String getEditor() {
		return "This is the editor method";
	}
	
	public String getCheck() {
		return sc.getCheck();
	}
}
