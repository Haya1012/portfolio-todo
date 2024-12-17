package control;

public class TodoItem {
	
	//入力された日付と内容を取得
	private String task;
	private String date;
	
	public TodoItem(String task, String date) {
		this.task = task;
		this.date = date;
		
	}
	public String gettask() {
		return task;
	}
	
	public String getdate() {
		return date;
	}
	
	
}
