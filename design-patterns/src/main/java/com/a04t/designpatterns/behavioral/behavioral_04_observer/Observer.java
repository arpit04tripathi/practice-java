package com.a04t.designpatterns.behavioral.behavioral_04_observer;

public interface Observer {
	// method to update the observer, used by subject
	public void update();

	// attach with subject to observe
	public void setSubject(Subject sub);
}
