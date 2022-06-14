package com.a04t.designpatterns.behavioral.behavioral_11_memento;

public class FileWriterCaretaker {
	private Object obj;

	public void save(FileWriterUtil fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}