package samplepostapp

class Post {

	static hasMany = [comments:Comment]
	
	 String title 
	 String teaser 
	 String content
	  Date lastUpdated 
	  int published = 0
	   SortedSet comments 
    static constraints = {
		title(nullable:false, blank:false, length:1..50) 
		teaser(length:0..100)
		 content(nullable:false, blank:false) 
		 lastUpdated(nullable:true) 
		 published(nullable:false) 
    }
}
