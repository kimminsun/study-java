class Song
{
	String title;
	String artist;
	String album;
	String composer;
	String year;
	int track_num;
	public Song(String title,String artist,String album,String composer,String year,int track_num){
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track_num=track_num;
	}
}


	
}
class SongDriver
{
	public static void main(String args[]){
		Song s1=new Song();
		s1.title="¹ð¹ð¹ð";
		s1.artist="ºò¹ð";
		s1.album="made";
		s1.composer="ºò¹ð";
		s1.year="2015.03.04";

	}
}
