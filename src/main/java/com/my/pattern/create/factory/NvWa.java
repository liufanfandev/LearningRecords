package com.my.pattern.create.factory;

public class NvWa {

	public static void main(String[] args) {
		AbstarctHumanFactory YinYangLu = new HumanFactory();
		System.out.println("造出第一批白人，，，，，");
		Human white = YinYangLu.getHuman(WhiteHuman.class);
		white.getColor();
		white.talk();
		System.out.println("造出第一批黑人，，，，，");
		Human black = YinYangLu.getHuman(BlackHuman.class);
		black.getColor();
		black.talk();
		System.out.println("造出第一批黄人，，，，，");
		Human yellow = YinYangLu.getHuman(YellowHuman.class);
		yellow.getColor();
		yellow.talk();
				
	}
}
