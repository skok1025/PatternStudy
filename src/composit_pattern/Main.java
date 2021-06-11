package composit_pattern;

public class Main {

	public static void main(String[] args) {
		Folder
		root = new Folder("root"),
		home = new Folder("home"),
		kim = new Folder("kim"),
		music = new Folder("music"),
		picture = new Folder("picture"),
		doc = new Folder("doc"),
		usr = new Folder("usr");
		
		File
		track1 = new File("track1"),
		track2 = new File("track2"),
		pic1 = new File("pic1"),
		pic2 = new File("pic2"),
		java = new File("java");
		
		root.addComponent(home);
			home.addComponent(kim);
				kim.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				kim.addComponent(pic1);
				kim.addComponent(doc);
					
		root.addComponent(usr);
			usr.addComponent(java);
		
	}
	
}
