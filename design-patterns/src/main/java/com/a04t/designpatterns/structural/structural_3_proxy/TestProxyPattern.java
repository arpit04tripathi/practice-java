package com.a04t.designpatterns.structural.structural_3_proxy;

public class TestProxyPattern {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
//			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf proxy-pattern.txt");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}
}